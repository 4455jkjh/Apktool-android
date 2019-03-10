// Generated from ../Smali.g4 by ANTLR 4.7.2
package com.a4455jkjh.lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmaliParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS_DIRECTIVE=1, SUPER_DIRECTIVE=2, IMPLEMENTS_DIRECTIVE=3, SOURCE_DIRECTIVE=4, 
		FIELD_DIRECTIVE=5, END_FIELD_DIRECTIVE=6, SUBANNOTATION_DIRECTIVE=7, END_SUBANNOTATION_DIRECTIVE=8, 
		ANNOTATION_DIRECTIVE=9, END_ANNOTATION_DIRECTIVE=10, ENUM_DIRECTIVE=11, 
		METHOD_DIRECTIVE=12, END_METHOD_DIRECTIVE=13, REGISTERS_DIRECTIVE=14, 
		LOCALS_DIRECTIVE=15, ARRAY_DATA_DIRECTIVE=16, END_ARRAY_DATA_DIRECTIVE=17, 
		PACKED_SWITCH_DIRECTIVE=18, END_PACKED_SWITCH_DIRECTIVE=19, SPARSE_SWITCH_DIRECTIVE=20, 
		END_SPARSE_SWITCH_DIRECTIVE=21, CATCH_DIRECTIVE=22, CATCHALL_DIRECTIVE=23, 
		LINE_DIRECTIVE=24, PARAMETER_DIRECTIVE=25, END_PARAMETER_DIRECTIVE=26, 
		LOCAL_DIRECTIVE=27, END_LOCAL_DIRECTIVE=28, RESTART_LOCAL_DIRECTIVE=29, 
		PROLOGUE_DIRECTIVE=30, EPILOGUE_DIRECTIVE=31, POSITIVE_INTEGER_LITERAL=32, 
		NEGATIVE_INTEGER_LITERAL=33, LONG_LITERAL=34, SHORT_LITERAL=35, BYTE_LITERAL=36, 
		FLOAT_LITERAL_OR_ID=37, DOUBLE_LITERAL_OR_ID=38, FLOAT_LITERAL=39, DOUBLE_LITERAL=40, 
		BOOL_LITERAL=41, NULL_LITERAL=42, STRING_LITERAL=43, CHAR_LITERAL=44, 
		REGISTER=45, ACCESS_SPEC=46, ANNOTATION_VISIBILITY=47, VERIFICATION_ERROR_TYPE=48, 
		INLINE_INDEX=49, VTABLE_INDEX=50, FIELD_OFFSET=51, METHOD_HANDLE_TYPE_FIELD=52, 
		METHOD_HANDLE_TYPE_METHOD=53, LINE_COMMENT=54, INSTRUCTION_FORMAT10t=55, 
		INSTRUCTION_FORMAT10x=56, INSTRUCTION_FORMAT10x_ODEX=57, INSTRUCTION_FORMAT11n=58, 
		INSTRUCTION_FORMAT11x=59, INSTRUCTION_FORMAT12x_OR_ID=60, INSTRUCTION_FORMAT12x=61, 
		INSTRUCTION_FORMAT20bc=62, INSTRUCTION_FORMAT20t=63, INSTRUCTION_FORMAT21c_FIELD=64, 
		INSTRUCTION_FORMAT21c_FIELD_ODEX=65, INSTRUCTION_FORMAT21c_STRING=66, 
		INSTRUCTION_FORMAT21c_TYPE=67, INSTRUCTION_FORMAT21c_METHOD_HANDLE=68, 
		INSTRUCTION_FORMAT21c_METHOD_TYPE=69, INSTRUCTION_FORMAT21ih=70, INSTRUCTION_FORMAT21lh=71, 
		INSTRUCTION_FORMAT21s=72, INSTRUCTION_FORMAT21t=73, INSTRUCTION_FORMAT22b=74, 
		INSTRUCTION_FORMAT22c_FIELD=75, INSTRUCTION_FORMAT22c_FIELD_ODEX=76, INSTRUCTION_FORMAT22c_TYPE=77, 
		INSTRUCTION_FORMAT22cs_FIELD=78, INSTRUCTION_FORMAT22s_OR_ID=79, INSTRUCTION_FORMAT22s=80, 
		INSTRUCTION_FORMAT22t=81, INSTRUCTION_FORMAT22x=82, INSTRUCTION_FORMAT23x=83, 
		INSTRUCTION_FORMAT30t=84, INSTRUCTION_FORMAT31c=85, INSTRUCTION_FORMAT31i_OR_ID=86, 
		INSTRUCTION_FORMAT31i=87, INSTRUCTION_FORMAT31t=88, INSTRUCTION_FORMAT32x=89, 
		INSTRUCTION_FORMAT35c_CALL_SITE=90, INSTRUCTION_FORMAT35c_METHOD=91, INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE=92, 
		INSTRUCTION_FORMAT35c_METHOD_ODEX=93, INSTRUCTION_FORMAT35c_TYPE=94, INSTRUCTION_FORMAT35mi_METHOD=95, 
		INSTRUCTION_FORMAT35ms_METHOD=96, INSTRUCTION_FORMAT3rc_CALL_SITE=97, 
		INSTRUCTION_FORMAT3rc_METHOD=98, INSTRUCTION_FORMAT3rc_METHOD_ODEX=99, 
		INSTRUCTION_FORMAT3rc_TYPE=100, INSTRUCTION_FORMAT3rmi_METHOD=101, INSTRUCTION_FORMAT3rms_METHOD=102, 
		INSTRUCTION_FORMAT45cc_METHOD=103, INSTRUCTION_FORMAT4rcc_METHOD=104, 
		INSTRUCTION_FORMAT51l=105, VOID_TYPE=106, CLASS_DESCRIPTOR=107, PRIMITIVE_TYPE=108, 
		ARRAY_DESCRIPTOR=109, TYPE_LIST=110, PRIMITIVE_LIST=111, SIMPLE_NAME=112, 
		MEMBER_NAME=113, DOTDOT=114, ARROW=115, EQUAL=116, COLON=117, COMMA=118, 
		OPEN_BRACE=119, CLOSE_BRACE=120, OPEN_PAREN=121, CLOSE_PAREN=122, WHITE_SPACE=123, 
		AT=124, INVALID_TOKEN=125;
	public static final int
		RULE_smali = 0, RULE_member = 1, RULE_classSpec = 2, RULE_accessList = 3, 
		RULE_superSpec = 4, RULE_sourceSpec = 5, RULE_implementsSpec = 6, RULE_annotation = 7, 
		RULE_annotation_element = 8, RULE_subannotation = 9, RULE_simpleName = 10, 
		RULE_memberName = 11, RULE_literal = 12, RULE_integerLiteral = 13, RULE_floatLiteral = 14, 
		RULE_doubleLiteral = 15, RULE_arrayLiteral = 16, RULE_typeLiteral = 17, 
		RULE_fieldLiteral = 18, RULE_fieldReference = 19, RULE_methodLiteral = 20, 
		RULE_methodReference = 21, RULE_methodProto = 22, RULE_type_descriptor = 23, 
		RULE_paramList = 24, RULE_paramArg = 25, RULE_reference_type_descriptor = 26, 
		RULE_nonvoid_type_descriptor = 27, RULE_enumLiteral = 28, RULE_methodHandleLiteral = 29, 
		RULE_methodHandleReference = 30, RULE_field = 31, RULE_method = 32, RULE_statement_or_directive = 33, 
		RULE_registersDirective = 34, RULE_catchDirective = 35, RULE_catchallDirective = 36, 
		RULE_parameterDirective = 37, RULE_integralLiteral = 38, RULE_label_ref = 39, 
		RULE_label = 40, RULE_lineDirective = 41, RULE_localDirective = 42, RULE_endLocalDirective = 43, 
		RULE_restartLocalDirective = 44, RULE_sourceDirective = 45, RULE_instruction_format12x = 46, 
		RULE_instruction_format22s = 47, RULE_instruction_format31i = 48, RULE_instruction_format35c_method = 49, 
		RULE_insn_format10t = 50, RULE_insn_format10x = 51, RULE_insn_format10x_odex = 52, 
		RULE_insn_format11n = 53, RULE_insn_format11x = 54, RULE_insn_format12x = 55, 
		RULE_insn_format20bc = 56, RULE_insn_format20t = 57, RULE_insn_format21c_field = 58, 
		RULE_insn_format21c_field_odex = 59, RULE_insn_format21c_method_handle = 60, 
		RULE_insn_format21c_method_type = 61, RULE_insn_format21c_string = 62, 
		RULE_insn_format21c_type = 63, RULE_insn_format21ih = 64, RULE_insn_format21lh = 65, 
		RULE_insn_format21s = 66, RULE_insn_format21t = 67, RULE_insn_format22b = 68, 
		RULE_insn_format22c_field = 69, RULE_insn_format22c_field_odex = 70, RULE_insn_format22c_type = 71, 
		RULE_insn_format22cs_field = 72, RULE_insn_format22s = 73, RULE_insn_format22t = 74, 
		RULE_insn_format22x = 75, RULE_insn_format23x = 76, RULE_insn_format30t = 77, 
		RULE_insn_format31c = 78, RULE_insn_format31i = 79, RULE_insn_format31t = 80, 
		RULE_insn_format32x = 81, RULE_insn_format35c_call_site = 82, RULE_insn_format35c_method = 83, 
		RULE_insn_format35c_type = 84, RULE_insn_format35c_method_odex = 85, RULE_insn_format35mi_method = 86, 
		RULE_insn_format35ms_method = 87, RULE_insn_format3rc_call_site = 88, 
		RULE_insn_format3rc_method = 89, RULE_insn_format3rc_method_odex = 90, 
		RULE_insn_format3rc_type = 91, RULE_insn_format3rmi_method = 92, RULE_insn_format3rms_method = 93, 
		RULE_insn_format45cc_method = 94, RULE_insn_format4rcc_method = 95, RULE_insn_format51l = 96, 
		RULE_insn_array_data_directive = 97, RULE_insn_packed_switch_directive = 98, 
		RULE_insn_sparse_switch_directive = 99, RULE_switchElement = 100, RULE_register_list = 101, 
		RULE_register_range = 102, RULE_verification_error_reference = 103, RULE_callsiteReference = 104, 
		RULE_fixed32bitLiteral = 105, RULE_fixed64bitLiteral = 106;
	private static String[] makeRuleNames() {
		return new String[] {
			"smali", "member", "classSpec", "accessList", "superSpec", "sourceSpec", 
			"implementsSpec", "annotation", "annotation_element", "subannotation", 
			"simpleName", "memberName", "literal", "integerLiteral", "floatLiteral", 
			"doubleLiteral", "arrayLiteral", "typeLiteral", "fieldLiteral", "fieldReference", 
			"methodLiteral", "methodReference", "methodProto", "type_descriptor", 
			"paramList", "paramArg", "reference_type_descriptor", "nonvoid_type_descriptor", 
			"enumLiteral", "methodHandleLiteral", "methodHandleReference", "field", 
			"method", "statement_or_directive", "registersDirective", "catchDirective", 
			"catchallDirective", "parameterDirective", "integralLiteral", "label_ref", 
			"label", "lineDirective", "localDirective", "endLocalDirective", "restartLocalDirective", 
			"sourceDirective", "instruction_format12x", "instruction_format22s", 
			"instruction_format31i", "instruction_format35c_method", "insn_format10t", 
			"insn_format10x", "insn_format10x_odex", "insn_format11n", "insn_format11x", 
			"insn_format12x", "insn_format20bc", "insn_format20t", "insn_format21c_field", 
			"insn_format21c_field_odex", "insn_format21c_method_handle", "insn_format21c_method_type", 
			"insn_format21c_string", "insn_format21c_type", "insn_format21ih", "insn_format21lh", 
			"insn_format21s", "insn_format21t", "insn_format22b", "insn_format22c_field", 
			"insn_format22c_field_odex", "insn_format22c_type", "insn_format22cs_field", 
			"insn_format22s", "insn_format22t", "insn_format22x", "insn_format23x", 
			"insn_format30t", "insn_format31c", "insn_format31i", "insn_format31t", 
			"insn_format32x", "insn_format35c_call_site", "insn_format35c_method", 
			"insn_format35c_type", "insn_format35c_method_odex", "insn_format35mi_method", 
			"insn_format35ms_method", "insn_format3rc_call_site", "insn_format3rc_method", 
			"insn_format3rc_method_odex", "insn_format3rc_type", "insn_format3rmi_method", 
			"insn_format3rms_method", "insn_format45cc_method", "insn_format4rcc_method", 
			"insn_format51l", "insn_array_data_directive", "insn_packed_switch_directive", 
			"insn_sparse_switch_directive", "switchElement", "register_list", "register_range", 
			"verification_error_reference", "callsiteReference", "fixed32bitLiteral", 
			"fixed64bitLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.class'", "'.super'", "'.implements'", "'.source'", "'.field'", 
			"'.end field'", "'.subannotation'", "'.end subannotation'", "'.annotation'", 
			"'.end annotation'", "'.enum'", "'.method'", "'.end method'", "'.registers'", 
			"'.locals'", "'.array-data'", "'.end array-data'", "'.packed-switch'", 
			"'.end packed-switch'", "'.sparse-switch'", "'.end sparse-switch'", "'.catch'", 
			"'.catchall'", "'.line'", "'.param'", "'.end param'", "'.local'", "'.end local'", 
			"'.restart local'", "'.prologue'", "'.epilogue'", null, null, null, null, 
			null, null, null, null, null, null, "'null'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'goto'", null, null, 
			"'const/4'", null, null, null, "'throw-verification-error'", "'goto/16'", 
			null, null, "'const-string'", null, "'const-method-handle'", "'const-method-type'", 
			"'const/high16'", "'const-wide/high16'", null, null, null, null, null, 
			null, null, "'rsub-int'", null, null, null, null, "'goto/32'", "'const-string/jumbo'", 
			"'const'", "'const-wide/32'", null, null, "'invoke-custom'", null, null, 
			"'invoke-direct-empty'", "'filled-new-array'", "'execute-inline'", null, 
			"'invoke-custom/range'", null, "'invoke-object-init/range'", "'filled-new-array/range'", 
			"'execute-inline/range'", null, "'invoke-polymorphic'", "'invoke-polymorphic/range'", 
			"'const-wide'", "'V'", null, null, null, null, null, null, null, "'..'", 
			"'->'", "'='", "':'", "','", "'{'", "'}'", "'('", "')'", null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS_DIRECTIVE", "SUPER_DIRECTIVE", "IMPLEMENTS_DIRECTIVE", "SOURCE_DIRECTIVE", 
			"FIELD_DIRECTIVE", "END_FIELD_DIRECTIVE", "SUBANNOTATION_DIRECTIVE", 
			"END_SUBANNOTATION_DIRECTIVE", "ANNOTATION_DIRECTIVE", "END_ANNOTATION_DIRECTIVE", 
			"ENUM_DIRECTIVE", "METHOD_DIRECTIVE", "END_METHOD_DIRECTIVE", "REGISTERS_DIRECTIVE", 
			"LOCALS_DIRECTIVE", "ARRAY_DATA_DIRECTIVE", "END_ARRAY_DATA_DIRECTIVE", 
			"PACKED_SWITCH_DIRECTIVE", "END_PACKED_SWITCH_DIRECTIVE", "SPARSE_SWITCH_DIRECTIVE", 
			"END_SPARSE_SWITCH_DIRECTIVE", "CATCH_DIRECTIVE", "CATCHALL_DIRECTIVE", 
			"LINE_DIRECTIVE", "PARAMETER_DIRECTIVE", "END_PARAMETER_DIRECTIVE", "LOCAL_DIRECTIVE", 
			"END_LOCAL_DIRECTIVE", "RESTART_LOCAL_DIRECTIVE", "PROLOGUE_DIRECTIVE", 
			"EPILOGUE_DIRECTIVE", "POSITIVE_INTEGER_LITERAL", "NEGATIVE_INTEGER_LITERAL", 
			"LONG_LITERAL", "SHORT_LITERAL", "BYTE_LITERAL", "FLOAT_LITERAL_OR_ID", 
			"DOUBLE_LITERAL_OR_ID", "FLOAT_LITERAL", "DOUBLE_LITERAL", "BOOL_LITERAL", 
			"NULL_LITERAL", "STRING_LITERAL", "CHAR_LITERAL", "REGISTER", "ACCESS_SPEC", 
			"ANNOTATION_VISIBILITY", "VERIFICATION_ERROR_TYPE", "INLINE_INDEX", "VTABLE_INDEX", 
			"FIELD_OFFSET", "METHOD_HANDLE_TYPE_FIELD", "METHOD_HANDLE_TYPE_METHOD", 
			"LINE_COMMENT", "INSTRUCTION_FORMAT10t", "INSTRUCTION_FORMAT10x", "INSTRUCTION_FORMAT10x_ODEX", 
			"INSTRUCTION_FORMAT11n", "INSTRUCTION_FORMAT11x", "INSTRUCTION_FORMAT12x_OR_ID", 
			"INSTRUCTION_FORMAT12x", "INSTRUCTION_FORMAT20bc", "INSTRUCTION_FORMAT20t", 
			"INSTRUCTION_FORMAT21c_FIELD", "INSTRUCTION_FORMAT21c_FIELD_ODEX", "INSTRUCTION_FORMAT21c_STRING", 
			"INSTRUCTION_FORMAT21c_TYPE", "INSTRUCTION_FORMAT21c_METHOD_HANDLE", 
			"INSTRUCTION_FORMAT21c_METHOD_TYPE", "INSTRUCTION_FORMAT21ih", "INSTRUCTION_FORMAT21lh", 
			"INSTRUCTION_FORMAT21s", "INSTRUCTION_FORMAT21t", "INSTRUCTION_FORMAT22b", 
			"INSTRUCTION_FORMAT22c_FIELD", "INSTRUCTION_FORMAT22c_FIELD_ODEX", "INSTRUCTION_FORMAT22c_TYPE", 
			"INSTRUCTION_FORMAT22cs_FIELD", "INSTRUCTION_FORMAT22s_OR_ID", "INSTRUCTION_FORMAT22s", 
			"INSTRUCTION_FORMAT22t", "INSTRUCTION_FORMAT22x", "INSTRUCTION_FORMAT23x", 
			"INSTRUCTION_FORMAT30t", "INSTRUCTION_FORMAT31c", "INSTRUCTION_FORMAT31i_OR_ID", 
			"INSTRUCTION_FORMAT31i", "INSTRUCTION_FORMAT31t", "INSTRUCTION_FORMAT32x", 
			"INSTRUCTION_FORMAT35c_CALL_SITE", "INSTRUCTION_FORMAT35c_METHOD", "INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE", 
			"INSTRUCTION_FORMAT35c_METHOD_ODEX", "INSTRUCTION_FORMAT35c_TYPE", "INSTRUCTION_FORMAT35mi_METHOD", 
			"INSTRUCTION_FORMAT35ms_METHOD", "INSTRUCTION_FORMAT3rc_CALL_SITE", "INSTRUCTION_FORMAT3rc_METHOD", 
			"INSTRUCTION_FORMAT3rc_METHOD_ODEX", "INSTRUCTION_FORMAT3rc_TYPE", "INSTRUCTION_FORMAT3rmi_METHOD", 
			"INSTRUCTION_FORMAT3rms_METHOD", "INSTRUCTION_FORMAT45cc_METHOD", "INSTRUCTION_FORMAT4rcc_METHOD", 
			"INSTRUCTION_FORMAT51l", "VOID_TYPE", "CLASS_DESCRIPTOR", "PRIMITIVE_TYPE", 
			"ARRAY_DESCRIPTOR", "TYPE_LIST", "PRIMITIVE_LIST", "SIMPLE_NAME", "MEMBER_NAME", 
			"DOTDOT", "ARROW", "EQUAL", "COLON", "COMMA", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_PAREN", "CLOSE_PAREN", "WHITE_SPACE", "AT", "INVALID_TOKEN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Smali.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private String thisType;

	public SmaliParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SmaliContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SmaliParser.EOF, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public SmaliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smali; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSmali(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmaliContext smali() throws RecognitionException {
		SmaliContext _localctx = new SmaliContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_smali);

		    thisType = null;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS_DIRECTIVE) | (1L << SUPER_DIRECTIVE) | (1L << IMPLEMENTS_DIRECTIVE) | (1L << SOURCE_DIRECTIVE) | (1L << FIELD_DIRECTIVE) | (1L << ANNOTATION_DIRECTIVE) | (1L << METHOD_DIRECTIVE))) != 0)) {
				{
				{
				setState(214);
				member();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	 
		public MemberContext() { }
		public void copyFrom(MemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SuperAltContext extends MemberContext {
		public SuperSpecContext superSpec() {
			return getRuleContext(SuperSpecContext.class,0);
		}
		public SuperAltContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSuperAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplementsAltContext extends MemberContext {
		public ImplementsSpecContext implementsSpec() {
			return getRuleContext(ImplementsSpecContext.class,0);
		}
		public ImplementsAltContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitImplementsAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAltContext extends MemberContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldAltContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFieldAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SourceFileAltContext extends MemberContext {
		public SourceSpecContext sourceSpec() {
			return getRuleContext(SourceSpecContext.class,0);
		}
		public SourceFileAltContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSourceFileAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodAltContext extends MemberContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public MethodAltContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassAnnotationAltContext extends MemberContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassAnnotationAltContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitClassAnnotationAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassAltContext extends MemberContext {
		public ClassSpecContext classSpec() {
			return getRuleContext(ClassSpecContext.class,0);
		}
		public ClassAltContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitClassAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_member);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_DIRECTIVE:
				_localctx = new ClassAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				classSpec();
				}
				break;
			case SUPER_DIRECTIVE:
				_localctx = new SuperAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				superSpec();
				}
				break;
			case SOURCE_DIRECTIVE:
				_localctx = new SourceFileAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				sourceSpec();
				}
				break;
			case IMPLEMENTS_DIRECTIVE:
				_localctx = new ImplementsAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				implementsSpec();
				}
				break;
			case ANNOTATION_DIRECTIVE:
				_localctx = new ClassAnnotationAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				annotation();
				}
				break;
			case FIELD_DIRECTIVE:
				_localctx = new FieldAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				field();
				}
				break;
			case METHOD_DIRECTIVE:
				_localctx = new MethodAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				method();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassSpecContext extends ParserRuleContext {
		public Token CLASS_DESCRIPTOR;
		public TerminalNode CLASS_DIRECTIVE() { return getToken(SmaliParser.CLASS_DIRECTIVE, 0); }
		public AccessListContext accessList() {
			return getRuleContext(AccessListContext.class,0);
		}
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public ClassSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitClassSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSpecContext classSpec() throws RecognitionException {
		ClassSpecContext _localctx = new ClassSpecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(CLASS_DIRECTIVE);
			setState(232);
			accessList();
			setState(233);
			((ClassSpecContext)_localctx).CLASS_DESCRIPTOR = match(CLASS_DESCRIPTOR);
			thisType=(((ClassSpecContext)_localctx).CLASS_DESCRIPTOR!=null?((ClassSpecContext)_localctx).CLASS_DESCRIPTOR.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessListContext extends ParserRuleContext {
		public List<TerminalNode> ACCESS_SPEC() { return getTokens(SmaliParser.ACCESS_SPEC); }
		public TerminalNode ACCESS_SPEC(int i) {
			return getToken(SmaliParser.ACCESS_SPEC, i);
		}
		public AccessListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitAccessList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessListContext accessList() throws RecognitionException {
		AccessListContext _localctx = new AccessListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_accessList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					match(ACCESS_SPEC);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSpecContext extends ParserRuleContext {
		public TerminalNode SUPER_DIRECTIVE() { return getToken(SmaliParser.SUPER_DIRECTIVE, 0); }
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public SuperSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSuperSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSpecContext superSpec() throws RecognitionException {
		SuperSpecContext _localctx = new SuperSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_superSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(SUPER_DIRECTIVE);
			setState(243);
			match(CLASS_DESCRIPTOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceSpecContext extends ParserRuleContext {
		public TerminalNode SOURCE_DIRECTIVE() { return getToken(SmaliParser.SOURCE_DIRECTIVE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public SourceSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSourceSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceSpecContext sourceSpec() throws RecognitionException {
		SourceSpecContext _localctx = new SourceSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sourceSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(SOURCE_DIRECTIVE);
			setState(246);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsSpecContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS_DIRECTIVE() { return getToken(SmaliParser.IMPLEMENTS_DIRECTIVE, 0); }
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public ImplementsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitImplementsSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsSpecContext implementsSpec() throws RecognitionException {
		ImplementsSpecContext _localctx = new ImplementsSpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_implementsSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(IMPLEMENTS_DIRECTIVE);
			setState(249);
			match(CLASS_DESCRIPTOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode ANNOTATION_DIRECTIVE() { return getToken(SmaliParser.ANNOTATION_DIRECTIVE, 0); }
		public TerminalNode ANNOTATION_VISIBILITY() { return getToken(SmaliParser.ANNOTATION_VISIBILITY, 0); }
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public TerminalNode END_ANNOTATION_DIRECTIVE() { return getToken(SmaliParser.END_ANNOTATION_DIRECTIVE, 0); }
		public List<Annotation_elementContext> annotation_element() {
			return getRuleContexts(Annotation_elementContext.class);
		}
		public Annotation_elementContext annotation_element(int i) {
			return getRuleContext(Annotation_elementContext.class,i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ANNOTATION_DIRECTIVE);
			setState(252);
			match(ANNOTATION_VISIBILITY);
			setState(253);
			match(CLASS_DESCRIPTOR);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << DOUBLE_LITERAL_OR_ID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << REGISTER) | (1L << ACCESS_SPEC) | (1L << ANNOTATION_VISIBILITY) | (1L << VERIFICATION_ERROR_TYPE) | (1L << METHOD_HANDLE_TYPE_FIELD) | (1L << METHOD_HANDLE_TYPE_METHOD) | (1L << INSTRUCTION_FORMAT10t) | (1L << INSTRUCTION_FORMAT10x) | (1L << INSTRUCTION_FORMAT10x_ODEX) | (1L << INSTRUCTION_FORMAT11x) | (1L << INSTRUCTION_FORMAT12x_OR_ID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INSTRUCTION_FORMAT21c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT21c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT21c_STRING - 64)) | (1L << (INSTRUCTION_FORMAT21c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_HANDLE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21t - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT22c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT22cs_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22s_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT22t - 64)) | (1L << (INSTRUCTION_FORMAT23x - 64)) | (1L << (INSTRUCTION_FORMAT31i_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT31t - 64)) | (1L << (INSTRUCTION_FORMAT35c_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT35c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35mi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35ms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT45cc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT4rcc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT51l - 64)) | (1L << (VOID_TYPE - 64)) | (1L << (PRIMITIVE_TYPE - 64)) | (1L << (PRIMITIVE_LIST - 64)) | (1L << (SIMPLE_NAME - 64)))) != 0)) {
				{
				{
				setState(254);
				annotation_element();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(END_ANNOTATION_DIRECTIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_elementContext extends ParserRuleContext {
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SmaliParser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Annotation_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitAnnotation_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_elementContext annotation_element() throws RecognitionException {
		Annotation_elementContext _localctx = new Annotation_elementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_annotation_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			simpleName();
			setState(263);
			match(EQUAL);
			setState(264);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubannotationContext extends ParserRuleContext {
		public Token type;
		public TerminalNode SUBANNOTATION_DIRECTIVE() { return getToken(SmaliParser.SUBANNOTATION_DIRECTIVE, 0); }
		public TerminalNode END_SUBANNOTATION_DIRECTIVE() { return getToken(SmaliParser.END_SUBANNOTATION_DIRECTIVE, 0); }
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public List<Annotation_elementContext> annotation_element() {
			return getRuleContexts(Annotation_elementContext.class);
		}
		public Annotation_elementContext annotation_element(int i) {
			return getRuleContext(Annotation_elementContext.class,i);
		}
		public SubannotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subannotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSubannotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubannotationContext subannotation() throws RecognitionException {
		SubannotationContext _localctx = new SubannotationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subannotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(SUBANNOTATION_DIRECTIVE);
			setState(267);
			((SubannotationContext)_localctx).type = match(CLASS_DESCRIPTOR);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << DOUBLE_LITERAL_OR_ID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << REGISTER) | (1L << ACCESS_SPEC) | (1L << ANNOTATION_VISIBILITY) | (1L << VERIFICATION_ERROR_TYPE) | (1L << METHOD_HANDLE_TYPE_FIELD) | (1L << METHOD_HANDLE_TYPE_METHOD) | (1L << INSTRUCTION_FORMAT10t) | (1L << INSTRUCTION_FORMAT10x) | (1L << INSTRUCTION_FORMAT10x_ODEX) | (1L << INSTRUCTION_FORMAT11x) | (1L << INSTRUCTION_FORMAT12x_OR_ID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INSTRUCTION_FORMAT21c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT21c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT21c_STRING - 64)) | (1L << (INSTRUCTION_FORMAT21c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_HANDLE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21t - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT22c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT22cs_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22s_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT22t - 64)) | (1L << (INSTRUCTION_FORMAT23x - 64)) | (1L << (INSTRUCTION_FORMAT31i_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT31t - 64)) | (1L << (INSTRUCTION_FORMAT35c_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT35c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35mi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35ms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT45cc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT4rcc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT51l - 64)) | (1L << (VOID_TYPE - 64)) | (1L << (PRIMITIVE_TYPE - 64)) | (1L << (PRIMITIVE_LIST - 64)) | (1L << (SIMPLE_NAME - 64)))) != 0)) {
				{
				{
				setState(268);
				annotation_element();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(END_SUBANNOTATION_DIRECTIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleNameContext extends ParserRuleContext {
		public TerminalNode SIMPLE_NAME() { return getToken(SmaliParser.SIMPLE_NAME, 0); }
		public TerminalNode ACCESS_SPEC() { return getToken(SmaliParser.ACCESS_SPEC, 0); }
		public TerminalNode VERIFICATION_ERROR_TYPE() { return getToken(SmaliParser.VERIFICATION_ERROR_TYPE, 0); }
		public TerminalNode POSITIVE_INTEGER_LITERAL() { return getToken(SmaliParser.POSITIVE_INTEGER_LITERAL, 0); }
		public TerminalNode NEGATIVE_INTEGER_LITERAL() { return getToken(SmaliParser.NEGATIVE_INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL_OR_ID() { return getToken(SmaliParser.FLOAT_LITERAL_OR_ID, 0); }
		public TerminalNode DOUBLE_LITERAL_OR_ID() { return getToken(SmaliParser.DOUBLE_LITERAL_OR_ID, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(SmaliParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(SmaliParser.NULL_LITERAL, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode PRIMITIVE_LIST() { return getToken(SmaliParser.PRIMITIVE_LIST, 0); }
		public TerminalNode PRIMITIVE_TYPE() { return getToken(SmaliParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(SmaliParser.VOID_TYPE, 0); }
		public TerminalNode ANNOTATION_VISIBILITY() { return getToken(SmaliParser.ANNOTATION_VISIBILITY, 0); }
		public TerminalNode METHOD_HANDLE_TYPE_FIELD() { return getToken(SmaliParser.METHOD_HANDLE_TYPE_FIELD, 0); }
		public TerminalNode METHOD_HANDLE_TYPE_METHOD() { return getToken(SmaliParser.METHOD_HANDLE_TYPE_METHOD, 0); }
		public TerminalNode INSTRUCTION_FORMAT10t() { return getToken(SmaliParser.INSTRUCTION_FORMAT10t, 0); }
		public TerminalNode INSTRUCTION_FORMAT10x() { return getToken(SmaliParser.INSTRUCTION_FORMAT10x, 0); }
		public TerminalNode INSTRUCTION_FORMAT10x_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT10x_ODEX, 0); }
		public TerminalNode INSTRUCTION_FORMAT11x() { return getToken(SmaliParser.INSTRUCTION_FORMAT11x, 0); }
		public TerminalNode INSTRUCTION_FORMAT12x_OR_ID() { return getToken(SmaliParser.INSTRUCTION_FORMAT12x_OR_ID, 0); }
		public TerminalNode INSTRUCTION_FORMAT21c_FIELD() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_FIELD, 0); }
		public TerminalNode INSTRUCTION_FORMAT21c_FIELD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_FIELD_ODEX, 0); }
		public TerminalNode INSTRUCTION_FORMAT21c_METHOD_HANDLE() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_METHOD_HANDLE, 0); }
		public TerminalNode INSTRUCTION_FORMAT21c_METHOD_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_METHOD_TYPE, 0); }
		public TerminalNode INSTRUCTION_FORMAT21c_STRING() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_STRING, 0); }
		public TerminalNode INSTRUCTION_FORMAT21c_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_TYPE, 0); }
		public TerminalNode INSTRUCTION_FORMAT21t() { return getToken(SmaliParser.INSTRUCTION_FORMAT21t, 0); }
		public TerminalNode INSTRUCTION_FORMAT22c_FIELD() { return getToken(SmaliParser.INSTRUCTION_FORMAT22c_FIELD, 0); }
		public TerminalNode INSTRUCTION_FORMAT22c_FIELD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT22c_FIELD_ODEX, 0); }
		public TerminalNode INSTRUCTION_FORMAT22c_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT22c_TYPE, 0); }
		public TerminalNode INSTRUCTION_FORMAT22cs_FIELD() { return getToken(SmaliParser.INSTRUCTION_FORMAT22cs_FIELD, 0); }
		public TerminalNode INSTRUCTION_FORMAT22s_OR_ID() { return getToken(SmaliParser.INSTRUCTION_FORMAT22s_OR_ID, 0); }
		public TerminalNode INSTRUCTION_FORMAT22t() { return getToken(SmaliParser.INSTRUCTION_FORMAT22t, 0); }
		public TerminalNode INSTRUCTION_FORMAT23x() { return getToken(SmaliParser.INSTRUCTION_FORMAT23x, 0); }
		public TerminalNode INSTRUCTION_FORMAT31i_OR_ID() { return getToken(SmaliParser.INSTRUCTION_FORMAT31i_OR_ID, 0); }
		public TerminalNode INSTRUCTION_FORMAT31t() { return getToken(SmaliParser.INSTRUCTION_FORMAT31t, 0); }
		public TerminalNode INSTRUCTION_FORMAT35c_CALL_SITE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_CALL_SITE, 0); }
		public TerminalNode INSTRUCTION_FORMAT35c_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_METHOD, 0); }
		public TerminalNode INSTRUCTION_FORMAT35c_METHOD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_METHOD_ODEX, 0); }
		public TerminalNode INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE, 0); }
		public TerminalNode INSTRUCTION_FORMAT35c_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_TYPE, 0); }
		public TerminalNode INSTRUCTION_FORMAT35mi_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT35mi_METHOD, 0); }
		public TerminalNode INSTRUCTION_FORMAT35ms_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT35ms_METHOD, 0); }
		public TerminalNode INSTRUCTION_FORMAT45cc_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT45cc_METHOD, 0); }
		public TerminalNode INSTRUCTION_FORMAT4rcc_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT4rcc_METHOD, 0); }
		public TerminalNode INSTRUCTION_FORMAT51l() { return getToken(SmaliParser.INSTRUCTION_FORMAT51l, 0); }
		public SimpleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSimpleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleNameContext simpleName() throws RecognitionException {
		SimpleNameContext _localctx = new SimpleNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << DOUBLE_LITERAL_OR_ID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << REGISTER) | (1L << ACCESS_SPEC) | (1L << ANNOTATION_VISIBILITY) | (1L << VERIFICATION_ERROR_TYPE) | (1L << METHOD_HANDLE_TYPE_FIELD) | (1L << METHOD_HANDLE_TYPE_METHOD) | (1L << INSTRUCTION_FORMAT10t) | (1L << INSTRUCTION_FORMAT10x) | (1L << INSTRUCTION_FORMAT10x_ODEX) | (1L << INSTRUCTION_FORMAT11x) | (1L << INSTRUCTION_FORMAT12x_OR_ID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INSTRUCTION_FORMAT21c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT21c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT21c_STRING - 64)) | (1L << (INSTRUCTION_FORMAT21c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_HANDLE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21t - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT22c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT22cs_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22s_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT22t - 64)) | (1L << (INSTRUCTION_FORMAT23x - 64)) | (1L << (INSTRUCTION_FORMAT31i_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT31t - 64)) | (1L << (INSTRUCTION_FORMAT35c_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT35c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35mi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35ms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT45cc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT4rcc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT51l - 64)) | (1L << (VOID_TYPE - 64)) | (1L << (PRIMITIVE_TYPE - 64)) | (1L << (PRIMITIVE_LIST - 64)) | (1L << (SIMPLE_NAME - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberNameContext extends ParserRuleContext {
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode MEMBER_NAME() { return getToken(SmaliParser.MEMBER_NAME, 0); }
		public MemberNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMemberName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberNameContext memberName() throws RecognitionException {
		MemberNameContext _localctx = new MemberNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memberName);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITIVE_INTEGER_LITERAL:
			case NEGATIVE_INTEGER_LITERAL:
			case FLOAT_LITERAL_OR_ID:
			case DOUBLE_LITERAL_OR_ID:
			case BOOL_LITERAL:
			case NULL_LITERAL:
			case REGISTER:
			case ACCESS_SPEC:
			case ANNOTATION_VISIBILITY:
			case VERIFICATION_ERROR_TYPE:
			case METHOD_HANDLE_TYPE_FIELD:
			case METHOD_HANDLE_TYPE_METHOD:
			case INSTRUCTION_FORMAT10t:
			case INSTRUCTION_FORMAT10x:
			case INSTRUCTION_FORMAT10x_ODEX:
			case INSTRUCTION_FORMAT11x:
			case INSTRUCTION_FORMAT12x_OR_ID:
			case INSTRUCTION_FORMAT21c_FIELD:
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
			case INSTRUCTION_FORMAT21c_STRING:
			case INSTRUCTION_FORMAT21c_TYPE:
			case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
			case INSTRUCTION_FORMAT21c_METHOD_TYPE:
			case INSTRUCTION_FORMAT21t:
			case INSTRUCTION_FORMAT22c_FIELD:
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
			case INSTRUCTION_FORMAT22c_TYPE:
			case INSTRUCTION_FORMAT22cs_FIELD:
			case INSTRUCTION_FORMAT22s_OR_ID:
			case INSTRUCTION_FORMAT22t:
			case INSTRUCTION_FORMAT23x:
			case INSTRUCTION_FORMAT31i_OR_ID:
			case INSTRUCTION_FORMAT31t:
			case INSTRUCTION_FORMAT35c_CALL_SITE:
			case INSTRUCTION_FORMAT35c_METHOD:
			case INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE:
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
			case INSTRUCTION_FORMAT35c_TYPE:
			case INSTRUCTION_FORMAT35mi_METHOD:
			case INSTRUCTION_FORMAT35ms_METHOD:
			case INSTRUCTION_FORMAT45cc_METHOD:
			case INSTRUCTION_FORMAT4rcc_METHOD:
			case INSTRUCTION_FORMAT51l:
			case VOID_TYPE:
			case PRIMITIVE_TYPE:
			case PRIMITIVE_LIST:
			case SIMPLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				simpleName();
				}
				break;
			case MEMBER_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(MEMBER_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ByteLiteralAltContext extends LiteralContext {
		public TerminalNode BYTE_LITERAL() { return getToken(SmaliParser.BYTE_LITERAL, 0); }
		public ByteLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitByteLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeLiteralAltContext extends LiteralContext {
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public TypeLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitTypeLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralAltContext extends LiteralContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public IntegerLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitIntegerLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralAltContext extends LiteralContext {
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public FloatLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFloatLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnumLiteralAltContext extends LiteralContext {
		public EnumLiteralContext enumLiteral() {
			return getRuleContext(EnumLiteralContext.class,0);
		}
		public EnumLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitEnumLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralAltContext extends LiteralContext {
		public DoubleLiteralContext doubleLiteral() {
			return getRuleContext(DoubleLiteralContext.class,0);
		}
		public DoubleLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitDoubleLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldLiteralAltContext extends LiteralContext {
		public FieldLiteralContext fieldLiteral() {
			return getRuleContext(FieldLiteralContext.class,0);
		}
		public FieldLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFieldLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteralAltContext extends LiteralContext {
		public TerminalNode CHAR_LITERAL() { return getToken(SmaliParser.CHAR_LITERAL, 0); }
		public CharLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitCharLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShortLiteralAltContext extends LiteralContext {
		public TerminalNode SHORT_LITERAL() { return getToken(SmaliParser.SHORT_LITERAL, 0); }
		public ShortLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitShortLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodLiteralAltContext extends LiteralContext {
		public MethodLiteralContext methodLiteral() {
			return getRuleContext(MethodLiteralContext.class,0);
		}
		public MethodLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralAltContext extends LiteralContext {
		public TerminalNode BOOL_LITERAL() { return getToken(SmaliParser.BOOL_LITERAL, 0); }
		public BooleanLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitBooleanLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodProtoLiteralAltContext extends LiteralContext {
		public MethodProtoContext methodProto() {
			return getRuleContext(MethodProtoContext.class,0);
		}
		public MethodProtoLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodProtoLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralAltContext extends LiteralContext {
		public TerminalNode NULL_LITERAL() { return getToken(SmaliParser.NULL_LITERAL, 0); }
		public NullLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitNullLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralAltContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public StringLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitStringLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongLiteralAltContext extends LiteralContext {
		public TerminalNode LONG_LITERAL() { return getToken(SmaliParser.LONG_LITERAL, 0); }
		public LongLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLongLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodHandleLiteralAltContext extends LiteralContext {
		public MethodHandleLiteralContext methodHandleLiteral() {
			return getRuleContext(MethodHandleLiteralContext.class,0);
		}
		public MethodHandleLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodHandleLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLiteralAltContext extends LiteralContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitArrayLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubAnnotationLiteralAltContext extends LiteralContext {
		public SubannotationContext subannotation() {
			return getRuleContext(SubannotationContext.class,0);
		}
		public SubAnnotationLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSubAnnotationLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new LongLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(LONG_LITERAL);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				integerLiteral();
				}
				break;
			case 3:
				_localctx = new ShortLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(SHORT_LITERAL);
				}
				break;
			case 4:
				_localctx = new ByteLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(BYTE_LITERAL);
				}
				break;
			case 5:
				_localctx = new FloatLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				floatLiteral();
				}
				break;
			case 6:
				_localctx = new DoubleLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				doubleLiteral();
				}
				break;
			case 7:
				_localctx = new CharLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(CHAR_LITERAL);
				}
				break;
			case 8:
				_localctx = new StringLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				match(STRING_LITERAL);
				}
				break;
			case 9:
				_localctx = new BooleanLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(290);
				match(BOOL_LITERAL);
				}
				break;
			case 10:
				_localctx = new NullLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(291);
				match(NULL_LITERAL);
				}
				break;
			case 11:
				_localctx = new ArrayLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(292);
				arrayLiteral();
				}
				break;
			case 12:
				_localctx = new SubAnnotationLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(293);
				subannotation();
				}
				break;
			case 13:
				_localctx = new TypeLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(294);
				typeLiteral();
				}
				break;
			case 14:
				_localctx = new FieldLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(295);
				fieldLiteral();
				}
				break;
			case 15:
				_localctx = new MethodLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(296);
				methodLiteral();
				}
				break;
			case 16:
				_localctx = new EnumLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(297);
				enumLiteral();
				}
				break;
			case 17:
				_localctx = new MethodHandleLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(298);
				methodHandleLiteral();
				}
				break;
			case 18:
				_localctx = new MethodProtoLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(299);
				methodProto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode POSITIVE_INTEGER_LITERAL() { return getToken(SmaliParser.POSITIVE_INTEGER_LITERAL, 0); }
		public TerminalNode NEGATIVE_INTEGER_LITERAL() { return getToken(SmaliParser.NEGATIVE_INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==POSITIVE_INTEGER_LITERAL || _la==NEGATIVE_INTEGER_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL_OR_ID() { return getToken(SmaliParser.FLOAT_LITERAL_OR_ID, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(SmaliParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL_OR_ID || _la==FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleLiteralContext extends ParserRuleContext {
		public Token val;
		public TerminalNode DOUBLE_LITERAL_OR_ID() { return getToken(SmaliParser.DOUBLE_LITERAL_OR_ID, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(SmaliParser.DOUBLE_LITERAL, 0); }
		public DoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleLiteralContext doubleLiteral() throws RecognitionException {
		DoubleLiteralContext _localctx = new DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doubleLiteral);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_LITERAL_OR_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				((DoubleLiteralContext)_localctx).val = match(DOUBLE_LITERAL_OR_ID);
				}
				break;
			case DOUBLE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				((DoubleLiteralContext)_localctx).val = match(DOUBLE_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(OPEN_BRACE);
			setState(311);
			literal();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(312);
				match(COMMA);
				setState(313);
				literal();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeLiteralContext extends ParserRuleContext {
		public Reference_type_descriptorContext reference_type_descriptor() {
			return getRuleContext(Reference_type_descriptorContext.class,0);
		}
		public TerminalNode PRIMITIVE_TYPE() { return getToken(SmaliParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(SmaliParser.VOID_TYPE, 0); }
		public TypeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitTypeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeLiteralContext typeLiteral() throws RecognitionException {
		TypeLiteralContext _localctx = new TypeLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeLiteral);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_DESCRIPTOR:
			case ARRAY_DESCRIPTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				reference_type_descriptor();
				}
				break;
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(PRIMITIVE_TYPE);
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(VOID_TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldLiteralContext extends ParserRuleContext {
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public FieldLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFieldLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldLiteralContext fieldLiteral() throws RecognitionException {
		FieldLiteralContext _localctx = new FieldLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fieldLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			fieldReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldReferenceContext extends ParserRuleContext {
		public String defineClass;
		public Reference_type_descriptorContext reference_type_descriptor;
		public MemberNameContext memberName() {
			return getRuleContext(MemberNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public Reference_type_descriptorContext reference_type_descriptor() {
			return getRuleContext(Reference_type_descriptorContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SmaliParser.ARROW, 0); }
		public FieldReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFieldReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldReferenceContext fieldReference() throws RecognitionException {
		FieldReferenceContext _localctx = new FieldReferenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fieldReference);

		    ((FieldReferenceContext)_localctx).defineClass = thisType;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS_DESCRIPTOR || _la==ARRAY_DESCRIPTOR) {
				{
				setState(328);
				((FieldReferenceContext)_localctx).reference_type_descriptor = reference_type_descriptor();
				setState(329);
				match(ARROW);
				((FieldReferenceContext)_localctx).defineClass =  ((FieldReferenceContext)_localctx).reference_type_descriptor.type;
				}
			}

			setState(334);
			memberName();
			setState(335);
			match(COLON);
			setState(336);
			nonvoid_type_descriptor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodLiteralContext extends ParserRuleContext {
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public MethodLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodLiteralContext methodLiteral() throws RecognitionException {
		MethodLiteralContext _localctx = new MethodLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			methodReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public String defineClass;
		public Reference_type_descriptorContext reference_type_descriptor;
		public MemberNameContext memberName() {
			return getRuleContext(MemberNameContext.class,0);
		}
		public MethodProtoContext methodProto() {
			return getRuleContext(MethodProtoContext.class,0);
		}
		public Reference_type_descriptorContext reference_type_descriptor() {
			return getRuleContext(Reference_type_descriptorContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SmaliParser.ARROW, 0); }
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodReference);

		   ((MethodReferenceContext)_localctx).defineClass = thisType;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS_DESCRIPTOR || _la==ARRAY_DESCRIPTOR) {
				{
				setState(340);
				((MethodReferenceContext)_localctx).reference_type_descriptor = reference_type_descriptor();
				setState(341);
				match(ARROW);
				((MethodReferenceContext)_localctx).defineClass =  ((MethodReferenceContext)_localctx).reference_type_descriptor.type;
				}
			}

			setState(346);
			memberName();
			setState(347);
			methodProto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodProtoContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(SmaliParser.OPEN_PAREN, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SmaliParser.CLOSE_PAREN, 0); }
		public Type_descriptorContext type_descriptor() {
			return getRuleContext(Type_descriptorContext.class,0);
		}
		public MethodProtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodProto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodProto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodProtoContext methodProto() throws RecognitionException {
		MethodProtoContext _localctx = new MethodProtoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodProto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OPEN_PAREN);
			setState(350);
			paramList();
			setState(351);
			match(CLOSE_PAREN);
			setState(352);
			type_descriptor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_descriptorContext extends ParserRuleContext {
		public TerminalNode VOID_TYPE() { return getToken(SmaliParser.VOID_TYPE, 0); }
		public TerminalNode PRIMITIVE_TYPE() { return getToken(SmaliParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public TerminalNode ARRAY_DESCRIPTOR() { return getToken(SmaliParser.ARRAY_DESCRIPTOR, 0); }
		public Type_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_descriptor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitType_descriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_descriptorContext type_descriptor() throws RecognitionException {
		Type_descriptorContext _localctx = new Type_descriptorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type_descriptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (VOID_TYPE - 106)) | (1L << (CLASS_DESCRIPTOR - 106)) | (1L << (PRIMITIVE_TYPE - 106)) | (1L << (ARRAY_DESCRIPTOR - 106)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamArgContext> paramArg() {
			return getRuleContexts(ParamArgContext.class);
		}
		public ParamArgContext paramArg(int i) {
			return getRuleContext(ParamArgContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (CLASS_DESCRIPTOR - 107)) | (1L << (PRIMITIVE_TYPE - 107)) | (1L << (ARRAY_DESCRIPTOR - 107)) | (1L << (TYPE_LIST - 107)) | (1L << (PRIMITIVE_LIST - 107)))) != 0)) {
				{
				{
				setState(356);
				paramArg();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamArgContext extends ParserRuleContext {
		public ParamArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramArg; }
	 
		public ParamArgContext() { }
		public void copyFrom(ParamArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeAltContext extends ParamArgContext {
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public TypeAltContext(ParamArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitTypeAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PermitiveListContext extends ParamArgContext {
		public TerminalNode PRIMITIVE_LIST() { return getToken(SmaliParser.PRIMITIVE_LIST, 0); }
		public PermitiveListContext(ParamArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitPermitiveList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeListAltContext extends ParamArgContext {
		public TerminalNode TYPE_LIST() { return getToken(SmaliParser.TYPE_LIST, 0); }
		public TypeListAltContext(ParamArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitTypeListAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamArgContext paramArg() throws RecognitionException {
		ParamArgContext _localctx = new ParamArgContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_paramArg);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_DESCRIPTOR:
			case PRIMITIVE_TYPE:
			case ARRAY_DESCRIPTOR:
				_localctx = new TypeAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				nonvoid_type_descriptor();
				}
				break;
			case TYPE_LIST:
				_localctx = new TypeListAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(TYPE_LIST);
				}
				break;
			case PRIMITIVE_LIST:
				_localctx = new PermitiveListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(PRIMITIVE_LIST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_type_descriptorContext extends ParserRuleContext {
		public String type;
		public Token CLASS_DESCRIPTOR;
		public Token ARRAY_DESCRIPTOR;
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public TerminalNode ARRAY_DESCRIPTOR() { return getToken(SmaliParser.ARRAY_DESCRIPTOR, 0); }
		public Reference_type_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_type_descriptor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitReference_type_descriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_type_descriptorContext reference_type_descriptor() throws RecognitionException {
		Reference_type_descriptorContext _localctx = new Reference_type_descriptorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_reference_type_descriptor);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_DESCRIPTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				((Reference_type_descriptorContext)_localctx).CLASS_DESCRIPTOR = match(CLASS_DESCRIPTOR);
				((Reference_type_descriptorContext)_localctx).type = (((Reference_type_descriptorContext)_localctx).CLASS_DESCRIPTOR!=null?((Reference_type_descriptorContext)_localctx).CLASS_DESCRIPTOR.getText():null);
				}
				break;
			case ARRAY_DESCRIPTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				((Reference_type_descriptorContext)_localctx).ARRAY_DESCRIPTOR = match(ARRAY_DESCRIPTOR);
				((Reference_type_descriptorContext)_localctx).type = (((Reference_type_descriptorContext)_localctx).ARRAY_DESCRIPTOR!=null?((Reference_type_descriptorContext)_localctx).ARRAY_DESCRIPTOR.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonvoid_type_descriptorContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(SmaliParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public TerminalNode ARRAY_DESCRIPTOR() { return getToken(SmaliParser.ARRAY_DESCRIPTOR, 0); }
		public Nonvoid_type_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonvoid_type_descriptor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitNonvoid_type_descriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonvoid_type_descriptorContext nonvoid_type_descriptor() throws RecognitionException {
		Nonvoid_type_descriptorContext _localctx = new Nonvoid_type_descriptorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nonvoid_type_descriptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (CLASS_DESCRIPTOR - 107)) | (1L << (PRIMITIVE_TYPE - 107)) | (1L << (ARRAY_DESCRIPTOR - 107)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumLiteralContext extends ParserRuleContext {
		public TerminalNode ENUM_DIRECTIVE() { return getToken(SmaliParser.ENUM_DIRECTIVE, 0); }
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public EnumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitEnumLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumLiteralContext enumLiteral() throws RecognitionException {
		EnumLiteralContext _localctx = new EnumLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(ENUM_DIRECTIVE);
			setState(376);
			fieldReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHandleLiteralContext extends ParserRuleContext {
		public MethodHandleReferenceContext methodHandleReference() {
			return getRuleContext(MethodHandleReferenceContext.class,0);
		}
		public MethodHandleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHandleLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodHandleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHandleLiteralContext methodHandleLiteral() throws RecognitionException {
		MethodHandleLiteralContext _localctx = new MethodHandleLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodHandleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			methodHandleReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHandleReferenceContext extends ParserRuleContext {
		public Token type;
		public TerminalNode AT() { return getToken(SmaliParser.AT, 0); }
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public TerminalNode METHOD_HANDLE_TYPE_FIELD() { return getToken(SmaliParser.METHOD_HANDLE_TYPE_FIELD, 0); }
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public TerminalNode METHOD_HANDLE_TYPE_METHOD() { return getToken(SmaliParser.METHOD_HANDLE_TYPE_METHOD, 0); }
		public TerminalNode INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE, 0); }
		public MethodHandleReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHandleReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodHandleReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHandleReferenceContext methodHandleReference() throws RecognitionException {
		MethodHandleReferenceContext _localctx = new MethodHandleReferenceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodHandleReference);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METHOD_HANDLE_TYPE_FIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				((MethodHandleReferenceContext)_localctx).type = match(METHOD_HANDLE_TYPE_FIELD);
				setState(381);
				match(AT);
				setState(382);
				fieldReference();
				}
				break;
			case METHOD_HANDLE_TYPE_METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				((MethodHandleReferenceContext)_localctx).type = match(METHOD_HANDLE_TYPE_METHOD);
				setState(384);
				match(AT);
				setState(385);
				methodReference();
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				((MethodHandleReferenceContext)_localctx).type = match(INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE);
				setState(387);
				match(AT);
				setState(388);
				methodReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD_DIRECTIVE() { return getToken(SmaliParser.FIELD_DIRECTIVE, 0); }
		public AccessListContext accessList() {
			return getRuleContext(AccessListContext.class,0);
		}
		public MemberNameContext memberName() {
			return getRuleContext(MemberNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SmaliParser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode END_FIELD_DIRECTIVE() { return getToken(SmaliParser.END_FIELD_DIRECTIVE, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(FIELD_DIRECTIVE);
			setState(392);
			accessList();
			setState(393);
			memberName();
			setState(394);
			match(COLON);
			setState(395);
			nonvoid_type_descriptor();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(396);
				match(EQUAL);
				setState(397);
				literal();
				}
			}

			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANNOTATION_DIRECTIVE) {
					{
					{
					setState(400);
					annotation();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(END_FIELD_DIRECTIVE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD_DIRECTIVE() { return getToken(SmaliParser.METHOD_DIRECTIVE, 0); }
		public AccessListContext accessList() {
			return getRuleContext(AccessListContext.class,0);
		}
		public MemberNameContext memberName() {
			return getRuleContext(MemberNameContext.class,0);
		}
		public MethodProtoContext methodProto() {
			return getRuleContext(MethodProtoContext.class,0);
		}
		public TerminalNode END_METHOD_DIRECTIVE() { return getToken(SmaliParser.END_METHOD_DIRECTIVE, 0); }
		public List<Statement_or_directiveContext> statement_or_directive() {
			return getRuleContexts(Statement_or_directiveContext.class);
		}
		public Statement_or_directiveContext statement_or_directive(int i) {
			return getRuleContext(Statement_or_directiveContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(METHOD_DIRECTIVE);
			setState(410);
			accessList();
			setState(411);
			memberName();
			setState(412);
			methodProto();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOURCE_DIRECTIVE) | (1L << ANNOTATION_DIRECTIVE) | (1L << REGISTERS_DIRECTIVE) | (1L << LOCALS_DIRECTIVE) | (1L << ARRAY_DATA_DIRECTIVE) | (1L << PACKED_SWITCH_DIRECTIVE) | (1L << SPARSE_SWITCH_DIRECTIVE) | (1L << CATCH_DIRECTIVE) | (1L << CATCHALL_DIRECTIVE) | (1L << LINE_DIRECTIVE) | (1L << PARAMETER_DIRECTIVE) | (1L << LOCAL_DIRECTIVE) | (1L << END_LOCAL_DIRECTIVE) | (1L << RESTART_LOCAL_DIRECTIVE) | (1L << PROLOGUE_DIRECTIVE) | (1L << EPILOGUE_DIRECTIVE) | (1L << INSTRUCTION_FORMAT10t) | (1L << INSTRUCTION_FORMAT10x) | (1L << INSTRUCTION_FORMAT10x_ODEX) | (1L << INSTRUCTION_FORMAT11n) | (1L << INSTRUCTION_FORMAT11x) | (1L << INSTRUCTION_FORMAT12x_OR_ID) | (1L << INSTRUCTION_FORMAT12x) | (1L << INSTRUCTION_FORMAT20bc) | (1L << INSTRUCTION_FORMAT20t))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INSTRUCTION_FORMAT21c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT21c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT21c_STRING - 64)) | (1L << (INSTRUCTION_FORMAT21c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_HANDLE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21ih - 64)) | (1L << (INSTRUCTION_FORMAT21lh - 64)) | (1L << (INSTRUCTION_FORMAT21s - 64)) | (1L << (INSTRUCTION_FORMAT21t - 64)) | (1L << (INSTRUCTION_FORMAT22b - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT22c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT22cs_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22s_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT22s - 64)) | (1L << (INSTRUCTION_FORMAT22t - 64)) | (1L << (INSTRUCTION_FORMAT22x - 64)) | (1L << (INSTRUCTION_FORMAT23x - 64)) | (1L << (INSTRUCTION_FORMAT30t - 64)) | (1L << (INSTRUCTION_FORMAT31c - 64)) | (1L << (INSTRUCTION_FORMAT31i_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT31i - 64)) | (1L << (INSTRUCTION_FORMAT31t - 64)) | (1L << (INSTRUCTION_FORMAT32x - 64)) | (1L << (INSTRUCTION_FORMAT35c_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT35c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35mi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35ms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT3rc_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT3rc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT3rc_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT3rc_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT3rmi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT3rms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT45cc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT4rcc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT51l - 64)) | (1L << (COLON - 64)))) != 0)) {
				{
				{
				setState(413);
				statement_or_directive();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(END_METHOD_DIRECTIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_or_directiveContext extends ParserRuleContext {
		public Statement_or_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_or_directive; }
	 
		public Statement_or_directiveContext() { }
		public void copyFrom(Statement_or_directiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Instruction21cMethodAltContext extends Statement_or_directiveContext {
		public Insn_format21c_method_typeContext insn_format21c_method_type() {
			return getRuleContext(Insn_format21c_method_typeContext.class,0);
		}
		public Instruction21cMethodAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21cMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction3rmsMethodAltContext extends Statement_or_directiveContext {
		public Insn_format3rms_methodContext insn_format3rms_method() {
			return getRuleContext(Insn_format3rms_methodContext.class,0);
		}
		public Instruction3rmsMethodAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction3rmsMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction12xAltContext extends Statement_or_directiveContext {
		public Insn_format12xContext insn_format12x() {
			return getRuleContext(Insn_format12xContext.class,0);
		}
		public Instruction12xAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction12xAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction11xAltContext extends Statement_or_directiveContext {
		public Insn_format11xContext insn_format11x() {
			return getRuleContext(Insn_format11xContext.class,0);
		}
		public Instruction11xAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction11xAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction21tAltContext extends Statement_or_directiveContext {
		public Insn_format21tContext insn_format21t() {
			return getRuleContext(Insn_format21tContext.class,0);
		}
		public Instruction21tAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21tAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndLocalAltContext extends Statement_or_directiveContext {
		public EndLocalDirectiveContext endLocalDirective() {
			return getRuleContext(EndLocalDirectiveContext.class,0);
		}
		public EndLocalAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitEndLocalAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction4rccMethodAltContext extends Statement_or_directiveContext {
		public Insn_format4rcc_methodContext insn_format4rcc_method() {
			return getRuleContext(Insn_format4rcc_methodContext.class,0);
		}
		public Instruction4rccMethodAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction4rccMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction30tAltContext extends Statement_or_directiveContext {
		public Insn_format30tContext insn_format30t() {
			return getRuleContext(Insn_format30tContext.class,0);
		}
		public Instruction30tAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction30tAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction10xAltContext extends Statement_or_directiveContext {
		public Insn_format10xContext insn_format10x() {
			return getRuleContext(Insn_format10xContext.class,0);
		}
		public Instruction10xAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction10xAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstructionSparseSwitchAltContext extends Statement_or_directiveContext {
		public Insn_sparse_switch_directiveContext insn_sparse_switch_directive() {
			return getRuleContext(Insn_sparse_switch_directiveContext.class,0);
		}
		public InstructionSparseSwitchAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstructionSparseSwitchAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction22tAltContext extends Statement_or_directiveContext {
		public Insn_format22tContext insn_format22t() {
			return getRuleContext(Insn_format22tContext.class,0);
		}
		public Instruction22tAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction22tAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction3rcMethodOdexAltContext extends Statement_or_directiveContext {
		public Insn_format3rc_method_odexContext insn_format3rc_method_odex() {
			return getRuleContext(Insn_format3rc_method_odexContext.class,0);
		}
		public Instruction3rcMethodOdexAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction3rcMethodOdexAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CatchAllAltContext extends Statement_or_directiveContext {
		public CatchallDirectiveContext catchallDirective() {
			return getRuleContext(CatchallDirectiveContext.class,0);
		}
		public CatchAllAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitCatchAllAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamterAltContext extends Statement_or_directiveContext {
		public ParameterDirectiveContext parameterDirective() {
			return getRuleContext(ParameterDirectiveContext.class,0);
		}
		public ParamterAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitParamterAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction35cMethodAltContext extends Statement_or_directiveContext {
		public Insn_format35c_methodContext insn_format35c_method() {
			return getRuleContext(Insn_format35c_methodContext.class,0);
		}
		public Instruction35cMethodAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction35cMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction22cFieldAltContext extends Statement_or_directiveContext {
		public Insn_format22c_fieldContext insn_format22c_field() {
			return getRuleContext(Insn_format22c_fieldContext.class,0);
		}
		public Instruction22cFieldAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction22cFieldAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegisterAltContext extends Statement_or_directiveContext {
		public RegistersDirectiveContext registersDirective() {
			return getRuleContext(RegistersDirectiveContext.class,0);
		}
		public RegisterAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitRegisterAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction3rcMethodAltContext extends Statement_or_directiveContext {
		public Insn_format3rc_methodContext insn_format3rc_method() {
			return getRuleContext(Insn_format3rc_methodContext.class,0);
		}
		public Instruction3rcMethodAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction3rcMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction21sAltContext extends Statement_or_directiveContext {
		public Insn_format21sContext insn_format21s() {
			return getRuleContext(Insn_format21sContext.class,0);
		}
		public Instruction21sAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21sAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction23xAltContext extends Statement_or_directiveContext {
		public Insn_format23xContext insn_format23x() {
			return getRuleContext(Insn_format23xContext.class,0);
		}
		public Instruction23xAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction23xAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction10tAltContext extends Statement_or_directiveContext {
		public Insn_format10tContext insn_format10t() {
			return getRuleContext(Insn_format10tContext.class,0);
		}
		public Instruction10tAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction10tAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction21cFieldOdexAltContext extends Statement_or_directiveContext {
		public Insn_format21c_field_odexContext insn_format21c_field_odex() {
			return getRuleContext(Insn_format21c_field_odexContext.class,0);
		}
		public Instruction21cFieldOdexAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21cFieldOdexAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction22cFieldOdexAltContext extends Statement_or_directiveContext {
		public Insn_format22c_field_odexContext insn_format22c_field_odex() {
			return getRuleContext(Insn_format22c_field_odexContext.class,0);
		}
		public Instruction22cFieldOdexAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction22cFieldOdexAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction3rcTypeAltContext extends Statement_or_directiveContext {
		public Insn_format3rc_typeContext insn_format3rc_type() {
			return getRuleContext(Insn_format3rc_typeContext.class,0);
		}
		public Instruction3rcTypeAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction3rcTypeAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineAltContext extends Statement_or_directiveContext {
		public LineDirectiveContext lineDirective() {
			return getRuleContext(LineDirectiveContext.class,0);
		}
		public LineAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLineAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction31iAltContext extends Statement_or_directiveContext {
		public Insn_format31iContext insn_format31i() {
			return getRuleContext(Insn_format31iContext.class,0);
		}
		public Instruction31iAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction31iAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction21cTypeAltContext extends Statement_or_directiveContext {
		public Insn_format21c_typeContext insn_format21c_type() {
			return getRuleContext(Insn_format21c_typeContext.class,0);
		}
		public Instruction21cTypeAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21cTypeAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction21cFieldAltContext extends Statement_or_directiveContext {
		public Insn_format21c_fieldContext insn_format21c_field() {
			return getRuleContext(Insn_format21c_fieldContext.class,0);
		}
		public Instruction21cFieldAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21cFieldAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction22sAltContext extends Statement_or_directiveContext {
		public Insn_format22sContext insn_format22s() {
			return getRuleContext(Insn_format22sContext.class,0);
		}
		public Instruction22sAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction22sAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EpilogueAltContext extends Statement_or_directiveContext {
		public TerminalNode EPILOGUE_DIRECTIVE() { return getToken(SmaliParser.EPILOGUE_DIRECTIVE, 0); }
		public EpilogueAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitEpilogueAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction45ccMethodAltContext extends Statement_or_directiveContext {
		public Insn_format45cc_methodContext insn_format45cc_method() {
			return getRuleContext(Insn_format45cc_methodContext.class,0);
		}
		public Instruction45ccMethodAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction45ccMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction51lAltContext extends Statement_or_directiveContext {
		public Insn_format51lContext insn_format51l() {
			return getRuleContext(Insn_format51lContext.class,0);
		}
		public Instruction51lAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction51lAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction35cTypeAltContext extends Statement_or_directiveContext {
		public Insn_format35c_typeContext insn_format35c_type() {
			return getRuleContext(Insn_format35c_typeContext.class,0);
		}
		public Instruction35cTypeAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction35cTypeAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction22bAltContext extends Statement_or_directiveContext {
		public Insn_format22bContext insn_format22b() {
			return getRuleContext(Insn_format22bContext.class,0);
		}
		public Instruction22bAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction22bAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction35cMethodOdexAltContext extends Statement_or_directiveContext {
		public Insn_format35c_method_odexContext insn_format35c_method_odex() {
			return getRuleContext(Insn_format35c_method_odexContext.class,0);
		}
		public Instruction35cMethodOdexAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction35cMethodOdexAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction21lhAltContext extends Statement_or_directiveContext {
		public Insn_format21lhContext insn_format21lh() {
			return getRuleContext(Insn_format21lhContext.class,0);
		}
		public Instruction21lhAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21lhAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction35msMethodAltContext extends Statement_or_directiveContext {
		public Insn_format35ms_methodContext insn_format35ms_method() {
			return getRuleContext(Insn_format35ms_methodContext.class,0);
		}
		public Instruction35msMethodAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction35msMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstructionArraydataAltContext extends Statement_or_directiveContext {
		public Insn_array_data_directiveContext insn_array_data_directive() {
			return getRuleContext(Insn_array_data_directiveContext.class,0);
		}
		public InstructionArraydataAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstructionArraydataAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CatchAltContext extends Statement_or_directiveContext {
		public CatchDirectiveContext catchDirective() {
			return getRuleContext(CatchDirectiveContext.class,0);
		}
		public CatchAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitCatchAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction32xAltContext extends Statement_or_directiveContext {
		public Insn_format32xContext insn_format32x() {
			return getRuleContext(Insn_format32xContext.class,0);
		}
		public Instruction32xAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction32xAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrologueAltContext extends Statement_or_directiveContext {
		public TerminalNode PROLOGUE_DIRECTIVE() { return getToken(SmaliParser.PROLOGUE_DIRECTIVE, 0); }
		public PrologueAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitPrologueAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstructionPackedSwitchAltContext extends Statement_or_directiveContext {
		public Insn_packed_switch_directiveContext insn_packed_switch_directive() {
			return getRuleContext(Insn_packed_switch_directiveContext.class,0);
		}
		public InstructionPackedSwitchAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstructionPackedSwitchAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction10xOdexAltContext extends Statement_or_directiveContext {
		public Insn_format10x_odexContext insn_format10x_odex() {
			return getRuleContext(Insn_format10x_odexContext.class,0);
		}
		public Instruction10xOdexAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction10xOdexAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LableAltContext extends Statement_or_directiveContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LableAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLableAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction21cStringAltContext extends Statement_or_directiveContext {
		public Insn_format21c_stringContext insn_format21c_string() {
			return getRuleContext(Insn_format21c_stringContext.class,0);
		}
		public Instruction21cStringAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21cStringAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SourceAltContext extends Statement_or_directiveContext {
		public SourceDirectiveContext sourceDirective() {
			return getRuleContext(SourceDirectiveContext.class,0);
		}
		public SourceAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSourceAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodAnnotationAltContext extends Statement_or_directiveContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodAnnotationAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodAnnotationAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction21ihAltContext extends Statement_or_directiveContext {
		public Insn_format21ihContext insn_format21ih() {
			return getRuleContext(Insn_format21ihContext.class,0);
		}
		public Instruction21ihAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21ihAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction22csFieldAltContext extends Statement_or_directiveContext {
		public Insn_format22cs_fieldContext insn_format22cs_field() {
			return getRuleContext(Insn_format22cs_fieldContext.class,0);
		}
		public Instruction22csFieldAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction22csFieldAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction35cCallsiteAltContext extends Statement_or_directiveContext {
		public Insn_format35c_call_siteContext insn_format35c_call_site() {
			return getRuleContext(Insn_format35c_call_siteContext.class,0);
		}
		public Instruction35cCallsiteAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction35cCallsiteAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction31tAltContext extends Statement_or_directiveContext {
		public Insn_format31tContext insn_format31t() {
			return getRuleContext(Insn_format31tContext.class,0);
		}
		public Instruction31tAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction31tAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction35miMethodAltContext extends Statement_or_directiveContext {
		public Insn_format35mi_methodContext insn_format35mi_method() {
			return getRuleContext(Insn_format35mi_methodContext.class,0);
		}
		public Instruction35miMethodAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction35miMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction22xAltContext extends Statement_or_directiveContext {
		public Insn_format22xContext insn_format22x() {
			return getRuleContext(Insn_format22xContext.class,0);
		}
		public Instruction22xAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction22xAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction21cMethodHandleAltContext extends Statement_or_directiveContext {
		public Insn_format21c_method_handleContext insn_format21c_method_handle() {
			return getRuleContext(Insn_format21c_method_handleContext.class,0);
		}
		public Instruction21cMethodHandleAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction21cMethodHandleAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction3rcCallsiteAltContext extends Statement_or_directiveContext {
		public Insn_format3rc_call_siteContext insn_format3rc_call_site() {
			return getRuleContext(Insn_format3rc_call_siteContext.class,0);
		}
		public Instruction3rcCallsiteAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction3rcCallsiteAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RestartLocalAltContext extends Statement_or_directiveContext {
		public RestartLocalDirectiveContext restartLocalDirective() {
			return getRuleContext(RestartLocalDirectiveContext.class,0);
		}
		public RestartLocalAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitRestartLocalAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction31cAltContext extends Statement_or_directiveContext {
		public Insn_format31cContext insn_format31c() {
			return getRuleContext(Insn_format31cContext.class,0);
		}
		public Instruction31cAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction31cAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction3rmiMethodAltContext extends Statement_or_directiveContext {
		public Insn_format3rmi_methodContext insn_format3rmi_method() {
			return getRuleContext(Insn_format3rmi_methodContext.class,0);
		}
		public Instruction3rmiMethodAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction3rmiMethodAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalAltContext extends Statement_or_directiveContext {
		public LocalDirectiveContext localDirective() {
			return getRuleContext(LocalDirectiveContext.class,0);
		}
		public LocalAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLocalAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction20tAltContext extends Statement_or_directiveContext {
		public Insn_format20tContext insn_format20t() {
			return getRuleContext(Insn_format20tContext.class,0);
		}
		public Instruction20tAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction20tAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction11nAltContext extends Statement_or_directiveContext {
		public Insn_format11nContext insn_format11n() {
			return getRuleContext(Insn_format11nContext.class,0);
		}
		public Instruction11nAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction11nAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction22cTypeAltContext extends Statement_or_directiveContext {
		public Insn_format22c_typeContext insn_format22c_type() {
			return getRuleContext(Insn_format22c_typeContext.class,0);
		}
		public Instruction22cTypeAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction22cTypeAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instruction20bcAltContext extends Statement_or_directiveContext {
		public Insn_format20bcContext insn_format20bc() {
			return getRuleContext(Insn_format20bcContext.class,0);
		}
		public Instruction20bcAltContext(Statement_or_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction20bcAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_or_directiveContext statement_or_directive() throws RecognitionException {
		Statement_or_directiveContext _localctx = new Statement_or_directiveContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement_or_directive);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTERS_DIRECTIVE:
			case LOCALS_DIRECTIVE:
				_localctx = new RegisterAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				registersDirective();
				}
				break;
			case CATCH_DIRECTIVE:
				_localctx = new CatchAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				catchDirective();
				}
				break;
			case CATCHALL_DIRECTIVE:
				_localctx = new CatchAllAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				catchallDirective();
				}
				break;
			case PARAMETER_DIRECTIVE:
				_localctx = new ParamterAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				parameterDirective();
				}
				break;
			case ANNOTATION_DIRECTIVE:
				_localctx = new MethodAnnotationAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				annotation();
				}
				break;
			case COLON:
				_localctx = new LableAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				label();
				}
				break;
			case LINE_DIRECTIVE:
				_localctx = new LineAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				lineDirective();
				}
				break;
			case LOCAL_DIRECTIVE:
				_localctx = new LocalAltContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(428);
				localDirective();
				}
				break;
			case END_LOCAL_DIRECTIVE:
				_localctx = new EndLocalAltContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(429);
				endLocalDirective();
				}
				break;
			case RESTART_LOCAL_DIRECTIVE:
				_localctx = new RestartLocalAltContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(430);
				restartLocalDirective();
				}
				break;
			case PROLOGUE_DIRECTIVE:
				_localctx = new PrologueAltContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(431);
				match(PROLOGUE_DIRECTIVE);
				}
				break;
			case EPILOGUE_DIRECTIVE:
				_localctx = new EpilogueAltContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(432);
				match(EPILOGUE_DIRECTIVE);
				}
				break;
			case SOURCE_DIRECTIVE:
				_localctx = new SourceAltContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(433);
				sourceDirective();
				}
				break;
			case INSTRUCTION_FORMAT10t:
				_localctx = new Instruction10tAltContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(434);
				insn_format10t();
				}
				break;
			case INSTRUCTION_FORMAT10x:
				_localctx = new Instruction10xAltContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(435);
				insn_format10x();
				}
				break;
			case INSTRUCTION_FORMAT10x_ODEX:
				_localctx = new Instruction10xOdexAltContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(436);
				insn_format10x_odex();
				}
				break;
			case INSTRUCTION_FORMAT11n:
				_localctx = new Instruction11nAltContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(437);
				insn_format11n();
				}
				break;
			case INSTRUCTION_FORMAT11x:
				_localctx = new Instruction11xAltContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(438);
				insn_format11x();
				}
				break;
			case INSTRUCTION_FORMAT12x_OR_ID:
			case INSTRUCTION_FORMAT12x:
				_localctx = new Instruction12xAltContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(439);
				insn_format12x();
				}
				break;
			case INSTRUCTION_FORMAT20bc:
				_localctx = new Instruction20bcAltContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(440);
				insn_format20bc();
				}
				break;
			case INSTRUCTION_FORMAT20t:
				_localctx = new Instruction20tAltContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(441);
				insn_format20t();
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD:
				_localctx = new Instruction21cFieldAltContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(442);
				insn_format21c_field();
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				_localctx = new Instruction21cFieldOdexAltContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(443);
				insn_format21c_field_odex();
				}
				break;
			case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
				_localctx = new Instruction21cMethodHandleAltContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(444);
				insn_format21c_method_handle();
				}
				break;
			case INSTRUCTION_FORMAT21c_METHOD_TYPE:
				_localctx = new Instruction21cMethodAltContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(445);
				insn_format21c_method_type();
				}
				break;
			case INSTRUCTION_FORMAT21c_STRING:
				_localctx = new Instruction21cStringAltContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(446);
				insn_format21c_string();
				}
				break;
			case INSTRUCTION_FORMAT21c_TYPE:
				_localctx = new Instruction21cTypeAltContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(447);
				insn_format21c_type();
				}
				break;
			case INSTRUCTION_FORMAT21ih:
				_localctx = new Instruction21ihAltContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(448);
				insn_format21ih();
				}
				break;
			case INSTRUCTION_FORMAT21lh:
				_localctx = new Instruction21lhAltContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(449);
				insn_format21lh();
				}
				break;
			case INSTRUCTION_FORMAT21s:
				_localctx = new Instruction21sAltContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(450);
				insn_format21s();
				}
				break;
			case INSTRUCTION_FORMAT21t:
				_localctx = new Instruction21tAltContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(451);
				insn_format21t();
				}
				break;
			case INSTRUCTION_FORMAT22b:
				_localctx = new Instruction22bAltContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(452);
				insn_format22b();
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD:
				_localctx = new Instruction22cFieldAltContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(453);
				insn_format22c_field();
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				_localctx = new Instruction22cFieldOdexAltContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(454);
				insn_format22c_field_odex();
				}
				break;
			case INSTRUCTION_FORMAT22c_TYPE:
				_localctx = new Instruction22cTypeAltContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(455);
				insn_format22c_type();
				}
				break;
			case INSTRUCTION_FORMAT22cs_FIELD:
				_localctx = new Instruction22csFieldAltContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(456);
				insn_format22cs_field();
				}
				break;
			case INSTRUCTION_FORMAT22s_OR_ID:
			case INSTRUCTION_FORMAT22s:
				_localctx = new Instruction22sAltContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(457);
				insn_format22s();
				}
				break;
			case INSTRUCTION_FORMAT22t:
				_localctx = new Instruction22tAltContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(458);
				insn_format22t();
				}
				break;
			case INSTRUCTION_FORMAT22x:
				_localctx = new Instruction22xAltContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(459);
				insn_format22x();
				}
				break;
			case INSTRUCTION_FORMAT23x:
				_localctx = new Instruction23xAltContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(460);
				insn_format23x();
				}
				break;
			case INSTRUCTION_FORMAT30t:
				_localctx = new Instruction30tAltContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(461);
				insn_format30t();
				}
				break;
			case INSTRUCTION_FORMAT31c:
				_localctx = new Instruction31cAltContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(462);
				insn_format31c();
				}
				break;
			case INSTRUCTION_FORMAT31i_OR_ID:
			case INSTRUCTION_FORMAT31i:
				_localctx = new Instruction31iAltContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(463);
				insn_format31i();
				}
				break;
			case INSTRUCTION_FORMAT31t:
				_localctx = new Instruction31tAltContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(464);
				insn_format31t();
				}
				break;
			case INSTRUCTION_FORMAT32x:
				_localctx = new Instruction32xAltContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(465);
				insn_format32x();
				}
				break;
			case INSTRUCTION_FORMAT35c_CALL_SITE:
				_localctx = new Instruction35cCallsiteAltContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(466);
				insn_format35c_call_site();
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD:
			case INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE:
				_localctx = new Instruction35cMethodAltContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(467);
				insn_format35c_method();
				}
				break;
			case INSTRUCTION_FORMAT35c_TYPE:
				_localctx = new Instruction35cTypeAltContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(468);
				insn_format35c_type();
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				_localctx = new Instruction35cMethodOdexAltContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(469);
				insn_format35c_method_odex();
				}
				break;
			case INSTRUCTION_FORMAT35mi_METHOD:
				_localctx = new Instruction35miMethodAltContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(470);
				insn_format35mi_method();
				}
				break;
			case INSTRUCTION_FORMAT35ms_METHOD:
				_localctx = new Instruction35msMethodAltContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(471);
				insn_format35ms_method();
				}
				break;
			case INSTRUCTION_FORMAT3rc_CALL_SITE:
				_localctx = new Instruction3rcCallsiteAltContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(472);
				insn_format3rc_call_site();
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD:
				_localctx = new Instruction3rcMethodAltContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(473);
				insn_format3rc_method();
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
				_localctx = new Instruction3rcMethodOdexAltContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(474);
				insn_format3rc_method_odex();
				}
				break;
			case INSTRUCTION_FORMAT3rc_TYPE:
				_localctx = new Instruction3rcTypeAltContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(475);
				insn_format3rc_type();
				}
				break;
			case INSTRUCTION_FORMAT3rmi_METHOD:
				_localctx = new Instruction3rmiMethodAltContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(476);
				insn_format3rmi_method();
				}
				break;
			case INSTRUCTION_FORMAT3rms_METHOD:
				_localctx = new Instruction3rmsMethodAltContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(477);
				insn_format3rms_method();
				}
				break;
			case INSTRUCTION_FORMAT45cc_METHOD:
				_localctx = new Instruction45ccMethodAltContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(478);
				insn_format45cc_method();
				}
				break;
			case INSTRUCTION_FORMAT4rcc_METHOD:
				_localctx = new Instruction4rccMethodAltContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(479);
				insn_format4rcc_method();
				}
				break;
			case INSTRUCTION_FORMAT51l:
				_localctx = new Instruction51lAltContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(480);
				insn_format51l();
				}
				break;
			case ARRAY_DATA_DIRECTIVE:
				_localctx = new InstructionArraydataAltContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(481);
				insn_array_data_directive();
				}
				break;
			case PACKED_SWITCH_DIRECTIVE:
				_localctx = new InstructionPackedSwitchAltContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(482);
				insn_packed_switch_directive();
				}
				break;
			case SPARSE_SWITCH_DIRECTIVE:
				_localctx = new InstructionSparseSwitchAltContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(483);
				insn_sparse_switch_directive();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistersDirectiveContext extends ParserRuleContext {
		public boolean isLocal;
		public IntegralLiteralContext regCount;
		public TerminalNode REGISTERS_DIRECTIVE() { return getToken(SmaliParser.REGISTERS_DIRECTIVE, 0); }
		public IntegralLiteralContext integralLiteral() {
			return getRuleContext(IntegralLiteralContext.class,0);
		}
		public TerminalNode LOCALS_DIRECTIVE() { return getToken(SmaliParser.LOCALS_DIRECTIVE, 0); }
		public RegistersDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registersDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitRegistersDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistersDirectiveContext registersDirective() throws RecognitionException {
		RegistersDirectiveContext _localctx = new RegistersDirectiveContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_registersDirective);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTERS_DIRECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(REGISTERS_DIRECTIVE);
				setState(487);
				((RegistersDirectiveContext)_localctx).regCount = integralLiteral();
				((RegistersDirectiveContext)_localctx).isLocal = false;
				}
				break;
			case LOCALS_DIRECTIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(LOCALS_DIRECTIVE);
				setState(491);
				((RegistersDirectiveContext)_localctx).regCount = integralLiteral();
				((RegistersDirectiveContext)_localctx).isLocal = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchDirectiveContext extends ParserRuleContext {
		public Label_refContext from;
		public Label_refContext to;
		public Label_refContext handle;
		public TerminalNode CATCH_DIRECTIVE() { return getToken(SmaliParser.CATCH_DIRECTIVE, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode DOTDOT() { return getToken(SmaliParser.DOTDOT, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public List<Label_refContext> label_ref() {
			return getRuleContexts(Label_refContext.class);
		}
		public Label_refContext label_ref(int i) {
			return getRuleContext(Label_refContext.class,i);
		}
		public CatchDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitCatchDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchDirectiveContext catchDirective() throws RecognitionException {
		CatchDirectiveContext _localctx = new CatchDirectiveContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_catchDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(CATCH_DIRECTIVE);
			setState(497);
			nonvoid_type_descriptor();
			setState(498);
			match(OPEN_BRACE);
			setState(499);
			((CatchDirectiveContext)_localctx).from = label_ref();
			setState(500);
			match(DOTDOT);
			setState(501);
			((CatchDirectiveContext)_localctx).to = label_ref();
			setState(502);
			match(CLOSE_BRACE);
			setState(503);
			((CatchDirectiveContext)_localctx).handle = label_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchallDirectiveContext extends ParserRuleContext {
		public Label_refContext from;
		public Label_refContext to;
		public Label_refContext handle;
		public TerminalNode CATCHALL_DIRECTIVE() { return getToken(SmaliParser.CATCHALL_DIRECTIVE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode DOTDOT() { return getToken(SmaliParser.DOTDOT, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public List<Label_refContext> label_ref() {
			return getRuleContexts(Label_refContext.class);
		}
		public Label_refContext label_ref(int i) {
			return getRuleContext(Label_refContext.class,i);
		}
		public CatchallDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchallDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitCatchallDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchallDirectiveContext catchallDirective() throws RecognitionException {
		CatchallDirectiveContext _localctx = new CatchallDirectiveContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_catchallDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(CATCHALL_DIRECTIVE);
			setState(506);
			match(OPEN_BRACE);
			setState(507);
			((CatchallDirectiveContext)_localctx).from = label_ref();
			setState(508);
			match(DOTDOT);
			setState(509);
			((CatchallDirectiveContext)_localctx).to = label_ref();
			setState(510);
			match(CLOSE_BRACE);
			setState(511);
			((CatchallDirectiveContext)_localctx).handle = label_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDirectiveContext extends ParserRuleContext {
		public Token reg;
		public Token name;
		public TerminalNode PARAMETER_DIRECTIVE() { return getToken(SmaliParser.PARAMETER_DIRECTIVE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode END_PARAMETER_DIRECTIVE() { return getToken(SmaliParser.END_PARAMETER_DIRECTIVE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ParameterDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitParameterDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDirectiveContext parameterDirective() throws RecognitionException {
		ParameterDirectiveContext _localctx = new ParameterDirectiveContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameterDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(PARAMETER_DIRECTIVE);
			setState(514);
			((ParameterDirectiveContext)_localctx).reg = match(REGISTER);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(515);
				match(COMMA);
				setState(516);
				((ParameterDirectiveContext)_localctx).name = match(STRING_LITERAL);
				}
			}

			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANNOTATION_DIRECTIVE) {
					{
					{
					setState(519);
					annotation();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				match(END_PARAMETER_DIRECTIVE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralLiteralContext extends ParserRuleContext {
		public int type;
		public TerminalNode LONG_LITERAL() { return getToken(SmaliParser.LONG_LITERAL, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode SHORT_LITERAL() { return getToken(SmaliParser.SHORT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(SmaliParser.CHAR_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(SmaliParser.BYTE_LITERAL, 0); }
		public IntegralLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitIntegralLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralLiteralContext integralLiteral() throws RecognitionException {
		IntegralLiteralContext _localctx = new IntegralLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_integralLiteral);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				match(LONG_LITERAL);
				((IntegralLiteralContext)_localctx).type = 1;
				}
				break;
			case POSITIVE_INTEGER_LITERAL:
			case NEGATIVE_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				integerLiteral();
				((IntegralLiteralContext)_localctx).type = 2;
				}
				break;
			case SHORT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(SHORT_LITERAL);
				((IntegralLiteralContext)_localctx).type = 3;
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				match(CHAR_LITERAL);
				((IntegralLiteralContext)_localctx).type = 4;
				}
				break;
			case BYTE_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(537);
				match(BYTE_LITERAL);
				((IntegralLiteralContext)_localctx).type = 5;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_refContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public Label_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_ref; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLabel_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_refContext label_ref() throws RecognitionException {
		Label_refContext _localctx = new Label_refContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_label_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(COLON);
			setState(542);
			simpleName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(COLON);
			setState(545);
			simpleName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineDirectiveContext extends ParserRuleContext {
		public TerminalNode LINE_DIRECTIVE() { return getToken(SmaliParser.LINE_DIRECTIVE, 0); }
		public IntegralLiteralContext integralLiteral() {
			return getRuleContext(IntegralLiteralContext.class,0);
		}
		public LineDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLineDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineDirectiveContext lineDirective() throws RecognitionException {
		LineDirectiveContext _localctx = new LineDirectiveContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lineDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(LINE_DIRECTIVE);
			setState(548);
			integralLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalDirectiveContext extends ParserRuleContext {
		public Token reg;
		public Token name;
		public Nonvoid_type_descriptorContext type;
		public Token signature;
		public TerminalNode LOCAL_DIRECTIVE() { return getToken(SmaliParser.LOCAL_DIRECTIVE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(SmaliParser.NULL_LITERAL, 0); }
		public TerminalNode VOID_TYPE() { return getToken(SmaliParser.VOID_TYPE, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(SmaliParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(SmaliParser.STRING_LITERAL, i);
		}
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public LocalDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLocalDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDirectiveContext localDirective() throws RecognitionException {
		LocalDirectiveContext _localctx = new LocalDirectiveContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_localDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(LOCAL_DIRECTIVE);
			setState(551);
			((LocalDirectiveContext)_localctx).reg = match(REGISTER);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(552);
				match(COMMA);
				setState(555);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL_LITERAL:
					{
					setState(553);
					match(NULL_LITERAL);
					}
					break;
				case STRING_LITERAL:
					{
					setState(554);
					((LocalDirectiveContext)_localctx).name = match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(557);
				match(COLON);
				setState(560);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID_TYPE:
					{
					setState(558);
					match(VOID_TYPE);
					}
					break;
				case CLASS_DESCRIPTOR:
				case PRIMITIVE_TYPE:
				case ARRAY_DESCRIPTOR:
					{
					setState(559);
					((LocalDirectiveContext)_localctx).type = nonvoid_type_descriptor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(562);
					match(COMMA);
					setState(563);
					((LocalDirectiveContext)_localctx).signature = match(STRING_LITERAL);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndLocalDirectiveContext extends ParserRuleContext {
		public TerminalNode END_LOCAL_DIRECTIVE() { return getToken(SmaliParser.END_LOCAL_DIRECTIVE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public EndLocalDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endLocalDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitEndLocalDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndLocalDirectiveContext endLocalDirective() throws RecognitionException {
		EndLocalDirectiveContext _localctx = new EndLocalDirectiveContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_endLocalDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(END_LOCAL_DIRECTIVE);
			setState(569);
			match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestartLocalDirectiveContext extends ParserRuleContext {
		public TerminalNode RESTART_LOCAL_DIRECTIVE() { return getToken(SmaliParser.RESTART_LOCAL_DIRECTIVE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public RestartLocalDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restartLocalDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitRestartLocalDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestartLocalDirectiveContext restartLocalDirective() throws RecognitionException {
		RestartLocalDirectiveContext _localctx = new RestartLocalDirectiveContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_restartLocalDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(RESTART_LOCAL_DIRECTIVE);
			setState(572);
			match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceDirectiveContext extends ParserRuleContext {
		public TerminalNode SOURCE_DIRECTIVE() { return getToken(SmaliParser.SOURCE_DIRECTIVE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public SourceDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSourceDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceDirectiveContext sourceDirective() throws RecognitionException {
		SourceDirectiveContext _localctx = new SourceDirectiveContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sourceDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(SOURCE_DIRECTIVE);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(575);
				match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_format12xContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT12x() { return getToken(SmaliParser.INSTRUCTION_FORMAT12x, 0); }
		public TerminalNode INSTRUCTION_FORMAT12x_OR_ID() { return getToken(SmaliParser.INSTRUCTION_FORMAT12x_OR_ID, 0); }
		public Instruction_format12xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_format12x; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction_format12x(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_format12xContext instruction_format12x() throws RecognitionException {
		Instruction_format12xContext _localctx = new Instruction_format12xContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_instruction_format12x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_la = _input.LA(1);
			if ( !(_la==INSTRUCTION_FORMAT12x_OR_ID || _la==INSTRUCTION_FORMAT12x) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_format22sContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT22s() { return getToken(SmaliParser.INSTRUCTION_FORMAT22s, 0); }
		public TerminalNode INSTRUCTION_FORMAT22s_OR_ID() { return getToken(SmaliParser.INSTRUCTION_FORMAT22s_OR_ID, 0); }
		public Instruction_format22sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_format22s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction_format22s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_format22sContext instruction_format22s() throws RecognitionException {
		Instruction_format22sContext _localctx = new Instruction_format22sContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_instruction_format22s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if ( !(_la==INSTRUCTION_FORMAT22s_OR_ID || _la==INSTRUCTION_FORMAT22s) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_format31iContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT31i() { return getToken(SmaliParser.INSTRUCTION_FORMAT31i, 0); }
		public TerminalNode INSTRUCTION_FORMAT31i_OR_ID() { return getToken(SmaliParser.INSTRUCTION_FORMAT31i_OR_ID, 0); }
		public Instruction_format31iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_format31i; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction_format31i(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_format31iContext instruction_format31i() throws RecognitionException {
		Instruction_format31iContext _localctx = new Instruction_format31iContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_instruction_format31i);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if ( !(_la==INSTRUCTION_FORMAT31i_OR_ID || _la==INSTRUCTION_FORMAT31i) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_format35c_methodContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT35c_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_METHOD, 0); }
		public TerminalNode INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE, 0); }
		public Instruction_format35c_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_format35c_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction_format35c_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_format35c_methodContext instruction_format35c_method() throws RecognitionException {
		Instruction_format35c_methodContext _localctx = new Instruction_format35c_methodContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_instruction_format35c_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_la = _input.LA(1);
			if ( !(_la==INSTRUCTION_FORMAT35c_METHOD || _la==INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format10tContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT10t() { return getToken(SmaliParser.INSTRUCTION_FORMAT10t, 0); }
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public Insn_format10tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format10t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format10t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format10tContext insn_format10t() throws RecognitionException {
		Insn_format10tContext _localctx = new Insn_format10tContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_insn_format10t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(INSTRUCTION_FORMAT10t);
			setState(587);
			label_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format10xContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT10x() { return getToken(SmaliParser.INSTRUCTION_FORMAT10x, 0); }
		public Insn_format10xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format10x; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format10x(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format10xContext insn_format10x() throws RecognitionException {
		Insn_format10xContext _localctx = new Insn_format10xContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_insn_format10x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(INSTRUCTION_FORMAT10x);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format10x_odexContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT10x_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT10x_ODEX, 0); }
		public Insn_format10x_odexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format10x_odex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format10x_odex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format10x_odexContext insn_format10x_odex() throws RecognitionException {
		Insn_format10x_odexContext _localctx = new Insn_format10x_odexContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_insn_format10x_odex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(INSTRUCTION_FORMAT10x_ODEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format11nContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT11n() { return getToken(SmaliParser.INSTRUCTION_FORMAT11n, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public IntegralLiteralContext integralLiteral() {
			return getRuleContext(IntegralLiteralContext.class,0);
		}
		public Insn_format11nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format11n; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format11n(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format11nContext insn_format11n() throws RecognitionException {
		Insn_format11nContext _localctx = new Insn_format11nContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_insn_format11n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(INSTRUCTION_FORMAT11n);
			setState(594);
			match(REGISTER);
			setState(595);
			match(COMMA);
			setState(596);
			integralLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format11xContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT11x() { return getToken(SmaliParser.INSTRUCTION_FORMAT11x, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public Insn_format11xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format11x; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format11x(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format11xContext insn_format11x() throws RecognitionException {
		Insn_format11xContext _localctx = new Insn_format11xContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_insn_format11x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(INSTRUCTION_FORMAT11x);
			setState(599);
			match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format12xContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public Instruction_format12xContext instruction_format12x() {
			return getRuleContext(Instruction_format12xContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format12xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format12x; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format12x(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format12xContext insn_format12x() throws RecognitionException {
		Insn_format12xContext _localctx = new Insn_format12xContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_insn_format12x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			instruction_format12x();
			setState(602);
			((Insn_format12xContext)_localctx).reg1 = match(REGISTER);
			setState(603);
			match(COMMA);
			setState(604);
			((Insn_format12xContext)_localctx).reg2 = match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format20bcContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT20bc() { return getToken(SmaliParser.INSTRUCTION_FORMAT20bc, 0); }
		public TerminalNode VERIFICATION_ERROR_TYPE() { return getToken(SmaliParser.VERIFICATION_ERROR_TYPE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Verification_error_referenceContext verification_error_reference() {
			return getRuleContext(Verification_error_referenceContext.class,0);
		}
		public Insn_format20bcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format20bc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format20bc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format20bcContext insn_format20bc() throws RecognitionException {
		Insn_format20bcContext _localctx = new Insn_format20bcContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_insn_format20bc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(INSTRUCTION_FORMAT20bc);
			setState(607);
			match(VERIFICATION_ERROR_TYPE);
			setState(608);
			match(COMMA);
			setState(609);
			verification_error_reference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format20tContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT20t() { return getToken(SmaliParser.INSTRUCTION_FORMAT20t, 0); }
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public Insn_format20tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format20t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format20t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format20tContext insn_format20t() throws RecognitionException {
		Insn_format20tContext _localctx = new Insn_format20tContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_insn_format20t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(INSTRUCTION_FORMAT20t);
			setState(612);
			label_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21c_fieldContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21c_FIELD() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_FIELD, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public Insn_format21c_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21c_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21c_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21c_fieldContext insn_format21c_field() throws RecognitionException {
		Insn_format21c_fieldContext _localctx = new Insn_format21c_fieldContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_insn_format21c_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(INSTRUCTION_FORMAT21c_FIELD);
			setState(615);
			match(REGISTER);
			setState(616);
			match(COMMA);
			setState(617);
			fieldReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21c_field_odexContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21c_FIELD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_FIELD_ODEX, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public Insn_format21c_field_odexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21c_field_odex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21c_field_odex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21c_field_odexContext insn_format21c_field_odex() throws RecognitionException {
		Insn_format21c_field_odexContext _localctx = new Insn_format21c_field_odexContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_insn_format21c_field_odex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(INSTRUCTION_FORMAT21c_FIELD_ODEX);
			setState(620);
			match(REGISTER);
			setState(621);
			match(COMMA);
			setState(622);
			fieldReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21c_method_handleContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21c_METHOD_HANDLE() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_METHOD_HANDLE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public MethodHandleReferenceContext methodHandleReference() {
			return getRuleContext(MethodHandleReferenceContext.class,0);
		}
		public Insn_format21c_method_handleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21c_method_handle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21c_method_handle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21c_method_handleContext insn_format21c_method_handle() throws RecognitionException {
		Insn_format21c_method_handleContext _localctx = new Insn_format21c_method_handleContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_insn_format21c_method_handle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(INSTRUCTION_FORMAT21c_METHOD_HANDLE);
			setState(625);
			match(REGISTER);
			setState(626);
			match(COMMA);
			setState(627);
			methodHandleReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21c_method_typeContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21c_METHOD_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_METHOD_TYPE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public MethodProtoContext methodProto() {
			return getRuleContext(MethodProtoContext.class,0);
		}
		public Insn_format21c_method_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21c_method_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21c_method_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21c_method_typeContext insn_format21c_method_type() throws RecognitionException {
		Insn_format21c_method_typeContext _localctx = new Insn_format21c_method_typeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_insn_format21c_method_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(INSTRUCTION_FORMAT21c_METHOD_TYPE);
			setState(630);
			match(REGISTER);
			setState(631);
			match(COMMA);
			setState(632);
			methodProto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21c_stringContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21c_STRING() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_STRING, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public Insn_format21c_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21c_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21c_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21c_stringContext insn_format21c_string() throws RecognitionException {
		Insn_format21c_stringContext _localctx = new Insn_format21c_stringContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_insn_format21c_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(INSTRUCTION_FORMAT21c_STRING);
			setState(635);
			match(REGISTER);
			setState(636);
			match(COMMA);
			setState(637);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21c_typeContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21c_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_TYPE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public Insn_format21c_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21c_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21c_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21c_typeContext insn_format21c_type() throws RecognitionException {
		Insn_format21c_typeContext _localctx = new Insn_format21c_typeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_insn_format21c_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(INSTRUCTION_FORMAT21c_TYPE);
			setState(640);
			match(REGISTER);
			setState(641);
			match(COMMA);
			setState(642);
			nonvoid_type_descriptor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21ihContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21ih() { return getToken(SmaliParser.INSTRUCTION_FORMAT21ih, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Fixed32bitLiteralContext fixed32bitLiteral() {
			return getRuleContext(Fixed32bitLiteralContext.class,0);
		}
		public Insn_format21ihContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21ih; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21ih(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21ihContext insn_format21ih() throws RecognitionException {
		Insn_format21ihContext _localctx = new Insn_format21ihContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_insn_format21ih);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(INSTRUCTION_FORMAT21ih);
			setState(645);
			match(REGISTER);
			setState(646);
			match(COMMA);
			setState(647);
			fixed32bitLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21lhContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21lh() { return getToken(SmaliParser.INSTRUCTION_FORMAT21lh, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Fixed64bitLiteralContext fixed64bitLiteral() {
			return getRuleContext(Fixed64bitLiteralContext.class,0);
		}
		public Insn_format21lhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21lh; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21lh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21lhContext insn_format21lh() throws RecognitionException {
		Insn_format21lhContext _localctx = new Insn_format21lhContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_insn_format21lh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(INSTRUCTION_FORMAT21lh);
			setState(650);
			match(REGISTER);
			setState(651);
			match(COMMA);
			setState(652);
			fixed64bitLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21sContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21s() { return getToken(SmaliParser.INSTRUCTION_FORMAT21s, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public IntegralLiteralContext integralLiteral() {
			return getRuleContext(IntegralLiteralContext.class,0);
		}
		public Insn_format21sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21sContext insn_format21s() throws RecognitionException {
		Insn_format21sContext _localctx = new Insn_format21sContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_insn_format21s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(INSTRUCTION_FORMAT21s);
			setState(655);
			match(REGISTER);
			setState(656);
			match(COMMA);
			setState(657);
			integralLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format21tContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT21t() { return getToken(SmaliParser.INSTRUCTION_FORMAT21t, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public Insn_format21tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format21t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format21t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format21tContext insn_format21t() throws RecognitionException {
		Insn_format21tContext _localctx = new Insn_format21tContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_insn_format21t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(INSTRUCTION_FORMAT21t);
			setState(660);
			match(REGISTER);
			setState(661);
			match(COMMA);
			setState(662);
			label_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format22bContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public TerminalNode INSTRUCTION_FORMAT22b() { return getToken(SmaliParser.INSTRUCTION_FORMAT22b, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public IntegralLiteralContext integralLiteral() {
			return getRuleContext(IntegralLiteralContext.class,0);
		}
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format22bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format22b; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format22b(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format22bContext insn_format22b() throws RecognitionException {
		Insn_format22bContext _localctx = new Insn_format22bContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_insn_format22b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(INSTRUCTION_FORMAT22b);
			setState(665);
			((Insn_format22bContext)_localctx).reg1 = match(REGISTER);
			setState(666);
			match(COMMA);
			setState(667);
			((Insn_format22bContext)_localctx).reg2 = match(REGISTER);
			setState(668);
			match(COMMA);
			setState(669);
			integralLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format22c_fieldContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public TerminalNode INSTRUCTION_FORMAT22c_FIELD() { return getToken(SmaliParser.INSTRUCTION_FORMAT22c_FIELD, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format22c_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format22c_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format22c_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format22c_fieldContext insn_format22c_field() throws RecognitionException {
		Insn_format22c_fieldContext _localctx = new Insn_format22c_fieldContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_insn_format22c_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(INSTRUCTION_FORMAT22c_FIELD);
			setState(672);
			((Insn_format22c_fieldContext)_localctx).reg1 = match(REGISTER);
			setState(673);
			match(COMMA);
			setState(674);
			((Insn_format22c_fieldContext)_localctx).reg2 = match(REGISTER);
			setState(675);
			match(COMMA);
			setState(676);
			fieldReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format22c_field_odexContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public TerminalNode INSTRUCTION_FORMAT22c_FIELD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT22c_FIELD_ODEX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format22c_field_odexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format22c_field_odex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format22c_field_odex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format22c_field_odexContext insn_format22c_field_odex() throws RecognitionException {
		Insn_format22c_field_odexContext _localctx = new Insn_format22c_field_odexContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_insn_format22c_field_odex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(INSTRUCTION_FORMAT22c_FIELD_ODEX);
			setState(679);
			((Insn_format22c_field_odexContext)_localctx).reg1 = match(REGISTER);
			setState(680);
			match(COMMA);
			setState(681);
			((Insn_format22c_field_odexContext)_localctx).reg2 = match(REGISTER);
			setState(682);
			match(COMMA);
			setState(683);
			fieldReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format22c_typeContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public TerminalNode INSTRUCTION_FORMAT22c_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT22c_TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format22c_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format22c_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format22c_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format22c_typeContext insn_format22c_type() throws RecognitionException {
		Insn_format22c_typeContext _localctx = new Insn_format22c_typeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_insn_format22c_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(INSTRUCTION_FORMAT22c_TYPE);
			setState(686);
			((Insn_format22c_typeContext)_localctx).reg1 = match(REGISTER);
			setState(687);
			match(COMMA);
			setState(688);
			((Insn_format22c_typeContext)_localctx).reg2 = match(REGISTER);
			setState(689);
			match(COMMA);
			setState(690);
			nonvoid_type_descriptor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format22cs_fieldContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public TerminalNode INSTRUCTION_FORMAT22cs_FIELD() { return getToken(SmaliParser.INSTRUCTION_FORMAT22cs_FIELD, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public TerminalNode FIELD_OFFSET() { return getToken(SmaliParser.FIELD_OFFSET, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format22cs_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format22cs_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format22cs_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format22cs_fieldContext insn_format22cs_field() throws RecognitionException {
		Insn_format22cs_fieldContext _localctx = new Insn_format22cs_fieldContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_insn_format22cs_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(INSTRUCTION_FORMAT22cs_FIELD);
			setState(693);
			((Insn_format22cs_fieldContext)_localctx).reg1 = match(REGISTER);
			setState(694);
			match(COMMA);
			setState(695);
			((Insn_format22cs_fieldContext)_localctx).reg2 = match(REGISTER);
			setState(696);
			match(COMMA);
			setState(697);
			match(FIELD_OFFSET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format22sContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public Instruction_format22sContext instruction_format22s() {
			return getRuleContext(Instruction_format22sContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public IntegralLiteralContext integralLiteral() {
			return getRuleContext(IntegralLiteralContext.class,0);
		}
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format22sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format22s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format22s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format22sContext insn_format22s() throws RecognitionException {
		Insn_format22sContext _localctx = new Insn_format22sContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_insn_format22s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			instruction_format22s();
			setState(700);
			((Insn_format22sContext)_localctx).reg1 = match(REGISTER);
			setState(701);
			match(COMMA);
			setState(702);
			((Insn_format22sContext)_localctx).reg2 = match(REGISTER);
			setState(703);
			match(COMMA);
			setState(704);
			integralLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format22tContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public TerminalNode INSTRUCTION_FORMAT22t() { return getToken(SmaliParser.INSTRUCTION_FORMAT22t, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format22tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format22t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format22t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format22tContext insn_format22t() throws RecognitionException {
		Insn_format22tContext _localctx = new Insn_format22tContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_insn_format22t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(INSTRUCTION_FORMAT22t);
			setState(707);
			((Insn_format22tContext)_localctx).reg1 = match(REGISTER);
			setState(708);
			match(COMMA);
			setState(709);
			((Insn_format22tContext)_localctx).reg2 = match(REGISTER);
			setState(710);
			match(COMMA);
			setState(711);
			label_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format22xContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public TerminalNode INSTRUCTION_FORMAT22x() { return getToken(SmaliParser.INSTRUCTION_FORMAT22x, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format22xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format22x; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format22x(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format22xContext insn_format22x() throws RecognitionException {
		Insn_format22xContext _localctx = new Insn_format22xContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_insn_format22x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(INSTRUCTION_FORMAT22x);
			setState(714);
			((Insn_format22xContext)_localctx).reg1 = match(REGISTER);
			setState(715);
			match(COMMA);
			setState(716);
			((Insn_format22xContext)_localctx).reg2 = match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format23xContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public Token reg3;
		public TerminalNode INSTRUCTION_FORMAT23x() { return getToken(SmaliParser.INSTRUCTION_FORMAT23x, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format23xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format23x; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format23x(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format23xContext insn_format23x() throws RecognitionException {
		Insn_format23xContext _localctx = new Insn_format23xContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_insn_format23x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(INSTRUCTION_FORMAT23x);
			setState(719);
			((Insn_format23xContext)_localctx).reg1 = match(REGISTER);
			setState(720);
			match(COMMA);
			setState(721);
			((Insn_format23xContext)_localctx).reg2 = match(REGISTER);
			setState(722);
			match(COMMA);
			setState(723);
			((Insn_format23xContext)_localctx).reg3 = match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format30tContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT30t() { return getToken(SmaliParser.INSTRUCTION_FORMAT30t, 0); }
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public Insn_format30tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format30t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format30t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format30tContext insn_format30t() throws RecognitionException {
		Insn_format30tContext _localctx = new Insn_format30tContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_insn_format30t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(INSTRUCTION_FORMAT30t);
			setState(726);
			label_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format31cContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT31c() { return getToken(SmaliParser.INSTRUCTION_FORMAT31c, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public Insn_format31cContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format31c; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format31c(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format31cContext insn_format31c() throws RecognitionException {
		Insn_format31cContext _localctx = new Insn_format31cContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_insn_format31c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(INSTRUCTION_FORMAT31c);
			setState(729);
			match(REGISTER);
			setState(730);
			match(COMMA);
			setState(731);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format31iContext extends ParserRuleContext {
		public Instruction_format31iContext instruction_format31i() {
			return getRuleContext(Instruction_format31iContext.class,0);
		}
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Fixed32bitLiteralContext fixed32bitLiteral() {
			return getRuleContext(Fixed32bitLiteralContext.class,0);
		}
		public Insn_format31iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format31i; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format31i(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format31iContext insn_format31i() throws RecognitionException {
		Insn_format31iContext _localctx = new Insn_format31iContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_insn_format31i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			instruction_format31i();
			setState(734);
			match(REGISTER);
			setState(735);
			match(COMMA);
			setState(736);
			fixed32bitLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format31tContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT31t() { return getToken(SmaliParser.INSTRUCTION_FORMAT31t, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public Insn_format31tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format31t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format31t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format31tContext insn_format31t() throws RecognitionException {
		Insn_format31tContext _localctx = new Insn_format31tContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_insn_format31t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(INSTRUCTION_FORMAT31t);
			setState(739);
			match(REGISTER);
			setState(740);
			match(COMMA);
			setState(741);
			label_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format32xContext extends ParserRuleContext {
		public Token reg1;
		public Token reg2;
		public TerminalNode INSTRUCTION_FORMAT32x() { return getToken(SmaliParser.INSTRUCTION_FORMAT32x, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public Insn_format32xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format32x; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format32x(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format32xContext insn_format32x() throws RecognitionException {
		Insn_format32xContext _localctx = new Insn_format32xContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_insn_format32x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(INSTRUCTION_FORMAT32x);
			setState(744);
			((Insn_format32xContext)_localctx).reg1 = match(REGISTER);
			setState(745);
			match(COMMA);
			setState(746);
			((Insn_format32xContext)_localctx).reg2 = match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format35c_call_siteContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT35c_CALL_SITE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_CALL_SITE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public CallsiteReferenceContext callsiteReference() {
			return getRuleContext(CallsiteReferenceContext.class,0);
		}
		public Register_listContext register_list() {
			return getRuleContext(Register_listContext.class,0);
		}
		public Insn_format35c_call_siteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format35c_call_site; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format35c_call_site(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format35c_call_siteContext insn_format35c_call_site() throws RecognitionException {
		Insn_format35c_call_siteContext _localctx = new Insn_format35c_call_siteContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_insn_format35c_call_site);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(INSTRUCTION_FORMAT35c_CALL_SITE);
			setState(749);
			match(OPEN_BRACE);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(750);
				register_list();
				}
			}

			setState(753);
			match(CLOSE_BRACE);
			setState(754);
			match(COMMA);
			setState(755);
			callsiteReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format35c_methodContext extends ParserRuleContext {
		public Instruction_format35c_methodContext instruction_format35c_method() {
			return getRuleContext(Instruction_format35c_methodContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public Register_listContext register_list() {
			return getRuleContext(Register_listContext.class,0);
		}
		public Insn_format35c_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format35c_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format35c_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format35c_methodContext insn_format35c_method() throws RecognitionException {
		Insn_format35c_methodContext _localctx = new Insn_format35c_methodContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_insn_format35c_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			instruction_format35c_method();
			setState(758);
			match(OPEN_BRACE);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(759);
				register_list();
				}
			}

			setState(762);
			match(CLOSE_BRACE);
			setState(763);
			match(COMMA);
			setState(764);
			methodReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format35c_typeContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT35c_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_TYPE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public Register_listContext register_list() {
			return getRuleContext(Register_listContext.class,0);
		}
		public Insn_format35c_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format35c_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format35c_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format35c_typeContext insn_format35c_type() throws RecognitionException {
		Insn_format35c_typeContext _localctx = new Insn_format35c_typeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_insn_format35c_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(INSTRUCTION_FORMAT35c_TYPE);
			setState(767);
			match(OPEN_BRACE);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(768);
				register_list();
				}
			}

			setState(771);
			match(CLOSE_BRACE);
			setState(772);
			match(COMMA);
			setState(773);
			nonvoid_type_descriptor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format35c_method_odexContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT35c_METHOD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_METHOD_ODEX, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public Register_listContext register_list() {
			return getRuleContext(Register_listContext.class,0);
		}
		public Insn_format35c_method_odexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format35c_method_odex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format35c_method_odex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format35c_method_odexContext insn_format35c_method_odex() throws RecognitionException {
		Insn_format35c_method_odexContext _localctx = new Insn_format35c_method_odexContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_insn_format35c_method_odex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(INSTRUCTION_FORMAT35c_METHOD_ODEX);
			setState(776);
			match(OPEN_BRACE);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(777);
				register_list();
				}
			}

			setState(780);
			match(CLOSE_BRACE);
			setState(781);
			match(COMMA);
			setState(782);
			methodReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format35mi_methodContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT35mi_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT35mi_METHOD, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode INLINE_INDEX() { return getToken(SmaliParser.INLINE_INDEX, 0); }
		public Register_listContext register_list() {
			return getRuleContext(Register_listContext.class,0);
		}
		public Insn_format35mi_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format35mi_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format35mi_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format35mi_methodContext insn_format35mi_method() throws RecognitionException {
		Insn_format35mi_methodContext _localctx = new Insn_format35mi_methodContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_insn_format35mi_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(INSTRUCTION_FORMAT35mi_METHOD);
			setState(785);
			match(OPEN_BRACE);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(786);
				register_list();
				}
			}

			setState(789);
			match(CLOSE_BRACE);
			setState(790);
			match(COMMA);
			setState(791);
			match(INLINE_INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format35ms_methodContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT35ms_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT35ms_METHOD, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode VTABLE_INDEX() { return getToken(SmaliParser.VTABLE_INDEX, 0); }
		public Register_listContext register_list() {
			return getRuleContext(Register_listContext.class,0);
		}
		public Insn_format35ms_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format35ms_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format35ms_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format35ms_methodContext insn_format35ms_method() throws RecognitionException {
		Insn_format35ms_methodContext _localctx = new Insn_format35ms_methodContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_insn_format35ms_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(INSTRUCTION_FORMAT35ms_METHOD);
			setState(794);
			match(OPEN_BRACE);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(795);
				register_list();
				}
			}

			setState(798);
			match(CLOSE_BRACE);
			setState(799);
			match(COMMA);
			setState(800);
			match(VTABLE_INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format3rc_call_siteContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT3rc_CALL_SITE() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rc_CALL_SITE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public CallsiteReferenceContext callsiteReference() {
			return getRuleContext(CallsiteReferenceContext.class,0);
		}
		public Insn_format3rc_call_siteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format3rc_call_site; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format3rc_call_site(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format3rc_call_siteContext insn_format3rc_call_site() throws RecognitionException {
		Insn_format3rc_call_siteContext _localctx = new Insn_format3rc_call_siteContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_insn_format3rc_call_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(INSTRUCTION_FORMAT3rc_CALL_SITE);
			setState(803);
			match(OPEN_BRACE);
			setState(804);
			register_range();
			setState(805);
			match(CLOSE_BRACE);
			setState(806);
			match(COMMA);
			setState(807);
			callsiteReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format3rc_methodContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT3rc_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rc_METHOD, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public Insn_format3rc_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format3rc_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format3rc_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format3rc_methodContext insn_format3rc_method() throws RecognitionException {
		Insn_format3rc_methodContext _localctx = new Insn_format3rc_methodContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_insn_format3rc_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(INSTRUCTION_FORMAT3rc_METHOD);
			setState(810);
			match(OPEN_BRACE);
			setState(811);
			register_range();
			setState(812);
			match(CLOSE_BRACE);
			setState(813);
			match(COMMA);
			setState(814);
			methodReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format3rc_method_odexContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT3rc_METHOD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rc_METHOD_ODEX, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public Register_listContext register_list() {
			return getRuleContext(Register_listContext.class,0);
		}
		public Insn_format3rc_method_odexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format3rc_method_odex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format3rc_method_odex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format3rc_method_odexContext insn_format3rc_method_odex() throws RecognitionException {
		Insn_format3rc_method_odexContext _localctx = new Insn_format3rc_method_odexContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_insn_format3rc_method_odex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(INSTRUCTION_FORMAT3rc_METHOD_ODEX);
			setState(817);
			match(OPEN_BRACE);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(818);
				register_list();
				}
			}

			setState(821);
			match(CLOSE_BRACE);
			setState(822);
			match(COMMA);
			setState(823);
			methodReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format3rc_typeContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT3rc_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rc_TYPE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public Insn_format3rc_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format3rc_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format3rc_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format3rc_typeContext insn_format3rc_type() throws RecognitionException {
		Insn_format3rc_typeContext _localctx = new Insn_format3rc_typeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_insn_format3rc_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(INSTRUCTION_FORMAT3rc_TYPE);
			setState(826);
			match(OPEN_BRACE);
			setState(827);
			register_range();
			setState(828);
			match(CLOSE_BRACE);
			setState(829);
			match(COMMA);
			setState(830);
			nonvoid_type_descriptor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format3rmi_methodContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT3rmi_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rmi_METHOD, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode INLINE_INDEX() { return getToken(SmaliParser.INLINE_INDEX, 0); }
		public Insn_format3rmi_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format3rmi_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format3rmi_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format3rmi_methodContext insn_format3rmi_method() throws RecognitionException {
		Insn_format3rmi_methodContext _localctx = new Insn_format3rmi_methodContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_insn_format3rmi_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(INSTRUCTION_FORMAT3rmi_METHOD);
			setState(833);
			match(OPEN_BRACE);
			setState(834);
			register_range();
			setState(835);
			match(CLOSE_BRACE);
			setState(836);
			match(COMMA);
			setState(837);
			match(INLINE_INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format3rms_methodContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT3rms_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rms_METHOD, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode VTABLE_INDEX() { return getToken(SmaliParser.VTABLE_INDEX, 0); }
		public Insn_format3rms_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format3rms_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format3rms_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format3rms_methodContext insn_format3rms_method() throws RecognitionException {
		Insn_format3rms_methodContext _localctx = new Insn_format3rms_methodContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_insn_format3rms_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(INSTRUCTION_FORMAT3rms_METHOD);
			setState(840);
			match(OPEN_BRACE);
			setState(841);
			register_range();
			setState(842);
			match(CLOSE_BRACE);
			setState(843);
			match(COMMA);
			setState(844);
			match(VTABLE_INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format45cc_methodContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT45cc_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT45cc_METHOD, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public MethodProtoContext methodProto() {
			return getRuleContext(MethodProtoContext.class,0);
		}
		public Register_listContext register_list() {
			return getRuleContext(Register_listContext.class,0);
		}
		public Insn_format45cc_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format45cc_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format45cc_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format45cc_methodContext insn_format45cc_method() throws RecognitionException {
		Insn_format45cc_methodContext _localctx = new Insn_format45cc_methodContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_insn_format45cc_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(INSTRUCTION_FORMAT45cc_METHOD);
			setState(847);
			match(OPEN_BRACE);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(848);
				register_list();
				}
			}

			setState(851);
			match(CLOSE_BRACE);
			setState(852);
			match(COMMA);
			setState(853);
			methodReference();
			setState(854);
			match(COMMA);
			setState(855);
			methodProto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format4rcc_methodContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT4rcc_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT4rcc_METHOD, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public MethodProtoContext methodProto() {
			return getRuleContext(MethodProtoContext.class,0);
		}
		public Insn_format4rcc_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format4rcc_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format4rcc_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format4rcc_methodContext insn_format4rcc_method() throws RecognitionException {
		Insn_format4rcc_methodContext _localctx = new Insn_format4rcc_methodContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_insn_format4rcc_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(INSTRUCTION_FORMAT4rcc_METHOD);
			setState(858);
			match(OPEN_BRACE);
			setState(859);
			register_range();
			setState(860);
			match(CLOSE_BRACE);
			setState(861);
			match(COMMA);
			setState(862);
			methodReference();
			setState(863);
			match(COMMA);
			setState(864);
			methodProto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_format51lContext extends ParserRuleContext {
		public TerminalNode INSTRUCTION_FORMAT51l() { return getToken(SmaliParser.INSTRUCTION_FORMAT51l, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Fixed64bitLiteralContext fixed64bitLiteral() {
			return getRuleContext(Fixed64bitLiteralContext.class,0);
		}
		public Insn_format51lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_format51l; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_format51l(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_format51lContext insn_format51l() throws RecognitionException {
		Insn_format51lContext _localctx = new Insn_format51lContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_insn_format51l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(INSTRUCTION_FORMAT51l);
			setState(867);
			match(REGISTER);
			setState(868);
			match(COMMA);
			setState(869);
			fixed64bitLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_array_data_directiveContext extends ParserRuleContext {
		public IntegerLiteralContext elementWidth;
		public TerminalNode ARRAY_DATA_DIRECTIVE() { return getToken(SmaliParser.ARRAY_DATA_DIRECTIVE, 0); }
		public TerminalNode END_ARRAY_DATA_DIRECTIVE() { return getToken(SmaliParser.END_ARRAY_DATA_DIRECTIVE, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public List<Fixed64bitLiteralContext> fixed64bitLiteral() {
			return getRuleContexts(Fixed64bitLiteralContext.class);
		}
		public Fixed64bitLiteralContext fixed64bitLiteral(int i) {
			return getRuleContext(Fixed64bitLiteralContext.class,i);
		}
		public Insn_array_data_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_array_data_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_array_data_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_array_data_directiveContext insn_array_data_directive() throws RecognitionException {
		Insn_array_data_directiveContext _localctx = new Insn_array_data_directiveContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_insn_array_data_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(ARRAY_DATA_DIRECTIVE);
			setState(872);
			((Insn_array_data_directiveContext)_localctx).elementWidth = integerLiteral();
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << SHORT_LITERAL) | (1L << BYTE_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << DOUBLE_LITERAL_OR_ID) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0)) {
				{
				{
				setState(873);
				fixed64bitLiteral();
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(879);
			match(END_ARRAY_DATA_DIRECTIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_packed_switch_directiveContext extends ParserRuleContext {
		public TerminalNode PACKED_SWITCH_DIRECTIVE() { return getToken(SmaliParser.PACKED_SWITCH_DIRECTIVE, 0); }
		public Fixed32bitLiteralContext fixed32bitLiteral() {
			return getRuleContext(Fixed32bitLiteralContext.class,0);
		}
		public TerminalNode END_PACKED_SWITCH_DIRECTIVE() { return getToken(SmaliParser.END_PACKED_SWITCH_DIRECTIVE, 0); }
		public List<Label_refContext> label_ref() {
			return getRuleContexts(Label_refContext.class);
		}
		public Label_refContext label_ref(int i) {
			return getRuleContext(Label_refContext.class,i);
		}
		public Insn_packed_switch_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_packed_switch_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_packed_switch_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_packed_switch_directiveContext insn_packed_switch_directive() throws RecognitionException {
		Insn_packed_switch_directiveContext _localctx = new Insn_packed_switch_directiveContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_insn_packed_switch_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(PACKED_SWITCH_DIRECTIVE);
			setState(882);
			fixed32bitLiteral();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(883);
				label_ref();
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(889);
			match(END_PACKED_SWITCH_DIRECTIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insn_sparse_switch_directiveContext extends ParserRuleContext {
		public TerminalNode SPARSE_SWITCH_DIRECTIVE() { return getToken(SmaliParser.SPARSE_SWITCH_DIRECTIVE, 0); }
		public TerminalNode END_SPARSE_SWITCH_DIRECTIVE() { return getToken(SmaliParser.END_SPARSE_SWITCH_DIRECTIVE, 0); }
		public List<SwitchElementContext> switchElement() {
			return getRuleContexts(SwitchElementContext.class);
		}
		public SwitchElementContext switchElement(int i) {
			return getRuleContext(SwitchElementContext.class,i);
		}
		public Insn_sparse_switch_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insn_sparse_switch_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInsn_sparse_switch_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insn_sparse_switch_directiveContext insn_sparse_switch_directive() throws RecognitionException {
		Insn_sparse_switch_directiveContext _localctx = new Insn_sparse_switch_directiveContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_insn_sparse_switch_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(SPARSE_SWITCH_DIRECTIVE);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << SHORT_LITERAL) | (1L << BYTE_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0)) {
				{
				{
				setState(892);
				switchElement();
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(898);
			match(END_SPARSE_SWITCH_DIRECTIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchElementContext extends ParserRuleContext {
		public Fixed32bitLiteralContext fixed32bitLiteral() {
			return getRuleContext(Fixed32bitLiteralContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SmaliParser.ARROW, 0); }
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public SwitchElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSwitchElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchElementContext switchElement() throws RecognitionException {
		SwitchElementContext _localctx = new SwitchElementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_switchElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			fixed32bitLiteral();
			setState(901);
			match(ARROW);
			setState(902);
			label_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Register_listContext extends ParserRuleContext {
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Register_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitRegister_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Register_listContext register_list() throws RecognitionException {
		Register_listContext _localctx = new Register_listContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_register_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(REGISTER);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(905);
				match(COMMA);
				setState(906);
				match(REGISTER);
				}
				}
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Register_rangeContext extends ParserRuleContext {
		public Token startreg;
		public Token endreg;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public TerminalNode DOTDOT() { return getToken(SmaliParser.DOTDOT, 0); }
		public Register_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitRegister_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Register_rangeContext register_range() throws RecognitionException {
		Register_rangeContext _localctx = new Register_rangeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_register_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(912);
				((Register_rangeContext)_localctx).startreg = match(REGISTER);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOTDOT) {
					{
					setState(913);
					match(DOTDOT);
					setState(914);
					((Register_rangeContext)_localctx).endreg = match(REGISTER);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Verification_error_referenceContext extends ParserRuleContext {
		public Verification_error_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verification_error_reference; }
	 
		public Verification_error_referenceContext() { }
		public void copyFrom(Verification_error_referenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodErrotAltContext extends Verification_error_referenceContext {
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public MethodErrotAltContext(Verification_error_referenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethodErrotAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldErrorAltContext extends Verification_error_referenceContext {
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public FieldErrorAltContext(Verification_error_referenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFieldErrorAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeErrorAltContext extends Verification_error_referenceContext {
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public TypeErrorAltContext(Verification_error_referenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitTypeErrorAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Verification_error_referenceContext verification_error_reference() throws RecognitionException {
		Verification_error_referenceContext _localctx = new Verification_error_referenceContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_verification_error_reference);
		try {
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new TypeErrorAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				match(CLASS_DESCRIPTOR);
				}
				break;
			case 2:
				_localctx = new FieldErrorAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				fieldReference();
				}
				break;
			case 3:
				_localctx = new MethodErrotAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(921);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallsiteReferenceContext extends ParserRuleContext {
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SmaliParser.OPEN_PAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public MethodProtoContext methodProto() {
			return getRuleContext(MethodProtoContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SmaliParser.CLOSE_PAREN, 0); }
		public TerminalNode AT() { return getToken(SmaliParser.AT, 0); }
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public CallsiteReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callsiteReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitCallsiteReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallsiteReferenceContext callsiteReference() throws RecognitionException {
		CallsiteReferenceContext _localctx = new CallsiteReferenceContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_callsiteReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			simpleName();
			setState(925);
			match(OPEN_PAREN);
			setState(926);
			match(STRING_LITERAL);
			setState(927);
			match(COMMA);
			setState(928);
			methodProto();
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(929);
				match(COMMA);
				setState(930);
				literal();
				}
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(936);
			match(CLOSE_PAREN);
			setState(937);
			match(AT);
			setState(938);
			methodReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed32bitLiteralContext extends ParserRuleContext {
		public int type;
		public TerminalNode LONG_LITERAL() { return getToken(SmaliParser.LONG_LITERAL, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode SHORT_LITERAL() { return getToken(SmaliParser.SHORT_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(SmaliParser.BYTE_LITERAL, 0); }
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(SmaliParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(SmaliParser.BOOL_LITERAL, 0); }
		public Fixed32bitLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed32bitLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFixed32bitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed32bitLiteralContext fixed32bitLiteral() throws RecognitionException {
		Fixed32bitLiteralContext _localctx = new Fixed32bitLiteralContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_fixed32bitLiteral);
		try {
			setState(956);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				match(LONG_LITERAL);
				((Fixed32bitLiteralContext)_localctx).type = 1;
				}
				break;
			case POSITIVE_INTEGER_LITERAL:
			case NEGATIVE_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				integerLiteral();
				((Fixed32bitLiteralContext)_localctx).type = 2;
				}
				break;
			case SHORT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(945);
				match(SHORT_LITERAL);
				((Fixed32bitLiteralContext)_localctx).type = 3;
				}
				break;
			case BYTE_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(947);
				match(BYTE_LITERAL);
				((Fixed32bitLiteralContext)_localctx).type = 4;
				}
				break;
			case FLOAT_LITERAL_OR_ID:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(949);
				floatLiteral();
				((Fixed32bitLiteralContext)_localctx).type = 5;
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(952);
				match(CHAR_LITERAL);
				((Fixed32bitLiteralContext)_localctx).type = 6;
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(954);
				match(BOOL_LITERAL);
				((Fixed32bitLiteralContext)_localctx).type = 7;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed64bitLiteralContext extends ParserRuleContext {
		public int type;
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode LONG_LITERAL() { return getToken(SmaliParser.LONG_LITERAL, 0); }
		public TerminalNode SHORT_LITERAL() { return getToken(SmaliParser.SHORT_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(SmaliParser.BYTE_LITERAL, 0); }
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public DoubleLiteralContext doubleLiteral() {
			return getRuleContext(DoubleLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(SmaliParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(SmaliParser.BOOL_LITERAL, 0); }
		public Fixed64bitLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed64bitLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFixed64bitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed64bitLiteralContext fixed64bitLiteral() throws RecognitionException {
		Fixed64bitLiteralContext _localctx = new Fixed64bitLiteralContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_fixed64bitLiteral);
		try {
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITIVE_INTEGER_LITERAL:
			case NEGATIVE_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				integerLiteral();
				((Fixed64bitLiteralContext)_localctx).type = 1;
				}
				break;
			case LONG_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				match(LONG_LITERAL);
				((Fixed64bitLiteralContext)_localctx).type = 2;
				}
				break;
			case SHORT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(963);
				match(SHORT_LITERAL);
				((Fixed64bitLiteralContext)_localctx).type = 3;
				}
				break;
			case BYTE_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(965);
				match(BYTE_LITERAL);
				((Fixed64bitLiteralContext)_localctx).type = 4;
				}
				break;
			case FLOAT_LITERAL_OR_ID:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(967);
				floatLiteral();
				((Fixed64bitLiteralContext)_localctx).type = 5;
				}
				break;
			case DOUBLE_LITERAL_OR_ID:
			case DOUBLE_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(970);
				doubleLiteral();
				((Fixed64bitLiteralContext)_localctx).type = 6;
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(973);
				match(CHAR_LITERAL);
				((Fixed64bitLiteralContext)_localctx).type = 7;
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(975);
				match(BOOL_LITERAL);
				((Fixed64bitLiteralContext)_localctx).type = 8;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\177\u03d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\3\2\7\2\u00da\n\2\f\2\16\2\u00dd\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u00e8\n\3\3\4\3\4\3\4\3\4\3\4\3\5\7\5\u00f0\n\5\f\5\16"+
		"\5\u00f3\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"\u0102\n\t\f\t\16\t\u0105\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13\u0110\n\13\f\13\16\13\u0113\13\13\3\13\3\13\3\f\3\f\3\r\3\r\5\r"+
		"\u011b\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u012f\n\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\5\21\u0137\n\21\3\22\3\22\3\22\3\22\7\22\u013d\n\22\f\22\16\22\u0140"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\5\23\u0147\n\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\5\25\u014f\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\5\27\u015b\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\7\32\u0168\n\32\f\32\16\32\u016b\13\32\3\33\3\33\3\33\5\33\u0170"+
		"\n\33\3\34\3\34\3\34\3\34\5\34\u0176\n\34\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0188\n \3!\3!\3!\3!\3!\3!\3!\5!\u0191"+
		"\n!\3!\7!\u0194\n!\f!\16!\u0197\13!\3!\5!\u019a\n!\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u01a1\n\"\f\"\16\"\u01a4\13\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01e7\n#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01f1"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\5\'\u0208\n\'\3\'\7\'\u020b\n\'\f\'\16\'\u020e\13\'\3\'\5\'\u0211\n\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u021e\n(\3)\3)\3)\3*\3*\3*\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\5,\u022e\n,\3,\3,\3,\5,\u0233\n,\3,\3,\5,\u0237\n,"+
		"\5,\u0239\n,\3-\3-\3-\3.\3.\3.\3/\3/\5/\u0243\n/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3"+
		"<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3"+
		"F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3"+
		"I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3"+
		"L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3P\3"+
		"Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\5T\u02f2\nT\3T\3"+
		"T\3T\3T\3U\3U\3U\5U\u02fb\nU\3U\3U\3U\3U\3V\3V\3V\5V\u0304\nV\3V\3V\3"+
		"V\3V\3W\3W\3W\5W\u030d\nW\3W\3W\3W\3W\3X\3X\3X\5X\u0316\nX\3X\3X\3X\3"+
		"X\3Y\3Y\3Y\5Y\u031f\nY\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3"+
		"[\3[\3[\3\\\3\\\3\\\5\\\u0336\n\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3"+
		"]\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\5`\u0354\n`\3`\3"+
		"`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3c\3c\3c\7c\u036d"+
		"\nc\fc\16c\u0370\13c\3c\3c\3d\3d\3d\7d\u0377\nd\fd\16d\u037a\13d\3d\3"+
		"d\3e\3e\7e\u0380\ne\fe\16e\u0383\13e\3e\3e\3f\3f\3f\3f\3g\3g\3g\7g\u038e"+
		"\ng\fg\16g\u0391\13g\3h\3h\3h\5h\u0396\nh\5h\u0398\nh\3i\3i\3i\5i\u039d"+
		"\ni\3j\3j\3j\3j\3j\3j\3j\7j\u03a6\nj\fj\16j\u03a9\13j\3j\3j\3j\3j\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u03bf\nk\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u03d4\nl\3l\2\2m\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\2\13\24\2\"#\'(+,/\62\66\679;=>BGKKMQSSUUXXZZ\\bilnnqr\3\2\"#\4\2\'\'"+
		"))\3\2lo\3\2mo\3\2>?\3\2QR\3\2XY\3\2]^\2\u03ff\2\u00db\3\2\2\2\4\u00e7"+
		"\3\2\2\2\6\u00e9\3\2\2\2\b\u00f1\3\2\2\2\n\u00f4\3\2\2\2\f\u00f7\3\2\2"+
		"\2\16\u00fa\3\2\2\2\20\u00fd\3\2\2\2\22\u0108\3\2\2\2\24\u010c\3\2\2\2"+
		"\26\u0116\3\2\2\2\30\u011a\3\2\2\2\32\u012e\3\2\2\2\34\u0130\3\2\2\2\36"+
		"\u0132\3\2\2\2 \u0136\3\2\2\2\"\u0138\3\2\2\2$\u0146\3\2\2\2&\u0148\3"+
		"\2\2\2(\u014e\3\2\2\2*\u0154\3\2\2\2,\u015a\3\2\2\2.\u015f\3\2\2\2\60"+
		"\u0164\3\2\2\2\62\u0169\3\2\2\2\64\u016f\3\2\2\2\66\u0175\3\2\2\28\u0177"+
		"\3\2\2\2:\u0179\3\2\2\2<\u017c\3\2\2\2>\u0187\3\2\2\2@\u0189\3\2\2\2B"+
		"\u019b\3\2\2\2D\u01e6\3\2\2\2F\u01f0\3\2\2\2H\u01f2\3\2\2\2J\u01fb\3\2"+
		"\2\2L\u0203\3\2\2\2N\u021d\3\2\2\2P\u021f\3\2\2\2R\u0222\3\2\2\2T\u0225"+
		"\3\2\2\2V\u0228\3\2\2\2X\u023a\3\2\2\2Z\u023d\3\2\2\2\\\u0240\3\2\2\2"+
		"^\u0244\3\2\2\2`\u0246\3\2\2\2b\u0248\3\2\2\2d\u024a\3\2\2\2f\u024c\3"+
		"\2\2\2h\u024f\3\2\2\2j\u0251\3\2\2\2l\u0253\3\2\2\2n\u0258\3\2\2\2p\u025b"+
		"\3\2\2\2r\u0260\3\2\2\2t\u0265\3\2\2\2v\u0268\3\2\2\2x\u026d\3\2\2\2z"+
		"\u0272\3\2\2\2|\u0277\3\2\2\2~\u027c\3\2\2\2\u0080\u0281\3\2\2\2\u0082"+
		"\u0286\3\2\2\2\u0084\u028b\3\2\2\2\u0086\u0290\3\2\2\2\u0088\u0295\3\2"+
		"\2\2\u008a\u029a\3\2\2\2\u008c\u02a1\3\2\2\2\u008e\u02a8\3\2\2\2\u0090"+
		"\u02af\3\2\2\2\u0092\u02b6\3\2\2\2\u0094\u02bd\3\2\2\2\u0096\u02c4\3\2"+
		"\2\2\u0098\u02cb\3\2\2\2\u009a\u02d0\3\2\2\2\u009c\u02d7\3\2\2\2\u009e"+
		"\u02da\3\2\2\2\u00a0\u02df\3\2\2\2\u00a2\u02e4\3\2\2\2\u00a4\u02e9\3\2"+
		"\2\2\u00a6\u02ee\3\2\2\2\u00a8\u02f7\3\2\2\2\u00aa\u0300\3\2\2\2\u00ac"+
		"\u0309\3\2\2\2\u00ae\u0312\3\2\2\2\u00b0\u031b\3\2\2\2\u00b2\u0324\3\2"+
		"\2\2\u00b4\u032b\3\2\2\2\u00b6\u0332\3\2\2\2\u00b8\u033b\3\2\2\2\u00ba"+
		"\u0342\3\2\2\2\u00bc\u0349\3\2\2\2\u00be\u0350\3\2\2\2\u00c0\u035b\3\2"+
		"\2\2\u00c2\u0364\3\2\2\2\u00c4\u0369\3\2\2\2\u00c6\u0373\3\2\2\2\u00c8"+
		"\u037d\3\2\2\2\u00ca\u0386\3\2\2\2\u00cc\u038a\3\2\2\2\u00ce\u0397\3\2"+
		"\2\2\u00d0\u039c\3\2\2\2\u00d2\u039e\3\2\2\2\u00d4\u03be\3\2\2\2\u00d6"+
		"\u03d3\3\2\2\2\u00d8\u00da\5\4\3\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\7\2\2\3\u00df\3\3\2\2\2\u00e0\u00e8\5\6\4\2"+
		"\u00e1\u00e8\5\n\6\2\u00e2\u00e8\5\f\7\2\u00e3\u00e8\5\16\b\2\u00e4\u00e8"+
		"\5\20\t\2\u00e5\u00e8\5@!\2\u00e6\u00e8\5B\"\2\u00e7\u00e0\3\2\2\2\u00e7"+
		"\u00e1\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\5\3\2\2\2\u00e9\u00ea"+
		"\7\3\2\2\u00ea\u00eb\5\b\5\2\u00eb\u00ec\7m\2\2\u00ec\u00ed\b\4\1\2\u00ed"+
		"\7\3\2\2\2\u00ee\u00f0\7\60\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2"+
		"\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\t\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f5\7\4\2\2\u00f5\u00f6\7m\2\2\u00f6\13\3\2\2\2\u00f7"+
		"\u00f8\7\6\2\2\u00f8\u00f9\7-\2\2\u00f9\r\3\2\2\2\u00fa\u00fb\7\5\2\2"+
		"\u00fb\u00fc\7m\2\2\u00fc\17\3\2\2\2\u00fd\u00fe\7\13\2\2\u00fe\u00ff"+
		"\7\61\2\2\u00ff\u0103\7m\2\2\u0100\u0102\5\22\n\2\u0101\u0100\3\2\2\2"+
		"\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\f\2\2\u0107\21\3\2\2\2\u0108"+
		"\u0109\5\26\f\2\u0109\u010a\7v\2\2\u010a\u010b\5\32\16\2\u010b\23\3\2"+
		"\2\2\u010c\u010d\7\t\2\2\u010d\u0111\7m\2\2\u010e\u0110\5\22\n\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\n\2\2\u0115"+
		"\25\3\2\2\2\u0116\u0117\t\2\2\2\u0117\27\3\2\2\2\u0118\u011b\5\26\f\2"+
		"\u0119\u011b\7s\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\31\3"+
		"\2\2\2\u011c\u012f\7$\2\2\u011d\u012f\5\34\17\2\u011e\u012f\7%\2\2\u011f"+
		"\u012f\7&\2\2\u0120\u012f\5\36\20\2\u0121\u012f\5 \21\2\u0122\u012f\7"+
		".\2\2\u0123\u012f\7-\2\2\u0124\u012f\7+\2\2\u0125\u012f\7,\2\2\u0126\u012f"+
		"\5\"\22\2\u0127\u012f\5\24\13\2\u0128\u012f\5$\23\2\u0129\u012f\5&\24"+
		"\2\u012a\u012f\5*\26\2\u012b\u012f\5:\36\2\u012c\u012f\5<\37\2\u012d\u012f"+
		"\5.\30\2\u012e\u011c\3\2\2\2\u012e\u011d\3\2\2\2\u012e\u011e\3\2\2\2\u012e"+
		"\u011f\3\2\2\2\u012e\u0120\3\2\2\2\u012e\u0121\3\2\2\2\u012e\u0122\3\2"+
		"\2\2\u012e\u0123\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0125\3\2\2\2\u012e"+
		"\u0126\3\2\2\2\u012e\u0127\3\2\2\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2"+
		"\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\33\3\2\2\2\u0130\u0131\t\3\2\2\u0131\35\3\2\2\2\u0132"+
		"\u0133\t\4\2\2\u0133\37\3\2\2\2\u0134\u0137\7(\2\2\u0135\u0137\7*\2\2"+
		"\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137!\3\2\2\2\u0138\u0139\7"+
		"y\2\2\u0139\u013e\5\32\16\2\u013a\u013b\7x\2\2\u013b\u013d\5\32\16\2\u013c"+
		"\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7z\2\2\u0142"+
		"#\3\2\2\2\u0143\u0147\5\66\34\2\u0144\u0147\7n\2\2\u0145\u0147\7l\2\2"+
		"\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147%\3"+
		"\2\2\2\u0148\u0149\5(\25\2\u0149\'\3\2\2\2\u014a\u014b\5\66\34\2\u014b"+
		"\u014c\7u\2\2\u014c\u014d\b\25\1\2\u014d\u014f\3\2\2\2\u014e\u014a\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\5\30\r\2\u0151"+
		"\u0152\7w\2\2\u0152\u0153\58\35\2\u0153)\3\2\2\2\u0154\u0155\5,\27\2\u0155"+
		"+\3\2\2\2\u0156\u0157\5\66\34\2\u0157\u0158\7u\2\2\u0158\u0159\b\27\1"+
		"\2\u0159\u015b\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015d\5\30\r\2\u015d\u015e\5.\30\2\u015e-\3\2\2\2\u015f"+
		"\u0160\7{\2\2\u0160\u0161\5\62\32\2\u0161\u0162\7|\2\2\u0162\u0163\5\60"+
		"\31\2\u0163/\3\2\2\2\u0164\u0165\t\5\2\2\u0165\61\3\2\2\2\u0166\u0168"+
		"\5\64\33\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2"+
		"\u0169\u016a\3\2\2\2\u016a\63\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0170"+
		"\58\35\2\u016d\u0170\7p\2\2\u016e\u0170\7q\2\2\u016f\u016c\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\65\3\2\2\2\u0171\u0172\7m\2\2"+
		"\u0172\u0176\b\34\1\2\u0173\u0174\7o\2\2\u0174\u0176\b\34\1\2\u0175\u0171"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0176\67\3\2\2\2\u0177\u0178\t\6\2\2\u0178"+
		"9\3\2\2\2\u0179\u017a\7\r\2\2\u017a\u017b\5(\25\2\u017b;\3\2\2\2\u017c"+
		"\u017d\5> \2\u017d=\3\2\2\2\u017e\u017f\7\66\2\2\u017f\u0180\7~\2\2\u0180"+
		"\u0188\5(\25\2\u0181\u0182\7\67\2\2\u0182\u0183\7~\2\2\u0183\u0188\5,"+
		"\27\2\u0184\u0185\7^\2\2\u0185\u0186\7~\2\2\u0186\u0188\5,\27\2\u0187"+
		"\u017e\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0184\3\2\2\2\u0188?\3\2\2\2"+
		"\u0189\u018a\7\7\2\2\u018a\u018b\5\b\5\2\u018b\u018c\5\30\r\2\u018c\u018d"+
		"\7w\2\2\u018d\u0190\58\35\2\u018e\u018f\7v\2\2\u018f\u0191\5\32\16\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0199\3\2\2\2\u0192\u0194\5\20"+
		"\t\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7\b"+
		"\2\2\u0199\u0195\3\2\2\2\u0199\u019a\3\2\2\2\u019aA\3\2\2\2\u019b\u019c"+
		"\7\16\2\2\u019c\u019d\5\b\5\2\u019d\u019e\5\30\r\2\u019e\u01a2\5.\30\2"+
		"\u019f\u01a1\5D#\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a6\7\17\2\2\u01a6C\3\2\2\2\u01a7\u01e7\5F$\2\u01a8\u01e7\5H%\2\u01a9"+
		"\u01e7\5J&\2\u01aa\u01e7\5L\'\2\u01ab\u01e7\5\20\t\2\u01ac\u01e7\5R*\2"+
		"\u01ad\u01e7\5T+\2\u01ae\u01e7\5V,\2\u01af\u01e7\5X-\2\u01b0\u01e7\5Z"+
		".\2\u01b1\u01e7\7 \2\2\u01b2\u01e7\7!\2\2\u01b3\u01e7\5\\/\2\u01b4\u01e7"+
		"\5f\64\2\u01b5\u01e7\5h\65\2\u01b6\u01e7\5j\66\2\u01b7\u01e7\5l\67\2\u01b8"+
		"\u01e7\5n8\2\u01b9\u01e7\5p9\2\u01ba\u01e7\5r:\2\u01bb\u01e7\5t;\2\u01bc"+
		"\u01e7\5v<\2\u01bd\u01e7\5x=\2\u01be\u01e7\5z>\2\u01bf\u01e7\5|?\2\u01c0"+
		"\u01e7\5~@\2\u01c1\u01e7\5\u0080A\2\u01c2\u01e7\5\u0082B\2\u01c3\u01e7"+
		"\5\u0084C\2\u01c4\u01e7\5\u0086D\2\u01c5\u01e7\5\u0088E\2\u01c6\u01e7"+
		"\5\u008aF\2\u01c7\u01e7\5\u008cG\2\u01c8\u01e7\5\u008eH\2\u01c9\u01e7"+
		"\5\u0090I\2\u01ca\u01e7\5\u0092J\2\u01cb\u01e7\5\u0094K\2\u01cc\u01e7"+
		"\5\u0096L\2\u01cd\u01e7\5\u0098M\2\u01ce\u01e7\5\u009aN\2\u01cf\u01e7"+
		"\5\u009cO\2\u01d0\u01e7\5\u009eP\2\u01d1\u01e7\5\u00a0Q\2\u01d2\u01e7"+
		"\5\u00a2R\2\u01d3\u01e7\5\u00a4S\2\u01d4\u01e7\5\u00a6T\2\u01d5\u01e7"+
		"\5\u00a8U\2\u01d6\u01e7\5\u00aaV\2\u01d7\u01e7\5\u00acW\2\u01d8\u01e7"+
		"\5\u00aeX\2\u01d9\u01e7\5\u00b0Y\2\u01da\u01e7\5\u00b2Z\2\u01db\u01e7"+
		"\5\u00b4[\2\u01dc\u01e7\5\u00b6\\\2\u01dd\u01e7\5\u00b8]\2\u01de\u01e7"+
		"\5\u00ba^\2\u01df\u01e7\5\u00bc_\2\u01e0\u01e7\5\u00be`\2\u01e1\u01e7"+
		"\5\u00c0a\2\u01e2\u01e7\5\u00c2b\2\u01e3\u01e7\5\u00c4c\2\u01e4\u01e7"+
		"\5\u00c6d\2\u01e5\u01e7\5\u00c8e\2\u01e6\u01a7\3\2\2\2\u01e6\u01a8\3\2"+
		"\2\2\u01e6\u01a9\3\2\2\2\u01e6\u01aa\3\2\2\2\u01e6\u01ab\3\2\2\2\u01e6"+
		"\u01ac\3\2\2\2\u01e6\u01ad\3\2\2\2\u01e6\u01ae\3\2\2\2\u01e6\u01af\3\2"+
		"\2\2\u01e6\u01b0\3\2\2\2\u01e6\u01b1\3\2\2\2\u01e6\u01b2\3\2\2\2\u01e6"+
		"\u01b3\3\2\2\2\u01e6\u01b4\3\2\2\2\u01e6\u01b5\3\2\2\2\u01e6\u01b6\3\2"+
		"\2\2\u01e6\u01b7\3\2\2\2\u01e6\u01b8\3\2\2\2\u01e6\u01b9\3\2\2\2\u01e6"+
		"\u01ba\3\2\2\2\u01e6\u01bb\3\2\2\2\u01e6\u01bc\3\2\2\2\u01e6\u01bd\3\2"+
		"\2\2\u01e6\u01be\3\2\2\2\u01e6\u01bf\3\2\2\2\u01e6\u01c0\3\2\2\2\u01e6"+
		"\u01c1\3\2\2\2\u01e6\u01c2\3\2\2\2\u01e6\u01c3\3\2\2\2\u01e6\u01c4\3\2"+
		"\2\2\u01e6\u01c5\3\2\2\2\u01e6\u01c6\3\2\2\2\u01e6\u01c7\3\2\2\2\u01e6"+
		"\u01c8\3\2\2\2\u01e6\u01c9\3\2\2\2\u01e6\u01ca\3\2\2\2\u01e6\u01cb\3\2"+
		"\2\2\u01e6\u01cc\3\2\2\2\u01e6\u01cd\3\2\2\2\u01e6\u01ce\3\2\2\2\u01e6"+
		"\u01cf\3\2\2\2\u01e6\u01d0\3\2\2\2\u01e6\u01d1\3\2\2\2\u01e6\u01d2\3\2"+
		"\2\2\u01e6\u01d3\3\2\2\2\u01e6\u01d4\3\2\2\2\u01e6\u01d5\3\2\2\2\u01e6"+
		"\u01d6\3\2\2\2\u01e6\u01d7\3\2\2\2\u01e6\u01d8\3\2\2\2\u01e6\u01d9\3\2"+
		"\2\2\u01e6\u01da\3\2\2\2\u01e6\u01db\3\2\2\2\u01e6\u01dc\3\2\2\2\u01e6"+
		"\u01dd\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6\u01df\3\2\2\2\u01e6\u01e0\3\2"+
		"\2\2\u01e6\u01e1\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7E\3\2\2\2\u01e8\u01e9\7\20\2\2"+
		"\u01e9\u01ea\5N(\2\u01ea\u01eb\b$\1\2\u01eb\u01f1\3\2\2\2\u01ec\u01ed"+
		"\7\21\2\2\u01ed\u01ee\5N(\2\u01ee\u01ef\b$\1\2\u01ef\u01f1\3\2\2\2\u01f0"+
		"\u01e8\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f1G\3\2\2\2\u01f2\u01f3\7\30\2\2"+
		"\u01f3\u01f4\58\35\2\u01f4\u01f5\7y\2\2\u01f5\u01f6\5P)\2\u01f6\u01f7"+
		"\7t\2\2\u01f7\u01f8\5P)\2\u01f8\u01f9\7z\2\2\u01f9\u01fa\5P)\2\u01faI"+
		"\3\2\2\2\u01fb\u01fc\7\31\2\2\u01fc\u01fd\7y\2\2\u01fd\u01fe\5P)\2\u01fe"+
		"\u01ff\7t\2\2\u01ff\u0200\5P)\2\u0200\u0201\7z\2\2\u0201\u0202\5P)\2\u0202"+
		"K\3\2\2\2\u0203\u0204\7\33\2\2\u0204\u0207\7/\2\2\u0205\u0206\7x\2\2\u0206"+
		"\u0208\7-\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0210\3\2"+
		"\2\2\u0209\u020b\5\20\t\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020f\u0211\7\34\2\2\u0210\u020c\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"M\3\2\2\2\u0212\u0213\7$\2\2\u0213\u021e\b(\1\2\u0214\u0215\5\34\17\2"+
		"\u0215\u0216\b(\1\2\u0216\u021e\3\2\2\2\u0217\u0218\7%\2\2\u0218\u021e"+
		"\b(\1\2\u0219\u021a\7.\2\2\u021a\u021e\b(\1\2\u021b\u021c\7&\2\2\u021c"+
		"\u021e\b(\1\2\u021d\u0212\3\2\2\2\u021d\u0214\3\2\2\2\u021d\u0217\3\2"+
		"\2\2\u021d\u0219\3\2\2\2\u021d\u021b\3\2\2\2\u021eO\3\2\2\2\u021f\u0220"+
		"\7w\2\2\u0220\u0221\5\26\f\2\u0221Q\3\2\2\2\u0222\u0223\7w\2\2\u0223\u0224"+
		"\5\26\f\2\u0224S\3\2\2\2\u0225\u0226\7\32\2\2\u0226\u0227\5N(\2\u0227"+
		"U\3\2\2\2\u0228\u0229\7\35\2\2\u0229\u0238\7/\2\2\u022a\u022d\7x\2\2\u022b"+
		"\u022e\7,\2\2\u022c\u022e\7-\2\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2\2"+
		"\2\u022e\u022f\3\2\2\2\u022f\u0232\7w\2\2\u0230\u0233\7l\2\2\u0231\u0233"+
		"\58\35\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0235\7x\2\2\u0235\u0237\7-\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2"+
		"\2\u0237\u0239\3\2\2\2\u0238\u022a\3\2\2\2\u0238\u0239\3\2\2\2\u0239W"+
		"\3\2\2\2\u023a\u023b\7\36\2\2\u023b\u023c\7/\2\2\u023cY\3\2\2\2\u023d"+
		"\u023e\7\37\2\2\u023e\u023f\7/\2\2\u023f[\3\2\2\2\u0240\u0242\7\6\2\2"+
		"\u0241\u0243\7-\2\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243]\3\2"+
		"\2\2\u0244\u0245\t\7\2\2\u0245_\3\2\2\2\u0246\u0247\t\b\2\2\u0247a\3\2"+
		"\2\2\u0248\u0249\t\t\2\2\u0249c\3\2\2\2\u024a\u024b\t\n\2\2\u024be\3\2"+
		"\2\2\u024c\u024d\79\2\2\u024d\u024e\5P)\2\u024eg\3\2\2\2\u024f\u0250\7"+
		":\2\2\u0250i\3\2\2\2\u0251\u0252\7;\2\2\u0252k\3\2\2\2\u0253\u0254\7<"+
		"\2\2\u0254\u0255\7/\2\2\u0255\u0256\7x\2\2\u0256\u0257\5N(\2\u0257m\3"+
		"\2\2\2\u0258\u0259\7=\2\2\u0259\u025a\7/\2\2\u025ao\3\2\2\2\u025b\u025c"+
		"\5^\60\2\u025c\u025d\7/\2\2\u025d\u025e\7x\2\2\u025e\u025f\7/\2\2\u025f"+
		"q\3\2\2\2\u0260\u0261\7@\2\2\u0261\u0262\7\62\2\2\u0262\u0263\7x\2\2\u0263"+
		"\u0264\5\u00d0i\2\u0264s\3\2\2\2\u0265\u0266\7A\2\2\u0266\u0267\5P)\2"+
		"\u0267u\3\2\2\2\u0268\u0269\7B\2\2\u0269\u026a\7/\2\2\u026a\u026b\7x\2"+
		"\2\u026b\u026c\5(\25\2\u026cw\3\2\2\2\u026d\u026e\7C\2\2\u026e\u026f\7"+
		"/\2\2\u026f\u0270\7x\2\2\u0270\u0271\5(\25\2\u0271y\3\2\2\2\u0272\u0273"+
		"\7F\2\2\u0273\u0274\7/\2\2\u0274\u0275\7x\2\2\u0275\u0276\5> \2\u0276"+
		"{\3\2\2\2\u0277\u0278\7G\2\2\u0278\u0279\7/\2\2\u0279\u027a\7x\2\2\u027a"+
		"\u027b\5.\30\2\u027b}\3\2\2\2\u027c\u027d\7D\2\2\u027d\u027e\7/\2\2\u027e"+
		"\u027f\7x\2\2\u027f\u0280\7-\2\2\u0280\177\3\2\2\2\u0281\u0282\7E\2\2"+
		"\u0282\u0283\7/\2\2\u0283\u0284\7x\2\2\u0284\u0285\58\35\2\u0285\u0081"+
		"\3\2\2\2\u0286\u0287\7H\2\2\u0287\u0288\7/\2\2\u0288\u0289\7x\2\2\u0289"+
		"\u028a\5\u00d4k\2\u028a\u0083\3\2\2\2\u028b\u028c\7I\2\2\u028c\u028d\7"+
		"/\2\2\u028d\u028e\7x\2\2\u028e\u028f\5\u00d6l\2\u028f\u0085\3\2\2\2\u0290"+
		"\u0291\7J\2\2\u0291\u0292\7/\2\2\u0292\u0293\7x\2\2\u0293\u0294\5N(\2"+
		"\u0294\u0087\3\2\2\2\u0295\u0296\7K\2\2\u0296\u0297\7/\2\2\u0297\u0298"+
		"\7x\2\2\u0298\u0299\5P)\2\u0299\u0089\3\2\2\2\u029a\u029b\7L\2\2\u029b"+
		"\u029c\7/\2\2\u029c\u029d\7x\2\2\u029d\u029e\7/\2\2\u029e\u029f\7x\2\2"+
		"\u029f\u02a0\5N(\2\u02a0\u008b\3\2\2\2\u02a1\u02a2\7M\2\2\u02a2\u02a3"+
		"\7/\2\2\u02a3\u02a4\7x\2\2\u02a4\u02a5\7/\2\2\u02a5\u02a6\7x\2\2\u02a6"+
		"\u02a7\5(\25\2\u02a7\u008d\3\2\2\2\u02a8\u02a9\7N\2\2\u02a9\u02aa\7/\2"+
		"\2\u02aa\u02ab\7x\2\2\u02ab\u02ac\7/\2\2\u02ac\u02ad\7x\2\2\u02ad\u02ae"+
		"\5(\25\2\u02ae\u008f\3\2\2\2\u02af\u02b0\7O\2\2\u02b0\u02b1\7/\2\2\u02b1"+
		"\u02b2\7x\2\2\u02b2\u02b3\7/\2\2\u02b3\u02b4\7x\2\2\u02b4\u02b5\58\35"+
		"\2\u02b5\u0091\3\2\2\2\u02b6\u02b7\7P\2\2\u02b7\u02b8\7/\2\2\u02b8\u02b9"+
		"\7x\2\2\u02b9\u02ba\7/\2\2\u02ba\u02bb\7x\2\2\u02bb\u02bc\7\65\2\2\u02bc"+
		"\u0093\3\2\2\2\u02bd\u02be\5`\61\2\u02be\u02bf\7/\2\2\u02bf\u02c0\7x\2"+
		"\2\u02c0\u02c1\7/\2\2\u02c1\u02c2\7x\2\2\u02c2\u02c3\5N(\2\u02c3\u0095"+
		"\3\2\2\2\u02c4\u02c5\7S\2\2\u02c5\u02c6\7/\2\2\u02c6\u02c7\7x\2\2\u02c7"+
		"\u02c8\7/\2\2\u02c8\u02c9\7x\2\2\u02c9\u02ca\5P)\2\u02ca\u0097\3\2\2\2"+
		"\u02cb\u02cc\7T\2\2\u02cc\u02cd\7/\2\2\u02cd\u02ce\7x\2\2\u02ce\u02cf"+
		"\7/\2\2\u02cf\u0099\3\2\2\2\u02d0\u02d1\7U\2\2\u02d1\u02d2\7/\2\2\u02d2"+
		"\u02d3\7x\2\2\u02d3\u02d4\7/\2\2\u02d4\u02d5\7x\2\2\u02d5\u02d6\7/\2\2"+
		"\u02d6\u009b\3\2\2\2\u02d7\u02d8\7V\2\2\u02d8\u02d9\5P)\2\u02d9\u009d"+
		"\3\2\2\2\u02da\u02db\7W\2\2\u02db\u02dc\7/\2\2\u02dc\u02dd\7x\2\2\u02dd"+
		"\u02de\7-\2\2\u02de\u009f\3\2\2\2\u02df\u02e0\5b\62\2\u02e0\u02e1\7/\2"+
		"\2\u02e1\u02e2\7x\2\2\u02e2\u02e3\5\u00d4k\2\u02e3\u00a1\3\2\2\2\u02e4"+
		"\u02e5\7Z\2\2\u02e5\u02e6\7/\2\2\u02e6\u02e7\7x\2\2\u02e7\u02e8\5P)\2"+
		"\u02e8\u00a3\3\2\2\2\u02e9\u02ea\7[\2\2\u02ea\u02eb\7/\2\2\u02eb\u02ec"+
		"\7x\2\2\u02ec\u02ed\7/\2\2\u02ed\u00a5\3\2\2\2\u02ee\u02ef\7\\\2\2\u02ef"+
		"\u02f1\7y\2\2\u02f0\u02f2\5\u00ccg\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3"+
		"\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\7z\2\2\u02f4\u02f5\7x\2\2\u02f5"+
		"\u02f6\5\u00d2j\2\u02f6\u00a7\3\2\2\2\u02f7\u02f8\5d\63\2\u02f8\u02fa"+
		"\7y\2\2\u02f9\u02fb\5\u00ccg\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2"+
		"\u02fb\u02fc\3\2\2\2\u02fc\u02fd\7z\2\2\u02fd\u02fe\7x\2\2\u02fe\u02ff"+
		"\5,\27\2\u02ff\u00a9\3\2\2\2\u0300\u0301\7`\2\2\u0301\u0303\7y\2\2\u0302"+
		"\u0304\5\u00ccg\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305"+
		"\3\2\2\2\u0305\u0306\7z\2\2\u0306\u0307\7x\2\2\u0307\u0308\58\35\2\u0308"+
		"\u00ab\3\2\2\2\u0309\u030a\7_\2\2\u030a\u030c\7y\2\2\u030b\u030d\5\u00cc"+
		"g\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u030f\7z\2\2\u030f\u0310\7x\2\2\u0310\u0311\5,\27\2\u0311\u00ad\3\2\2"+
		"\2\u0312\u0313\7a\2\2\u0313\u0315\7y\2\2\u0314\u0316\5\u00ccg\2\u0315"+
		"\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7z"+
		"\2\2\u0318\u0319\7x\2\2\u0319\u031a\7\63\2\2\u031a\u00af\3\2\2\2\u031b"+
		"\u031c\7b\2\2\u031c\u031e\7y\2\2\u031d\u031f\5\u00ccg\2\u031e\u031d\3"+
		"\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\7z\2\2\u0321"+
		"\u0322\7x\2\2\u0322\u0323\7\64\2\2\u0323\u00b1\3\2\2\2\u0324\u0325\7c"+
		"\2\2\u0325\u0326\7y\2\2\u0326\u0327\5\u00ceh\2\u0327\u0328\7z\2\2\u0328"+
		"\u0329\7x\2\2\u0329\u032a\5\u00d2j\2\u032a\u00b3\3\2\2\2\u032b\u032c\7"+
		"d\2\2\u032c\u032d\7y\2\2\u032d\u032e\5\u00ceh\2\u032e\u032f\7z\2\2\u032f"+
		"\u0330\7x\2\2\u0330\u0331\5,\27\2\u0331\u00b5\3\2\2\2\u0332\u0333\7e\2"+
		"\2\u0333\u0335\7y\2\2\u0334\u0336\5\u00ccg\2\u0335\u0334\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\7z\2\2\u0338\u0339\7x\2"+
		"\2\u0339\u033a\5,\27\2\u033a\u00b7\3\2\2\2\u033b\u033c\7f\2\2\u033c\u033d"+
		"\7y\2\2\u033d\u033e\5\u00ceh\2\u033e\u033f\7z\2\2\u033f\u0340\7x\2\2\u0340"+
		"\u0341\58\35\2\u0341\u00b9\3\2\2\2\u0342\u0343\7g\2\2\u0343\u0344\7y\2"+
		"\2\u0344\u0345\5\u00ceh\2\u0345\u0346\7z\2\2\u0346\u0347\7x\2\2\u0347"+
		"\u0348\7\63\2\2\u0348\u00bb\3\2\2\2\u0349\u034a\7h\2\2\u034a\u034b\7y"+
		"\2\2\u034b\u034c\5\u00ceh\2\u034c\u034d\7z\2\2\u034d\u034e\7x\2\2\u034e"+
		"\u034f\7\64\2\2\u034f\u00bd\3\2\2\2\u0350\u0351\7i\2\2\u0351\u0353\7y"+
		"\2\2\u0352\u0354\5\u00ccg\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0356\7z\2\2\u0356\u0357\7x\2\2\u0357\u0358\5,\27"+
		"\2\u0358\u0359\7x\2\2\u0359\u035a\5.\30\2\u035a\u00bf\3\2\2\2\u035b\u035c"+
		"\7j\2\2\u035c\u035d\7y\2\2\u035d\u035e\5\u00ceh\2\u035e\u035f\7z\2\2\u035f"+
		"\u0360\7x\2\2\u0360\u0361\5,\27\2\u0361\u0362\7x\2\2\u0362\u0363\5.\30"+
		"\2\u0363\u00c1\3\2\2\2\u0364\u0365\7k\2\2\u0365\u0366\7/\2\2\u0366\u0367"+
		"\7x\2\2\u0367\u0368\5\u00d6l\2\u0368\u00c3\3\2\2\2\u0369\u036a\7\22\2"+
		"\2\u036a\u036e\5\34\17\2\u036b\u036d\5\u00d6l\2\u036c\u036b\3\2\2\2\u036d"+
		"\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2"+
		"\2\2\u0370\u036e\3\2\2\2\u0371\u0372\7\23\2\2\u0372\u00c5\3\2\2\2\u0373"+
		"\u0374\7\24\2\2\u0374\u0378\5\u00d4k\2\u0375\u0377\5P)\2\u0376\u0375\3"+
		"\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379"+
		"\u037b\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c\7\25\2\2\u037c\u00c7\3"+
		"\2\2\2\u037d\u0381\7\26\2\2\u037e\u0380\5\u00caf\2\u037f\u037e\3\2\2\2"+
		"\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0384"+
		"\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0385\7\27\2\2\u0385\u00c9\3\2\2\2"+
		"\u0386\u0387\5\u00d4k\2\u0387\u0388\7u\2\2\u0388\u0389\5P)\2\u0389\u00cb"+
		"\3\2\2\2\u038a\u038f\7/\2\2\u038b\u038c\7x\2\2\u038c\u038e\7/\2\2\u038d"+
		"\u038b\3\2\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2"+
		"\2\2\u0390\u00cd\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u0395\7/\2\2\u0393"+
		"\u0394\7t\2\2\u0394\u0396\7/\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2"+
		"\2\u0396\u0398\3\2\2\2\u0397\u0392\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u00cf"+
		"\3\2\2\2\u0399\u039d\7m\2\2\u039a\u039d\5(\25\2\u039b\u039d\5,\27\2\u039c"+
		"\u0399\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039b\3\2\2\2\u039d\u00d1\3\2"+
		"\2\2\u039e\u039f\5\26\f\2\u039f\u03a0\7{\2\2\u03a0\u03a1\7-\2\2\u03a1"+
		"\u03a2\7x\2\2\u03a2\u03a7\5.\30\2\u03a3\u03a4\7x\2\2\u03a4\u03a6\5\32"+
		"\16\2\u03a5\u03a3\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\7|"+
		"\2\2\u03ab\u03ac\7~\2\2\u03ac\u03ad\5,\27\2\u03ad\u00d3\3\2\2\2\u03ae"+
		"\u03af\7$\2\2\u03af\u03bf\bk\1\2\u03b0\u03b1\5\34\17\2\u03b1\u03b2\bk"+
		"\1\2\u03b2\u03bf\3\2\2\2\u03b3\u03b4\7%\2\2\u03b4\u03bf\bk\1\2\u03b5\u03b6"+
		"\7&\2\2\u03b6\u03bf\bk\1\2\u03b7\u03b8\5\36\20\2\u03b8\u03b9\bk\1\2\u03b9"+
		"\u03bf\3\2\2\2\u03ba\u03bb\7.\2\2\u03bb\u03bf\bk\1\2\u03bc\u03bd\7+\2"+
		"\2\u03bd\u03bf\bk\1\2\u03be\u03ae\3\2\2\2\u03be\u03b0\3\2\2\2\u03be\u03b3"+
		"\3\2\2\2\u03be\u03b5\3\2\2\2\u03be\u03b7\3\2\2\2\u03be\u03ba\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03bf\u00d5\3\2\2\2\u03c0\u03c1\5\34\17\2\u03c1\u03c2\b"+
		"l\1\2\u03c2\u03d4\3\2\2\2\u03c3\u03c4\7$\2\2\u03c4\u03d4\bl\1\2\u03c5"+
		"\u03c6\7%\2\2\u03c6\u03d4\bl\1\2\u03c7\u03c8\7&\2\2\u03c8\u03d4\bl\1\2"+
		"\u03c9\u03ca\5\36\20\2\u03ca\u03cb\bl\1\2\u03cb\u03d4\3\2\2\2\u03cc\u03cd"+
		"\5 \21\2\u03cd\u03ce\bl\1\2\u03ce\u03d4\3\2\2\2\u03cf\u03d0\7.\2\2\u03d0"+
		"\u03d4\bl\1\2\u03d1\u03d2\7+\2\2\u03d2\u03d4\bl\1\2\u03d3\u03c0\3\2\2"+
		"\2\u03d3\u03c3\3\2\2\2\u03d3\u03c5\3\2\2\2\u03d3\u03c7\3\2\2\2\u03d3\u03c9"+
		"\3\2\2\2\u03d3\u03cc\3\2\2\2\u03d3\u03cf\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4"+
		"\u00d7\3\2\2\2\63\u00db\u00e7\u00f1\u0103\u0111\u011a\u012e\u0136\u013e"+
		"\u0146\u014e\u015a\u0169\u016f\u0175\u0187\u0190\u0195\u0199\u01a2\u01e6"+
		"\u01f0\u0207\u020c\u0210\u021d\u022d\u0232\u0236\u0238\u0242\u02f1\u02fa"+
		"\u0303\u030c\u0315\u031e\u0335\u0353\u036e\u0378\u0381\u038f\u0395\u0397"+
		"\u039c\u03a7\u03be\u03d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}