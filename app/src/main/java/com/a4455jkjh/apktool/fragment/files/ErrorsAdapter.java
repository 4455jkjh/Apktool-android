package com.a4455jkjh.apktool.fragment.files;

import android.os.Handler;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.a4455jkjh.apktool.util.Settings;
import com.a4455jkjh.apktool.view.TreeAdapter;

public class ErrorsAdapter extends ErrorTree implements TreeAdapter<ErrorTree>, Runnable {

	@Override
	public boolean shouldShowExpandDrawable() {
		return false;
	}

	private Handler handler;
	private BaseAdapter adapter;

	public ErrorsAdapter() {
		super("");
	}
	@Override
	public String getMessage() {
		return "";
	}
	public void reset() {
		if (handler == null)
			handler = new Handler();
		handler.post(this);
	}
	@Override
	public void run() {
		childs.clear();
		Settings.project.addErrors(this);
		editor.showErrors(getChildCount() > 0);
		adapter.notifyDataSetChanged();
	}
	public void refresh() {
		if (adapter != null)
			adapter.notifyDataSetChanged();
	}
	@Override
	public void init(BaseAdapter adapter) {
		this.adapter = adapter;
	}

	@Override
	public ErrorTree getRoot() {
		return this;
	}

	@Override
	public int getChildCount(ErrorTree t) {
		return t.getChildCount();
	}

	@Override
	public ErrorTree getChild(ErrorTree t, int idx) {
		return t.getChild(idx);
	}

	@Override
	public void bindView(TextView name, ImageView icon, ErrorTree t) {
		name.setText(t.getMessage());
		t.setIcon(icon);
	}

	@Override
	public void onClick(ErrorTree t, View view) {
		t.click(view);
	}

}
