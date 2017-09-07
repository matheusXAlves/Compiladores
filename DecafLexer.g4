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

ID  : ('_' | 'a'..'z' | 'A'..'Z') ('_' | 'a'..'z' | 'A'..'Z' | [0..9]+)*;

WS_ : (' ' | '\n' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

 CHAR_LITERAL : '\'' ( ESC  | CHAR ) '\'' ;
 
CHAR :	']'..'~' | '#'..'&' | '('..'[' | ' ' | '!'  ;
STRING : '"' (ESC|~'"')* '"';

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

fragment
ESC :  '\\' ('n'|'"');
