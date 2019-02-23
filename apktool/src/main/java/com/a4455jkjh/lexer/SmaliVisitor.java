// Generated from /storage/emulated/0/AppProjects/Apltool2/lexer_src/Smali.g4 by ANTLR 4.7.2
package com.a4455jkjh.lexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SmaliParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SmaliVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SmaliParser#smali_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmali_file(SmaliParser.Smali_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#class_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_spec(SmaliParser.Class_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#super_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_spec(SmaliParser.Super_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#implements_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplements_spec(SmaliParser.Implements_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#source_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_spec(SmaliParser.Source_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#access_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_list(SmaliParser.Access_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SmaliParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SmaliParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#statements_and_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements_and_directives(SmaliParser.Statements_and_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#ordered_method_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_method_item(SmaliParser.Ordered_method_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#registers_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisters_directive(SmaliParser.Registers_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#simple_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(SmaliParser.Simple_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#member_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_name(SmaliParser.Member_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#method_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_prototype(SmaliParser.Method_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(SmaliParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#type_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_descriptor(SmaliParser.Type_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#nonvoid_type_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonvoid_type_descriptor(SmaliParser.Nonvoid_type_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#reference_type_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_type_descriptor(SmaliParser.Reference_type_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(SmaliParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#float_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_literal(SmaliParser.Float_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#double_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_literal(SmaliParser.Double_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SmaliParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#parsed_integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParsed_integer_literal(SmaliParser.Parsed_integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#integral_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegral_literal(SmaliParser.Integral_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#fixed_32bit_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_32bit_literal(SmaliParser.Fixed_32bit_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#fixed_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_literal(SmaliParser.Fixed_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(SmaliParser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#annotation_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_element(SmaliParser.Annotation_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SmaliParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#subannotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubannotation(SmaliParser.SubannotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#enum_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_literal(SmaliParser.Enum_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#type_field_method_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_field_method_literal(SmaliParser.Type_field_method_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#call_site_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_site_reference(SmaliParser.Call_site_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#method_handle_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_handle_reference(SmaliParser.Method_handle_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#method_handle_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_handle_literal(SmaliParser.Method_handle_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#method_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_reference(SmaliParser.Method_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#field_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_reference(SmaliParser.Field_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(SmaliParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#label_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_ref(SmaliParser.Label_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#register_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_list(SmaliParser.Register_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#register_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_range(SmaliParser.Register_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#verification_error_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerification_error_reference(SmaliParser.Verification_error_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#catch_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_directive(SmaliParser.Catch_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#catchall_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchall_directive(SmaliParser.Catchall_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#parameter_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_directive(SmaliParser.Parameter_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#debug_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug_directive(SmaliParser.Debug_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#line_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_directive(SmaliParser.Line_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#local_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_directive(SmaliParser.Local_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#end_local_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_local_directive(SmaliParser.End_local_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#restart_local_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestart_local_directive(SmaliParser.Restart_local_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#prologue_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrologue_directive(SmaliParser.Prologue_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#epilogue_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpilogue_directive(SmaliParser.Epilogue_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#source_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_directive(SmaliParser.Source_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#instruction_format12x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_format12x(SmaliParser.Instruction_format12xContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#instruction_format22s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_format22s(SmaliParser.Instruction_format22sContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#instruction_format31i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_format31i(SmaliParser.Instruction_format31iContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#instruction_format35c_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_format35c_method(SmaliParser.Instruction_format35c_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(SmaliParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format10t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format10t(SmaliParser.Insn_format10tContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format10x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format10x(SmaliParser.Insn_format10xContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format10x_odex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format10x_odex(SmaliParser.Insn_format10x_odexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format11n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format11n(SmaliParser.Insn_format11nContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format11x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format11x(SmaliParser.Insn_format11xContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format12x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format12x(SmaliParser.Insn_format12xContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format20bc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format20bc(SmaliParser.Insn_format20bcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format20t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format20t(SmaliParser.Insn_format20tContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21c_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21c_field(SmaliParser.Insn_format21c_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21c_field_odex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21c_field_odex(SmaliParser.Insn_format21c_field_odexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21c_method_handle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21c_method_handle(SmaliParser.Insn_format21c_method_handleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21c_method_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21c_method_type(SmaliParser.Insn_format21c_method_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21c_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21c_string(SmaliParser.Insn_format21c_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21c_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21c_type(SmaliParser.Insn_format21c_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21ih}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21ih(SmaliParser.Insn_format21ihContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21lh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21lh(SmaliParser.Insn_format21lhContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21s(SmaliParser.Insn_format21sContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format21t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format21t(SmaliParser.Insn_format21tContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format22b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format22b(SmaliParser.Insn_format22bContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format22c_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format22c_field(SmaliParser.Insn_format22c_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format22c_field_odex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format22c_field_odex(SmaliParser.Insn_format22c_field_odexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format22c_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format22c_type(SmaliParser.Insn_format22c_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format22cs_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format22cs_field(SmaliParser.Insn_format22cs_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format22s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format22s(SmaliParser.Insn_format22sContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format22t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format22t(SmaliParser.Insn_format22tContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format22x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format22x(SmaliParser.Insn_format22xContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format23x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format23x(SmaliParser.Insn_format23xContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format30t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format30t(SmaliParser.Insn_format30tContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format31c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format31c(SmaliParser.Insn_format31cContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format31i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format31i(SmaliParser.Insn_format31iContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format31t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format31t(SmaliParser.Insn_format31tContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format32x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format32x(SmaliParser.Insn_format32xContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format35c_call_site}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format35c_call_site(SmaliParser.Insn_format35c_call_siteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format35c_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format35c_method(SmaliParser.Insn_format35c_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format35c_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format35c_type(SmaliParser.Insn_format35c_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format35c_method_odex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format35c_method_odex(SmaliParser.Insn_format35c_method_odexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format35mi_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format35mi_method(SmaliParser.Insn_format35mi_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format35ms_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format35ms_method(SmaliParser.Insn_format35ms_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format3rc_call_site}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format3rc_call_site(SmaliParser.Insn_format3rc_call_siteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format3rc_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format3rc_method(SmaliParser.Insn_format3rc_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format3rc_method_odex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format3rc_method_odex(SmaliParser.Insn_format3rc_method_odexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format3rc_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format3rc_type(SmaliParser.Insn_format3rc_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format3rmi_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format3rmi_method(SmaliParser.Insn_format3rmi_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format3rms_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format3rms_method(SmaliParser.Insn_format3rms_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format45cc_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format45cc_method(SmaliParser.Insn_format45cc_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format4rcc_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format4rcc_method(SmaliParser.Insn_format4rcc_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_format51l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_format51l(SmaliParser.Insn_format51lContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_array_data_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_array_data_directive(SmaliParser.Insn_array_data_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_packed_switch_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_packed_switch_directive(SmaliParser.Insn_packed_switch_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#insn_sparse_switch_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsn_sparse_switch_directive(SmaliParser.Insn_sparse_switch_directiveContext ctx);
}