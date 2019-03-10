package com.a4455jkjh.apktool.fragment.files;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.a4455jkjh.apktool.fragment.FilesFragment;

public class FilesPagerAdapter extends PagerAdapter {
	private final Context context;
	private final FilesPager files;
	private final ErrorsPager errors;
	private final ApplicationsPage apps;

	public FilesPagerAdapter(Context context) {
		this.context = context;
		files = new FilesPager(context);
		errors = new ErrorsPager(context);
		apps = new ApplicationsPage(context);
	}

	public void save(Bundle outState) {
		files.save(outState);
	}

	public void init(Bundle savedInstanceState, FilesFragment frag) {
		files.init(savedInstanceState, frag);
		errors.init(frag);
		apps.init(frag);
	}
	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public boolean isViewFromObject(View p1, Object p2) {
		return p1 == p2;
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		View view = null;
		if (position == 0)
			view = files.getView();
		else if (position == 1)
			view = apps.getView();
		else if (position == 2)
			view = errors.getView();
		container.addView(view);
		return view;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((View)object);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		if (position == 0)
			return files.getTitle();
		if (position == 1)
			return apps.getTitle();
		if (position == 2)
			return errors.getTitle();
		return super.getPageTitle(position);
	}

}
