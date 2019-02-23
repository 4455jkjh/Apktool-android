package com.a4455jkjh.smali;

import com.a4455jkjh.lexer.SmaliBaseVisitor;
import com.a4455jkjh.lexer.SmaliParser;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.AnnotationVisibility;
import org.jf.dexlib2.MethodHandleType;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.VerificationError;
import org.jf.dexlib2.builder.Label;
import org.jf.dexlib2.builder.MethodImplementationBuilder;
import org.jf.dexlib2.builder.SwitchLabelElement;
import org.jf.dexlib2.builder.instruction.BuilderArrayPayload;
import org.jf.dexlib2.builder.instruction.BuilderInstruction10t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction10x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction11n;
import org.jf.dexlib2.builder.instruction.BuilderInstruction11x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction12x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction20bc;
import org.jf.dexlib2.builder.instruction.BuilderInstruction20t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21c;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21ih;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21lh;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21s;
import org.jf.dexlib2.builder.instruction.BuilderInstruction21t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22b;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22c;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22s;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction22x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction23x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction30t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction31c;
import org.jf.dexlib2.builder.instruction.BuilderInstruction31i;
import org.jf.dexlib2.builder.instruction.BuilderInstruction31t;
import org.jf.dexlib2.builder.instruction.BuilderInstruction32x;
import org.jf.dexlib2.builder.instruction.BuilderInstruction35c;
import org.jf.dexlib2.builder.instruction.BuilderInstruction3rc;
import org.jf.dexlib2.builder.instruction.BuilderInstruction45cc;
import org.jf.dexlib2.builder.instruction.BuilderInstruction4rcc;
import org.jf.dexlib2.builder.instruction.BuilderInstruction51l;
import org.jf.dexlib2.builder.instruction.BuilderPackedSwitchPayload;
import org.jf.dexlib2.builder.instruction.BuilderSparseSwitchPayload;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.MethodParameter;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.dexlib2.immutable.ImmutableAnnotation;
import org.jf.dexlib2.immutable.ImmutableAnnotationElement;
import org.jf.dexlib2.immutable.ImmutableClassDef;
import org.jf.dexlib2.immutable.ImmutableField;
import org.jf.dexlib2.immutable.ImmutableMethod;
import org.jf.dexlib2.immutable.ImmutableMethodImplementation;
import org.jf.dexlib2.immutable.ImmutableMethodParameter;
import org.jf.dexlib2.immutable.reference.ImmutableCallSiteReference;
import org.jf.dexlib2.immutable.reference.ImmutableFieldReference;
import org.jf.dexlib2.immutable.reference.ImmutableMethodHandleReference;
import org.jf.dexlib2.immutable.reference.ImmutableMethodProtoReference;
import org.jf.dexlib2.immutable.reference.ImmutableMethodReference;
import org.jf.dexlib2.immutable.reference.ImmutableReference;
import org.jf.dexlib2.immutable.reference.ImmutableStringReference;
import org.jf.dexlib2.immutable.reference.ImmutableTypeReference;
import org.jf.dexlib2.immutable.value.ImmutableAnnotationEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableArrayEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableBooleanEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableByteEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableCharEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableDoubleEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableEnumEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableFieldEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableFloatEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableIntEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableLongEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableMethodEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableMethodHandleEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableMethodTypeEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableNullEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableShortEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableStringEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableTypeEncodedValue;
import org.jf.dexlib2.util.FieldUtil;
import org.jf.dexlib2.util.MethodUtil;

import static com.a4455jkjh.lexer.SmaliParser.*;

public class SmaliBuilder extends SmaliBaseVisitor<Object> {
	private final Opcodes opcodes = Opcodes.forApi(14);
	private CommonTokenStream tks;
	private static final ThreadLocal<SmaliBuilder> INSTANCE = new ThreadLocal<>();
	private SmaliBuilder() {}
	private static SmaliBuilder getBuilder(CommonTokenStream tks){
		SmaliBuilder b = INSTANCE.get();
		if(b==null){
			b = new SmaliBuilder();
			INSTANCE.set(b);
		}
		b.tks=tks;
		return b;
	}
	public static ClassDef build(SmaliParser.Smali_fileContext smali, CommonTokenStream tks) {
		return getBuilder(tks).visitSmali_file(smali);
	}
	public static void main(String[] args){}
	@Override
	public ImmutableClassDef visitSmali_file(SmaliParser.Smali_fileContext ctx) {
		SmaliParser.Class_specContext class_spec = ctx.class_spec(0);
		String type = visitClass_spec(class_spec);
		String superType = visitSuper_spec(ctx.super_spec(0));
		String sourceFile = visitSource_spec(ctx.source_spec(0));
		int accessFlags = visitAccess_list(class_spec.access_list());
		ImmutableList.Builder<String> interfaces = new ImmutableList.Builder<String>();
		for (SmaliParser.Implements_specContext impl : ctx.implements_spec())
			interfaces.add(visitImplements_spec(impl));
		ImmutableSet.Builder<ImmutableAnnotation> annotations = new ImmutableSet.Builder<>();
		for (SmaliParser.AnnotationContext a : ctx.annotation())
			annotations.add(visitAnnotation(a));
		ImmutableSortedSet.Builder<ImmutableField> staticFields = new ImmutableSortedSet.Builder<ImmutableField>(Ordering.natural());
		ImmutableSortedSet.Builder<ImmutableField> instanceFields = new ImmutableSortedSet.Builder<ImmutableField>(Ordering.natural());
		for (SmaliParser.FieldContext field : ctx.field()) {
			field.defClass = type;
			ImmutableField field1 = visitField((field));
			if (FieldUtil.isStatic(field1))
				staticFields.add(field1);
			else
				instanceFields.add(field1);
		}
		ImmutableSortedSet.Builder<ImmutableMethod> directMethods = new ImmutableSortedSet.Builder<ImmutableMethod>(Ordering.natural());
		ImmutableSortedSet.Builder<ImmutableMethod> virtualMethods = new ImmutableSortedSet.Builder<ImmutableMethod>(Ordering.natural());
		for (SmaliParser.MethodContext method : ctx.method()) {
			method.defClass = type;
			ImmutableMethod method1 = visitMethod((method));
			if (MethodUtil.isDirect(method1))
				directMethods.add(method1);
			else
				virtualMethods.add(method1);
		}
		return new ImmutableClassDef(type,
									 accessFlags,
									 superType,
									 interfaces.build(),
									 sourceFile,
									 annotations.build(),
									 staticFields.build(),
									 instanceFields.build(),
									 directMethods.build(),
									 virtualMethods.build());
	}

