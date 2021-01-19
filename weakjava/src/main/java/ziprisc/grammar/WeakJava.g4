/* WeakJava */
/* antlr4 -package "ziprisc.parser" -o parser WeakJava.g4 */

grammar WeakJava;

// Parser Rules (things that start with lowercase letters)

program : project ;

project
    : Class Project LeftBrace mainFunction functionList? RightBrace
    ;
    
functionList
    : functionDefinition
    | functionList functionDefinition
    ;
    
mainFunction
    : Int Main Paren Thesis compoundStatement
    ;

functionDefinition
    : typeSpecifier Identifier Paren pars Thesis compoundStatement
    ;

statementList
    : statement
    | statementList statement
    ;

declarationList
    :   declaration
    |   declarationList declaration
    ;

variable : Identifier ;

compoundStatement
    :   LeftBrace declarationList? statementList? RightBrace
    ;

ifStatement
    :   If Paren expr Thesis compoundStatement (Else compoundStatement)?
    ;

whileStatement
    :   While Paren expr Thesis compoundStatement
    ;

assignStatement : lexp Assign expr Semi ;
returnStatement : Return expr Semi ;
functionCall : Identifier  Paren pars  Thesis ;

typeSpecifier
    :   Int
    |   Rune
    |   Boolean
    | typeSpecifier LeftBracket expr RightBracket // array type
    ;

declaration
	: typeSpecifier Identifier Semi
    ;

statement
	: ifStatement
    | whileStatement
    | assignStatement
    | returnStatement 
    | functionCall    // function call
    | compoundStatement
    | Write expr
    | Read lexp
    ;

lexp
    : Identifier
    | lexp LeftBracket expr RightBracket	// array access
    ;

expr
    : lexp
    | expr relationOp expr
    | expr binaryOp expr
    | unop expr
    | Paren expr Thesis
    | Number 
    | QRune
    | Length lexp    	// size of an array
    ;

binaryOp
    : Minus
    | Plus
    | Star
    | Div
    | Mod
    ;

relationOp
    : EqualEqual
    | NotEqual
    | Greater
    | Less
    ;

unop
    : Minus
	| Not
	;

pars
    : typeSpecifier Identifier (Comma typeSpecifier Identifier)*	
    | 
    ;

boolValue : True | False ;

// Lexer Tokens (things which start with Uppercase Letter)

Length : 'len';
Else : 'else';
If : 'if';
Int : 'int';
String : 'string';
Rune : 'rune';
Boolean : 'boolean';
Array : 'array';
Return : 'return';
While : 'while';
Func : 'function';
Main : 'main';
Read : 'read';
Write : 'write';
Class : 'class';
Project : 'Project';
True : 'true' ;
False : 'false' ;

Assign : '=';
EqualEqual : '==';
NotEqual : '!=';
Paren : '(';
Thesis : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';
Quote : '\'';

// *   A **INDENTIFIER** is a string starting with a letter, followed by 0 or more letters, digits or underscores.
// *   A **NUMBER** is a string of digits.
// *   A **QCHAR** is a runeacter between single quotes.
// *   A **QSTR** is a stringof more than one runeacter between single quotes.

Identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;
    
fragment
IdentifierNondigit
    :   Nondigit
    //|   UniversalCharacterName
    //|   // other implementation-defined characters...
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

Number
    :   Digit+
    ;

QRune
    : Quote IdentifierNondigit Quote
    ;

Qstr
    : Quote IdentifierNondigit+ Quote
    ;
// STRING    : '"' ~'"'* '"';


// white space
Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;