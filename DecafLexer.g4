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

BOOL_WORDS:  'false' | 'true';
IF:          'if'; 
ELSE: 	     'else';
FOR:  	     'for'; 
CLASS: 	     'class'; 
VOID:	     'void'; 
RETURN:      'return';  
CONTINUE:    'continue'; 
BREAK: 	     'break';
PROGRAM:     'Program';



NUM_INT:     ('0'..'9')+ | NUM_HEX;
NUM_HEX:     '0x'[a-fA-F0-9]+;

OPERADORES: '-'|'+'|'='|'*';

CHAR_LITERAL : '\'' ( ESC  | CHAR ) '\'' ;
 
fragment CHAR :	']'..'~' | '#'..'&' | '('..'[' | ' ' | '!' | '\\t' | '\\\\' ;

STRING : '"' (ESC|~'"')* '"';

ID  : ('_' | 'a'..'z' | 'A'..'Z') ('_' | 'a'..'z' | 'A'..'Z' | NUM_INT)+;

WS_ : (' ' | '\n' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

fragment
ESC :  '\\' ('n'|'"');
