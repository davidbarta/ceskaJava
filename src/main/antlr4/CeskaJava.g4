/*
 * https://github.com/antlr/antlr4/blob/master/tool-testsuite/test/org/antlr/v4/test/tool/Java.g4
*/

grammar CeskaJava;


/* ------ Keywords ------  */
/* Types */
BOOLEAN : 'boolean' ;
INT   : 'int' ;

/* Boolean Literals */
TRUE  : 'true' ;
FALSE : 'false' ;

/* Modifiers */
FINAL : 'final';

/* If-else */
IF    : 'if' ;
ELSE  : 'else' ;

/* Switch */
SWITCH  : 'switch' ;
CASE  : 'case' ;
BREAK : 'break';

/* For */
FOR   : 'for' ;
DOWNTO   : 'downto' ;
TO   : 'to' ;

/* While and repeat-until */
WHILE : 'while' ;
DO    : 'do' ;
REPEAT  : 'repeat' ;
UNTIL : 'until' ;

/* Methods */
VOID  : 'void' ;
RETURN : 'return' ;


/* ------ Assignment operators ------ */
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


/* ------ Separators ------ */
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI:   ';';
COMMA:  ',';


/* ------ Literals ------ */
fragment ZERO : '0' ;

DecimalNumeral
	:	ZERO
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment Digit
	:	ZERO
	|	NonZeroDigit
	;

fragment NonZeroDigit
	:	[1-9]
	;

fragment DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment Underscores
	:	'_'+
	;

HexNumeral
	: ZERO [xX] HexDigits
	;

fragment HexDigits
	: HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

fragment HexDigit
	:	[0-9a-fA-F]
	;

fragment HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

Letter
    : [a-zA-Z$_]
    ;

Letter_or_digit
    : [a-zA-Z0-9$_]
    ;

WHITESPACE
    : [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

/* -------------- Grammar -------------- */

boolean_values
    : TRUE
    | FALSE
    ;

varTypes
    : INT
    | BOOLEAN
    ;

decimalSymbol
    : PLUS
    | MINUS
    ;

modifier
    : FINAL
    ;

/* ============= Program ============= */
program
    : block EOF
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

/* ============= Identifiers ============= */
identifier
	:	Letter Letter_or_digit*
	;

/* ============= Statements ============= */
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

/* ============= Expression ============= */
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

/* ============= Variable declaration ============= */
/**
variable_declaration
  :  modifier? varTypes variable_declarators
  ;

  variable_declarators
    :  variable_declarator
    |  variable_declarators COMMA variable_declarator
    ;

  variable_declarator
    :  identifier
    |  identifier EQ expression
    ;
**/

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

/* ============= Expression ============= */
/**
expression
    : conditional_expression
    | assigment_expression
    ;

assigment_expression
    : conditional_expression EQ expression
    ;

conditional_expression
    : infix_expression
    | infix_expression QUESTION expression COLON conditional_expression
    ;

infix_expression
    : prefix_expression
    | infix_expression infix_op prefix_expression
    ;

infix_op
    : OR
    | AND
    | SAME
    | NOT_EQ
    | LT
    | GT
    | LE
    | GE
    | PLUS
    | MINUS
    | MULT
    | DIV
    ;

prefix_expression
    : prefix_op prefix_expression
    | postfix_expression
    ;

postfix_expression
    : LPAREN expression RPAREN
    | literal
    | identifier
    | function_call_statement
    ;

prefix_op
    : NEGATION
    | MINUS
    ;
**/

expression
    : LPAREN expression_body RPAREN
    ;

/* ============= LITERALS ============= */
literal
    : integer_literal
    | boolean_literal
    ;

/* Boolean literal */
boolean_literal
    : TRUE
    | FALSE
    | identifier
    | function_call_statement
    | expression
    ;

/* Decimal integer literal */
integer_literal
    : decimalSymbol? DecimalNumeral
    | HexNumeral
    | identifier
    | function_call_statement
    | expression
    ;


/* ============= FOR ============= */
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

/* ============= SWITCH ============= */
switch_block
  : CASE DecimalNumeral COLON body
  | BREAK SEMI
  ;

/* ============= FUNCTION ============= */
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