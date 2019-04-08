package com.a4455jkjh.apktool.task;

import android.content.Context;
import brut.androlib.Androlib;
import brut.androlib.AndrolibException;
import brut.androlib.ApkDecoder;
import brut.androlib.ApkOptions;
import brut.directory.ExtFile;
import brut.util.OS;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.files.Refreshable;
import com.a4455jkjh.apktool.util.Settings;
import com.google.common.collect.ImmutableList;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import org.jf.baksmali.Baksmali;
import org.jf.baksmali.BaksmaliOptions;
import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.analysis.ClassPath;
import org.jf.dexlib2.analysis.ClassPathResolver;
import org.jf.dexlib2.dexbacked.OatFile;
import org.jf.dexlib2.iface.DexFile;

public class DecodeTask extends AbstractTask {
	private final int action;
	private final String name;
	public DecodeTask(Context ctx, Refreshable refresh, int action, String name) {
		super(ctx, refresh);
		this.name = name;
		this.action = action;
	}

	@Override
	protected int getTitle() {
		return R.string.decode_run_title;
	}

	@Override
	protected boolean process(File f) {
		final ExtFile dir = getOutDir(f, name, this);
		if (dir == null)
			return false;
		OS.rmdir(dir);
		dir.mkdirs();
		ExtFile apk = new ExtFile(f);
		ApkOptions o = ApkOptions.INSTANCE;
		Androlib lib = new Androlib(o, this);
		ApkDecoder decoder = new ApkDecoder(apk, lib, this);
		int action=this.action;
		decoder.setApkFileName(name);
		decoder.setBaksmaliDebugMode(Settings.mBakDeb);
		decoder.setDecodeAssets(ApkDecoder.DECODE_ASSETS_FULL);
		if ((action & 2) > 0)
			decoder.setDecodeResources(ApkDecoder.DECODE_RESOURCES_FULL);
		else
			decoder.setDecodeResources(ApkDecoder.DECODE_RESOURCES_NONE);
		if ((action & 1) > 0)
			decoder.setDecodeSources(ApkDecoder.DECODE_SOURCES_SMALI);
		else
			decoder.setDecodeSources(ApkDecoder.DECODE_SOURCES_NONE);
		decoder.setOutDir(dir);
		decoder.setApi(14);
		decoder.setForceDelete(true);
		try {
			return decode(decoder);
		} finally {
			File smali = new File(dir, "smali");
			try {
				if (!smali.exists() && (action & 1) > 0)
					deodex(f, dir);
			} catch (IOException e) {

			}
		}
	}

	private void deodex(File f, File dir) throws IOException {
		info(R.string.text, "Find odex file...");
		File odex = find(f.getParentFile(), ".odex");
		if(odex == null)
			return;
		info(R.string.text, odex);
		InputStream i = new FileInputStream(odex);
		DexFileFactory.FilenameVdexProvider p = new DexFileFactory.FilenameVdexProvider(odex);
		OatFile oat = OatFile.fromInputStream(new BufferedInputStream(i), p);
		i.close();
		List<String> names = oat.getDexEntryNames();
		BaksmaliOptions o = new BaksmaliOptions();
		o.localsDirective = true;
		o.sequentialLabels = true;
		o.allowOdex = true;
		o.implicitReferences = true;
		o.deodex = true;
		for (int idx = 0; idx < names.size(); idx++) {
			String name = names.get(idx);
			DexFile dex = oat.getEntry(name);
			o.classPath = getClassPath(odex, dex, oat.getOatVersion());
			File d;
			if (idx == 0)
				d = new File(dir, "smali");
			else
				d = new File(dir, String.format("smali_class%d", idx + 1));
			d.mkdirs();
			info(R.string.text, String.
				 format("Decode %s to %s",
						name, d));
			Baksmali.disassembleDexFile(dex, d, 5, o);
		}
	}
	private static ClassPath getClassPath(File path, DexFile dex, int version) throws IOException {
		String arch = path.getParentFile().getName();
		String cp = "/system/framework/" + arch;
		ImmutableList<String> boot = ImmutableList.of(cp);//, "/system/framework/oat");
		ImmutableList.Builder<String> entries = new ImmutableList.Builder<>();
		for (File f : new File(cp).listFiles()) {
			String name = f.getName();
			if (name.endsWith(".oat"))
				entries.add(name);
		}
		ClassPathResolver resolver = new ClassPathResolver(
			boot,
			entries.build(),
			ImmutableList.<String>of(),
			dex);
		return new ClassPath(resolver.getResolvedClassProviders(), true,
							 version);
	}

	private File find(File f, String ext) {
		if (f.isDirectory()) {
			for (File f1 : f.listFiles()) {
				f1 = find(f1 , ext);
				if (f1 != null)
					return f1;
			}
		} else if (f.getName().endsWith(ext))
			return f;
		return null;
	}

	private boolean decode(ApkDecoder decoder) {
		try {
			decoder.decode();
			return true;
		} catch (AndrolibException e) {
			log(Level.WARNING, "反编译失败", e);
		}
		return false;
	}

	public static ExtFile getOutDir(File f, String name, AbstractTask task) {
		String dir = f.getParent();
		if (name == null)
			name = f.getName();
		int e = name.lastIndexOf('.');
		if (e >= 0)
			name = name.substring(0, e);
		if (dir.startsWith("/data") || dir.startsWith("/system")) {
			dir = Settings.output_directory;
			if (dir == null) {
				task.warning(R.string.output_directory_not_set);
				return null;
			}
			File d =  new File(dir);
			if (!d.exists() && !d.mkdirs()) {
				task.warning(R.string.output_directory_not_extsts, dir);
				return null;
			}
			if (!d.isDirectory()) {
				task.warning(R.string.not_directory, dir);
				return null;
			}
		}
		return new ExtFile(dir, name);
	}
}
