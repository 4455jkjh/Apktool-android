package com.a4455jkjh.apktool.lexer;

import com.a4455jkjh.lexer.JavaLexer;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.Pair;
import java.util.List;
import org.antlr.v4.runtime.Token;
import org.intellij.lang.annotations.Identifier;

import static com.a4455jkjh.lexer.JavaLexer.*;
import com.a4455jkjh.lexer.JavaParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;

public class JavaLexTask extends Antlr4LexTask <JavaLexer> {
	private JavaParser.CompilationUnitContext unit;
	private final JavaParser parser;
	@Override
	protected JavaLexer generateLexer() {
		return new JavaLexer(null);
	}

	@Override
	protected void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, JavaLexer lexer) {
		boolean imp=false;
		unit=null;
		while (!abort) {
			Token token = lexer.nextToken();
			int tokenType = token.getType();
			if (tokenType == -1)
				break;
			ColorScheme.Colorable type;
			switch (tokenType) {
				case PUBLIC:
				case ABSTRACT:
				case ASSERT:
				case BREAK:
				case CASE:
				case CATCH:
				case CONTINUE:
				case CLASS:
				case CONST:
				case DEFAULT:
				case DO:
				case ELSE:
				case ENUM:
				case EXTENDS:
				case FINAL:
				case FINALLY:
				case FOR:
				case GOTO:
				case IF:
				case IMPLEMENTS:
				case INSTANCEOF:
				case INTERFACE:
				case NATIVE:
				case NEW:
				case PRIVATE:
				case PROTECTED:
				case RETURN:
				case STATIC:
				case STRICTFP:
				case SUPER:
				case SWITCH:
				case SYNCHRONIZED:
				case THIS:
				case THROW:
				case THROWS:
				case TRANSIENT:
				case TRY:
				case VOLATILE:
				case WHILE:
					type = ColorScheme.Colorable.KEYWORD;
					break;
				case IMPORT:
				case PACKAGE:
					type = ColorScheme.Colorable.KEYWORD;
					imp = true;
					break;
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case HEX_FLOAT_LITERAL:
				case HEX_LITERAL:
				case FLOAT_LITERAL:
				case OCT_LITERAL:
				case STRING_LITERAL:
				case CHAR_LITERAL:
				case BOOL_LITERAL:
				case NULL_LITERAL:
					type = ColorScheme.Colorable.LITERAL;
					break;
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case FLOAT:
				case DOUBLE:
				case INT:
				case LONG:
				case SHORT:
				case VOID:
					type = ColorScheme.Colorable.TYPE;
					break;
				case SEMI:
					type = ColorScheme.Colorable.SEPARATOR;
					imp = false;
					break;
				case ARROW:
				case COLONCOLON:
				case ELLIPSIS:
				case ASSIGN:
				case GT:
				case LT:
				case BANG:
				case TILDE:
				case QUESTION:
				case COLON:
				case EQUAL:
				case LE:
				case GE:
				case NOTEQUAL:
				case AND:
				case OR:
				case INC:
				case DEC:
				case ADD:
				case SUB:
				case DIV:
				case BITOR:
				case BITAND:
				case CARET:
				case MOD:
				case ADD_ASSIGN:
				case SUB_ASSIGN:
				case MUL_ASSIGN:
				case DIV_ASSIGN:
				case AND_ASSIGN:
				case OR_ASSIGN:
				case XOR_ASSIGN:
				case MOD_ASSIGN:
				case LSHIFT_ASSIGN:
				case RSHIFT_ASSIGN:
				case URSHIFT_ASSIGN:
				case AT:
					type = ColorScheme.Colorable.OPERATOR;
					break;
				case LPAREN:
				case RPAREN:
				case LBRACE:
				case RBRACE:
				case LBRACK:
				case RBRACK:
				case COMMA:
				case DOT:
					type = ColorScheme.Colorable.SEPARATOR;
					break;
				case MUL:
					if (imp)
						type = ColorScheme.Colorable.PACKAGE;
					else
						type = ColorScheme.Colorable.OPERATOR;
					break;
				case IDENTIFIER:
					if (imp)
						type = ColorScheme.Colorable.PACKAGE;
					else
						type = ColorScheme.Colorable.NAME;
					break;
				case LINE_COMMENT:
				case COMMENT:
					type = ColorScheme.Colorable.COMMENT;
					break;
				case 0:
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
	protected void parse(JavaLexer lexer) {
		CommonTokenStream tks = new CommonTokenStream(lexer);
		parser.setTokenStream(tks);
		unit = parser.compilationUnit();
	}


	@Override
	protected ParseTree getTree() {
		return unit;
	}

	public JavaLexTask() {
		super(JavaLexer.VOCABULARY);
		unit = null;
		parser = new JavaParser(null);
	}
}
