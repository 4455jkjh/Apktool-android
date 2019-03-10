/**
 *  Copyright (C) 2018 Ryszard Wiśniewski <brut.alll@gmail.com>
 *  Copyright (C) 2018 Connor Tumbleson <connor.tumbleson@gmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package brut.androlib.res;

import brut.androlib.AndrolibException;
import brut.androlib.ApkOptions;
import brut.androlib.err.CantFindFrameworkResException;
import brut.androlib.meta.MetaInfo;
import brut.androlib.meta.PackageInfo;
import brut.androlib.meta.VersionInfo;
import brut.androlib.res.data.ResConfigFlags;
import brut.androlib.res.data.ResPackage;
import brut.androlib.res.data.ResResSpec;
import brut.androlib.res.data.ResResource;
import brut.androlib.res.data.ResTable;
import brut.androlib.res.data.ResValuesFile;
import brut.androlib.res.decoder.ARSCDecoder;
import brut.androlib.res.decoder.ARSCDecoder.ARSCData;
import brut.androlib.res.decoder.ARSCDecoder.FlagsOffset;
import brut.androlib.res.decoder.AXmlResourceParser;
import brut.androlib.res.decoder.Res9patchStreamDecoder;
import brut.androlib.res.decoder.ResAttrDecoder;
import brut.androlib.res.decoder.ResFileDecoder;
import brut.androlib.res.decoder.ResRawStreamDecoder;
import brut.androlib.res.decoder.ResStreamDecoderContainer;
import brut.androlib.res.decoder.XmlPullStreamDecoder;
import brut.androlib.res.util.ExtMXSerializer;
import brut.androlib.res.util.ExtXmlSerializer;
import brut.androlib.res.xml.ResValuesXmlSerializable;
import brut.androlib.res.xml.ResXmlPatcher;
import brut.common.BrutException;
import brut.directory.Directory;
import brut.directory.DirectoryException;
import brut.directory.ExtFile;
import brut.directory.FileDirectory;
import brut.directory.ZipUtils;
import brut.util.Duo;
import brut.util.Jar;
import brut.util.Logger;
import brut.util.OS;
import com.a4455jkjh.apktool.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.IOUtils;
import org.xmlpull.v1.XmlSerializer;
import org.json.JSONObject;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
final public class AndrolibResources {
    public ResTable getResTable(ExtFile apkFile) throws AndrolibException {
        return getResTable(apkFile, true);
    }

    public ResTable getResTable(ExtFile apkFile, boolean loadMainPkg)
	throws AndrolibException {
        ResTable resTable = new ResTable(this);
        if (loadMainPkg) {
            loadMainPkg(resTable, apkFile);
        }
        return resTable;
    }

    public ResPackage loadMainPkg(ResTable resTable, ExtFile apkFile)
	throws AndrolibException {
        LOGGER.info(R.string.text, "Loading resource table...");
        ResPackage[] pkgs = getResPackagesFromApk(apkFile, resTable, sKeepBroken);
        ResPackage pkg = null;

        switch (pkgs.length) {
            case 1:
                pkg = pkgs[0];
                break;
            case 2:
                if (pkgs[0].getName().equals("android")) {
                    LOGGER.warning(R.string.text, "Skipping \"android\" package group");
                    pkg = pkgs[1];
                    break;
                } else if (pkgs[0].getName().equals("com.htc")) {
                    LOGGER.warning(R.string.text, "Skipping \"htc\" package group");
                    pkg = pkgs[1];
                    break;
                }

            default:
                pkg = selectPkgWithMostResSpecs(pkgs);
                break;
        }

        if (pkg == null) {
            throw new AndrolibException("arsc files with zero packages or no arsc file found.");
        }

        resTable.addPackage(pkg, true);
        return pkg;
    }

    public ResPackage selectPkgWithMostResSpecs(ResPackage[] pkgs)
	throws AndrolibException {
        int id = 0;
        int value = 0;

        for (ResPackage resPackage : pkgs) {
            if (resPackage.getResSpecCount() > value && ! resPackage.getName().equalsIgnoreCase("android")) {
                value = resPackage.getResSpecCount();
                id = resPackage.getId();
            }
        }

        // if id is still 0, we only have one pkgId which is "android" -> 1
        return (id == 0) ? pkgs[0] : pkgs[1];
    }

    public ResPackage loadFrameworkPkg(ResTable resTable, int id, String frameTag)
	throws AndrolibException {
        File apk = getFrameworkApk(id, frameTag);

        LOGGER.info(R.string.text, "Loading resource table from file: " + apk);
        mFramework = new ExtFile(apk);
        ResPackage[] pkgs = getResPackagesFromApk(mFramework, resTable, true);

        ResPackage pkg;
        if (pkgs.length > 1) {
            pkg = selectPkgWithMostResSpecs(pkgs);
        } else if (pkgs.length == 0) {
            throw new AndrolibException("Arsc files with zero or multiple packages");
        } else {
            pkg = pkgs[0];
        }

        if (pkg.getId() != id) {
            throw new AndrolibException("Expected pkg of id: " + String.valueOf(id) + ", got: " + pkg.getId());
        }

        resTable.addPackage(pkg, false);
        return pkg;
    }

    public void decodeManifest(ResTable resTable, ExtFile apkFile, File outDir)
	throws AndrolibException {

        Duo<ResFileDecoder, AXmlResourceParser> duo = getManifestFileDecoder();
        ResFileDecoder fileDecoder = duo.m1;

        // Set ResAttrDecoder
        duo.m2.setAttrDecoder(new ResAttrDecoder());
        ResAttrDecoder attrDecoder = duo.m2.getAttrDecoder();

        // Fake ResPackage
        attrDecoder.setCurrentPackage(new ResPackage(resTable, 0, null, LOGGER));

        Directory inApk, out;
        try {
            inApk = apkFile.getDirectory();
            out = new FileDirectory(outDir);

            LOGGER.info(R.string.text, "Decoding AndroidManifest.xml with only framework resources...");
            fileDecoder.decodeManifest(inApk, "AndroidManifest.xml", out, "AndroidManifest.xml");

        } catch (DirectoryException ex) {
            throw new AndrolibException(ex);
        }
    }

    public void adjustPackageManifest(ResTable resTable, String filePath)
	throws AndrolibException {

        // compare resources.arsc package name to the one present in AndroidManifest
        ResPackage resPackage = resTable.getCurrentResPackage();
        String packageOriginal = resPackage.getName();
        mPackageRenamed = resTable.getPackageRenamed();

        resTable.setPackageId(resPackage.getId());
        resTable.setPackageOriginal(packageOriginal);

        // 1) Check if packageOriginal === mPackageRenamed
        // 2) Check if packageOriginal is ignored via IGNORED_PACKAGES
        // 2a) If its ignored, make sure the mPackageRenamed isn't explicitly allowed
        if (packageOriginal.equalsIgnoreCase(mPackageRenamed) ||
			(Arrays.asList(IGNORED_PACKAGES).contains(packageOriginal) &&
			! Arrays.asList(ALLOWED_PACKAGES).contains(mPackageRenamed))) {
            LOGGER.info(R.string.text, "Regular manifest package...");
        } else {
            LOGGER.info(R.string.text, "Renamed manifest package found! Replacing " + mPackageRenamed + " with " + packageOriginal);
            ResXmlPatcher.renameManifestPackage(new File(filePath), packageOriginal, LOGGER);
        }
    }

    public void decodeManifestWithResources(ResTable resTable, ExtFile apkFile, File outDir)
	throws AndrolibException {

        Duo<ResFileDecoder, AXmlResourceParser> duo = getResFileDecoder();
        ResFileDecoder fileDecoder = duo.m1;
        ResAttrDecoder attrDecoder = duo.m2.getAttrDecoder();

        attrDecoder.setCurrentPackage(resTable.listMainPackages().iterator().next());

        Directory inApk, in = null, out;
        try {
            inApk = apkFile.getDirectory();
            out = new FileDirectory(outDir);
            LOGGER.info(R.string.text, "Decoding AndroidManifest.xml with resources...");

            fileDecoder.decodeManifest(inApk, "AndroidManifest.xml", out, "AndroidManifest.xml");

            // Remove versionName / versionCode (aapt API 16)
            if (!resTable.getAnalysisMode()) {

                // check for a mismatch between resources.arsc package and the package listed in AndroidManifest
                // also remove the android::versionCode / versionName from manifest for rebuild
                // this is a required change to prevent aapt warning about conflicting versions
                // it will be passed as a parameter to aapt like "--min-sdk-version" via apktool.yml
                adjustPackageManifest(resTable, outDir.getAbsolutePath() + File.separator + "AndroidManifest.xml");

                ResXmlPatcher.removeManifestVersions(new File(
														 outDir.getAbsolutePath() + File.separator + "AndroidManifest.xml"), LOGGER);

                mPackageId = String.valueOf(resTable.getPackageId());
            }
        } catch (DirectoryException ex) {
            throw new AndrolibException(ex);
        }
    }

    public void decode(ResTable resTable, ExtFile apkFile, File outDir)
	throws AndrolibException {
        Duo<ResFileDecoder, AXmlResourceParser> duo = getResFileDecoder();
        ResFileDecoder fileDecoder = duo.m1;
        ResAttrDecoder attrDecoder = duo.m2.getAttrDecoder();

        attrDecoder.setCurrentPackage(resTable.listMainPackages().iterator().next());
        Directory inApk, in = null, out;

        try {
            out = new FileDirectory(outDir);

            inApk = apkFile.getDirectory();
            out = out.createDir("res");
            if (inApk.containsDir("res")) {
                in = inApk.getDir("res");
            }
            if (in == null && inApk.containsDir("r")) {
                in = inApk.getDir("r");
            }
            if (in == null && inApk.containsDir("R")) {
                in = inApk.getDir("R");
            }
        } catch (DirectoryException ex) {
            throw new AndrolibException(ex);
        }

        ExtMXSerializer xmlSerializer = getResXmlSerializer();
        for (ResPackage pkg : resTable.listMainPackages()) {
            attrDecoder.setCurrentPackage(pkg);

            LOGGER.info(R.string.text, "Decoding file-resources...");
            for (ResResource res : pkg.listFiles()) {
                fileDecoder.decode(res, in, out);
            }

            LOGGER.info(R.string.text, "Decoding values */* XMLs...");
            for (ResValuesFile valuesFile : pkg.listValuesFiles()) {
                generateValuesFile(valuesFile, out, xmlSerializer);
            }
            generatePublicXml(pkg, out, xmlSerializer);
        }

        AndrolibException decodeError = duo.m2.getFirstError();
        if (decodeError != null) {
            throw decodeError;
        }
    }

    public void setSdkInfo(Map<String, String> map) {
        if (map != null) {
            mMinSdkVersion = map.get("minSdkVersion");
            mTargetSdkVersion = map.get("targetSdkVersion");
            mMaxSdkVersion = map.get("maxSdkVersion");
        }
    }

    public void setVersionInfo(VersionInfo versionInfo) {
        if (versionInfo != null) {
            mVersionCode = versionInfo.versionCode;
            mVersionName = versionInfo.versionName;
        }
    }

    public void setPackageRenamed(PackageInfo packageInfo) {
        if (packageInfo != null) {
            mPackageRenamed = packageInfo.renameManifestPackage;
        }
    }

    public void setPackageId(PackageInfo packageInfo) {
        if (packageInfo != null) {
            mPackageId = packageInfo.forcedPackageId;
        }
    }

    public void setSharedLibrary(boolean flag) {
        mSharedLibrary = flag;
    }

    public void setSparseResources(boolean flag) {
        mSparseResources = flag;
    }

    public String checkTargetSdkVersionBounds() {
        int target = mapSdkShorthandToVersion(mTargetSdkVersion);

        int min = (mMinSdkVersion != null) ? mapSdkShorthandToVersion(mMinSdkVersion) : 0;
        int max = (mMaxSdkVersion != null) ? mapSdkShorthandToVersion(mMaxSdkVersion) : target;

        target = Math.min(max, target);
        target = Math.max(min, target);
        return Integer.toString(target);
    }

    private void aaptPackage(File apkFile, File manifest, File resDir, File rawDir, File assetDir, File[] include,
							 List<String> cmd)
	throws AndrolibException {

        cmd.add("p");

        if (apkOptions.verbose) { // output aapt verbose
            cmd.add("-v");
        }
        if (apkOptions.updateFiles) {
            cmd.add("-u");
        }
        if (apkOptions.debugMode) { // inject debuggable="true" into manifest
            cmd.add("--debug-mode");
        }
        // force package id so that some frameworks build with correct id
        // disable if user adds own aapt (can't know if they have this feature)
        /*if (mPackageId != null && ! customAapt && ! mSharedLibrary) {
		 cmd.add("--forced-package-id");
		 cmd.add(mPackageId);
		 }*/
        if (mSharedLibrary) {
            cmd.add("--shared-lib");
        }
        if (mMinSdkVersion != null) {
            cmd.add("--min-sdk-version");
            cmd.add(mMinSdkVersion);
        }
        if (mTargetSdkVersion != null) {
            cmd.add("--target-sdk-version");

            // Ensure that targetSdkVersion is between minSdkVersion/maxSdkVersion if
            // they are specified.
            cmd.add(checkTargetSdkVersionBounds());
        }
        if (mMaxSdkVersion != null) {
            cmd.add("--max-sdk-version");
            cmd.add(mMaxSdkVersion);

            // if we have max sdk version, set --max-res-version
            // so we can ignore anything over that during build.
            cmd.add("--max-res-version");
            cmd.add(mMaxSdkVersion);
        }
        if (mPackageRenamed != null) {
            cmd.add("--rename-manifest-package");
            cmd.add(mPackageRenamed);
        }
        if (mVersionCode != null) {
            cmd.add("--version-code");
            cmd.add(mVersionCode);
        }
        if (mVersionName != null) {
            cmd.add("--version-name");
            cmd.add(mVersionName);
        }
        cmd.add("--no-version-vectors");
        cmd.add("-F");
        cmd.add(apkFile.getAbsolutePath());

        if (apkOptions.isFramework) {
            cmd.add("-x");
        }

        if (apkOptions.doNotCompress != null) {
            for (String file : apkOptions.doNotCompress) {
                cmd.add("-0");
                cmd.add(file);
            }
        }
        if (!apkOptions.resourcesAreCompressed) {
            cmd.add("-0");
            cmd.add("arsc");
        }

        if (include != null) {
            for (File file : include) {
                cmd.add("-I");
                cmd.add(file.getPath());
            }
        }
        if (resDir != null) {
            cmd.add("-S");
            cmd.add(resDir.getAbsolutePath());
        }
        if (manifest != null) {
            cmd.add("-M");
            cmd.add(manifest.getAbsolutePath());
        }
        if (assetDir != null) {
            cmd.add("-A");
            cmd.add(assetDir.getAbsolutePath());
        }
        if (rawDir != null) {
            cmd.add(rawDir.getAbsolutePath());
        }
        try {
            OS.exec(cmd, LOGGER);
            LOGGER.fine(R.string.text, "command ran: ");
            LOGGER.fine(R.string.text, cmd.toString());
        } catch (BrutException ex) {
            throw new AndrolibException(ex);
        }
    }

    public void aaptPackage(File apkFile, File manifest, File resDir, File rawDir, File assetDir, File[] include)
	throws AndrolibException {

        String aaptPath = apkOptions.aaptPath;
        List<String> cmd = new ArrayList<String>();
		cmd.add(aaptPath);
        aaptPackage(apkFile, manifest, resDir, rawDir, assetDir, include, cmd);
    }

    public void zipPackage(File apkFile, File rawDir, File assetDir)
	throws AndrolibException {

        try {
            ZipUtils.zipFolders(rawDir, apkFile, assetDir, apkOptions.doNotCompress);
        } catch (IOException | BrutException ex) {
            throw new AndrolibException(ex);
        }
    }

    public int getMinSdkVersionFromAndroidCodename(MetaInfo meta, String sdkVersion) {
        int sdkNumber = mapSdkShorthandToVersion(sdkVersion);

        if (sdkNumber == ResConfigFlags.SDK_BASE) {
            return Integer.parseInt(meta.sdkInfo.get("minSdkVersion"));
        }
        return sdkNumber;
    }

    private int mapSdkShorthandToVersion(String sdkVersion) {
        switch (sdkVersion.toUpperCase()) {
            case "M":
                return ResConfigFlags.SDK_MNC;
            case "N":
                return ResConfigFlags.SDK_NOUGAT;
            case "O":
                return ResConfigFlags.SDK_OREO;
            case "P":
                return ResConfigFlags.SDK_P;
            default:
                return Integer.parseInt(sdkVersion);
        }
    }

    public boolean detectWhetherAppIsFramework(File appDir)
	throws AndrolibException {
        File publicXml = new File(appDir, "res/values/public.xml");
        if (! publicXml.exists()) {
            return false;
        }

        Iterator<String> it;
        try {
            it = IOUtils.lineIterator(new FileReader(new File(appDir,
															  "res/values/public.xml")));
        } catch (FileNotFoundException ex) {
            throw new AndrolibException(
				"Could not detect whether app is framework one", ex);
        }
        it.next();
        it.next();
        return it.next().contains("0x01");
    }

    public Duo<ResFileDecoder, AXmlResourceParser> getResFileDecoder() {
        ResStreamDecoderContainer decoders = new ResStreamDecoderContainer();
        decoders.setDecoder("raw", new ResRawStreamDecoder());
        decoders.setDecoder("9patch", new Res9patchStreamDecoder());

        AXmlResourceParser axmlParser = new AXmlResourceParser(LOGGER);
        axmlParser.setAttrDecoder(new ResAttrDecoder());
        decoders.setDecoder("xml", new XmlPullStreamDecoder(axmlParser, getResXmlSerializer(), LOGGER));

        return new Duo<ResFileDecoder, AXmlResourceParser>(new ResFileDecoder(decoders, LOGGER), axmlParser);
    }

    public Duo<ResFileDecoder, AXmlResourceParser> getManifestFileDecoder() {
        ResStreamDecoderContainer decoders = new ResStreamDecoderContainer();

        AXmlResourceParser axmlParser = new AXmlResourceParser(LOGGER);

        decoders.setDecoder("xml", new XmlPullStreamDecoder(axmlParser, getResXmlSerializer(), LOGGER));

        return new Duo<ResFileDecoder, AXmlResourceParser>(new ResFileDecoder(decoders, LOGGER), axmlParser);
    }

    public ExtMXSerializer getResXmlSerializer() {
        ExtMXSerializer serial = new ExtMXSerializer();
        serial.setProperty(ExtXmlSerializer.PROPERTY_SERIALIZER_INDENTATION, "    ");
        serial.setProperty(ExtXmlSerializer.PROPERTY_SERIALIZER_LINE_SEPARATOR, System.getProperty("line.separator"));
        serial.setProperty(ExtXmlSerializer.PROPERTY_DEFAULT_ENCODING, "utf-8");
        serial.setDisabledAttrEscape(true);
        return serial;
    }

    private void generateValuesFile(ResValuesFile valuesFile, Directory out,
                                    ExtXmlSerializer serial) throws AndrolibException {
        try {
            OutputStream outStream = out.getFileOutput(valuesFile.getPath());
            serial.setOutput((outStream), null);
            serial.startDocument(null, null);
            serial.startTag(null, "resources");

            for (ResResource res : valuesFile.listResources()) {
                if (valuesFile.isSynthesized(res)) {
                    continue;
                }
                ((ResValuesXmlSerializable) res.getValue()).serializeToResValuesXml(serial, res);
            }

            serial.endTag(null, "resources");
            serial.newLine();
            serial.endDocument();
            serial.flush();
            outStream.close();
        } catch (IOException | DirectoryException ex) {
            throw new AndrolibException("Could not generate: " + valuesFile.getPath(), ex);
        }
    }

    private void generatePublicXml(ResPackage pkg, Directory out,
                                   XmlSerializer serial) throws AndrolibException {
        try {
            OutputStream outStream = out.getFileOutput("values/public.xml");
            serial.setOutput(outStream, null);
            serial.startDocument(null, null);
            serial.startTag(null, "resources");

            for (ResResSpec spec : pkg.listResSpecs()) {
                serial.startTag(null, "public");
                serial.attribute(null, "type", spec.getType().getName());
                serial.attribute(null, "name", spec.getName());
                serial.attribute(null, "id", String.format("0x%08x", spec.getId().id));
                serial.endTag(null, "public");
            }

            serial.endTag(null, "resources");
            serial.endDocument();
            serial.flush();
            outStream.close();
        } catch (IOException | DirectoryException ex) {
            throw new AndrolibException("Could not generate public.xml file", ex);
        }
    }

    public ResPackage[] getResPackagesFromApk(ExtFile apkFile, ResTable resTable, boolean keepBroken)
	throws AndrolibException {
        try {
            Directory dir = apkFile.getDirectory();
            BufferedInputStream bfi = new BufferedInputStream(dir.getFileInput("resources.arsc"));
            try {
                return ARSCDecoder.decode(bfi, false, keepBroken, resTable, LOGGER).getPackages();
            } finally {
                try {
                    bfi.close();
                } catch (IOException ignored) {}
            }
        } catch (DirectoryException ex) {
            throw new AndrolibException("Could not load resources.arsc from file: " + apkFile, ex);
        }
    }

    public File getFrameworkApk(int id, String frameTag)
	throws AndrolibException {
        File dir = getFrameworkDir();
        File apk;

        if (frameTag != null) {
            apk = new File(dir, String.valueOf(id) + '-' + frameTag + ".apk");
            if (apk.exists()) {
                return apk;
            }
        }

        apk = new File(dir, String.valueOf(id) + ".apk");
        if (apk.exists()) {
            return apk;
        }

        if (id == 1) {
            try {
				InputStream in = AndrolibResources.class.getResourceAsStream("/brut/androlib/android-framework.jar");
				OutputStream out = new FileOutputStream(apk);
                IOUtils.copy(in, out);
				in.close();
				out.close();
                return apk;
            } catch (IOException ex) {
                throw new AndrolibException(ex);
            }
        }

        throw new CantFindFrameworkResException(id);
    }

    public void emptyFrameworkDirectory() throws AndrolibException {
        File dir = getFrameworkDir();
        File apk;

        apk = new File(dir, "1.apk");

        if (! apk.exists()) {
            LOGGER.warning(R.string.text, "Can't empty framework directory, no file found at: " + apk.getAbsolutePath());
        } else {
            try {
                if (apk.exists() && dir.listFiles().length > 1 && ! apkOptions.forceDeleteFramework) {
                    LOGGER.warning(R.string.text, "More than default framework detected. Please run command with `--force` parameter to wipe framework directory.");
                } else {
                    for (File file : dir.listFiles()) {
                        if (file.isFile() && file.getName().endsWith(".apk")) {
                            LOGGER.info(R.string.text, "Removing " + file.getName() + " framework file...");
                            file.delete();
                        }
                    }
                }
            } catch (NullPointerException e) {
                throw new AndrolibException(e);
            }
        }
    }

    public void installFramework(File frameFile) throws AndrolibException {
        installFramework(frameFile, apkOptions.frameworkTag);
    }

    public void installFramework(File frameFile, String tag)
	throws AndrolibException {
        InputStream in = null;
        ZipOutputStream out = null;
        try {
            ZipFile zip = new ZipFile(frameFile);
            ZipEntry entry = zip.getEntry("resources.arsc");

            if (entry == null) {
                throw new AndrolibException("Can't find resources.arsc file");
            }

            in = zip.getInputStream(entry);
            byte[] data = IOUtils.toByteArray(in);

            ARSCData arsc = ARSCDecoder.decode(new ByteArrayInputStream(data), true, true , LOGGER);
            publicizeResources(data, arsc.getFlagsOffsets());

            File outFile = new File(getFrameworkDir(), String.valueOf(arsc
																	  .getOnePackage().getId())
									+ (tag == null ? "" : '-' + tag)
									+ ".apk");

            out = new ZipOutputStream(new FileOutputStream(outFile));
            out.setMethod(ZipOutputStream.DEFLATED);
            entry = new ZipEntry("resources.arsc");
			entry.setCompressedSize(-1);
            out.putNextEntry(entry);
            out.write(data);
            out.closeEntry();

            //Write fake AndroidManifest.xml file to support original aapt
            entry = zip.getEntry("AndroidManifest.xml");
            if (entry != null) {
                in = zip.getInputStream(entry);
                byte[] manifest = IOUtils.toByteArray(in);
                entry.setCompressedSize(-1);
                out.putNextEntry(entry);
                out.write(manifest);
                out.closeEntry();
            }

            zip.close();
            LOGGER.info(R.string.text, "Framework installed to: " + outFile);
        } catch (IOException ex) {
            throw new AndrolibException(ex);
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
    }

    public void publicizeResources(File arscFile) throws AndrolibException {
        byte[] data = new byte[(int) arscFile.length()];

        try {
			InputStream in = new FileInputStream(arscFile);
            OutputStream out = new FileOutputStream(arscFile);
            in.read(data);
            publicizeResources(data);
            out.write(data);
			in.close();
			out.close();
        } catch (IOException ex) {
            throw new AndrolibException(ex);
        }
    }

    public void publicizeResources(byte[] arsc) throws AndrolibException {
        publicizeResources(arsc, ARSCDecoder.decode(new ByteArrayInputStream(arsc), true, true, LOGGER).getFlagsOffsets());
    }

    public void publicizeResources(byte[] arsc, FlagsOffset[] flagsOffsets)
	throws AndrolibException {
        for (FlagsOffset flags : flagsOffsets) {
            int offset = flags.offset + 3;
            int end = offset + 4 * flags.count;
            while (offset < end) {
                arsc[offset] |= (byte) 0x40;
                offset += 4;
            }
        }
    }

    public File getFrameworkDir() throws AndrolibException {
        if (mFrameworkDirectory != null) {
            return mFrameworkDirectory;
        }
		File dir = new File(apkOptions.frameworkFolderLocation);
        mFrameworkDirectory = dir;
        return dir;
    }

    private File getAaptBinaryFile() throws AndrolibException {
        return new File(apkOptions.aaptPath);
    }

    public File getAndroidResourcesFile() throws AndrolibException {
        try {
            return Jar.getResourceAsFile("/brut/androlib/android-framework.jar");
        } catch (BrutException ex) {
            throw new AndrolibException(ex);
        }
    }

    public void close() throws IOException {
        if (mFramework != null) {
            mFramework.close();
        }
    }
	public AndrolibResources(Logger LOGGER) {
		this.LOGGER = LOGGER;
	}

    public ApkOptions apkOptions;

    // TODO: dirty static hack. I have to refactor decoding mechanisms.
    public static boolean sKeepBroken = false;

    private final Logger LOGGER ;

    private File mFrameworkDirectory = null;

    private ExtFile mFramework = null;

    private String mMinSdkVersion = null;
    private String mMaxSdkVersion = null;
    private String mTargetSdkVersion = null;
    private String mVersionCode = null;
    private String mVersionName = null;
    private String mPackageRenamed = null;
    private String mPackageId = null;

    private boolean mSharedLibrary = false;
    private boolean mSparseResources = false;

    private final static String[] IGNORED_PACKAGES = new String[] {
		"android", "com.htc", "miui", "com.lge", "com.lge.internal", "yi", "com.miui.core", "flyme",
		"air.com.adobe.appentry", "FFFFFFFFFFFFFFFFFFFFFF" };

    private final static String[] ALLOWED_PACKAGES = new String[] {
		"com.miui" };
}
