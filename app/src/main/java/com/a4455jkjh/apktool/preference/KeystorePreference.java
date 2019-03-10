package com.a4455jkjh.apktool.preference;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.a4455jkjh.apktool.R;
import android.content.SharedPreferences;

public class KeystorePreference extends DialogPreference implements AdapterView.OnItemSelectedListener {
	Spinner format;
	EditText key_path;
	TextView cert;
	EditText alias;
	LinearLayout password;
	EditText storePass;
	EditText keyPass;
	public KeystorePreference(Context ctx, AttributeSet a) {
		super(ctx, a);
		setDialogLayoutResource(R.layout.keystore);
	}

	@Override
	protected void onBindDialogView(View view) {
		super.onBindDialogView(view);
		format = view.findViewById(R.id.format);
		key_path = view.findViewById(R.id.key_path);
		cert = view.findViewById(R.id.cert);
		alias = view.findViewById(R.id.alias);
		password = view.findViewById(R.id.password);
		storePass = view.findViewById(R.id.storePass);
		keyPass = view.findViewById(R.id.keyPass);
		format.setOnItemSelectedListener(this);
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		if (which == DialogInterface.BUTTON_POSITIVE) {
			SharedPreferences.Editor editor = getSharedPreferences().edit();
			editor.putInt("key_type", format.getSelectedItemPosition());
			editor.putString("key_path", key_path.getText().toString());
			editor.putString("cert_or_alias", alias.getText().toString());
			editor.putString("store_pass", storePass.getText().toString());
			editor.putString("key_pass", keyPass.getText().toString());
			editor.commit();
		} else if (which == DialogInterface.BUTTON_NEUTRAL) {
			SharedPreferences.Editor editor = getSharedPreferences().edit();
			editor.putString("store_pass", "");
			editor.putString("key_pass", "");
			editor.commit();
		}
	}

	@Override
	protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
		super.onPrepareDialogBuilder(builder);
		SharedPreferences sp = getSharedPreferences();
		int type = sp.getInt("key_type", 0);
		format.setSelection(type);
		String keyPath = sp.getString("key_path", "");
		key_path.setText(keyPath);
		String cert_or_alias = sp.getString("cert_or_alias", "");
		alias.setText(cert_or_alias);
		String store_pass = sp.getString("store_pass", "");
		storePass.setText(store_pass);
		String key_pass = sp.getString("key_pass", "");
		keyPass.setText(key_pass);
	}

	@Override
	public void onItemSelected(AdapterView<?> p1, View p2, int p3, long p4) {
		if (p3 == 3) {
			password.setVisibility(View.GONE);
			cert.setText(R.string.cert_path);
		} else {
			password.setVisibility(View.VISIBLE);
			cert.setText(R.string.key_alias);
		}
	}

	@Override
	public void onNothingSelected(AdapterView<?> p1) {
	}

}
