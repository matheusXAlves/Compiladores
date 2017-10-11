parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: CLASS PROGRAM LCURLY field_decl* method_decl* RCURLY;

field_decl:  type id (',' type id)*  | type id '[' int_literal ']' (',' type id '[' int_literal ']')* ';';

method_decl: (type void) id PL |(type id)+,|PR block;

block: LCURLY var_decl* statement* RCURLY;

var_decl: type id(',' id)*';';

type: NUM_INT | BOOL_WORDS;

statement: location assign_op expr ';'
           | method_call';'
           | IF (expr) block ( ELSE block)? 
           | FOR (id expr ';' expr ';' block)
           | RETURN (expr)?';'
           | BREAK';'
           | CONTINUE';'
           | block;

assign_op: '='
           |'+='
           |'-=';

method_call: method_name (expr (',' expr)*)? 
            |CALLOUT (string_literal (',' callout_arg (',' callout_arg)*)?);

method_name: id;

location: id 
         | id '|' expr '|';

expr: location
      | method_call
      | literal
      | expr bin_op expr
      | - expr
      | ! expr
      | (expr);

callout_arg: expr | string_literal;

bin_op: arith_op | rel_op | eq_op | cond_op;

arith_op: '+'|'-'|'*'|'/'|'%';

rel_op: '/' | '=/';

eq_op: '=='| '!=';

cond_op: '&&'| '||';

literal: int_literal| char_literal| bool_literal;

id: alpha | alpha_num*;

alpha_num: alpha | digit;

alpha: fragment LETRAS;

digit: NUM_INT;

hex_digit: NUM_HEX;

int_literal: decimal_literal | hex_literal;

decimal_literal: digit digit*;

hex_literal: 0x hex_digit hex_digit*;

bool_literal: BOOL_WORDS;

char_literal: CHAR_LITERAL;

string_literal: STRING;


































