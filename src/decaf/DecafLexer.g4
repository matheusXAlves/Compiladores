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

PL_BOOLEAN : boolean;
PL_BREAK : break;

WS_ : (' ' | '\n' |) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

CHAR : '\''  (ESC|~'\''| '\\t'|'\"'|'\\\\') '\'';
STRING : '"' (ESC|~'"')* '"';

fragment ESC :  '\\' ('n'|'"');
