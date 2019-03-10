package com.a4455jkjh.apktool.lexer;

import com.a4455jkjh.lexer.css3Lexer;
import com.a4455jkjh.lexer.css3Parser;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.Pair;
import java.util.List;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import static com.a4455jkjh.lexer.css3Lexer.*;

public class CssLexTask extends Antlr4LexTask<css3Lexer> {
	private css3Parser.StylesheetContext unit;
	private final css3Parser parser;
	public CssLexTask() {
		super(css3Lexer.VOCABULARY);
		parser = new css3Parser(null);
	}

	@Override
	protected void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, css3Lexer lexer) {
		unit=null;
		while (!abort) {
			Token token = lexer.nextToken();
			int tokenType = token.getType();
			if (tokenType == -1)
				break;
			ColorScheme.Colorable type;
			switch (tokenType) {
				case Comment:
					type = ColorScheme.Colorable.COMMENT;
					break;
				case LParen:
				case LBrace:
				case LBrack:
				case RParen:
				case RBrace:
				case Colon:
				case Comma:
				case Semi:
				case Dot:
				case UnderScroll:
					type = ColorScheme.Colorable.SEPARATOR;
					break;
				case Number:
				case String:
				case Uri:
				case Dimension:
				case Percentage:
				case Hash:
					type = ColorScheme.Colorable.LITERAL;
					break;
				case MediaOnly:
				case Not:
				case And:
				case PseudoNot:
				case Or:
				case FontFace:
				case Supports:
				case Keyframes:
				case From:
				case To:
				case Viewport:
				case CounterStyle:
				case FontFeatureValues:
				case Media:
				case Import:
				case Page:
				case Namespace:
				case Charset:
					type = ColorScheme.Colorable.KEYWORD;
					break;
				case Calc:
				case DxImageTransform:
				case Var:
				case Function:
					type = ColorScheme.Colorable.PACKAGE;
					break;
				case Plus:
				case Minus:
				case Greater:
				case Tilde:
				case PrefixMatch:
				case SuffixMatch:
				case SubstringMatch:
				case Star:
				case BitOr:
				case Cdo:
				case Cdc:
				case Includes:
				case DashMatch:
					type = ColorScheme.Colorable.OPERATOR;
					break;
				default:
					type = ColorScheme.Colorable.NAME;
					break;
			}
			Pair<ColorScheme.Colorable> pair = new Pair<ColorScheme.Colorable>(token.getStopIndex(), type);
			_tokens.add(pair);
		}
	}

	@Override
	protected void parse(css3Lexer lexer) {
		CommonTokenStream tks = new CommonTokenStream(lexer);
		parser.setTokenStream(tks);
		unit = parser.stylesheet();
	}

	@Override
	protected ParseTree getTree() {
		return unit;
	}

	@Override
	protected css3Lexer generateLexer() {
		return new css3Lexer(null);
	}


	
}
