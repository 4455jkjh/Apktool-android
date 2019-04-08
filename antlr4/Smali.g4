/**
 *Smali parser and lexer using antlr4
 *@author 4455jkjh
 */
grammar Smali;

/** smali begin*/
@parser::members{
    private String thisType;
}
smali
@init{
    thisType = null;
}
: member*
  EOF
  ;

member
  : classSpec      #ClassAlt
  | superSpec      #SuperAlt
  | sourceSpec     #SourceFileAlt
  | implementsSpec #ImplementsAlt
  | annotation     #ClassAnnotationAlt
  | field          #FieldAlt
  | method         #MethodAlt
  ;

classSpec
  : '.class' accessList CLASS_DESCRIPTOR {thisType=$CLASS_DESCRIPTOR.text;}
  ;

accessList
  : ACCESS_SPEC*
  ;

superSpec
  : '.super' CLASS_DESCRIPTOR
  ;

sourceSpec
  : '.source' STRING_LITERAL
  ;

implementsSpec
  : '.implements' CLASS_DESCRIPTOR
  ;

annotation
  : '.annotation' ANNOTATION_VISIBILITY CLASS_DESCRIPTOR
      annotation_element*
    '.end annotation'
  ;

annotation_element
  : simpleName '=' literal
  ;

subannotation
  : '.subannotation' type=CLASS_DESCRIPTOR
      annotation_element*
    '.end subannotation'
  ;

simpleName
  : SIMPLE_NAME
  | ACCESS_SPEC
  | VERIFICATION_ERROR_TYPE
  | POSITIVE_INTEGER_LITERAL
  | NEGATIVE_INTEGER_LITERAL
  | FLOAT_LITERAL_OR_ID
  | DOUBLE_LITERAL_OR_ID
  | BOOL_LITERAL
  | NULL_LITERAL
  | REGISTER
  | PRIMITIVE_LIST
  | PRIMITIVE_TYPE
  | VOID_TYPE
  | ANNOTATION_VISIBILITY
  | METHOD_HANDLE_TYPE_FIELD
  | METHOD_HANDLE_TYPE_METHOD
  | INSTRUCTION_FORMAT10t
  | INSTRUCTION_FORMAT10x
  | INSTRUCTION_FORMAT10x_ODEX
  | INSTRUCTION_FORMAT11x
  | INSTRUCTION_FORMAT12x_OR_ID
  | INSTRUCTION_FORMAT21c_FIELD
  | INSTRUCTION_FORMAT21c_FIELD_ODEX
  | INSTRUCTION_FORMAT21c_METHOD_HANDLE
  | INSTRUCTION_FORMAT21c_METHOD_TYPE
  | INSTRUCTION_FORMAT21c_STRING
  | INSTRUCTION_FORMAT21c_TYPE
  | INSTRUCTION_FORMAT21t
  | INSTRUCTION_FORMAT22c_FIELD
  | INSTRUCTION_FORMAT22c_FIELD_ODEX
  | INSTRUCTION_FORMAT22c_TYPE
  | INSTRUCTION_FORMAT22cs_FIELD
  | INSTRUCTION_FORMAT22s_OR_ID
  | INSTRUCTION_FORMAT22t
  | INSTRUCTION_FORMAT23x
  | INSTRUCTION_FORMAT31i_OR_ID
  | INSTRUCTION_FORMAT31t
  | INSTRUCTION_FORMAT35c_CALL_SITE
  | INSTRUCTION_FORMAT35c_METHOD
  | INSTRUCTION_FORMAT35c_METHOD_ODEX
  | INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE
  | INSTRUCTION_FORMAT35c_TYPE
  | INSTRUCTION_FORMAT35mi_METHOD
  | INSTRUCTION_FORMAT35ms_METHOD
  | INSTRUCTION_FORMAT45cc_METHOD
  | INSTRUCTION_FORMAT4rcc_METHOD
  | INSTRUCTION_FORMAT51l
  ;

memberName
  : simpleName
  | MEMBER_NAME
  ;

literal
  : LONG_LITERAL              #LongLiteralAlt
  | integerLiteral            #IntegerLiteralAlt
  | SHORT_LITERAL             #ShortLiteralAlt
  | BYTE_LITERAL              #ByteLiteralAlt
  | floatLiteral              #FloatLiteralAlt
  | doubleLiteral             #DoubleLiteralAlt
  | CHAR_LITERAL              #CharLiteralAlt
  | STRING_LITERAL            #StringLiteralAlt
  | BOOL_LITERAL              #BooleanLiteralAlt
  | NULL_LITERAL              #NullLiteralAlt
  | arrayLiteral              #ArrayLiteralAlt
  | subannotation             #SubAnnotationLiteralAlt
  | typeLiteral               #TypeLiteralAlt
  | fieldLiteral              #FieldLiteralAlt
  | methodLiteral             #MethodLiteralAlt
  | enumLiteral               #EnumLiteralAlt
  | methodHandleLiteral       #MethodHandleLiteralAlt
  | methodProto               #MethodProtoLiteralAlt
  ;

