package com.a4455jkjh.apktool.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import android.widget.ListAdapter;
import java.util.List;
import java.util.LinkedList;
import android.view.MotionEvent;
import android.view.GestureDetector;

public class TreeView<T> extends ListView {

	private final TreeListAdapter<T> adapter;
	public TreeView(Context c) {
		this(c, null);
	}
	public TreeView(Context c, AttributeSet a) {
		super(c, a);
		adapter = new TreeListAdapter<>(c);
		setAdapter(adapter);
		setOnItemClickListener(adapter);
		setDivider(null);
	}

	public void setAdapter(TreeAdapter<T> adapter) {
		this.adapter.setAdapter(adapter);
	}
}
