package com.a4455jkjh.apktool.lexer;

import com.a4455jkjh.apktool.fragment.editor.EditorPagerAdapter;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.IndentStringBuilder;
import com.myopicmobile.textwarrior.common.Language;
import com.myopicmobile.textwarrior.common.LexTask;
import com.myopicmobile.textwarrior.common.Pair;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public abstract class Antlr4LexTask<L extends Lexer> extends LexTask {
	private final L lexer;
	private static final ExecutorService analysis;
	protected Antlr4LexTask(Vocabulary tokens) {
		this(new Antlr4Lanugage(tokens));
	}
	protected boolean canAnalysis() {
		return false;
	}
	protected abstract L generateLexer();
	protected Antlr4LexTask(Language language) {
		super(language);
		lexer = generateLexer();
	}
	@Override
	protected final synchronized void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, String text) {
		final ANTLRInputStream in = new ANTLRInputStream(text);
		L lexer = this.lexer;
		lexer.setInputStream(in);
		tokenize(_tokens, lexer);
		if (canAnalysis()) {
			in.reset();
			stopLast();
			analysis.execute(new Runnable(){
					@Override
					public void run() {
						parse(in);
						EditorPagerAdapter.INSTANCE.resetError();
					}
				});
		}
	}
	protected void parse(ANTLRInputStream i) {}
	protected void stopLast() {
		// TODO: Implement this method
	}

	protected abstract void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, L in);

	public static class Antlr4Lanugage extends Language {
		Antlr4Lanugage(Vocabulary tokens) {
			setKeywords(LexerUtil.getKeywords(tokens));
		}
	}

	@Override
	public synchronized int format(IndentStringBuilder sb, CharSequence input, int width, int curPos) {
		lexer.setInputStream(new ANTLRInputStream(input.toString()));
		return format(sb, lexer, width, curPos);
	}

	protected int format(IndentStringBuilder sb, L lexer, int width, int curPos) {
		return curPos;
	}

	@Override
	public LexTask.Selection expandSelection(String text, int oldStart, int oldEnd) {
		ParseTree tree = getTree();
		if (tree == null) {
			L lexer = this.lexer;
			lexer.reset();
			parse(lexer);
			tree = getTree();
		}
		Selection s = null;
		if (tree != null)
			s = expandSelection(tree, oldStart, oldEnd - 1);
		if (s == null)
			return super.expandSelection(text, oldStart, oldEnd);
		return  s;
	}
	protected abstract void parse(L lexer);
	protected ParseTree getTree() {
		return null;
	}
	private Selection expandSelection(ParseTree tree, int oldStart, int oldEnd) {
		if (tree instanceof TerminalNode) {//只包含一个Token
			TerminalNode node = (TerminalNode) tree;
			Token tk = node.getSymbol();
			int start = tk.getStartIndex();
			int end = tk.getStopIndex();
			return expandSelection(oldStart, oldEnd, start, end);
		} else {
			ParserRuleContext ctx = (ParserRuleContext)tree;
			int start = ctx.start.getStartIndex();
			int end = ctx.stop.getStopIndex();
			if (oldStart >= start && oldEnd <= end) {
				//当前选择位置在这个节点内
				if (oldStart == start && oldEnd == end)
					return null;
				int count = ctx.getChildCount();
				//遍历子节点
				for (int i = 0; i < count; i++) {
					ParseTree tree1 = ctx.getChild(i);
					Selection selection = expandSelection(tree1, oldStart, oldEnd);
					//当前子节点不符合
					if (selection == null)
						continue;
					//符合
					return selection;
				}
				return expandSelection(oldStart, oldEnd, start, end);
			}
		}
		return null;
	}

	private LexTask.Selection expandSelection(int oldStart, int oldEnd, int start, int end) {
		if (oldStart >= start && oldEnd <= end) {
			if (oldStart == start && oldEnd == end)
				return null;
			return new Selection(start, end + 1);
		}
		return null;
	}
	public static int compute(int max, int s, int e, int c, int n) {
		if (e < c)
			n = max + 1;
		else if (c >= s && c <= e) {
			n = max - e + c;
			int s1 = max - e + s;
			if (n < s1)
				n = s1;
			n++;
		}
		return n;
	}
	static{
		analysis = Executors.newSingleThreadExecutor();
	}
}
