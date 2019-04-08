package com.a4455jkjh.apktool.service;

import android.util.Log;
import com.a4455jkjh.apktool.fragment.editor.EditorPagerAdapter;
import com.a4455jkjh.apktool.fragment.files.ErrorTree;
import com.a4455jkjh.apktool.lexer.Packages;
import com.a4455jkjh.apktool.util.Settings;
import jadx.core.utils.Function;
import jadx.core.utils.MapUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

public class Project {
	private String projectPath;
	private final ExecutorService threadPool;
	private final NotificationManager service;
	private boolean stopAnalysis = false;
	private final Map<String, FileItem> files;
	private final File cacheDir;

	public Project(NotificationManager service, File cacheDir) {
		this.cacheDir = new File(cacheDir, "cache");
		this.cacheDir.mkdirs();
		this.service = service;
		files = new HashMap<>();
		threadPool = Executors.newFixedThreadPool(5);
		setProjectPath("");
	}

	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
		parse();
	}

	private void parse() {
		stopAnalysis = true;
		threadPool.execute(parseAll);
	}

	public String getProjectPath() {
		return projectPath;
	}
	public boolean isPath(String path) {
		return projectPath.equals(path);
	}
	public synchronized FileItem getItem(File f) {
		if (f.getAbsolutePath().startsWith(projectPath))
			return MapUtils.computeIfAbsent(
				files, f.getAbsolutePath(), new Function<String, FileItem>(){
					@Override
					public FileItem apply(String f) {
						return new FileItem(f);
					}
				});
		return null;
	}
	private final Runnable parseAll = new Runnable(){
		@Override
		public synchronized void run() {
			stopAnalysis = false;
			files.clear();
			EditorPagerAdapter.INSTANCE.resetError();
			String projectPath = Project.this.projectPath;
			Log.i("APKTOOL Analysis", projectPath);
			service.notify("Find fields and methods", projectPath);
			File f = new File(projectPath);
			List<Future<Object>> tasks = new LinkedList<>();
			if (!Packages.load(cacheDir, projectPath)) {
				if (!f.exists())
					return;
				if (!f.isDirectory())
					return;
				files.clear();
				Packages.reset();
				for (File dir : f.listFiles()) {
					if (stopAnalysis)
						return;
					if (dir.isDirectory() && dir.getName().startsWith("smali"))
						parse(dir, 0, tasks);
				}
				get(tasks);
				if (stopAnalysis)
					return;
				Packages.save(cacheDir, projectPath);
				Packages.done();
			}
			service.notify("Analysis code", "Analysis all fields and methods");
			for (File dir : f.listFiles()) {
				if (stopAnalysis)
					return;
				if (dir.isDirectory() && dir.getName().startsWith("smali"))
					parse(dir, 1, tasks);
			}
			get(tasks);
			if (stopAnalysis)
				return;
			service.notify("Analysis", "Parsing Done");
			EditorPagerAdapter.INSTANCE.resetError();
		}

		private void get(List<Future<Object>> tasks) {
			Iterator<Future<Object>> it = tasks.iterator();
			while (it.hasNext()) {
				get(it.next());
				it.remove();
			}
		}

		private void get(Future<Object> next) {
			if (stopAnalysis) {
				next.cancel(false);
				return;
			}
			for (;;)
				try {
					next.get();
					break;
				} catch (InterruptedException e) {
					continue;
				} catch (ExecutionException e) {
					break;
				}
		}
	};
	protected void parse(final File f, final int state, List<Future<Object>> tasks) {
		if (f.isDirectory()) {
			for (File f1 : f.listFiles())
				parse(f1, state, tasks);
			return;
		}
		if (!f.getName().endsWith(".smali"))
			return;
		tasks.add(threadPool.submit(
					  new Callable<Object>(){
						  @Override
						  public Object call() throws Exception {
							  FileItem item = getItem(f);
							  Parser.parse(item, state, Settings.analysis_all_smali);
							  return null;
						  }
					  }));
	}
	public synchronized void addErrors(final ErrorTree root) {
		for (ErrorTree error : files.values()) {
			if (error.getChildCount() > 0)
				root.addChild(error);
		}
	}
}