integerLiteral
  : POSITIVE_INTEGER_LITERAL
  | NEGATIVE_INTEGER_LITERAL
  ;

floatLiteral
  : FLOAT_LITERAL_OR_ID
  | FLOAT_LITERAL
  ;

doubleLiteral
  : val=DOUBLE_LITERAL_OR_ID
  | val=DOUBLE_LITERAL
  ;

arrayLiteral
  : '{' arrayMember? '}'
  ;

arrayMember
  : literal ( ',' literal )*
  ;

typeLiteral
  : reference_type_descriptor
  | PRIMITIVE_TYPE
  | VOID_TYPE
  ;

fieldLiteral : fieldReference ;

fieldReference returns[String defineClass]
@init{
    $defineClass=thisType;
}
  : (reference_type_descriptor '->' {$defineClass = $reference_type_descriptor.type;})? memberName ':' nonvoid_type_descriptor
  ;

methodLiteral : methodReference ;

methodReference returns[String defineClass]
@init{
   $defineClass=thisType;
}
  : (reference_type_descriptor '->' {$defineClass = $reference_type_descriptor.type;})? memberName methodProto
  ;

methodProto
  : '(' paramList ')' type_descriptor
  ;

type_descriptor
  : VOID_TYPE
  | PRIMITIVE_TYPE
  | CLASS_DESCRIPTOR
  | ARRAY_DESCRIPTOR
  ;

paramList
  : paramArg*
  ;

paramArg
  : nonvoid_type_descriptor #TypeAlt
  | TYPE_LIST               #TypeListAlt
  | PRIMITIVE_LIST          #PermitiveList
  ;

reference_type_descriptor returns[String type]
  : CLASS_DESCRIPTOR {$type=$CLASS_DESCRIPTOR.text;}
  | ARRAY_DESCRIPTOR {$type=$ARRAY_DESCRIPTOR.text;}
  ;

nonvoid_type_descriptor
  : PRIMITIVE_TYPE
  | CLASS_DESCRIPTOR
  | ARRAY_DESCRIPTOR
  ;

enumLiteral
  :  '.enum' fieldReference
  ;

methodHandleLiteral : methodHandleReference ;

methodHandleReference
  : type=METHOD_HANDLE_TYPE_FIELD '@' fieldReference
  | type=METHOD_HANDLE_TYPE_METHOD '@' methodReference
  | type=INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE '@' methodReference
  ;

field
  : '.field' accessList memberName ':' nonvoid_type_descriptor ('=' literal)?
      ( annotation* '.end field' )?
  ;

method
  : '.method' accessList memberName methodProto
       statement_or_directive*
    '.end method'
  ;

statement_or_directive
  : registersDirective            #RegisterAlt
  | catchDirective                #CatchAlt
  | catchallDirective             #CatchAllAlt
  | parameterDirective            #ParamterAlt
  | annotation                    #MethodAnnotationAlt
  | label                         #LableAlt
  | lineDirective                 #LineAlt
  | localDirective                #LocalAlt
  | endLocalDirective             #EndLocalAlt
  | restartLocalDirective         #RestartLocalAlt
  | '.prologue'                   #PrologueAlt
  | '.epilogue'                   #EpilogueAlt
  | sourceDirective               #SourceAlt
  | insn_format10t                #Instruction10tAlt
  | insn_format10x                #Instruction10xAlt
  | insn_format10x_odex           #Instruction10xOdexAlt
  | insn_format11n                #Instruction11nAlt
  | insn_format11x                #Instruction11xAlt
  | insn_format12x                #Instruction12xAlt
  | insn_format20bc               #Instruction20bcAlt
  | insn_format20t                #Instruction20tAlt
  | insn_format21c_field          #Instruction21cFieldAlt
  | insn_format21c_field_odex     #Instruction21cFieldOdexAlt
  | insn_format21c_method_handle  #Instruction21cMethodHandleAlt
  | insn_format21c_method_type    #Instruction21cMethodAlt
  | insn_format21c_string         #Instruction21cStringAlt
  | insn_format21c_type           #Instruction21cTypeAlt
  | insn_format21ih               #Instruction21ihAlt
  | insn_format21lh               #Instruction21lhAlt
  | insn_format21s                #Instruction21sAlt
  | insn_format21t                #Instruction21tAlt
  | insn_format22b                #Instruction22bAlt
  | insn_format22c_field          #Instruction22cFieldAlt
  | insn_format22c_field_odex     #Instruction22cFieldOdexAlt
  | insn_format22c_type           #Instruction22cTypeAlt
  | insn_format22cs_field         #Instruction22csFieldAlt
  | insn_format22s                #Instruction22sAlt
  | insn_format22t                #Instruction22tAlt
  | insn_format22x                #Instruction22xAlt
  | insn_format23x                #Instruction23xAlt
  | insn_format30t                #Instruction30tAlt
  | insn_format31c                #Instruction31cAlt
  | insn_format31i                #Instruction31iAlt
  | insn_format31t                #Instruction31tAlt
  | insn_format32x                #Instruction32xAlt
  | insn_format35c_call_site      #Instruction35cCallsiteAlt
  | insn_format35c_method         #Instruction35cMethodAlt
  | insn_format35c_type           #Instruction35cTypeAlt
  | insn_format35c_method_odex    #Instruction35cMethodOdexAlt
  | insn_format35mi_method        #Instruction35miMethodAlt
  | insn_format35ms_method        #Instruction35msMethodAlt
  | insn_format3rc_call_site      #Instruction3rcCallsiteAlt
  | insn_format3rc_method         #Instruction3rcMethodAlt
  | insn_format3rc_method_odex    #Instruction3rcMethodOdexAlt
  | insn_format3rc_type           #Instruction3rcTypeAlt
  | insn_format3rmi_method        #Instruction3rmiMethodAlt
  | insn_format3rms_method        #Instruction3rmsMethodAlt
  | insn_format45cc_method        #Instruction45ccMethodAlt
  | insn_format4rcc_method        #Instruction4rccMethodAlt
  | insn_format51l                #Instruction51lAlt
  | insn_array_data_directive     #InstructionArraydataAlt
  | insn_packed_switch_directive  #InstructionPackedSwitchAlt
  | insn_sparse_switch_directive  #InstructionSparseSwitchAlt
  ;

