package com.a4455jkjh.apktool.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.a4455jkjh.apktool.MainActivity;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.editor.EditorPagerAdapter;
import com.a4455jkjh.apktool.fragment.editor.EditorTitleAdapter;
import com.a4455jkjh.apktool.fragment.files.ErrorTree;
import com.a4455jkjh.apktool.menu.Menus;
import com.a4455jkjh.apktool.util.PopupUtils;
import com.a4455jkjh.apktool.view.Editor;
import com.a4455jkjh.apktool.view.EditorPager;
import java.io.File;
import java.io.IOException;

public class EditorFragment extends Fragment implements Editor.OnEditStateChangedListener,ViewPager.OnPageChangeListener,OnClickListener,MenuItem.OnActionExpandListener {
	private EditorPager editorPager;
	public EditorTitleAdapter open_files;
	private TextView empty, title;;
	private MenuItem expandedItem = null;
	private View errors;

	public void setRoot(ErrorTree errors) {
		EditorPagerAdapter.INSTANCE.setRoot(errors);
		errors.setEditor(this);
	}

	public void init() {
		if (EditorPagerAdapter.INSTANCE.getCount() == 0) {
			empty.setVisibility(View.VISIBLE);
			((MainActivity)getActivity()).showFiles(0);
		} else {
			empty.setVisibility(View.GONE);
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.editor_pager, container, false);
	}
	public void setEditable(boolean editable) {
		EditorPagerAdapter.INSTANCE.setEditable(editable);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		editorPager = view.findViewById(R.id.editorPager);
		empty = view.findViewById(R.id.empty);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		setHasOptionsMenu(true);
		Activity act = getActivity();
		open_files = new EditorTitleAdapter(this, editorPager);
		ActionBar bar = getActivity().getActionBar();
		View customView = bar.getCustomView();
		title = customView.findViewById(R.id.name);
		EditorPagerAdapter.INSTANCE.bindContext(act, this);
		errors = customView.findViewById(R.id.errors);
		title.setText(R.string.app_name);
		title.setOnClickListener(this);
		editorPager.addOnPageChangeListener(this);
		editorPager.setAdapter(EditorPagerAdapter.INSTANCE);
		errors.setOnClickListener(this);
		init(savedInstanceState);
	}
	public void showErrors(boolean show) {
		errors.setVisibility(show ? View.VISIBLE : View.GONE);
	}
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.editor, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public void onPageScrolled(int p1, float p2, int p3) {
		// TODO: Implement this method
	}
	public void focus() {
		EditorPagerAdapter.INSTANCE.requestFocus(editorPager.getCurrentItem());
	}
	@Override
	public void onPageSelected(int idx) {
		EditorPagerAdapter.INSTANCE.requestFocus(idx);
		title.setText(EditorPagerAdapter.INSTANCE.getPageTitle(idx));
		getActivity().invalidateOptionsMenu();
	}

	@Override
	public void onPageScrollStateChanged(int p1) {
		// TODO: Implement this method
	}

	private void init(Bundle savedInstanceState) {
		int currentItem = 0;
		if (savedInstanceState != null) {
			currentItem = savedInstanceState.getInt("CURRENT_ITEM", 0);
		}
		if (EditorPagerAdapter.INSTANCE.getCount() == 0) {
			empty.setVisibility(View.VISIBLE);
		} else {
			empty.setVisibility(View.GONE);
			editorPager.setCurrentItem(currentItem);
			onPageSelected(currentItem);
		}
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("CURRENT_ITEM", editorPager.getCurrentItem());
	}

	public void open(File file, final int start, final int stop) {
		open(Uri.fromFile(file));
		editorPager.postDelayed(new Runnable(){
				@Override
				public void run() {
					EditorPagerAdapter.INSTANCE.setSelection(editorPager.getCurrentItem(),
															 start, stop);
				}
			}, 200);
	}

	public void open(Uri data) {
		ContentResolver r = getActivity().getContentResolver();
		int idx = EditorPagerAdapter.INSTANCE.open(r, data);
		setCurrentItem(idx, false);
		empty.setVisibility(View.GONE);
		((MainActivity)getActivity()).dismissFiles();
	}

