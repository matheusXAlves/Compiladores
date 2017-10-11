parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: CLASS PROGRAM LCURLY (field_decl)* (method_decl)* RCURLY EOF ;

field_decl:  ( TYPE ID (VIRGULA TYPE ID )? PONTO_VIRGULA | TYPE ID '[' INT_LITERAL ']' (VIRGULA ID CL INT_LITERAL CR )? PONTO_VIRGULA );

method_decl: (TYPE | VOID) ID PL (TYPE ID ( VIRGULA TYPE ID)*)? PR block ; 

block: LCURLY (var_decl)* (statement)* RCURLY ;

var_decl: TYPE ID (VIRGULA ID)* PONT_VIRGULA ;

statement:       location (OPERADOR_IGUAL|OPERADOR_ASSING ) expr PONT_V
		
 		| method_call PONTO_VIRGULA

		| IF PL expr PR block (ELSE block)?
		
		| FOR  ID OPERADOR_IGUAL expr VIRGULA expr
	
		| RETURN  (expr)? PONTO_VIRGULA

		| BREAK PONTO_VIRGULA

		| CONTINUE PONTO_VIRGULA
	
		| block ;

method_call:  method_name  PL   ( expr (VIRGULA expr)* )? PR 
		| CALLOUT PL STRING (VIRGULA callout_arg (VIRGULA callout_arg)*)? PR ;

method_name: ID ;

location: ID | ID CL expr CR ;

expr:   location
	| method_call
	| literal
        | expr (OPERADOR_BIN|OPERADOR_MENOS) expr
	| OPERADOR_MENOS  expr
	| EXCLAMA expr
	| PL expr PR ;

callout_arg: expr | STRING ;
 
literal: CHAR_LITERAL | BOOL_WORDS | NUM_INT;