	@Override
	public String visitClass_spec(SmaliParser.Class_specContext ctx) {
		return ctx.CLASS_DESCRIPTOR().getText();
	}

	@Override
	public String visitSuper_spec(SmaliParser.Super_specContext ctx) {
		if (ctx == null)
			return null;
		return ctx.CLASS_DESCRIPTOR().getText();
	}

	@Override
	public String visitSource_spec(SmaliParser.Source_specContext ctx) {
		if (ctx == null)
			return null;
		return parse(ctx.STRING_LITERAL().getText());
	}

	@Override
	public String visitImplements_spec(SmaliParser.Implements_specContext ctx) {
		return ctx.CLASS_DESCRIPTOR().getText();
	}

	@Override
	public Integer visitAccess_list(SmaliParser.Access_listContext ctx) {
		int flag = 0;
		for (TerminalNode node : ctx.ACCESS_SPEC())
			flag |= AccessFlags.getAccessFlag(node.getText()).getValue();
		return Integer.valueOf(flag);
	}

	@Override
	public ImmutableAnnotation visitAnnotation(SmaliParser.AnnotationContext ctx) {
		int visibility = AnnotationVisibility.getVisibility(ctx.ANNOTATION_VISIBILITY().getText());
		String type = ctx.CLASS_DESCRIPTOR().getText();
		ImmutableSet.Builder<ImmutableAnnotationElement> elements = new ImmutableSet.Builder<ImmutableAnnotationElement>();
		for (SmaliParser.Annotation_elementContext e : ctx.annotation_element())
			elements.add(visitAnnotation_element(e));
		return new ImmutableAnnotation(visibility, type, elements.build());
	}

	@Override
	public ImmutableAnnotationElement visitAnnotation_element(SmaliParser.Annotation_elementContext ctx) {
		String name = tks.getText(ctx.simple_name());
		return new ImmutableAnnotationElement(name, visitLiteral(ctx.literal()));
	}

	@Override
	public ImmutableEncodedValue visitLiteral(SmaliParser.LiteralContext ctx) {
		if(ctx == null)
			return null;
		if (ctx.LONG_LITERAL() != null) {
			long v = LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
			return new ImmutableLongEncodedValue(v);
		}
		if (ctx.SHORT_LITERAL() != null) {
			short v = LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
			return new ImmutableShortEncodedValue(v);
		}
		if (ctx.BYTE_LITERAL() != null) {
			byte v = LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
			return new ImmutableByteEncodedValue(v);
		}
		if (ctx.BOOL_LITERAL() != null) {
			if (Boolean.parseBoolean(ctx.BOOL_LITERAL().getText()))
				return ImmutableBooleanEncodedValue.TRUE_VALUE;
			else
				return ImmutableBooleanEncodedValue.FALSE_VALUE;
		}
		if (ctx.integer_literal() != null) {
			return visitInteger_literal(ctx.integer_literal());
		}
		if (ctx.float_literal() != null) {
			float v = LiteralTools.parseFloat(tks.getText(ctx.float_literal()));
			return new ImmutableFloatEncodedValue(v);
		}
		if (ctx.double_literal() != null) {
			double v = LiteralTools.parseDouble(tks.getText(ctx.double_literal()));
			return new ImmutableDoubleEncodedValue(v);
		}
		if (ctx.CHAR_LITERAL() != null) {
			char ch = parse(ctx.CHAR_LITERAL().getText()).charAt(0);
			return new ImmutableCharEncodedValue(ch);
		}
		if (ctx.STRING_LITERAL() != null) {
			return new ImmutableStringEncodedValue(parse(ctx.STRING_LITERAL().getText()));
		}
		if (ctx.NULL_LITERAL() != null)
			return ImmutableNullEncodedValue.INSTANCE;
		if (ctx.array_literal() != null)
			return visitArray_literal(ctx.array_literal());
		if (ctx.enum_literal() != null)
			return visitEnum_literal(ctx.enum_literal());
		if (ctx.subannotation() != null)
			return visitSubannotation(ctx.subannotation());
		if (ctx.type_field_method_literal() != null) {
			return visitType_field_method_literal(ctx.type_field_method_literal());
		}
		if (ctx.method_prototype() != null)
			return new ImmutableMethodTypeEncodedValue(visitMethod_prototype(ctx.method_prototype()));
		if (ctx.method_handle_literal() != null)
			return visitMethod_handle_literal(ctx.method_handle_literal());
		return null;
	}

	@Override
	public ImmutableIntEncodedValue visitInteger_literal(SmaliParser.Integer_literalContext ctx) {
		int val = 0;
		if (ctx.POSITIVE_INTEGER_LITERAL() != null)
			val = LiteralTools.parseInt(ctx.POSITIVE_INTEGER_LITERAL().getText());
		else
			val = LiteralTools.parseInt(ctx.NEGATIVE_INTEGER_LITERAL().getText());
		return new ImmutableIntEncodedValue(val);
	}

	@Override
	public ImmutableMethodHandleEncodedValue visitMethod_handle_literal(SmaliParser.Method_handle_literalContext ctx) {
		return new ImmutableMethodHandleEncodedValue(
			visitMethod_handle_reference(ctx.method_handle_reference())
		);
	}

	@Override
	public ImmutableEncodedValue visitType_field_method_literal(SmaliParser.Type_field_method_literalContext ctx) {
		if (ctx.VOID_TYPE() != null)
			return new ImmutableTypeEncodedValue("V");
		if (ctx.PARAM_LIST_ID_OR_PRIMITIVE_TYPE() != null)
			return new ImmutableTypeEncodedValue(ctx.PARAM_LIST_ID_OR_PRIMITIVE_TYPE().getText());
		String type = tks.getText(ctx.reference_type_descriptor());
		if (ctx.member_name() != null) {
			String name = tks.getText(ctx.member_name());
			if (ctx.COLON() != null) {
				ImmutableFieldReference ref = new ImmutableFieldReference(type, name, visitNonvoid_type_descriptor(ctx.nonvoid_type_descriptor()).getType());
				return new ImmutableFieldEncodedValue(ref);
			}
			ImmutableMethodProtoReference ref1 = visitMethod_prototype(ctx.method_prototype());
			ImmutableMethodReference ref = new ImmutableMethodReference(type, name, ref1.getParameterTypes(), ref1.getReturnType());
			return new ImmutableMethodEncodedValue(ref);
		}
		return new ImmutableTypeEncodedValue(type);
	}

