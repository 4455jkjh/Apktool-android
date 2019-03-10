package com.a4455jkjh.apktool.task;


import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import brut.util.Logger;
import com.a4455jkjh.apktool.fragment.files.Refreshable;
import com.a4455jkjh.apktool.view.MessageView;
import java.io.File;
import java.util.logging.Level;

public abstract class AbstractTask extends AsyncTask<File, CharSequence, Boolean> implements Logger {
	private Context ctx;
	private MessageView message;
	private AlertDialog dialog;
	private final Refreshable refresh;

	public AbstractTask(Context ctx, Refreshable refresh) {
		this.ctx = ctx;
		this.refresh = refresh;
	}
	@Override
	protected Boolean doInBackground(File[] p1) {
		boolean success = true;
		for (File file:p1)
			if (!process(file))
				success = false;
		return Boolean.valueOf(success);
	}
	@Override
	protected void onPreExecute() {
		Context ctx = this.ctx;
		message = new MessageView(ctx);
		dialog = new AlertDialog.Builder(ctx).
			setView(message).
			setTitle(getTitle()).
			setCancelable(false).
			show();
	}

	protected abstract int getTitle();
	protected abstract boolean process(File f);

	@Override
	protected void onPostExecute(Boolean result) {
		CharSequence text =message.getText();
		dialog.dismiss();
		if (shouldShowFinishDialog()) {
			Context ctx = this.ctx;
			MessageView m = new MessageView(ctx);
			m.append(text);
			new AlertDialog.Builder(ctx).
				setView(m).
				setTitle("完成").
				setPositiveButton("确定", null).
				show();
		}
		if (refresh != null)
			refresh.refresh();
	}

	protected boolean shouldShowFinishDialog() {
		return true;
	}

	@Override
	protected void onProgressUpdate(CharSequence[] values) {
		for (CharSequence s:values)
			message.append(s);
	}
	private String getText(int id, Object[] args) {
		return ctx.getResources().getString(id, args);
	}

	@Override
	public void info(int id, Object... args) {
		publishProgress(String.format("I:%s\n", getText(id, args)));
	}

	@Override
	public void warning(int id, Object... args) {
		publishProgress(String.format("W:%s\n", getText(id, args)));
	}

	@Override
	public void fine(int id, Object... args) {
		//publishProgress(String.format("F:%s\n",p0));
	}

	@Override
	public void error(int id, Object... args) {
		publishProgress(String.format("E:%s\n", getText(id, args)));
	}

	@Override
	public void log(Level level, String format, Exception ex) {
		char ch = level.getName().charAt(0);
		String fmt = "%c:%s\n";
		publishProgress(String.format(fmt, ch, format));
		log(fmt, ch, ex);
	}

	private void log(String fmt, char ch, Throwable ex) {
		if (ex == null)return;
		publishProgress(String.format(fmt, ch, ex.getMessage()));
		for (StackTraceElement ste:ex.getStackTrace())
			publishProgress(String.format(fmt, ch, ste));
		log(fmt, ch, ex.getCause());
	}


}
