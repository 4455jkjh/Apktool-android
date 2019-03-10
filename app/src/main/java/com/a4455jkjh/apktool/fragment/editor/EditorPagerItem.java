package com.a4455jkjh.apktool.fragment.editor;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.lexer.JavaLexTask;
import com.a4455jkjh.apktool.lexer.LexerUtil;
import com.a4455jkjh.apktool.lexer.SmaliLexTask;
import com.a4455jkjh.apktool.util.Smali2Java;
import com.a4455jkjh.apktool.view.Editor;
import com.myopicmobile.textwarrior.common.DocumentProvider;
import com.myopicmobile.textwarrior.common.LexTask;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;
import com.a4455jkjh.apktool.service.Project;
import com.a4455jkjh.apktool.util.Settings;
import com.a4455jkjh.apktool.service.FileItem;
import com.a4455jkjh.apktool.view.Editor.OnEditStateChangedListener;

public class EditorPagerItem implements Runnable, Editor.OnEditStateChangedListener {
	private final Uri data;
	private final ContentResolver resolver;
	private Editor editor;
	private final DocumentProvider text;
	private final LexTask mLexTask;
	private final boolean isSmali;
	private boolean isTranslated = false;
	private boolean isEditable;
	private int caret = 0;

	private Editor.OnEditStateChangedListener listener;
	public EditorPagerItem(Uri uri, Context context, boolean editable, Editor.OnEditStateChangedListener listener) {
		resolver = context.getContentResolver();
		data = uri;
		this.isEditable = editable;
		text = new DocumentProvider();
		mLexTask = LexerUtil.createLexer(getName(uri), getItem(uri));
		isSmali = mLexTask instanceof SmaliLexTask;
		createEditor(context, listener);
		new Thread(this).start();
	}
	private long lastEdited = 0;

	public void reset() {
		lastEdited = System.currentTimeMillis();
	}

	public boolean isFileExists() {
		File f = getFile(data);
		if (f == null)
			return true;
		return f.exists();
	}
	@Override
	public void onEditStateChanged() {
		listener.onEditStateChanged();
		if (isEdited()) {
			lastEdited = System.currentTimeMillis();
			editor.postDelayed(save, 10000);
		}
	}
	private Runnable save = new Runnable(){
		@Override
		public void run() {
			try {
				if (System.currentTimeMillis() - lastEdited < 10000 ||
					!isEdited())
					return;
				save();
			} catch (IOException e) {}
		}
	};

	private FileItem getItem(Uri uri) {
		if (uri.getScheme().equals("file")) {
			File f = new File(uri.getPath());
			return Settings.project.getItem(f);
		}
		return null;
	}

	private static String getName(Uri uri) {
		String n = uri.getPath();
		int i = n.lastIndexOf('/');
		if (i == -1)
			return n;
		return n.substring(i + 1);
	}

	public EditorPagerItem(File file, Context context, boolean editable, Editor.OnEditStateChangedListener listener) {
		this(Uri.fromFile(file), context, editable, listener);
	}

	public void prepare(MenuItem translate) {
		if (!isSmali) {
			translate.setVisible(false);
			return;
		}
		translate.setVisible(true);
		if (isTranslated)
			translate.setTitle(R.string.return_smali);
		else
			translate.setTitle(R.string.translate_java);
	}
	public void translate(MenuItem translate) {
		if (!isSmali) {
			translate.setVisible(false);
			return;
		}
		if (isTranslated) {
			editor.setDocumentProvider(text);
			editor.moveCaret(caret);
			caret = 0;
			editor.setLexTask(mLexTask);
			translate.setTitle(R.string.translate_java);
			editor.setEditable(isEditable);
			isTranslated = false;
		} else {
			try {
				caret = editor.getCaretPosition();
				translate();
				editor.moveCaret(0);
				translate.setTitle(R.string.return_smali);
				editor.setEditable(false);
				isTranslated = true;
			} catch (Exception e) {
				caret = 0;
				StringBuilder sb = new StringBuilder(e.getMessage());
				for (StackTraceElement s : e.getStackTrace()) {
					sb.append('\n');
					sb.append(s);
				}
				new AlertDialog.Builder(editor.getContext()).
					setTitle("Error!").
					setMessage(sb).
					show();
			}
		}
	}

	private void translate() throws Exception {
		SmaliLexTask s = (SmaliLexTask) mLexTask;
		String java = Smali2Java.translate(s.getClassDef(), getFile(data), s.getCodes());
		editor.setLexTask(translated);
		editor.setText(java);
		editor.invalidate();
	}

	private File getFile(Uri data) {
		if (data.getScheme().equals("file"))
			return new File(data.getPath());
		return null;
	}
	public Editor createEditor(Context context, Editor.OnEditStateChangedListener listener) {
		editor = new Editor(context);
		isTranslated = false;
		this.listener = listener;
		editor.setOnEditStateChangedListener(this);
		editor.setLexTask(mLexTask);
		editor.setDocumentProvider(text);
		return editor;
	}
	public boolean isEdited() {
		if (isTranslated)
			return false;
		return editor.isEdited();
	}
	public boolean isEditable() {
		if (isTranslated)
			return false;
		return isEditable;
	}
	public boolean canUndo() {
		if (isTranslated)
			return false;
		return editor.canUndo();
	}
	public boolean canRedo() {
		if (isTranslated)
			return false;
		return editor.canRedo();
	}
	public boolean canFormat() {
		if (isTranslated)
			return false;
		return editor.canFormat();
	}
	public void requestFocus() {
		editor.requestFocus();
	}
	int start = 0, num = 0;
	public synchronized void setSelection(int start, int stop) {
		int num = stop - start + 1;
		if (text.length() > 0)
			editor.setSelection(start, num);
		else {
			this.start = start;
			this.num = num;
		}
	}
	protected synchronized void setText(CharSequence text) {
		this.text.setText(text);
		editor.resetView();
		editor.respan();
		if (num > 0) {
			editor.postDelayed(new Runnable(){
					@Override
					public void run() {
						editor.setSelection(start, num);
						start = 0;
						num = 0;
					}
				}, 100);
		}
	}
	public void setEditable(boolean isEditable) {
		if (!isTranslated)
			editor.setEditable(isEditable);
		this.isEditable = isEditable;
	}
	public void undo() {
		if (isTranslated)
			return;
		editor.undo();
	}
	public void redo() {
		if (isTranslated)
			return;
		editor.redo();
	}
	public void format() {
		if (isTranslated)
			return;
		editor.format();
	}

	public Editor getEditor() {
		return editor;
	}
	public CharSequence getTitle() {
		return getName(data);
	}
	public void save() throws IOException {
		if (!isEdited())return;
		OutputStream os = resolver.openOutputStream(data);
		IOUtils.write(text, os);
		os.close();
		editor.setEdited(false);
	}
	public boolean isFile(File file) {
		return isUri(Uri.fromFile(file));
	}
	public boolean isUri(Uri data) {
		return this.data.equals(data);
	}
	@Override
	public void run() {
		try {
			InputStream i = resolver.openInputStream(data);
			final String text = IOUtils.toString(i);
			i.close();
			editor.post(new Runnable(){
					@Override
					public void run() {
						setText(text);
					}
				});
		} catch (IOException e) {
			//ignore
		}
	}

	private static final JavaLexTask translated = new JavaLexTask();
}
