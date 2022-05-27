/**
VARIABLES✓
CONSTANTES
3 TIPOS DE DATOS✓
LECTURA E IMPRESIÓN
UNA ESTRUCTURA CONDICIONAL✓
2 ESTRUCTURA REPETITIVA
2 OPERADORES LOGICOS✓
OPERADORES MATEMÁTICOS BÁSICOS✓
3 FUNCIONES MATEMÁTICAS
*/

/**
 * Define a grammar called LosPibes
 */
grammar Fantastic;
r  : 'hello' ID ;         // match keyword hello followed by an identifier

ID : [A-Za-z0-9]+;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

LETRAS: [A-Za-z]+; //LETRAS
DIGITS: [0-9]+; //DIGITO
NUMBER: DIGITS+; //NÚMERO
WORD: LETRAS+; //PALABRA
FLAG: 'DOPE'| 'NOPE' | 0 | 1; //BOOLEAN
SINGLE_STRING: '<' ~('\'')+ '>'; // SIMPLE
DOUBLE_STRING: '<<' ~('"')+ '>>'; // DOBLE
STRING: SINGLE_STRING | DOUBLE_STRING; //Detector de comillas

PLUS: "+";
LEFT: "-";
MULT: "*";
FRAC: "/";

BELIKE: 'IGUALITO'| 'NOIGUALITO' |'GRANDESITO'|'CHIQUITO';
AND: 'YY';
OR: 'OO';
COND: AND | OR;
VARIABLE: NUMBER | STRING | FLAG;
TYPESTOKENS: "NUMERITO" | "CADENITA" | "LA CUERDA DE LA VERDAD DE LA MUJER MARAVILLA" | "MALLITA";

ALLOPERATIONS="";
//FUNCIONES 
SUB: "DALE"; //ABRIR UNA FUNCIÓN
ENDSUB: "PARÁ"; //CERRAR UNA FUNCIÓN
RETURN: "SALITE"; //RETURN

//SUMA
SUMA: NUMBER 

//IF - RULE
COMPARE: WORD BELIKE WORD | NUMBER BELIKE NUMBER | FLAG BELIKE FLAG;
ITERATECOMPARE: COMPARE | COMPARE COND ITERATECOMPARE;
ELSE: "SI NO" | "SI NO" ITERATECOMPARE ;
IFCONTENT: ALLOPERATIONS | ALLOPERATIONS ELSE IFCONTENT;
IF: "EN CASO DE" ITERATECOMPARE "SUCEDE" IFCONTENT "Y NADA MÁS";

//VARIABLE DECLARATION
DECLARE: WORD "TE DECLARO" TYPESTOKENS;

tokens {SUB, ENDSUB,RETURN, "EN CASO DE" , "SUCEDE" , "Y NADA MÁS"}
@lever::members{
  Map<String,Integer>
}

