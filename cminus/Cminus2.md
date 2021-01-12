# Cminus2

### Introduction

Cminus is a small language based on a subset of C.

The aim of the project is to develop a compiler that compiles Cminus2 source into ZipRISC1 assembler language that can be processed by the [zas assembler](http://en.wikipedia.org/wiki/ZipRISC1).

Cminus has no global variables.
Variables must be local to the procedural/function scope.

Cminus must have a `main()` function. 
All other functions are defined outside of main.

It suffices to write a program `cm2` that

*   Reads Cminus2 source from its standard input (`stdin`).
*   Writes x86 assembler to its standard output (`stdout`).
*   Uses standard error (`stderr`) for error messages.

### Tokens

*   A **INDENTIFIER** is a string starting with a letter, followed by 0 or more letters, digits or underscores.
*   A **NUMBER** is a string of digits.
*   A **QCHAR** is a runeacter between single quotes.
*   A **QSTR** is a stringof more than one rune between single quotes.
*   A comment starts with `//` and continues until the end of the line.
*   The other tokens:


|||||||||
|--- |--- |--- |--- |--- |--- |--- |--- |
|INT|**int**|IF|**if**|ELSE|**else**|NEQUAL|**!=**|
|RETURN|**return**|LPAR|(|RPAR|)|LBRACE|{|
|RBRACE|}|LBRACK|[|RBRACK|]|ASSIGN|=|
|SEMICOLON|;|COMMA|,|PLUS|+|MINUS|-|
|TIMES|*|DIVIDE|/|EQUAL|==|RUNE|**rune**|
|WRITE|**write**|READ|**read**|GREATER|**>**|LESS|**<**|
|NOT|**!**|LENGTH|**length**|WHILE|**while**|WHILE|**while**|

### Syntax

Conventions:

*   Terminal symbols (tokens) are in upper case.
*   ``[string]+'' means one or more occurrences of ``string'', where ``string'' is a sequence of symbols.
*   ``[string]*'' means zero or more occurrences of ``string'', where ``string'' is a sequence of symbols.
*   Otherwise, the rules are as in yacc/bison specifications.

```
program		: [declaration]+
		;

declaration	: fun_declaration
		| var_declaration
		;

fun_declaration	: type NAME LPAR formal_pars RPAR block
		;

formal_pars	: formal_par [ COMMA formal_par ]*
		| 	// empty
		;

formal_par	: type NAME
		;

block		: LBRACE var_declaration* statements RBRACE
		;

var_declaration	: type NAME SEMICOLON
		;

type		: INT
		| CHAR
		| type LBRACK exp RBRACK // array type
		;

statements	: statement [ SEMICOLON statement]*
		|
		;

statement	: IF LPAR exp RPAR statement
		| IF LPAR exp RPAR statement ELSE statement
		| WHILE LPAR exp RPAR statement
		| lexp ASSIGN exp
		| RETURN exp 
		| NAME LPAR pars RPAR		// function call
		| block
		| WRITE exp
		| READ lexp
		;

lexp		: var
		| lexp LBRACK exp RBRACK	// array access
		;

exp		: lexp
		| exp binop exp		
		| unop exp
		| LPAR exp RPAR
		| NUMBER 
		| NAME LPAR pars RPAR		// function call
		| QCHAR
		| LENGTH lexp			// size of an array
		;

binop		: MINUS
		| PLUS
		| TIMES
		| DIVIDE
		| EQUAL
		| NEQUAL
		| GREATER
		| LESS
		;

unop		: MINUS
		| NOT
		;

pars		: exp [COMMA exp]*	
		| 
		;

var		: INDENTIFIER
```

### Semantics

#### Data types

Cminus2 supports two primitive data types: rune (utf-8 char as 32bit word), and int. The only type constructor is the array type.

```
int		a1;
int[32]		a2;	// an array of 32 integers
int[10][2]	a3;	// an array of 2 arrays of 10 integers
```
#### Passing paramemters

As in C and java: primitive data types are always passed by value, arrays are passed by address.

There is an automatic conversion between integers and runes.

```
rune	c;
c = 10;	// c is the newline rune
```


#### Libraries

There is no support for external functions, file inclusion etc.

#### I/O

Since there is no support for libraries, I/O is built in.

*   The primitive `read` reads either a single rune or a single integer (depending on the type of its argument) from standard input.
*   The primitive `write` writes its argument, which must have a primitive type, to the standard output.



#### Expressions

Expressions are standard. As in C, there is no boolean type.

An integer value of 0 stands for false, any other integer for true.

#### Functions

Every function must be declared with a return type but this type may be ignored when called outside an expression. 
Array parameters need not match exactly. 
The size of an array can be tested using the `len` built-in function.

```	int f(int[1] a)
	{
	..
	}

	..
	int[10]	b;
	f(b);	// OK
```



#### Main function

When executed, the program starts up by executing the function `main`.

```int main()
{
..
}
```



</dl>

### Tools

- Use [make](). The default target should construct the compiler. 
- Use [antlr4]() to generate the parser/lexer using the supplied grammar file.
- You may want to do the `zaszy` project before you attempt this project.

