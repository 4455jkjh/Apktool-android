package com.a4455jkjh.apktool.lexer;

import com.a4455jkjh.lexer.CPP14Lexer;
import com.a4455jkjh.lexer.CPP14Parser;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.Pair;
import java.util.List;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import static com.a4455jkjh.lexer.CPP14Lexer.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class CppLexTask extends Antlr4LexTask<CPP14Lexer> {
	private CPP14Parser.TranslationunitContext unit;
	private final CPP14Parser parser;
	public CppLexTask() {
		super(CPP14Lexer.VOCABULARY);
		parser = new CPP14Parser(null);
	}

	@Override
	protected CPP14Lexer generateLexer() {
		return new CPP14Lexer(null);
	}
	@Override
	protected void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, CPP14Lexer lexer) {
		unit=null;
		while (!abort) {
			Token token = lexer.nextToken();
			int tokenType = token.getType();
			if (tokenType == -1)
				break;
			ColorScheme.Colorable type;
			switch (tokenType) {
				case Alignas:
				case Alignof:
				case Asm:
				case Auto:
				case Break:
				case Class:
				case Const:
				case Catch:
				case Case:
				case Constexpr:
				case Const_cast:
				case Continue:
				case Decltype:
				case Default:
				case Delete:
				case Do:
				case Dynamic_cast:
				case Else:
				case Enum:
				case Explicit:
				case Export:
				case Extern:
				case Final:
				case For:
				case Friend:
				case Goto:
				case If:
				case Inline:
				case Mutable:
				case Namespace:
				case New:
				case Noexcept:
				case Operator:
				case Override:
				case Private:
				case Protected:
				case Public:
				case Register:
				case Reinterpret_cast:
				case Return:
				case Sizeof:
				case Signed:
				case Static:
				case Static_cast:
				case Static_assert:
				case Struct:
				case Switch:
				case Template:
				case This:
				case Throw:
				case Thread_local:
				case Try:
				case Typedef:
				case Typeid:
				case Typename:
				case Unsigned:
				case Union:
				case Using:
				case Virtual:
				case Volatile:
				case While:
					type = ColorScheme.Colorable.KEYWORD;
					break;
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Double:
				case Float:
				case Int:
				case Long:
				case Short:
				case Wchar:
					type = ColorScheme.Colorable.TYPE;
					break;
				case LeftParen:
				case LeftBracket:
				case LeftBrace:
				case Dot:
				case RightParen:
				case RightBracket:
				case RightBrace:
				case Semi:
				case Comma:
					type = ColorScheme.Colorable.SEPARATOR;
					break;
				case Plus:
				case Minus:
				case Star:
				case Div:
				case Mod:
				case Caret:
				case And:
				case Or:
				case Tilde:
				case Not:
				case Assign:
				case Less:
				case Greater:
				case PlusAssign:
				case MinusAssign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case XorAssign:
				case AndAssign:
				case OrAssign:
				case LeftShift:
				case LeftShiftAssign:
				case Equal:
				case NotEqual:
				case LessEqual:
				case GreaterEqual:
				case AndAnd:
				case OrOr:
				case PlusPlus:
				case MinusMinus:
				case Arrow:
				case ArrowStar:
				case Question:
				case Colon:
				case Doublecolon:
				case DotStar:
				case Ellipsis:
					type = ColorScheme.Colorable.OPERATOR;
					break;
				case Integerliteral:
				case Decimalliteral:
				case Octalliteral:
				case Hexadecimalliteral:
				case Binaryliteral:
				case Integersuffix:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
				case True:
				case False:
				case Nullptr:
					type = ColorScheme.Colorable.LITERAL;
					break;
				case BlockComment:
				case LineComment:
					type = ColorScheme.Colorable.COMMENT;
					break;
				case MultiLineMacro:
				case Directive:
					type = ColorScheme.Colorable.PACKAGE;
					break;
				default:
					type = ColorScheme.Colorable.NAME;
					break;
			}
			Pair<ColorScheme.Colorable> pair = new Pair<ColorScheme.Colorable>(token.getStopIndex() , type);
			_tokens.add(pair);
		}
	}

	@Override
	protected void parse(CPP14Lexer lexer) {
		CommonTokenStream tks = new CommonTokenStream(lexer);
		parser.setTokenStream(tks);
		unit = parser.translationunit();
	}


	@Override
	protected ParseTree getTree() {
		return unit;
	}
	
}
