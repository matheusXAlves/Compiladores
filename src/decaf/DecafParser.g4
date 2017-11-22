parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: CLASS PROGRAM LCURLY field_decl* method_decl* RCURLY EOF;

type: BOOLEAN | INT;

field_decl:  (type ID (VIRGULA type ID)* | type ID CL NUM_INT CR (VIRGULA type ID CL NUM_INT CR)*)* PONTO_VIRGULA ;


method_decl: (type | VOID) ID PL (type ID ( VIRGULA type ID)*)? PR block ; 

block: LCURLY (var_decl)* (statement)* RCURLY ;

var_decl: type ID (VIRGULA ID)* PONTO_VIRGULA ;

statement:       location (OPERADOR_IGUAL|OPERADOR_ASSING ) expr PONTO_VIRGULA
		
 		| method_call PONTO_VIRGULA

		| IF PL expr PR block (ELSE block)?
		
		| FOR  ID OPERADOR_IGUAL expr VIRGULA expr
	
		| RETURN  (expr)+ PONTO_VIRGULA

		| BREAK PONTO_VIRGULA

		| CONTINUE PONTO_VIRGULA
	
		| block ;

method_call:  method_name  PL   ( expr (VIRGULA expr)* )* PR 
		| CALLOUT PL STRING (VIRGULA callout_arg (VIRGULA callout_arg)*)* PR ;

method_name: ID ;

location: ID | ID CL expr CR ;

expr:   location
	| method_call
	| literal
        | expr (OPERADOR_BIN|OPERADOR_MENOS) expr
	| (OPERADOR_BIN|OPERADOR_MENOS) expr
	| EXCLAMA expr
	| PL expr PR ;

callout_arg: expr | STRING ;
 
literal: CHAR_LITERAL | BOOL_WORDS | NUM_INT;

