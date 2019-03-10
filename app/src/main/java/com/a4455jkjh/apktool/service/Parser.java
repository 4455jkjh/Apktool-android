package com.a4455jkjh.apktool.service;
import com.a4455jkjh.apktool.lexer.Packages;
import com.a4455jkjh.lexer.SmaliBaseVisitor;
import com.a4455jkjh.lexer.SmaliLexer;
import com.a4455jkjh.lexer.SmaliParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Parser {
	int i;
	public static void parse(FileItem f, int state, boolean findType) throws IOException {
		if (f == null)
			return;
		InputStream i = new FileInputStream(f.getFile());
		ANTLRInputStream ii = new ANTLRInputStream(i);
		f.reset();
		SmaliLexer lexer = lexers.get();
		SmaliParser parser = parsers.get();
		if (lexer == null) {
			lexer = new SmaliLexer(null);
			lexers.set(lexer);
		}
		if (parser == null) {
			parser = new SmaliParser(null);
			parsers.set(parser);
		}
		lexer.removeErrorListeners();
		parser.removeErrorListeners();
		lexer.addErrorListener(f);
		parser.addErrorListener(f);
		lexer.setInputStream(ii);
		CommonTokenStream tks = new CommonTokenStream(lexer);
		parser.setTokenStream(tks);
		SmaliParser.SmaliContext ctx =  parser.smali();
		if (parser.getNumberOfSyntaxErrors() == 0)
			if (state == 0)
				findTypes(ctx, tks, false);
			else {
				ReferenceFinder.INSTANCE().visit(f, ctx, tks, true, findType);
			}
	}

	public static void findTypes(SmaliParser.SmaliContext ctx, CommonTokenStream tks, boolean edit) {
		TypesFinder finder = finders.get();
		if (finder == null) {
			finder = new TypesFinder();
			finders.set(finder);
		}
		finder.edit = edit;
		finder.tks = tks;
		ctx.accept(finder);
	}
	private static ThreadLocal<SmaliLexer> lexers = new ThreadLocal<>();
	private static ThreadLocal<SmaliParser> parsers = new ThreadLocal<>();
	private static ThreadLocal<TypesFinder> finders = new ThreadLocal<>();
	private static class TypesFinder extends SmaliBaseVisitor<Object> {
		String type = null;
		String superType = null;
		List<String> members = new ArrayList<>();
		List<String> impls = new ArrayList<>();
		CommonTokenStream tks;
		boolean edit;

		@Override
		public Object visitSmali(SmaliParser.SmaliContext ctx) {
			type = null;
			superType = null;
			members.clear();
			impls.clear();
			try {
				return super.visitSmali(ctx);
			} finally {
				if (type != null) {
					Packages.Member m = new Packages.Member();
					m.superType = superType;
					m.members = new ArrayList<String>(members);
					m.impls = new ArrayList<String>(impls);
					Packages.addClass(type, m, edit);
				}
			}
		}

		@Override
		public Object visitImplementsSpec(SmaliParser.ImplementsSpecContext ctx) {
			impls.add(ctx.CLASS_DESCRIPTOR().getText());
			return null;
		}

		@Override
		public Object visitClassSpec(SmaliParser.ClassSpecContext ctx) {
			type = ctx.CLASS_DESCRIPTOR().getText();
			return null;
		}

		@Override
		public Object visitSuperSpec(SmaliParser.SuperSpecContext ctx) {
			superType = ctx.CLASS_DESCRIPTOR().getText();
			return null;
		}

		@Override
		public Object visitField(SmaliParser.FieldContext ctx) {
			if (ctx.memberName().getText().equals("<clinit>"))
				return null;
			members.add(getText(ctx.memberName().start, ctx.nonvoid_type_descriptor().stop));
			return null;
		}

		@Override
		public Object visitMethod(SmaliParser.MethodContext ctx) {
			members.add(getText(ctx.memberName().start, ctx.methodProto().stop));
			return null;
		}

		protected String getText(Token start, Token end) {
			return tks.getText(start, end);
		}
	};
}
