package com.a4455jkjh.apktool;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.fragment.EditorFragment;
import com.a4455jkjh.apktool.fragment.FilesFragment;
import com.a4455jkjh.apktool.fragment.editor.EditorPagerAdapter;
import com.a4455jkjh.apktool.util.Settings;

public class MainActivity extends ThemedActivity implements DrawerLayout.DrawerListener {
	private DrawerLayout drawer;
	private EditorFragment editor;
	private FilesFragment files;

	public boolean dismissFiles() {
		if (drawer.isDrawerOpen(Gravity.LEFT)) {
			drawer.closeDrawer(Gravity.LEFT);
			return true;
		}
		return false;
	}

	public void showFiles(int idx) {
		files.setPage(idx);
		drawer.openDrawer(Gravity.LEFT);
	}
    @Override
    protected void init(Bundle savedInstanceState) {
        setContentView(R.layout.main);
		drawer = findViewById(R.id.drawer);
		drawer.addDrawerListener(this);
		getActionBar().setDisplayOptions(16);
		getActionBar().setCustomView(R.layout.title);
		init(getSupportFragmentManager());
    }
	public void init() {
		onNewIntent(getIntent());
	}

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		Uri data = intent.getData();
		if (data == null)
			return;
		editor.open(data);
		dismissFiles();
	}

	private void init(FragmentManager supportFragmentManager) {
		Fragment fragment = supportFragmentManager.findFragmentById(R.id.editor);
		FilesFragment files;
		if (fragment == null) {
			EditorFragment editor = new EditorFragment();
			files = new FilesFragment();
			supportFragmentManager.beginTransaction().
				add(R.id.editor, editor).
				add(R.id.leftView, files).
				commit();
			this.editor = editor;
		} else {
			editor = (EditorFragment) fragment;
			files = (FilesFragment) supportFragmentManager.findFragmentById(R.id.leftView);
		}
		files.bind(editor);
		this.files = files;
	}
	private long lastClicked = 0l;

	@Override
	public void onBackPressed() {
		if (dismissFiles() || editor.collapseItem())
			return;
		long curClick = System.currentTimeMillis();
		if (curClick - lastClicked > 2000) {
			Toast.makeText(this, R.string.click_once_more, 0).show();
			lastClicked = curClick;
			return;
		}
		checkExit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.exit:
				checkExit();
				break;
			case R.id.settings:
				Intent i = new Intent(this, SettingActivity.class);
				startActivity(i);
				break;
			default:
				return false;
		}
		return true;
	}

	private void checkExit() {
		if (editor.hasUnSavedEditor())
			showSaveDialog();
		else
			finish();
	}

	@Override
	protected void onResume() {
		super.onResume();
		if (Settings.isFontSizeChanged) {
			Settings.isFontSizeChanged = false;
			EditorPagerAdapter.INSTANCE.setFontSize();
		}
	}

	@Override
	public void finish() {
		EditorPagerAdapter.INSTANCE.exit();
		super.finish();
	}


	private void showSaveDialog() {
		DialogInterface.OnClickListener l = new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface p1, int p2) {
				if (p2 == DialogInterface.BUTTON_NEUTRAL)
					return;
				if (p2 == DialogInterface.BUTTON_POSITIVE)
					editor.save(true, false);
				finish();
			}
		};
		new AlertDialog.Builder(this).
			setTitle(R.string.save_file).
			setMessage(R.string.save_file_msg).
			setPositiveButton(R.string.yes, l).
			setNegativeButton(R.string.no, l).
			setNeutralButton(R.string.cancel, l).
			show();
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		changeLeft();
	}

	private void changeLeft() {
		View parent = drawer;
		View child = parent.findViewById(R.id.leftView);
		int width = parent.getWidth() / 5 * 4;
		ViewGroup.LayoutParams params = child.getLayoutParams();
		params.width = width;
		child.setLayoutParams(params);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		Toast.makeText(this, "config", 0).show();
		changeLeft();
	}

	@Override
	protected void onPause() {
		super.onPause();
		editor.save(true, false);
	}

	@Override
	public void onDrawerSlide(View p1, float p2) {
		// TODO: Implement this method
	}

	@Override
	public void onDrawerOpened(View p1) {
		files.focus();
		drawer.requestDisallowInterceptTouchEvent(false);
	}

	@Override
	public void onDrawerClosed(View p1) {
		editor.focus();
		drawer.requestDisallowInterceptTouchEvent(true);
	}

	@Override
	public void onDrawerStateChanged(int p1) {
		// TODO: Implement this method
	}

}
