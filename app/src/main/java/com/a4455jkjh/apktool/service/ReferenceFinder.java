package com.a4455jkjh.apktool.service;

import com.a4455jkjh.apktool.fragment.editor.EditorPagerAdapter;
import com.a4455jkjh.apktool.lexer.Packages;
import com.a4455jkjh.lexer.SmaliBaseVisitor;
import com.a4455jkjh.lexer.SmaliParser;
import com.a4455jkjh.smali.ClassMaker;
import com.google.common.collect.ImmutableList;
import jadx.core.utils.Function;
import jadx.core.utils.MapUtils;
import java.text.MessageFormat;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.util.MethodUtil;
import org.jf.smali.LiteralTools;
import com.a4455jkjh.lexer.SmaliParser.Fixed64bitLiteralContext;

public class ReferenceFinder extends SmaliBaseVisitor<Object> {
	private static final ResourceBundle rb;
	private static final ThreadLocal<ReferenceFinder> INSTANCE = new ThreadLocal<>();

	private FileItem item;

	private int locals;

	private int max;

	private static String bind(String key, Object... binding) {
		return MessageFormat.format(
			rb.getString(key), binding);
	}
	private CommonTokenStream tks;

	private boolean stop;
	private final Map<String, List<Memb>> mm = new LinkedHashMap<>();
	private ReferenceFinder() {}

	public void stop() {
		stop = true;
	}

	public void visit(FileItem item, SmaliParser.SmaliContext ctx, CommonTokenStream tks, boolean refresh, boolean findType) {
		if (Packages.isEmpty())
			return;
		this.item = item;
		this.tks = tks;
		stop = false;
		mm.clear();
		ctx.accept(this);
		if (findType) {
			for (Map.Entry<String, List<Memb>> entry : mm.entrySet()) {
				String key = entry.getKey();
				List<String> mbers = Packages.getMembers(key);
				if (mbers.size() == 0) {
					for (Memb m:entry.getValue()) {
						for (Object pr:m.types)
							item.syntaxError(
								null, pr, 0, 0,
								bind(Messages.UNKNOWN_TYPE, entry.getKey()),
								null);
					}
				} else
					for (Memb m:entry.getValue()) {
						String member = m.member;
						if (member == null)
							continue;
						if (!mbers.contains(member)) {
							String type;
							if (member.indexOf(':') > 0)
								type = Messages.UNKNOWN_FIELD;
							else
								type = Messages.UNKNOWN_METHOD;
							for (Pair<Integer,Integer> pair : m.positions)
								item.syntaxError(
									null, pair, 0,
									0,
									bind(type, member, key),
									null);
						}
					}
			}
		}
		if (item.getChildCount() > 0 && refresh)
			EditorPagerAdapter.INSTANCE.resetError();
	}
	public static ReferenceFinder INSTANCE() {
		ReferenceFinder b = INSTANCE.get();
		if (b == null) {
			b = new ReferenceFinder();
			INSTANCE.set(b);
		}
		return b;
	}

	@Override
	public Object visitFieldReference(SmaliParser.FieldReferenceContext ctx) {
		if (stop)
			return null;
		String defClass = ctx.defineClass;
		List<Memb> mm = getMem(defClass);
		String field = tks.getText(ctx.memberName().start, ctx.nonvoid_type_descriptor().stop).replace(" ", "");
		Memb m = getMem(mm, field);
		m.types.add(defClass);
		m.positions.add(new Pair<Integer, Integer>(
							ctx.memberName().start.getStartIndex(), ctx.stop.getStopIndex()));
		return null;
	}

	private ReferenceFinder.Memb getMem(List<ReferenceFinder.Memb> mm, String member) {
		for (Memb m : mm) {
			if (m.member == null && member == null)
				return m;
			if (member == null || m.member == null)
				continue;
			if (m.member.equals(member))
				return m;
		}
		ReferenceFinder.Memb memb = new Memb(member);
		mm.add(memb);
		return memb;
	}

	private List<Memb> getMem(String text) {
		return MapUtils.computeIfAbsent(mm, text, new Function<String, List<Memb>>(){
				@Override
				public List<Memb> apply(String p1) {
					return new LinkedList<Memb>();
				}
			});
	}

