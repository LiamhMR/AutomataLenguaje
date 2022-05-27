/**
 * Define a grammar called Hello
 */
grammar Fantastic;
r  : 'hello' ID ;         // match keyword hello followed by an identifier

ID : [A-Za-z0-9]+;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

LETRAS: [A-Za-z]+;
DIGITS: [0-9]+;
NUMBER: DIGITS+;
WORD: LETRAS+;
FLAG: 'true'| 'false';
SINGLE_STRING: '\'' ~('\'')+ '\''; //COMILLA SIMPLE
DOUBLE_STRING: '"' ~('"')+ '"'; //COMILLA DOBLE
STRING: SINGLE_STRING | DOUBLE_STRING; //Detector de comillas
OPERATORS: '+'|'-'|'*'|'/';
BELIKE: '=='| '!=' |'>='|'<=';
AND: 'YY';
OR: 'OO';

