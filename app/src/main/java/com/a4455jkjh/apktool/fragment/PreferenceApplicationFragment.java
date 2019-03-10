package com.a4455jkjh.apktool.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.a4455jkjh.apktool.R;

public class PreferenceApplicationFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference_application);
	}


}
