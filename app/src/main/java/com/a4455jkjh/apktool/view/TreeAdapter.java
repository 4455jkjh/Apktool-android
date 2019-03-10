package com.a4455jkjh.apktool.view;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public interface TreeAdapter<T> 
{
	void init(BaseAdapter adapter);
	T getRoot();
	int getChildCount(T t);
	T getChild(T t, int idx);
	void bindView(TextView name, ImageView icon, T t);
	void onClick(T t, View view);
	boolean shouldShowExpandDrawable();
}
