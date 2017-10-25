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

EXCLAMA: '!' ;

NUM_INT:     ('0'..'9')+ | NUM_HEX;
NUM_HEX:     '0x'[a-fA-F0-9]+;

PONTO_VIRGULA: 		';' ;
PL: 			'(' ;          
PR: 			')' ;
LCURLY : 		'{' ;
RCURLY : 		'}' ; 
CL: 			'[' ;
CR: 			']' ;
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
INT:		'int';
BOOLEAN:	'boolean';



OPERADOR_BIN: '<=' | '>='| '!=' | '==' | '<' | '>' | '+' | '/' | '-' | '*' ;
OPERADOR_IGUAL: '=';
OPERADOR_MENOS: '-';
OPERADOR_ASSING: '/=' | '+='| '-=' | '*=';

OPERADORES: '!=' | '==' | '<' | '>' | '&&' | '||' | '+' | '*' 
			| '/' | '%' | '-' | '<=' | '>='| '/=' 
			| '+='| '-=' | '*=';

CHAR_LITERAL : '\'' ( ESC  | CHAR ) '\'' ;
 
fragment CHAR :	']'..'~' | '#'..'&' | '('..'[' | ' ' | '!' | '\\t' | '\\\\' ;

STRING : '"' (ESC | CHAR)* '"';

ID  : (('_' | 'a'..'z' | 'A'..'Z' ) | ('_' | 'a'..'z' | 'A'..'Z'  | NUM_INT))+;

fragment LETRAS : 'a'..'z' | 'A'..'Z' ;

fragment ESC :  '\\' ( 'r' | 'n' | 't' | '\'' | '"' | '\\' ) ;
