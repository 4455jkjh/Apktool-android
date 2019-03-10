package com.a4455jkjh.apktool.task;

import android.content.Context;
import brut.androlib.Androlib;
import brut.androlib.ApkOptions;
import brut.androlib.meta.MetaInfo;
import brut.common.BrutException;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.files.Refreshable;
import com.a4455jkjh.apktool.util.Settings;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

public class BuildTask extends AbstractTask {
	private final SignUtil signTool;
	public BuildTask(Context ctx, Refreshable refresh, SignUtil signTool) {
		super(ctx, refresh);
		this.signTool = signTool;
	}

	@Override
	protected int getTitle() {
		return R.string.build_run_title;
	}

	@Override
	protected boolean process(File f) {
		ApkOptions options = ApkOptions.INSTANCE;
		Androlib alib = new Androlib(options, this);
		try {
			File tmp = File.createTempFile("APKTOOL", null);
			try {
				MetaInfo meta = alib.build(f, tmp);
				File out = new File(f, meta.apkFileName == null ?"out.apk": meta.apkFileName);
				int min;
				if (meta.sdkInfo != null)
					min = Integer.parseInt(meta.sdkInfo.get("minSdkVersion"));
				else
					min = 14;
				signTool.sign(tmp, out, min, this);
			} finally {
				tmp.delete();
			}
			return true;
		} catch (BrutException|IOException e) {
			log(Level.WARNING, e.getMessage(), e);
			return false;
		}
	}



}
