<<<<<<<<<<<<<<<<<<<<<<<<<<<LEXER>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
lexer grammar LexerT;

//R  : 'WENA' ID ;         // match keyword hello followed by an identifier

//ID : [A-Za-z0-9]+;             // match lower-case identifiers

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
LIKE: '=';
OPENMOUTH: '<';
CLOSEMOUTH: '>';
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
DOF: 'DOF'; //DEATH OF FILE
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<PARSER>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
grammar ParserT;
import LexerT;

//FUNCIONES 
program: BEGIN alloperations ENDBEGIN;
botar: RETURN; //RETURN

//CONDICIONALES
compare: WORD BELIKE WORD | NUMBER BELIKE NUMBER | FLAG BELIKE FLAG;
iteratecompare: compare | compare COND iteratecompare;

//IF - RULE
elsest: IFSTART | IFSTART iteratecompare ;
ifcontent: alloperations | alloperations elsest ifcontent;
ifst: CASE iteratecompare THEN ifcontent ENDIF;

//LOOP
loop: TILL alloperations TILL NUMBER;

//MIENTRAS
whilest: ATST iteratecompare WGO alloperations STOP | DO alloperations TILL iteratecompare;

//VARIABLE DECLARATION
declare: WORD SENTENCE TYPETOKEN | WORD SENTENCE TYPETOKEN definir;
definir: WORD definiciones;
definiciones: definirNum | definirStr | definirFlag | definirMatrix;
definirNum: LIKE NUMBER; 
definirStr: LIKE WORD;
definirFlag: LIKE FLAG;
definirMatrix: LIKE (OPENMOUTH NUMBER CLOSEMOUTH)+;

//OPERACIONES
operation: ifst WS | LOOP WS | declare WS;
alloperations: operation | operation alloperations;
