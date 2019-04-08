package com.a4455jkjh.apktool;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.a4455jkjh.apktool.fragment.PreferenceApplicationFragment;
import java.util.List;
import android.preference.PreferenceActivity.Header;

public class SettingActivity extends PreferenceActivity {
	PreferenceApplicationFragment pp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ThemedActivity.setTheme(this);
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onBuildHeaders(List<PreferenceActivity.Header> target) {
		loadHeadersFromResource(R.xml.preference, target);
	}
	
	@Override
	protected boolean isValidFragment(String fragmentName) {
		return true;
	}
int i;
}
