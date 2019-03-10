package com.a4455jkjh.apktool.util;

import android.app.AlertDialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.files.Refreshable;
import com.a4455jkjh.apktool.task.DecodeTask;
import com.a4455jkjh.apktool.task.DeleteFileTask;
import com.a4455jkjh.apktool.task.ImportFrameworkTask;
import com.a4455jkjh.apktool.task.SignTask;
import com.a4455jkjh.apktool.task.SignUtil;
import com.a4455jkjh.apktool.task.VerifyTask;
import com.myopicmobile.textwarrior.common.Clipboard;
import java.io.File;

public class FileUtils {
	public static void open(File file, View view, final Refreshable refresh) {
		String n = file.getName();
		if (n.endsWith(".apk"))
			openApk(file, view, refresh);
		else
			Toast.makeText(view.getContext(), n, 0).show();
	}
	public static void file(final File file, View view, final Refreshable refresh) {
		PopupUtils.show(view, R.menu.file, new PopupUtils.Callback(){
				@Override
				public void call(Context ctx, int pos) {
					switch (pos) {
						case R.id.delete:
							dalete(ctx, file, refresh);
							break;
						case R.id.rename:
							rename(ctx, refresh, file);
							break;
						case R.id.copy_path:
							ClipboardManager cm = (ClipboardManager) ctx.getSystemService(Context.CLIPBOARD_SERVICE);
							Clipboard.copy(cm, file.getAbsolutePath());
					}
				}

			});
	}

	private static void rename(Context ctx, final Refreshable refresh, final File file) {
		final EditText et = new EditText(ctx);
		et.setText(file.getName());
		new AlertDialog.Builder(ctx).
			setTitle(R.string.rename).
			setView(et).
			setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface p1, int p2) {
					File src = file;
					String name1 = src.getName();
					String name2 = et.getText().toString();
					if (name1.equals(name2))
						return;
					File dst = new File(src.getParentFile(), name2);
					src.renameTo(dst);
					refresh.refresh();
				}
			}).
			setNegativeButton(android.R.string.cancel, null).
			show();
	}
	private static void dalete(final Context ctx, final File file, final Refreshable refresh) {
		new AlertDialog.Builder(ctx).
			setTitle(R.string.delete).
			setMessage(file.getAbsolutePath()).
			setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface p1, int p2) {
					new DeleteFileTask(ctx, refresh).execute(file);
				}
			}).
			setNegativeButton(android.R.string.cancel, null).
			show();
	}
	private static void openApk(final File file, View view, final Refreshable refresh) {
		PopupUtils.show(view, R.menu.apk, new PopupUtils.Callback(){
				@Override
				public void call(final Context ctx, int pos) {
					switch (pos) {
						case R.id.decompile_all:
							new DecodeTask(ctx, refresh, 3, null).execute(file);
							break;
						case R.id.decompile_res:
							new DecodeTask(ctx, refresh, 2, null).execute(file);
							break;
						case R.id.decompile_dex:
							new DecodeTask(ctx, refresh, 1, null).execute(file);
							break;
						case R.id.translate:
							translate(ctx, file);
							break;
						case R.id.sign:
							SignUtil.loadKey(ctx, new SignUtil.LoadKeyCallback(){
									@Override
									public void call(SignUtil signTool) {
										new SignTask(ctx, refresh, signTool).execute(file);
									}
								});
							break;
						case R.id.verify:
							new VerifyTask(ctx).execute(file);
							break;
						case R.id.install:
							installPKG(ctx, file);
							break;
						case R.id.import_framework:
							new ImportFrameworkTask(ctx).execute(file);
							break;
					}
				}
			});
	}

	private static void translate(Context ctx, File file) {
		Toast.makeText(ctx, "敬请期待",0).show();
	}
	public static void installPKG(Context c, File apk) {
		Uri data;
		if (Build.VERSION.SDK_INT >= 24) {
			Uri.Builder builder = new Uri.Builder();
			builder.authority("com.a4455jkjh.fileprovider");
			builder.scheme("content");
			byte[] buf = apk.getAbsolutePath().getBytes();
			builder.path(Base64.encodeToString(buf, Base64.NO_WRAP));
			data = builder.build();
		} else
			data = Uri.fromFile(apk);
		Intent intent = new Intent(Intent.ACTION_INSTALL_PACKAGE);
		intent.setFlags(3);
		intent.setData(data);
		c.startActivity(intent);
	}
}