registersDirective returns[boolean isLocal]
  : '.registers' regCount=integralLiteral {$isLocal=false;}
  | '.locals' regCount=integralLiteral {$isLocal=true;}
  ;

catchDirective
  : '.catch' nonvoid_type_descriptor '{' from=label_ref '..' to=label_ref '}' handle=label_ref
  ;

catchallDirective
  : '.catchall' '{' from=label_ref '..' to=label_ref '}' handle=label_ref
  ;

parameterDirective
  : '.param' reg=REGISTER (',' name=STRING_LITERAL)?
    (annotation* '.end param')?
  ;

integralLiteral returns[int type]
  : LONG_LITERAL {$type=1;}
  | integerLiteral {$type=2;}
  | SHORT_LITERAL {$type=3;}
  | CHAR_LITERAL {$type=4;}
  | BYTE_LITERAL {$type=5;}
  ;

label_ref : ':' simpleName ;

label : ':' simpleName ;

lineDirective : '.line' integralLiteral ;

localDirective
  : '.local' reg=REGISTER (',' (NULL_LITERAL | name=STRING_LITERAL) ':' (VOID_TYPE | type=nonvoid_type_descriptor)
                              (',' signature=STRING_LITERAL)? )?
  ;

endLocalDirective : '.end local' REGISTER ;

restartLocalDirective : '.restart local' REGISTER ;

sourceDirective : '.source' STRING_LITERAL? ;

instruction_format12x
  : INSTRUCTION_FORMAT12x
  | INSTRUCTION_FORMAT12x_OR_ID
  ;

instruction_format22s
  : INSTRUCTION_FORMAT22s
  | INSTRUCTION_FORMAT22s_OR_ID
  ;

instruction_format31i
  : INSTRUCTION_FORMAT31i
  | INSTRUCTION_FORMAT31i_OR_ID
  ;

instruction_format35c_method
  : INSTRUCTION_FORMAT35c_METHOD
  | INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE
  ;

insn_format10t : INSTRUCTION_FORMAT10t label_ref ;

insn_format10x : INSTRUCTION_FORMAT10x ;

insn_format10x_odex : INSTRUCTION_FORMAT10x_ODEX ;

insn_format11n
  : INSTRUCTION_FORMAT11n REGISTER ',' integralLiteral
  ;

insn_format11x : INSTRUCTION_FORMAT11x REGISTER ;

insn_format12x : instruction_format12x reg1=REGISTER ',' reg2=REGISTER ;

insn_format20bc : INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE ',' verification_error_reference ;

insn_format20t : INSTRUCTION_FORMAT20t label_ref ;

insn_format21c_field
  : INSTRUCTION_FORMAT21c_FIELD REGISTER ',' fieldReference
  ;

insn_format21c_field_odex
  : INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER ',' fieldReference
  ;

insn_format21c_method_handle
  : INSTRUCTION_FORMAT21c_METHOD_HANDLE REGISTER ',' methodHandleReference
  ;

insn_format21c_method_type
  : INSTRUCTION_FORMAT21c_METHOD_TYPE REGISTER ',' methodProto
  ;

insn_format21c_string
  : INSTRUCTION_FORMAT21c_STRING REGISTER ',' STRING_LITERAL
  ;

insn_format21c_type
  : INSTRUCTION_FORMAT21c_TYPE REGISTER ',' nonvoid_type_descriptor
  ;

