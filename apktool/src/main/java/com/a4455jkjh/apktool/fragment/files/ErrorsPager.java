package com.a4455jkjh.apktool.fragment.files;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.FilesFragment;
import com.a4455jkjh.apktool.view.TreeView;
import org.antlr.v4.runtime.tree.Tree;

public class ErrorsPager {
	private final View view;
	private final Context ctx;
	private final CharSequence title;
	private TreeView<ErrorTree> errors;
	private ErrorsAdapter adapter;
	public ErrorsPager(Context context) {
		ctx = context;
		LayoutInflater inflater = LayoutInflater.from(context);
		view = inflater.inflate(
			R.layout.errors, null);
		title = context.getText(R.string.errors);
		errors = view.findViewById(R.id.errors);
	}

	public void init(FilesFragment frag) {
		adapter = new ErrorsAdapter();
		adapter.reset();
		errors.setAdapter(adapter);
		frag.setRoot(adapter);
	}

	public CharSequence getTitle() {
		return title;
	}

	public View getView() {
		return view;
	}

}
