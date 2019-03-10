package com.a4455jkjh.smali;

import com.a4455jkjh.lexer.SmaliBaseVisitor;
import com.a4455jkjh.lexer.SmaliLexer;
import com.a4455jkjh.lexer.SmaliParser;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.AnnotationVisibility;
import org.jf.dexlib2.MethodHandleType;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.VerificationError;
import org.jf.dexlib2.builder.BuilderInstruction;
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
import org.jf.dexlib2.iface.ClassDef;
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
import org.jf.smali.LiteralTools;

public class ClassMaker extends SmaliBaseVisitor<Object> {
	private CommonTokenStream tokens;
	private Opcodes opcodes;
	private final SmaliLexer lexer = new SmaliLexer(null);
	private final SmaliParser parser = new SmaliParser(null);

	private static final ThreadLocal<ClassMaker> makers = new ThreadLocal<>();

	private static ClassMaker getMaker() {
		ClassMaker maker = makers.get();
		if (maker == null) {
			maker = new ClassMaker();
			makers.set(maker);
		}
		return maker;
	}
	public static final ClassDef make(File file, Opcodes opcodes) throws IOException {
		return make(file.getCanonicalFile(), opcodes);
	}

	public static final ClassDef make(String path, Opcodes opcodes) throws IOException {
		return make(CharStreams.fromFileName(path), opcodes);
	}

	public static ClassDef make(CharStream stream, Opcodes opcodes) {
		return getMaker().makeInternal(stream, opcodes);
	}

	public static ClassDef make(SmaliParser.SmaliContext smali, CommonTokenStream tokens, Opcodes opcodes) {
		ClassMaker maker = getMaker();
		maker.tokens = tokens;
		maker.opcodes = opcodes;
		return maker.visitSmali(smali);
	}

	private ClassDef makeInternal(CharStream stream, Opcodes opcodes) {
		lexer.setInputStream(stream);
		tokens = new CommonTokenStream(lexer);
		parser.setTokenStream(tokens);
		this.opcodes = opcodes;
		return visitSmali(parser.smali());
	}

	private ClassMaker() {
	}

	private int access = 0;
	private String thisType = null;