insn_format21ih
  : INSTRUCTION_FORMAT21ih REGISTER ',' fixed32bitLiteral
  ;

insn_format21lh
  : INSTRUCTION_FORMAT21lh REGISTER ',' fixed64bitLiteral
  ;

insn_format21s
  : INSTRUCTION_FORMAT21s REGISTER ',' integralLiteral
  ;

insn_format21t
  : INSTRUCTION_FORMAT21t REGISTER ',' label_ref
  ;

insn_format22b
  : INSTRUCTION_FORMAT22b reg1=REGISTER ',' reg2=REGISTER ',' integralLiteral
  ;

insn_format22c_field
  : INSTRUCTION_FORMAT22c_FIELD reg1=REGISTER ',' reg2=REGISTER ',' fieldReference
  ;

insn_format22c_field_odex
  : INSTRUCTION_FORMAT22c_FIELD_ODEX reg1=REGISTER ',' reg2=REGISTER ',' fieldReference
  ;

insn_format22c_type
  :  INSTRUCTION_FORMAT22c_TYPE reg1=REGISTER ',' reg2=REGISTER ',' nonvoid_type_descriptor
  ;

insn_format22cs_field
  : INSTRUCTION_FORMAT22cs_FIELD reg1=REGISTER ',' reg2=REGISTER ',' FIELD_OFFSET
  ;

insn_format22s
  :instruction_format22s reg1=REGISTER ',' reg2=REGISTER ',' integralLiteral
  ;

insn_format22t
  : INSTRUCTION_FORMAT22t reg1=REGISTER ',' reg2=REGISTER ',' label_ref
  ;

insn_format22x
  : INSTRUCTION_FORMAT22x reg1=REGISTER ',' reg2=REGISTER
  ;

insn_format23x
  : INSTRUCTION_FORMAT23x reg1=REGISTER ',' reg2=REGISTER ',' reg3=REGISTER
  ;

insn_format30t
  : INSTRUCTION_FORMAT30t label_ref
  ;

insn_format31c
  : INSTRUCTION_FORMAT31c REGISTER ',' STRING_LITERAL
  ;

insn_format31i
  : instruction_format31i REGISTER ',' fixed32bitLiteral
  ;

insn_format31t
  : INSTRUCTION_FORMAT31t REGISTER ',' label_ref
  ;

insn_format32x
  : INSTRUCTION_FORMAT32x reg1=REGISTER ',' reg2=REGISTER
  ;

insn_format35c_call_site
  : INSTRUCTION_FORMAT35c_CALL_SITE '{' register_list? '}' ',' callsiteReference
  ;

insn_format35c_method
  : instruction_format35c_method '{' register_list? '}' ',' methodReference
  ;

insn_format35c_type
  : INSTRUCTION_FORMAT35c_TYPE '{' register_list? '}' ',' nonvoid_type_descriptor
  ;

insn_format35c_method_odex
  : INSTRUCTION_FORMAT35c_METHOD_ODEX  '{' register_list? '}' ',' methodReference
  ;

insn_format35mi_method
  : INSTRUCTION_FORMAT35mi_METHOD '{' register_list? '}' ',' INLINE_INDEX
  ;

insn_format35ms_method
  : INSTRUCTION_FORMAT35ms_METHOD '{' register_list? '}' ',' VTABLE_INDEX
  ;

insn_format3rc_call_site
  : INSTRUCTION_FORMAT3rc_CALL_SITE '{' register_range '}' ',' callsiteReference
  ;

insn_format3rc_method
  : INSTRUCTION_FORMAT3rc_METHOD '{' register_range '}' ',' methodReference
  ;

insn_format3rc_method_odex
  : INSTRUCTION_FORMAT3rc_METHOD_ODEX  '{' register_list? '}' ',' methodReference
  ;

insn_format3rc_type
  : INSTRUCTION_FORMAT3rc_TYPE '{' register_range '}' ',' nonvoid_type_descriptor
  ;

insn_format3rmi_method
  : INSTRUCTION_FORMAT3rmi_METHOD '{' register_range '}' ',' INLINE_INDEX
  ;

insn_format3rms_method
  : INSTRUCTION_FORMAT3rms_METHOD  '{' register_range '}' ',' VTABLE_INDEX
  ;

insn_format45cc_method
  : INSTRUCTION_FORMAT45cc_METHOD  '{' register_list? '}' ',' methodReference ',' methodProto
  ;

insn_format4rcc_method
  : INSTRUCTION_FORMAT4rcc_METHOD '{' register_range '}' ',' methodReference ',' methodProto
  ;

insn_format51l
  :  INSTRUCTION_FORMAT51l REGISTER ',' fixed64bitLiteral
  ;

insn_array_data_directive
  : '.array-data' elementWidth=integerLiteral
      fixed64bitLiteral*
    '.end array-data'
  ;

insn_packed_switch_directive
  : '.packed-switch' fixed32bitLiteral
      label_ref*
    '.end packed-switch'
  ;

