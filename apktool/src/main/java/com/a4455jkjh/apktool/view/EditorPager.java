package com.a4455jkjh.apktool.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class EditorPager extends ViewPager {
	public EditorPager(Context context) {
		super(context);
		setFocusable(true);
	}
	public EditorPager(Context context, AttributeSet attributes) {
		super(context, attributes);
		setFocusable(true);
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		switch (ev.getAction()) {
			case MotionEvent.ACTION_DOWN:
				float w = getWidth();
				float x = ev.getX();
				if (x > 10 || x < w - 10)
					getParent().
						requestDisallowInterceptTouchEvent(false);
				break;
			case MotionEvent.ACTION_UP:
				getParent().
					requestDisallowInterceptTouchEvent(true);
				break;
		}
		return super.onTouchEvent(ev);
	}

}
