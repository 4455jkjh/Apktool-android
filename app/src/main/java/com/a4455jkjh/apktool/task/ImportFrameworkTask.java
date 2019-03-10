package com.a4455jkjh.apktool.task;

import android.content.Context;
import brut.androlib.res.AndrolibResources;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.util.Settings;
import java.io.File;
import brut.androlib.ApkOptions;

public class ImportFrameworkTask extends AbstractTask {
	public ImportFrameworkTask(Context ctx) {
		super(ctx, null);
	}

	@Override
	protected int getTitle() {
		return R.string.import_framework;
	}

	@Override
	protected boolean process(File f) {
		try{
			AndrolibResources res = new AndrolibResources(this);
			res.apkOptions = ApkOptions.INSTANCE;
			res.installFramework(f);
			return true;
		}catch (Exception e){

		}
		return false;
	}



}
