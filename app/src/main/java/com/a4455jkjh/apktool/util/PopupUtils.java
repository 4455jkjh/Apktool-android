package com.a4455jkjh.apktool.util;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import androidx.viewpager.widget.PagerAdapter;

public class PopupUtils {
	public static Menu show(View view, int id, Callback callback) {
		final Context ctx = view.getContext();
		PopupMenu menu = new PopupMenu(ctx, view);
		menu.inflate(id);
		return show(menu, ctx, callback);
	}
	public static Menu show(View view, PagerAdapter adapter, Callback callback) {
		Context ctx = view.getContext();
		PopupMenu menu = new PopupMenu(ctx, view);
		Menu m = menu.getMenu();
		int c = adapter.getCount();
		for (int i = 0; i < c; i++)
			m.add(0, i, 0, adapter.getPageTitle(i));
		return show(menu, ctx, callback);
	}

	private static Menu show(PopupMenu menu, final Context ctx , final Callback call) {
		menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
				@Override
				public boolean onMenuItemClick(MenuItem p1) {
					call.call(ctx, p1.getItemId());
					return true;
				}
			});
		menu.show();
		return menu.getMenu();
	}
	public interface Callback {
		void call(Context ctx, int id);
	}
}