	@Override
	public ImmutableMethodProtoReference visitMethod_prototype(SmaliParser.Method_prototypeContext ctx) {
		ImmutableList.Builder<CharSequence> list = new ImmutableList.Builder<>();
		if (ctx.paramList() != null) {
			String text = tks.getText(ctx.paramList());
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
		return new ImmutableMethodProtoReference(list.build(), ctx.type_descriptor().getChild(0).getText());
	}

	@Override
	public ImmutableEncodedValue visitArray_literal(SmaliParser.Array_literalContext ctx) {
		ImmutableList.Builder<ImmutableEncodedValue> values = new ImmutableList.Builder<ImmutableEncodedValue>();
		for (SmaliParser.LiteralContext l : ctx.literal())
			values.add(visitLiteral(l));
		return new ImmutableArrayEncodedValue(values.build());
	}

	@Override
	public ImmutableEncodedValue visitEnum_literal(SmaliParser.Enum_literalContext ctx) {
		return new ImmutableEnumEncodedValue(visitField_reference(ctx.field_reference()));
	}

	@Override
	public ImmutableFieldReference visitField_reference(SmaliParser.Field_referenceContext ctx) {
		return new ImmutableFieldReference(ctx.defClass.getText(), ctx.name.start.getText(), ctx.type.getText());
	}

	@Override
	public ImmutableEncodedValue visitSubannotation(SmaliParser.SubannotationContext ctx) {
		ImmutableSet.Builder<ImmutableAnnotationElement> elements = new ImmutableSet.Builder<ImmutableAnnotationElement>();
		for (SmaliParser.Annotation_elementContext e : ctx.annotation_element())
			elements.add(visitAnnotation_element(e));
		return new ImmutableAnnotationEncodedValue(ctx.CLASS_DESCRIPTOR().getText(), elements.build());
	}

	@Override
	public ImmutableField visitField(SmaliParser.FieldContext ctx) {
		String name = tks.getText(ctx.member_name());
		String type = visitNonvoid_type_descriptor(ctx.nonvoid_type_descriptor()).getType();
		int flags = visitAccess_list(ctx.access_list());
		ImmutableSet.Builder<ImmutableAnnotation> annotations = new ImmutableSet.Builder<>();
		for (SmaliParser.AnnotationContext a : ctx.annotation())
			annotations.add(visitAnnotation(a));
		ImmutableEncodedValue value = visitLiteral(ctx.literal());
		return new ImmutableField(ctx.defClass, name, type, flags, value, annotations.build());
	}

	@Override
	public ImmutableMethod visitMethod(SmaliParser.MethodContext ctx) {
		String name = ctx.name.getText();
		int access = visitAccess_list(ctx.access_list());
		ImmutableSet.Builder<ImmutableAnnotation> annotations = new ImmutableSet.Builder<>();
		for (SmaliParser.AnnotationContext a : ctx.statements_and_directives().annotation())
			annotations.add(visitAnnotation(a));
		ImmutableMethodProtoReference proto = visitMethod_prototype(ctx.method_prototype());
		String returnType = proto.getReturnType();
		List<ImmutableMethodParameter> paramters = new LinkedList<>();
		boolean isStatic = (access & AccessFlags.STATIC.getValue()) > 0;
		bindParamaters(paramters, proto.getParameterTypes(), ctx.statements_and_directives().
					   parameter_directive(),
					   isStatic);
		MethodImplementation impl;
		int size = MethodUtil.getParameterRegisterCount(proto.getParameterTypes(), isStatic);
		if ((access & (AccessFlags.ABSTRACT.getValue() | AccessFlags.NATIVE.getValue())) > 0)
			impl = null;
		else
			impl = buildImplemention(ctx.statements_and_directives(), size);
		return new ImmutableMethod(ctx.defClass,
								   name,
								   paramters,
								   returnType,
								   access,
								   annotations.build(),
								   ImmutableMethodImplementation.of(impl));
	}

	private MethodImplementation buildImplemention(SmaliParser.Statements_and_directivesContext statements_and_directives, int paramCount) {
		short count = 0;
		SmaliParser.Registers_directiveContext register = statements_and_directives.registers_directive(0);
		SmaliParser.Integral_literalContext integral;
		boolean isLocal;
		if (register.regCount != null) {
			integral = register.regCount;
			isLocal = false;
		} else {
			integral = register.regCount2;
			isLocal = true;
		}
		long val = visitIntegral_literal(integral).longValue();
		LiteralTools.checkShort(val);
		count = (short) val;
		if (isLocal)
			count += paramCount;
		MethodImplementationBuilder builder = new MethodImplementationBuilder(count);
		int locals = count - paramCount;
		for (SmaliParser.Ordered_method_itemContext orderd : statements_and_directives.ordered_method_item())
			addLabelOrInstruction(builder, orderd, locals);
		for (SmaliParser.Catch_directiveContext catch_directive : statements_and_directives.catch_directive())
			addCatch(catch_directive, builder);
		for (SmaliParser.Catchall_directiveContext catchall_directive : statements_and_directives.catchall_directive())
			addCatch(catchall_directive, builder);
		return builder.getMethodImplementation();
	}

	private void addCatch(SmaliParser.Catchall_directiveContext catchall_directive, MethodImplementationBuilder builder) {
		Label from = builder.getLabel(visitLabel_ref(catchall_directive.from));
		Label to = builder.getLabel(visitLabel_ref(catchall_directive.to));
		Label handle;
		if (catchall_directive.handle == null)
			handle = null;
		else
			handle = builder.getLabel(visitLabel_ref(catchall_directive.handle));
		builder.addCatch(from, to, handle);
	}

	private void addCatch(SmaliParser.Catch_directiveContext catch_directive, MethodImplementationBuilder builder) {
		ImmutableTypeReference type = visitNonvoid_type_descriptor(catch_directive.nonvoid_type_descriptor());
		Label from = builder.getLabel(visitLabel_ref(catch_directive.from));
		Label to = builder.getLabel(visitLabel_ref(catch_directive.to));
		Label handle;
		if (catch_directive.handle == null)
			handle = null;
		else
			handle = builder.getLabel(visitLabel_ref(catch_directive.handle));
		builder.addCatch(type, from, to, handle);
	}

	private void addLabelOrInstruction(MethodImplementationBuilder builder, SmaliParser.Ordered_method_itemContext orderd, int locals) {
		if (addLabel(builder, orderd.label()))
			return;
		if (addInstruction(builder, orderd.instruction(), locals))
			return;
		addDebug(builder, orderd.debug_directive(), locals);
	}

	private void addDebug(MethodImplementationBuilder builder, SmaliParser.Debug_directiveContext debug_directive, int locals) {
		if (debug_directive.prologue_directive() != null) {
			builder.addPrologue();
			return;
		}
		if (debug_directive.epilogue_directive() != null) {
			builder.addEpilogue();
			return;
		}
		if (addLine(debug_directive.line_directive(), builder))
			return;
		if (addStartLocal(debug_directive.local_directive(), builder, locals))
			return;
		if (addEndLocal(debug_directive.end_local_directive(), builder, locals))
			return;
		if (addRestartLocal(debug_directive.restart_local_directive(), builder, locals))
			return;
		addSource(debug_directive.source_directive(), builder);
	}

	private void addSource(SmaliParser.Source_directiveContext source_directive, MethodImplementationBuilder builder) {
		String source = parse(source_directive.file.getText());
		builder.addSetSourceFile(new ImmutableStringReference(source));
	}

	private boolean addRestartLocal(SmaliParser.Restart_local_directiveContext restart_local_directive, MethodImplementationBuilder builder, int locals) {
		if (restart_local_directive == null)
			return false;
		int reg = getRegister(restart_local_directive.reg, locals);
		builder.addRestartLocal(reg);
		return true;
	}

	private boolean addEndLocal(SmaliParser.End_local_directiveContext end_local_directive, MethodImplementationBuilder builder, int locals) {
		if (end_local_directive == null)
			return false;
		int reg = getRegister(end_local_directive.reg, locals);
		builder.addEndLocal(reg);
		return true;
	}

	private boolean addStartLocal(SmaliParser.Local_directiveContext local_directive, MethodImplementationBuilder builder, int locals) {
		if (local_directive == null)
			return false;
		int reg = getRegister(local_directive.reg, locals);
		StringReference name;
		if (local_directive.name == null)
			name = null;
		else
			name = new ImmutableStringReference(parse(local_directive.name.getText()));
		TypeReference type;
		if (local_directive.type == null)
			type = new ImmutableTypeReference("V");
		else
			type = new ImmutableTypeReference(local_directive.type.getText());
		StringReference signtuare = null;
		if (local_directive.signature != null)
			signtuare = new ImmutableStringReference(parse(local_directive.signature.getText()));
		builder.addStartLocal(reg, name, type, signtuare);
		return true;
	}

	private boolean addLine(SmaliParser.Line_directiveContext line_directive, MethodImplementationBuilder builder) {
		if (line_directive == null)
			return false;
		int line = visitIntegral_literal(line_directive.integral_literal()).intValue();
		builder.addLineNumber(line);
		return true;
	}

	private boolean addLabel(MethodImplementationBuilder builder, SmaliParser.LabelContext label) {
		if (label == null)
			return false;
		String text = label.name.getText();
		builder.addLabel(text);
		return true;
	}

	private boolean addInstruction(MethodImplementationBuilder builder, SmaliParser.InstructionContext instruction1, int locals) {
		if (instruction1 == null)
			return false;
		ParserRuleContext instruction = (ParserRuleContext) instruction1.getChild(0);
		switch (instruction.getRuleIndex()) {
			case RULE_insn_format10t:
				addInstruction(builder, (SmaliParser.Insn_format10tContext)instruction);
				break;
			case RULE_insn_format10x:
				addInstruction(builder, (SmaliParser.Insn_format10xContext)instruction);
				break;
			case RULE_insn_format11n:
				addInstruction(builder, (SmaliParser.Insn_format11nContext)instruction, locals);
				break;
			case RULE_insn_format11x:
				addInstruction(builder, (SmaliParser.Insn_format11xContext)instruction, locals);
				break;
			case RULE_insn_format12x:
				addInstruction(builder, (SmaliParser.Insn_format12xContext)instruction, locals);
				break;
			case RULE_insn_format20bc:
				addInstruction(builder, (SmaliParser.Insn_format20bcContext)instruction);
				break;
			case RULE_insn_format20t:
				addInstruction(builder, (SmaliParser.Insn_format20tContext)instruction);
				break;
			case RULE_insn_format21c_field:
				addInstruction(builder, (SmaliParser.Insn_format21c_fieldContext)instruction, locals);
				break;
			case RULE_insn_format21c_method_handle:
				addInstruction(builder, (SmaliParser.Insn_format21c_method_handleContext)instruction, locals);
				break;
			case RULE_insn_format21c_method_type:
				addInstruction(builder, (SmaliParser.Insn_format21c_method_typeContext)instruction, locals);
				break;
			case RULE_insn_format21c_string:
				addInstruction(builder, (SmaliParser.Insn_format21c_stringContext)instruction, locals);
				break;
			case RULE_insn_format21c_type:
				addInstruction(builder, (SmaliParser.Insn_format21c_typeContext)instruction, locals);
				break;
			case RULE_insn_format21ih:
				addInstruction(builder, (SmaliParser.Insn_format21ihContext)instruction, locals);
				break;
			case RULE_insn_format21lh:
				addInstruction(builder, (SmaliParser.Insn_format21lhContext)instruction, locals);
				break;
			case RULE_insn_format21s:
				addInstruction(builder, (SmaliParser.Insn_format21sContext)instruction, locals);
				break;
			case RULE_insn_format21t:
				addInstruction(builder, (SmaliParser.Insn_format21tContext)instruction, locals);
				break;
			case RULE_insn_format22b:
				addInstruction(builder, (SmaliParser.Insn_format22bContext)instruction, locals);
				break;
			case RULE_insn_format22c_field:
				addInstruction(builder, (SmaliParser.Insn_format22c_fieldContext)instruction, locals);
				break;
			case RULE_insn_format22c_type:
				addInstruction(builder, (SmaliParser.Insn_format22c_typeContext)instruction, locals);
				break;
			case RULE_insn_format22s:
				addInstruction(builder, (SmaliParser.Insn_format22sContext)instruction, locals);
				break;
			case RULE_insn_format22t:
				addInstruction(builder, (SmaliParser.Insn_format22tContext)instruction, locals);
				break;
			case RULE_insn_format22x:
				addInstruction(builder, (SmaliParser.Insn_format22xContext)instruction, locals);
				break;
			case RULE_insn_format23x:
				addInstruction(builder, (SmaliParser.Insn_format23xContext)instruction, locals);
				break;
			case RULE_insn_format30t:
				addInstruction(builder, (SmaliParser.Insn_format30tContext)instruction);
				break;
			case RULE_insn_format31c:
				addInstruction(builder, (SmaliParser.Insn_format31cContext)instruction, locals);
				break;
			case RULE_insn_format31i:
				addInstruction(builder, (SmaliParser.Insn_format31iContext)instruction, locals);
				break;
			case RULE_insn_format31t:
				addInstruction(builder, (SmaliParser.Insn_format31tContext)instruction, locals);
				break;
			case RULE_insn_format32x:
				addInstruction(builder, (SmaliParser.Insn_format32xContext)instruction, locals);
				break;
			case RULE_insn_format35c_call_site:
				addInstruction(builder, (SmaliParser.Insn_format35c_call_siteContext)instruction, locals);
				break;
			case RULE_insn_format35c_method:
				addInstruction(builder, (SmaliParser.Insn_format35c_methodContext)instruction, locals);
				break;
			case RULE_insn_format35c_type:
				addInstruction(builder, (SmaliParser.Insn_format35c_typeContext)instruction, locals);
				break;
			case RULE_insn_format3rc_call_site:
				addInstruction(builder, (SmaliParser.Insn_format3rc_call_siteContext)instruction, locals);
				break;
			case RULE_insn_format3rc_method:
				addInstruction(builder, (SmaliParser.Insn_format3rc_methodContext)instruction, locals);
				break;
			case RULE_insn_format3rc_type:
				addInstruction(builder, (SmaliParser.Insn_format3rc_typeContext)instruction, locals);
				break;
			case RULE_insn_format45cc_method:
				addInstruction(builder, (SmaliParser.Insn_format45cc_methodContext)instruction, locals);
				break;
			case RULE_insn_format4rcc_method:
				addInstruction(builder, (SmaliParser.Insn_format4rcc_methodContext)instruction, locals);
				break;
			case RULE_insn_format51l:
				addInstruction(builder, (SmaliParser.Insn_format51lContext)instruction, locals);
				break;
			case RULE_insn_array_data_directive:
				addInstruction(builder, (SmaliParser.Insn_array_data_directiveContext)instruction);
				break;
			case RULE_insn_packed_switch_directive:
				addInstruction(builder, (SmaliParser.Insn_packed_switch_directiveContext)instruction);
				break;
			case RULE_insn_sparse_switch_directive:
				addInstruction(builder, (SmaliParser.Insn_sparse_switch_directiveContext)instruction);
				break;
			default:
				System.out.println("Unknown Instruction:" + SmaliParser.ruleNames[instruction.getRuleIndex()]);
		}
		return true;
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_sparse_switch_directiveContext instruction) {
		ImmutableList.Builder<SwitchLabelElement> elements = new ImmutableList.Builder<>();
		List<SmaliParser.Fixed_32bit_literalContext> keys = instruction.fixed_32bit_literal();
		List<SmaliParser.Label_refContext> targets = instruction.label_ref();
		int s = keys.size();
		for (int i =0;i < s;i++) {
			elements.add(
				new SwitchLabelElement(
					visitFixed_32bit_literal(keys.get(i)).intValue(),
					builder.getLabel(visitLabel_ref(targets.get(i)))
				)
			);
		}
		builder.addInstruction(
			new BuilderSparseSwitchPayload(elements.build())
		);
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_packed_switch_directiveContext instruction) {
		int start = visitFixed_32bit_literal(instruction.fixed_32bit_literal()).intValue();
		ImmutableList.Builder<Label> labels = new ImmutableList.Builder<Label>();
		for (SmaliParser.Label_refContext l : instruction.label_ref())
			labels.add(builder.getLabel(visitLabel_ref(l)));
		builder.addInstruction(
			new BuilderPackedSwitchPayload(start, labels.build())
		);
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_array_data_directiveContext instruction) {
		int width = visitParsed_integer_literal(instruction.parsed_integer_literal()).intValue();
		ImmutableList.Builder<Number> numbers = new ImmutableList.Builder<Number>();
		for (SmaliParser.Fixed_literalContext l : instruction.fixed_literal())
			numbers.add(visitFixed_literal(l));
		builder.addInstruction(
			new BuilderArrayPayload(width, numbers.build())
		);
	}

	@Override
	public Integer visitParsed_integer_literal(SmaliParser.Parsed_integer_literalContext ctx) {
		return LiteralTools.parseInt(ctx.integer_literal().getText());
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format51lContext instruction, int locals) {
		Opcode opcode = Opcode.CONST_WIDE;
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		long litreal = visitFixed_literal(instruction.fixed_literal()).longValue();
		builder.addInstruction(
			new BuilderInstruction51l(
				opcode, reg, litreal
			)
		);
	}

	@Override
	public Number visitFixed_literal(SmaliParser.Fixed_literalContext ctx) {
		Number val = 0;
		if (ctx != null) {
			if (ctx.LONG_LITERAL() != null) 
				val = LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
			else if (ctx.SHORT_LITERAL() != null) 
				val = LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
			else if (ctx.BYTE_LITERAL() != null) 
				val = LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
			else if (ctx.integer_literal() != null)
				val = LiteralTools.parseInt(ctx.integer_literal().getText());
			else if (ctx.CHAR_LITERAL() != null)
				val = (int)parse(ctx.CHAR_LITERAL().getText()).charAt(0);
			else if (ctx.double_literal() != null)
				val = LiteralTools.parseDouble(ctx.double_literal().getText());
			else if (ctx.float_literal() != null)
				val = LiteralTools.parseFloat(ctx.float_literal().getText());
			else if (ctx.BOOL_LITERAL() != null) {
				if (Boolean.parseBoolean(ctx.BOOL_LITERAL().getText()))
					val = 1;
				else
					val = 0;
			}
		}
		return val;
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format4rcc_methodContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT4rcc_METHOD().getText());
		int[] range = visitRegister_range(instruction.register_range(), locals);
		builder.addInstruction(new BuilderInstruction4rcc(opcode,
														  range[0],
														  range[1],
														  visitMethod_reference(
															  instruction.method_reference()
														  ),
														  visitMethod_prototype(
															  instruction.method_prototype()
														  )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format45cc_methodContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT45cc_METHOD().getText());
		int[] registers = visitRegister_list(instruction.register_list(), locals);
		builder.addInstruction(new BuilderInstruction45cc(opcode,
														  registers[5],
														  registers[0],
														  registers[1],
														  registers[2],
														  registers[3],
														  registers[4],
														  visitMethod_reference(
															  instruction.method_reference()
														  ),
														  visitMethod_prototype(
															  instruction.method_prototype()
														  )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format3rc_typeContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT3rc_TYPE().getText());
		int[] range = visitRegister_range(instruction.register_range(), locals);
		builder.addInstruction(new BuilderInstruction3rc(opcode,
														 range[0],
														 range[1],
														 visitNonvoid_type_descriptor(
															 instruction.nonvoid_type_descriptor()
														 )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format3rc_methodContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT3rc_METHOD().getText());
		int[] range = visitRegister_range(instruction.register_range(), locals);
		builder.addInstruction(new BuilderInstruction3rc(opcode,
														 range[0],
														 range[1],
														 visitMethod_reference(
															 instruction.method_reference()
														 )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format3rc_call_siteContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT3rc_CALL_SITE().getText());
		int[] range = visitRegister_range(instruction.register_range(), locals);
		builder.addInstruction(new BuilderInstruction3rc(opcode,
														 range[0],
														 range[1],
														 visitCall_site_reference(
															 instruction.call_site_reference()
														 )));
	}

	public int[] visitRegister_range(SmaliParser.Register_rangeContext ctx, int locals) {
		int start = getRegister(ctx.startreg, locals);
		int end = getRegister(ctx.endreg, locals);
		return new int[]{start, end - start + 1} ;
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format35c_typeContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT35c_TYPE().getText());
		int[] list = visitRegister_list(instruction.register_list(), locals);
		builder.addInstruction(new BuilderInstruction35c(opcode,
														 list[5],
														 list[0],
														 list[1],
														 list[2],
														 list[3],
														 list[4],
														 visitNonvoid_type_descriptor(
															 instruction.nonvoid_type_descriptor()
														 )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format35c_methodContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.instruction_format35c_method().getText());
		int[] registers = visitRegister_list(instruction.register_list(), locals);
		builder.addInstruction(new BuilderInstruction35c(opcode,
														 registers[5],
														 registers[0],
														 registers[1],
														 registers[2],
														 registers[3],
														 registers[4],
														 visitMethod_reference(
															 instruction.method_reference()
														 )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format35c_call_siteContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT35c_CALL_SITE().getText());
		int[] registers = visitRegister_list(instruction.register_list(), locals);
		builder.addInstruction(new BuilderInstruction35c(opcode,
														 registers[5],
														 registers[0],
														 registers[1],
														 registers[2],
														 registers[3],
														 registers[4],
														 visitCall_site_reference(
															 instruction.call_site_reference()
														 )));
	}

	@Override
	public Reference visitCall_site_reference(SmaliParser.Call_site_referenceContext ctx) {
		String name = ctx.simple_name().getText();
		String methodName = parse(ctx.STRING_LITERAL().getText());
		ImmutableMethodProtoReference proto = visitMethod_prototype(ctx.method_prototype());
		ImmutableMethodReference method = visitMethod_reference(ctx.method_reference());
		ImmutableMethodHandleReference handle = new ImmutableMethodHandleReference(MethodHandleType.INVOKE_STATIC, method);
		ImmutableList.Builder<ImmutableEncodedValue> args = new ImmutableList.Builder<ImmutableEncodedValue>();
		for (SmaliParser.LiteralContext litreal : ctx.literal())
			args.add(visitLiteral(litreal));
		return new ImmutableCallSiteReference(name,
											  handle,
											  methodName,
											  proto,
											  args.build());
	}

	public int[] visitRegister_list(SmaliParser.Register_listContext ctx, int locals) {
		int[] registers = new int[6];
		int i = 0;
		if (ctx != null)
			for (TerminalNode node : ctx.REGISTER()) {
				registers[i++] = getRegister(node.getSymbol(), locals);
			}
		registers[5] = i;
		return registers;
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format32xContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT32x().getText());
		int reg1 = getRegister(instruction.REGISTER(0).getSymbol(), locals);
		int reg2 = getRegister(instruction.REGISTER(1).getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction32x(opcode, reg1, reg2));
	}


	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format31tContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT31t().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction31t(opcode, reg,
									  builder.getLabel(
										  visitLabel_ref(instruction.label_ref())
									  )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format31iContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.instruction_format31i().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction31i(opcode, reg,
									  visitFixed_32bit_literal(
										  instruction.fixed_32bit_literal()).
									  intValue()));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format31cContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT31c().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction31c(opcode, reg,
									  new ImmutableStringReference(
										  parse(instruction.
												STRING_LITERAL().getText())
									  )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format30tContext instruction) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT30t().getText());
		builder.addInstruction(
			new BuilderInstruction30t(opcode,
									  builder.getLabel(
										  visitLabel_ref(instruction.label_ref())
									  )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format23xContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT23x().getText());
		int reg1 = getRegister(instruction.REGISTER(0).getSymbol(), locals);
		int reg2 = getRegister(instruction.REGISTER(1).getSymbol(), locals);
		int reg3 = getRegister(instruction.REGISTER(2).getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction23x(opcode, reg1, reg2, reg3));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format22xContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT22x().getText());
		int reg1 = getRegister(instruction.REGISTER(0).getSymbol(), locals);
		int reg2 = getRegister(instruction.REGISTER(1).getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction22x(opcode, reg1, reg2));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format22tContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT22t().getText());
		int reg1 = getRegister(instruction.REGISTER(0).getSymbol(), locals);
		int reg2 = getRegister(instruction.REGISTER(1).getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction22t(opcode, reg1, reg2,
									  builder.getLabel(
										  visitLabel_ref(instruction.label_ref())
									  )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format22sContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.instruction_format22s().getText());
		int reg1 = getRegister(instruction.REGISTER(0).getSymbol(), locals);
		int reg2 = getRegister(instruction.REGISTER(1).getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction22s(opcode, reg1, reg2,
									  visitIntegral_literal(
										  instruction.integral_literal()).
									  intValue()));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format22c_typeContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT22c_TYPE().getText());
		int reg1 = getRegister(instruction.REGISTER(0).getSymbol(), locals);
		int reg2 = getRegister(instruction.REGISTER(1).getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction22c(opcode, reg1, reg2,
									  visitNonvoid_type_descriptor(
										  instruction.nonvoid_type_descriptor()
									  )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format22c_fieldContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT22c_FIELD().getText());
		int reg1 = getRegister(instruction.REGISTER(0).getSymbol(), locals);
		int reg2 = getRegister(instruction.REGISTER(1).getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction22c(opcode, reg1, reg2,
									  visitField_reference(
										  instruction.field_reference()
									  )));
	}

	@Override
	public ImmutableTypeReference visitNonvoid_type_descriptor(SmaliParser.Nonvoid_type_descriptorContext ctx) {
		return new ImmutableTypeReference(ctx.getText());
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format22bContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT22b().getText());
		int reg1 = getRegister(instruction.REGISTER(0).getSymbol(), locals);
		int reg2 = getRegister(instruction.REGISTER(1).getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction22b(opcode, reg1, reg2,
									  visitIntegral_literal(
										  instruction.integral_literal()).
									  intValue()));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format21tContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT21t().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction21t(opcode, reg,
									  builder.getLabel(
										  visitLabel_ref(instruction.label_ref())
									  )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format21sContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT21s().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction21s(opcode, reg,
									  visitIntegral_literal(
										  instruction.integral_literal()).
									  intValue()));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format21lhContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT21lh().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction21lh(opcode, reg,
									   visitFixed_32bit_literal(
										   instruction.fixed_32bit_literal()).
									   longValue()));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format21ihContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT21ih().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction21ih(opcode, reg,
									   visitFixed_32bit_literal(
										   instruction.fixed_32bit_literal()).
									   intValue()));
	}

	@Override
	public Number visitFixed_32bit_literal(SmaliParser.Fixed_32bit_literalContext ctx) {
		Number val = 0;
		if (ctx != null) {
			if (ctx.LONG_LITERAL() != null) 
				val = LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
			else if (ctx.SHORT_LITERAL() != null) 
				val = LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
			else if (ctx.BYTE_LITERAL() != null) 
				val = LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
			else if (ctx.integer_literal() != null)
				val = LiteralTools.parseInt(ctx.integer_literal().getText());
			else if (ctx.CHAR_LITERAL() != null)
				val = (int)parse(ctx.CHAR_LITERAL().getText()).charAt(0);
			else if (ctx.float_literal() != null)
				val = LiteralTools.parseFloat(ctx.float_literal().getText());
		}
		return val;
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format21c_typeContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT21c_TYPE().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction21c(opcode, reg,
									  new ImmutableTypeReference(
										  instruction.
										  nonvoid_type_descriptor().getText())
									  ));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format21c_stringContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT21c_STRING().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction21c(opcode, reg,
									  new ImmutableStringReference(
										  parse(instruction.
												STRING_LITERAL().getText())
									  )));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format21c_method_typeContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT21c_METHOD_TYPE().getText());
		int reg = getRegister(instruction.REGISTER().getSymbol(), locals);
		builder.addInstruction(
			new BuilderInstruction21c(opcode, reg,
									  visitMethod_prototype(instruction.method_prototype())));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format21c_method_handleContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.insn.getText());
		int reg = getRegister(instruction.reg, locals);
		builder.addInstruction(
			new BuilderInstruction21c(opcode, reg,
									  visitMethod_handle_reference(instruction.method_handle_reference())));
	}

	@Override
	public ImmutableMethodHandleReference visitMethod_handle_reference(SmaliParser.Method_handle_referenceContext ctx) {
		String typeString;
		if (ctx.METHOD_HANDLE_TYPE_FIELD() != null)
			typeString = ctx. METHOD_HANDLE_TYPE_FIELD().getText();
		else if (ctx.METHOD_HANDLE_TYPE_METHOD() != null)
			typeString = ctx.METHOD_HANDLE_TYPE_METHOD().getText();
		else
			typeString = ctx.INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE().getText();
		int type = MethodHandleType.getMethodHandleType(typeString);
		ImmutableReference ref;
		if (ctx.field_reference() != null)
			ref = visitField_reference(ctx.field_reference());
		else
			ref = visitMethod_reference(ctx.method_reference());
		return new ImmutableMethodHandleReference(type, ref);
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format21c_fieldContext instruction, int locals) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.insn.getText());
		int reg = getRegister(instruction.reg, locals);
		builder.addInstruction(
			new BuilderInstruction21c(opcode, reg,
									  visitField_reference(instruction.field_reference())));
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format20tContext instruction) {
		Opcode opcode = opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT20t().getText());
		String label = visitLabel_ref(instruction.label_ref());
		BuilderInstruction20t i = new BuilderInstruction20t(opcode, builder.getLabel(label));
		builder.addInstruction(i);
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format20bcContext instruction) {
		int type = VerificationError.getVerificationError(instruction.type.getText());
		Reference ref = visitVerification_error_reference(instruction.verification_error_reference());
		BuilderInstruction20bc i = new BuilderInstruction20bc(opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT20bc().getText()),
															  type, ref);
		builder.addInstruction(i);
	}

	@Override
	public Reference visitVerification_error_reference(SmaliParser.Verification_error_referenceContext ctx) {
		if (ctx.CLASS_DESCRIPTOR() != null)
			return new ImmutableTypeReference(ctx.CLASS_DESCRIPTOR().getText());
		if (ctx.field_reference() != null)
			return visitField_reference(ctx.field_reference());
		return visitMethod_reference(ctx.method_reference());
	}

	@Override
	public ImmutableMethodReference visitMethod_reference(SmaliParser.Method_referenceContext ctx) {
		ImmutableMethodProtoReference ref = visitMethod_prototype(ctx.method_prototype());
		return new ImmutableMethodReference(ctx.defClass.getText(),
											ctx.name.getText(),
											ref.getParameterTypes(),
											ref.getReturnType());
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format12xContext instruction, int locals) {
		int reg1 = getRegister(instruction.REGISTER(0).getSymbol(), locals);
		int reg2 = getRegister(instruction.REGISTER(1).getSymbol(), locals);
		BuilderInstruction12x insn = new BuilderInstruction12x(opcodes.getOpcodeByName(instruction.insn.getText()), reg1, reg2);
		builder.addInstruction(insn);
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format11xContext instruction, int locals) {
		int reg = getRegister(instruction.reg, locals);
		BuilderInstruction11x insn = new BuilderInstruction11x(opcodes.getOpcodeByName(instruction.INSTRUCTION_FORMAT11x().getText()), reg);
		builder.addInstruction(insn);
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format11nContext instructionReal, int locals) {
		int reg = getRegister(instructionReal.reg, locals);
		BuilderInstruction11n insn = new BuilderInstruction11n(opcodes.getOpcodeByName(instructionReal.INSTRUCTION_FORMAT11n().getText()), reg,
															   visitIntegral_literal(instructionReal.integral_literal()).intValue());
		builder.addInstruction(insn);
	}
	private int getRegister(Token tk, int locals) {
		String t = tk.getText();
		int reg = Integer.parseInt(t.substring(1));
		if (t.charAt(0) == 'p') {
			reg += locals;
		}
		return reg;
	}
	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format10xContext instructionReal) {
		BuilderInstruction10x insn = new BuilderInstruction10x(opcodes.getOpcodeByName(instructionReal.INSTRUCTION_FORMAT10x().getText()));
		builder.addInstruction(insn);
	}

	private void addInstruction(MethodImplementationBuilder builder, SmaliParser.Insn_format10tContext instructionReal) {
		BuilderInstruction10t insn = new BuilderInstruction10t(opcodes.getOpcodeByName(instructionReal.INSTRUCTION_FORMAT10t().getText()),
															   builder.getLabel(visitLabel_ref(instructionReal.label_ref())));
		builder.addInstruction(insn);
	}

	@Override
	public String visitLabel_ref(SmaliParser.Label_refContext ctx) {
		String text = ctx.name.getText();
		return text;
	}

	@Override
	public Long visitIntegral_literal(SmaliParser.Integral_literalContext ctx) {
		long val = 0;
		if (ctx != null) {
			if (ctx.LONG_LITERAL() != null) 
				val = LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
			else if (ctx.SHORT_LITERAL() != null) 
				val = LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
			else if (ctx.BYTE_LITERAL() != null) 
				val = LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
			else if (ctx.integer_literal() != null)
				val = LiteralTools.parseInt(ctx.integer_literal().getText());
			else if (ctx.CHAR_LITERAL() != null)
				val = parse(ctx.CHAR_LITERAL().getText()).charAt(0);
		}
		return Long.valueOf(val);
	}

	private static class Paramater implements MethodParameter {

		@Override
		public String toString() {
			return type;
		}

		@Override
		public int length() {
			return type.length();
		}

		@Override
		public char charAt(int p1) {
			return type.charAt(p1);
		}

		@Override
		public CharSequence subSequence(int p1, int p2) {
			return type.subSequence(p1,p2);
		}

		@Override
		public int compareTo(CharSequence p1) {
			// TODO: Implement this method
			return 0;
		}

		@Override
		public String getType() {
			return type;
		}

		@Override
		public Set<? extends Annotation> getAnnotations() {
			return annotations.build();
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public String getSignature() {
			// TODO: Implement this method
			return null;
		}
		
		String type;
		String name;
		ImmutableSet.Builder<ImmutableAnnotation> annotations = new ImmutableSet.Builder<>();
	}
	private void bindParamaters(List<ImmutableMethodParameter> paramters,
								List<? extends CharSequence> parameterTypes,
								List<SmaliParser.Parameter_directiveContext> parameter_directive,
								boolean isStatic) {
		int size = parameterTypes.size() * 2;
		if (size == 0)
			return;
		Paramater[] ps = new Paramater[size];
		int i = 0;
		for (CharSequence s : parameterTypes) {
			Paramater p = new Paramater();
			String type = s.toString();
			p.type = type;
			ps[i++] = p;
			char c = type.charAt(0);
			if (c == 'J' || c == 'D')
				i++;
		}
		for (SmaliParser.Parameter_directiveContext ctx : parameter_directive) {
			String text = ctx.reg.getText();
			int reg = Integer.parseInt(text.substring(1));
			if (!isStatic)
				reg--;
			Paramater p = ps[reg];
			if (ctx.name != null)
				p.name = parse(ctx.name.getText());
			for (SmaliParser.AnnotationContext a : ctx.annotation()) {
				p.annotations.add(visitAnnotation(a));
			}
		}
		for (Paramater p : ps) {
			if (p == null)
				continue;
			paramters.add(ImmutableMethodParameter.of(p));
		}
		
	}

	private String parse(String text) {
		StringBuilder sb = new StringBuilder();
		int max = text.length() - 1;
		for (int i = 1; i < max; i++) {
			char ch = text.charAt(i);
			if (ch == '\\') {
				i++;
				switch (text.charAt(i)) {
					case 'n':
						ch = '\n';
						break;
					case 'b':
						ch = '\b';
						break;
					case 'f':
						ch = '\f';
						break;
					case 'r':
						ch = '\r';
						break;
					case 't':
						ch = '\t';
						break;
					case '"':
						ch = '"';
						break;
					case '\'':
						ch = '\'';
						break;
					case '\\':
						ch = '\\';
						break;
					case 'u':
						ch = (char) Integer.parseInt(text.substring(i + 1, i + 5), 16);
						i += 4;
				}
			}
			sb.append(ch);
		}
		return sb.toString();
	}

}
