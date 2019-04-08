package com.a4455jkjh.apktool.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.a4455jkjh.apktool.R;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.a4455jkjh.apktool.util.Settings;
import java.util.LinkedList;
import java.util.List;

public class MessageView extends View implements GestureDetector.OnGestureListener {
	private final StringBuffer text;
	private final Paint paint;
	private final List<CharSequence> lines;
	private final GestureDetector gesture;
	private float textSize;
	public MessageView(Context ctx) {
		super(ctx);
		gesture = new GestureDetector(ctx, this);
		text = new StringBuffer();
		paint = new Paint();
		lines = new LinkedList<>();
		textSize = Settings.fontSize * ctx.getResources().getDimension(R.dimen.one_sp);
		init(paint, textSize);
	}

	private static void init(Paint paint, float textSize) {
		paint.setAntiAlias(true);
		paint.setTextSize(textSize);
		paint.setTypeface(Settings.typeface);
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		int cur_h = (int)(lines.size() * textSize * 1.1f);
		final int max = cur_h - h;
		if (max <= 0)
			computeLines(w);
		else
			post(new Runnable(){
					@Override
					public void run() {
						scrollTo(0, max);
					}
				});
	}
	private synchronized void computeLines(float width) {
		//if (width == 0)return;
		float left = 0;
		List<CharSequence> lines = this.lines;
		int previous = lines.size();
		Paint paint = this.paint;
		CharSequence s = text.toString();
		lines.clear();
		int len = s.length();
		int start = 0;
		float space = paint.measureText("  ");
		boolean newLine = true;
		for (int i=0;i < len;i++) {
			char ch = s.charAt(i);
			if (ch == '\n') {
				lines.add(line(s.subSequence(start, i), newLine));
				left = 0;
				start = i + 1;
				newLine = true;
				continue;
			}
			float w = paint.measureText(s, i, i + 1);
			if (left + w > width) {
				lines.add(line(s.subSequence(start, i), newLine));
				start = i;
				left = space;
				newLine = false;
			}
			left += w;
		}
		if (start < len)
			lines.add(s.subSequence(start, s.length()));
		else if (start == len)
			lines.add("  ");
		if (lines.size() != previous)
			post(new Runnable(){
					@Override
					public void run() {
						requestLayout();
					}
				});
	}

	private CharSequence line(CharSequence line, boolean newLine) {
		if (!newLine)
			return "  " + line;
		return line;
	}
	public void append(CharSequence s) {
		text.append(s);
		int w = getWidth();
		if (w != 0)
			computeLines(w);
		invalidate();
	}

	@Override
	protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int w = MeasureSpec.getSize(widthMeasureSpec);
		int h = MeasureSpec.getSize(heightMeasureSpec);
		float mh = lines.size() * textSize * 1.1f;
		setMeasuredDimension(w, Math.min(h, (int)mh));
	}

	@Override
	protected synchronized void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint = this.paint;
		List<CharSequence> lines = this.lines;
		float top = getScrollY();
		float textSize=this.textSize * 1.1f;
		int line = (int)(top / textSize);
		float y = (line + 1) * textSize;
		int h=getHeight();
		for (int i=line;i < lines.size();i++) {
			CharSequence s=lines.get(i);
			setColor(s, paint);
			canvas.drawText(s, 0, s.length(), 0, y, paint);
			if (y - top > h)break;
			y += textSize;
		}
	}

	private static void setColor(CharSequence s, Paint paint) {
		int color;
		switch (s.charAt(0)) {
			case 'I':
				color = 0xff000000;
				break;
			case 'E':
				color = 0xffff0000;
				break;
			case 'W':
				color = 0xff0000ff;
				break;
			default:
				return;
		}
		paint.setColor(color);
	}
	public CharSequence getText() {
		return text.toString();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		return gesture.onTouchEvent(event);
	}


	@Override
	public boolean onDown(MotionEvent p1) {
		return true;
	}

	@Override
	public boolean onSingleTapUp(MotionEvent p1) {
		return true;
	}

	@Override
	public void onShowPress(MotionEvent p1) {
		// TODO: Implement this method
	}

	@Override
	public boolean onScroll(MotionEvent p1, MotionEvent p2, float p3, float p4) {
		float max = lines.size() * textSize * 1.1f;
		float h = getHeight();
		if (max < h)return false;
		max = max - h;
		int ty = (int)(getScrollY() + p4);
		if (ty < 0)ty = 0;
		if (ty > max)ty = (int)max;
		scrollTo(0, ty);
		return true;
	}

	@Override
	public boolean onFling(MotionEvent p1, MotionEvent p2, float p3, float p4) {
		return false;
	}

	@Override
	public void onLongPress(MotionEvent p1) {
		// TODO: Implement this method
	}

}
