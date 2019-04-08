package com.a4455jkjh.apktool.fragment.files;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.FilesFragment;
import com.a4455jkjh.apktool.util.Settings;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilesAdapter extends BaseAdapter implements AdapterView.OnItemClickListener,AdapterView.OnItemLongClickListener,Refreshable {
	private final FilesFragment frag;
	private final List<Item> items;
	private final TextView path;
	private static final File rootDir = Environment.getExternalStorageDirectory();
	private BuildItem build;
	private File curDir;
	private final FilenameFilter filter = new FilenameFilter(){
		@Override
		public boolean accept(File p1, String p2) {
			return p2.charAt(0) != '.';
		}
	};

	private FilesAdapter(FilesFragment act, TextView path) {
		this.frag = act;
		this.path = path;
		build = null;
		items = new ArrayList<>(1024);
	}
	@Override
	public void refresh() {
		refresh(curDir);
	}

	public void createFileOrDir(final int mode) {
		FragmentActivity act = frag.getActivity();
		final EditText name = new EditText(act);
		int title;
		if (mode == R.id.new_file)
			title = R.string.new_file;
		else
			title = R.string.new_dir;
		final Button ok = new AlertDialog.Builder(act).
			setTitle(title).
			setView(name).
			setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface p1, int p2) {
					File target = new File(curDir, name.getText().toString());
					if (mode == R.id.new_file) {
						try {
							target.createNewFile();
							frag.edit(target);
							refresh();
						} catch (IOException e) {}
					} else {
						if (target.mkdir())
							refresh(target);
					}
				}
			}).
			setNegativeButton(R.string.cancel, null).
			show().
			getButton(DialogInterface.BUTTON_POSITIVE);
		name.addTextChangedListener(new TextWatcher(){
				@Override
				public void beforeTextChanged(CharSequence p1, int p2, int p3, int p4) {
					// TODO: Implement this method
				}
				@Override
				public void onTextChanged(CharSequence p1, int p2, int p3, int p4) {
					// TODO: Implement this method
				}
				@Override
				public void afterTextChanged(Editable p1) {
					if (p1.length() == 0) {
						ok.setEnabled(false);
						return;
					}
					File target = new File(curDir, p1.toString());
					if (target.exists()) {
						ok.setEnabled(false);
						return;
					}
					ok.setEnabled(true);
				}
			});
		ok.setEnabled(false);
	}
	void refresh(File dir) {
		curDir = dir;
		BuildItem build = this.build;
		if (build != null && !build.isSubDir(dir))
			build = null;
		path.setText(dir.getAbsolutePath());
		items.clear();
		for (File f:dir.listFiles(filter)) {
			items.add(new FileItem(f));
			if (f.isFile() && f.getName().equals("apktool.json"))
				build = new BuildItem(dir);
		}
		if (build != null)
			items.add(build);
		this.build = build;
		Collections.sort(items);
		notifyDataSetChanged();
	}
	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int p1) {
		return items.get(p1);
	}

	@Override
	public long getItemId(int p1) {
		return items.get(p1).hashCode();
	}
	public boolean goBack() {
		if (curDir.equals(rootDir))
			return false;
		refresh(curDir.getParentFile());
		return true;
	}

	@Override
	public View getView(int p1, View p2, ViewGroup p3) {
		if (p2 == null)
			p2 = frag.getLayoutInflater().
				inflate(R.layout.files_entry, p3, false);
		TextView name = p2.findViewById(R.id.name);
		ImageView icon = p2.findViewById(R.id.icon);
		items.get(p1).setup(icon, name);
		return p2;
	}

	@Override
	public void onItemClick(AdapterView<?> p1, View p2, int p3, long p4) {
		Item item = items.get(p3);
		if (item.edit(frag))
			return;
		if (item.click(p2, this))return;
		item.process(this);
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> p1, View p2, int p3, long p4) {
		Item item = items.get(p3);
		return item.longClick(p2, this);
	}
	public void save(Bundle outState) {
		outState.putString("CUR_DIR_PATH", curDir.getAbsolutePath());
	}
	public void init(Bundle savedInstanceState) {
		File rootDir = this.rootDir;
		if (savedInstanceState != null) {
			String cur_dir = savedInstanceState.getString("CUR_DIR_PATH", rootDir.getAbsolutePath());
			refresh(new File(cur_dir));
		} else {
			File f = new File(Settings.projectPath);
			if (f.exists() && f.isDirectory())
				refresh(f);
			else
				refresh(rootDir);
		}

	}
	public static FilesAdapter init(FilesFragment act, ListView files, TextView path) {
		FilesAdapter adapter = new FilesAdapter(act, path);
		files.setAdapter(adapter);
		files.setOnItemClickListener(adapter);
		files.setOnItemLongClickListener(adapter);
		return adapter;
	}
}
