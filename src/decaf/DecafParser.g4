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

field_decl: (TYPE ID | TYPE ID CL NUM_INT CR)+ PONT_VIRGULA ;

method_decl: (TYPE | VOID) ID PL (TYPE ID)+ PR EOF;