insn_sparse_switch_directive
  : '.sparse-switch'
       switchElement*
    '.end sparse-switch'
  ;

switchElement
  : fixed32bitLiteral '->' label_ref
  ;
register_list
  : REGISTER (',' REGISTER)*;

register_range
  : (startreg=REGISTER ('..' endreg=REGISTER)?)?
  ;

verification_error_reference
  : CLASS_DESCRIPTOR #TypeErrorAlt
  | fieldReference   #FieldErrorAlt
  | methodReference  #MethodErrotAlt
  ;

callsiteReference
  : simpleName '(' STRING_LITERAL ',' methodProto (',' literal)* ')' '@' methodReference
  ;

fixed32bitLiteral returns[int type]
  : LONG_LITERAL   {$type=1;}
  | integerLiteral {$type=2;}
  | SHORT_LITERAL  {$type=3;}
  | BYTE_LITERAL   {$type=4;}
  | floatLiteral   {$type=5;}
  | CHAR_LITERAL   {$type=6;}
  | BOOL_LITERAL   {$type=7;}
  ;

fixed64bitLiteral returns[int type]
  : integerLiteral {$type=1;}
  | LONG_LITERAL   {$type=2;}
  | SHORT_LITERAL  {$type=3;}
  | BYTE_LITERAL   {$type=4;}
  | floatLiteral   {$type=5;}
  | doubleLiteral  {$type=6;}
  | CHAR_LITERAL   {$type=7;}
  | BOOL_LITERAL   {$type=8;}
  ;


fragment
HexPrefix : '0' [xX] ;

fragment
HexDigit : [0-9a-fA-F] ;

fragment
HexDigits : HexDigit HexDigit HexDigit HexDigit ;

fragment
Integer1 : '0' ;

fragment
Integer2 : [1-9] [0-9]* ;

fragment
Integer3 : '0' [0-7]+ ;

fragment
Integer4 : HexPrefix HexDigit+ ;

fragment
Integer : Integer1 | Integer2 | Integer3 | Integer4 ;

fragment
DecimalExponent : [eE] '-'? [0-9]+ ;

fragment
BinaryExponent : [pP] '-'? [0-9]+ ;

/*This can either be a floating point number or an identifier*/
fragment
FloatOrID1 : '-'? [0-9]+ DecimalExponent ;

fragment
FloatOrID2 : '-'? HexPrefix HexDigit+ BinaryExponent ;

fragment
FloatOrID3 : '-'? [iI][nN][fF][iI][nN][iI][tT][yY] ;

fragment
FloatOrID4 : [nN][aA][nN] ;

fragment
FloatOrID :  FloatOrID1 | FloatOrID2 | FloatOrID3 | FloatOrID4  ;


/*This can only be a float and not an identifier, due to the decimal point*/
fragment
Float1 : '-'? [0-9]+ '.' [0-9]* DecimalExponent? ;

fragment
Float2 : '-'? '.' [0-9]+ DecimalExponent? ;

fragment
Float3 : '-'? HexPrefix HexDigit+ '.' HexDigit* BinaryExponent ;

fragment
Float4 : '-'? HexPrefix '.' HexDigit+ BinaryExponent ;

fragment
Float :  Float1 | Float2 | Float3 | Float4 ;

fragment
HighSurrogate : [\ud800-\udbff] ;

fragment
LowSurrogate : [\udc00-\udfff] ;

fragment
SimpleNameCharacter
  : (HighSurrogate LowSurrogate) | [A-Za-z0-9$\-_\u00a1-\u1fff\u2010-\u2027\u2030-\ud7ff\ue000-\uffef]
  ;

/*Directives*/
CLASS_DIRECTIVE : '.class' ;
SUPER_DIRECTIVE : '.super' ;
IMPLEMENTS_DIRECTIVE : '.implements' ;
SOURCE_DIRECTIVE : '.source' ;
FIELD_DIRECTIVE : '.field' ;
END_FIELD_DIRECTIVE : '.end field' ;
SUBANNOTATION_DIRECTIVE : '.subannotation' ;
END_SUBANNOTATION_DIRECTIVE : '.end subannotation' ;
ANNOTATION_DIRECTIVE : '.annotation' ;
END_ANNOTATION_DIRECTIVE : '.end annotation' ;
ENUM_DIRECTIVE : '.enum' ;
METHOD_DIRECTIVE : '.method' ;
END_METHOD_DIRECTIVE : '.end method' ;
REGISTERS_DIRECTIVE : '.registers' ;
LOCALS_DIRECTIVE : '.locals' ;
ARRAY_DATA_DIRECTIVE : '.array-data' ;
END_ARRAY_DATA_DIRECTIVE : '.end array-data' ;
PACKED_SWITCH_DIRECTIVE : '.packed-switch' ;
END_PACKED_SWITCH_DIRECTIVE : '.end packed-switch' ;
SPARSE_SWITCH_DIRECTIVE : '.sparse-switch' ;
END_SPARSE_SWITCH_DIRECTIVE : '.end sparse-switch' ;
CATCH_DIRECTIVE : '.catch' ;
CATCHALL_DIRECTIVE : '.catchall' ;
LINE_DIRECTIVE : '.line' ;
PARAMETER_DIRECTIVE : '.param' ;
END_PARAMETER_DIRECTIVE : '.end param' ;
LOCAL_DIRECTIVE : '.local' ;
END_LOCAL_DIRECTIVE : '.end local' ;
RESTART_LOCAL_DIRECTIVE : '.restart local' ;
PROLOGUE_DIRECTIVE : '.prologue' ;
EPILOGUE_DIRECTIVE : '.epilogue' ;

