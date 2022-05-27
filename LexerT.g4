lexer grammar LexerT;

R  : 'WENA' ID ;         // match keyword hello followed by an identifier

ID : [A-Za-z0-9]+;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

LETRAS: [a-z]+; //LETRAS
DIGITS: [0-9]+; //DIGITO
NUMBER: DIGITS+; //NÚMERO
WORD: LETRAS+; //PALABRA
FLAG: 'DOPE'| 'NOPE' | '0' | '1'; //BOOLEAN
SINGLE_STRING: '<' ~('\'')+ '>'; // SIMPLE
DOUBLE_STRING: '<<' ~('"')+ '>>'; // DOBLE
STRING: SINGLE_STRING | DOUBLE_STRING; //Detector de comillas

//OPERADORES
PLUS: '+';
LEFT: '-';
MULT: '*';
FRAC: '%';

//PARÉNTESIS
OPENPAREN : '¿' {self.opened += 1};
CLOSEPAREN : '?' {self.opened -= 1};

BELIKE: 'IGUALITO'| 'NOIGUALITO' |'GRANDESITO'|'CHIQUITO';
AND: 'YY';
OR: 'OO';
COND: AND | OR;
VARIABLE: NUMBER | STRING | FLAG;

//TIPOS DE DATOS
INT: 'NUMERITO';
STRINGST: 'CADENITA';
BOOLEAN: 'LACUERDADELAVERDADDELAMUJERMARAVILLA';
MATRIX: 'MALLITA';
TYPETOKEN: INT | STRINGST | BOOLEAN | MATRIX;

READ: 'ESCANEAR';
PRINT: 'TATUAR';

EXP: 'POTENCIA';
ROOT: 'RAIZ';
FACT: 'FACTORIAL';

//CONSTANTES
PI: 'PIPI'; //NÚMERO PI
E: 'EUHH'; //Profe este es el número de EEEEUHHHHHLEER
LIGHT: 'VELOCIDADELALÚH';

BEGIN: 'DALE';
ENDBEGIN: 'PARÁ';
RETURN: 'SALITE';
IFSTART: 'SINO';
CASE: 'CASO';
THEN: 'SUCEDE';
ENDIF: 'YNAMÁS';
LOOP: 'LOOPEAR';
TILL: 'HASTA';
ATST: 'DURANTE';//AT THE SAME TIME
WGO: 'SUCEDE'; //WHAT'S GOING ON
STOP: 'HASTAACÁMIBRO';
DO: 'HÁGASE';
SENTENCE: 'TEDECLARO';
EOF: 'DOF';
