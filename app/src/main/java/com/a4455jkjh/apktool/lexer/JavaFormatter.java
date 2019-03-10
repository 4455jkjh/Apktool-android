package com.a4455jkjh.apktool.lexer;
import com.a4455jkjh.lexer.JavaParser;
import com.a4455jkjh.lexer.JavaParserBaseVisitor;
import com.myopicmobile.textwarrior.common.IndentStringBuilder;
import java.util.List;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JavaFormatter extends JavaParserBaseVisitor<Object> {
	private static final ThreadLocal<JavaFormatter> formatters = new ThreadLocal<>();
	private static JavaFormatter getInstance(CommonTokenStream t, IndentStringBuilder s, int w) {
		JavaFormatter f = formatters.get();
		if (f == null) {
			f = new JavaFormatter();
			formatters.set(f);
		}
		f.tokens = t;
		f.sb = s;
		f.width = w;
		return f;
	}
	public static void format(CommonTokenStream tokens, IndentStringBuilder sb, int width, JavaParser.CompilationUnitContext unit) {
		unit.accept(getInstance(tokens, sb, width));
	}
	private CommonTokenStream tokens;
	private IndentStringBuilder sb;
	private int width;
	private JavaFormatter() {}

	private void writeComment(Token tk) {
		List<Token> left = tokens.getHiddenTokensToLeft(tk.getTokenIndex());
		if (left != null) {
			for (Token t : left) {
				int type = t.getType();
				if (type == JavaParser.LINE_COMMENT) {
					sb.append(t.getText());
					sb.append('\n');
				} else if (type == JavaParser.COMMENT) {
					sb.append(t.getText());
					sb.append('\n');
				}
			}
		}
	}
	@Override
	public Object visitCompilationUnit(JavaParser.CompilationUnitContext ctx) {

		return super.visitCompilationUnit(ctx);
	}

	@Override
	public Object visitTerminal(TerminalNode node) {

		return super.visitTerminal(node);
	}

}
