package com.a4455jkjh.apktool.fragment.files;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.FilesFragment;
import com.a4455jkjh.apktool.view.TreeView;

public class ApplicationsPage {
	private final View view;
	private final PackageManager mPackageManager;
	private final CharSequence title;
	private TreeView<ErrorTree> apps;
	private ErrorsAdapter adapter;
	private final ApplicationItem installedApps;
	private final ApplicationItem systemApps;// = 
	public ApplicationsPage(Context context) {
		mPackageManager = context.getPackageManager();
		LayoutInflater inflater = LayoutInflater.from(context);
		view = inflater.inflate(
			R.layout.errors, null);
		title = context.getText(R.string.apps);
		apps = view.findViewById(R.id.errors);
		installedApps = new ApplicationItem(context.getText(R.string.apps_installed), false);
		systemApps = new ApplicationItem(context.getText(R.string.apps_system), true);
	}
	public void init(FilesFragment frag) {
		adapter = new ErrorsAdapter(){
			@Override
			public boolean shouldShowExpandDrawable() {
				return true;
			}
			
			@Override
			public void reset() {
				childs.clear();
				refreshApps();
				refresh();
			}
		};
		adapter.reset();
		adapter.addChild(installedApps);
		adapter.addChild(systemApps);
		apps.setAdapter(adapter);
	}
	public View getView() {
		return view;
	}

	public CharSequence getTitle() {
		return title;
	}
	protected void refreshApps() {
		ApplicationItem installedApps = this.installedApps;
		ApplicationItem systemApps = this.systemApps;
		installedApps.reset();
		systemApps.reset();
		PackageManager mPackageManager = this.mPackageManager;
		for (PackageInfo pkg: mPackageManager.getInstalledPackages(0)) {
			if (pkg.applicationInfo.sourceDir.startsWith("/data/"))
				installedApps.addApp(pkg, mPackageManager);
			else
				systemApps.addApp(pkg, mPackageManager);
		}
		installedApps.sort();
		systemApps.sort();
	}
}
