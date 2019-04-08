package com.a4455jkjh.apktool.fragment.files;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.a4455jkjh.apktool.fragment.FilesFragment;

public interface Item extends Comparable<Item> {
	void setup(ImageView icon, TextView name);
	boolean click(View view, Refreshable refresh);
	boolean longClick(View view, Refreshable refresh);
	void process(FilesAdapter adapter);
	boolean edit(FilesFragment frag);
	int getProperty();
	int PROPERTY_FILE = 0;
	int PROPERTY_BUILD = -1;
}
