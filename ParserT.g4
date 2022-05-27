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
declare: WORD SENTENCE TYPETOKEN;

//OPERACIONES
operation: ifst WS | LOOP WS | declare WS;
alloperations: operation | operation alloperations;
