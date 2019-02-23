// Generated from /storage/emulated/0/AppProjects/Apltool2/lexer_src/Smali.g4 by ANTLR 4.7.2
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
		INSTRUCTION_FORMAT51l=105, VOID_TYPE=106, PARAM_LIST_ID_OR_PRIMITIVE_TYPE=107, 
		ARRAY_DESCRIPTOR=108, SIMPLE_NAME=109, MEMBER_NAME=110, CLASS_DESCRIPTOR=111, 
		PARAM_LIST=112, DOTDOT=113, ARROW=114, EQUAL=115, COLON=116, COMMA=117, 
		OPEN_BRACE=118, CLOSE_BRACE=119, OPEN_PAREN=120, CLOSE_PAREN=121, WHITE_SPACE=122, 
		AT=123, INVALID_TOKEN=124;
	public static final int
		RULE_smali_file = 0, RULE_class_spec = 1, RULE_super_spec = 2, RULE_implements_spec = 3, 
		RULE_source_spec = 4, RULE_access_list = 5, RULE_field = 6, RULE_method = 7, 
		RULE_statements_and_directives = 8, RULE_ordered_method_item = 9, RULE_registers_directive = 10, 
		RULE_simple_name = 11, RULE_member_name = 12, RULE_method_prototype = 13, 
		RULE_paramList = 14, RULE_type_descriptor = 15, RULE_nonvoid_type_descriptor = 16, 
		RULE_reference_type_descriptor = 17, RULE_integer_literal = 18, RULE_float_literal = 19, 
		RULE_double_literal = 20, RULE_literal = 21, RULE_parsed_integer_literal = 22, 
		RULE_integral_literal = 23, RULE_fixed_32bit_literal = 24, RULE_fixed_literal = 25, 
		RULE_array_literal = 26, RULE_annotation_element = 27, RULE_annotation = 28, 
		RULE_subannotation = 29, RULE_enum_literal = 30, RULE_type_field_method_literal = 31, 
		RULE_call_site_reference = 32, RULE_method_handle_reference = 33, RULE_method_handle_literal = 34, 
		RULE_method_reference = 35, RULE_field_reference = 36, RULE_label = 37, 
		RULE_label_ref = 38, RULE_register_list = 39, RULE_register_range = 40, 
		RULE_verification_error_reference = 41, RULE_catch_directive = 42, RULE_catchall_directive = 43, 
		RULE_parameter_directive = 44, RULE_debug_directive = 45, RULE_line_directive = 46, 
		RULE_local_directive = 47, RULE_end_local_directive = 48, RULE_restart_local_directive = 49, 
		RULE_prologue_directive = 50, RULE_epilogue_directive = 51, RULE_source_directive = 52, 
		RULE_instruction_format12x = 53, RULE_instruction_format22s = 54, RULE_instruction_format31i = 55, 
		RULE_instruction_format35c_method = 56, RULE_instruction = 57, RULE_insn_format10t = 58, 
		RULE_insn_format10x = 59, RULE_insn_format10x_odex = 60, RULE_insn_format11n = 61, 
		RULE_insn_format11x = 62, RULE_insn_format12x = 63, RULE_insn_format20bc = 64, 
		RULE_insn_format20t = 65, RULE_insn_format21c_field = 66, RULE_insn_format21c_field_odex = 67, 
		RULE_insn_format21c_method_handle = 68, RULE_insn_format21c_method_type = 69, 
		RULE_insn_format21c_string = 70, RULE_insn_format21c_type = 71, RULE_insn_format21ih = 72, 
		RULE_insn_format21lh = 73, RULE_insn_format21s = 74, RULE_insn_format21t = 75, 
		RULE_insn_format22b = 76, RULE_insn_format22c_field = 77, RULE_insn_format22c_field_odex = 78, 
		RULE_insn_format22c_type = 79, RULE_insn_format22cs_field = 80, RULE_insn_format22s = 81, 
		RULE_insn_format22t = 82, RULE_insn_format22x = 83, RULE_insn_format23x = 84, 
		RULE_insn_format30t = 85, RULE_insn_format31c = 86, RULE_insn_format31i = 87, 
		RULE_insn_format31t = 88, RULE_insn_format32x = 89, RULE_insn_format35c_call_site = 90, 
		RULE_insn_format35c_method = 91, RULE_insn_format35c_type = 92, RULE_insn_format35c_method_odex = 93, 
		RULE_insn_format35mi_method = 94, RULE_insn_format35ms_method = 95, RULE_insn_format3rc_call_site = 96, 
		RULE_insn_format3rc_method = 97, RULE_insn_format3rc_method_odex = 98, 
		RULE_insn_format3rc_type = 99, RULE_insn_format3rmi_method = 100, RULE_insn_format3rms_method = 101, 
		RULE_insn_format45cc_method = 102, RULE_insn_format4rcc_method = 103, 
		RULE_insn_format51l = 104, RULE_insn_array_data_directive = 105, RULE_insn_packed_switch_directive = 106, 
		RULE_insn_sparse_switch_directive = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"smali_file", "class_spec", "super_spec", "implements_spec", "source_spec", 
			"access_list", "field", "method", "statements_and_directives", "ordered_method_item", 
			"registers_directive", "simple_name", "member_name", "method_prototype", 
			"paramList", "type_descriptor", "nonvoid_type_descriptor", "reference_type_descriptor", 
			"integer_literal", "float_literal", "double_literal", "literal", "parsed_integer_literal", 
			"integral_literal", "fixed_32bit_literal", "fixed_literal", "array_literal", 
			"annotation_element", "annotation", "subannotation", "enum_literal", 
			"type_field_method_literal", "call_site_reference", "method_handle_reference", 
			"method_handle_literal", "method_reference", "field_reference", "label", 
			"label_ref", "register_list", "register_range", "verification_error_reference", 
			"catch_directive", "catchall_directive", "parameter_directive", "debug_directive", 
			"line_directive", "local_directive", "end_local_directive", "restart_local_directive", 
			"prologue_directive", "epilogue_directive", "source_directive", "instruction_format12x", 
			"instruction_format22s", "instruction_format31i", "instruction_format35c_method", 
			"instruction", "insn_format10t", "insn_format10x", "insn_format10x_odex", 
			"insn_format11n", "insn_format11x", "insn_format12x", "insn_format20bc", 
			"insn_format20t", "insn_format21c_field", "insn_format21c_field_odex", 
			"insn_format21c_method_handle", "insn_format21c_method_type", "insn_format21c_string", 
			"insn_format21c_type", "insn_format21ih", "insn_format21lh", "insn_format21s", 
			"insn_format21t", "insn_format22b", "insn_format22c_field", "insn_format22c_field_odex", 
			"insn_format22c_type", "insn_format22cs_field", "insn_format22s", "insn_format22t", 
			"insn_format22x", "insn_format23x", "insn_format30t", "insn_format31c", 
			"insn_format31i", "insn_format31t", "insn_format32x", "insn_format35c_call_site", 
			"insn_format35c_method", "insn_format35c_type", "insn_format35c_method_odex", 
			"insn_format35mi_method", "insn_format35ms_method", "insn_format3rc_call_site", 
			"insn_format3rc_method", "insn_format3rc_method_odex", "insn_format3rc_type", 
			"insn_format3rmi_method", "insn_format3rms_method", "insn_format45cc_method", 
			"insn_format4rcc_method", "insn_format51l", "insn_array_data_directive", 
			"insn_packed_switch_directive", "insn_sparse_switch_directive"
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
			"'const-wide'", "'V'", null, null, null, null, null, null, "'..'", "'->'", 
			"'='", "':'", "','", "'{'", "'}'", "'('", "')'", null, "'@'"
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
			"INSTRUCTION_FORMAT51l", "VOID_TYPE", "PARAM_LIST_ID_OR_PRIMITIVE_TYPE", 
			"ARRAY_DESCRIPTOR", "SIMPLE_NAME", "MEMBER_NAME", "CLASS_DESCRIPTOR", 
			"PARAM_LIST", "DOTDOT", "ARROW", "EQUAL", "COLON", "COMMA", "OPEN_BRACE", 
			"CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "WHITE_SPACE", "AT", "INVALID_TOKEN"
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

	public SmaliParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Smali_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SmaliParser.EOF, 0); }
		public List<Class_specContext> class_spec() {
			return getRuleContexts(Class_specContext.class);
		}
		public Class_specContext class_spec(int i) {
			return getRuleContext(Class_specContext.class,i);
		}
		public List<Super_specContext> super_spec() {
			return getRuleContexts(Super_specContext.class);
		}
		public Super_specContext super_spec(int i) {
			return getRuleContext(Super_specContext.class,i);
		}
		public List<Implements_specContext> implements_spec() {
			return getRuleContexts(Implements_specContext.class);
		}
		public Implements_specContext implements_spec(int i) {
			return getRuleContext(Implements_specContext.class,i);
		}
		public List<Source_specContext> source_spec() {
			return getRuleContexts(Source_specContext.class);
		}
		public Source_specContext source_spec(int i) {
			return getRuleContext(Source_specContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Smali_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smali_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSmali_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Smali_fileContext smali_file() throws RecognitionException {
		Smali_fileContext _localctx = new Smali_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_smali_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS_DIRECTIVE:
					{
					setState(216);
					class_spec();
					}
					break;
				case SUPER_DIRECTIVE:
					{
					setState(217);
					super_spec();
					}
					break;
				case IMPLEMENTS_DIRECTIVE:
					{
					setState(218);
					implements_spec();
					}
					break;
				case SOURCE_DIRECTIVE:
					{
					setState(219);
					source_spec();
					}
					break;
				case METHOD_DIRECTIVE:
					{
					setState(220);
					method();
					}
					break;
				case FIELD_DIRECTIVE:
					{
					setState(221);
					field();
					}
					break;
				case ANNOTATION_DIRECTIVE:
					{
					setState(222);
					annotation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS_DIRECTIVE) | (1L << SUPER_DIRECTIVE) | (1L << IMPLEMENTS_DIRECTIVE) | (1L << SOURCE_DIRECTIVE) | (1L << FIELD_DIRECTIVE) | (1L << ANNOTATION_DIRECTIVE) | (1L << METHOD_DIRECTIVE))) != 0) );
			setState(227);
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

	public static class Class_specContext extends ParserRuleContext {
		public Token type;
		public TerminalNode CLASS_DIRECTIVE() { return getToken(SmaliParser.CLASS_DIRECTIVE, 0); }
		public Access_listContext access_list() {
			return getRuleContext(Access_listContext.class,0);
		}
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public Class_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitClass_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_specContext class_spec() throws RecognitionException {
		Class_specContext _localctx = new Class_specContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(CLASS_DIRECTIVE);
			setState(230);
			access_list();
			setState(231);
			((Class_specContext)_localctx).type = match(CLASS_DESCRIPTOR);
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

	public static class Super_specContext extends ParserRuleContext {
		public Token type;
		public TerminalNode SUPER_DIRECTIVE() { return getToken(SmaliParser.SUPER_DIRECTIVE, 0); }
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public Super_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSuper_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Super_specContext super_spec() throws RecognitionException {
		Super_specContext _localctx = new Super_specContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_super_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(SUPER_DIRECTIVE);
			setState(234);
			((Super_specContext)_localctx).type = match(CLASS_DESCRIPTOR);
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

	public static class Implements_specContext extends ParserRuleContext {
		public Token type;
		public TerminalNode IMPLEMENTS_DIRECTIVE() { return getToken(SmaliParser.IMPLEMENTS_DIRECTIVE, 0); }
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public Implements_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implements_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitImplements_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implements_specContext implements_spec() throws RecognitionException {
		Implements_specContext _localctx = new Implements_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_implements_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(IMPLEMENTS_DIRECTIVE);
			setState(237);
			((Implements_specContext)_localctx).type = match(CLASS_DESCRIPTOR);
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

	public static class Source_specContext extends ParserRuleContext {
		public Token file;
		public TerminalNode SOURCE_DIRECTIVE() { return getToken(SmaliParser.SOURCE_DIRECTIVE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public Source_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSource_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_specContext source_spec() throws RecognitionException {
		Source_specContext _localctx = new Source_specContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_source_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(SOURCE_DIRECTIVE);
			setState(240);
			((Source_specContext)_localctx).file = match(STRING_LITERAL);
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

	public static class Access_listContext extends ParserRuleContext {
		public List<TerminalNode> ACCESS_SPEC() { return getTokens(SmaliParser.ACCESS_SPEC); }
		public TerminalNode ACCESS_SPEC(int i) {
			return getToken(SmaliParser.ACCESS_SPEC, i);
		}
		public Access_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitAccess_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_listContext access_list() throws RecognitionException {
		Access_listContext _localctx = new Access_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_access_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					match(ACCESS_SPEC);
					}
					} 
				}
				setState(247);
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

	public static class FieldContext extends ParserRuleContext {
		public String defClass;
		public Member_nameContext name;
		public TerminalNode FIELD_DIRECTIVE() { return getToken(SmaliParser.FIELD_DIRECTIVE, 0); }
		public Access_listContext access_list() {
			return getRuleContext(Access_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
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
		enterRule(_localctx, 12, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(FIELD_DIRECTIVE);
			setState(249);
			access_list();
			setState(250);
			((FieldContext)_localctx).name = member_name();
			setState(251);
			match(COLON);
			setState(252);
			nonvoid_type_descriptor();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(253);
				match(EQUAL);
				setState(254);
				literal();
				}
			}

			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANNOTATION_DIRECTIVE) {
					{
					{
					setState(257);
					annotation();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
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
		public String defClass;
		public Member_nameContext name;
		public TerminalNode METHOD_DIRECTIVE() { return getToken(SmaliParser.METHOD_DIRECTIVE, 0); }
		public Access_listContext access_list() {
			return getRuleContext(Access_listContext.class,0);
		}
		public Method_prototypeContext method_prototype() {
			return getRuleContext(Method_prototypeContext.class,0);
		}
		public Statements_and_directivesContext statements_and_directives() {
			return getRuleContext(Statements_and_directivesContext.class,0);
		}
		public TerminalNode END_METHOD_DIRECTIVE() { return getToken(SmaliParser.END_METHOD_DIRECTIVE, 0); }
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
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
		enterRule(_localctx, 14, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(METHOD_DIRECTIVE);
			setState(267);
			access_list();
			setState(268);
			((MethodContext)_localctx).name = member_name();
			setState(269);
			method_prototype();
			setState(270);
			statements_and_directives();
			setState(271);
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

	public static class Statements_and_directivesContext extends ParserRuleContext {
		public List<Ordered_method_itemContext> ordered_method_item() {
			return getRuleContexts(Ordered_method_itemContext.class);
		}
		public Ordered_method_itemContext ordered_method_item(int i) {
			return getRuleContext(Ordered_method_itemContext.class,i);
		}
		public List<Registers_directiveContext> registers_directive() {
			return getRuleContexts(Registers_directiveContext.class);
		}
		public Registers_directiveContext registers_directive(int i) {
			return getRuleContext(Registers_directiveContext.class,i);
		}
		public List<Catch_directiveContext> catch_directive() {
			return getRuleContexts(Catch_directiveContext.class);
		}
		public Catch_directiveContext catch_directive(int i) {
			return getRuleContext(Catch_directiveContext.class,i);
		}
		public List<Catchall_directiveContext> catchall_directive() {
			return getRuleContexts(Catchall_directiveContext.class);
		}
		public Catchall_directiveContext catchall_directive(int i) {
			return getRuleContext(Catchall_directiveContext.class,i);
		}
		public List<Parameter_directiveContext> parameter_directive() {
			return getRuleContexts(Parameter_directiveContext.class);
		}
		public Parameter_directiveContext parameter_directive(int i) {
			return getRuleContext(Parameter_directiveContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Statements_and_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements_and_directives; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitStatements_and_directives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statements_and_directivesContext statements_and_directives() throws RecognitionException {
		Statements_and_directivesContext _localctx = new Statements_and_directivesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements_and_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOURCE_DIRECTIVE) | (1L << ANNOTATION_DIRECTIVE) | (1L << REGISTERS_DIRECTIVE) | (1L << LOCALS_DIRECTIVE) | (1L << ARRAY_DATA_DIRECTIVE) | (1L << PACKED_SWITCH_DIRECTIVE) | (1L << SPARSE_SWITCH_DIRECTIVE) | (1L << CATCH_DIRECTIVE) | (1L << CATCHALL_DIRECTIVE) | (1L << LINE_DIRECTIVE) | (1L << PARAMETER_DIRECTIVE) | (1L << LOCAL_DIRECTIVE) | (1L << END_LOCAL_DIRECTIVE) | (1L << RESTART_LOCAL_DIRECTIVE) | (1L << PROLOGUE_DIRECTIVE) | (1L << EPILOGUE_DIRECTIVE) | (1L << INSTRUCTION_FORMAT10t) | (1L << INSTRUCTION_FORMAT10x) | (1L << INSTRUCTION_FORMAT10x_ODEX) | (1L << INSTRUCTION_FORMAT11n) | (1L << INSTRUCTION_FORMAT11x) | (1L << INSTRUCTION_FORMAT12x_OR_ID) | (1L << INSTRUCTION_FORMAT12x) | (1L << INSTRUCTION_FORMAT20bc) | (1L << INSTRUCTION_FORMAT20t))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INSTRUCTION_FORMAT21c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT21c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT21c_STRING - 64)) | (1L << (INSTRUCTION_FORMAT21c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_HANDLE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21ih - 64)) | (1L << (INSTRUCTION_FORMAT21lh - 64)) | (1L << (INSTRUCTION_FORMAT21s - 64)) | (1L << (INSTRUCTION_FORMAT21t - 64)) | (1L << (INSTRUCTION_FORMAT22b - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT22c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT22cs_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22s_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT22s - 64)) | (1L << (INSTRUCTION_FORMAT22t - 64)) | (1L << (INSTRUCTION_FORMAT22x - 64)) | (1L << (INSTRUCTION_FORMAT23x - 64)) | (1L << (INSTRUCTION_FORMAT30t - 64)) | (1L << (INSTRUCTION_FORMAT31c - 64)) | (1L << (INSTRUCTION_FORMAT31i_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT31i - 64)) | (1L << (INSTRUCTION_FORMAT31t - 64)) | (1L << (INSTRUCTION_FORMAT32x - 64)) | (1L << (INSTRUCTION_FORMAT35c_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT35c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35mi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35ms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT3rc_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT3rc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT3rc_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT3rc_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT3rmi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT3rms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT45cc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT4rcc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT51l - 64)) | (1L << (COLON - 64)))) != 0)) {
				{
				setState(279);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOURCE_DIRECTIVE:
				case ARRAY_DATA_DIRECTIVE:
				case PACKED_SWITCH_DIRECTIVE:
				case SPARSE_SWITCH_DIRECTIVE:
				case LINE_DIRECTIVE:
				case LOCAL_DIRECTIVE:
				case END_LOCAL_DIRECTIVE:
				case RESTART_LOCAL_DIRECTIVE:
				case PROLOGUE_DIRECTIVE:
				case EPILOGUE_DIRECTIVE:
				case INSTRUCTION_FORMAT10t:
				case INSTRUCTION_FORMAT10x:
				case INSTRUCTION_FORMAT10x_ODEX:
				case INSTRUCTION_FORMAT11n:
				case INSTRUCTION_FORMAT11x:
				case INSTRUCTION_FORMAT12x_OR_ID:
				case INSTRUCTION_FORMAT12x:
				case INSTRUCTION_FORMAT20bc:
				case INSTRUCTION_FORMAT20t:
				case INSTRUCTION_FORMAT21c_FIELD:
				case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				case INSTRUCTION_FORMAT21c_STRING:
				case INSTRUCTION_FORMAT21c_TYPE:
				case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
				case INSTRUCTION_FORMAT21c_METHOD_TYPE:
				case INSTRUCTION_FORMAT21ih:
				case INSTRUCTION_FORMAT21lh:
				case INSTRUCTION_FORMAT21s:
				case INSTRUCTION_FORMAT21t:
				case INSTRUCTION_FORMAT22b:
				case INSTRUCTION_FORMAT22c_FIELD:
				case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				case INSTRUCTION_FORMAT22c_TYPE:
				case INSTRUCTION_FORMAT22cs_FIELD:
				case INSTRUCTION_FORMAT22s_OR_ID:
				case INSTRUCTION_FORMAT22s:
				case INSTRUCTION_FORMAT22t:
				case INSTRUCTION_FORMAT22x:
				case INSTRUCTION_FORMAT23x:
				case INSTRUCTION_FORMAT30t:
				case INSTRUCTION_FORMAT31c:
				case INSTRUCTION_FORMAT31i_OR_ID:
				case INSTRUCTION_FORMAT31i:
				case INSTRUCTION_FORMAT31t:
				case INSTRUCTION_FORMAT32x:
				case INSTRUCTION_FORMAT35c_CALL_SITE:
				case INSTRUCTION_FORMAT35c_METHOD:
				case INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE:
				case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				case INSTRUCTION_FORMAT35c_TYPE:
				case INSTRUCTION_FORMAT35mi_METHOD:
				case INSTRUCTION_FORMAT35ms_METHOD:
				case INSTRUCTION_FORMAT3rc_CALL_SITE:
				case INSTRUCTION_FORMAT3rc_METHOD:
				case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
				case INSTRUCTION_FORMAT3rc_TYPE:
				case INSTRUCTION_FORMAT3rmi_METHOD:
				case INSTRUCTION_FORMAT3rms_METHOD:
				case INSTRUCTION_FORMAT45cc_METHOD:
				case INSTRUCTION_FORMAT4rcc_METHOD:
				case INSTRUCTION_FORMAT51l:
				case COLON:
					{
					setState(273);
					ordered_method_item();
					}
					break;
				case REGISTERS_DIRECTIVE:
				case LOCALS_DIRECTIVE:
					{
					setState(274);
					registers_directive();
					}
					break;
				case CATCH_DIRECTIVE:
					{
					setState(275);
					catch_directive();
					}
					break;
				case CATCHALL_DIRECTIVE:
					{
					setState(276);
					catchall_directive();
					}
					break;
				case PARAMETER_DIRECTIVE:
					{
					setState(277);
					parameter_directive();
					}
					break;
				case ANNOTATION_DIRECTIVE:
					{
					setState(278);
					annotation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(283);
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

	public static class Ordered_method_itemContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Debug_directiveContext debug_directive() {
			return getRuleContext(Debug_directiveContext.class,0);
		}
		public Ordered_method_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordered_method_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitOrdered_method_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordered_method_itemContext ordered_method_item() throws RecognitionException {
		Ordered_method_itemContext _localctx = new Ordered_method_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ordered_method_item);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				label();
				}
				break;
			case ARRAY_DATA_DIRECTIVE:
			case PACKED_SWITCH_DIRECTIVE:
			case SPARSE_SWITCH_DIRECTIVE:
			case INSTRUCTION_FORMAT10t:
			case INSTRUCTION_FORMAT10x:
			case INSTRUCTION_FORMAT10x_ODEX:
			case INSTRUCTION_FORMAT11n:
			case INSTRUCTION_FORMAT11x:
			case INSTRUCTION_FORMAT12x_OR_ID:
			case INSTRUCTION_FORMAT12x:
			case INSTRUCTION_FORMAT20bc:
			case INSTRUCTION_FORMAT20t:
			case INSTRUCTION_FORMAT21c_FIELD:
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
			case INSTRUCTION_FORMAT21c_STRING:
			case INSTRUCTION_FORMAT21c_TYPE:
			case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
			case INSTRUCTION_FORMAT21c_METHOD_TYPE:
			case INSTRUCTION_FORMAT21ih:
			case INSTRUCTION_FORMAT21lh:
			case INSTRUCTION_FORMAT21s:
			case INSTRUCTION_FORMAT21t:
			case INSTRUCTION_FORMAT22b:
			case INSTRUCTION_FORMAT22c_FIELD:
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
			case INSTRUCTION_FORMAT22c_TYPE:
			case INSTRUCTION_FORMAT22cs_FIELD:
			case INSTRUCTION_FORMAT22s_OR_ID:
			case INSTRUCTION_FORMAT22s:
			case INSTRUCTION_FORMAT22t:
			case INSTRUCTION_FORMAT22x:
			case INSTRUCTION_FORMAT23x:
			case INSTRUCTION_FORMAT30t:
			case INSTRUCTION_FORMAT31c:
			case INSTRUCTION_FORMAT31i_OR_ID:
			case INSTRUCTION_FORMAT31i:
			case INSTRUCTION_FORMAT31t:
			case INSTRUCTION_FORMAT32x:
			case INSTRUCTION_FORMAT35c_CALL_SITE:
			case INSTRUCTION_FORMAT35c_METHOD:
			case INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE:
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
			case INSTRUCTION_FORMAT35c_TYPE:
			case INSTRUCTION_FORMAT35mi_METHOD:
			case INSTRUCTION_FORMAT35ms_METHOD:
			case INSTRUCTION_FORMAT3rc_CALL_SITE:
			case INSTRUCTION_FORMAT3rc_METHOD:
			case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
			case INSTRUCTION_FORMAT3rc_TYPE:
			case INSTRUCTION_FORMAT3rmi_METHOD:
			case INSTRUCTION_FORMAT3rms_METHOD:
			case INSTRUCTION_FORMAT45cc_METHOD:
			case INSTRUCTION_FORMAT4rcc_METHOD:
			case INSTRUCTION_FORMAT51l:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				instruction();
				}
				break;
			case SOURCE_DIRECTIVE:
			case LINE_DIRECTIVE:
			case LOCAL_DIRECTIVE:
			case END_LOCAL_DIRECTIVE:
			case RESTART_LOCAL_DIRECTIVE:
			case PROLOGUE_DIRECTIVE:
			case EPILOGUE_DIRECTIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				debug_directive();
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

	public static class Registers_directiveContext extends ParserRuleContext {
		public Token directive;
		public Integral_literalContext regCount;
		public Integral_literalContext regCount2;
		public TerminalNode REGISTERS_DIRECTIVE() { return getToken(SmaliParser.REGISTERS_DIRECTIVE, 0); }
		public Integral_literalContext integral_literal() {
			return getRuleContext(Integral_literalContext.class,0);
		}
		public TerminalNode LOCALS_DIRECTIVE() { return getToken(SmaliParser.LOCALS_DIRECTIVE, 0); }
		public Registers_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registers_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitRegisters_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Registers_directiveContext registers_directive() throws RecognitionException {
		Registers_directiveContext _localctx = new Registers_directiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_registers_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTERS_DIRECTIVE:
				{
				setState(289);
				((Registers_directiveContext)_localctx).directive = match(REGISTERS_DIRECTIVE);
				setState(290);
				((Registers_directiveContext)_localctx).regCount = integral_literal();
				}
				break;
			case LOCALS_DIRECTIVE:
				{
				setState(291);
				((Registers_directiveContext)_localctx).directive = match(LOCALS_DIRECTIVE);
				setState(292);
				((Registers_directiveContext)_localctx).regCount2 = integral_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Simple_nameContext extends ParserRuleContext {
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
		public TerminalNode PARAM_LIST_ID_OR_PRIMITIVE_TYPE() { return getToken(SmaliParser.PARAM_LIST_ID_OR_PRIMITIVE_TYPE, 0); }
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
		public Simple_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSimple_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_nameContext simple_name() throws RecognitionException {
		Simple_nameContext _localctx = new Simple_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << DOUBLE_LITERAL_OR_ID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << REGISTER) | (1L << ACCESS_SPEC) | (1L << ANNOTATION_VISIBILITY) | (1L << VERIFICATION_ERROR_TYPE) | (1L << METHOD_HANDLE_TYPE_FIELD) | (1L << METHOD_HANDLE_TYPE_METHOD) | (1L << INSTRUCTION_FORMAT10t) | (1L << INSTRUCTION_FORMAT10x) | (1L << INSTRUCTION_FORMAT10x_ODEX) | (1L << INSTRUCTION_FORMAT11x) | (1L << INSTRUCTION_FORMAT12x_OR_ID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INSTRUCTION_FORMAT21c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT21c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT21c_STRING - 64)) | (1L << (INSTRUCTION_FORMAT21c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_HANDLE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21t - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT22c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT22cs_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22s_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT22t - 64)) | (1L << (INSTRUCTION_FORMAT23x - 64)) | (1L << (INSTRUCTION_FORMAT31i_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT31t - 64)) | (1L << (INSTRUCTION_FORMAT35c_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT35c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35mi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35ms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT45cc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT4rcc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT51l - 64)) | (1L << (VOID_TYPE - 64)) | (1L << (PARAM_LIST_ID_OR_PRIMITIVE_TYPE - 64)) | (1L << (SIMPLE_NAME - 64)))) != 0)) ) {
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

	public static class Member_nameContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode MEMBER_NAME() { return getToken(SmaliParser.MEMBER_NAME, 0); }
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMember_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_member_name);
		try {
			setState(299);
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
			case PARAM_LIST_ID_OR_PRIMITIVE_TYPE:
			case SIMPLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				simple_name();
				}
				break;
			case MEMBER_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
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

	public static class Method_prototypeContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(SmaliParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SmaliParser.CLOSE_PAREN, 0); }
		public Type_descriptorContext type_descriptor() {
			return getRuleContext(Type_descriptorContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public Method_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_prototype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethod_prototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_prototypeContext method_prototype() throws RecognitionException {
		Method_prototypeContext _localctx = new Method_prototypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_prototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(OPEN_PAREN);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (PARAM_LIST_ID_OR_PRIMITIVE_TYPE - 107)) | (1L << (ARRAY_DESCRIPTOR - 107)) | (1L << (CLASS_DESCRIPTOR - 107)) | (1L << (PARAM_LIST - 107)))) != 0)) {
				{
				setState(302);
				paramList();
				}
			}

			setState(305);
			match(CLOSE_PAREN);
			setState(306);
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

	public static class ParamListContext extends ParserRuleContext {
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public TerminalNode PARAM_LIST() { return getToken(SmaliParser.PARAM_LIST, 0); }
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
		enterRule(_localctx, 28, RULE_paramList);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARAM_LIST_ID_OR_PRIMITIVE_TYPE:
			case ARRAY_DESCRIPTOR:
			case CLASS_DESCRIPTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				nonvoid_type_descriptor();
				}
				break;
			case PARAM_LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(PARAM_LIST);
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

	public static class Type_descriptorContext extends ParserRuleContext {
		public TerminalNode VOID_TYPE() { return getToken(SmaliParser.VOID_TYPE, 0); }
		public TerminalNode PARAM_LIST_ID_OR_PRIMITIVE_TYPE() { return getToken(SmaliParser.PARAM_LIST_ID_OR_PRIMITIVE_TYPE, 0); }
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
		enterRule(_localctx, 30, RULE_type_descriptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (VOID_TYPE - 106)) | (1L << (PARAM_LIST_ID_OR_PRIMITIVE_TYPE - 106)) | (1L << (ARRAY_DESCRIPTOR - 106)) | (1L << (CLASS_DESCRIPTOR - 106)))) != 0)) ) {
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

	public static class Nonvoid_type_descriptorContext extends ParserRuleContext {
		public TerminalNode PARAM_LIST_ID_OR_PRIMITIVE_TYPE() { return getToken(SmaliParser.PARAM_LIST_ID_OR_PRIMITIVE_TYPE, 0); }
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
		enterRule(_localctx, 32, RULE_nonvoid_type_descriptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (PARAM_LIST_ID_OR_PRIMITIVE_TYPE - 107)) | (1L << (ARRAY_DESCRIPTOR - 107)) | (1L << (CLASS_DESCRIPTOR - 107)))) != 0)) ) {
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

	public static class Reference_type_descriptorContext extends ParserRuleContext {
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
		enterRule(_localctx, 34, RULE_reference_type_descriptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==ARRAY_DESCRIPTOR || _la==CLASS_DESCRIPTOR) ) {
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

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode POSITIVE_INTEGER_LITERAL() { return getToken(SmaliParser.POSITIVE_INTEGER_LITERAL, 0); }
		public TerminalNode NEGATIVE_INTEGER_LITERAL() { return getToken(SmaliParser.NEGATIVE_INTEGER_LITERAL, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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

	public static class Float_literalContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL_OR_ID() { return getToken(SmaliParser.FLOAT_LITERAL_OR_ID, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(SmaliParser.FLOAT_LITERAL, 0); }
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFloat_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_float_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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

	public static class Double_literalContext extends ParserRuleContext {
		public TerminalNode DOUBLE_LITERAL_OR_ID() { return getToken(SmaliParser.DOUBLE_LITERAL_OR_ID, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(SmaliParser.DOUBLE_LITERAL, 0); }
		public Double_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitDouble_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_literalContext double_literal() throws RecognitionException {
		Double_literalContext _localctx = new Double_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_double_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_LITERAL_OR_ID || _la==DOUBLE_LITERAL) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode LONG_LITERAL() { return getToken(SmaliParser.LONG_LITERAL, 0); }
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public TerminalNode SHORT_LITERAL() { return getToken(SmaliParser.SHORT_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(SmaliParser.BYTE_LITERAL, 0); }
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public Double_literalContext double_literal() {
			return getRuleContext(Double_literalContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(SmaliParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(SmaliParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(SmaliParser.NULL_LITERAL, 0); }
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public SubannotationContext subannotation() {
			return getRuleContext(SubannotationContext.class,0);
		}
		public Type_field_method_literalContext type_field_method_literal() {
			return getRuleContext(Type_field_method_literalContext.class,0);
		}
		public Enum_literalContext enum_literal() {
			return getRuleContext(Enum_literalContext.class,0);
		}
		public Method_handle_literalContext method_handle_literal() {
			return getRuleContext(Method_handle_literalContext.class,0);
		}
		public Method_prototypeContext method_prototype() {
			return getRuleContext(Method_prototypeContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(LONG_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				integer_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(SHORT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				match(BYTE_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				float_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
				double_literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(330);
				match(CHAR_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(331);
				match(STRING_LITERAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(332);
				match(BOOL_LITERAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(333);
				match(NULL_LITERAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(334);
				array_literal();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(335);
				subannotation();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(336);
				type_field_method_literal();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(337);
				enum_literal();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(338);
				method_handle_literal();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(339);
				method_prototype();
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

	public static class Parsed_integer_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Parsed_integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parsed_integer_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitParsed_integer_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parsed_integer_literalContext parsed_integer_literal() throws RecognitionException {
		Parsed_integer_literalContext _localctx = new Parsed_integer_literalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parsed_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			integer_literal();
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

	public static class Integral_literalContext extends ParserRuleContext {
		public TerminalNode LONG_LITERAL() { return getToken(SmaliParser.LONG_LITERAL, 0); }
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public TerminalNode SHORT_LITERAL() { return getToken(SmaliParser.SHORT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(SmaliParser.CHAR_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(SmaliParser.BYTE_LITERAL, 0); }
		public Integral_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitIntegral_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integral_literalContext integral_literal() throws RecognitionException {
		Integral_literalContext _localctx = new Integral_literalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_integral_literal);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(LONG_LITERAL);
				}
				break;
			case POSITIVE_INTEGER_LITERAL:
			case NEGATIVE_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				integer_literal();
				}
				break;
			case SHORT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(SHORT_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(CHAR_LITERAL);
				}
				break;
			case BYTE_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				match(BYTE_LITERAL);
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

	public static class Fixed_32bit_literalContext extends ParserRuleContext {
		public TerminalNode LONG_LITERAL() { return getToken(SmaliParser.LONG_LITERAL, 0); }
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public TerminalNode SHORT_LITERAL() { return getToken(SmaliParser.SHORT_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(SmaliParser.BYTE_LITERAL, 0); }
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(SmaliParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(SmaliParser.BOOL_LITERAL, 0); }
		public Fixed_32bit_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_32bit_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFixed_32bit_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_32bit_literalContext fixed_32bit_literal() throws RecognitionException {
		Fixed_32bit_literalContext _localctx = new Fixed_32bit_literalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fixed_32bit_literal);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONG_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(LONG_LITERAL);
				}
				break;
			case POSITIVE_INTEGER_LITERAL:
			case NEGATIVE_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				integer_literal();
				}
				break;
			case SHORT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(SHORT_LITERAL);
				}
				break;
			case BYTE_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(BYTE_LITERAL);
				}
				break;
			case FLOAT_LITERAL_OR_ID:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				float_literal();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				match(CHAR_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				match(BOOL_LITERAL);
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

	public static class Fixed_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public TerminalNode LONG_LITERAL() { return getToken(SmaliParser.LONG_LITERAL, 0); }
		public TerminalNode SHORT_LITERAL() { return getToken(SmaliParser.SHORT_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(SmaliParser.BYTE_LITERAL, 0); }
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public Double_literalContext double_literal() {
			return getRuleContext(Double_literalContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(SmaliParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(SmaliParser.BOOL_LITERAL, 0); }
		public Fixed_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitFixed_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_literalContext fixed_literal() throws RecognitionException {
		Fixed_literalContext _localctx = new Fixed_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fixed_literal);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITIVE_INTEGER_LITERAL:
			case NEGATIVE_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				integer_literal();
				}
				break;
			case LONG_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(LONG_LITERAL);
				}
				break;
			case SHORT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				match(SHORT_LITERAL);
				}
				break;
			case BYTE_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(BYTE_LITERAL);
				}
				break;
			case FLOAT_LITERAL_OR_ID:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				float_literal();
				}
				break;
			case DOUBLE_LITERAL_OR_ID:
			case DOUBLE_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				double_literal();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(366);
				match(CHAR_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(367);
				match(BOOL_LITERAL);
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

	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(OPEN_BRACE);
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBANNOTATION_DIRECTIVE:
			case ENUM_DIRECTIVE:
			case POSITIVE_INTEGER_LITERAL:
			case NEGATIVE_INTEGER_LITERAL:
			case LONG_LITERAL:
			case SHORT_LITERAL:
			case BYTE_LITERAL:
			case FLOAT_LITERAL_OR_ID:
			case DOUBLE_LITERAL_OR_ID:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case BOOL_LITERAL:
			case NULL_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
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
			case PARAM_LIST_ID_OR_PRIMITIVE_TYPE:
			case ARRAY_DESCRIPTOR:
			case SIMPLE_NAME:
			case MEMBER_NAME:
			case CLASS_DESCRIPTOR:
			case OPEN_BRACE:
			case OPEN_PAREN:
				{
				setState(371);
				literal();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(372);
					match(COMMA);
					setState(373);
					literal();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CLOSE_BRACE:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(382);
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

	public static class Annotation_elementContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
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
		enterRule(_localctx, 54, RULE_annotation_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			simple_name();
			setState(385);
			match(EQUAL);
			setState(386);
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
		enterRule(_localctx, 56, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(ANNOTATION_DIRECTIVE);
			setState(389);
			match(ANNOTATION_VISIBILITY);
			setState(390);
			match(CLASS_DESCRIPTOR);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << DOUBLE_LITERAL_OR_ID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << REGISTER) | (1L << ACCESS_SPEC) | (1L << ANNOTATION_VISIBILITY) | (1L << VERIFICATION_ERROR_TYPE) | (1L << METHOD_HANDLE_TYPE_FIELD) | (1L << METHOD_HANDLE_TYPE_METHOD) | (1L << INSTRUCTION_FORMAT10t) | (1L << INSTRUCTION_FORMAT10x) | (1L << INSTRUCTION_FORMAT10x_ODEX) | (1L << INSTRUCTION_FORMAT11x) | (1L << INSTRUCTION_FORMAT12x_OR_ID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INSTRUCTION_FORMAT21c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT21c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT21c_STRING - 64)) | (1L << (INSTRUCTION_FORMAT21c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_HANDLE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21t - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT22c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT22cs_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22s_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT22t - 64)) | (1L << (INSTRUCTION_FORMAT23x - 64)) | (1L << (INSTRUCTION_FORMAT31i_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT31t - 64)) | (1L << (INSTRUCTION_FORMAT35c_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT35c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35mi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35ms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT45cc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT4rcc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT51l - 64)) | (1L << (VOID_TYPE - 64)) | (1L << (PARAM_LIST_ID_OR_PRIMITIVE_TYPE - 64)) | (1L << (SIMPLE_NAME - 64)))) != 0)) {
				{
				{
				setState(391);
				annotation_element();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
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
		enterRule(_localctx, 58, RULE_subannotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(SUBANNOTATION_DIRECTIVE);
			setState(400);
			((SubannotationContext)_localctx).type = match(CLASS_DESCRIPTOR);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << DOUBLE_LITERAL_OR_ID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << REGISTER) | (1L << ACCESS_SPEC) | (1L << ANNOTATION_VISIBILITY) | (1L << VERIFICATION_ERROR_TYPE) | (1L << METHOD_HANDLE_TYPE_FIELD) | (1L << METHOD_HANDLE_TYPE_METHOD) | (1L << INSTRUCTION_FORMAT10t) | (1L << INSTRUCTION_FORMAT10x) | (1L << INSTRUCTION_FORMAT10x_ODEX) | (1L << INSTRUCTION_FORMAT11x) | (1L << INSTRUCTION_FORMAT12x_OR_ID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INSTRUCTION_FORMAT21c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT21c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT21c_STRING - 64)) | (1L << (INSTRUCTION_FORMAT21c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_HANDLE - 64)) | (1L << (INSTRUCTION_FORMAT21c_METHOD_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT21t - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22c_FIELD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT22c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT22cs_FIELD - 64)) | (1L << (INSTRUCTION_FORMAT22s_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT22t - 64)) | (1L << (INSTRUCTION_FORMAT23x - 64)) | (1L << (INSTRUCTION_FORMAT31i_OR_ID - 64)) | (1L << (INSTRUCTION_FORMAT31t - 64)) | (1L << (INSTRUCTION_FORMAT35c_CALL_SITE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35c_METHOD_ODEX - 64)) | (1L << (INSTRUCTION_FORMAT35c_TYPE - 64)) | (1L << (INSTRUCTION_FORMAT35mi_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT35ms_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT45cc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT4rcc_METHOD - 64)) | (1L << (INSTRUCTION_FORMAT51l - 64)) | (1L << (VOID_TYPE - 64)) | (1L << (PARAM_LIST_ID_OR_PRIMITIVE_TYPE - 64)) | (1L << (SIMPLE_NAME - 64)))) != 0)) {
				{
				{
				setState(401);
				annotation_element();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
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

	public static class Enum_literalContext extends ParserRuleContext {
		public TerminalNode ENUM_DIRECTIVE() { return getToken(SmaliParser.ENUM_DIRECTIVE, 0); }
		public Field_referenceContext field_reference() {
			return getRuleContext(Field_referenceContext.class,0);
		}
		public Enum_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitEnum_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_literalContext enum_literal() throws RecognitionException {
		Enum_literalContext _localctx = new Enum_literalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enum_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(ENUM_DIRECTIVE);
			setState(410);
			field_reference();
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

	public static class Type_field_method_literalContext extends ParserRuleContext {
		public Reference_type_descriptorContext reference_type_descriptor() {
			return getRuleContext(Reference_type_descriptorContext.class,0);
		}
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public Method_prototypeContext method_prototype() {
			return getRuleContext(Method_prototypeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SmaliParser.ARROW, 0); }
		public TerminalNode PARAM_LIST_ID_OR_PRIMITIVE_TYPE() { return getToken(SmaliParser.PARAM_LIST_ID_OR_PRIMITIVE_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(SmaliParser.VOID_TYPE, 0); }
		public Type_field_method_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_field_method_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitType_field_method_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_field_method_literalContext type_field_method_literal() throws RecognitionException {
		Type_field_method_literalContext _localctx = new Type_field_method_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type_field_method_literal);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				reference_type_descriptor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_DESCRIPTOR || _la==CLASS_DESCRIPTOR) {
					{
					setState(413);
					reference_type_descriptor();
					setState(414);
					match(ARROW);
					}
				}

				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(418);
					member_name();
					setState(419);
					match(COLON);
					setState(420);
					nonvoid_type_descriptor();
					}
					break;
				case 2:
					{
					setState(422);
					member_name();
					setState(423);
					method_prototype();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(PARAM_LIST_ID_OR_PRIMITIVE_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(VOID_TYPE);
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

	public static class Call_site_referenceContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SmaliParser.OPEN_PAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Method_prototypeContext method_prototype() {
			return getRuleContext(Method_prototypeContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SmaliParser.CLOSE_PAREN, 0); }
		public TerminalNode AT() { return getToken(SmaliParser.AT, 0); }
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public Call_site_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_site_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitCall_site_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_site_referenceContext call_site_reference() throws RecognitionException {
		Call_site_referenceContext _localctx = new Call_site_referenceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_call_site_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			simple_name();
			setState(432);
			match(OPEN_PAREN);
			setState(433);
			match(STRING_LITERAL);
			setState(434);
			match(COMMA);
			setState(435);
			method_prototype();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(436);
				match(COMMA);
				setState(437);
				literal();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(CLOSE_PAREN);
			setState(444);
			match(AT);
			setState(445);
			method_reference();
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

	public static class Method_handle_referenceContext extends ParserRuleContext {
		public TerminalNode METHOD_HANDLE_TYPE_FIELD() { return getToken(SmaliParser.METHOD_HANDLE_TYPE_FIELD, 0); }
		public TerminalNode AT() { return getToken(SmaliParser.AT, 0); }
		public Field_referenceContext field_reference() {
			return getRuleContext(Field_referenceContext.class,0);
		}
		public TerminalNode METHOD_HANDLE_TYPE_METHOD() { return getToken(SmaliParser.METHOD_HANDLE_TYPE_METHOD, 0); }
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE, 0); }
		public Method_handle_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_handle_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethod_handle_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_handle_referenceContext method_handle_reference() throws RecognitionException {
		Method_handle_referenceContext _localctx = new Method_handle_referenceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_method_handle_reference);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METHOD_HANDLE_TYPE_FIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(METHOD_HANDLE_TYPE_FIELD);
				setState(448);
				match(AT);
				setState(449);
				field_reference();
				}
				break;
			case METHOD_HANDLE_TYPE_METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(METHOD_HANDLE_TYPE_METHOD);
				setState(451);
				match(AT);
				setState(452);
				method_reference();
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE);
				setState(454);
				match(AT);
				setState(455);
				method_reference();
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

	public static class Method_handle_literalContext extends ParserRuleContext {
		public Method_handle_referenceContext method_handle_reference() {
			return getRuleContext(Method_handle_referenceContext.class,0);
		}
		public Method_handle_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_handle_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethod_handle_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_handle_literalContext method_handle_literal() throws RecognitionException {
		Method_handle_literalContext _localctx = new Method_handle_literalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_method_handle_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			method_handle_reference();
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

	public static class Method_referenceContext extends ParserRuleContext {
		public Reference_type_descriptorContext defClass;
		public Member_nameContext name;
		public Method_prototypeContext method_prototype() {
			return getRuleContext(Method_prototypeContext.class,0);
		}
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SmaliParser.ARROW, 0); }
		public Reference_type_descriptorContext reference_type_descriptor() {
			return getRuleContext(Reference_type_descriptorContext.class,0);
		}
		public Method_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitMethod_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_referenceContext method_reference() throws RecognitionException {
		Method_referenceContext _localctx = new Method_referenceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_method_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_DESCRIPTOR || _la==CLASS_DESCRIPTOR) {
				{
				setState(460);
				((Method_referenceContext)_localctx).defClass = reference_type_descriptor();
				setState(461);
				match(ARROW);
				}
			}

			setState(465);
			((Method_referenceContext)_localctx).name = member_name();
			setState(466);
			method_prototype();
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

	public static class Field_referenceContext extends ParserRuleContext {
		public Reference_type_descriptorContext defClass;
		public Member_nameContext name;
		public Nonvoid_type_descriptorContext type;
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SmaliParser.ARROW, 0); }
		public Reference_type_descriptorContext reference_type_descriptor() {
			return getRuleContext(Reference_type_descriptorContext.class,0);
		}
		public Field_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitField_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_referenceContext field_reference() throws RecognitionException {
		Field_referenceContext _localctx = new Field_referenceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_field_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_DESCRIPTOR || _la==CLASS_DESCRIPTOR) {
				{
				setState(468);
				((Field_referenceContext)_localctx).defClass = reference_type_descriptor();
				setState(469);
				match(ARROW);
				}
			}

			setState(473);
			((Field_referenceContext)_localctx).name = member_name();
			setState(474);
			match(COLON);
			setState(475);
			((Field_referenceContext)_localctx).type = nonvoid_type_descriptor();
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
		public Simple_nameContext name;
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
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
		enterRule(_localctx, 74, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(COLON);
			setState(478);
			((LabelContext)_localctx).name = simple_name();
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
		public Simple_nameContext name;
		public TerminalNode COLON() { return getToken(SmaliParser.COLON, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
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
		enterRule(_localctx, 76, RULE_label_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(COLON);
			setState(481);
			((Label_refContext)_localctx).name = simple_name();
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
		enterRule(_localctx, 78, RULE_register_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(REGISTER);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(484);
				match(COMMA);
				setState(485);
				match(REGISTER);
				}
				}
				setState(490);
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
		enterRule(_localctx, 80, RULE_register_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(491);
				((Register_rangeContext)_localctx).startreg = match(REGISTER);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOTDOT) {
					{
					setState(492);
					match(DOTDOT);
					setState(493);
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
		public TerminalNode CLASS_DESCRIPTOR() { return getToken(SmaliParser.CLASS_DESCRIPTOR, 0); }
		public Field_referenceContext field_reference() {
			return getRuleContext(Field_referenceContext.class,0);
		}
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public Verification_error_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verification_error_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitVerification_error_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Verification_error_referenceContext verification_error_reference() throws RecognitionException {
		Verification_error_referenceContext _localctx = new Verification_error_referenceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_verification_error_reference);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(CLASS_DESCRIPTOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				field_reference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				method_reference();
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

	public static class Catch_directiveContext extends ParserRuleContext {
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
		public Catch_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitCatch_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_directiveContext catch_directive() throws RecognitionException {
		Catch_directiveContext _localctx = new Catch_directiveContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_catch_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(CATCH_DIRECTIVE);
			setState(504);
			nonvoid_type_descriptor();
			setState(505);
			match(OPEN_BRACE);
			setState(506);
			((Catch_directiveContext)_localctx).from = label_ref();
			setState(507);
			match(DOTDOT);
			setState(508);
			((Catch_directiveContext)_localctx).to = label_ref();
			setState(509);
			match(CLOSE_BRACE);
			setState(510);
			((Catch_directiveContext)_localctx).handle = label_ref();
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

	public static class Catchall_directiveContext extends ParserRuleContext {
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
		public Catchall_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchall_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitCatchall_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catchall_directiveContext catchall_directive() throws RecognitionException {
		Catchall_directiveContext _localctx = new Catchall_directiveContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_catchall_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(CATCHALL_DIRECTIVE);
			setState(513);
			match(OPEN_BRACE);
			setState(514);
			((Catchall_directiveContext)_localctx).from = label_ref();
			setState(515);
			match(DOTDOT);
			setState(516);
			((Catchall_directiveContext)_localctx).to = label_ref();
			setState(517);
			match(CLOSE_BRACE);
			setState(518);
			((Catchall_directiveContext)_localctx).handle = label_ref();
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

	public static class Parameter_directiveContext extends ParserRuleContext {
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
		public Parameter_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitParameter_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_directiveContext parameter_directive() throws RecognitionException {
		Parameter_directiveContext _localctx = new Parameter_directiveContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parameter_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(PARAMETER_DIRECTIVE);
			setState(521);
			((Parameter_directiveContext)_localctx).reg = match(REGISTER);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(522);
				match(COMMA);
				setState(523);
				((Parameter_directiveContext)_localctx).name = match(STRING_LITERAL);
				}
			}

			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANNOTATION_DIRECTIVE) {
					{
					{
					setState(526);
					annotation();
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(532);
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

	public static class Debug_directiveContext extends ParserRuleContext {
		public Line_directiveContext line_directive() {
			return getRuleContext(Line_directiveContext.class,0);
		}
		public Local_directiveContext local_directive() {
			return getRuleContext(Local_directiveContext.class,0);
		}
		public End_local_directiveContext end_local_directive() {
			return getRuleContext(End_local_directiveContext.class,0);
		}
		public Restart_local_directiveContext restart_local_directive() {
			return getRuleContext(Restart_local_directiveContext.class,0);
		}
		public Prologue_directiveContext prologue_directive() {
			return getRuleContext(Prologue_directiveContext.class,0);
		}
		public Epilogue_directiveContext epilogue_directive() {
			return getRuleContext(Epilogue_directiveContext.class,0);
		}
		public Source_directiveContext source_directive() {
			return getRuleContext(Source_directiveContext.class,0);
		}
		public Debug_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitDebug_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Debug_directiveContext debug_directive() throws RecognitionException {
		Debug_directiveContext _localctx = new Debug_directiveContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_debug_directive);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_DIRECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				line_directive();
				}
				break;
			case LOCAL_DIRECTIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				local_directive();
				}
				break;
			case END_LOCAL_DIRECTIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				end_local_directive();
				}
				break;
			case RESTART_LOCAL_DIRECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(538);
				restart_local_directive();
				}
				break;
			case PROLOGUE_DIRECTIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(539);
				prologue_directive();
				}
				break;
			case EPILOGUE_DIRECTIVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(540);
				epilogue_directive();
				}
				break;
			case SOURCE_DIRECTIVE:
				enterOuterAlt(_localctx, 7);
				{
				setState(541);
				source_directive();
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

	public static class Line_directiveContext extends ParserRuleContext {
		public Integral_literalContext line;
		public TerminalNode LINE_DIRECTIVE() { return getToken(SmaliParser.LINE_DIRECTIVE, 0); }
		public Integral_literalContext integral_literal() {
			return getRuleContext(Integral_literalContext.class,0);
		}
		public Line_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_directiveContext line_directive() throws RecognitionException {
		Line_directiveContext _localctx = new Line_directiveContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_line_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(LINE_DIRECTIVE);
			setState(545);
			((Line_directiveContext)_localctx).line = integral_literal();
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

	public static class Local_directiveContext extends ParserRuleContext {
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
		public Local_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitLocal_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_directiveContext local_directive() throws RecognitionException {
		Local_directiveContext _localctx = new Local_directiveContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_local_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(LOCAL_DIRECTIVE);
			setState(548);
			((Local_directiveContext)_localctx).reg = match(REGISTER);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(549);
				match(COMMA);
				setState(552);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL_LITERAL:
					{
					setState(550);
					match(NULL_LITERAL);
					}
					break;
				case STRING_LITERAL:
					{
					setState(551);
					((Local_directiveContext)_localctx).name = match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(554);
				match(COLON);
				setState(557);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID_TYPE:
					{
					setState(555);
					match(VOID_TYPE);
					}
					break;
				case PARAM_LIST_ID_OR_PRIMITIVE_TYPE:
				case ARRAY_DESCRIPTOR:
				case CLASS_DESCRIPTOR:
					{
					setState(556);
					((Local_directiveContext)_localctx).type = nonvoid_type_descriptor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(559);
					match(COMMA);
					setState(560);
					((Local_directiveContext)_localctx).signature = match(STRING_LITERAL);
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

	public static class End_local_directiveContext extends ParserRuleContext {
		public Token reg;
		public TerminalNode END_LOCAL_DIRECTIVE() { return getToken(SmaliParser.END_LOCAL_DIRECTIVE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public End_local_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_local_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitEnd_local_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_local_directiveContext end_local_directive() throws RecognitionException {
		End_local_directiveContext _localctx = new End_local_directiveContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_end_local_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(END_LOCAL_DIRECTIVE);
			setState(566);
			((End_local_directiveContext)_localctx).reg = match(REGISTER);
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

	public static class Restart_local_directiveContext extends ParserRuleContext {
		public Token reg;
		public TerminalNode RESTART_LOCAL_DIRECTIVE() { return getToken(SmaliParser.RESTART_LOCAL_DIRECTIVE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public Restart_local_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restart_local_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitRestart_local_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Restart_local_directiveContext restart_local_directive() throws RecognitionException {
		Restart_local_directiveContext _localctx = new Restart_local_directiveContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_restart_local_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(RESTART_LOCAL_DIRECTIVE);
			setState(569);
			((Restart_local_directiveContext)_localctx).reg = match(REGISTER);
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

	public static class Prologue_directiveContext extends ParserRuleContext {
		public TerminalNode PROLOGUE_DIRECTIVE() { return getToken(SmaliParser.PROLOGUE_DIRECTIVE, 0); }
		public Prologue_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prologue_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitPrologue_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prologue_directiveContext prologue_directive() throws RecognitionException {
		Prologue_directiveContext _localctx = new Prologue_directiveContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_prologue_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(PROLOGUE_DIRECTIVE);
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

	public static class Epilogue_directiveContext extends ParserRuleContext {
		public TerminalNode EPILOGUE_DIRECTIVE() { return getToken(SmaliParser.EPILOGUE_DIRECTIVE, 0); }
		public Epilogue_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epilogue_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitEpilogue_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Epilogue_directiveContext epilogue_directive() throws RecognitionException {
		Epilogue_directiveContext _localctx = new Epilogue_directiveContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_epilogue_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(EPILOGUE_DIRECTIVE);
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

	public static class Source_directiveContext extends ParserRuleContext {
		public Token file;
		public TerminalNode SOURCE_DIRECTIVE() { return getToken(SmaliParser.SOURCE_DIRECTIVE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public Source_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitSource_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_directiveContext source_directive() throws RecognitionException {
		Source_directiveContext _localctx = new Source_directiveContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_source_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(SOURCE_DIRECTIVE);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(576);
				((Source_directiveContext)_localctx).file = match(STRING_LITERAL);
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
		enterRule(_localctx, 106, RULE_instruction_format12x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
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
		enterRule(_localctx, 108, RULE_instruction_format22s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
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
		enterRule(_localctx, 110, RULE_instruction_format31i);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
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
		enterRule(_localctx, 112, RULE_instruction_format35c_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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

	public static class InstructionContext extends ParserRuleContext {
		public Insn_format10tContext insn_format10t() {
			return getRuleContext(Insn_format10tContext.class,0);
		}
		public Insn_format10xContext insn_format10x() {
			return getRuleContext(Insn_format10xContext.class,0);
		}
		public Insn_format10x_odexContext insn_format10x_odex() {
			return getRuleContext(Insn_format10x_odexContext.class,0);
		}
		public Insn_format11nContext insn_format11n() {
			return getRuleContext(Insn_format11nContext.class,0);
		}
		public Insn_format11xContext insn_format11x() {
			return getRuleContext(Insn_format11xContext.class,0);
		}
		public Insn_format12xContext insn_format12x() {
			return getRuleContext(Insn_format12xContext.class,0);
		}
		public Insn_format20bcContext insn_format20bc() {
			return getRuleContext(Insn_format20bcContext.class,0);
		}
		public Insn_format20tContext insn_format20t() {
			return getRuleContext(Insn_format20tContext.class,0);
		}
		public Insn_format21c_fieldContext insn_format21c_field() {
			return getRuleContext(Insn_format21c_fieldContext.class,0);
		}
		public Insn_format21c_field_odexContext insn_format21c_field_odex() {
			return getRuleContext(Insn_format21c_field_odexContext.class,0);
		}
		public Insn_format21c_method_handleContext insn_format21c_method_handle() {
			return getRuleContext(Insn_format21c_method_handleContext.class,0);
		}
		public Insn_format21c_method_typeContext insn_format21c_method_type() {
			return getRuleContext(Insn_format21c_method_typeContext.class,0);
		}
		public Insn_format21c_stringContext insn_format21c_string() {
			return getRuleContext(Insn_format21c_stringContext.class,0);
		}
		public Insn_format21c_typeContext insn_format21c_type() {
			return getRuleContext(Insn_format21c_typeContext.class,0);
		}
		public Insn_format21ihContext insn_format21ih() {
			return getRuleContext(Insn_format21ihContext.class,0);
		}
		public Insn_format21lhContext insn_format21lh() {
			return getRuleContext(Insn_format21lhContext.class,0);
		}
		public Insn_format21sContext insn_format21s() {
			return getRuleContext(Insn_format21sContext.class,0);
		}
		public Insn_format21tContext insn_format21t() {
			return getRuleContext(Insn_format21tContext.class,0);
		}
		public Insn_format22bContext insn_format22b() {
			return getRuleContext(Insn_format22bContext.class,0);
		}
		public Insn_format22c_fieldContext insn_format22c_field() {
			return getRuleContext(Insn_format22c_fieldContext.class,0);
		}
		public Insn_format22c_field_odexContext insn_format22c_field_odex() {
			return getRuleContext(Insn_format22c_field_odexContext.class,0);
		}
		public Insn_format22c_typeContext insn_format22c_type() {
			return getRuleContext(Insn_format22c_typeContext.class,0);
		}
		public Insn_format22cs_fieldContext insn_format22cs_field() {
			return getRuleContext(Insn_format22cs_fieldContext.class,0);
		}
		public Insn_format22sContext insn_format22s() {
			return getRuleContext(Insn_format22sContext.class,0);
		}
		public Insn_format22tContext insn_format22t() {
			return getRuleContext(Insn_format22tContext.class,0);
		}
		public Insn_format22xContext insn_format22x() {
			return getRuleContext(Insn_format22xContext.class,0);
		}
		public Insn_format23xContext insn_format23x() {
			return getRuleContext(Insn_format23xContext.class,0);
		}
		public Insn_format30tContext insn_format30t() {
			return getRuleContext(Insn_format30tContext.class,0);
		}
		public Insn_format31cContext insn_format31c() {
			return getRuleContext(Insn_format31cContext.class,0);
		}
		public Insn_format31iContext insn_format31i() {
			return getRuleContext(Insn_format31iContext.class,0);
		}
		public Insn_format31tContext insn_format31t() {
			return getRuleContext(Insn_format31tContext.class,0);
		}
		public Insn_format32xContext insn_format32x() {
			return getRuleContext(Insn_format32xContext.class,0);
		}
		public Insn_format35c_call_siteContext insn_format35c_call_site() {
			return getRuleContext(Insn_format35c_call_siteContext.class,0);
		}
		public Insn_format35c_methodContext insn_format35c_method() {
			return getRuleContext(Insn_format35c_methodContext.class,0);
		}
		public Insn_format35c_typeContext insn_format35c_type() {
			return getRuleContext(Insn_format35c_typeContext.class,0);
		}
		public Insn_format35c_method_odexContext insn_format35c_method_odex() {
			return getRuleContext(Insn_format35c_method_odexContext.class,0);
		}
		public Insn_format35mi_methodContext insn_format35mi_method() {
			return getRuleContext(Insn_format35mi_methodContext.class,0);
		}
		public Insn_format35ms_methodContext insn_format35ms_method() {
			return getRuleContext(Insn_format35ms_methodContext.class,0);
		}
		public Insn_format3rc_call_siteContext insn_format3rc_call_site() {
			return getRuleContext(Insn_format3rc_call_siteContext.class,0);
		}
		public Insn_format3rc_methodContext insn_format3rc_method() {
			return getRuleContext(Insn_format3rc_methodContext.class,0);
		}
		public Insn_format3rc_method_odexContext insn_format3rc_method_odex() {
			return getRuleContext(Insn_format3rc_method_odexContext.class,0);
		}
		public Insn_format3rc_typeContext insn_format3rc_type() {
			return getRuleContext(Insn_format3rc_typeContext.class,0);
		}
		public Insn_format3rmi_methodContext insn_format3rmi_method() {
			return getRuleContext(Insn_format3rmi_methodContext.class,0);
		}
		public Insn_format3rms_methodContext insn_format3rms_method() {
			return getRuleContext(Insn_format3rms_methodContext.class,0);
		}
		public Insn_format45cc_methodContext insn_format45cc_method() {
			return getRuleContext(Insn_format45cc_methodContext.class,0);
		}
		public Insn_format4rcc_methodContext insn_format4rcc_method() {
			return getRuleContext(Insn_format4rcc_methodContext.class,0);
		}
		public Insn_format51lContext insn_format51l() {
			return getRuleContext(Insn_format51lContext.class,0);
		}
		public Insn_array_data_directiveContext insn_array_data_directive() {
			return getRuleContext(Insn_array_data_directiveContext.class,0);
		}
		public Insn_packed_switch_directiveContext insn_packed_switch_directive() {
			return getRuleContext(Insn_packed_switch_directiveContext.class,0);
		}
		public Insn_sparse_switch_directiveContext insn_sparse_switch_directive() {
			return getRuleContext(Insn_sparse_switch_directiveContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliVisitor ) return ((SmaliVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_instruction);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSTRUCTION_FORMAT10t:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				insn_format10t();
				}
				break;
			case INSTRUCTION_FORMAT10x:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				insn_format10x();
				}
				break;
			case INSTRUCTION_FORMAT10x_ODEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				insn_format10x_odex();
				}
				break;
			case INSTRUCTION_FORMAT11n:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				insn_format11n();
				}
				break;
			case INSTRUCTION_FORMAT11x:
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				insn_format11x();
				}
				break;
			case INSTRUCTION_FORMAT12x_OR_ID:
			case INSTRUCTION_FORMAT12x:
				enterOuterAlt(_localctx, 6);
				{
				setState(592);
				insn_format12x();
				}
				break;
			case INSTRUCTION_FORMAT20bc:
				enterOuterAlt(_localctx, 7);
				{
				setState(593);
				insn_format20bc();
				}
				break;
			case INSTRUCTION_FORMAT20t:
				enterOuterAlt(_localctx, 8);
				{
				setState(594);
				insn_format20t();
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD:
				enterOuterAlt(_localctx, 9);
				{
				setState(595);
				insn_format21c_field();
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				enterOuterAlt(_localctx, 10);
				{
				setState(596);
				insn_format21c_field_odex();
				}
				break;
			case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
				enterOuterAlt(_localctx, 11);
				{
				setState(597);
				insn_format21c_method_handle();
				}
				break;
			case INSTRUCTION_FORMAT21c_METHOD_TYPE:
				enterOuterAlt(_localctx, 12);
				{
				setState(598);
				insn_format21c_method_type();
				}
				break;
			case INSTRUCTION_FORMAT21c_STRING:
				enterOuterAlt(_localctx, 13);
				{
				setState(599);
				insn_format21c_string();
				}
				break;
			case INSTRUCTION_FORMAT21c_TYPE:
				enterOuterAlt(_localctx, 14);
				{
				setState(600);
				insn_format21c_type();
				}
				break;
			case INSTRUCTION_FORMAT21ih:
				enterOuterAlt(_localctx, 15);
				{
				setState(601);
				insn_format21ih();
				}
				break;
			case INSTRUCTION_FORMAT21lh:
				enterOuterAlt(_localctx, 16);
				{
				setState(602);
				insn_format21lh();
				}
				break;
			case INSTRUCTION_FORMAT21s:
				enterOuterAlt(_localctx, 17);
				{
				setState(603);
				insn_format21s();
				}
				break;
			case INSTRUCTION_FORMAT21t:
				enterOuterAlt(_localctx, 18);
				{
				setState(604);
				insn_format21t();
				}
				break;
			case INSTRUCTION_FORMAT22b:
				enterOuterAlt(_localctx, 19);
				{
				setState(605);
				insn_format22b();
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD:
				enterOuterAlt(_localctx, 20);
				{
				setState(606);
				insn_format22c_field();
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				enterOuterAlt(_localctx, 21);
				{
				setState(607);
				insn_format22c_field_odex();
				}
				break;
			case INSTRUCTION_FORMAT22c_TYPE:
				enterOuterAlt(_localctx, 22);
				{
				setState(608);
				insn_format22c_type();
				}
				break;
			case INSTRUCTION_FORMAT22cs_FIELD:
				enterOuterAlt(_localctx, 23);
				{
				setState(609);
				insn_format22cs_field();
				}
				break;
			case INSTRUCTION_FORMAT22s_OR_ID:
			case INSTRUCTION_FORMAT22s:
				enterOuterAlt(_localctx, 24);
				{
				setState(610);
				insn_format22s();
				}
				break;
			case INSTRUCTION_FORMAT22t:
				enterOuterAlt(_localctx, 25);
				{
				setState(611);
				insn_format22t();
				}
				break;
			case INSTRUCTION_FORMAT22x:
				enterOuterAlt(_localctx, 26);
				{
				setState(612);
				insn_format22x();
				}
				break;
			case INSTRUCTION_FORMAT23x:
				enterOuterAlt(_localctx, 27);
				{
				setState(613);
				insn_format23x();
				}
				break;
			case INSTRUCTION_FORMAT30t:
				enterOuterAlt(_localctx, 28);
				{
				setState(614);
				insn_format30t();
				}
				break;
			case INSTRUCTION_FORMAT31c:
				enterOuterAlt(_localctx, 29);
				{
				setState(615);
				insn_format31c();
				}
				break;
			case INSTRUCTION_FORMAT31i_OR_ID:
			case INSTRUCTION_FORMAT31i:
				enterOuterAlt(_localctx, 30);
				{
				setState(616);
				insn_format31i();
				}
				break;
			case INSTRUCTION_FORMAT31t:
				enterOuterAlt(_localctx, 31);
				{
				setState(617);
				insn_format31t();
				}
				break;
			case INSTRUCTION_FORMAT32x:
				enterOuterAlt(_localctx, 32);
				{
				setState(618);
				insn_format32x();
				}
				break;
			case INSTRUCTION_FORMAT35c_CALL_SITE:
				enterOuterAlt(_localctx, 33);
				{
				setState(619);
				insn_format35c_call_site();
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD:
			case INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE:
				enterOuterAlt(_localctx, 34);
				{
				setState(620);
				insn_format35c_method();
				}
				break;
			case INSTRUCTION_FORMAT35c_TYPE:
				enterOuterAlt(_localctx, 35);
				{
				setState(621);
				insn_format35c_type();
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				enterOuterAlt(_localctx, 36);
				{
				setState(622);
				insn_format35c_method_odex();
				}
				break;
			case INSTRUCTION_FORMAT35mi_METHOD:
				enterOuterAlt(_localctx, 37);
				{
				setState(623);
				insn_format35mi_method();
				}
				break;
			case INSTRUCTION_FORMAT35ms_METHOD:
				enterOuterAlt(_localctx, 38);
				{
				setState(624);
				insn_format35ms_method();
				}
				break;
			case INSTRUCTION_FORMAT3rc_CALL_SITE:
				enterOuterAlt(_localctx, 39);
				{
				setState(625);
				insn_format3rc_call_site();
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD:
				enterOuterAlt(_localctx, 40);
				{
				setState(626);
				insn_format3rc_method();
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
				enterOuterAlt(_localctx, 41);
				{
				setState(627);
				insn_format3rc_method_odex();
				}
				break;
			case INSTRUCTION_FORMAT3rc_TYPE:
				enterOuterAlt(_localctx, 42);
				{
				setState(628);
				insn_format3rc_type();
				}
				break;
			case INSTRUCTION_FORMAT3rmi_METHOD:
				enterOuterAlt(_localctx, 43);
				{
				setState(629);
				insn_format3rmi_method();
				}
				break;
			case INSTRUCTION_FORMAT3rms_METHOD:
				enterOuterAlt(_localctx, 44);
				{
				setState(630);
				insn_format3rms_method();
				}
				break;
			case INSTRUCTION_FORMAT45cc_METHOD:
				enterOuterAlt(_localctx, 45);
				{
				setState(631);
				insn_format45cc_method();
				}
				break;
			case INSTRUCTION_FORMAT4rcc_METHOD:
				enterOuterAlt(_localctx, 46);
				{
				setState(632);
				insn_format4rcc_method();
				}
				break;
			case INSTRUCTION_FORMAT51l:
				enterOuterAlt(_localctx, 47);
				{
				setState(633);
				insn_format51l();
				}
				break;
			case ARRAY_DATA_DIRECTIVE:
				enterOuterAlt(_localctx, 48);
				{
				setState(634);
				insn_array_data_directive();
				}
				break;
			case PACKED_SWITCH_DIRECTIVE:
				enterOuterAlt(_localctx, 49);
				{
				setState(635);
				insn_packed_switch_directive();
				}
				break;
			case SPARSE_SWITCH_DIRECTIVE:
				enterOuterAlt(_localctx, 50);
				{
				setState(636);
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
		enterRule(_localctx, 116, RULE_insn_format10t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(INSTRUCTION_FORMAT10t);
			setState(640);
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
		enterRule(_localctx, 118, RULE_insn_format10x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
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
		enterRule(_localctx, 120, RULE_insn_format10x_odex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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
		public Token insn;
		public Token reg;
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Integral_literalContext integral_literal() {
			return getRuleContext(Integral_literalContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT11n() { return getToken(SmaliParser.INSTRUCTION_FORMAT11n, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
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
		enterRule(_localctx, 122, RULE_insn_format11n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			((Insn_format11nContext)_localctx).insn = match(INSTRUCTION_FORMAT11n);
			setState(647);
			((Insn_format11nContext)_localctx).reg = match(REGISTER);
			setState(648);
			match(COMMA);
			setState(649);
			integral_literal();
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
		public Token insn;
		public Token reg;
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
		enterRule(_localctx, 124, RULE_insn_format11x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			((Insn_format11xContext)_localctx).insn = match(INSTRUCTION_FORMAT11x);
			setState(652);
			((Insn_format11xContext)_localctx).reg = match(REGISTER);
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
		public Instruction_format12xContext insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Instruction_format12xContext instruction_format12x() {
			return getRuleContext(Instruction_format12xContext.class,0);
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
		enterRule(_localctx, 126, RULE_insn_format12x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			((Insn_format12xContext)_localctx).insn = instruction_format12x();
			setState(655);
			match(REGISTER);
			setState(656);
			match(COMMA);
			setState(657);
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

	public static class Insn_format20bcContext extends ParserRuleContext {
		public Token insn;
		public Token type;
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Verification_error_referenceContext verification_error_reference() {
			return getRuleContext(Verification_error_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT20bc() { return getToken(SmaliParser.INSTRUCTION_FORMAT20bc, 0); }
		public TerminalNode VERIFICATION_ERROR_TYPE() { return getToken(SmaliParser.VERIFICATION_ERROR_TYPE, 0); }
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
		enterRule(_localctx, 128, RULE_insn_format20bc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			((Insn_format20bcContext)_localctx).insn = match(INSTRUCTION_FORMAT20bc);
			setState(660);
			((Insn_format20bcContext)_localctx).type = match(VERIFICATION_ERROR_TYPE);
			setState(661);
			match(COMMA);
			setState(662);
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
		public Token insn;
		public Label_refContext name;
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
		enterRule(_localctx, 130, RULE_insn_format20t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			((Insn_format20tContext)_localctx).insn = match(INSTRUCTION_FORMAT20t);
			setState(665);
			((Insn_format20tContext)_localctx).name = label_ref();
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
		public Token insn;
		public Token reg;
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Field_referenceContext field_reference() {
			return getRuleContext(Field_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT21c_FIELD() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_FIELD, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
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
		enterRule(_localctx, 132, RULE_insn_format21c_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			((Insn_format21c_fieldContext)_localctx).insn = match(INSTRUCTION_FORMAT21c_FIELD);
			setState(668);
			((Insn_format21c_fieldContext)_localctx).reg = match(REGISTER);
			setState(669);
			match(COMMA);
			setState(670);
			field_reference();
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
		public Token insn;
		public Token reg;
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Field_referenceContext field_reference() {
			return getRuleContext(Field_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT21c_FIELD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_FIELD_ODEX, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
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
		enterRule(_localctx, 134, RULE_insn_format21c_field_odex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			((Insn_format21c_field_odexContext)_localctx).insn = match(INSTRUCTION_FORMAT21c_FIELD_ODEX);
			setState(673);
			((Insn_format21c_field_odexContext)_localctx).reg = match(REGISTER);
			setState(674);
			match(COMMA);
			setState(675);
			field_reference();
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
		public Token insn;
		public Token reg;
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Method_handle_referenceContext method_handle_reference() {
			return getRuleContext(Method_handle_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT21c_METHOD_HANDLE() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_METHOD_HANDLE, 0); }
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
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
		enterRule(_localctx, 136, RULE_insn_format21c_method_handle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			((Insn_format21c_method_handleContext)_localctx).insn = match(INSTRUCTION_FORMAT21c_METHOD_HANDLE);
			setState(678);
			((Insn_format21c_method_handleContext)_localctx).reg = match(REGISTER);
			setState(679);
			match(COMMA);
			setState(680);
			method_handle_reference();
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Method_prototypeContext method_prototype() {
			return getRuleContext(Method_prototypeContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT21c_METHOD_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_METHOD_TYPE, 0); }
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
		enterRule(_localctx, 138, RULE_insn_format21c_method_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			((Insn_format21c_method_typeContext)_localctx).insn = match(INSTRUCTION_FORMAT21c_METHOD_TYPE);
			setState(683);
			match(REGISTER);
			setState(684);
			match(COMMA);
			setState(685);
			method_prototype();
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public TerminalNode INSTRUCTION_FORMAT21c_STRING() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_STRING, 0); }
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
		enterRule(_localctx, 140, RULE_insn_format21c_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			((Insn_format21c_stringContext)_localctx).insn = match(INSTRUCTION_FORMAT21c_STRING);
			setState(688);
			match(REGISTER);
			setState(689);
			match(COMMA);
			setState(690);
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT21c_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT21c_TYPE, 0); }
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
		enterRule(_localctx, 142, RULE_insn_format21c_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			((Insn_format21c_typeContext)_localctx).insn = match(INSTRUCTION_FORMAT21c_TYPE);
			setState(693);
			match(REGISTER);
			setState(694);
			match(COMMA);
			setState(695);
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Fixed_32bit_literalContext fixed_32bit_literal() {
			return getRuleContext(Fixed_32bit_literalContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT21ih() { return getToken(SmaliParser.INSTRUCTION_FORMAT21ih, 0); }
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
		enterRule(_localctx, 144, RULE_insn_format21ih);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			((Insn_format21ihContext)_localctx).insn = match(INSTRUCTION_FORMAT21ih);
			setState(698);
			match(REGISTER);
			setState(699);
			match(COMMA);
			setState(700);
			fixed_32bit_literal();
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Fixed_32bit_literalContext fixed_32bit_literal() {
			return getRuleContext(Fixed_32bit_literalContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT21lh() { return getToken(SmaliParser.INSTRUCTION_FORMAT21lh, 0); }
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
		enterRule(_localctx, 146, RULE_insn_format21lh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			((Insn_format21lhContext)_localctx).insn = match(INSTRUCTION_FORMAT21lh);
			setState(703);
			match(REGISTER);
			setState(704);
			match(COMMA);
			setState(705);
			fixed_32bit_literal();
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Integral_literalContext integral_literal() {
			return getRuleContext(Integral_literalContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT21s() { return getToken(SmaliParser.INSTRUCTION_FORMAT21s, 0); }
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
		enterRule(_localctx, 148, RULE_insn_format21s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			((Insn_format21sContext)_localctx).insn = match(INSTRUCTION_FORMAT21s);
			setState(708);
			match(REGISTER);
			setState(709);
			match(COMMA);
			setState(710);
			integral_literal();
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT21t() { return getToken(SmaliParser.INSTRUCTION_FORMAT21t, 0); }
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
		enterRule(_localctx, 150, RULE_insn_format21t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			((Insn_format21tContext)_localctx).insn = match(INSTRUCTION_FORMAT21t);
			setState(713);
			match(REGISTER);
			setState(714);
			match(COMMA);
			setState(715);
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
		public Token insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Integral_literalContext integral_literal() {
			return getRuleContext(Integral_literalContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT22b() { return getToken(SmaliParser.INSTRUCTION_FORMAT22b, 0); }
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
		enterRule(_localctx, 152, RULE_insn_format22b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			((Insn_format22bContext)_localctx).insn = match(INSTRUCTION_FORMAT22b);
			setState(718);
			match(REGISTER);
			setState(719);
			match(COMMA);
			setState(720);
			match(REGISTER);
			setState(721);
			match(COMMA);
			setState(722);
			integral_literal();
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
		public Token insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Field_referenceContext field_reference() {
			return getRuleContext(Field_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT22c_FIELD() { return getToken(SmaliParser.INSTRUCTION_FORMAT22c_FIELD, 0); }
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
		enterRule(_localctx, 154, RULE_insn_format22c_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			((Insn_format22c_fieldContext)_localctx).insn = match(INSTRUCTION_FORMAT22c_FIELD);
			setState(725);
			match(REGISTER);
			setState(726);
			match(COMMA);
			setState(727);
			match(REGISTER);
			setState(728);
			match(COMMA);
			setState(729);
			field_reference();
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
		public Token insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Field_referenceContext field_reference() {
			return getRuleContext(Field_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT22c_FIELD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT22c_FIELD_ODEX, 0); }
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
		enterRule(_localctx, 156, RULE_insn_format22c_field_odex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			((Insn_format22c_field_odexContext)_localctx).insn = match(INSTRUCTION_FORMAT22c_FIELD_ODEX);
			setState(732);
			match(REGISTER);
			setState(733);
			match(COMMA);
			setState(734);
			match(REGISTER);
			setState(735);
			match(COMMA);
			setState(736);
			field_reference();
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
		public Token insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT22c_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT22c_TYPE, 0); }
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
		enterRule(_localctx, 158, RULE_insn_format22c_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			((Insn_format22c_typeContext)_localctx).insn = match(INSTRUCTION_FORMAT22c_TYPE);
			setState(739);
			match(REGISTER);
			setState(740);
			match(COMMA);
			setState(741);
			match(REGISTER);
			setState(742);
			match(COMMA);
			setState(743);
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
		public Token insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public TerminalNode FIELD_OFFSET() { return getToken(SmaliParser.FIELD_OFFSET, 0); }
		public TerminalNode INSTRUCTION_FORMAT22cs_FIELD() { return getToken(SmaliParser.INSTRUCTION_FORMAT22cs_FIELD, 0); }
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
		enterRule(_localctx, 160, RULE_insn_format22cs_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			((Insn_format22cs_fieldContext)_localctx).insn = match(INSTRUCTION_FORMAT22cs_FIELD);
			setState(746);
			match(REGISTER);
			setState(747);
			match(COMMA);
			setState(748);
			match(REGISTER);
			setState(749);
			match(COMMA);
			setState(750);
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
		public Instruction_format22sContext insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Integral_literalContext integral_literal() {
			return getRuleContext(Integral_literalContext.class,0);
		}
		public Instruction_format22sContext instruction_format22s() {
			return getRuleContext(Instruction_format22sContext.class,0);
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
		enterRule(_localctx, 162, RULE_insn_format22s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			((Insn_format22sContext)_localctx).insn = instruction_format22s();
			setState(753);
			match(REGISTER);
			setState(754);
			match(COMMA);
			setState(755);
			match(REGISTER);
			setState(756);
			match(COMMA);
			setState(757);
			integral_literal();
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
		public Token insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT22t() { return getToken(SmaliParser.INSTRUCTION_FORMAT22t, 0); }
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
		enterRule(_localctx, 164, RULE_insn_format22t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			((Insn_format22tContext)_localctx).insn = match(INSTRUCTION_FORMAT22t);
			setState(760);
			match(REGISTER);
			setState(761);
			match(COMMA);
			setState(762);
			match(REGISTER);
			setState(763);
			match(COMMA);
			setState(764);
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
		public Token insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode INSTRUCTION_FORMAT22x() { return getToken(SmaliParser.INSTRUCTION_FORMAT22x, 0); }
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
		enterRule(_localctx, 166, RULE_insn_format22x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			((Insn_format22xContext)_localctx).insn = match(INSTRUCTION_FORMAT22x);
			setState(767);
			match(REGISTER);
			setState(768);
			match(COMMA);
			setState(769);
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

	public static class Insn_format23xContext extends ParserRuleContext {
		public Token insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public TerminalNode INSTRUCTION_FORMAT23x() { return getToken(SmaliParser.INSTRUCTION_FORMAT23x, 0); }
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
		enterRule(_localctx, 168, RULE_insn_format23x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			((Insn_format23xContext)_localctx).insn = match(INSTRUCTION_FORMAT23x);
			setState(772);
			match(REGISTER);
			setState(773);
			match(COMMA);
			setState(774);
			match(REGISTER);
			setState(775);
			match(COMMA);
			setState(776);
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

	public static class Insn_format30tContext extends ParserRuleContext {
		public Token insn;
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT30t() { return getToken(SmaliParser.INSTRUCTION_FORMAT30t, 0); }
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
		enterRule(_localctx, 170, RULE_insn_format30t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			((Insn_format30tContext)_localctx).insn = match(INSTRUCTION_FORMAT30t);
			setState(779);
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SmaliParser.STRING_LITERAL, 0); }
		public TerminalNode INSTRUCTION_FORMAT31c() { return getToken(SmaliParser.INSTRUCTION_FORMAT31c, 0); }
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
		enterRule(_localctx, 172, RULE_insn_format31c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			((Insn_format31cContext)_localctx).insn = match(INSTRUCTION_FORMAT31c);
			setState(782);
			match(REGISTER);
			setState(783);
			match(COMMA);
			setState(784);
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
		public Instruction_format31iContext insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Fixed_32bit_literalContext fixed_32bit_literal() {
			return getRuleContext(Fixed_32bit_literalContext.class,0);
		}
		public Instruction_format31iContext instruction_format31i() {
			return getRuleContext(Instruction_format31iContext.class,0);
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
		enterRule(_localctx, 174, RULE_insn_format31i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			((Insn_format31iContext)_localctx).insn = instruction_format31i();
			setState(787);
			match(REGISTER);
			setState(788);
			match(COMMA);
			setState(789);
			fixed_32bit_literal();
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Label_refContext label_ref() {
			return getRuleContext(Label_refContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT31t() { return getToken(SmaliParser.INSTRUCTION_FORMAT31t, 0); }
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
		enterRule(_localctx, 176, RULE_insn_format31t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			((Insn_format31tContext)_localctx).insn = match(INSTRUCTION_FORMAT31t);
			setState(792);
			match(REGISTER);
			setState(793);
			match(COMMA);
			setState(794);
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
		public Token insn;
		public List<TerminalNode> REGISTER() { return getTokens(SmaliParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(SmaliParser.REGISTER, i);
		}
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode INSTRUCTION_FORMAT32x() { return getToken(SmaliParser.INSTRUCTION_FORMAT32x, 0); }
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
		enterRule(_localctx, 178, RULE_insn_format32x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			((Insn_format32xContext)_localctx).insn = match(INSTRUCTION_FORMAT32x);
			setState(797);
			match(REGISTER);
			setState(798);
			match(COMMA);
			setState(799);
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

	public static class Insn_format35c_call_siteContext extends ParserRuleContext {
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Call_site_referenceContext call_site_reference() {
			return getRuleContext(Call_site_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT35c_CALL_SITE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_CALL_SITE, 0); }
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
		enterRule(_localctx, 180, RULE_insn_format35c_call_site);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			((Insn_format35c_call_siteContext)_localctx).insn = match(INSTRUCTION_FORMAT35c_CALL_SITE);
			setState(802);
			match(OPEN_BRACE);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(803);
				register_list();
				}
			}

			setState(806);
			match(CLOSE_BRACE);
			setState(807);
			match(COMMA);
			setState(808);
			call_site_reference();
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
		public Instruction_format35c_methodContext insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public Instruction_format35c_methodContext instruction_format35c_method() {
			return getRuleContext(Instruction_format35c_methodContext.class,0);
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
		enterRule(_localctx, 182, RULE_insn_format35c_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			((Insn_format35c_methodContext)_localctx).insn = instruction_format35c_method();
			setState(811);
			match(OPEN_BRACE);
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(812);
				register_list();
				}
			}

			setState(815);
			match(CLOSE_BRACE);
			setState(816);
			match(COMMA);
			setState(817);
			method_reference();
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Nonvoid_type_descriptorContext nonvoid_type_descriptor() {
			return getRuleContext(Nonvoid_type_descriptorContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT35c_TYPE() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_TYPE, 0); }
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
		enterRule(_localctx, 184, RULE_insn_format35c_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			((Insn_format35c_typeContext)_localctx).insn = match(INSTRUCTION_FORMAT35c_TYPE);
			setState(820);
			match(OPEN_BRACE);
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(821);
				register_list();
				}
			}

			setState(824);
			match(CLOSE_BRACE);
			setState(825);
			match(COMMA);
			setState(826);
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT35c_METHOD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT35c_METHOD_ODEX, 0); }
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
		enterRule(_localctx, 186, RULE_insn_format35c_method_odex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			((Insn_format35c_method_odexContext)_localctx).insn = match(INSTRUCTION_FORMAT35c_METHOD_ODEX);
			setState(829);
			match(OPEN_BRACE);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(830);
				register_list();
				}
			}

			setState(833);
			match(CLOSE_BRACE);
			setState(834);
			match(COMMA);
			setState(835);
			method_reference();
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode INLINE_INDEX() { return getToken(SmaliParser.INLINE_INDEX, 0); }
		public TerminalNode INSTRUCTION_FORMAT35mi_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT35mi_METHOD, 0); }
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
		enterRule(_localctx, 188, RULE_insn_format35mi_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			((Insn_format35mi_methodContext)_localctx).insn = match(INSTRUCTION_FORMAT35mi_METHOD);
			setState(838);
			match(OPEN_BRACE);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(839);
				register_list();
				}
			}

			setState(842);
			match(CLOSE_BRACE);
			setState(843);
			match(COMMA);
			setState(844);
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode VTABLE_INDEX() { return getToken(SmaliParser.VTABLE_INDEX, 0); }
		public TerminalNode INSTRUCTION_FORMAT35ms_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT35ms_METHOD, 0); }
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
		enterRule(_localctx, 190, RULE_insn_format35ms_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			((Insn_format35ms_methodContext)_localctx).insn = match(INSTRUCTION_FORMAT35ms_METHOD);
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Call_site_referenceContext call_site_reference() {
			return getRuleContext(Call_site_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT3rc_CALL_SITE() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rc_CALL_SITE, 0); }
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
		enterRule(_localctx, 192, RULE_insn_format3rc_call_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			((Insn_format3rc_call_siteContext)_localctx).insn = match(INSTRUCTION_FORMAT3rc_CALL_SITE);
			setState(856);
			match(OPEN_BRACE);
			setState(857);
			register_range();
			setState(858);
			match(CLOSE_BRACE);
			setState(859);
			match(COMMA);
			setState(860);
			call_site_reference();
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT3rc_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rc_METHOD, 0); }
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
		enterRule(_localctx, 194, RULE_insn_format3rc_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			((Insn_format3rc_methodContext)_localctx).insn = match(INSTRUCTION_FORMAT3rc_METHOD);
			setState(863);
			match(OPEN_BRACE);
			setState(864);
			register_range();
			setState(865);
			match(CLOSE_BRACE);
			setState(866);
			match(COMMA);
			setState(867);
			method_reference();
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT3rc_METHOD_ODEX() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rc_METHOD_ODEX, 0); }
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
		enterRule(_localctx, 196, RULE_insn_format3rc_method_odex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			((Insn_format3rc_method_odexContext)_localctx).insn = match(INSTRUCTION_FORMAT3rc_METHOD_ODEX);
			setState(870);
			match(OPEN_BRACE);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(871);
				register_list();
				}
			}

			setState(874);
			match(CLOSE_BRACE);
			setState(875);
			match(COMMA);
			setState(876);
			method_reference();
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
		enterRule(_localctx, 198, RULE_insn_format3rc_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(INSTRUCTION_FORMAT3rc_TYPE);
			setState(879);
			match(OPEN_BRACE);
			setState(880);
			register_range();
			setState(881);
			match(CLOSE_BRACE);
			setState(882);
			match(COMMA);
			setState(883);
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode INLINE_INDEX() { return getToken(SmaliParser.INLINE_INDEX, 0); }
		public TerminalNode INSTRUCTION_FORMAT3rmi_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rmi_METHOD, 0); }
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
		enterRule(_localctx, 200, RULE_insn_format3rmi_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			((Insn_format3rmi_methodContext)_localctx).insn = match(INSTRUCTION_FORMAT3rmi_METHOD);
			setState(886);
			match(OPEN_BRACE);
			setState(887);
			register_range();
			setState(888);
			match(CLOSE_BRACE);
			setState(889);
			match(COMMA);
			setState(890);
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public TerminalNode VTABLE_INDEX() { return getToken(SmaliParser.VTABLE_INDEX, 0); }
		public TerminalNode INSTRUCTION_FORMAT3rms_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT3rms_METHOD, 0); }
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
		enterRule(_localctx, 202, RULE_insn_format3rms_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			((Insn_format3rms_methodContext)_localctx).insn = match(INSTRUCTION_FORMAT3rms_METHOD);
			setState(893);
			match(OPEN_BRACE);
			setState(894);
			register_range();
			setState(895);
			match(CLOSE_BRACE);
			setState(896);
			match(COMMA);
			setState(897);
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public Method_prototypeContext method_prototype() {
			return getRuleContext(Method_prototypeContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT45cc_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT45cc_METHOD, 0); }
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
		enterRule(_localctx, 204, RULE_insn_format45cc_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			((Insn_format45cc_methodContext)_localctx).insn = match(INSTRUCTION_FORMAT45cc_METHOD);
			setState(900);
			match(OPEN_BRACE);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGISTER) {
				{
				setState(901);
				register_list();
				}
			}

			setState(904);
			match(CLOSE_BRACE);
			setState(905);
			match(COMMA);
			setState(906);
			method_reference();
			setState(907);
			match(COMMA);
			setState(908);
			method_prototype();
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
		public Token insn;
		public TerminalNode OPEN_BRACE() { return getToken(SmaliParser.OPEN_BRACE, 0); }
		public Register_rangeContext register_range() {
			return getRuleContext(Register_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SmaliParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SmaliParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SmaliParser.COMMA, i);
		}
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public Method_prototypeContext method_prototype() {
			return getRuleContext(Method_prototypeContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT4rcc_METHOD() { return getToken(SmaliParser.INSTRUCTION_FORMAT4rcc_METHOD, 0); }
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
		enterRule(_localctx, 206, RULE_insn_format4rcc_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			((Insn_format4rcc_methodContext)_localctx).insn = match(INSTRUCTION_FORMAT4rcc_METHOD);
			setState(911);
			match(OPEN_BRACE);
			setState(912);
			register_range();
			setState(913);
			match(CLOSE_BRACE);
			setState(914);
			match(COMMA);
			setState(915);
			method_reference();
			setState(916);
			match(COMMA);
			setState(917);
			method_prototype();
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
		public Token insn;
		public TerminalNode REGISTER() { return getToken(SmaliParser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(SmaliParser.COMMA, 0); }
		public Fixed_literalContext fixed_literal() {
			return getRuleContext(Fixed_literalContext.class,0);
		}
		public TerminalNode INSTRUCTION_FORMAT51l() { return getToken(SmaliParser.INSTRUCTION_FORMAT51l, 0); }
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
		enterRule(_localctx, 208, RULE_insn_format51l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			((Insn_format51lContext)_localctx).insn = match(INSTRUCTION_FORMAT51l);
			setState(920);
			match(REGISTER);
			setState(921);
			match(COMMA);
			setState(922);
			fixed_literal();
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
		public Parsed_integer_literalContext elementWidth;
		public TerminalNode ARRAY_DATA_DIRECTIVE() { return getToken(SmaliParser.ARRAY_DATA_DIRECTIVE, 0); }
		public TerminalNode END_ARRAY_DATA_DIRECTIVE() { return getToken(SmaliParser.END_ARRAY_DATA_DIRECTIVE, 0); }
		public Parsed_integer_literalContext parsed_integer_literal() {
			return getRuleContext(Parsed_integer_literalContext.class,0);
		}
		public List<Fixed_literalContext> fixed_literal() {
			return getRuleContexts(Fixed_literalContext.class);
		}
		public Fixed_literalContext fixed_literal(int i) {
			return getRuleContext(Fixed_literalContext.class,i);
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
		enterRule(_localctx, 210, RULE_insn_array_data_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(ARRAY_DATA_DIRECTIVE);
			setState(925);
			((Insn_array_data_directiveContext)_localctx).elementWidth = parsed_integer_literal();
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << SHORT_LITERAL) | (1L << BYTE_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << DOUBLE_LITERAL_OR_ID) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0)) {
				{
				{
				setState(926);
				fixed_literal();
				}
				}
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(932);
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
		public Fixed_32bit_literalContext fixed_32bit_literal() {
			return getRuleContext(Fixed_32bit_literalContext.class,0);
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
		enterRule(_localctx, 212, RULE_insn_packed_switch_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(PACKED_SWITCH_DIRECTIVE);
			setState(935);
			fixed_32bit_literal();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(936);
				label_ref();
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(942);
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
		public List<Fixed_32bit_literalContext> fixed_32bit_literal() {
			return getRuleContexts(Fixed_32bit_literalContext.class);
		}
		public Fixed_32bit_literalContext fixed_32bit_literal(int i) {
			return getRuleContext(Fixed_32bit_literalContext.class,i);
		}
		public List<TerminalNode> ARROW() { return getTokens(SmaliParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(SmaliParser.ARROW, i);
		}
		public List<Label_refContext> label_ref() {
			return getRuleContexts(Label_refContext.class);
		}
		public Label_refContext label_ref(int i) {
			return getRuleContext(Label_refContext.class,i);
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
		enterRule(_localctx, 214, RULE_insn_sparse_switch_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(SPARSE_SWITCH_DIRECTIVE);
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSITIVE_INTEGER_LITERAL) | (1L << NEGATIVE_INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << SHORT_LITERAL) | (1L << BYTE_LITERAL) | (1L << FLOAT_LITERAL_OR_ID) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0)) {
				{
				{
				setState(945);
				fixed_32bit_literal();
				setState(946);
				match(ARROW);
				setState(947);
				label_ref();
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(954);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3~\u03bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\u00e2\n\2\r\2\16\2\u00e3"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\7\7\u00f6"+
		"\n\7\f\7\16\7\u00f9\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0102\n\b\3\b"+
		"\7\b\u0105\n\b\f\b\16\b\u0108\13\b\3\b\5\b\u010b\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u011a\n\n\f\n\16\n\u011d\13\n\3"+
		"\13\3\13\3\13\5\13\u0122\n\13\3\f\3\f\3\f\3\f\5\f\u0128\n\f\3\r\3\r\3"+
		"\16\3\16\5\16\u012e\n\16\3\17\3\17\5\17\u0132\n\17\3\17\3\17\3\17\3\20"+
		"\3\20\5\20\u0139\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0157\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0160\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0169\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0173\n\33\3\34\3\34\3\34"+
		"\3\34\7\34\u0179\n\34\f\34\16\34\u017c\13\34\3\34\5\34\u017f\n\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u018b\n\36\f\36\16"+
		"\36\u018e\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u0195\n\37\f\37\16\37\u0198"+
		"\13\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\5!\u01a3\n!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u01ac\n!\3!\3!\5!\u01b0\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01b9"+
		"\n\"\f\"\16\"\u01bc\13\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u01cb\n#\3$\3$\3%\3%\3%\5%\u01d2\n%\3%\3%\3%\3&\3&\3&\5&\u01da\n&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\7)\u01e9\n)\f)\16)\u01ec\13)"+
		"\3*\3*\3*\5*\u01f1\n*\5*\u01f3\n*\3+\3+\3+\5+\u01f8\n+\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\5.\u020f\n.\3.\7.\u0212"+
		"\n.\f.\16.\u0215\13.\3.\5.\u0218\n.\3/\3/\3/\3/\3/\3/\3/\5/\u0221\n/\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u022b\n\61\3\61\3\61\3\61"+
		"\5\61\u0230\n\61\3\61\3\61\5\61\u0234\n\61\5\61\u0236\n\61\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u0244\n\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0280\n;\3<\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3D\3D\3"+
		"D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3"+
		"I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3"+
		"M\3M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3"+
		"T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3X\3X\3X\3"+
		"X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\3\\\3\\\5\\\u0327"+
		"\n\\\3\\\3\\\3\\\3\\\3]\3]\3]\5]\u0330\n]\3]\3]\3]\3]\3^\3^\3^\5^\u0339"+
		"\n^\3^\3^\3^\3^\3_\3_\3_\5_\u0342\n_\3_\3_\3_\3_\3`\3`\3`\5`\u034b\n`"+
		"\3`\3`\3`\3`\3a\3a\3a\5a\u0354\na\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3c"+
		"\3c\3c\3c\3c\3c\3c\3d\3d\3d\5d\u036b\nd\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e"+
		"\3e\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\5h\u0389\nh\3h"+
		"\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3k\3k\3k\7k"+
		"\u03a2\nk\fk\16k\u03a5\13k\3k\3k\3l\3l\3l\7l\u03ac\nl\fl\16l\u03af\13"+
		"l\3l\3l\3m\3m\3m\3m\3m\7m\u03b8\nm\fm\16m\u03bb\13m\3m\3m\3m\2\2n\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\2\r\23\2\"#\'(+,/\62\66\679;=>BGKKMQSSUUXXZZ\\bimoo\4\2lnqq\4\2"+
		"mnqq\4\2nnqq\3\2\"#\4\2\'\'))\4\2((**\3\2>?\3\2QR\3\2XY\3\2]^\2\u03e6"+
		"\2\u00e1\3\2\2\2\4\u00e7\3\2\2\2\6\u00eb\3\2\2\2\b\u00ee\3\2\2\2\n\u00f1"+
		"\3\2\2\2\f\u00f7\3\2\2\2\16\u00fa\3\2\2\2\20\u010c\3\2\2\2\22\u011b\3"+
		"\2\2\2\24\u0121\3\2\2\2\26\u0127\3\2\2\2\30\u0129\3\2\2\2\32\u012d\3\2"+
		"\2\2\34\u012f\3\2\2\2\36\u0138\3\2\2\2 \u013a\3\2\2\2\"\u013c\3\2\2\2"+
		"$\u013e\3\2\2\2&\u0140\3\2\2\2(\u0142\3\2\2\2*\u0144\3\2\2\2,\u0156\3"+
		"\2\2\2.\u0158\3\2\2\2\60\u015f\3\2\2\2\62\u0168\3\2\2\2\64\u0172\3\2\2"+
		"\2\66\u0174\3\2\2\28\u0182\3\2\2\2:\u0186\3\2\2\2<\u0191\3\2\2\2>\u019b"+
		"\3\2\2\2@\u01af\3\2\2\2B\u01b1\3\2\2\2D\u01ca\3\2\2\2F\u01cc\3\2\2\2H"+
		"\u01d1\3\2\2\2J\u01d9\3\2\2\2L\u01df\3\2\2\2N\u01e2\3\2\2\2P\u01e5\3\2"+
		"\2\2R\u01f2\3\2\2\2T\u01f7\3\2\2\2V\u01f9\3\2\2\2X\u0202\3\2\2\2Z\u020a"+
		"\3\2\2\2\\\u0220\3\2\2\2^\u0222\3\2\2\2`\u0225\3\2\2\2b\u0237\3\2\2\2"+
		"d\u023a\3\2\2\2f\u023d\3\2\2\2h\u023f\3\2\2\2j\u0241\3\2\2\2l\u0245\3"+
		"\2\2\2n\u0247\3\2\2\2p\u0249\3\2\2\2r\u024b\3\2\2\2t\u027f\3\2\2\2v\u0281"+
		"\3\2\2\2x\u0284\3\2\2\2z\u0286\3\2\2\2|\u0288\3\2\2\2~\u028d\3\2\2\2\u0080"+
		"\u0290\3\2\2\2\u0082\u0295\3\2\2\2\u0084\u029a\3\2\2\2\u0086\u029d\3\2"+
		"\2\2\u0088\u02a2\3\2\2\2\u008a\u02a7\3\2\2\2\u008c\u02ac\3\2\2\2\u008e"+
		"\u02b1\3\2\2\2\u0090\u02b6\3\2\2\2\u0092\u02bb\3\2\2\2\u0094\u02c0\3\2"+
		"\2\2\u0096\u02c5\3\2\2\2\u0098\u02ca\3\2\2\2\u009a\u02cf\3\2\2\2\u009c"+
		"\u02d6\3\2\2\2\u009e\u02dd\3\2\2\2\u00a0\u02e4\3\2\2\2\u00a2\u02eb\3\2"+
		"\2\2\u00a4\u02f2\3\2\2\2\u00a6\u02f9\3\2\2\2\u00a8\u0300\3\2\2\2\u00aa"+
		"\u0305\3\2\2\2\u00ac\u030c\3\2\2\2\u00ae\u030f\3\2\2\2\u00b0\u0314\3\2"+
		"\2\2\u00b2\u0319\3\2\2\2\u00b4\u031e\3\2\2\2\u00b6\u0323\3\2\2\2\u00b8"+
		"\u032c\3\2\2\2\u00ba\u0335\3\2\2\2\u00bc\u033e\3\2\2\2\u00be\u0347\3\2"+
		"\2\2\u00c0\u0350\3\2\2\2\u00c2\u0359\3\2\2\2\u00c4\u0360\3\2\2\2\u00c6"+
		"\u0367\3\2\2\2\u00c8\u0370\3\2\2\2\u00ca\u0377\3\2\2\2\u00cc\u037e\3\2"+
		"\2\2\u00ce\u0385\3\2\2\2\u00d0\u0390\3\2\2\2\u00d2\u0399\3\2\2\2\u00d4"+
		"\u039e\3\2\2\2\u00d6\u03a8\3\2\2\2\u00d8\u03b2\3\2\2\2\u00da\u00e2\5\4"+
		"\3\2\u00db\u00e2\5\6\4\2\u00dc\u00e2\5\b\5\2\u00dd\u00e2\5\n\6\2\u00de"+
		"\u00e2\5\20\t\2\u00df\u00e2\5\16\b\2\u00e0\u00e2\5:\36\2\u00e1\u00da\3"+
		"\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\7\2\2\3\u00e6\3\3\2\2\2\u00e7\u00e8\7\3\2\2\u00e8\u00e9\5\f\7\2"+
		"\u00e9\u00ea\7q\2\2\u00ea\5\3\2\2\2\u00eb\u00ec\7\4\2\2\u00ec\u00ed\7"+
		"q\2\2\u00ed\7\3\2\2\2\u00ee\u00ef\7\5\2\2\u00ef\u00f0\7q\2\2\u00f0\t\3"+
		"\2\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f3\7-\2\2\u00f3\13\3\2\2\2\u00f4\u00f6"+
		"\7\60\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\r\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7"+
		"\7\2\2\u00fb\u00fc\5\f\7\2\u00fc\u00fd\5\32\16\2\u00fd\u00fe\7v\2\2\u00fe"+
		"\u0101\5\"\22\2\u00ff\u0100\7u\2\2\u0100\u0102\5,\27\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u010a\3\2\2\2\u0103\u0105\5:\36\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\7\b\2\2\u010a"+
		"\u0106\3\2\2\2\u010a\u010b\3\2\2\2\u010b\17\3\2\2\2\u010c\u010d\7\16\2"+
		"\2\u010d\u010e\5\f\7\2\u010e\u010f\5\32\16\2\u010f\u0110\5\34\17\2\u0110"+
		"\u0111\5\22\n\2\u0111\u0112\7\17\2\2\u0112\21\3\2\2\2\u0113\u011a\5\24"+
		"\13\2\u0114\u011a\5\26\f\2\u0115\u011a\5V,\2\u0116\u011a\5X-\2\u0117\u011a"+
		"\5Z.\2\u0118\u011a\5:\36\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119"+
		"\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\23\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0122\5L\'\2\u011f\u0122\5t;\2\u0120"+
		"\u0122\5\\/\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2"+
		"\2\2\u0122\25\3\2\2\2\u0123\u0124\7\20\2\2\u0124\u0128\5\60\31\2\u0125"+
		"\u0126\7\21\2\2\u0126\u0128\5\60\31\2\u0127\u0123\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\27\3\2\2\2\u0129\u012a\t\2\2\2\u012a\31\3\2\2\2\u012b\u012e"+
		"\5\30\r\2\u012c\u012e\7p\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\33\3\2\2\2\u012f\u0131\7z\2\2\u0130\u0132\5\36\20\2\u0131\u0130\3\2\2"+
		"\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7{\2\2\u0134\u0135"+
		"\5 \21\2\u0135\35\3\2\2\2\u0136\u0139\5\"\22\2\u0137\u0139\7r\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\37\3\2\2\2\u013a\u013b\t\3\2"+
		"\2\u013b!\3\2\2\2\u013c\u013d\t\4\2\2\u013d#\3\2\2\2\u013e\u013f\t\5\2"+
		"\2\u013f%\3\2\2\2\u0140\u0141\t\6\2\2\u0141\'\3\2\2\2\u0142\u0143\t\7"+
		"\2\2\u0143)\3\2\2\2\u0144\u0145\t\b\2\2\u0145+\3\2\2\2\u0146\u0157\7$"+
		"\2\2\u0147\u0157\5&\24\2\u0148\u0157\7%\2\2\u0149\u0157\7&\2\2\u014a\u0157"+
		"\5(\25\2\u014b\u0157\5*\26\2\u014c\u0157\7.\2\2\u014d\u0157\7-\2\2\u014e"+
		"\u0157\7+\2\2\u014f\u0157\7,\2\2\u0150\u0157\5\66\34\2\u0151\u0157\5<"+
		"\37\2\u0152\u0157\5@!\2\u0153\u0157\5> \2\u0154\u0157\5F$\2\u0155\u0157"+
		"\5\34\17\2\u0156\u0146\3\2\2\2\u0156\u0147\3\2\2\2\u0156\u0148\3\2\2\2"+
		"\u0156\u0149\3\2\2\2\u0156\u014a\3\2\2\2\u0156\u014b\3\2\2\2\u0156\u014c"+
		"\3\2\2\2\u0156\u014d\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u014f\3\2\2\2\u0156"+
		"\u0150\3\2\2\2\u0156\u0151\3\2\2\2\u0156\u0152\3\2\2\2\u0156\u0153\3\2"+
		"\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157-\3\2\2\2\u0158\u0159"+
		"\5&\24\2\u0159/\3\2\2\2\u015a\u0160\7$\2\2\u015b\u0160\5&\24\2\u015c\u0160"+
		"\7%\2\2\u015d\u0160\7.\2\2\u015e\u0160\7&\2\2\u015f\u015a\3\2\2\2\u015f"+
		"\u015b\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2"+
		"\2\2\u0160\61\3\2\2\2\u0161\u0169\7$\2\2\u0162\u0169\5&\24\2\u0163\u0169"+
		"\7%\2\2\u0164\u0169\7&\2\2\u0165\u0169\5(\25\2\u0166\u0169\7.\2\2\u0167"+
		"\u0169\7+\2\2\u0168\u0161\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0163\3\2"+
		"\2\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\63\3\2\2\2\u016a\u0173\5&\24\2\u016b\u0173\7$\2\2"+
		"\u016c\u0173\7%\2\2\u016d\u0173\7&\2\2\u016e\u0173\5(\25\2\u016f\u0173"+
		"\5*\26\2\u0170\u0173\7.\2\2\u0171\u0173\7+\2\2\u0172\u016a\3\2\2\2\u0172"+
		"\u016b\3\2\2\2\u0172\u016c\3\2\2\2\u0172\u016d\3\2\2\2\u0172\u016e\3\2"+
		"\2\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173"+
		"\65\3\2\2\2\u0174\u017e\7x\2\2\u0175\u017a\5,\27\2\u0176\u0177\7w\2\2"+
		"\u0177\u0179\5,\27\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017f\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0175\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0181\7y\2\2\u0181\67\3\2\2\2\u0182\u0183\5\30\r\2\u0183\u0184"+
		"\7u\2\2\u0184\u0185\5,\27\2\u01859\3\2\2\2\u0186\u0187\7\13\2\2\u0187"+
		"\u0188\7\61\2\2\u0188\u018c\7q\2\2\u0189\u018b\58\35\2\u018a\u0189\3\2"+
		"\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\f\2\2\u0190;\3\2\2\2"+
		"\u0191\u0192\7\t\2\2\u0192\u0196\7q\2\2\u0193\u0195\58\35\2\u0194\u0193"+
		"\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7\n\2\2\u019a=\3\2\2\2"+
		"\u019b\u019c\7\r\2\2\u019c\u019d\5J&\2\u019d?\3\2\2\2\u019e\u01b0\5$\23"+
		"\2\u019f\u01a0\5$\23\2\u01a0\u01a1\7t\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019f"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01ab\3\2\2\2\u01a4\u01a5\5\32\16\2"+
		"\u01a5\u01a6\7v\2\2\u01a6\u01a7\5\"\22\2\u01a7\u01ac\3\2\2\2\u01a8\u01a9"+
		"\5\32\16\2\u01a9\u01aa\5\34\17\2\u01aa\u01ac\3\2\2\2\u01ab\u01a4\3\2\2"+
		"\2\u01ab\u01a8\3\2\2\2\u01ac\u01b0\3\2\2\2\u01ad\u01b0\7m\2\2\u01ae\u01b0"+
		"\7l\2\2\u01af\u019e\3\2\2\2\u01af\u01a2\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0A\3\2\2\2\u01b1\u01b2\5\30\r\2\u01b2\u01b3\7z\2\2"+
		"\u01b3\u01b4\7-\2\2\u01b4\u01b5\7w\2\2\u01b5\u01ba\5\34\17\2\u01b6\u01b7"+
		"\7w\2\2\u01b7\u01b9\5,\27\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bd\u01be\7{\2\2\u01be\u01bf\7}\2\2\u01bf\u01c0\5H%\2\u01c0C\3"+
		"\2\2\2\u01c1\u01c2\7\66\2\2\u01c2\u01c3\7}\2\2\u01c3\u01cb\5J&\2\u01c4"+
		"\u01c5\7\67\2\2\u01c5\u01c6\7}\2\2\u01c6\u01cb\5H%\2\u01c7\u01c8\7^\2"+
		"\2\u01c8\u01c9\7}\2\2\u01c9\u01cb\5H%\2\u01ca\u01c1\3\2\2\2\u01ca\u01c4"+
		"\3\2\2\2\u01ca\u01c7\3\2\2\2\u01cbE\3\2\2\2\u01cc\u01cd\5D#\2\u01cdG\3"+
		"\2\2\2\u01ce\u01cf\5$\23\2\u01cf\u01d0\7t\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01ce\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5\32"+
		"\16\2\u01d4\u01d5\5\34\17\2\u01d5I\3\2\2\2\u01d6\u01d7\5$\23\2\u01d7\u01d8"+
		"\7t\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\5\32\16\2\u01dc\u01dd\7v\2\2\u01dd\u01de\5"+
		"\"\22\2\u01deK\3\2\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1\5\30\r\2\u01e1M"+
		"\3\2\2\2\u01e2\u01e3\7v\2\2\u01e3\u01e4\5\30\r\2\u01e4O\3\2\2\2\u01e5"+
		"\u01ea\7/\2\2\u01e6\u01e7\7w\2\2\u01e7\u01e9\7/\2\2\u01e8\u01e6\3\2\2"+
		"\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebQ"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\7/\2\2\u01ee\u01ef\7s\2\2\u01ef"+
		"\u01f1\7/\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2"+
		"\2\2\u01f2\u01ed\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3S\3\2\2\2\u01f4\u01f8"+
		"\7q\2\2\u01f5\u01f8\5J&\2\u01f6\u01f8\5H%\2\u01f7\u01f4\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8U\3\2\2\2\u01f9\u01fa\7\30\2\2"+
		"\u01fa\u01fb\5\"\22\2\u01fb\u01fc\7x\2\2\u01fc\u01fd\5N(\2\u01fd\u01fe"+
		"\7s\2\2\u01fe\u01ff\5N(\2\u01ff\u0200\7y\2\2\u0200\u0201\5N(\2\u0201W"+
		"\3\2\2\2\u0202\u0203\7\31\2\2\u0203\u0204\7x\2\2\u0204\u0205\5N(\2\u0205"+
		"\u0206\7s\2\2\u0206\u0207\5N(\2\u0207\u0208\7y\2\2\u0208\u0209\5N(\2\u0209"+
		"Y\3\2\2\2\u020a\u020b\7\33\2\2\u020b\u020e\7/\2\2\u020c\u020d\7w\2\2\u020d"+
		"\u020f\7-\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0217\3\2"+
		"\2\2\u0210\u0212\5:\36\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0216\u0218\7\34\2\2\u0217\u0213\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"[\3\2\2\2\u0219\u0221\5^\60\2\u021a\u0221\5`\61\2\u021b\u0221\5b\62\2"+
		"\u021c\u0221\5d\63\2\u021d\u0221\5f\64\2\u021e\u0221\5h\65\2\u021f\u0221"+
		"\5j\66\2\u0220\u0219\3\2\2\2\u0220\u021a\3\2\2\2\u0220\u021b\3\2\2\2\u0220"+
		"\u021c\3\2\2\2\u0220\u021d\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2"+
		"\2\2\u0221]\3\2\2\2\u0222\u0223\7\32\2\2\u0223\u0224\5\60\31\2\u0224_"+
		"\3\2\2\2\u0225\u0226\7\35\2\2\u0226\u0235\7/\2\2\u0227\u022a\7w\2\2\u0228"+
		"\u022b\7,\2\2\u0229\u022b\7-\2\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2"+
		"\2\u022b\u022c\3\2\2\2\u022c\u022f\7v\2\2\u022d\u0230\7l\2\2\u022e\u0230"+
		"\5\"\22\2\u022f\u022d\3\2\2\2\u022f\u022e\3\2\2\2\u0230\u0233\3\2\2\2"+
		"\u0231\u0232\7w\2\2\u0232\u0234\7-\2\2\u0233\u0231\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0227\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"a\3\2\2\2\u0237\u0238\7\36\2\2\u0238\u0239\7/\2\2\u0239c\3\2\2\2\u023a"+
		"\u023b\7\37\2\2\u023b\u023c\7/\2\2\u023ce\3\2\2\2\u023d\u023e\7 \2\2\u023e"+
		"g\3\2\2\2\u023f\u0240\7!\2\2\u0240i\3\2\2\2\u0241\u0243\7\6\2\2\u0242"+
		"\u0244\7-\2\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244k\3\2\2\2\u0245"+
		"\u0246\t\t\2\2\u0246m\3\2\2\2\u0247\u0248\t\n\2\2\u0248o\3\2\2\2\u0249"+
		"\u024a\t\13\2\2\u024aq\3\2\2\2\u024b\u024c\t\f\2\2\u024cs\3\2\2\2\u024d"+
		"\u0280\5v<\2\u024e\u0280\5x=\2\u024f\u0280\5z>\2\u0250\u0280\5|?\2\u0251"+
		"\u0280\5~@\2\u0252\u0280\5\u0080A\2\u0253\u0280\5\u0082B\2\u0254\u0280"+
		"\5\u0084C\2\u0255\u0280\5\u0086D\2\u0256\u0280\5\u0088E\2\u0257\u0280"+
		"\5\u008aF\2\u0258\u0280\5\u008cG\2\u0259\u0280\5\u008eH\2\u025a\u0280"+
		"\5\u0090I\2\u025b\u0280\5\u0092J\2\u025c\u0280\5\u0094K\2\u025d\u0280"+
		"\5\u0096L\2\u025e\u0280\5\u0098M\2\u025f\u0280\5\u009aN\2\u0260\u0280"+
		"\5\u009cO\2\u0261\u0280\5\u009eP\2\u0262\u0280\5\u00a0Q\2\u0263\u0280"+
		"\5\u00a2R\2\u0264\u0280\5\u00a4S\2\u0265\u0280\5\u00a6T\2\u0266\u0280"+
		"\5\u00a8U\2\u0267\u0280\5\u00aaV\2\u0268\u0280\5\u00acW\2\u0269\u0280"+
		"\5\u00aeX\2\u026a\u0280\5\u00b0Y\2\u026b\u0280\5\u00b2Z\2\u026c\u0280"+
		"\5\u00b4[\2\u026d\u0280\5\u00b6\\\2\u026e\u0280\5\u00b8]\2\u026f\u0280"+
		"\5\u00ba^\2\u0270\u0280\5\u00bc_\2\u0271\u0280\5\u00be`\2\u0272\u0280"+
		"\5\u00c0a\2\u0273\u0280\5\u00c2b\2\u0274\u0280\5\u00c4c\2\u0275\u0280"+
		"\5\u00c6d\2\u0276\u0280\5\u00c8e\2\u0277\u0280\5\u00caf\2\u0278\u0280"+
		"\5\u00ccg\2\u0279\u0280\5\u00ceh\2\u027a\u0280\5\u00d0i\2\u027b\u0280"+
		"\5\u00d2j\2\u027c\u0280\5\u00d4k\2\u027d\u0280\5\u00d6l\2\u027e\u0280"+
		"\5\u00d8m\2\u027f\u024d\3\2\2\2\u027f\u024e\3\2\2\2\u027f\u024f\3\2\2"+
		"\2\u027f\u0250\3\2\2\2\u027f\u0251\3\2\2\2\u027f\u0252\3\2\2\2\u027f\u0253"+
		"\3\2\2\2\u027f\u0254\3\2\2\2\u027f\u0255\3\2\2\2\u027f\u0256\3\2\2\2\u027f"+
		"\u0257\3\2\2\2\u027f\u0258\3\2\2\2\u027f\u0259\3\2\2\2\u027f\u025a\3\2"+
		"\2\2\u027f\u025b\3\2\2\2\u027f\u025c\3\2\2\2\u027f\u025d\3\2\2\2\u027f"+
		"\u025e\3\2\2\2\u027f\u025f\3\2\2\2\u027f\u0260\3\2\2\2\u027f\u0261\3\2"+
		"\2\2\u027f\u0262\3\2\2\2\u027f\u0263\3\2\2\2\u027f\u0264\3\2\2\2\u027f"+
		"\u0265\3\2\2\2\u027f\u0266\3\2\2\2\u027f\u0267\3\2\2\2\u027f\u0268\3\2"+
		"\2\2\u027f\u0269\3\2\2\2\u027f\u026a\3\2\2\2\u027f\u026b\3\2\2\2\u027f"+
		"\u026c\3\2\2\2\u027f\u026d\3\2\2\2\u027f\u026e\3\2\2\2\u027f\u026f\3\2"+
		"\2\2\u027f\u0270\3\2\2\2\u027f\u0271\3\2\2\2\u027f\u0272\3\2\2\2\u027f"+
		"\u0273\3\2\2\2\u027f\u0274\3\2\2\2\u027f\u0275\3\2\2\2\u027f\u0276\3\2"+
		"\2\2\u027f\u0277\3\2\2\2\u027f\u0278\3\2\2\2\u027f\u0279\3\2\2\2\u027f"+
		"\u027a\3\2\2\2\u027f\u027b\3\2\2\2\u027f\u027c\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u027f\u027e\3\2\2\2\u0280u\3\2\2\2\u0281\u0282\79\2\2\u0282\u0283"+
		"\5N(\2\u0283w\3\2\2\2\u0284\u0285\7:\2\2\u0285y\3\2\2\2\u0286\u0287\7"+
		";\2\2\u0287{\3\2\2\2\u0288\u0289\7<\2\2\u0289\u028a\7/\2\2\u028a\u028b"+
		"\7w\2\2\u028b\u028c\5\60\31\2\u028c}\3\2\2\2\u028d\u028e\7=\2\2\u028e"+
		"\u028f\7/\2\2\u028f\177\3\2\2\2\u0290\u0291\5l\67\2\u0291\u0292\7/\2\2"+
		"\u0292\u0293\7w\2\2\u0293\u0294\7/\2\2\u0294\u0081\3\2\2\2\u0295\u0296"+
		"\7@\2\2\u0296\u0297\7\62\2\2\u0297\u0298\7w\2\2\u0298\u0299\5T+\2\u0299"+
		"\u0083\3\2\2\2\u029a\u029b\7A\2\2\u029b\u029c\5N(\2\u029c\u0085\3\2\2"+
		"\2\u029d\u029e\7B\2\2\u029e\u029f\7/\2\2\u029f\u02a0\7w\2\2\u02a0\u02a1"+
		"\5J&\2\u02a1\u0087\3\2\2\2\u02a2\u02a3\7C\2\2\u02a3\u02a4\7/\2\2\u02a4"+
		"\u02a5\7w\2\2\u02a5\u02a6\5J&\2\u02a6\u0089\3\2\2\2\u02a7\u02a8\7F\2\2"+
		"\u02a8\u02a9\7/\2\2\u02a9\u02aa\7w\2\2\u02aa\u02ab\5D#\2\u02ab\u008b\3"+
		"\2\2\2\u02ac\u02ad\7G\2\2\u02ad\u02ae\7/\2\2\u02ae\u02af\7w\2\2\u02af"+
		"\u02b0\5\34\17\2\u02b0\u008d\3\2\2\2\u02b1\u02b2\7D\2\2\u02b2\u02b3\7"+
		"/\2\2\u02b3\u02b4\7w\2\2\u02b4\u02b5\7-\2\2\u02b5\u008f\3\2\2\2\u02b6"+
		"\u02b7\7E\2\2\u02b7\u02b8\7/\2\2\u02b8\u02b9\7w\2\2\u02b9\u02ba\5\"\22"+
		"\2\u02ba\u0091\3\2\2\2\u02bb\u02bc\7H\2\2\u02bc\u02bd\7/\2\2\u02bd\u02be"+
		"\7w\2\2\u02be\u02bf\5\62\32\2\u02bf\u0093\3\2\2\2\u02c0\u02c1\7I\2\2\u02c1"+
		"\u02c2\7/\2\2\u02c2\u02c3\7w\2\2\u02c3\u02c4\5\62\32\2\u02c4\u0095\3\2"+
		"\2\2\u02c5\u02c6\7J\2\2\u02c6\u02c7\7/\2\2\u02c7\u02c8\7w\2\2\u02c8\u02c9"+
		"\5\60\31\2\u02c9\u0097\3\2\2\2\u02ca\u02cb\7K\2\2\u02cb\u02cc\7/\2\2\u02cc"+
		"\u02cd\7w\2\2\u02cd\u02ce\5N(\2\u02ce\u0099\3\2\2\2\u02cf\u02d0\7L\2\2"+
		"\u02d0\u02d1\7/\2\2\u02d1\u02d2\7w\2\2\u02d2\u02d3\7/\2\2\u02d3\u02d4"+
		"\7w\2\2\u02d4\u02d5\5\60\31\2\u02d5\u009b\3\2\2\2\u02d6\u02d7\7M\2\2\u02d7"+
		"\u02d8\7/\2\2\u02d8\u02d9\7w\2\2\u02d9\u02da\7/\2\2\u02da\u02db\7w\2\2"+
		"\u02db\u02dc\5J&\2\u02dc\u009d\3\2\2\2\u02dd\u02de\7N\2\2\u02de\u02df"+
		"\7/\2\2\u02df\u02e0\7w\2\2\u02e0\u02e1\7/\2\2\u02e1\u02e2\7w\2\2\u02e2"+
		"\u02e3\5J&\2\u02e3\u009f\3\2\2\2\u02e4\u02e5\7O\2\2\u02e5\u02e6\7/\2\2"+
		"\u02e6\u02e7\7w\2\2\u02e7\u02e8\7/\2\2\u02e8\u02e9\7w\2\2\u02e9\u02ea"+
		"\5\"\22\2\u02ea\u00a1\3\2\2\2\u02eb\u02ec\7P\2\2\u02ec\u02ed\7/\2\2\u02ed"+
		"\u02ee\7w\2\2\u02ee\u02ef\7/\2\2\u02ef\u02f0\7w\2\2\u02f0\u02f1\7\65\2"+
		"\2\u02f1\u00a3\3\2\2\2\u02f2\u02f3\5n8\2\u02f3\u02f4\7/\2\2\u02f4\u02f5"+
		"\7w\2\2\u02f5\u02f6\7/\2\2\u02f6\u02f7\7w\2\2\u02f7\u02f8\5\60\31\2\u02f8"+
		"\u00a5\3\2\2\2\u02f9\u02fa\7S\2\2\u02fa\u02fb\7/\2\2\u02fb\u02fc\7w\2"+
		"\2\u02fc\u02fd\7/\2\2\u02fd\u02fe\7w\2\2\u02fe\u02ff\5N(\2\u02ff\u00a7"+
		"\3\2\2\2\u0300\u0301\7T\2\2\u0301\u0302\7/\2\2\u0302\u0303\7w\2\2\u0303"+
		"\u0304\7/\2\2\u0304\u00a9\3\2\2\2\u0305\u0306\7U\2\2\u0306\u0307\7/\2"+
		"\2\u0307\u0308\7w\2\2\u0308\u0309\7/\2\2\u0309\u030a\7w\2\2\u030a\u030b"+
		"\7/\2\2\u030b\u00ab\3\2\2\2\u030c\u030d\7V\2\2\u030d\u030e\5N(\2\u030e"+
		"\u00ad\3\2\2\2\u030f\u0310\7W\2\2\u0310\u0311\7/\2\2\u0311\u0312\7w\2"+
		"\2\u0312\u0313\7-\2\2\u0313\u00af\3\2\2\2\u0314\u0315\5p9\2\u0315\u0316"+
		"\7/\2\2\u0316\u0317\7w\2\2\u0317\u0318\5\62\32\2\u0318\u00b1\3\2\2\2\u0319"+
		"\u031a\7Z\2\2\u031a\u031b\7/\2\2\u031b\u031c\7w\2\2\u031c\u031d\5N(\2"+
		"\u031d\u00b3\3\2\2\2\u031e\u031f\7[\2\2\u031f\u0320\7/\2\2\u0320\u0321"+
		"\7w\2\2\u0321\u0322\7/\2\2\u0322\u00b5\3\2\2\2\u0323\u0324\7\\\2\2\u0324"+
		"\u0326\7x\2\2\u0325\u0327\5P)\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2"+
		"\2\u0327\u0328\3\2\2\2\u0328\u0329\7y\2\2\u0329\u032a\7w\2\2\u032a\u032b"+
		"\5B\"\2\u032b\u00b7\3\2\2\2\u032c\u032d\5r:\2\u032d\u032f\7x\2\2\u032e"+
		"\u0330\5P)\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2"+
		"\2\u0331\u0332\7y\2\2\u0332\u0333\7w\2\2\u0333\u0334\5H%\2\u0334\u00b9"+
		"\3\2\2\2\u0335\u0336\7`\2\2\u0336\u0338\7x\2\2\u0337\u0339\5P)\2\u0338"+
		"\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\7y"+
		"\2\2\u033b\u033c\7w\2\2\u033c\u033d\5\"\22\2\u033d\u00bb\3\2\2\2\u033e"+
		"\u033f\7_\2\2\u033f\u0341\7x\2\2\u0340\u0342\5P)\2\u0341\u0340\3\2\2\2"+
		"\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\7y\2\2\u0344\u0345"+
		"\7w\2\2\u0345\u0346\5H%\2\u0346\u00bd\3\2\2\2\u0347\u0348\7a\2\2\u0348"+
		"\u034a\7x\2\2\u0349\u034b\5P)\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2"+
		"\2\u034b\u034c\3\2\2\2\u034c\u034d\7y\2\2\u034d\u034e\7w\2\2\u034e\u034f"+
		"\7\63\2\2\u034f\u00bf\3\2\2\2\u0350\u0351\7b\2\2\u0351\u0353\7x\2\2\u0352"+
		"\u0354\5P)\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2"+
		"\2\u0355\u0356\7y\2\2\u0356\u0357\7w\2\2\u0357\u0358\7\64\2\2\u0358\u00c1"+
		"\3\2\2\2\u0359\u035a\7c\2\2\u035a\u035b\7x\2\2\u035b\u035c\5R*\2\u035c"+
		"\u035d\7y\2\2\u035d\u035e\7w\2\2\u035e\u035f\5B\"\2\u035f\u00c3\3\2\2"+
		"\2\u0360\u0361\7d\2\2\u0361\u0362\7x\2\2\u0362\u0363\5R*\2\u0363\u0364"+
		"\7y\2\2\u0364\u0365\7w\2\2\u0365\u0366\5H%\2\u0366\u00c5\3\2\2\2\u0367"+
		"\u0368\7e\2\2\u0368\u036a\7x\2\2\u0369\u036b\5P)\2\u036a\u0369\3\2\2\2"+
		"\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\7y\2\2\u036d\u036e"+
		"\7w\2\2\u036e\u036f\5H%\2\u036f\u00c7\3\2\2\2\u0370\u0371\7f\2\2\u0371"+
		"\u0372\7x\2\2\u0372\u0373\5R*\2\u0373\u0374\7y\2\2\u0374\u0375\7w\2\2"+
		"\u0375\u0376\5\"\22\2\u0376\u00c9\3\2\2\2\u0377\u0378\7g\2\2\u0378\u0379"+
		"\7x\2\2\u0379\u037a\5R*\2\u037a\u037b\7y\2\2\u037b\u037c\7w\2\2\u037c"+
		"\u037d\7\63\2\2\u037d\u00cb\3\2\2\2\u037e\u037f\7h\2\2\u037f\u0380\7x"+
		"\2\2\u0380\u0381\5R*\2\u0381\u0382\7y\2\2\u0382\u0383\7w\2\2\u0383\u0384"+
		"\7\64\2\2\u0384\u00cd\3\2\2\2\u0385\u0386\7i\2\2\u0386\u0388\7x\2\2\u0387"+
		"\u0389\5P)\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2"+
		"\2\u038a\u038b\7y\2\2\u038b\u038c\7w\2\2\u038c\u038d\5H%\2\u038d\u038e"+
		"\7w\2\2\u038e\u038f\5\34\17\2\u038f\u00cf\3\2\2\2\u0390\u0391\7j\2\2\u0391"+
		"\u0392\7x\2\2\u0392\u0393\5R*\2\u0393\u0394\7y\2\2\u0394\u0395\7w\2\2"+
		"\u0395\u0396\5H%\2\u0396\u0397\7w\2\2\u0397\u0398\5\34\17\2\u0398\u00d1"+
		"\3\2\2\2\u0399\u039a\7k\2\2\u039a\u039b\7/\2\2\u039b\u039c\7w\2\2\u039c"+
		"\u039d\5\64\33\2\u039d\u00d3\3\2\2\2\u039e\u039f\7\22\2\2\u039f\u03a3"+
		"\5.\30\2\u03a0\u03a2\5\64\33\2\u03a1\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2"+
		"\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a3"+
		"\3\2\2\2\u03a6\u03a7\7\23\2\2\u03a7\u00d5\3\2\2\2\u03a8\u03a9\7\24\2\2"+
		"\u03a9\u03ad\5\62\32\2\u03aa\u03ac\5N(\2\u03ab\u03aa\3\2\2\2\u03ac\u03af"+
		"\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af"+
		"\u03ad\3\2\2\2\u03b0\u03b1\7\25\2\2\u03b1\u00d7\3\2\2\2\u03b2\u03b9\7"+
		"\26\2\2\u03b3\u03b4\5\62\32\2\u03b4\u03b5\7t\2\2\u03b5\u03b6\5N(\2\u03b6"+
		"\u03b8\3\2\2\2\u03b7\u03b3\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc"+
		"\u03bd\7\27\2\2\u03bd\u00d9\3\2\2\2\67\u00e1\u00e3\u00f7\u0101\u0106\u010a"+
		"\u0119\u011b\u0121\u0127\u012d\u0131\u0138\u0156\u015f\u0168\u0172\u017a"+
		"\u017e\u018c\u0196\u01a2\u01ab\u01af\u01ba\u01ca\u01d1\u01d9\u01ea\u01f0"+
		"\u01f2\u01f7\u020e\u0213\u0217\u0220\u022a\u022f\u0233\u0235\u0243\u027f"+
		"\u0326\u032f\u0338\u0341\u034a\u0353\u036a\u0388\u03a3\u03ad\u03b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}