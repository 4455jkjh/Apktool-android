package com.a4455jkjh.apktool.task;

import android.content.Context;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.files.Refreshable;
import java.io.File;

public class SignTask extends AbstractTask {
	private final SignUtil signTool;
	public SignTask(Context ctx, Refreshable refresh, SignUtil signTool) {
		super(ctx, refresh);
		this.signTool=signTool;
	}

	@Override
	protected int getTitle() {
		return R.string.sign_run_title;
	}

	@Override
	protected boolean process(File f) {
		File dir = f.getParentFile();
		String name = f.getName();
		int p = name.lastIndexOf('.');
		name = name.substring(0, p) + "_sign.apk";
		return signTool.sign(f, new File(dir, name), 14, this);
	}

}