	public void open(File file) {
		open(Uri.fromFile(file));
	}
	public void setCurrentItem(int idx, boolean close) {
		if (close && idx == editorPager.getCurrentItem()) {
			close(idx);
			return;
		}
		editorPager.setCurrentItem(idx);
		onPageSelected(idx);
	}

	private void close(final int idx) {
		PopupUtils.show(title, R.menu.close_file, new PopupUtils.Callback(){
				@Override
				public void call(Context ctx, int pos) {
					int mode;
					switch (pos) {
						case R.id.close_cur:
							mode = 0;
							break;
						case R.id.close_others:
							mode = 1;
							break;
						case R.id.close_all:
							mode = 2;
							break;
						default:
							return;
					}
					close(idx, mode);
				}
			});
	}
	protected void close(int idx, int mode) {
		try {
			EditorPagerAdapter.INSTANCE.remove(idx, mode);
		} catch (IOException e) {}
		if (EditorPagerAdapter.INSTANCE.getCount() == 0) {
			title.setText(R.string.app_name);
			empty.setVisibility(View.VISIBLE);
			getActivity().invalidateOptionsMenu();
		} else {
			onPageSelected(editorPager.getCurrentItem());
		}
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.name:
				if (EditorPagerAdapter.INSTANCE.getCount() == 0)return;
				PopupUtils.show(title, EditorPagerAdapter.INSTANCE, new PopupUtils.Callback(){
						@Override
						public void call(Context ctx, int id) {
							setCurrentItem(id, true);
						}
					});
				break;
			case R.id.errors:
				((MainActivity)getActivity()).showFiles(2);
				break;
		}
	}

	public void save(boolean all, boolean toast) {
		try {
			if (all)
				EditorPagerAdapter.INSTANCE.saveAll();
			else
				EditorPagerAdapter.INSTANCE.save(editorPager.getCurrentItem());
			if (toast)
				Toast.makeText(getActivity(), R.string.all_files_saved, 0).show();
		} catch (IOException e) {

		}
	}

	@Override
	public void onEditStateChanged() {
		onPageSelected(editorPager.getCurrentItem());
	}
	public boolean hasUnSavedEditor() {
		return EditorPagerAdapter.INSTANCE.hasUnSavedEditor();
	}

	@Override
	public void onPrepareOptionsMenu(Menu menu) {
		int id;
		if (EditorPagerAdapter.INSTANCE.getCount() == 0)
			id = -1;
		else
			id = editorPager.getCurrentItem();
		Menus.prepare(menu, id);
		menu.findItem(R.id.find).setOnActionExpandListener(this);
		menu.findItem(R.id.go_to_line).setOnActionExpandListener(this);
		EditorPagerAdapter.INSTANCE.
			prepare(editorPager.getCurrentItem(),
					menu.findItem(R.id.translate));
	}

	@Override
	public boolean onMenuItemActionExpand(MenuItem p1) {
		expandedItem = p1;
		int idx = editorPager.getCurrentItem();
		if (p1.getItemId() == R.id.find)
			EditorPagerAdapter.INSTANCE.
				find(idx, (SearchView)p1.getActionView());
		else if (p1.getItemId() == R.id.go_to_line)
			EditorPagerAdapter.INSTANCE.
				go_to(idx, (SearchView)p1.getActionView());
		return true;
	}
	public boolean collapseItem() {
		if (expandedItem == null)
			return false;
		expandedItem.collapseActionView();
		return true;
	}
	@Override
	public boolean onMenuItemActionCollapse(MenuItem p1) {
		expandedItem = null;
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.save:
				save(false, true);
				break;
			case R.id.edit_mode:
				if (EditorPagerAdapter.INSTANCE.isEditable(editorPager.getCurrentItem())) {
					item.setTitle(R.string.edit_mode);
					setEditable(false);
				} else {
					item.setTitle(R.string.scan_mode);
					setEditable(true);
				}
				break;
			case R.id.translate:
				EditorPagerAdapter.INSTANCE.
					translate(editorPager.getCurrentItem(), item);
				getActivity().invalidateOptionsMenu();
				break;
			default:
				Menus.click(item, editorPager.getCurrentItem());
				break;
		}
		return true;
	}

}
