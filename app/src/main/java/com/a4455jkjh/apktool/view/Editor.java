package com.a4455jkjh.apktool.view;
import android.content.Context;
import android.graphics.Typeface;
import android.text.InputType;
import android.util.AttributeSet;
import android.widget.SearchView;
import android.widget.Toast;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.util.Settings;
import com.myopicmobile.textwarrior.android.FreeScrollingTextField;
import com.myopicmobile.textwarrior.android.YoyoNavigationMethod;
import com.myopicmobile.textwarrior.common.ColorSchemeDark;
import com.myopicmobile.textwarrior.common.ColorSchemeLight;
import com.myopicmobile.textwarrior.common.Document;
import com.myopicmobile.textwarrior.common.DocumentProvider;
import com.myopicmobile.textwarrior.common.LinearSearchStrategy;

public class Editor extends FreeScrollingTextField {
	private boolean editable = true;
	private final float OneSp;
	private OnEditStateChangedListener listener;
	public Editor(Context context) {
		super(context);
		OneSp = context.getResources().getDimension(R.dimen.one_sp);
		init();
	}
	public Editor(Context context, AttributeSet attributes) {
		super(context, attributes);
		OneSp = context.getResources().getDimension(R.dimen.one_sp);
		init();
	}
	public void resetFontSize(){
		setTextSize(Settings.fontSize);
	}
	public void goToLine(int line) {
		if (line > _hDoc.getRowCount()) {
			line = _hDoc.getRowCount();
		}
		if (line <= 0)
			line = 1;
		int idx = _hDoc.getLineOffset(line - 1);
		setSelection(idx);
	}
	public void setSelection(int index) {
		selectText(false);
		moveCaret(index);
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
		super.showIME(editable);
	}

	public boolean isEditable() {
		return editable;
	}

	private void init() {
		setAutoIndentWidth(4);
		setShowLineNumbers(true);
		setWordWrap(false);
		setTypeface(Settings.typeface);
		setTextSize(Settings.fontSize);
		setNavigationMethod(new YoyoNavigationMethod(this));
		setHighlightCurrentRow(true);
		resetTheme();
	}

	public void resetTheme() {
		if (Settings.lightTheme)
			setColorScheme(new ColorSchemeLight());
		else
			setColorScheme(new ColorSchemeDark());
	}

	public void setTextSize(int size) {
		super.setTextSize((int)(size * OneSp));
	}
	public void setText(CharSequence text) {
		Document doc = new Document(this);
		doc.setText(text);
		DocumentProvider p = new DocumentProvider(doc);
		setDocumentProvider(p);
	}
	public CharSequence getText() {
		return createDocumentProvider();
	}
	@Override
	protected void showIME(boolean show) {
		if (!editable)
			show = false;
		super.showIME(show);
		getParent().requestLayout();
	}
	public boolean canRedo() {
		return _hDoc.canRedo();
	}
	public boolean canUndo() {
		return _hDoc.canUndo();
	}
	public void find(SearchView searchView) {
		SearchView.OnQueryTextListener query = new SearchView.OnQueryTextListener(){
			int idx=0;
			@Override
			public boolean onQueryTextSubmit(String p1) {
				idx = findNext(p1, idx);
				if (idx == 0)
					return false;
				return true;
			}
			@Override
			public boolean onQueryTextChange(String p1) {
				idx = 0;
				return onQueryTextSubmit(p1);
			}
		};
		searchView.setOnQueryTextListener(query);
	}
	public void goToLine(SearchView searchView) {
		searchView.setInputType(InputType.TYPE_CLASS_NUMBER);
		SearchView.OnQueryTextListener query = new SearchView.OnQueryTextListener(){
			int idx=0;
			@Override
			public boolean onQueryTextSubmit(String p1) {
				return false;
			}
			@Override
			public boolean onQueryTextChange(String p1) {
				if (p1.length() > 0) {
					int line = Integer.parseInt(p1);
					goToLine(line);
				}
				return true;
			}
		};
		searchView.setOnQueryTextListener(query);
	}
	private int findNext(String kw, int idx) {
		LinearSearchStrategy finder = new LinearSearchStrategy(getLexTask().getLanguage());
		if (kw.isEmpty()) {
			selectText(false);
			return 0;
		}
		int len = kw.length();
		idx = finder.find(createDocumentProvider(), kw, idx, createDocumentProvider().length(), false, false);
		if (idx == -1) {
			selectText(false);
			return 0;
		}
		setSelection(idx, len);
		idx += len;
		moveCaret(idx);
		return idx;
	}
	public void undo() {
		DocumentProvider doc = createDocumentProvider();
		int newPosition = doc.undo();
		if (newPosition >= 0) {
			setEdited(true);
			respan();
			selectText(false);
			moveCaret(newPosition);
			//invalidate();
		}
	}
	public void redo() {
		DocumentProvider doc = createDocumentProvider();
		int newPosition = doc.redo();
		if (newPosition >= 0) {
			setEdited(true);
			respan();
			selectText(false);
			moveCaret(newPosition);
			//invalidate();
		}
	}

	@Override
	public void setEdited(boolean set) {
		super.setEdited(set);
		if (listener != null)
			listener.onEditStateChanged();
	}
	public void setOnEditStateChangedListener(OnEditStateChangedListener listener) {
		this.listener = listener;
	}
	public interface OnEditStateChangedListener {
		void onEditStateChanged();
	}
}
