package com.a4455jkjh.apktool.fragment;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import com.a4455jkjh.apktool.R;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceSignatureFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference_signtuare);
		init();
	}

	private void init() {
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		boolean b  = sp.getBoolean("custom_signature_file", false);
		findPreference("keystore").setEnabled(b);
		findPreference("gen_key").setEnabled(b);
		findPreference("custom_signature_file").
		setOnPreferenceChangeListener(this);
	}

	@Override
	public boolean onPreferenceChange(Preference p1, Object p2) {
		boolean val = ((Boolean)p2).booleanValue();
		findPreference("keystore").setEnabled(val);
		findPreference("gen_key").setEnabled(val);
		return true;
	}

	
}
