package com.a4455jkjh.apktool.lexer;

import com.a4455jkjh.lexer.JSONLexer;
import com.a4455jkjh.lexer.JSONParser;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.IndentStringBuilder;
import com.myopicmobile.textwarrior.common.Pair;
import java.util.List;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import static com.a4455jkjh.lexer.JSONLexer.*;

public class JsonLexTask extends Antlr4LexTask<JSONLexer>{
	private final JSONParser parser;
	private JSONParser.JsonContext json;
	public JsonLexTask() {
		super(new NormalLanguage());
		parser = new JSONParser(null);
		json = null;
	}

	@Override
	protected JSONLexer generateLexer() {
		return new JSONLexer(null);
	}
	
	@Override
	protected void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, JSONLexer lexer)  {
		boolean key = false;
		boolean isArray = false;
		json=null;
		while (!abort) {
			Token token = lexer.nextToken();
			int tokenType = token.getType();
			if (tokenType == -1)
				break;
			ColorScheme.Colorable type;
			switch (tokenType) {
				case LBRACE:
				case COMMA:
					key = true;
					type = ColorScheme.Colorable.SEPARATOR;
					break;
				case LBRACK:
					isArray = true;
					type = ColorScheme.Colorable.SEPARATOR;
					break;
				case RBRACE:
				case RBRACK:
				case COLON:
					isArray = false;
					key = false;
					type = ColorScheme.Colorable.SEPARATOR;
					break;
				case TRUE:
				case FALSE:
				case NULL:
				case NUMBER:
					type = ColorScheme.Colorable.LITERAL;
					break;
				case STRING:
					if (key && !isArray)
						type = ColorScheme.Colorable.KEYWORD;
					else
						type = ColorScheme.Colorable.LITERAL;
					break;
				default:
					type = ColorScheme.Colorable.NAME;
					break;
			}
			int end = token.getStopIndex();
			Pair<ColorScheme.Colorable> pair = new Pair<ColorScheme.Colorable>(end, type);
			_tokens.add(pair);
		}
	}

	@Override
	protected void parse(JSONLexer lexer) {
		CommonTokenStream tks = new CommonTokenStream(lexer);
		parser.setTokenStream(tks);
		json = parser.json();
	}


	@Override
	public boolean canFormat() {
		return true;
	}

	@Override
	protected int format(IndentStringBuilder sb, JSONLexer lexer, int width, int curPos) {
		int newPos = -1;
		int start = -1;
		while (true) {
			CommonToken token = (CommonToken) lexer.nextToken();
			int tokenType = token.getType();
			if (tokenType == -1)
				break;
			switch (tokenType) {
				case LBRACE:
					sb.indent(width);
					sb.append("{\n");
					break;
				case COMMA:
					sb.append(",\n");
					break;
				case LBRACK:
					sb.indent(width);
					sb.append("[\n");
					break;
				case RBRACE:
					sb.deindent(width);
					sb.append("\n}");
					break;
				case RBRACK:
					sb.deindent(width);
					sb.append("]");
					break;
				case COLON:
					sb.append(" : ");
					break;
				case WS:
					break;
				default:
					sb.append(token.getText());
					break;
			}
			int end = token.getStopIndex();
			newPos = Antlr4LexTask.compute(sb.length(), start, end, curPos, newPos);
			start = end;
		}
		
		return newPos;
	}

	@Override
	protected ParseTree getTree() {
		return json;
	}

}
