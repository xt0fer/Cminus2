/* Cminus */
/* antlr4 -package "ziprisc.parser" -o parser Cminus2.g4 */

grammar Cminus2;

// Parser Rules (things that start with lowercase letters)

program
    : mainFunction functionList?
    ;
    
functionList
    : functionDefinition
    | functionList functionDefinition
    ;
    
mainFunction
    : Int Main Paren Thesis compoundStatement
    ;

functionDefinition
    : typeSpecifier Main Paren pars Thesis compoundStatement
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
    :   If Paren exp Thesis compoundStatement (Else compoundStatement)?
    ;

whileStatement
    :   While Paren exp Thesis compoundStatement
    ;

typeSpecifier
    :   Int
    |   Rune
    | typeSpecifier LeftBracket exp RightBracket // array type
    ;

declaration
	: typeSpecifier Identifier Semi
    ;

statement
	: If  Paren exp  Thesis compoundStatement
    | If  Paren exp  Thesis compoundStatement Else compoundStatement
    | While  Paren exp  Thesis compoundStatement
    | lexp Assign exp Semi
    | Return exp 
    | Identifier  Paren pars  Thesis    // function call
    | compoundStatement
    | Write exp
    | Read lexp
    ;

lexp
    : Identifier
    | lexp LeftBracket exp RightBracket	// array access
    ;

exp
    : lexp
    | exp binop exp    
    | unop exp
    |  Paren exp  Thesis
    | DigitSequence 
    | Identifier  Paren pars  Thesis    // function call
    | QRune
    | Length lexp    	// size of an array
    ;

binop
    : Minus
    | Plus
    | Star
    | Div
    | EqualEqual
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

// Lexer Tokens (things which start with Uppercase Letter)

Length : 'len';
Else : 'else';
If : 'if';
Int : 'int';
String : 'string';
Rune : 'rune';
Array : 'array';
Return : 'return';
While : 'while';
Func : 'function';
Main : 'main';
Read : 'read';
Write : 'write';

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

DigitSequence
    :   Digit+
    ;

QRune
    : Quote IdentifierNondigit Quote
    ;

Qstr
    : Quote IdentifierNondigit+ Quote
    ;

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