package com.a4455jkjh.apktool.util;
import com.a4455jkjh.smali.ClassMaker;
import com.google.common.collect.ImmutableList;
import jadx.api.JadxArgs;
import jadx.api.JadxDecompiler;
import jadx.api.JavaClass;
import java.io.File;
import java.io.IOException;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.writer.io.FileDataStore;
import org.jf.dexlib2.writer.pool.DexPool;

public class Smali2Java {
	public static String translate(ClassDef cls, File file, Opcodes opcodes) throws IOException {
		File tmp = File.createTempFile("apktool", ".dex");
		try {
			DexPool pool = new DexPool(opcodes);
			addInner(pool, file, opcodes);
			pool.internClass(cls);
			pool.writeTo(new FileDataStore(tmp));
			JadxArgs args = new JadxArgs();
			args.setSkipResources(true);
			args.setShowInconsistentCode(true);
			args.setInputFiles(ImmutableList.of(tmp));
			JadxDecompiler decompiler = new JadxDecompiler(args);
			decompiler.load();
			JavaClass cls1 = decompiler.getClasses().iterator().next();
			cls1.decompile();
			return cls1.getCode();
		} finally {
			tmp.delete();
		}
	}

	private static void addInner(DexPool pool, File file, Opcodes codes) throws IOException {
		if (file == null)
			return;
		String name = file.getName();
		int i = name.lastIndexOf('.');
		name = name.substring(0, i) + "$";
		for (File f : file.getParentFile().listFiles()) {
			String n = f.getName();
			if (n.startsWith(name) && n.endsWith(".smali"))
				pool.internClass(ClassMaker.make(f.getAbsolutePath(), codes));
		}
	}
}