	@Override
	public Object visitMethodReference(SmaliParser.MethodReferenceContext ctx) {
		if (stop)
			return null;
		String defClass = ctx.defineClass;
		List<Memb> mm = getMem(defClass);
		String method = tks.getText(ctx.memberName().start, ctx.methodProto().stop).replace(" ", "");
		Memb m = getMem(mm, method);
		m.types.add(defClass);
		m.positions.add(new Pair<Integer, Integer>(
							ctx.memberName().start.getStartIndex(), ctx.stop.getStopIndex()));
		return null;
	}

	@Override
	public Object visitChildren(RuleNode node) {
		if (stop)
			return null;
		return super.visitChildren(node);
	}
	private class Memb {
		String member;
		List<Object> types;
		List<Pair<Integer, Integer>> positions;

		public Memb(String member) {
			this.member = member;
			types = new LinkedList<>();
			positions = new LinkedList<>();
		}
	}

	@Override
	public Object visitSuperSpec(SmaliParser.SuperSpecContext ctx) {
		return addNullMember(ctx.CLASS_DESCRIPTOR());
	}

	private Object addNullMember(TerminalNode node) {
		List<Memb> mm = getMem(node.getText());
		Memb m = getMem(mm, null);
		m.types.add(node.getSymbol());
		return null;
	}

	@Override
	public Object visitImplementsSpec(SmaliParser.ImplementsSpecContext ctx) {
		return addNullMember(ctx.CLASS_DESCRIPTOR());
	}

	@Override
	public Object visitInsn_format11n(SmaliParser.Insn_format11nContext ctx) {
		SmaliParser.IntegralLiteralContext integral_literal = ctx.integralLiteral();
		int literal = visitIntegralLiteral(integral_literal).intValue();
		checkNibbleRegister(ctx.REGISTER().getSymbol());
		checkNibbleLiteral(literal, integral_literal);
		return null;
	}

