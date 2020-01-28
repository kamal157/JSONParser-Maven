lexer grammar JSONLexer;


tokens {

   JSON_OBJECT;
   JSON_ARRAY;
   KEY_VALUE_PAIR;
   KEY;
   VALUE;
}

@header 
{
	package com.cliffy.POC.grammar;
}


NUMBER
 :  '-'? INT       // -3, 45   
 |  '-'? INT EXP             // 1e10 -3e4
 |  '-'? INT '.' ('0'..'9')+ EXP?        // 1.35, 1.35E-9, 0.3, -4.5
 ;
fragment INT :   '0' | ('1'..'9')('0'..'9')* ; // no leading zeros

UNICODE :  HEX HEX HEX HEX ;
fragment HEX : (('0'..'9')('a'..'f')('A'..'F')) ;

STRING :  '"' (ESC | ~( '"' | '\n'|'\r') )* '"' ;
ESC :   '\\' (UNICODE) ;


EXP :  ('e' ('+'|'-')? INT) ; // \- since - means "range" inside [...]
WS  :   (' ' |'\t' |'\n' |'\r' )+ {skip();} ;

FBRACE_OPEN : '{';
FBRACE_CLOSE : '}';
SBRACE_OPEN : '[';
SBRACE_CLOSE : ']';
BOOLEAN_OPTIONS :'true'|'false';
NULL_TEXT:'null';
COLON : ':';
SEP : ',';