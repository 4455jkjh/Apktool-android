package com.a4455jkjh.apktool.view;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.a4455jkjh.apktool.R;
import java.util.LinkedList;
import java.util.List;

public class TreeNode<T> {
	private T t;
	private final int depth;
	private final List<TreeNode<T>> childs;
	private int count = 0;
	private boolean isExpand;
	private TreeListAdapter content;
	public TreeNode(int depth, TreeListAdapter content) {
		this(null, depth, content);
	}
	public TreeNode(T t, int depth, TreeListAdapter content) {
		this.t = t;
		this.content = content;
		this.depth = depth;
		isExpand = false;
		childs = new LinkedList<>();
	}

	public T getT() {
		return t;
	}

	public int getDepth() {
		return depth;
	}

	public void onClick(TreeAdapter<T> adapter, View view) {
		if (count == 0 || !adapter.shouldShowExpandDrawable()) {
			adapter.onClick(t, view);
			return;
		}
		isExpand = !isExpand;
		content.refresh();
	}
	public void setSrate(ImageView state, TreeAdapter<T> adapter) {
		if (adapter.shouldShowExpandDrawable()) {
			state.setVisibility(View.VISIBLE);
			if (childs.size() == 0)
				state.setImageDrawable(null);
			else if (isExpand)
				state.setImageResource(R.drawable.collapse);
			else
				state.setImageResource(R.drawable.expand);
		} else {
			state.setVisibility(View.GONE);
		}
	}
	public void addChilds(List<TreeNode<T>> allNodes, TreeAdapter<T> adapter) {
		if (isExpand || !adapter.shouldShowExpandDrawable() || depth < 0) {
			List<TreeNode<T>> childs = this.childs;
			for (int i = 0; i < count; i++) {
				TreeNode<T> node = childs.get(i);
				allNodes.add(node);
				node.addChilds(allNodes, adapter);
			}
		}
	}
	public void initWithTreeAdapter(T t, TreeAdapter<T> adapter) {
		this.t = t;
		int count = adapter.getChildCount(t);
		for (int i=0;i < count;i++)
			get(i).initWithTreeAdapter(adapter.getChild(t, i), adapter);
		this.count = count;
	}
	private TreeNode<T> get(int idx) {
		TreeNode<T> node;
		if (idx >= childs.size()) {
			node = new TreeNode<T>(depth + 1, content);
			childs.add(node);
		} else {
			node = childs.get(idx);
		}

		return node;
	}
}
