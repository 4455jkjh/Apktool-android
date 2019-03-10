package com.a4455jkjh.apktool.lexer;

import com.a4455jkjh.lexer.ObjectiveCLexer;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.Pair;
import java.util.List;
import org.antlr.v4.runtime.Token;

import static com.a4455jkjh.lexer.ObjectiveCLexer.*;

public class ObjcLexTask extends Antlr4LexTask<ObjectiveCLexer> {
	public ObjcLexTask() {
		super(ObjectiveCLexer.VOCABULARY);
	}

	@Override
	protected ObjectiveCLexer generateLexer() {
		return new ObjectiveCLexer(null);
	}

	@Override
	protected void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, ObjectiveCLexer lexer) {
		while (!abort) {
			Token token = lexer.nextToken();
			int tokenType = token.getType();
			if (tokenType == EOF)
				break;
			ColorScheme.Colorable type;
			switch (tokenType) {
				case AUTO:
				case BREAK:
				case CASE:
				case CONST:
				case CONTINUE:
				case DEFAULT:
				case DO:
				case ELSE:
				case ENUM:
				case EXTERN:
				case FOR:
				case GOTO:
				case IF:
				case INLINE:
				case REGISTER:
				case RESTRICT:
				case RETURN:
				case SIGNED:
				case SIZEOF:
				case STATIC:
				case STRUCT:
				case SWITCH:
				case TYPEDEF:
				case TYPEOF:
				case UNION:
				case VOLATILE:
				case WHILE:
				case ID:
				case SELF:
				case SUPER:
				case BYCOPY:
				case BYREF:
				case IMP:
				case IN:
				case OUT:
				case INOUT:
				case ONEWAY:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
					type = ColorScheme.Colorable.KEYWORD;
					break;
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case VOID:
				case BOOL_:
				case COMPLEX:
				case IMAGINERY:
				case BOOL:
				case Class:
				case PROTOCOL_:
				case SEL:
					type = ColorScheme.Colorable.TYPE;
					break;
				case TRUE:
				case FALSE:
				case NO:
				case YES:
				case NIL:
				case NULL:
				case CHARACTER_LITERAL:
				case STRING_START:
				case STRING_NEWLINE:
				case STRING_VALUE:
				case STRING_END:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
					type = ColorScheme.Colorable.LITERAL;
					break;
				case AUTORELEASEPOOL:
				case CATCH:
				case CLASS:
				case DYNAMIC:
				case END:
				case ENCODE:
				case FINALLY:
				case IMPLEMENTATION:
				case INTERFACE:
				case IMPORT:
				case PACKAGE:
				case PROTOCOL:
				case OPTIONAL:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case PROPERTY:
				case REQUIRED:
				case SELECTOR:
				case SYNCHRONIZED:
				case SYNTHESIZE:
				case THROW:
				case TRY:
					type = ColorScheme.Colorable.PACKAGE;
					break;
				case MULTI_COMMENT:
				case SINGLE_COMMENT:
					type = ColorScheme.Colorable.COMMENT;
					break;
				default:
					if (tokenType >= LP && tokenType <= ELIPSIS)
						type = ColorScheme.Colorable.OPERATOR;
					else
						type = ColorScheme.Colorable.NAME;
					break;
			}
			Pair<ColorScheme.Colorable> pair = new Pair<ColorScheme.Colorable>(token.getStopIndex(), type);
			_tokens.add(pair);
		}
	}

	@Override
	protected void parse(ObjectiveCLexer lexer) {
		// TODO: Implement this method
	}

}
