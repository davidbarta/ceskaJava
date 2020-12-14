grammar CeskaJava;

/*------Boolean-------*/
BOOLEAN:'pravdivost' ;
TRUE:'pravda' ;
FALSE:'lez';

INT:'cislo' ;

FINAL:'finalni' ;

/*------IF-------*/
IF:'kdyz' ;
ELSE:'jinak' ;
SWITCH:'moznosti' ;
CASE:'moznost';
BREAK:'odejdi';

/*------CYKLY-------*/
FOR:'tocpro';
WHILE:'toc' ;
DO:'pro' ;
REPEAT:'opakuj';
UNTIL:'dokud';

/*------TRIDA-------*/
CLASS : 'trida';
EXTENDS : 'dedi';
RETURN: 'vrat';

/*------OPERATORY-------*/
OR:         '||' ;
AND:        '&&' ;
SAME:       '==' ;
NOT_EQ :    '!=' ;
LT:         '<' ;
GT:         '>' ;
LE:         '<=' ;
GE:         '>=' ;
PLUS:       '+' ;
MINUS:      '-' ;
MULT:       '*' ;
DIV:        '/' ;
EQ:         '=' ;
QUESTION :  '?' ;
COLON :     ':' ;
NEGATION :  '!';
XUPPER :    'X';
XLOW :      'x';


/* ------ ODDELOVACE ------ */
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI:   ';';


/* ------ LITERALY ------ */

Letter:[a-zA-Z$_];

Letter_or_digit:[a-zA-Z0-9$_];

WHITESPACE:[ \t\r\n\u000C]+ -> skip;

COMMENT : '/*' .*? '*/' -> skip ;

LINE_COMMENT : '//' ~[\r\n]* -> skip;

HexNumeral: ZERO [xX] HexDigits;

fragment ZERO : '0';

fragment NonZeroDigit:[1-9];

DecimalNumeral:	ZERO|NonZeroDigit (Digits? | Underscores Digits);

fragment Digits:Digit (DigitsAndUnderscores? Digit)?;

fragment Digit:	ZERO|NonZeroDigit;

fragment DigitsAndUnderscores:DigitOrUnderscore+;

fragment DigitOrUnderscore:	Digit|	'_';

fragment Underscores:'_'+;

fragment HexDigits:HexDigit (HexDigitsAndUnderscores? HexDigit)?;

fragment HexDigit:[0-9a-fA-F];

fragment HexDigitsAndUnderscores:HexDigitOrUnderscore+;

fragment HexDigitOrUnderscore:HexDigit|'_';

boolean_values
    : TRUE
    | FALSE
    ;

varTypes
    : INT
    | BOOLEAN
    | classType
    ;

referenceType
	:	classOrInterfaceType
	;

classOrInterfaceType
	:	(	classType_lfno_classOrInterfaceType
		|	interfaceType_lfno_classOrInterfaceType
		)
		(	classType_lf_classOrInterfaceType
		|	interfaceType_lf_classOrInterfaceType
		)*
	;


classDeclaration
	:	normalClassDeclaration
	;

normalClassDeclaration
	:	CLASS identifier typeParameters? superclass?  classBody
	;


typeParameters
	:	'<' typeParameterList '>'
	;

typeParameterList
	:	typeParameter (',' typeParameter)*
	;


typeParameter
	:	identifier typeBound?
	;

typeBound
	:	EXTENDS typeVariable
	|	EXTENDS classOrInterfaceType
	;

typeVariable
	: identifier
	;



superclass
	:	'dedi' classType
	;


classBody
	:	'{' classBodyDeclaration* '}'
	;

classBodyDeclaration
	:	classMemberDeclaration
	|	staticInitializer
	;

staticInitializer
	:	'staticky' block
	;

classMemberDeclaration
	:	function_declaration
	|	classDeclaration
	|	';'
	;

elementValue
	:	elementValueArrayInitializer
	;

elementValueArrayInitializer
	:	'{' elementValueList? ','? '}'
	;

elementValueList
	:	elementValue (',' elementValue)*
	;

