package com.a4455jkjh.apktool.lexer;

import android.util.Log;
import com.a4455jkjh.apktool.service.FileItem;
import com.a4455jkjh.lexer.XMLLexer;
import com.a4455jkjh.lexer.XMLParser;
import com.a4455jkjh.lexer.XMLParser.AttributeContext;
import com.a4455jkjh.lexer.XMLParserBaseVisitor;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.IndentStringBuilder;
import com.myopicmobile.textwarrior.common.Language;
import com.myopicmobile.textwarrior.common.Pair;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import static com.a4455jkjh.lexer.XMLLexer.*;

public class XmlLexTask extends Antlr4LexTask <XMLLexer>{
	protected final XMLParser parser;
	private final XMLLexer lexer;
	protected XMLParser.DocumentContext document;

	private FileItem item;
	public XmlLexTask(FileItem item) {
		super(XMLLexer.VOCABULARY);
		this.item = item;
		parser = new XMLParser(null);
		lexer = new XMLLexer(null);
		if (item != null) {
			parser.removeErrorListeners();
			parser.addErrorListener(item);
		}
		document = null;
	}

	@Override
	protected ParseTree getTree() {
		return document;
	}

	@Override
	protected XMLLexer generateLexer() {
		XMLLexer xMLLexer = new XMLLexer(null);
		if (item != null) {
			xMLLexer.removeErrorListeners();
			xMLLexer.addErrorListener(item);
		}
		return xMLLexer;
	}
	@Override
	protected void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, XMLLexer lexer) {
		int lastType = 0;
		document=null;
		while (!abort) {
			Token token = lexer.nextToken();
			int tokenType = token.getType();
			if (tokenType == EOF)
				break;
			ColorScheme.Colorable type;
			switch (tokenType) {
				case XMLDeclOpen:
					parse(lexer, SPECIAL_CLOSE);
				case DTD:
					type = ColorScheme.Colorable.PACKAGE;
					break;
				case COMMENT:
					type = ColorScheme.Colorable.COMMENT;
					break;
				case OPEN:
				case CLOSE:
				case SLASH_CLOSE:
				case SLASH:
					type = ColorScheme.Colorable.SEPARATOR;
					break;
				case Name:
					if (lastType == OPEN || lastType == SLASH)
						type = ColorScheme.Colorable.KEYWORD;
					else
						type = ColorScheme.Colorable.TYPE;
					break;
				case STRING:
					type = ColorScheme.Colorable.LITERAL;
					break;
				case EQUALS:
					type = ColorScheme.Colorable.OPERATOR;
					break;
				default:
					type = ColorScheme.Colorable.NAME;
					break;
			}
			lastType = tokenType;
			Pair<ColorScheme.Colorable> pair = new Pair<ColorScheme.Colorable>(token.getStopIndex(), type);
			_tokens.add(pair);
		}
	}

	@Override
	protected void parse(XMLLexer lexer) {
		Log.i("APKTOOL PARSE", "parse xml");
		item.reset();
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		parser.setTokenStream(tokens);
		document = parser.document();
	}

	@Override
	protected boolean canAnalysis() {
		return item != null;
	}


	@Override
	public boolean canFormat() {
		return true;
	}

	@Override
	protected void parse(ANTLRInputStream i) {
		lexer.setInputStream(i);
		parse(lexer);
	}
	

	@Override
	public boolean isError(int index) {
		FileItem item = this.item;
		if(item==null)
			return false;
		return item.isError(index);
	}
	protected void parse(XMLLexer lexer, int endType) {
		while (true) {
			if (lexer.nextToken().getType() == endType)
				break;
		}
	}

	@Override
	protected int format(IndentStringBuilder sb, XMLLexer lexer, int width, int curPos) {
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		parser.setTokenStream(tokens);
		XMLFormatter f = new XMLFormatter(sb, width, curPos);
		parser.document().accept(f);
		return f.newPos;
	}
	private static class LanguageXml extends  Language {
		LanguageXml() {
			setKeywords(new String[0]);
		}
	}
	private class XMLFormatter extends XMLParserBaseVisitor<Void> {
		private IndentStringBuilder sb;
		private int width;
		private int curPos;
		private boolean shouldNewLine = false;
		int newPos;

		public XMLFormatter(IndentStringBuilder sb, int width, int curPos) {
			this.sb = sb;
			this.width = width;
			this.curPos = curPos;
			newPos = curPos;
		}

		@Override
		public Void visitElement(XMLParser.ElementContext ctx) {
			sb.append('<');
			sb.indent(width);
			ctx.Name(0).accept(this);
			List<AttributeContext> attrs = ctx.attribute();
			shouldNewLine = attrs.size() > 1;
			for (AttributeContext attr : attrs)
				attr.accept(this);
			XMLParser.ContentContext content = ctx.content();
			if (content == null) {
				sb.append("/>");
				sb.deindent(width);
			} else {
				sb.append('>');
				content.accept(this);
				sb.deindent(width);
				sb.append("</");
				visitTerminal(ctx.Name(1));
				//ctx.Name(1).accept(this);
				sb.append('>');
			}
			return null;
		}

		@Override
		public Void visitAttribute(XMLParser.AttributeContext ctx) {
			sb.append(shouldNewLine ?'\n': ' ');
			ctx.Name().accept(this);
			sb.append('=');
			ctx.STRING().accept(this);
			return null;
		}

		@Override
		public Void visitTerminal(TerminalNode node) {
			if(node==null)
				return null;
			Token token = node.getSymbol();
			String text = token.getText();
			int type = token.getType();
			switch (type) {
				case SEA_WS:
					SmaliFormater.processWhiteSpace(sb, text);
					break;
				case SPECIAL_CLOSE:
					sb.append(' ');
					sb.append(text);
					break;
				default:
					sb.append(text);
					break;
			}
			int start = token.getStartIndex();
			int end = token.getStopIndex();
			newPos = compute(sb.length(), start, end, curPos, newPos);
			return null;
		}
	}
	
}