	@Override
	public Object visitInsn_format11x(SmaliParser.Insn_format11xContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format12x(SmaliParser.Insn_format12xContext ctx) {
		for (TerminalNode reg : ctx.REGISTER())
			checkNibbleRegister(reg.getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format21c_method_handle(SmaliParser.Insn_format21c_method_handleContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		visitMethodHandleReference(ctx.methodHandleReference());
		return null;
	}

	@Override
	public Object visitInsn_format21c_field(SmaliParser.Insn_format21c_fieldContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		visitFieldReference(ctx.fieldReference());
		return null;
	}

	@Override
	public Object visitInsn_format21c_field_odex(SmaliParser.Insn_format21c_field_odexContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		visitFieldReference(ctx.fieldReference());
		return null;
	}

	@Override
	public Object visitInsn_format21c_method_type(SmaliParser.Insn_format21c_method_typeContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		visitMethodProto(ctx.methodProto());
		return null;
	}

	@Override
	public Object visitInsn_format21c_string(SmaliParser.Insn_format21c_stringContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format21c_type(SmaliParser.Insn_format21c_typeContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		addNullMember(ctx.nonvoid_type_descriptor());
		return null;
	}

	@Override
	public Object visitInsn_format21ih(SmaliParser.Insn_format21ihContext ctx) {
		SmaliParser.Fixed32bitLiteralContext fixed_32bit_literal = ctx.fixed32bitLiteral();
		checkByteRegister(ctx.REGISTER().getSymbol());
		int literal = visitFixed32bitLiteral(fixed_32bit_literal).intValue();
		checkIntegerHatLiteral(literal, fixed_32bit_literal);
		return null;
	}

	@Override
	public Object visitInsn_format21lh(SmaliParser.Insn_format21lhContext ctx) {
		SmaliParser.Fixed64bitLiteralContext fixed_64bit_literal = ctx.fixed64bitLiteral();
		long literal = visitFixed64bitLiteral(fixed_64bit_literal).longValue();
		checkLongHatLiteral(literal, fixed_64bit_literal);
		checkByteRegister(ctx.REGISTER().getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format21s(SmaliParser.Insn_format21sContext ctx) {
		SmaliParser.IntegralLiteralContext integral_literal = ctx.integralLiteral();
		int literal = visitIntegralLiteral(integral_literal).intValue();
		checkShortLiteral(literal, integral_literal);
		checkByteRegister(ctx.REGISTER().getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format22c_field(SmaliParser.Insn_format22c_fieldContext ctx) {
		for (TerminalNode reg : ctx.REGISTER())
			checkNibbleRegister(reg.getSymbol());
		visitFieldReference(ctx.fieldReference());
		return null;
	}

	@Override
	public Object visitInsn_format22c_type(SmaliParser.Insn_format22c_typeContext ctx) {
		for (TerminalNode reg : ctx.REGISTER())
			checkNibbleRegister(reg.getSymbol());
		addNullMember(ctx.nonvoid_type_descriptor());
		return null;
	}

	@Override
	public Object visitInsn_format22c_field_odex(SmaliParser.Insn_format22c_field_odexContext ctx) {
		for (TerminalNode reg : ctx.REGISTER())
			checkNibbleRegister(reg.getSymbol());
		visitFieldReference(ctx.fieldReference());
		return null;
	}

	@Override
	public Object visitInsn_format22cs_field(SmaliParser.Insn_format22cs_fieldContext ctx) {
		for (TerminalNode reg : ctx.REGISTER())
			checkNibbleRegister(reg.getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format22s(SmaliParser.Insn_format22sContext ctx) {
		SmaliParser.IntegralLiteralContext integral_literal = ctx.integralLiteral();
		int literal = visitIntegralLiteral(integral_literal).intValue();
		checkShortLiteral(literal, integral_literal);
		for (TerminalNode reg : ctx.REGISTER())
			checkNibbleRegister(reg.getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format22t(SmaliParser.Insn_format22tContext ctx) {
		for (TerminalNode reg : ctx.REGISTER())
			checkNibbleRegister(reg.getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format22b(SmaliParser.Insn_format22bContext ctx) {
		SmaliParser.IntegralLiteralContext integral_literal = ctx.integralLiteral();
		int literal = visitIntegralLiteral(integral_literal).intValue();
		checkByteLiteral(literal, integral_literal);
		for (TerminalNode reg : ctx.REGISTER())
			checkByteRegister(reg.getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format22x(SmaliParser.Insn_format22xContext ctx) {
		checkByteRegister(ctx.REGISTER(0).getSymbol());
		checkShortRegister(ctx.REGISTER(1).getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format23x(SmaliParser.Insn_format23xContext ctx) {
		for (TerminalNode reg : ctx.REGISTER())
			checkByteRegister(reg.getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format31c(SmaliParser.Insn_format31cContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		return null;
	}

	@Override
	public Object visitInsn_format31i(SmaliParser.Insn_format31iContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		return super.visitInsn_format31i(ctx);
	}

	@Override
	public Object visitInsn_format31t(SmaliParser.Insn_format31tContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		return super.visitInsn_format31t(ctx);
	}

	@Override
	public Object visitInsn_format32x(SmaliParser.Insn_format32xContext ctx) {
		for (TerminalNode reg : ctx.REGISTER())
			checkShortRegister(reg.getSymbol());
		return super.visitInsn_format32x(ctx);
	}

	@Override
	public Number visitFixed64bitLiteral(SmaliParser.Fixed64bitLiteralContext ctx) {
		Number val = 0;
		if (ctx != null) {
			if (ctx.LONG_LITERAL() != null) 
				val = LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
			else if (ctx.SHORT_LITERAL() != null) 
				val = LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
			else if (ctx.BYTE_LITERAL() != null) 
				val = LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
			else if (ctx.integerLiteral() != null)
				val = LiteralTools.parseInt(ctx.integerLiteral().getText());
			else if (ctx.CHAR_LITERAL() != null)
				val = (int)ClassMaker.parseStringOrChar(ctx.CHAR_LITERAL()).charAt(0);
			else if (ctx.floatLiteral() != null)
				val = LiteralTools.parseFloat(ctx.floatLiteral().getText());
			else if (ctx.doubleLiteral() != null)
				val = LiteralTools.parseDouble(ctx.doubleLiteral().getText());
		}
		return val;
	}

	@Override
	public Number visitFixed32bitLiteral(SmaliParser.Fixed32bitLiteralContext ctx) {
		Number val = 0;
		if (ctx != null) {
			if (ctx.LONG_LITERAL() != null) 
				val = LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
			else if (ctx.SHORT_LITERAL() != null) 
				val = LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
			else if (ctx.BYTE_LITERAL() != null) 
				val = LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
			else if (ctx.integerLiteral() != null)
				val = LiteralTools.parseInt(ctx.integerLiteral().getText());
			else if (ctx.CHAR_LITERAL() != null)
				val = (int)ClassMaker.parseStringOrChar(ctx.CHAR_LITERAL()).charAt(0);
			else if (ctx.floatLiteral() != null)
				val = LiteralTools.parseFloat(ctx.floatLiteral().getText());
		}
		return val;
	}

	@Override
	public Object visitInsn_format35c_method(SmaliParser.Insn_format35c_methodContext ctx) {
		checkNibbleRegister(ctx.register_list());
		visitMethodReference(ctx.methodReference());
		return null;
	}

	@Override
	public Object visitInsn_format35c_type(SmaliParser.Insn_format35c_typeContext ctx) {
		checkNibbleRegister(ctx.register_list());
		addNullMember(ctx.nonvoid_type_descriptor());
		return null;
	}

	@Override
	public Object visitInsn_format35c_call_site(SmaliParser.Insn_format35c_call_siteContext ctx) {
		checkNibbleRegister(ctx.register_list());
		visitCallsiteReference(ctx.callsiteReference());
		return null;
	}

	@Override
	public Object visitInsn_format35mi_method(SmaliParser.Insn_format35mi_methodContext ctx) {
		checkNibbleRegister(ctx.register_list());
		return null;
	}

	@Override
	public Object visitInsn_format35ms_method(SmaliParser.Insn_format35ms_methodContext ctx) {
		checkNibbleRegister(ctx.register_list());
		return null;
	}

	@Override
	public Object visitInsn_format3rc_type(SmaliParser.Insn_format3rc_typeContext ctx) {
		checkRegiserRange(ctx.register_range());
		addNullMember(ctx.nonvoid_type_descriptor());
		return null;
	}

	private void checkRegiserRange(SmaliParser.Register_rangeContext ctx) {
		if (ctx == null)
			return;
		int start = getRegister(ctx.startreg);
		int end = getRegister(ctx.endreg);
		int registerCount = end - start + 1;
		checkShortRegister(ctx.startreg);
		if ((registerCount & 0xFFFFFF00) != 0) {
			item.syntaxError(null, ctx, 0, 0, bind(Messages.WRONG_REGISTER_COUNT, registerCount), null);
		}
	}

	@Override
	public Object visitInsn_format3rc_call_site(SmaliParser.Insn_format3rc_call_siteContext ctx) {
		checkRegiserRange(ctx.register_range());
		visitCallsiteReference(ctx.callsiteReference());
		return null;
	}

	@Override
	public Object visitInsn_format3rc_method(SmaliParser.Insn_format3rc_methodContext ctx) {
		checkRegiserRange(ctx.register_range());
		visitMethodReference(ctx.methodReference());
		return null;
	}

	@Override
	public Object visitInsn_format3rmi_method(SmaliParser.Insn_format3rmi_methodContext ctx) {
		checkRegiserRange(ctx.register_range());
		return null;
	}

	@Override
	public Object visitInsn_format3rms_method(SmaliParser.Insn_format3rms_methodContext ctx) {
		checkRegiserRange(ctx.register_range());
		return null;
	}

	@Override
	public Object visitInsn_format45cc_method(SmaliParser.Insn_format45cc_methodContext ctx) {
		checkNibbleRegister(ctx.register_list());
		visitMethodReference(ctx.methodReference());
		visitMethodProto(ctx.methodProto());
		return null;
	}

	@Override
	public Object visitInsn_format4rcc_method(SmaliParser.Insn_format4rcc_methodContext ctx) {
		checkRegiserRange(ctx.register_range());
		visitMethodReference(ctx.methodReference());
		visitMethodProto(ctx.methodProto());
		return null;
	}

	@Override
	public Object visitInsn_format51l(SmaliParser.Insn_format51lContext ctx) {
		checkByteRegister(ctx.REGISTER().getSymbol());
		return null;
	}

	@Override
	public Number visitIntegralLiteral(SmaliParser.IntegralLiteralContext ctx) {
		long val = 0;
		if (ctx != null) {
			if (ctx.LONG_LITERAL() != null) 
				val = LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
			else if (ctx.SHORT_LITERAL() != null) 
				val = LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
			else if (ctx.BYTE_LITERAL() != null) 
				val = LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
			else if (ctx.integerLiteral() != null)
				val = LiteralTools.parseInt(ctx.integerLiteral().getText());
			else if (ctx.CHAR_LITERAL() != null)
				val = ClassMaker.parseStringOrChar(ctx.CHAR_LITERAL()).charAt(0);
		}
		return Long.valueOf(val);
	}

	@Override
	public List<CharSequence> visitMethodProto(SmaliParser.MethodProtoContext ctx) {
		ImmutableList.Builder<CharSequence> list = new ImmutableList.Builder<>();
		SmaliParser.ParamListContext paramList = ctx.paramList();
		if (paramList != null) {
			String text = ctx.paramList().getText();
			int start = -1;
			int max = text.length();
			boolean isClass = false;
			for (int i=0; i < max;i++) {
				char charAt = text.charAt(i);
				sw:switch (charAt) {
					case 'B':
					case 'C':
					case 'D':
					case 'F':
					case 'I':
					case 'J':
					case 'S':
					case 'Z':
						if (start == -1)
							list.add(String.valueOf(charAt));
						else if (!isClass) {
							list.add(text.substring(start, i + 1));
							start = -1;
							isClass = false;
						}
						break sw;
					case 'L':
						isClass = true;
					case '[':
						if (start == -1)
							start = i;
						break sw;
					case ';':
						list.add(text.substring(start, i + 1));
						start = -1;
						isClass = false;
						break sw;
				}
			}
		}
		ImmutableList<CharSequence> build = list.build();
		for (CharSequence s:build) {
			addNullMember(s.toString(), paramList);
		}
		addNullMember(ctx.type_descriptor());
		return build;
	}

	@Override
	public Object visitMethod(SmaliParser.MethodContext ctx) {
		SmaliParser.MethodProtoContext methodProto = ctx.methodProto();
		List<CharSequence> paramList = visitMethodProto(methodProto);
		int access = visitAccessList(ctx.accessList()).intValue();
		int paramCount = MethodUtil.getParameterRegisterCount(paramList, (access & AccessFlags.STATIC.getValue()) > 0);
		List<SmaliParser.Statement_or_directiveContext> statements_and_directives = ctx.statement_or_directive();
		if ((access & (AccessFlags.ABSTRACT.getValue() | AccessFlags.NATIVE.getValue())) == 0)
			computeLocals(statements_and_directives, paramCount, ctx.memberName().start.getStartIndex(), methodProto.stop.getStopIndex());
		for (SmaliParser.Statement_or_directiveContext orderd : statements_and_directives)
			orderd.accept(this);
		return null;
	}

	private void computeLocals(List<SmaliParser.Statement_or_directiveContext>  statements_and_directives, int paramCount, int s, int e) {
		int locals = -1;
		for (SmaliParser.Statement_or_directiveContext directive : statements_and_directives)
			if(directive instanceof SmaliParser.RegisterAltContext){
				locals=getLocals((SmaliParser.RegisterAltContext)directive, paramCount);
				break;
			}
		if (locals == -1) {
			item.syntaxError(null, new Pair<Integer,Integer>(s, e), 0, 0, bind(Messages.NO_REGISTER), null);
			locals = 65535;
		}
		this.locals = locals;
		this.max = locals + paramCount - 1;
	}

	private int getLocals(SmaliParser.RegisterAltContext registers_directive, int paramCount) {
		SmaliParser.IntegralLiteralContext integral;
		SmaliParser.RegistersDirectiveContext register = registers_directive.registersDirective();
		boolean isLocal;
			integral = register.regCount;
			isLocal = register.isLocal;
		long val = visitIntegralLiteral(integral).longValue();
		if (isLocal)
			val += paramCount;
		if (val > 0xFFFF | val < -0x8000) {
			item.syntaxError(null, integral, 0, 0, bind(Messages.VALUE_NOT_SHORT, tks.getText(integral)), null);
			return 0;
		}
		val -= paramCount;
		return ((short) val);
	}

	@Override
	public Integer visitAccessList(SmaliParser.AccessListContext ctx) {
		int flag = 0;
		for (TerminalNode node : ctx.ACCESS_SPEC())
			flag |= AccessFlags.getAccessFlag(node.getText()).getValue();
		return Integer.valueOf(flag);
	}
	private void addNullMember(ParserRuleContext ctx) {
		addNullMember(tks.getText(ctx), ctx);
	}
	private void checkNibbleRegister(SmaliParser.Register_listContext ctx) {
		if (ctx == null)
			return;
		for (TerminalNode reg : ctx.REGISTER())
			checkNibbleRegister(reg.getSymbol());
	}
	private void checkNibbleRegister(Token reg) {
		int register = getRegister(reg);
		if ((register & 0xFFFFFFF0) != 0) {
			item.syntaxError(null, reg, 0, 0, bind(Messages.WRONG_NIBBLE_REGISTER, reg.getText()), null);
		}
	}
	private void checkByteRegister(Token reg) {
		int register = getRegister(reg);
		if ((register & 0xFFFFFF00) != 0) {
			item.syntaxError(null, reg, 0, 0, bind(Messages.WRONG_BYTE_REGISTER, reg.getText()), null);
		}
	}
	private void checkShortRegister(Token reg) {
		int register = getRegister(reg);
		if ((register & 0xFFFF0000) != 0) {
			item.syntaxError(null, reg, 0, 0, bind(Messages.WRONG_SHORT_REGISTER, reg.getText()), null);
		}
	}
	private void checkNibbleLiteral(int literal, ParserRuleContext ctx) {
        if (literal < -8 || literal > 7) {
            item.syntaxError(null, ctx, 0, 0,
							 bind(Messages.WRONG_NIBBLE_LITERAL, tks.getText(ctx)),
							 null);
        }
    }

    private void checkByteLiteral(int literal, ParserRuleContext ctx) {
        if (literal < -128 || literal > 127) {
            item.syntaxError(null, ctx, 0, 0,
							 bind(Messages.WRONG_BYTE_LITERAL, tks.getText(ctx)),
							 null);
        }

    }

    private void checkShortLiteral(int literal, ParserRuleContext ctx) {
        if (literal < -32768 || literal > 32767) {
            item.syntaxError(null, ctx, 0, 0,
							 bind(Messages.WRONG_SHORT_LITERAL, tks.getText(ctx)),
							 null);
        }

    }

    private void checkIntegerHatLiteral(int literal, ParserRuleContext ctx) {
        if ((literal & 0xFFFF) != 0) {
            item.syntaxError(null, ctx, 0, 0,
							 bind(Messages.WRONG_INT_HAT_LITERAL, tks.getText(ctx)),
							 null);
        }

    }

    private void checkLongHatLiteral(long literal, ParserRuleContext ctx) {
        if ((literal & 0xFFFFFFFFFFFFL) != 0) {
            item.syntaxError(null, ctx, 0, 0,
							 bind(Messages.WRONG_LONG_HAT_LITERAL, tks.getText(ctx)),
							 null);
        }

    }
	private int getRegister(Token tk) {
		String t = tk.getText();
		int reg = Integer.parseInt(t.substring(1));
		if (t.charAt(0) == 'p') {
			reg += locals;
		}
		if (reg > max)
			item.syntaxError(null, tk, 0, 0, bind(Messages.WRONG_REGISTER_COUNT1, reg, max), null);
		return reg;
	}
	private void addNullMember(String toString, ParserRuleContext ctx) {
		if (toString.matches("[BCDFIJSVZ]"))
			return;
		List<Memb> mm = getMem(toString);
		Memb m = getMem(mm, null);
		m.types.add(ctx);
	}


	static{
		rb = ResourceBundle.getBundle(Messages.class.getName());
	}
}