classType
	:	identifier typeArguments?
	|	classOrInterfaceType '.' identifier typeArguments?
	;

classType_lf_classOrInterfaceType
	:	'.' identifier typeArguments?
	;

classType_lfno_classOrInterfaceType
	: identifier typeArguments?
	;

typeArguments
	:	'<' typeArgumentList '>'
	;

typeArgumentList
	:	typeArgument (',' typeArgument)*
	;

typeArgument
	:	referenceType
	|	wildcard
	;
wildcard
	: '?' wildcardBounds?
	;

wildcardBounds
	:	'extends' referenceType
	|	'super' referenceType
	;


interfaceType_lf_classOrInterfaceType
	:	classType_lf_classOrInterfaceType
	;

interfaceType_lfno_classOrInterfaceType
	:	classType_lfno_classOrInterfaceType
	;

decimalSymbol
    : PLUS
    | MINUS
    ;

modifier
    : FINAL
    ;

block
    : LBRACE block_statement? RBRACE
    ;

body
    : LBRACE block_body? RBRACE
    ;

block_statement
    : (statement
    | function_declaration)+
    ;

block_body
    : (statement)+
    ;


variable_declaration
    :  decimal_variable SEMI
    |  bool_variable SEMI
    ;

decimal_variable
    : (modifier)? INT identifier (parallel_declaration)* EQ integer_literal
    ;

bool_variable
    : (modifier)? BOOLEAN identifier (parallel_declaration)* EQ boolean_literal
    ;

parallel_declaration
    : EQ identifier
    ;

identifier
	:	Letter Letter_or_digit*
	;

expression
    : LPAREN expression_body RPAREN
    ;

statement
    : IF expression body (ELSE body)?               #ifelseStatement
    | WHILE expression body                         #whileStatement
    | DO body WHILE expression                      #dowhileStatement
    | WHILE expression DO body                      #whiledoStatement
    | REPEAT body UNTIL expression                  #repeatuntilStatement
    | FOR for_statement body                        #forStatement
    | SWITCH expression LBRACE switch_block* RBRACE #switchStatement
    | function_call_statement                       #functioncallStatement
    | variable_assigment                            #varassigmentStatement
    | variable_declaration                          #vardeclarationStatement
    | return_statement SEMI                         #returnStatement
    ;

variable_assigment
    : identifier EQ expression_body SEMI
    ;

return_statement
    : RETURN expression
    | RETURN
    ;

expression_body
    : boolean_values    #boolExpression
    | identifier #identifierExpression
    | function_call_statement #funccallExpression
    | expression_body op=(MULT | DIV) expression_body #multanddivExpression
    | expression_body op=(PLUS | MINUS) expression_body #plusandminusExpression
    | expression_body op=(GT | GE | LT | LE | SAME | NOT_EQ) expression_body #relationalExpression
    | expression_body op=(AND | OR) expression_body #logicalExpression
    | LPAREN expression_body RPAREN #expbodyExpression
    | NEGATION expression_body #negationExpression
    ;


boolean_literal
    : TRUE
    | FALSE
    | identifier
    | function_call_statement
    | expression
    ;


integer_literal
    : decimalSymbol? DecimalNumeral
    | HexNumeral
    | identifier
    | function_call_statement
    | expression
    ;

for_type
  : TO
  | DOWNTO
  ;

for_init
  : INT identifier EQ expression_body
  ;

for_statement
  : LPAREN for_init for_type integer_literal RPAREN
  ;


switch_block
  : CASE DecimalNumeral COLON body
  | BREAK SEMI
  ;

function_declaration
  : function_header function_body
  ;

function_header
  : function_type function_declarator
  ;

function_declarator
  : identifier LPAREN (formal_parameter (COMMA formal_parameter)*)? RPAREN function_body
  ;

function_type
  : INT
  | BOOLEAN
  | VOID
  ;

function_body
  : LBRACE (block_body)? RBRACE
  ;

formal_parameter
  : varTypes identifier
  ;

function_call_statement
  : identifier LPAREN (argument_list (COMMA argument_list)*)? RPAREN SEMI
  ;

argument_list
  : expression_body
  ;
