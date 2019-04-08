package com.a4455jkjh.apktool.fragment.files;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.a4455jkjh.apktool.MainActivity;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.util.PopupUtils;
import com.a4455jkjh.apktool.util.Settings;
import java.io.File;
import com.a4455jkjh.apktool.fragment.FilesFragment;
import android.os.Bundle;

public class FilesPager implements View.OnClickListener {
	private final View view;
	private final Context ctx;
	private final CharSequence title;
	private ListView files;
	private TextView path;
	private FilesAdapter adapter;
	public FilesPager(Context context) {
		ctx = context;
		LayoutInflater inflater = LayoutInflater.from(context);
		view = inflater.inflate(
			R.layout.files, null);
		title = context.getText(R.string.files);
		files = view.findViewById(R.id.files);
		path = view.findViewById(R.id.path);
		view.findViewById(R.id.back).
			setOnClickListener(this);
		path.setOnClickListener(this);
	}

	public void init(Bundle savedInstanceState, FilesFragment frag) {
		adapter = FilesAdapter.init(frag, files, path);
		adapter.init(savedInstanceState);
	}

	public void save(Bundle outState) {
		adapter.save(outState);
	}

	public CharSequence getTitle() {
		return title;
	}

	public View getView() {
		return view;
	}

	@Override
	public void onClick(View p1) {
		switch (p1.getId()) {
			case R.id.back:
				if (adapter.goBack())
					return;
				((MainActivity)ctx).dismissFiles();
				break;
			case R.id.path:
				menu(p1);
				break;
		}
	}

	private void menu(final View view) {
		Menu menu = PopupUtils.show(view, R.menu.dir, new PopupUtils.Callback(){
				@Override
				public void call(Context ctx, int pos) {
					switch (pos) {
						case R.id.go_back:
							adapter.goBack();
							break;
						case R.id.sort:
							sort();
							break;
						case R.id.new_dir:
						case R.id.new_file:
							adapter.createFileOrDir(pos);
							break;
						case R.id.main_project:
							TextView path = (TextView) view;
							String project = path.getText().toString();
							Settings.setProjectPath(project, path.getContext());
							break;
						case R.id.set_as_output_directory:
							TextView path1 = (TextView) view;
							String output = path1.getText().toString();
							Settings.setOutputDirectory(output, path1.getContext());
							break;
					}
				}
			});
		String path = this.path.getText().toString();
		File json = new File(path, "apktool.json");
		menu.findItem(R.id.main_project).
			setVisible(json.exists());
	}
	int i;
	protected void sort() {
		new AlertDialog.Builder(ctx).
			setTitle(R.string.sort).
			setItems(R.array.sort, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface p1, int p2) {
					FileComparator.setDefaultAdapter(p2);
					adapter.refresh();
					PreferenceManager.getDefaultSharedPreferences(ctx).
						edit().
						putInt("defaultCompator", p2).
						commit();
				}
			}).
			setCancelable(false).
			show();
	}
}
