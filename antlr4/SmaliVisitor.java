// Generated from ../Smali.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link SmaliParser#smali}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmali(SmaliParser.SmaliContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassAlt}
	 * labeled alternative in {@link SmaliParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAlt(SmaliParser.ClassAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuperAlt}
	 * labeled alternative in {@link SmaliParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperAlt(SmaliParser.SuperAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SourceFileAlt}
	 * labeled alternative in {@link SmaliParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFileAlt(SmaliParser.SourceFileAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImplementsAlt}
	 * labeled alternative in {@link SmaliParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsAlt(SmaliParser.ImplementsAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassAnnotationAlt}
	 * labeled alternative in {@link SmaliParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAnnotationAlt(SmaliParser.ClassAnnotationAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAlt}
	 * labeled alternative in {@link SmaliParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAlt(SmaliParser.FieldAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodAlt}
	 * labeled alternative in {@link SmaliParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodAlt(SmaliParser.MethodAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#classSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSpec(SmaliParser.ClassSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#accessList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessList(SmaliParser.AccessListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#superSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSpec(SmaliParser.SuperSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#sourceSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceSpec(SmaliParser.SourceSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#implementsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsSpec(SmaliParser.ImplementsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SmaliParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#annotation_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_element(SmaliParser.Annotation_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#subannotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubannotation(SmaliParser.SubannotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#simpleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleName(SmaliParser.SimpleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#memberName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberName(SmaliParser.MemberNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongLiteralAlt(SmaliParser.LongLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteralAlt(SmaliParser.IntegerLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortLiteralAlt(SmaliParser.ShortLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ByteLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteLiteralAlt(SmaliParser.ByteLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteralAlt(SmaliParser.FloatLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteralAlt(SmaliParser.DoubleLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteralAlt(SmaliParser.CharLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralAlt(SmaliParser.StringLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralAlt(SmaliParser.BooleanLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteralAlt(SmaliParser.NullLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralAlt(SmaliParser.ArrayLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubAnnotationLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAnnotationLiteralAlt(SmaliParser.SubAnnotationLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLiteralAlt(SmaliParser.TypeLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLiteralAlt(SmaliParser.FieldLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodLiteralAlt(SmaliParser.MethodLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumLiteralAlt(SmaliParser.EnumLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodHandleLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHandleLiteralAlt(SmaliParser.MethodHandleLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodProtoLiteralAlt}
	 * labeled alternative in {@link SmaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodProtoLiteralAlt(SmaliParser.MethodProtoLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SmaliParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(SmaliParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#doubleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(SmaliParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(SmaliParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#typeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLiteral(SmaliParser.TypeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#fieldLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLiteral(SmaliParser.FieldLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#fieldReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldReference(SmaliParser.FieldReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#methodLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodLiteral(SmaliParser.MethodLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(SmaliParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#methodProto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodProto(SmaliParser.MethodProtoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#type_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_descriptor(SmaliParser.Type_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(SmaliParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAlt}
	 * labeled alternative in {@link SmaliParser#paramArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlt(SmaliParser.TypeAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeListAlt}
	 * labeled alternative in {@link SmaliParser#paramArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeListAlt(SmaliParser.TypeListAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PermitiveList}
	 * labeled alternative in {@link SmaliParser#paramArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermitiveList(SmaliParser.PermitiveListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#reference_type_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_type_descriptor(SmaliParser.Reference_type_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#nonvoid_type_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonvoid_type_descriptor(SmaliParser.Nonvoid_type_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#enumLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumLiteral(SmaliParser.EnumLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#methodHandleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHandleLiteral(SmaliParser.MethodHandleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#methodHandleReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHandleReference(SmaliParser.MethodHandleReferenceContext ctx);
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
	 * Visit a parse tree produced by the {@code RegisterAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisterAlt(SmaliParser.RegisterAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CatchAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchAlt(SmaliParser.CatchAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CatchAllAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchAllAlt(SmaliParser.CatchAllAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamterAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamterAlt(SmaliParser.ParamterAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodAnnotationAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodAnnotationAlt(SmaliParser.MethodAnnotationAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LableAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLableAlt(SmaliParser.LableAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineAlt(SmaliParser.LineAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalAlt(SmaliParser.LocalAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndLocalAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndLocalAlt(SmaliParser.EndLocalAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RestartLocalAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestartLocalAlt(SmaliParser.RestartLocalAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrologueAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrologueAlt(SmaliParser.PrologueAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EpilogueAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpilogueAlt(SmaliParser.EpilogueAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SourceAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceAlt(SmaliParser.SourceAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction10tAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction10tAlt(SmaliParser.Instruction10tAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction10xAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction10xAlt(SmaliParser.Instruction10xAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction10xOdexAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction10xOdexAlt(SmaliParser.Instruction10xOdexAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction11nAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction11nAlt(SmaliParser.Instruction11nAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction11xAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction11xAlt(SmaliParser.Instruction11xAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction12xAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction12xAlt(SmaliParser.Instruction12xAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction20bcAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction20bcAlt(SmaliParser.Instruction20bcAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction20tAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction20tAlt(SmaliParser.Instruction20tAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21cFieldAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21cFieldAlt(SmaliParser.Instruction21cFieldAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21cFieldOdexAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21cFieldOdexAlt(SmaliParser.Instruction21cFieldOdexAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21cMethodHandleAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21cMethodHandleAlt(SmaliParser.Instruction21cMethodHandleAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21cMethodAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21cMethodAlt(SmaliParser.Instruction21cMethodAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21cStringAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21cStringAlt(SmaliParser.Instruction21cStringAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21cTypeAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21cTypeAlt(SmaliParser.Instruction21cTypeAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21ihAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21ihAlt(SmaliParser.Instruction21ihAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21lhAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21lhAlt(SmaliParser.Instruction21lhAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21sAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21sAlt(SmaliParser.Instruction21sAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction21tAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction21tAlt(SmaliParser.Instruction21tAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction22bAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction22bAlt(SmaliParser.Instruction22bAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction22cFieldAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction22cFieldAlt(SmaliParser.Instruction22cFieldAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction22cFieldOdexAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction22cFieldOdexAlt(SmaliParser.Instruction22cFieldOdexAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction22cTypeAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction22cTypeAlt(SmaliParser.Instruction22cTypeAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction22csFieldAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction22csFieldAlt(SmaliParser.Instruction22csFieldAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction22sAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction22sAlt(SmaliParser.Instruction22sAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction22tAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction22tAlt(SmaliParser.Instruction22tAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction22xAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction22xAlt(SmaliParser.Instruction22xAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction23xAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction23xAlt(SmaliParser.Instruction23xAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction30tAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction30tAlt(SmaliParser.Instruction30tAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction31cAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction31cAlt(SmaliParser.Instruction31cAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction31iAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction31iAlt(SmaliParser.Instruction31iAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction31tAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction31tAlt(SmaliParser.Instruction31tAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction32xAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction32xAlt(SmaliParser.Instruction32xAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction35cCallsiteAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction35cCallsiteAlt(SmaliParser.Instruction35cCallsiteAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction35cMethodAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction35cMethodAlt(SmaliParser.Instruction35cMethodAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction35cTypeAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction35cTypeAlt(SmaliParser.Instruction35cTypeAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction35cMethodOdexAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction35cMethodOdexAlt(SmaliParser.Instruction35cMethodOdexAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction35miMethodAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction35miMethodAlt(SmaliParser.Instruction35miMethodAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction35msMethodAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction35msMethodAlt(SmaliParser.Instruction35msMethodAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction3rcCallsiteAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction3rcCallsiteAlt(SmaliParser.Instruction3rcCallsiteAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction3rcMethodAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction3rcMethodAlt(SmaliParser.Instruction3rcMethodAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction3rcMethodOdexAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction3rcMethodOdexAlt(SmaliParser.Instruction3rcMethodOdexAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction3rcTypeAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction3rcTypeAlt(SmaliParser.Instruction3rcTypeAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction3rmiMethodAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction3rmiMethodAlt(SmaliParser.Instruction3rmiMethodAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction3rmsMethodAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction3rmsMethodAlt(SmaliParser.Instruction3rmsMethodAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction45ccMethodAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction45ccMethodAlt(SmaliParser.Instruction45ccMethodAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction4rccMethodAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction4rccMethodAlt(SmaliParser.Instruction4rccMethodAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instruction51lAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction51lAlt(SmaliParser.Instruction51lAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstructionArraydataAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionArraydataAlt(SmaliParser.InstructionArraydataAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstructionPackedSwitchAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionPackedSwitchAlt(SmaliParser.InstructionPackedSwitchAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstructionSparseSwitchAlt}
	 * labeled alternative in {@link SmaliParser#statement_or_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionSparseSwitchAlt(SmaliParser.InstructionSparseSwitchAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#registersDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistersDirective(SmaliParser.RegistersDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#catchDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchDirective(SmaliParser.CatchDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#catchallDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchallDirective(SmaliParser.CatchallDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#parameterDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDirective(SmaliParser.ParameterDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#integralLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralLiteral(SmaliParser.IntegralLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#label_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_ref(SmaliParser.Label_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(SmaliParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#lineDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineDirective(SmaliParser.LineDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#localDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDirective(SmaliParser.LocalDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#endLocalDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndLocalDirective(SmaliParser.EndLocalDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#restartLocalDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestartLocalDirective(SmaliParser.RestartLocalDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#sourceDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceDirective(SmaliParser.SourceDirectiveContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link SmaliParser#switchElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchElement(SmaliParser.SwitchElementContext ctx);
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
	 * Visit a parse tree produced by the {@code TypeErrorAlt}
	 * labeled alternative in {@link SmaliParser#verification_error_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeErrorAlt(SmaliParser.TypeErrorAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldErrorAlt}
	 * labeled alternative in {@link SmaliParser#verification_error_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldErrorAlt(SmaliParser.FieldErrorAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodErrotAlt}
	 * labeled alternative in {@link SmaliParser#verification_error_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodErrotAlt(SmaliParser.MethodErrotAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#callsiteReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallsiteReference(SmaliParser.CallsiteReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#fixed32bitLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed32bitLiteral(SmaliParser.Fixed32bitLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmaliParser#fixed64bitLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed64bitLiteral(SmaliParser.Fixed64bitLiteralContext ctx);
}