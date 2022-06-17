grammar ParserT;
import LexerT;
options { tokenVocab = LexerT; }
//FUNCIONES 
program: BEGIN alloperations ENDBEGIN;
botar: RETURN; //RETURN

//CONDICIONALES
compare: (WORD BELIKE WORD | NUMBER BELIKE NUMBER | FLAG BELIKE FLAG);
iteratecompare: (compare) | (compare COND iteratecompare);

//IF - RULE
elsest: IFSTART | IFSTART iteratecompare ;
ifcontent: alloperations | (alloperations elsest ifcontent);
ifst: CASE iteratecompare THEN ifcontent ENDIF;

//LOOP
loop: TILL alloperations TILL NUMBER;

//MIENTRAS
whilest: ATST iteratecompare WGO alloperations STOP | DO alloperations TILL iteratecompare;

//VARIABLE DECLARATION
declareint: WORD SENTENCE INT (LIKE NUMBER)?;
declarestr: WORD SENTENCE STRINGST (LIKE WORD)?;
declarebool: WORD SENTENCE FLAG (LIKE FLAG)?;
declaremat: WORD SENTENCE MATRIX (LIKE MATRIXVAR)?;
declaration: declareint | declarestr | declarebool | declaremat;
equalto: WORD (LIKE NUMBER | LIKE WORD | LIKE FLAG | LIKE MATRIXVAR);
definir: WORD definiciones;
definiciones: (declaration) (OPENMOUTH NUMBER CLOSEMOUTH)+;


//OPERACIONES
operation: (ifst | LOOP | declareint | declarestr | declaremat | declarebool | equalto | WS);
alloperations: operation | operation alloperations;