	@Override
	public ImmutableClassDef visitSmali(SmaliParser.SmaliContext ctx) {
		String superType = null;
		String sourceFile = null;
		thisType = null;
		ImmutableList.Builder<String> interfaces = new ImmutableList.Builder<>();
		ImmutableSet.Builder<ImmutableAnnotation> annotations = new ImmutableSet.Builder<>();
		Comparator<ImmutableField> neturalField = Ordering.natural();
		ImmutableSortedSet.Builder<ImmutableField> staticFields = new ImmutableSortedSet.Builder<ImmutableField>(neturalField);
		ImmutableSortedSet.Builder<ImmutableField> instanceFields = new ImmutableSortedSet.Builder<ImmutableField>(neturalField);
		Comparator<ImmutableMethod> neturalMethod = Ordering.natural();
		ImmutableSortedSet.Builder<ImmutableMethod> directMethods = new ImmutableSortedSet.Builder<ImmutableMethod>(neturalMethod);
		ImmutableSortedSet.Builder<ImmutableMethod> virtualMethods = new ImmutableSortedSet.Builder<ImmutableMethod>(neturalMethod);
		for (SmaliParser.MemberContext member : ctx.member()) {
			if (member instanceof SmaliParser.ClassAltContext)
				thisType = visitClassAlt((SmaliParser.ClassAltContext) member);
			else if (member instanceof SmaliParser.SuperAltContext)
				superType = visitSuperAlt((SmaliParser.SuperAltContext) member);
			else if (member instanceof SmaliParser.SourceFileAltContext)
				sourceFile = visitSourceFileAlt((SmaliParser.SourceFileAltContext) member);
			else if (member instanceof SmaliParser.ImplementsAltContext)
				interfaces.add(visitImplementsAlt((SmaliParser.ImplementsAltContext) member));
			else if (member instanceof SmaliParser.ClassAnnotationAltContext)
				annotations.add(visitClassAnnotationAlt((SmaliParser.ClassAnnotationAltContext) member));
			else if (member instanceof SmaliParser.FieldAltContext) {
				ImmutableField field = visitFieldAlt((SmaliParser.FieldAltContext) member);
				if (FieldUtil.isStatic(field))
					staticFields.add(field);
				else
					instanceFields.add(field);
			} else if (member instanceof SmaliParser.MethodAltContext) {
				ImmutableMethod method = visitMethodAlt((SmaliParser.MethodAltContext) member);
				if (MethodUtil.isDirect(method))
					directMethods.add(method);
				else
					virtualMethods.add(method);
			}
		}
		return new ImmutableClassDef(
				thisType,
				access,
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
	public ImmutableMethod visitMethodAlt(SmaliParser.MethodAltContext ctx) {
		return visitMethod(ctx.method());
	}

	@Override
	public ImmutableMethod visitMethod(SmaliParser.MethodContext ctx) {
		String defClass = thisType;
		int access = visitAccessList(ctx.accessList());
		String name = tokens.getText(ctx.memberName());
		ImmutableMethodProtoReference proto = visitMethodProto(ctx.methodProto());
		ImmutableSet.Builder<ImmutableAnnotation> annotations = new ImmutableSet.Builder<>();
		List<? extends CharSequence> parameterTypes = proto.getParameterTypes();
		List<ImmutableMethodParameter> paramters = new LinkedList<>();
		boolean isStatic = AccessFlags.STATIC.isSet(access);
		SmaliMethodParamter[] paramtersArray = makeParametersArray(parameterTypes, isStatic);
		MethodImplementationBuilder implBuilder = buildInstruction(
				ctx.statement_or_directive(),
				annotations,
				paramtersArray,
				isStatic);
		for (SmaliMethodParamter paramter : paramtersArray) {
			if (paramter == null)
				continue;
			paramters.add(ImmutableMethodParameter.of(paramter));
		}
		return new ImmutableMethod(defClass,
				name,
				paramters,
				proto.getReturnType(),
				access,
				annotations.build(),
				ImmutableMethodImplementation.of(implBuilder.getMethodImplementation()));
	}

	private MethodImplementationBuilder buildInstruction(List<SmaliParser.Statement_or_directiveContext> statement_or_directive,
	                                                     ImmutableSet.Builder<ImmutableAnnotation> annotations,
	                                                     SmaliMethodParamter[] paramtersArray,
	                                                     boolean isStatic) {
		int paramtersCount = paramtersArray.length;
		int localsCount = -1;
		MethodImplementationBuilder builder = null;
		for (SmaliParser.Statement_or_directiveContext ctx : statement_or_directive) {
			if (ctx instanceof SmaliParser.RegisterAltContext) {
				int totalCount = newBuilder((SmaliParser.RegisterAltContext) ctx, paramtersCount);
				localsCount = totalCount - paramtersCount;
				builder = new MethodImplementationBuilder(totalCount);
			} else if (ctx instanceof SmaliParser.MethodAnnotationAltContext)
				annotations.add(
						visitAnnotation(
								((SmaliParser.MethodAnnotationAltContext) ctx).
										annotation()));
			else if (ctx instanceof SmaliParser.ParamterAltContext)
				setParameter((SmaliParser.ParamterAltContext) ctx, paramtersArray);
			else
				addInstructionOrDirectives(ctx, builder, localsCount);
		}
		return builder;
	}

	private void addInstructionOrDirectives(SmaliParser.Statement_or_directiveContext ctx,
	                                        MethodImplementationBuilder builder,
	                                        int localsCount) {
		if (builder == null)
			throw new NullPointerException(".register or .locals must be at first!");
		if (ctx instanceof SmaliParser.CatchAltContext)
			addCatch((SmaliParser.CatchAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.CatchAllAltContext)
			addCatchAll((SmaliParser.CatchAllAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.LableAltContext)
			addLabel(((SmaliParser.LableAltContext) ctx).label(), builder);
		else if (ctx instanceof SmaliParser.LineAltContext)
			addLine((SmaliParser.LineAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.LocalAltContext)
			addStartLocal((SmaliParser.LocalAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.EndLocalAltContext)
			addEndLocal((SmaliParser.EndLocalAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.RestartLocalAltContext)
			addRestartLocal((SmaliParser.RestartLocalAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.PrologueAltContext)
			builder.addPrologue();
		else if (ctx instanceof SmaliParser.EpilogueAltContext)
			builder.addEpilogue();
		else if (ctx instanceof SmaliParser.SourceAltContext)
			addSource((SmaliParser.SourceAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.Instruction10tAltContext)
			addInstruction((SmaliParser.Instruction10tAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.Instruction10xAltContext)
			addInstruction((SmaliParser.Instruction10xAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.Instruction11nAltContext)
			addInstruction((SmaliParser.Instruction11nAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction11xAltContext)
			addInstruction((SmaliParser.Instruction11xAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction12xAltContext)
			addInstruction((SmaliParser.Instruction12xAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction20bcAltContext)
			addInstruction((SmaliParser.Instruction20bcAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.Instruction20tAltContext)
			addInstruction((SmaliParser.Instruction20tAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.Instruction21cFieldAltContext)
			addInstruction((SmaliParser.Instruction21cFieldAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction21cMethodHandleAltContext)
			addInstruction((SmaliParser.Instruction21cMethodHandleAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction21cMethodAltContext)
			addInstruction((SmaliParser.Instruction21cMethodAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction21cStringAltContext)
			addInstruction((SmaliParser.Instruction21cStringAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction21cTypeAltContext)
			addInstruction((SmaliParser.Instruction21cTypeAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction21ihAltContext)
			addInstruction((SmaliParser.Instruction21ihAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction21lhAltContext)
			addInstruction((SmaliParser.Instruction21lhAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction21sAltContext)
			addInstruction((SmaliParser.Instruction21sAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction21tAltContext)
			addInstruction((SmaliParser.Instruction21tAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction22bAltContext)
			addInstruction((SmaliParser.Instruction22bAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction22cFieldAltContext)
			addInstruction((SmaliParser.Instruction22cFieldAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction22cTypeAltContext)
			addInstruction((SmaliParser.Instruction22cTypeAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction22sAltContext)
			addInstruction((SmaliParser.Instruction22sAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction22tAltContext)
			addInstruction((SmaliParser.Instruction22tAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction22xAltContext)
			addInstruction((SmaliParser.Instruction22xAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction23xAltContext)
			addInstruction((SmaliParser.Instruction23xAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction30tAltContext)
			addInstruction((SmaliParser.Instruction30tAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.Instruction31cAltContext)
			addInstruction((SmaliParser.Instruction31cAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction31iAltContext)
			addInstruction((SmaliParser.Instruction31iAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction31tAltContext)
			addInstruction((SmaliParser.Instruction31tAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction32xAltContext)
			addInstruction((SmaliParser.Instruction32xAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction35cCallsiteAltContext)
			addInstruction((SmaliParser.Instruction35cCallsiteAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction35cMethodAltContext)
			addInstruction((SmaliParser.Instruction35cMethodAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction35cTypeAltContext)
			addInstruction((SmaliParser.Instruction35cTypeAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction3rcCallsiteAltContext)
			addInstruction((SmaliParser.Instruction3rcCallsiteAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction3rcMethodAltContext)
			addInstruction((SmaliParser.Instruction3rcMethodAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction3rcTypeAltContext)
			addInstruction((SmaliParser.Instruction3rcTypeAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction45ccMethodAltContext)
			addInstruction((SmaliParser.Instruction45ccMethodAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction4rccMethodAltContext)
			addInstruction((SmaliParser.Instruction4rccMethodAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.Instruction51lAltContext)
			addInstruction((SmaliParser.Instruction51lAltContext) ctx, builder, localsCount);
		else if (ctx instanceof SmaliParser.InstructionArraydataAltContext)
			addInstruction((SmaliParser.InstructionArraydataAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.InstructionSparseSwitchAltContext)
			addInstruction((SmaliParser.InstructionSparseSwitchAltContext) ctx, builder);
		else if (ctx instanceof SmaliParser.InstructionPackedSwitchAltContext)
			addInstruction((SmaliParser.InstructionPackedSwitchAltContext) ctx, builder);
		else {
			System.out.println("Odex instruction. replace with nop!");
			builder.addInstruction(new BuilderInstruction10x(Opcode.NOP));
		}
	}

	private void addInstruction(SmaliParser.Instruction51lAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format51lContext insn = ctx.insn_format51l();
		String opcodeString = insn.INSTRUCTION_FORMAT51l().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		long literal = visitFixed64bitLiteral(insn.fixed64bitLiteral()).longValue();
		BuilderInstruction instruction = new BuilderInstruction51l(opcode, register, literal);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction4rccMethodAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format4rcc_methodContext insn = ctx.insn_format4rcc_method();
		String opcodeString = insn.INSTRUCTION_FORMAT4rcc_METHOD().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int[] registers = visitRegister_range(insn.register_range(), localsCount);
		ImmutableMethodReference method = visitMethodReference(insn.methodReference());
		ImmutableMethodProtoReference proto = visitMethodProto(insn.methodProto());
		BuilderInstruction instruction = new BuilderInstruction4rcc(opcode,
				registers[0],
				registers[1],
				method,
				proto);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction45ccMethodAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format45cc_methodContext insn = ctx.insn_format45cc_method();
		String opcodeString = insn.INSTRUCTION_FORMAT45cc_METHOD().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int[] registers = visitRegister_list(insn.register_list(), localsCount);
		ImmutableMethodReference method = visitMethodReference(insn.methodReference());
		ImmutableMethodProtoReference proto = visitMethodProto(insn.methodProto());
		BuilderInstruction instruction = new BuilderInstruction45cc(opcode,
				registers[5],
				registers[0],
				registers[1],
				registers[2],
				registers[3],
				registers[4],
				method,
				proto);
		builder.addInstruction(instruction);

	}

	private void addInstruction(SmaliParser.Instruction3rcTypeAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format3rc_typeContext insn = ctx.insn_format3rc_type();
		String opcodeString = insn.INSTRUCTION_FORMAT3rc_TYPE().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int[] registers = visitRegister_range(insn.register_range(), localsCount);
		String type = tokens.getText(insn.nonvoid_type_descriptor());
		ImmutableReference reference = new ImmutableTypeReference(type);
		BuilderInstruction instruction = new BuilderInstruction3rc(opcode,
				registers[0],
				registers[1],
				reference);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction3rcMethodAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format3rc_methodContext insn = ctx.insn_format3rc_method();
		String opcodeString = insn.INSTRUCTION_FORMAT3rc_METHOD().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int[] registers = visitRegister_range(insn.register_range(), localsCount);
		ImmutableReference reference = visitMethodReference(insn.methodReference());
		BuilderInstruction instruction = new BuilderInstruction3rc(opcode,
				registers[0],
				registers[1],
				reference);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction3rcCallsiteAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format3rc_call_siteContext insn = ctx.insn_format3rc_call_site();
		String opcodeString = insn.INSTRUCTION_FORMAT3rc_CALL_SITE().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int[] registers = visitRegister_range(insn.register_range(), localsCount);
		ImmutableReference reference = visitCallsiteReference(insn.callsiteReference());
		BuilderInstruction instruction = new BuilderInstruction3rc(opcode,
				registers[0],
				registers[1],
				reference);
		builder.addInstruction(instruction);
	}

	private int[] visitRegister_range(SmaliParser.Register_rangeContext range, int localsCount) {
		if (range == null)
			return NULL_RANGE;
		int start = getRegister(range.startreg, localsCount);
		int end = getRegister(range.endreg, localsCount);
		return new int[]{start, end - start + 1};
	}

	private static final int[] NULL_RANGE = {0, -1};

	private void addInstruction(SmaliParser.Instruction35cTypeAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format35c_typeContext insn = ctx.insn_format35c_type();
		String opcodeString = insn.INSTRUCTION_FORMAT35c_TYPE().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int[] registers = visitRegister_list(insn.register_list(), localsCount);
		String type = tokens.getText(insn.nonvoid_type_descriptor());
		ImmutableReference reference = new ImmutableTypeReference(type);
		BuilderInstruction instruction = new BuilderInstruction35c(opcode,
				registers[5],
				registers[0],
				registers[1],
				registers[2],
				registers[3],
				registers[4],
				reference);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction35cMethodAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format35c_methodContext insn = ctx.insn_format35c_method();
		String opcodeString = tokens.getText(insn.instruction_format35c_method());
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int[] registers = visitRegister_list(insn.register_list(), localsCount);
		ImmutableReference reference = visitMethodReference(insn.methodReference());
		BuilderInstruction instruction = new BuilderInstruction35c(opcode,
				registers[5],
				registers[0],
				registers[1],
				registers[2],
				registers[3],
				registers[4],
				reference);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction35cCallsiteAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format35c_call_siteContext insn = ctx.insn_format35c_call_site();
		String opcodeString = insn.INSTRUCTION_FORMAT35c_CALL_SITE().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int[] registers = visitRegister_list(insn.register_list(), localsCount);
		ImmutableReference reference = visitCallsiteReference(insn.callsiteReference());
		BuilderInstruction instruction = new BuilderInstruction35c(opcode,
				registers[5],
				registers[0],
				registers[1],
				registers[2],
				registers[3],
				registers[4],
				reference);
		builder.addInstruction(instruction);
	}

	@Override
	public ImmutableCallSiteReference visitCallsiteReference(SmaliParser.CallsiteReferenceContext ctx) {
		int type = MethodHandleType.INVOKE_STATIC;
		ImmutableMethodReference method = visitMethodReference(ctx.methodReference());
		ImmutableMethodHandleReference methodHandle = new ImmutableMethodHandleReference(type, method);
		String name = tokens.getText(ctx.simpleName());
		String methodName = parseStringOrChar(ctx.STRING_LITERAL());
		ImmutableMethodProtoReference proto = visitMethodProto(ctx.methodProto());
		ImmutableList.Builder<ImmutableEncodedValue> args = new ImmutableList.Builder<>();
		for (SmaliParser.LiteralContext literal : ctx.literal()) {
			args.add(visitLiteral(literal));
		}
		return new ImmutableCallSiteReference(
				name,
				methodHandle,
				methodName,
				proto,
				args.build());
	}

	public int[] visitRegister_list(SmaliParser.Register_listContext ctx, int localsCount) {
		int[] registers = new int[6];
		int count = 0;
		if (ctx != null) {
			for (TerminalNode node : ctx.REGISTER()) {
				registers[count++] = getRegister(node, localsCount);
			}
		}
		registers[5] = count;
		return registers;
	}

	private void addInstruction(SmaliParser.Instruction32xAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format32xContext insn = ctx.insn_format32x();
		String opcodeString = insn.INSTRUCTION_FORMAT32x().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register1 = getRegister(insn.reg1, localsCount);
		int register2 = getRegister(insn.reg2, localsCount);
		BuilderInstruction instruction = new BuilderInstruction32x(opcode, register1, register2);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.InstructionPackedSwitchAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.Insn_packed_switch_directiveContext insn = ctx.insn_packed_switch_directive();
		ImmutableList.Builder<Label> labels = new ImmutableList.Builder<>();
		for (SmaliParser.Label_refContext label : insn.label_ref()) {
			labels.add(getLabel(label, builder));
		}
		int start = visitFixed32bitLiteral(insn.fixed32bitLiteral()).intValue();
		BuilderInstruction instruction = new BuilderPackedSwitchPayload(start, labels.build());
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.InstructionSparseSwitchAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.Insn_sparse_switch_directiveContext insn = ctx.insn_sparse_switch_directive();
		ImmutableList.Builder<SwitchLabelElement> elements = new ImmutableList.Builder<>();
		for (SmaliParser.SwitchElementContext element : insn.switchElement()) {
			int key = visitFixed32bitLiteral(element.fixed32bitLiteral()).intValue();
			Label label = getLabel(element.label_ref(), builder);
			SwitchLabelElement e = new SwitchLabelElement(key, label);
			elements.add(e);
		}
		BuilderInstruction instruction = new BuilderSparseSwitchPayload(elements.build());
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.InstructionArraydataAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.Insn_array_data_directiveContext insn = ctx.insn_array_data_directive();
		int width = LiteralTools.parseInt(tokens.getText(insn.integerLiteral()));
		ImmutableList.Builder<Number> values = new ImmutableList.Builder<>();
		for (SmaliParser.Fixed64bitLiteralContext literal : insn.fixed64bitLiteral()) {
			values.add(visitFixed64bitLiteral(literal));
		}
		BuilderInstruction instruction = new BuilderArrayPayload(width, values.build());
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction31tAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format31tContext insn = ctx.insn_format31t();
		String opcodeString = insn.INSTRUCTION_FORMAT31t().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		Label label = getLabel(insn.label_ref(), builder);
		BuilderInstruction instruction = new BuilderInstruction31t(opcode, register, label);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction31iAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format31iContext insn = ctx.insn_format31i();
		String opcodeString = tokens.getText(insn.instruction_format31i());
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		int literal = visitFixed32bitLiteral(insn.fixed32bitLiteral()).intValue();
		BuilderInstruction instruction = new BuilderInstruction31i(opcode, register, literal);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction31cAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format31cContext insn = ctx.insn_format31c();
		String opcodeString = insn.INSTRUCTION_FORMAT31c().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		ImmutableReference ref = new ImmutableStringReference(
				parseStringOrChar(insn.STRING_LITERAL()));
		BuilderInstruction instruction = new BuilderInstruction31c(opcode, register, ref);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction30tAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.Insn_format30tContext insn = ctx.insn_format30t();
		String opcodeString = insn.INSTRUCTION_FORMAT30t().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		Label label = getLabel(insn.label_ref(), builder);
		BuilderInstruction instruction = new BuilderInstruction30t(opcode, label);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction23xAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format23xContext insn = ctx.insn_format23x();
		String opcodeString = insn.INSTRUCTION_FORMAT23x().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register1 = getRegister(insn.reg1, localsCount);
		int register2 = getRegister(insn.reg2, localsCount);
		int register3 = getRegister(insn.reg3, localsCount);
		BuilderInstruction instruction = new BuilderInstruction23x(opcode, register1, register2, register3);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction22xAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format22xContext insn = ctx.insn_format22x();
		String opcodeString = insn.INSTRUCTION_FORMAT22x().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register1 = getRegister(insn.reg1, localsCount);
		int register2 = getRegister(insn.reg2, localsCount);
		BuilderInstruction instruction = new BuilderInstruction22x(opcode, register1, register2);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction22tAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format22tContext insn = ctx.insn_format22t();
		String opcodeString = insn.INSTRUCTION_FORMAT22t().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register1 = getRegister(insn.reg1, localsCount);
		int register2 = getRegister(insn.reg2, localsCount);
		Label label = getLabel(insn.label_ref(), builder);
		BuilderInstruction instruction = new BuilderInstruction22t(opcode, register1, register2, label);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction22sAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format22sContext insn = ctx.insn_format22s();
		String opcodeString = tokens.getText(insn.instruction_format22s());
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register1 = getRegister(insn.reg1, localsCount);
		int register2 = getRegister(insn.reg2, localsCount);
		int literal = visitIntegralLiteral(insn.integralLiteral()).intValue();
		BuilderInstruction instruction = new BuilderInstruction22s(opcode, register1, register2, literal);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction22cTypeAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format22c_typeContext insn = ctx.insn_format22c_type();
		String opcodeString = insn.INSTRUCTION_FORMAT22c_TYPE().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register1 = getRegister(insn.reg1, localsCount);
		int register2 = getRegister(insn.reg2, localsCount);
		ImmutableReference reference = new ImmutableTypeReference(
				tokens.getText(insn.nonvoid_type_descriptor()));
		BuilderInstruction instruction = new BuilderInstruction22c(opcode, register1, register2, reference);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction22cFieldAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format22c_fieldContext insn = ctx.insn_format22c_field();
		String opcodeString = insn.INSTRUCTION_FORMAT22c_FIELD().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register1 = getRegister(insn.reg1, localsCount);
		int register2 = getRegister(insn.reg2, localsCount);
		ImmutableReference reference = visitFieldReference(insn.fieldReference());
		BuilderInstruction instruction = new BuilderInstruction22c(opcode, register1, register2, reference);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction22bAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format22bContext insn = ctx.insn_format22b();
		String opcodeString = insn.INSTRUCTION_FORMAT22b().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register1 = getRegister(insn.reg1, localsCount);
		int register2 = getRegister(insn.reg2, localsCount);
		int literal = visitIntegralLiteral(insn.integralLiteral()).intValue();
		BuilderInstruction instruction = new BuilderInstruction22b(opcode, register1, register2, literal);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction21tAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format21tContext insn = ctx.insn_format21t();
		String opcodeString = insn.INSTRUCTION_FORMAT21t().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		Label label = getLabel(insn.label_ref(), builder);
		BuilderInstruction instruction = new BuilderInstruction21t(opcode, register, label);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction21sAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format21sContext insn = ctx.insn_format21s();
		String opcodeString = insn.INSTRUCTION_FORMAT21s().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		int literal = visitIntegralLiteral(insn.integralLiteral()).intValue();
		BuilderInstruction instruction = new BuilderInstruction21s(opcode, register, literal);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction21lhAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format21lhContext insn = ctx.insn_format21lh();
		String opcodeString = insn.INSTRUCTION_FORMAT21lh().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		long literal = visitFixed64bitLiteral(insn.fixed64bitLiteral()).longValue();
		BuilderInstruction instruction = new BuilderInstruction21lh(opcode, register, literal);
		builder.addInstruction(instruction);
	}

	@Override
	public Number visitFixed64bitLiteral(SmaliParser.Fixed64bitLiteralContext ctx) {
		int type = ctx.type;
		if (type == 1)
			return LiteralTools.parseInt(tokens.getText(ctx.integerLiteral()));
		if (type == 2)
			return LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
		if (type == 3)
			return LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
		if (type == 4)
			return LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
		if (type == 5)
			return LiteralTools.parseFloat(tokens.getText(ctx.floatLiteral()));
		if (type == 6)
			return LiteralTools.parseDouble(tokens.getText(ctx.doubleLiteral()));
		if (type == 7)
			return (int) parseStringOrChar(ctx.CHAR_LITERAL()).charAt(0);
		if (type == 8)
			return Boolean.valueOf(ctx.BOOL_LITERAL().getText()) ?
					1 : 0;
		return 0;
	}

	private void addInstruction(SmaliParser.Instruction21ihAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format21ihContext insn = ctx.insn_format21ih();
		String opcodeString = insn.INSTRUCTION_FORMAT21ih().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		int literal = visitFixed32bitLiteral(insn.fixed32bitLiteral()).intValue();
		BuilderInstruction instruction = new BuilderInstruction21ih(opcode, register, literal);
		builder.addInstruction(instruction);
	}

	@Override
	public Number visitFixed32bitLiteral(SmaliParser.Fixed32bitLiteralContext ctx) {
		int type = ctx.type;
		if (type == 1)
			return LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
		if (type == 2)
			return LiteralTools.parseInt(tokens.getText(ctx.integerLiteral()));
		if (type == 3)
			return LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
		if (type == 4)
			return LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
		if (type == 5)
			return LiteralTools.parseFloat(tokens.getText(ctx.floatLiteral()));
		if (type == 6)
			return (int) parseStringOrChar(ctx.CHAR_LITERAL()).charAt(0);
		if (type == 7)
			return Boolean.valueOf(ctx.BOOL_LITERAL().getText()) ?
					1 : 0;
		return 0;
	}

	private void addInstruction(SmaliParser.Instruction21cTypeAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format21c_typeContext insn = ctx.insn_format21c_type();
		String opcodeString = insn.INSTRUCTION_FORMAT21c_TYPE().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		ImmutableReference ref = new ImmutableTypeReference(
				tokens.getText(insn.nonvoid_type_descriptor()));
		BuilderInstruction instruction = new BuilderInstruction21c(opcode, register, ref);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction21cStringAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format21c_stringContext insn = ctx.insn_format21c_string();
		String opcodeString = insn.INSTRUCTION_FORMAT21c_STRING().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		ImmutableReference ref = new ImmutableStringReference(
				parseStringOrChar(insn.STRING_LITERAL()));
		BuilderInstruction instruction = new BuilderInstruction21c(opcode, register, ref);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction21cMethodAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format21c_method_typeContext insn = ctx.insn_format21c_method_type();
		String opcodeString = insn.INSTRUCTION_FORMAT21c_METHOD_TYPE().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		ImmutableReference ref = visitMethodProto(insn.methodProto());
		BuilderInstruction instruction = new BuilderInstruction21c(opcode, register, ref);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction21cMethodHandleAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format21c_method_handleContext insn = ctx.insn_format21c_method_handle();
		String opcodeString = insn.INSTRUCTION_FORMAT21c_METHOD_HANDLE().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		ImmutableReference ref = visitMethodHandleReference(insn.methodHandleReference());
		BuilderInstruction instruction = new BuilderInstruction21c(opcode, register, ref);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction21cFieldAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format21c_fieldContext insn = ctx.insn_format21c_field();
		String opcodeString = insn.INSTRUCTION_FORMAT21c_FIELD().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		ImmutableReference ref = visitFieldReference(insn.fieldReference());
		BuilderInstruction instruction = new BuilderInstruction21c(opcode, register, ref);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction20tAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.Insn_format20tContext insn = ctx.insn_format20t();
		String opcodeString = insn.INSTRUCTION_FORMAT20t().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		Label label = getLabel(insn.label_ref(), builder);
		BuilderInstruction instruction = new BuilderInstruction20t(opcode, label);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction20bcAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.Insn_format20bcContext insn = ctx.insn_format20bc();
		String opcodeString = insn.INSTRUCTION_FORMAT20bc().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int type = VerificationError.getVerificationError(
				insn.VERIFICATION_ERROR_TYPE().getText());
		ImmutableReference reference = visitVerification_error_reference(insn.verification_error_reference());
		BuilderInstruction instruction = new BuilderInstruction20bc(opcode, type, reference);
		builder.addInstruction(instruction);
	}

	public ImmutableReference visitVerification_error_reference(SmaliParser.Verification_error_referenceContext ctx) {
		if (ctx instanceof SmaliParser.TypeErrorAltContext) {
			SmaliParser.TypeErrorAltContext typeError = (SmaliParser.TypeErrorAltContext) ctx;
			return new ImmutableTypeReference(
					typeError.CLASS_DESCRIPTOR().getText());
		}
		if (ctx instanceof SmaliParser.FieldErrorAltContext) {
			SmaliParser.FieldErrorAltContext fieldError = (SmaliParser.FieldErrorAltContext) ctx;
			return visitFieldReference(fieldError.fieldReference());
		}
		SmaliParser.MethodErrotAltContext methodError = (SmaliParser.MethodErrotAltContext) ctx;
		return visitMethodReference(methodError.methodReference());
	}

	private void addInstruction(SmaliParser.Instruction12xAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format12xContext insn = ctx.insn_format12x();
		String opcodeString = tokens.getText(insn.instruction_format12x());
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register0 = getRegister(insn.reg1, localsCount);
		int register1 = getRegister(insn.reg2, localsCount);
		BuilderInstruction instruction = new BuilderInstruction12x(opcode, register0, register1);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction11xAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format11xContext insn = ctx.insn_format11x();
		String opcodeString = insn.INSTRUCTION_FORMAT11x().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		BuilderInstruction instruction = new BuilderInstruction11x(opcode, register);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction11nAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.Insn_format11nContext insn = ctx.insn_format11n();
		String opcodeString = insn.INSTRUCTION_FORMAT11n().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		int register = getRegister(insn.REGISTER(), localsCount);
		int literal = visitIntegralLiteral(insn.integralLiteral()).intValue();
		BuilderInstruction instruction = new BuilderInstruction11n(opcode, register, literal);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction10xAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.Insn_format10xContext insn = ctx.insn_format10x();
		String opcodeString = insn.INSTRUCTION_FORMAT10x().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		BuilderInstruction instruction = new BuilderInstruction10x(opcode);
		builder.addInstruction(instruction);
	}

	private void addInstruction(SmaliParser.Instruction10tAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.Insn_format10tContext insn = ctx.insn_format10t();
		String opcodeString = insn.INSTRUCTION_FORMAT10t().getText();
		Opcode opcode = opcodes.getOpcodeByName(opcodeString);
		Label label = getLabel(insn.label_ref(), builder);
		BuilderInstruction instruction = new BuilderInstruction10t(opcode, label);
		builder.addInstruction(instruction);
	}

	private void addSource(SmaliParser.SourceAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.SourceDirectiveContext sourceDirective = ctx.sourceDirective();
		String source = parseStringOrChar(sourceDirective.STRING_LITERAL());
		builder.addSetSourceFile(new ImmutableStringReference(source));
	}

	private void addRestartLocal(SmaliParser.RestartLocalAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.RestartLocalDirectiveContext restartLocalDirective = ctx.restartLocalDirective();
		int register = getRegister(restartLocalDirective.REGISTER(), localsCount);
		builder.addRestartLocal(register);
	}

	private void addEndLocal(SmaliParser.EndLocalAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.EndLocalDirectiveContext endLocalDirective = ctx.endLocalDirective();
		int register = getRegister(endLocalDirective.REGISTER(), localsCount);
		builder.addEndLocal(register);
	}

	private void addStartLocal(SmaliParser.LocalAltContext ctx, MethodImplementationBuilder builder, int localsCount) {
		SmaliParser.LocalDirectiveContext localDirective = ctx.localDirective();
		int register = getRegister(localDirective.REGISTER(), localsCount);
		ImmutableStringReference name;
		if (localDirective.name == null)
			name = null;
		else
			name = new ImmutableStringReference(
					parseStringOrChar(
							localDirective.name.getText()));
		ImmutableTypeReference type;
		if (localDirective.type == null)
			type = new ImmutableTypeReference("V");
		else
			type = new ImmutableTypeReference(
					tokens.getText(localDirective.type));
		ImmutableStringReference signtuare = null;
		if (localDirective.signature != null)
			signtuare = new ImmutableStringReference(
					parseStringOrChar(
							localDirective.signature.getText()));
		builder.addStartLocal(register, name, type, signtuare);
	}

	private void addLine(SmaliParser.LineAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.LineDirectiveContext lineDirective = ctx.lineDirective();
		int line = visitIntegralLiteral(lineDirective.integralLiteral()).intValue();
		builder.addLineNumber(line);
	}

	private void addCatchAll(SmaliParser.CatchAllAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.CatchallDirectiveContext catchDirective = ctx.catchallDirective();
		Label from = getLabel(catchDirective.from, builder);
		Label to = getLabel(catchDirective.to, builder);
		Label handle = getLabel(catchDirective.handle, builder);
		builder.addCatch(from, to, handle);
	}

	private int getRegister(TerminalNode tk, int localsCount) {
		return getRegister(tk.getSymbol(), localsCount);
	}

	private int getRegister(Token tk, int localsCount) {
		String t = tk.getText();
		int reg = Integer.parseInt(t.substring(1));
		if (t.charAt(0) == 'p') {
			reg += localsCount;
		}
		return reg;
	}

	private void addCatch(SmaliParser.CatchAltContext ctx, MethodImplementationBuilder builder) {
		SmaliParser.CatchDirectiveContext catchDirective = ctx.catchDirective();
		Label from = getLabel(catchDirective.from, builder);
		Label to = getLabel(catchDirective.to, builder);
		Label handle = getLabel(catchDirective.handle, builder);
		String type = tokens.getText(catchDirective.nonvoid_type_descriptor());
		ImmutableTypeReference ref = new ImmutableTypeReference(type);
		builder.addCatch(ref, from, to, handle);
	}

	private Label getLabel(SmaliParser.Label_refContext label, MethodImplementationBuilder builder) {
		String labelText = tokens.getText(label);
		return builder.getLabel(labelText);
	}

	private void addLabel(SmaliParser.LabelContext label, MethodImplementationBuilder builder) {
		String labelText = tokens.getText(label);
		builder.addLabel(labelText);
	}

	private void setParameter(SmaliParser.ParamterAltContext ctx, SmaliMethodParamter[] paramtersArray) {
		SmaliParser.ParameterDirectiveContext parameterDirective = ctx.parameterDirective();
		String register = parameterDirective.reg.getText().substring(1);
		int reg = Integer.parseInt(register);
		SmaliMethodParamter paramter = paramtersArray[reg];
		paramter.setName(parseStringOrChar(parameterDirective.name.getText()));
		for (SmaliParser.AnnotationContext annotation : parameterDirective.annotation()) {
			paramter.addAnnotation(visitAnnotation(annotation));
		}
	}

	private int newBuilder(SmaliParser.RegisterAltContext ctx, int paramtersCount) {
		SmaliParser.RegistersDirectiveContext register = ctx.registersDirective();
		int count = visitIntegralLiteral(register.regCount).intValue();
		if (register.isLocal)
			count += paramtersCount;
		return count;
	}

	@Override
	public Number visitIntegralLiteral(SmaliParser.IntegralLiteralContext ctx) {
		Number num;
		switch (ctx.type) {
			case 1:
				num = LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
				break;
			case 2:
				num = LiteralTools.parseInt(tokens.getText(ctx.integerLiteral()));
				break;
			case 3:
				num = LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
				break;
			case 4:
				num = (int) parseStringOrChar(ctx.CHAR_LITERAL()).charAt(0);
				break;
			case 5:
				num = LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
				break;
			default:
				num = 0;
		}
		return num;
	}

	private static SmaliMethodParamter[] makeParametersArray(List<? extends CharSequence> parameterTypes, boolean isStatic) {
		int count = MethodUtil.getParameterRegisterCount(parameterTypes, isStatic);
		SmaliMethodParamter[] array = new SmaliMethodParamter[count];
		int i = isStatic ? 0 : 1;
		for (CharSequence s : parameterTypes) {
			array[i++] = new SmaliMethodParamter(s.toString());
			char c = s.charAt(0);
			if (c == 'D' || c == 'J')
				i++;
		}
		return array;
	}

	@Override
	public ImmutableField visitFieldAlt(SmaliParser.FieldAltContext ctx) {
		return visitField(ctx.field());
	}

	@Override
	public ImmutableField visitField(SmaliParser.FieldContext ctx) {
		String defClass = thisType;
		int access = visitAccessList(ctx.accessList());
		String name = tokens.getText(ctx.memberName());
		String type = tokens.getText(ctx.nonvoid_type_descriptor());
		ImmutableEncodedValue initValie = visitLiteral(ctx.literal());
		ImmutableSet.Builder<ImmutableAnnotation> annotations = new ImmutableSet.Builder<>();
		for (SmaliParser.AnnotationContext a : ctx.annotation())
			annotations.add(visitAnnotation(a));
		return new ImmutableField(defClass, name, type, access, initValie, annotations.build());
	}

	@Override
	public ImmutableAnnotation visitClassAnnotationAlt(SmaliParser.ClassAnnotationAltContext ctx) {
		return visitAnnotation(ctx.annotation());
	}

	@Override
	public ImmutableAnnotation visitAnnotation(SmaliParser.AnnotationContext ctx) {
		int visibity = AnnotationVisibility.getVisibility(ctx.ANNOTATION_VISIBILITY().getText());
		String type = ctx.CLASS_DESCRIPTOR().getText();
		ImmutableSet.Builder<ImmutableAnnotationElement> elements = new ImmutableSet.Builder<>();
		for (SmaliParser.Annotation_elementContext element : ctx.annotation_element()) {
			elements.add(visitAnnotation_element(element));
		}
		return new ImmutableAnnotation(visibity, type, elements.build());
	}

	@Override
	public ImmutableAnnotationElement visitAnnotation_element(SmaliParser.Annotation_elementContext ctx) {
		String name = tokens.getText(ctx.simpleName());
		ImmutableEncodedValue value = visitLiteral(ctx.literal());
		return new ImmutableAnnotationElement(name, value);
	}

	private ImmutableEncodedValue visitLiteral(SmaliParser.LiteralContext literal) {
		if (literal == null)
			return null;
		if (literal instanceof SmaliParser.LongLiteralAltContext)
			return visitLongLiteralAlt((SmaliParser.LongLiteralAltContext) literal);
		if (literal instanceof SmaliParser.IntegerLiteralAltContext)
			return visitIntegerLiteralAlt((SmaliParser.IntegerLiteralAltContext) literal);
		if (literal instanceof SmaliParser.ShortLiteralAltContext)
			return visitShortLiteralAlt((SmaliParser.ShortLiteralAltContext) literal);
		if (literal instanceof SmaliParser.ByteLiteralAltContext)
			return visitByteLiteralAlt((SmaliParser.ByteLiteralAltContext) literal);
		if (literal instanceof SmaliParser.FloatLiteralAltContext)
			return visitFloatLiteralAlt((SmaliParser.FloatLiteralAltContext) literal);
		if (literal instanceof SmaliParser.DoubleLiteralAltContext)
			return visitDoubleLiteralAlt((SmaliParser.DoubleLiteralAltContext) literal);
		if (literal instanceof SmaliParser.CharLiteralAltContext)
			return visitCharLiteralAlt((SmaliParser.CharLiteralAltContext) literal);
		if (literal instanceof SmaliParser.StringLiteralAltContext)
			return visitStringLiteralAlt((SmaliParser.StringLiteralAltContext) literal);
		if (literal instanceof SmaliParser.BooleanLiteralAltContext)
			return visitBooleanLiteralAlt((SmaliParser.BooleanLiteralAltContext) literal);
		if (literal instanceof SmaliParser.ArrayLiteralAltContext)
			return visitArrayLiteralAlt((SmaliParser.ArrayLiteralAltContext) literal);
		if (literal instanceof SmaliParser.SubAnnotationLiteralAltContext)
			return visitSubAnnotationLiteralAlt((SmaliParser.SubAnnotationLiteralAltContext) literal);
		if (literal instanceof SmaliParser.TypeLiteralAltContext)
			return visitTypeLiteralAlt((SmaliParser.TypeLiteralAltContext) literal);
		if (literal instanceof SmaliParser.FieldLiteralAltContext)
			return visitFieldLiteralAlt((SmaliParser.FieldLiteralAltContext) literal);
		if (literal instanceof SmaliParser.MethodLiteralAltContext)
			return visitMethodLiteralAlt((SmaliParser.MethodLiteralAltContext) literal);
		if (literal instanceof SmaliParser.MethodProtoLiteralAltContext)
			return visitMethodProtoLiteralAlt((SmaliParser.MethodProtoLiteralAltContext) literal);
		if (literal instanceof SmaliParser.EnumLiteralAltContext)
			return visitEnumLiteralAlt((SmaliParser.EnumLiteralAltContext) literal);
		if (literal instanceof SmaliParser.MethodHandleLiteralAltContext)
			return visitMethodHandleLiteralAlt((SmaliParser.MethodHandleLiteralAltContext) literal);
		return ImmutableNullEncodedValue.INSTANCE;
	}

	@Override
	public ImmutableEncodedValue visitMethodHandleLiteralAlt(SmaliParser.MethodHandleLiteralAltContext ctx) {
		return visitMethodHandleLiteral(ctx.methodHandleLiteral());
	}

	@Override
	public ImmutableEncodedValue visitMethodHandleLiteral(SmaliParser.MethodHandleLiteralContext ctx) {
		ImmutableMethodHandleReference reference = visitMethodHandleReference(ctx.methodHandleReference());
		return new ImmutableMethodHandleEncodedValue(reference);
	}

	@Override
	public ImmutableMethodHandleReference visitMethodHandleReference(SmaliParser.MethodHandleReferenceContext ctx) {
		Token token = ctx.type;
		int type = MethodHandleType.getMethodHandleType(token.getText());
		ImmutableReference reference;
		if (token.getType() == SmaliParser.METHOD_HANDLE_TYPE_FIELD)
			reference = visitFieldReference(ctx.fieldReference());
		else
			reference = visitMethodReference(ctx.methodReference());
		return new ImmutableMethodHandleReference(type, reference);
	}

	@Override
	public ImmutableEncodedValue visitEnumLiteralAlt(SmaliParser.EnumLiteralAltContext ctx) {
		return visitEnumLiteral(ctx.enumLiteral());
	}

	@Override
	public ImmutableEncodedValue visitEnumLiteral(SmaliParser.EnumLiteralContext ctx) {
		ImmutableFieldReference fieldReference = visitFieldReference(ctx.fieldReference());
		return new ImmutableEnumEncodedValue(fieldReference);
	}

	@Override
	public ImmutableEncodedValue visitMethodLiteralAlt(SmaliParser.MethodLiteralAltContext ctx) {
		return visitMethodLiteral(ctx.methodLiteral());
	}

	@Override
	public ImmutableEncodedValue visitMethodLiteral(SmaliParser.MethodLiteralContext ctx) {
		ImmutableMethodReference reference = visitMethodReference(ctx.methodReference());
		return new ImmutableMethodEncodedValue(reference);
	}

	@Override
	public ImmutableMethodReference visitMethodReference(SmaliParser.MethodReferenceContext ctx) {
		String defClass = getDefClass(ctx.reference_type_descriptor());
		String name = tokens.getText(ctx.memberName());
		ImmutableMethodProtoReference proto = visitMethodProto(ctx.methodProto());
		return new ImmutableMethodReference(
				defClass,
				name,
				proto.getParameterTypes(),
				proto.getReturnType());
	}

	@Override
	public ImmutableEncodedValue visitMethodProtoLiteralAlt(SmaliParser.MethodProtoLiteralAltContext ctx) {
		ImmutableMethodProtoReference proto = visitMethodProto(ctx.methodProto());
		return new ImmutableMethodTypeEncodedValue(proto);
	}

	@Override
	public ImmutableMethodProtoReference visitMethodProto(SmaliParser.MethodProtoContext ctx) {
		String returnType = tokens.getText(ctx.type_descriptor());
		ImmutableList<CharSequence> list = visitParamList(ctx.paramList());
		return new ImmutableMethodProtoReference(list, returnType);
	}

	@Override
	public ImmutableList<CharSequence> visitParamList(SmaliParser.ParamListContext ctx) {
		ImmutableList.Builder<CharSequence> list = new ImmutableList.Builder<>();
		for (SmaliParser.ParamArgContext arg : ctx.paramArg()) {
			if (arg instanceof SmaliParser.TypeAltContext)
				addArg((SmaliParser.TypeAltContext) arg, list);
			else
				addArg(arg, list);
		}
		return list.build();
	}

	private void addArg(SmaliParser.ParamArgContext arg, ImmutableList.Builder<CharSequence> list) {
		String typeList = tokens.getText(arg);
		addArg(typeList, list);
	}

	public static void addArg(String typeList, ImmutableList.Builder<CharSequence> list) {
		int l = typeList.length();
		for (int i = 0; i < l; i++) {
			char c = typeList.charAt(i);
			switch (c) {
				case 'B':
				case 'C':
				case 'D':
				case 'Z':
				case 'S':
				case 'I':
				case 'J':
					list.add(String.valueOf(c));
					continue;
				case 'L':
					list.add(typeList.substring(i));
					return;
			}
		}
	}

	private void addArg(SmaliParser.TypeAltContext arg, ImmutableList.Builder<CharSequence> list) {
		SmaliParser.Nonvoid_type_descriptorContext type = arg.nonvoid_type_descriptor();
		list.add(tokens.getText(type));
	}

	@Override
	public ImmutableEncodedValue visitFieldLiteralAlt(SmaliParser.FieldLiteralAltContext ctx) {
		return visitFieldLiteral(ctx.fieldLiteral());
	}

	@Override
	public ImmutableEncodedValue visitFieldLiteral(SmaliParser.FieldLiteralContext ctx) {
		ImmutableFieldReference fieldReference = visitFieldReference(ctx.fieldReference());
		return new ImmutableFieldEncodedValue(fieldReference);
	}

	@Override
	public ImmutableFieldReference visitFieldReference(SmaliParser.FieldReferenceContext ctx) {
		String defClass = getDefClass(ctx.reference_type_descriptor());
		String name = tokens.getText(ctx.memberName());
		String type = tokens.getText(ctx.nonvoid_type_descriptor());
		return new ImmutableFieldReference(defClass, name, type);
	}

	private String getDefClass(SmaliParser.Reference_type_descriptorContext reference_type_descriptor) {
		if (reference_type_descriptor == null)
			return thisType;
		return tokens.getText(reference_type_descriptor);
	}

	@Override
	public ImmutableEncodedValue visitTypeLiteralAlt(SmaliParser.TypeLiteralAltContext ctx) {
		String type = tokens.getText(ctx.typeLiteral());
		return new ImmutableTypeEncodedValue(type);
	}

	@Override
	public ImmutableEncodedValue visitSubAnnotationLiteralAlt(SmaliParser.SubAnnotationLiteralAltContext ctx) {
		return visitSubannotation(ctx.subannotation());
	}

	@Override
	public ImmutableEncodedValue visitSubannotation(SmaliParser.SubannotationContext ctx) {
		String type = ctx.CLASS_DESCRIPTOR().getText();
		ImmutableList.Builder<ImmutableAnnotationElement> elements = new ImmutableList.Builder<>();
		for (SmaliParser.Annotation_elementContext element : ctx.annotation_element()) {
			elements.add(visitAnnotation_element(element));
		}
		return new ImmutableAnnotationEncodedValue(type, elements.build());
	}

	@Override
	public ImmutableEncodedValue visitArrayLiteralAlt(SmaliParser.ArrayLiteralAltContext ctx) {
		return visitArrayLiteral(ctx.arrayLiteral());
	}

	@Override
	public ImmutableEncodedValue visitArrayLiteral(SmaliParser.ArrayLiteralContext ctx) {
		ImmutableList.Builder<ImmutableEncodedValue> values = new ImmutableList.Builder<>();
		for (SmaliParser.LiteralContext literal : ctx.literal())
			values.add(visitLiteral(literal));
		return new ImmutableArrayEncodedValue(values.build());
	}

	@Override
	public ImmutableEncodedValue visitBooleanLiteralAlt(SmaliParser.BooleanLiteralAltContext ctx) {
		boolean val = Boolean.parseBoolean(ctx.BOOL_LITERAL().getText());
		return ImmutableBooleanEncodedValue.forBoolean(val);
	}

	@Override
	public ImmutableEncodedValue visitStringLiteralAlt(SmaliParser.StringLiteralAltContext ctx) {
		String val = parseStringOrChar(ctx.STRING_LITERAL());
		return new ImmutableStringEncodedValue(val);
	}

	@Override
	public ImmutableEncodedValue visitCharLiteralAlt(SmaliParser.CharLiteralAltContext ctx) {
		char val = parseStringOrChar(ctx.CHAR_LITERAL()).charAt(0);
		return new ImmutableCharEncodedValue(val);
	}

	@Override
	public ImmutableEncodedValue visitDoubleLiteralAlt(SmaliParser.DoubleLiteralAltContext ctx) {
		double val = LiteralTools.parseDouble(tokens.getText(ctx.doubleLiteral()));
		return new ImmutableDoubleEncodedValue(val);
	}

	@Override
	public ImmutableEncodedValue visitFloatLiteralAlt(SmaliParser.FloatLiteralAltContext ctx) {
		float val = LiteralTools.parseFloat(tokens.getText(ctx.floatLiteral()));
		return new ImmutableFloatEncodedValue(val);
	}

	@Override
	public ImmutableEncodedValue visitByteLiteralAlt(SmaliParser.ByteLiteralAltContext ctx) {
		byte val = LiteralTools.parseByte(ctx.BYTE_LITERAL().getText());
		return new ImmutableByteEncodedValue(val);
	}

	@Override
	public ImmutableEncodedValue visitShortLiteralAlt(SmaliParser.ShortLiteralAltContext ctx) {
		short val = LiteralTools.parseShort(ctx.SHORT_LITERAL().getText());
		return new ImmutableShortEncodedValue(val);
	}

	@Override
	public ImmutableEncodedValue visitLongLiteralAlt(SmaliParser.LongLiteralAltContext ctx) {
		long val = LiteralTools.parseLong(ctx.LONG_LITERAL().getText());
		return new ImmutableLongEncodedValue(val);
	}

	@Override
	public ImmutableEncodedValue visitIntegerLiteralAlt(SmaliParser.IntegerLiteralAltContext ctx) {
		int val = LiteralTools.parseInt(tokens.getText(ctx.integerLiteral()));
		return new ImmutableIntEncodedValue(val);
	}

	@Override
	public String visitClassAlt(SmaliParser.ClassAltContext ctx) {
		SmaliParser.ClassSpecContext classSpec = ctx.classSpec();
		access = visitAccessList(classSpec.accessList()).intValue();
		return classSpec.CLASS_DESCRIPTOR().getText();
	}

	@Override
	public Integer visitAccessList(SmaliParser.AccessListContext ctx) {
		int access = 0;
		for (TerminalNode node : ctx.ACCESS_SPEC()) {
			access |= AccessFlags.getAccessFlag(node.getText()).getValue();
		}
		return Integer.valueOf(access);
	}

	@Override
	public String visitImplementsAlt(SmaliParser.ImplementsAltContext ctx) {
		return ctx.implementsSpec().CLASS_DESCRIPTOR().getText();
	}

	@Override
	public String visitSuperAlt(SmaliParser.SuperAltContext ctx) {
		return ctx.superSpec().CLASS_DESCRIPTOR().getText();
	}

	@Override
	public String visitSourceFileAlt(SmaliParser.SourceFileAltContext ctx) {
		return parseStringOrChar(ctx.sourceSpec().STRING_LITERAL());
	}

	@Override
	public String visitSourceAlt(SmaliParser.SourceAltContext ctx) {
		return parseStringOrChar(ctx.sourceDirective().STRING_LITERAL());
	}

	public static String parseStringOrChar(TerminalNode node) {
		return parseStringOrChar(node.getText());
	}

	public static String parseStringOrChar(String old) {
		int length = old.length() - 1;
		StringBuilder sb = new StringBuilder(length - 1);
		for (int i = 1; i < length; i++) {
			char ch = old.charAt(i);
			if (ch == '\\') {
				int i1 = appendChar(sb, old, i + 1);
				i += i1;
			} else
				sb.append(ch);
		}
		return sb.toString();
	}

	private static int appendChar(StringBuilder sb, String old, int i) {
		int len = 1;
		char ch = old.charAt(i);
		switch (ch) {
			case 'n':
				sb.append('\n');
				break;
			case 'b':
				sb.append('\b');
				break;
			case 'f':
				sb.append('\f');
				break;
			case 'r':
				sb.append('\r');
				break;
			case 't':
				sb.append('\t');
				break;
			case '\'':
				sb.append('\'');
				break;
			case '"':
				sb.append('"');
				break;
			case '\\':
				sb.append('\\');
				break;
			case 'u':
				String s = old.substring(i + 1, i + 5);
				ch = (char) Integer.parseInt(s, 16);
				sb.append(ch);
				len = 5;
				break;
		}
		return len;
	}

}
