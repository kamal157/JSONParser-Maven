parser grammar JSONParser;
 

options
{
   output=AST;   
   language=Java;
   tokenVocab=JSONLexer;
   ASTLabelType=CommonTree;
}


@header 
{
	package com.cliffy.POC.grammar;
}

fragment value
 :   NUMBER
 |   STRING
 |   object  // recursion
 |   array   // recursion
 |   BOOLEAN_OPTIONS // keywords    |   
 |   NULL_TEXT
 ;

fragment pair:   key=STRING COLON val=value  -> ^(KEY_VALUE_PAIR ^(KEY $key) ^(VALUE $val));
fragment object : FBRACE_OPEN each+=pair? (SEP each+=pair)*   FBRACE_CLOSE -> ^(JSON_OBJECT $each*);
fragment array :  SBRACE_OPEN each+=value? (SEP each+=value)*   SBRACE_CLOSE -> ^(JSON_ARRAY $each*);
fragment json:   object |   array ;
 

 
