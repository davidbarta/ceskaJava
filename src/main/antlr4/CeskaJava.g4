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

methodReturnType
  : INT
  | BOOLEAN
  | VOID
  ;

booleanValue
  : TRUE
  | FALSE
  ;

possibleTypes
  : INT
  | BOOLEAN
  ;

decimalSymbol
  : PLUS
  | MINUS
  ;

identifier
  : WORD (WORD | DECIMAL)*
  ;

possibleValues
  : decimalSymbol? DECIMAL
  | booleanValue
  ;

decimalVariable
  : INT identifier (paralelDeclaration)* EQ decimalSymbol? decimalValue
  ;


decimalValue
  : decimalSymbol? DECIMAL
  | methodCall
  | identifier
  | expressionBody
  ;

boolVariable
  : BOOLEAN identifier (paralelDeclaration)* EQ boolValue
  ;

boolValue
  : booleanValue
  | methodCall
  | identifier
  | expressionBody
  ;

localVariableDeclaration
  : (decimalVariable | boolVariable) SEMI
  ;

constVariableDeclaration
  : CONST localVariableDeclaration
  ;

variableDeclaration
  : (localVariableDeclaration | constVariableDeclaration)
  ;

paralelDeclaration
  : EQ identifier
  ;


variableAssigment
  : identifier EQ expressionBody SEMI
  ;

program
  : block
  ;

block
  : LBRACE blockStatement? RBRACE
  ;

body
  : LBRACE blockBody? RBRACE
  ;

blockStatement
  : (statement
  | methodDeclaration)+
  ;

blockBody
  : (statement)+
  ;

statement
  : IF expression body (ELSE body)?                        #statementIf
  | FOR forControl body                                    #statementFor
  | WHILE expression body                                  #statementWhile
  | DO body WHILE expression                               #statementDo
  | SWITCH expression LBRACE switchBlockStatement* RBRACE  #statementSwitch
  | REPEAT body UNTIL expression                           #statementRepeat
  | methodCall SEMI                                        #statementMethodCall
  | variableAssigment                                      #statementAssigment
  | variableDeclaration                                    #statementVariableDeclaration
  ;

expression
  : LPAREN expressionBody RPAREN
  ;

expressionBody
  : possibleValues                                                          #exprPossibleValue
  | identifier                                                              #exprIdentifier
  | methodCall                                                              #exprMethodCall
  | expressionBody op=(MULT | DIV | MOD) expressionBody                     #exprMultipli
  | expressionBody op=(PLUS | MINUS) expressionBody                         #exprAdditive
  | expressionBody op=(GT | GE | LT | LE | SAME | NOT_EQ) expressionBody    #exprRelational
  | expressionBody op=(AND | OR) expressionBody                             #exprLogical
  | LPAREN expressionBody RPAREN                                            #exprPar
  | NEGATION expressionBody                                                 #exprNeg
  | MINUS expressionBody                                                    #exprMinus
  | PLUS expressionBody                                                     #exprPlus
  ;
  //TODO Maybe MethodRuns
  //TODO Array
  //TODO 'bop=INSTANCEOF typeType'  https://github.com/antlr/grammars-v4/blob/master/java/java/JavaParser.g4


forControl
  : LPAREN identifier EQ decimalSymbol? expressionBody '...' decimalSymbol? expressionBody RPAREN
  ;

switchBlockStatement
  : CASE DECIMAL COLON body
  | DEFAULT COLON body
  ;

methodDeclaration
  : methodReturnType FUNCTION_KEYWORD identifier LPAREN (methodParameter (COMMA methodParameter)*)? RPAREN methodBody
  ;

methodParameter
  : possibleTypes identifier
  ;

methodBody
  : LBRACE blockBody? (RETURN expressionBody SEMI)? RBRACE
  ;

methodCall
  : identifier LPAREN (methodCallParameter (COMMA methodCallParameter)*)? RPAREN
  ;

methodCallParameter
  : expressionBody
  ;
