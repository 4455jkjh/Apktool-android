package com.a4455jkjh.apktool.fragment;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.os.Bundle;
import android.webkit.WebView;

public class HelpFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return new WebView(inflater.getContext());
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		WebView web = (WebView) view;
		web.loadUrl("file:///android_asset/index.html");
	}

}
