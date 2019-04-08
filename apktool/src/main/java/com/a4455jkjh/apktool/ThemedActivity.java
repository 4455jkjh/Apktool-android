package com.a4455jkjh.apktool;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.util.Settings;

public abstract class ThemedActivity extends FragmentActivity {

	protected abstract void init(Bundle savedInstanceState);
	@Override
	public final void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(this);
		init(savedInstanceState);
	}

	public static void setTheme(Activity act) {
		int flag = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
			View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|
			View.SYSTEM_UI_FLAG_LOW_PROFILE;
		if (Settings.lightTheme) {
			act.setTheme(R.style.AppThemeLight);
			View view = act.getWindow().getDecorView();
			int flags = view.getSystemUiVisibility() |
				flag;
			view.setSystemUiVisibility(flags);
		} else {
			act.setTheme(R.style.AppTheme);
			if (Build.VERSION.SDK_INT >= 23) {
				View view = act.getWindow().getDecorView();
				int flags = view.getSystemUiVisibility() &
					(~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR) |
					flag;
				view.setSystemUiVisibility(flags);
			}
		}
	}



	@Override
	protected void onResume() {
		super.onResume();
		Settings.loadSettings(this);
		if (Settings.isThemeChanged) {
			Settings.isThemeChanged = false;
			recreate();
		}
	}
}
