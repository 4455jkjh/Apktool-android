package com.a4455jkjh.apktool.task;

import android.content.Context;
import brut.util.OS;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.files.Refreshable;
import java.io.File;
import com.a4455jkjh.apktool.fragment.editor.EditorPagerAdapter;

public class DeleteFileTask extends AbstractTask {
	public DeleteFileTask(Context ctx, Refreshable refresh) {
		super(ctx, refresh);
	}
	private File file;
	@Override
	protected int getTitle() {
		return R.string.delete;
	}

	@Override
	protected boolean process(File f) {
		file = f;
		if (f.isDirectory())
			OS.rmdir(f);
		else
			f.delete();
		return true;
	}

	@Override
	protected boolean shouldShowFinishDialog() {
		return false;
	}

	@Override
	protected void onPostExecute(Boolean result) {
		super.onPostExecute(result);
		EditorPagerAdapter.INSTANCE.checkFileExists();
	}

}
