lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}

tokens
{
  TK_class
}

LCURLY : '{';
RCURLY : '}';

BOOL_WORDS:	'false' | 'true';
PROGRAM: 	'Program';
CLASS: 		'class'; 
VOID:		'void';  
FOR:  		'for';  
RETURN: 	'return';  
CONTINUE: 	'continue';  
IF:             'if'; 
ELSE: 		'else';
BREAK: 		'break';
CALLOUT: 	'callout';
TYPE: 		'boolean' | 'int';

RESERVWORD : 	TYPE | BREAK | CALLOUT | CLASS | CONTINUE | ELSE | FOR | RETURN | IF | VOID | BOOL_WORDS | CLASS | PROGRAM ;

NUM_INT:     ('0'..'9')+ | NUM_HEX;
NUM_HEX:     '0x'[a-fA-F0-9]+;

OPERADORES: '!=' | '==' | '<' | '>' | '&&' | '||' | '+' | '*' 
			| '/' | '%' | '-' | '<=' | '>='| '/=' 
			| '+='| '-=' | '*=';

CHAR_LITERAL : '\'' ( ESC  | CHAR ) '\'' ;
 
fragment CHAR :	']'..'~' | '#'..'&' | '('..'[' | ' ' | '!' | '\\t' | '\\\\' ;

STRING : '"' (ESC | CHAR)* '"';

WS_ : (' ' | '\n' | '\r' | '\t' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

ID  : ('_' | LETRAS) ('_' | LETRAS | NUM_INT)+;
fragment LETRAS : 'a'..'z' | 'A'..'Z' ;

fragment
ESC :  '\\' ( 'r' | 'n' | 't' | '\'' | '"' | '\\' ) ;
