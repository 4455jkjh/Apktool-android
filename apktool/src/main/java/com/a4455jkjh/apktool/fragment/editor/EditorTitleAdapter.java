package com.a4455jkjh.apktool.fragment.editor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.EditorFragment;

public class EditorTitleAdapter extends BaseAdapter implements
ViewPager.OnAdapterChangeListener {

	@Override
	public void onAdapterChanged(ViewPager p1, PagerAdapter p2, PagerAdapter p3) {
		this.adapter = p3;
		if(p2!=null)
			p2.unregisterDataSetObserver(observer);
		if (p3 != null)
			p3.registerDataSetObserver(observer);
		notifyDataSetChanged();
	}
	@Override
	public int getCount() {
		if (adapter == null)
			return 0;
		return adapter.getCount();
	}

	@Override
	public Object getItem(int p1) {
		return adapter.getPageTitle(p1);
	}

	@Override
	public long getItemId(int p1) {
		return 0;
	}

	@Override
	public View getView(int p1, View p2, ViewGroup p3) {
		if (p2 == null)
			p2 = editor.getLayoutInflater().
				inflate(R.layout.title, p3, false);
		((TextView)p2.findViewById(R.id.name)).setText(adapter.getPageTitle(p1));
		return p2;
	}


	public EditorTitleAdapter(EditorFragment editor, ViewPager pager) {
		this.editor = editor;
		adapter = null;
		pager.addOnAdapterChangeListener(this);
	}
	private final DataSetObserver observer = new DataSetObserver(){
		@Override
		public void onChanged() {
			notifyDataSetChanged();
		}
		@Override
		public void onInvalidated() {
			notifyDataSetInvalidated();
		}
	};
	private final EditorFragment editor;
	private PagerAdapter adapter;
}
