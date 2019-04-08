package com.a4455jkjh.apktool.view;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.a4455jkjh.apktool.R;
import java.util.LinkedList;
import java.util.List;
import android.widget.Adapter;

public class TreeListAdapter<T> extends BaseAdapter implements AdapterView.OnItemClickListener{
	private final List<TreeNode<T>> allNodes;
	private final Context c;
	private TreeAdapter<T> adapter;
	private final TreeNode<T> root;
	private final float padding;
	private int maxDepth = 0;
	public TreeListAdapter(Context c) {
		this.c = c;
		padding = c.getResources().getDimension(R.dimen.one_sp) * 37.0f;
		allNodes = new LinkedList<>();
		root = new TreeNode<>(-1, this);
	}

	public void setAdapter(TreeAdapter<T> adapter) {
		this.adapter = adapter;
		adapter.init(this);
		root.initWithTreeAdapter(adapter.getRoot(), adapter);
		refresh();
	}

	@Override
	public void onItemClick(AdapterView<?> p1, View p2, int p3, long p4) {
		allNodes.get(p3).onClick(adapter, p2.findViewById(R.id.icon));
	}

	@Override
	public void notifyDataSetChanged() {
		root.initWithTreeAdapter(adapter.getRoot(), adapter);
		refresh();
	}

	public void refresh() {
		allNodes.clear();
		root.addChilds(allNodes, adapter);
		int d = 0;
		for (TreeNode n : allNodes)
			d = Math.max(d, n.getDepth());
		maxDepth = d;
		super.notifyDataSetChanged();
	}
	public int getMaxPadding() {
		return (int)(padding * maxDepth);
	}
	public TreeAdapter<T> getAdapter() {
		return adapter;
	}
	@Override
	public int getCount() {
		return allNodes.size();
	}

	@Override
	public Object getItem(int p1) {
		return allNodes.get(p1);
	}

	@Override
	public long getItemId(int p1) {
		return p1;
	}

	@Override
	public View getView(int p1, View p2, ViewGroup p3) {
		TreeNode<T> node = allNodes.get(p1);
		T t = node.getT();
		if (p2 == null)
			p2 = LayoutInflater.from(c).
				inflate(R.layout.tree_entry, p3, false);
		p2.setPadding((int)(padding * node.getDepth()), 0, 0, 0);
		ImageView state = p2.findViewById(R.id.expand_state);
		ImageView icon = p2.findViewById(R.id.icon);
		TextView name = p2.findViewById(R.id.name);
		node.setSrate(state, adapter);
		adapter.bindView(name, icon, t);
		return p2;
	}

}
