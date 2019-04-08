package com.a4455jkjh.apktool.service;

import android.view.View;
import android.widget.ImageView;
import com.a4455jkjh.apktool.fragment.files.ErrorTree;
import java.io.File;
import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Pair;
import com.myopicmobile.textwarrior.common.DocumentProvider;
import java.util.List;
import com.myopicmobile.textwarrior.common.ColorScheme;

public class FileItem extends ErrorTree implements ANTLRErrorListener {
	private final File file;

	public FileItem(String file) {
		this(new File(file));
	}
	public FileItem(File file) {
		super("");
		this.file = file;
	}
	@Override
	public String getMessage() {
		return file.getName();
	}
	public boolean isError(int index) {
		synchronized (childs) {
			for (ErrorTree e : childs) {
				child c = (FileItem.child) e;
				if (index >= c.start && index <= c.stop)
					return true;
			}
		}
		return false;
	}
	public File getFile() {
		return file;
	}

	@Override
	public void setIcon(ImageView icon) {
		com.a4455jkjh.apktool.fragment.files.FileItem.Icon.SMALI.set(icon);
	}

	@Override
	public void click(View view) {
		editor.open(file);
	}

	@Override
	public void addChild(ErrorTree child) {
		if (!(child instanceof FileItem.child)) {
			throw new RuntimeException("FileItem only can add FileItem.child!");
		}
		super.addChild(child);
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
							final Object offendingSymbol,
							int line,
							int charPositionInLine,
							final String msg,
							RecognitionException e) {
		addChild(new child(msg, offendingSymbol));
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer,
											DFA dfa,
											int startIndex,
											int stopIndex,
											BitSet conflictingAlts,
											ATNConfigSet configs) {
		// TODO: Implement this method
	}

	@Override
	public void reportContextSensitivity(Parser recognizer,
										 DFA dfa,
										 int startIndex,
										 int stopIndex,
										 int prediction,
										 ATNConfigSet configs) {
		// TODO: Implement this method
	}

	@Override
	public void reportAmbiguity(Parser recognizer,
								DFA dfa,
								int startIndex,
								int stopIndex,
								boolean exact,
								BitSet ambigAlts,
								ATNConfigSet configs) {
		// TODO: Implement this method
	}
	private class child extends ErrorTree {
		final int start, stop;
		child(CharSequence msg, final Object symbol) {
			super(msg);
			if (symbol instanceof Token) {
				Token tk = (Token) symbol;
				start = tk.getStartIndex();
				stop = tk.getStopIndex();
			} else if (symbol instanceof Pair) {
				Pair<Integer,Integer> ctx = (Pair<Integer,Integer>) symbol;
				start = ctx.a.intValue();
				stop = ctx.b.intValue();
			} else if (symbol instanceof ParserRuleContext) {
				ParserRuleContext ctx = (ParserRuleContext) symbol;
				start = ctx.start.getStartIndex();
				stop = ctx.stop.getStopIndex();
			} else {
				start = 0;
				stop = 0;
			}
		}

		@Override
		public void click(View view) {
			editor.open(file, start, stop);
		}

		@Override
		public void setIcon(ImageView icon) {
			icon.setImageResource(android.R.drawable.ic_delete);
		}

	}
}
