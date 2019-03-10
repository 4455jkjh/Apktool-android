package com.a4455jkjh.apktool.lexer;

import com.a4455jkjh.lexer.JavaScriptLexer;
import com.a4455jkjh.lexer.JavaScriptParser;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.Pair;
import java.util.List;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import static com.a4455jkjh.lexer.JavaScriptLexer.*;

public class JavascriptLexTask extends Antlr4LexTask<JavaScriptLexer> {
	private JavaScriptParser.ProgramContext program;
	private final JavaScriptParser parser;
	public JavascriptLexTask() {
		super(JavaScriptLexer.VOCABULARY);
		parser = new JavaScriptParser(null);
	}

	@Override
	protected JavaScriptLexer generateLexer() {
		return new JavaScriptLexer(null);
	}

	@Override
	protected void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, JavaScriptLexer lexer) {
		program=null;
		while (!abort) {
			Token token = lexer.nextToken();
			int tokenType = token.getType();
			if (tokenType == -1)
				break;
			ColorScheme.Colorable type;
			switch (tokenType) {
				case MultiLineComment:
				case SingleLineComment:
				case HtmlComment:
				case CDataComment:
					type = ColorScheme.Colorable.COMMENT;
					break;
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case CloseBracket:
				case CloseParen:
				case CloseBrace:
				case SemiColon:
				case Comma:
					type = ColorScheme.Colorable.SEPARATOR;
					break;
				case Assign:
				case QuestionMark:
				case Colon:
				case Ellipsis:
				case Dot:
				case PlusPlus:
				case MinusMinus:
				case Plus:
				case Minus:
				case BitNot:
				case Not:
				case Multiply:
				case Divide:
				case Modulus:
				case RightShiftArithmetic:
				case LeftShiftArithmetic:
				case RightShiftLogical:
				case LessThan:
				case MoreThan:
				case LessThanEquals:
				case GreaterThanEquals:
				case Equals_:
				case NotEquals:
				case IdentityEquals:
				case IdentityNotEquals:
				case BitAnd:
				case BitXOr:
				case BitOr:
				case And:
				case Or:
				case MultiplyAssign:
				case DivideAssign:
				case ModulusAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftArithmeticAssign:
				case RightShiftArithmeticAssign:
				case RightShiftLogicalAssign:
				case BitAndAssign:
				case BitXorAssign:
				case BitOrAssign:
				case ARROW:
					type = ColorScheme.Colorable.OPERATOR;
					break;
				case NullLiteral:
				case BooleanLiteral:
				case DecimalLiteral:
				case HexIntegerLiteral:
				case OctalIntegerLiteral:
				case OctalIntegerLiteral2:
				case BinaryIntegerLiteral:
				case StringLiteral:
				case TemplateStringLiteral:
					type = ColorScheme.Colorable.LITERAL;
					break;
				case Break:
				case Do:
				case Instanceof:
				case Typeof:
				case Case:
				case Else:
				case New:
				case Var:
				case Catch:
				case Finally:
				case Return:
				case Void:
				case Continue:
				case For:
				case Switch:
				case While:
				case Debugger:
				case Function:
				case This:
				case With:
				case Default:
				case If:
				case Throw:
				case Delete:
				case In:
				case Try:
				case Class:
				case Enum:
				case Extends:
				case Super:
				case Const:
				case Export:
				case Import:
				case Implements:
				case Let:
				case Private:
				case Public:
				case Interface:
				case Package:
				case Protected:
				case Static:
				case Yield:
					type = ColorScheme.Colorable.KEYWORD;
					break;
				case UnexpectedCharacter:
					type = ColorScheme.Colorable.ERROR;
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
	protected void parse(JavaScriptLexer lexer) {
		CommonTokenStream tks = new CommonTokenStream(lexer);
		parser.setTokenStream(tks);
		program = parser.program();
	}


	@Override
	protected ParseTree getTree() {
		return program;
	}

}
