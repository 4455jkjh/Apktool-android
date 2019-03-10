package com.myopicmobile.textwarrior.common;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;

public class Clipboard {
	public static void copy(ClipboardManager manager, CharSequence text) {
		ClipData data = ClipData.newPlainText("Apktool", text);
		manager.setPrimaryClip(data);
	}
	public static CharSequence paste(ClipboardManager manager, Context ctx) {
		ClipData data = manager.getPrimaryClip();
		if (data != null) {
			return data.getItemAt(0).coerceToText(ctx);
		}
		return null;
	}
}
