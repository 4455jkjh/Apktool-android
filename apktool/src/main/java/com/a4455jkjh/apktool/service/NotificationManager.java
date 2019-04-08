package com.a4455jkjh.apktool.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.a4455jkjh.apktool.R;

public class NotificationManager {
	private final Context c;
	private static final String id = "analysis";
	private static final int notifyID = 0;
	public NotificationManager(Context c) {
		this.c = c;
		init();
	}

	private void init() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
			Context ctx = this.c;
			CharSequence name = ctx.getText(R.string.smali_snalysis);
			CharSequence desc = ctx.getText(R.string.smali_snalysis_desc);
			NotificationChannel channel = new NotificationChannel(id, name, android.app.NotificationManager.IMPORTANCE_HIGH);
			channel.setDescription(desc.toString());
			android.app.NotificationManager manager = (android.app.NotificationManager) ctx.getSystemService(Context.NOTIFICATION_SERVICE);
			manager.createNotificationChannel(channel);
		} 
	}
	public void notify(String title, String content) {
		NotificationCompat.Builder builder = new NotificationCompat.Builder(c, id);
		builder.setContentTitle(title);
		builder.setWhen(System.currentTimeMillis());
		builder.setContentText(content);
		builder.setSmallIcon(R.drawable.apktool_notification);
		builder.setPriority(NotificationCompat.PRIORITY_HIGH);
		builder.setLargeIcon(BitmapFactory.decodeResource(c.getResources(), R.mipmap.apktool));
		Notification notification = builder.build();
		((android.app.NotificationManager)c.getSystemService(Context.NOTIFICATION_SERVICE)).
			notify(notifyID, notification);
	}
	public void cancel() {
		((android.app.NotificationManager)c.getSystemService(Context.NOTIFICATION_SERVICE)).
			cancel(notifyID);
	}
}
