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

WS_ : (' ' | '\n' | '\r' | '\t' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

PL: 			'(' ;          
PR: 			')' ;
LCURLY : 		'{' ;
RCURLY : 		'}' ; 
CL: 			'[' ;
CR: 			']' ;
PONTO_VIRGULA: 		';' ;
VIRGULA:  		',' ; 

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
OPERADOR_BIN: '<=' | '>='| '!=' | '==';
OPERADOR_IGUAL: '=';
OPERADOR_MENOS: '-';
OPERADOR_ASSING: '/=' | '+='| '-=' | '*=';

CHAR_LITERAL : '\'' ( ESC  | CHAR ) '\'' ;
 
CHAR :	']'..'~' | '#'..'&' | '('..'[' | ' ' | '!' | '\\t' | '\\\\' ;

STRING : '"' (ESC | CHAR)* '"';

ID  : ('_' | LETRAS) ('_' | LETRAS | NUM_INT)+;
LETRAS : 'a'..'z' | 'A'..'Z' ;

ESC :  '\\' ( 'r' | 'n' | 't' | '\'' | '"' | '\\' ) ;
