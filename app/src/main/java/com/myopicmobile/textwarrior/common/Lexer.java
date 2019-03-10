/*
 * Copyright (c) 2013 Tah Wei Hoon.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License Version 2.0,
 * with full text available at http://www.apache.org/licenses/LICENSE-2.0.html
 *
 * This software is provided "as is". Use at your own risk.
 */
package com.myopicmobile.textwarrior.common;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import android.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Does lexical analysis of a text for C-like languages.
 * The programming language syntax used is set as a static class variable.
 */
public class Lexer {
	private final static int MAX_KEYWORD_LENGTH = 127;

	public final static int UNKNOWN = -1;
	public final static int NORMAL = 0;
	public final static int KEYWORD = 1;
	public final static int OPERATOR = 2;
	public final static int NAME = 3;
	public final static int LITERAL = 4;
	public final static int COMMENT = 5;
	public final static int SEPARATOR = 6;
	public final static int PACKAGE = 7;
	private static final ExecutorService mExecutorService;

	static{
		mExecutorService = Executors.newSingleThreadExecutor();
	}

	private String text;
	private LexTask _workerTask;
	private final LexCallback _callback;

	public Lexer(LexCallback callback, LexTask task) {
		task.setLexer(this);
		_callback = callback;
		this._workerTask = task;
	}

	public void setWorkerTask(LexTask workerTask) {
		_workerTask = workerTask;
		workerTask.setLexer(this);
	}

	public void tokenize(DocumentProvider hDoc) {
		LexTask _workerTask = this._workerTask;
		if (!_workerTask.getLanguage().isProgLang()) {
			return;
		}

		//tokenize will modify the state of hDoc; make a copy
		setDocument(new DocumentProvider(hDoc));
		if (_workerTask.isRun())
			_workerTask.abort();
			mExecutorService.execute(_workerTask);
	}

	void tokenizeDone(List<Pair<ColorScheme.Colorable>> result) {
		if (_callback != null) {
			_callback.lexDone(result);
		}
	}

	public void cancelTokenize() {
		if (_workerTask != null) {
			_workerTask.abort();
		}
	}

	public synchronized void setDocument(DocumentProvider hDoc) {
		text = hDoc.toString();
	}

	public synchronized String getText() {
		return text;
	}


//end inner class

	public interface LexCallback {
		public void lexDone(List<Pair<ColorScheme.Colorable>> results);
	}
}
