package com.a4455jkjh.apktool.fragment.editor;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import androidx.viewpager.widget.PagerAdapter;
import com.a4455jkjh.apktool.fragment.files.ErrorTree;
import com.a4455jkjh.apktool.view.Editor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EditorPagerAdapter extends PagerAdapter {
	public static final EditorPagerAdapter INSTANCE = new EditorPagerAdapter();
	private Context context;
	private List<EditorPagerItem> items;
	private boolean editable = true;
	private Editor.OnEditStateChangedListener listener = null;

	private ErrorTree errorsRoot;

	private EditorPagerAdapter() {
		items = new ArrayList<>(20);
	}

	public void checkFileExists() {
		Iterator<EditorPagerItem> items = this.items.iterator();
		while (items.hasNext()) {
			EditorPagerItem i = items.next();
			if (i.isFileExists())
				continue;
			i.reset();
			items.remove();
		}
		notifyDataSetChanged();
	}

	public void setSelection(int currentItem, int start, int stop) {
		if (items.size() == 0)
			return;
		items.get(currentItem).
			setSelection(start, stop);
	}
	public void requestFocus(int idx) {
		if (items.size() == 0)
			return;
		items.get(idx).requestFocus();
	}

	public void setRoot(ErrorTree errors) {
		errorsRoot = errors;
	}
	public synchronized void resetError() {
		if (errorsRoot != null) {
			errorsRoot.reset();
		}
	}
	public int open(ContentResolver r, Uri data) {
		for (EditorPagerItem item : items)
			if (item.isUri(data))
				return items.indexOf(item);
		EditorPagerItem editorPagerItem = new EditorPagerItem(data, context, editable, listener);
		items.add(editorPagerItem);
		notifyDataSetChanged();
		editorPagerItem.requestFocus();
		return items.size() - 1;
	}

	public void setFontSize() {
		for (EditorPagerItem item : items) {
			Editor editor = item.getEditor();
			editor.resetFontSize();
		}
	}
	public void bindContext(Context context, Editor.OnEditStateChangedListener listener) {
		this.listener = listener;
		this.context = context;
		for (EditorPagerItem item : items) {
			item.createEditor(context, listener);
		}
	}
	@Override
	public int getCount() {
		return items.size();
	}
	public boolean isEdited(int idx) {
		if (items.size() == 0)
			return false;
		return items.get(idx).isEdited();
	}
	public boolean isEditable(int idx) {
		if (items.size() == 0)
			return false;
		return items.get(idx).isEditable();
	}
	public boolean canUndo(int idx) {
		if (items.size() == 0)
			return false;
		return items.get(idx).canUndo();
	}
	public boolean canRedo(int idx) {
		if (items.size() == 0)
			return false;
		return items.get(idx).canRedo();
	}
	public boolean canFormat(int idx) {
		if (items.size() == 0)
			return false;
		return items.get(idx).canFormat();
	}

	public void setEditable(boolean isEditable) {
		this.editable = isEditable;
		for (EditorPagerItem i : items)
			i.setEditable(isEditable);
	}
	public void undo(int idx) {
		if (items.size() == 0)
			return ;
		items.get(idx).undo();
	}
	public void redo(int idx) {
		if (items.size() == 0)
			return ;
		items.get(idx).redo();
	}
	public void format(int idx) {
		if (items.size() == 0)
			return ;
		items.get(idx).format();
	}
	public void find(int idx, SearchView view) {
		if (items.size() == 0)
			return ;
		items.get(idx).getEditor().find(view);
	}
	public void go_to(int idx, SearchView view) {
		if (items.size() == 0)
			return ;
		items.get(idx).getEditor().goToLine(view);
	}
	@Override
	public boolean isViewFromObject(View p1, Object p2) {
		return p1 == p2;
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		View view = items.get(position).getEditor();
		container.addView(view);
		return view;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((View)object);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		EditorPagerItem item = items.get(position);
		CharSequence title = item.getTitle();
		if (item.isEdited())
			return title + "*";
		return title;
	}
	public void prepare(int idx, MenuItem item) {
		if (items.size() == 0) {
			item.setVisible(false);
			return;
		}
		item.setVisible(true);
		items.get(idx).prepare(item);
	}
	public void translate(int idx, MenuItem item) {
		if (items.size() == 0)
			return;
		items.get(idx).translate(item);
	}
	public void remove(int position, int mode) throws IOException {
		EditorPagerItem item = items.get(position);
		if (mode == 0) {
			item.save();
			items.remove(item);
		} else {
			saveAll();
			items.clear();
			if (mode == 1)
				items.add(item);
		}
		notifyDataSetChanged();
	}
	public void saveAll() throws IOException {
		for (EditorPagerItem item : items)
			item.save();
	}
	public void save(int idx) throws IOException {
		items.get(idx).save();
	}

	public synchronized void exit() {
		items.clear();
		errorsRoot = null;
		notifyDataSetChanged();
	}
	@Override
	public int getItemPosition(Object object) {
		for (EditorPagerItem item : items)
			if (item.getEditor() == object)
				return items.indexOf(item);
		return POSITION_NONE;
	}
	public boolean hasUnSavedEditor() {
		for (EditorPagerItem item : items)
			if (item.isEdited())
				return true;
		return false;
	}
}