/*Literals*/
POSITIVE_INTEGER_LITERAL : Integer ;
NEGATIVE_INTEGER_LITERAL : '-' Integer ;
LONG_LITERAL : '-'? Integer [lL] ;
SHORT_LITERAL : '-'? Integer [sS] ;
BYTE_LITERAL : '-'? Integer [tT] ;

FLOAT_LITERAL_OR_ID : FloatOrID [fF] |  '-'? [0-9]+ [fF] ;
DOUBLE_LITERAL_OR_ID : FloatOrID [dD]? |  '-'? [0-9]+ [dD] ;
FLOAT_LITERAL : Float [fF];
DOUBLE_LITERAL : Float [dD]? ;

BOOL_LITERAL : 'true' | 'false' ;
NULL_LITERAL : 'null' ;

STRING_LITERAL
	:	'"' BASE_STRING_LITERAL* '"';

CHAR_LITERAL
	:	'\'' BASE_CHAR_LITERAL '\'';
fragment
BASE_STRING_LITERAL
  : ~[\r\n\\"]
  | '\\' [bfnrt\\'"]
  | '\\u' HexDigits
  ;
fragment
BASE_CHAR_LITERAL
  : ~[\r\n\\']
  | '\\' [bfnrt\\'"]
  | '\\u' HexDigits
  ;
/*Misc*/
REGISTER :  [vp] [0-9]+ ;
ACCESS_SPEC
  : 'public'
  | 'private' | 'protected' | 'static' | 'final' | 'synchronized' | 'bridge' | 'varargs' | 'native' |
    'abstract' | 'strictfp' | 'synthetic' | 'constructor' | 'declared-synchronized' | 'interface' | 'enum' |
    'annotation' | 'volatile' | 'transient' ;
ANNOTATION_VISIBILITY : 'build' | 'runtime' | 'system' ;
VERIFICATION_ERROR_TYPE
  : 'no-error' | 'generic-error' | 'no-such-class' | 'no-such-field' | 'no-such-method' | 'illegal-class-access' |
    'illegal-field-access' | 'illegal-method-access' | 'class-change-error' | 'instantiation-error'
  ;
INLINE_INDEX : 'inline@0x' HexDigit+ ;
VTABLE_INDEX : 'vtable@0x' HexDigit+ ;
FIELD_OFFSET : 'field@0x' HexDigit+ ;

METHOD_HANDLE_TYPE_FIELD
  : 'static-put' | 'static-get'
  | 'instance-put' | 'instance-get'
  ;
METHOD_HANDLE_TYPE_METHOD
  : 'invoke-instance' | 'invoke-constructor'
  ;
LINE_COMMENT : '#' ~[\r\n]* ->channel(HIDDEN);
/*Instructions*/
INSTRUCTION_FORMAT10t : 'goto' ;
INSTRUCTION_FORMAT10x : 'return-void' | 'nop' ;
INSTRUCTION_FORMAT10x_ODEX : 'return-void-barrier' | 'return-void-no-barrier' ;
INSTRUCTION_FORMAT11n : 'const/4' ;
INSTRUCTION_FORMAT11x
  : 'move-result'
  | 'move-result-wide'
  | 'move-result-object'
  | 'move-exception'
  | 'return'
  | 'return-wide'
  | 'return-object'
  | 'monitor-enter'
  | 'monitor-exit'
  | 'throw'
  ;
INSTRUCTION_FORMAT12x_OR_ID
  : 'move'
  | 'move-wide'
  | 'move-object'
  | 'array-length'
  | 'neg-int'
  | 'not-int'
  | 'neg-long'
  | 'not-long'
  | 'neg-float'
  | 'neg-double'
  | 'int-to-long'
  | 'int-to-float'
  | 'int-to-double'
  | 'long-to-int'
  | 'long-to-float'
  | 'long-to-double'
  | 'float-to-int'
  | 'float-to-long'
  | 'float-to-double'
  | 'double-to-int'
  | 'double-to-long'
  | 'double-to-float'
  | 'int-to-byte'
  | 'int-to-char'
  | 'int-to-short'
  ;
INSTRUCTION_FORMAT12x
  : 'add-int/2addr' | 'sub-int/2addr' | 'mul-int/2addr' | 'div-int/2addr' | 'rem-int/2addr'
  | 'and-int/2addr' | 'or-int/2addr' | 'xor-int/2addr' | 'shl-int/2addr' | 'shr-int/2addr' | 'ushr-int/2addr'
  | 'add-long/2addr' | 'sub-long/2addr' | 'mul-long/2addr' | 'div-long/2addr' | 'rem-long/2addr'
  | 'and-long/2addr' | 'or-long/2addr' | 'xor-long/2addr' | 'shl-long/2addr' | 'shr-long/2addr' | 'ushr-long/2addr'
  | 'add-float/2addr' | 'sub-float/2addr' | 'mul-float/2addr' | 'div-float/2addr' | 'rem-float/2addr'
  | 'add-double/2addr' | 'sub-double/2addr' | 'mul-double/2addr' | 'div-double/2addr' | 'rem-double/2addr'
  ;
INSTRUCTION_FORMAT20bc : 'throw-verification-error' ;
INSTRUCTION_FORMAT20t : 'goto/16' ;
INSTRUCTION_FORMAT21c_FIELD
  : 'sget' | 'sget-wide' | 'sget-object' | 'sget-boolean' | 'sget-byte' | 'sget-char' | 'sget-short'
  | 'sput' | 'sput-wide' | 'sput-object' | 'sput-boolean' | 'sput-byte' | 'sput-char' | 'sput-short'
  ;
INSTRUCTION_FORMAT21c_FIELD_ODEX
  : 'sget-volatile' | 'sget-wide-volatile' | 'sget-object-volatile'
  | 'sput-volatile' | 'sput-wide-volatile' | 'sput-object-volatile'
  ;
INSTRUCTION_FORMAT21c_STRING : 'const-string' ;
INSTRUCTION_FORMAT21c_TYPE
  : 'check-cast' | 'new-instance' | 'const-class'
  ;
INSTRUCTION_FORMAT21c_METHOD_HANDLE : 'const-method-handle' ;
INSTRUCTION_FORMAT21c_METHOD_TYPE : 'const-method-type' ;
INSTRUCTION_FORMAT21ih : 'const/high16' ;
INSTRUCTION_FORMAT21lh : 'const-wide/high16' ;
INSTRUCTION_FORMAT21s
  : 'const/16' | 'const-wide/16'
  ;
INSTRUCTION_FORMAT21t
  : 'if-eqz' | 'if-nez' | 'if-ltz' | 'if-gez' | 'if-gtz' | 'if-lez'
  ;
INSTRUCTION_FORMAT22b
  : 'add-int/lit8' | 'rsub-int/lit8' | 'mul-int/lit8' | 'div-int/lit8' | 'rem-int/lit8' | 'and-int/lit8'
  | 'or-int/lit8' | 'xor-int/lit8' | 'shl-int/lit8' | 'shr-int/lit8' | 'ushr-int/lit8'
  ;
INSTRUCTION_FORMAT22c_FIELD
  : 'iget' | 'iget-wide' | 'iget-object' | 'iget-boolean' | 'iget-byte' | 'iget-char' | 'iget-short'
  | 'iput' | 'iput-wide' | 'iput-object' | 'iput-boolean' | 'iput-byte' | 'iput-char' | 'iput-short'
  ;
INSTRUCTION_FORMAT22c_FIELD_ODEX
  : 'iget-volatile' | 'iget-wide-volatile' | 'iget-object-volatile'
  | 'iput-volatile' | 'iput-wide-volatile' | 'iput-object-volatile'
  ;
INSTRUCTION_FORMAT22c_TYPE
  : 'instance-of' | 'new-array'
  ;
INSTRUCTION_FORMAT22cs_FIELD
  : 'iget-quick' | 'iget-wide-quick' | 'iget-object-quick'
  | 'iput-quick' | 'iput-wide-quick' | 'iput-object-quick'
  | 'iput-boolean-quick' | 'iput-byte-quick' | 'iput-char-quick' | 'iput-short-quick'
  ;
INSTRUCTION_FORMAT22s_OR_ID : 'rsub-int' ;
INSTRUCTION_FORMAT22s
  : 'add-int/lit16' | 'mul-int/lit16' | 'div-int/lit16'
  | 'rem-int/lit16' | 'and-int/lit16' | 'or-int/lit16'
  | 'xor-int/lit16'
  ;
INSTRUCTION_FORMAT22t
  : 'if-eq' | 'if-ne' | 'if-lt' | 'if-ge' | 'if-gt' | 'if-le'
  ;
INSTRUCTION_FORMAT22x
  : 'move/from16' | 'move-wide/from16' | 'move-object/from16'
  ;
INSTRUCTION_FORMAT23x
  : 'cmpl-float' | 'cmpg-float' | 'cmpl-double' | 'cmpg-double' | 'cmp-long'
  | 'aget' | 'aget-wide' | 'aget-object' | 'aget-boolean' | 'aget-byte' | 'aget-char' | 'aget-short'
  | 'aput' | 'aput-wide' | 'aput-object' | 'aput-boolean' | 'aput-byte' | 'aput-char' | 'aput-short'
  | 'add-int' | 'sub-int' | 'mul-int' | 'div-int' | 'rem-int' | 'and-int'
  | 'or-int' | 'xor-int' | 'shl-int' | 'shr-int' | 'ushr-int'
  | 'add-long' | 'sub-long' | 'mul-long' | 'div-long' | 'rem-long' | 'and-long'
  | 'or-long' | 'xor-long' | 'shl-long' | 'shr-long' | 'ushr-long'
  | 'add-float' | 'sub-float' | 'mul-float' | 'div-float' | 'rem-float'
  | 'add-double' | 'sub-double' | 'mul-double' | 'div-double' | 'rem-double'
  ;
INSTRUCTION_FORMAT30t : 'goto/32' ;
INSTRUCTION_FORMAT31c : 'const-string/jumbo' ;
INSTRUCTION_FORMAT31i_OR_ID : 'const' ;
INSTRUCTION_FORMAT31i : 'const-wide/32' ;
INSTRUCTION_FORMAT31t
  : 'fill-array-data' | 'packed-switch' | 'sparse-switch'
  ;
INSTRUCTION_FORMAT32x
  : 'move/16' | 'move-wide/16' | 'move-object/16'
  ;
INSTRUCTION_FORMAT35c_CALL_SITE : 'invoke-custom' ;
INSTRUCTION_FORMAT35c_METHOD
  : 'invoke-virtual' | 'invoke-super'
  ;
INSTRUCTION_FORMAT35c_METHOD_OR_METHOD_HANDLE_TYPE
  : 'invoke-direct' | 'invoke-static' | 'invoke-interface'
  ;
INSTRUCTION_FORMAT35c_METHOD_ODEX : 'invoke-direct-empty' ;
INSTRUCTION_FORMAT35c_TYPE : 'filled-new-array' ;
INSTRUCTION_FORMAT35mi_METHOD : 'execute-inline' ;
INSTRUCTION_FORMAT35ms_METHOD
  : 'invoke-virtual-quick' | 'invoke-super-quick'
  ;
INSTRUCTION_FORMAT3rc_CALL_SITE : 'invoke-custom/range' ;
INSTRUCTION_FORMAT3rc_METHOD
  : 'invoke-virtual/range' | 'invoke-super/range' | 'invoke-direct/range'
  | 'invoke-static/range' | 'invoke-interface/range'
  ;
INSTRUCTION_FORMAT3rc_METHOD_ODEX : 'invoke-object-init/range' ;
INSTRUCTION_FORMAT3rc_TYPE : 'filled-new-array/range' ;
INSTRUCTION_FORMAT3rmi_METHOD : 'execute-inline/range' ;
INSTRUCTION_FORMAT3rms_METHOD
  : 'invoke-virtual-quick/range' | 'invoke-super-quick/rang'
  ;
INSTRUCTION_FORMAT45cc_METHOD : 'invoke-polymorphic' ;
INSTRUCTION_FORMAT4rcc_METHOD : 'invoke-polymorphic/range' ;
INSTRUCTION_FORMAT51l : 'const-wide' ;
/*Types*/
VOID_TYPE : 'V' ;
fragment
SimpleName : SimpleNameCharacter+ ;

CLASS_DESCRIPTOR : 'L' (SimpleName '/')* SimpleName ';' ;
PRIMITIVE_TYPE : [ZBSCIJFD] ;
ARRAY_DESCRIPTOR : '['+ ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR ) ;
TYPE_LIST
  : PRIMITIVE_TYPE PRIMITIVE_TYPE+ CLASS_DESCRIPTOR
  | PRIMITIVE_TYPE  CLASS_DESCRIPTOR
  ;
PRIMITIVE_LIST : PRIMITIVE_TYPE PRIMITIVE_TYPE+ ;
SIMPLE_NAME : SimpleName ;
MEMBER_NAME : '<' SimpleName '>' ;

/*Symbols/Whitespace/EOF*/
DOTDOT : '..' ;
ARROW : '->' ;
EQUAL : '=' ;
COLON : ':' ;
COMMA : ',' ;
OPEN_BRACE : '{' ;
CLOSE_BRACE : '}';
OPEN_PAREN : '(' ;
CLOSE_PAREN : ')' ;
WHITE_SPACE
  :     [\r\n\t ]+  ->channel(HIDDEN)
  ;
AT : '@' ;

fragment
BASE_INVALID_TOKEN
  : '.'  ~[ \n\r\t]*
  | '"' ~[\r\n"]* '"'
  |  '\'' (BASE_CHAR_LITERAL ~'\''*)?
  ;

INVALID_TOKEN : BASE_INVALID_TOKEN -> channel(HIDDEN) ;
