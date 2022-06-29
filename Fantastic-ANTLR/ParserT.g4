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
whilest: ATST iteratecompare THEN alloperations STOP | DO alloperations TILL iteratecompare;

//PRINT
tatoo: PRINT (STRING | WORD);

//ARITMETICA
mathvar: (NUMBER | WORD);
mathop: (PLUS|LEFT|MULT|FRAC);
mathplus: mathvar PLUS mathvar;
mathless: mathvar LEFT mathvar;
mathmult: mathvar MULT mathvar;
mathsplit: mathvar FRAC mathvar;
math: (mathvar ((mathop mathvar)+)?);


//VARIABLE DECLARATION
declareint: WORD SENTENCE INT (LIKE math)?;
declarestr: WORD SENTENCE STRINGST (LIKE STRING)?;
declarebool: WORD SENTENCE FLAG (LIKE FLAG)?;
declaremat: WORD SENTENCE MATRIX (LIKE MATRIXVAR)?;
declaration: (declareint | declarestr | declarebool | declaremat);
equalto: WORD (LIKE math | LIKE WORD | LIKE FLAG | LIKE MATRIXVAR);
definir: WORD definiciones;
definiciones: (declaration) (OPENMOUTH NUMBER CLOSEMOUTH)+;


//OPERACIONES
operation: (ifst | loop | declaration| math | tatoo| equalto | WS);
alloperations: (operation)+;
