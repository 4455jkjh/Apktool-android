package com.a4455jkjh.apktool.util;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.preference.PreferenceManager;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import brut.androlib.ApkOptions;
import com.a4455jkjh.apktool.ApktoolApplication;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.files.FileComparator;
import com.a4455jkjh.apktool.lexer.Packages;
import com.a4455jkjh.apktool.service.NotificationManager;
import com.a4455jkjh.apktool.service.Project;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.apache.commons.io.IOUtils;
import sun1.security.pkcs.PKCS8Key;

public class Settings {
	public static boolean lightTheme;
	public static boolean isThemeChanged;
	public static String aapt ;
	public static String framework_dir;
	public static PrivateKey privateKey;
	public static X509Certificate certificate;
	public static Typeface typeface;
	public static int fontSize;
	public static boolean isFontSizeChanged;
	public static boolean mBakDeb;
	public static String projectPath;
	public static Project project;
	public static String output_directory;
	public static boolean analysis_all_smali;
	public static void init(ApktoolApplication application) {
		lightTheme = true;
		fontSize = 14;
		NotificationManager nm = new NotificationManager(application);
		project = new Project(nm, ContextCompat.getNoBackupFilesDir(application));
		typeface = ResourcesCompat.getFont(application, R.font.monospace);
		copyFiles(application.getAssets(), application.getFilesDir());
		loadSettings(application);
		ApkOptions o = ApkOptions.INSTANCE;
		o.aaptPath = aapt;
		o.aaptVersion = 1;
		o.frameworkFolderLocation = framework_dir;
		isThemeChanged = false;
		isFontSizeChanged = false;
	}

	public static void loadSettings(Context context) {
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
		loadApplicationSettings(sp);
		loadEditorSettings(sp);
		loadApkOptions(sp);
		int defaultCompator = sp.getInt("defaultCompator", 0);
		FileComparator.setDefaultAdapter(defaultCompator);
	}

	private static void loadEditorSettings(SharedPreferences sp) {
		String fontSize = sp.getString("font_size", "");
		int size;
		if (fontSize.length() == 0)
			size = 14;
		else
			size = Integer.parseInt(fontSize);
		if (Settings.fontSize != size)
			isFontSizeChanged = true;
		Settings.fontSize = size;
	}

	private static void loadApplicationSettings(SharedPreferences sp) {
		boolean lightTheme = sp.getBoolean("light_theme", true);
		if (lightTheme != Settings.lightTheme)
			isThemeChanged = true;
		Settings.lightTheme = lightTheme;
		if (Settings.projectPath == null) {
			projectPath = sp.getString("projectPath", "");
			project.setProjectPath(projectPath);
		}
	}
	public static void setProjectPath(String projectPath, Context ctx) {
		Settings.projectPath = projectPath;
		project.setProjectPath(projectPath);
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
		SharedPreferences.Editor e = sp.edit();
		e.putString("projectPath", projectPath);
		e.commit();
	}
	private static void copyFiles(AssetManager assets, File outDir) {
		try {
			copy_aapt(assets, outDir);
			copy_framework(assets, outDir);
			loadKey(assets);
			Packages.loadDex(assets);
			//Packages.reset();
		} catch (IOException e) {
			//this should not happen
		} catch (InvalidKeyException|CertificateException e) {

		}
	}

	private static void loadKey(AssetManager assets) throws IOException, InvalidKeyException, CertificateException {
		loadPrivateKey(assets);
		loadCert(assets);
	}

	private static void loadCert(AssetManager assets) throws IOException, CertificateException {
		InputStream cert = assets.open("key/testkey.x509.pem");
		certificate = (X509Certificate) CertificateFactory.getInstance("X.509").
			generateCertificate(cert);
		cert.close();
	}

	private static void loadPrivateKey(AssetManager assets) throws IOException, InvalidKeyException {
		InputStream key = assets.open("key/testkey.pk8");
		PKCS8Key pkcs8 = new PKCS8Key();
		pkcs8.decode(key);
		privateKey = pkcs8;
		key.close();
	}

	private static void copy_framework(AssetManager assets, File outDir) throws IOException {
		InputStream framework_in = assets.open("framework-28.jar");
		File framework = new File(outDir, "framework/1.apk");
		File dir = framework.getParentFile();
		dir.mkdirs();
		OutputStream framework_out = new FileOutputStream(framework);
		IOUtils.copy(framework_in, framework_out);
		framework_in.close();
		framework_out.close();
		framework_dir = dir.getAbsolutePath();
	}
int i;
	private static void copy_aapt(AssetManager assets, File outDir) throws IOException {
		String arch;
		if (Build.VERSION.SDK_INT < 21)
			arch = Build.CPU_ABI;
		else
			arch = Build.SUPPORTED_32_BIT_ABIS[0];
		if (arch.startsWith("arm"))
			arch = "arm";
		else if (arch.startsWith("x86"))
			arch = "x86";
		File aapt = new File(outDir, "aapt");
		InputStream aapt_in = assets.open(arch + "/aapt");
		OutputStream aapu_out = new FileOutputStream(aapt);
		IOUtils.copy(aapt_in, aapu_out);
		aapt_in.close();
		aapu_out.close();
		aapt.setExecutable(true);
		Settings.aapt = aapt.getAbsolutePath();
	}
	private static void loadApkOptions(SharedPreferences sp) {
		ApkOptions o = ApkOptions.INSTANCE;
		mBakDeb = sp.getBoolean("mBakDeb", true);
		o.copyOriginalFiles = sp.getBoolean("copyOriginalFiles", false);
		o.debugMode = sp.getBoolean("debug_mode", false);
		o.verbose = sp.getBoolean("verbose_mode", false);
		analysis_all_smali = sp.getBoolean("analysis_all_smali", false);
		String output_directory = sp.getString("output_directory", "");
		if(output_directory.equals(""))
			output_directory = null;
		Settings.output_directory = output_directory;
	}
	public static void setOutputDirectory(String output_directory, Context ctx) {
		Settings.output_directory = output_directory;
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
		SharedPreferences.Editor e = sp.edit();
		e.putString("output_directory", output_directory);
		e.commit();
	}
}
