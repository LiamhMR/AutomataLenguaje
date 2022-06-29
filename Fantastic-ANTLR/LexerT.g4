lexer grammar LexerT;
//DelimitedComment: '/*' ( DelimitedComment | . )*? '*/'
      //-> channel(HIDDEN);
//LineComment: '//' ~[\r\n]*
      //-> channel(HIDDEN);


WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
//WS: ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+;

//PARÉNTESIS
OPENPAREN : '¿';
CLOSEPAREN : '?';
 
STRIN: '!!'; // DOBLE
STROU: '¡¡';


//OPERADORES
PLUS: '+';
LEFT: '-';
MULT: '*';
FRAC: '%';
COMA: ',';
LIKE: '=';
OPENMOUTH: '<';
CLOSEMOUTH: '>';
AND: 'YY';
OR: 'OO';
COND: AND | OR;

//PALABRAS CLAVE

//TIPOS DE DATOS
INT: 'NUMERITO';
STRINGST: 'CADENITA';
BOOLEAN: 'LACUERDADELAVERDADDELAMUJERMARAVILLA';
MATRIX: 'MALLITA';
TYPETOKEN: INT | STRINGST | BOOLEAN | MATRIX;

WORD: CHAR+;
NUMBER: DIGITS+; //NÚMERO
FLAG: 'DOPE'| 'NOPE' | '0' | '1'; //BOOLEAN
STRING: STRIN (CHAR | ' ')+ STROU; //Detector de comillas
MATRIXVAR: (OPENMOUTH (VARIABLE COMA|VARIABLE)+ CLOSEMOUTH)+;

BELIKE: 'IGUALITO'| 'NOIGUALITO' |'GRANDESITO'|'CHIQUITO';
VARIABLE: NUMBER | STRING | FLAG;

READ: 'ESCANEAR';
PRINT: 'TATUAR';

EXP: 'POTENCIA';
ROOT: 'RAIZ';
FACT: 'FACTORIAL';

//CONSTANTES
PI: 'PIPI'; //NÚMERO PI
E: 'EUHH'; //Profe este es el número de EEEEUHHHHHLEER
LIGHT: 'VELOCIDADELALÚH';

BEGIN: 'DALE>';
ENDBEGIN: '<PARÁ';
RETURN: 'SALITE';
IFSTART: 'SINO';
CASE: 'CASO';
THEN: 'SUCEDE';
ENDIF: 'YNAMÁS';
LOOP: 'LOOPEAR';
TILL: 'HASTA';
ATST: 'DURANTE';//AT THE SAME TIME
//WGO: 'SUCEDE'; //WHAT'S GOING ON
STOP: 'HASTAACÁMIBRO';
DO: 'HÁGASE';
SENTENCE: 'TEDECLARO';
DOF: 'DOF'; //DEATH OF FILE

//LITERALES
fragment DIGITS: [0-9]; //DIGITO
fragment CHAR: ('a'..'z'); //PALABRA

