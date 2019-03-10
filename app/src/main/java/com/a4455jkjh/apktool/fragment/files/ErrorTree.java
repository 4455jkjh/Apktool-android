package com.a4455jkjh.apktool.fragment.files;

import android.view.View;
import android.widget.ImageView;
import com.a4455jkjh.apktool.fragment.EditorFragment;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class ErrorTree implements Comparable<ErrorTree> {
	private final CharSequence msg;

	protected EditorFragment editor;
	protected final List<ErrorTree> childs;


	public ErrorTree(CharSequence msg) {
		this.msg = msg;
		childs = new LinkedList<>();
	}
	public synchronized void setEditor(EditorFragment editor) {
		this.editor = editor;
		for (ErrorTree e : childs) {
			e.setEditor(editor);
		}
	}
	public CharSequence getMessage() {return msg;}
	public ErrorTree getChild(int idx) {return childs.get(idx);}
	public int getChildCount() {return childs.size();}
	public void click(View view) {}
	public synchronized void addChild(ErrorTree child) {
		childs.add(child);
		child.setEditor(editor);
	}
	public void reset() {childs.clear();}
	public void setIcon(ImageView icon) {}
	public void sort(){
		Collections.sort(childs);
	}

	@Override
	public int compareTo(ErrorTree p1) {
		return msg.toString().toLowerCase().compareTo(
			p1.msg.toString().toLowerCase());
	}

}
