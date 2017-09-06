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

ID  :
  ('a'..'z' | 'A'..'Z')+;

<<<<<<< HEAD
PL_BOOLEAN : boolean;
PL_BREAK : break;

=======
>>>>>>> 7b1a6c28b3bf543c6edc59f9cac39a9c08125450
WS_ : (' ' | '\n' |) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

CHAR : '\''  (ESC|~'\''| '\\t'|'\"'|'\\\\') '\'';
STRING : '"' (ESC|~'"')* '"';

<<<<<<< HEAD
fragment ESC :  '\\' ('n'|'"');
=======
fragment
ESC :  '\\' ('n'|'"');
>>>>>>> 7b1a6c28b3bf543c6edc59f9cac39a9c08125450
