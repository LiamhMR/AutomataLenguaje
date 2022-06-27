package ANTLR;
// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, OPENPAREN=2, CLOSEPAREN=3, STRIN=4, STROU=5, PLUS=6, LEFT=7, MULT=8, 
		FRAC=9, COMA=10, LIKE=11, OPENMOUTH=12, CLOSEMOUTH=13, AND=14, OR=15, 
		COND=16, INT=17, STRINGST=18, BOOLEAN=19, MATRIX=20, TYPETOKEN=21, WORD=22, 
		NUMBER=23, FLAG=24, STRING=25, MATRIXVAR=26, BELIKE=27, VARIABLE=28, READ=29, 
		PRINT=30, EXP=31, ROOT=32, FACT=33, PI=34, E=35, LIGHT=36, BEGIN=37, ENDBEGIN=38, 
		RETURN=39, IFSTART=40, CASE=41, THEN=42, ENDIF=43, LOOP=44, TILL=45, ATST=46, 
		STOP=47, DO=48, SENTENCE=49, DOF=50;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'¿'", "'?'", "'!!'", "'¡¡'", "'+'", "'-'", "'*'", 
		"'%'", "','", "'='", "'<'", "'>'", "'YY'", "'OO'", "COND", "'NUMERITO'", 
		"'CADENITA'", "'LACUERDADELAVERDADDELAMUJERMARAVILLA'", "'MALLITA'", "TYPETOKEN", 
		"WORD", "NUMBER", "FLAG", "STRING", "MATRIXVAR", "BELIKE", "VARIABLE", 
		"'ESCANEAR'", "'TATUAR'", "'POTENCIA'", "'RAIZ'", "'FACTORIAL'", "'PIPI'", 
		"'EUHH'", "'VELOCIDADELALÚH'", "'DALE>'", "'<PARÁ'", "'SALITE'", "'SINO'", 
		"'CASO'", "'SUCEDE'", "'YNAMÁS'", "'LOOPEAR'", "'HASTA'", "'DURANTE'", 
		"'HASTAACÁMIBRO'", "'HÁGASE'", "'TEDECLARO'", "'DOF'"
	};
	public static final int
		RULE_program = 0, RULE_botar = 1, RULE_compare = 2, RULE_iteratecompare = 3, 
		RULE_elsest = 4, RULE_ifcontent = 5, RULE_ifst = 6, RULE_loop = 7, RULE_whilest = 8, 
		RULE_tatoo = 9, RULE_mathplus = 10, RULE_mathless = 11, RULE_mathmult = 12, 
		RULE_mathsplit = 13, RULE_math = 14, RULE_declareint = 15, RULE_declarestr = 16, 
		RULE_declarebool = 17, RULE_declaremat = 18, RULE_declaration = 19, RULE_equalto = 20, 
		RULE_definir = 21, RULE_definiciones = 22, RULE_operation = 23, RULE_alloperations = 24;
	public static final String[] ruleNames = {
		"program", "botar", "compare", "iteratecompare", "elsest", "ifcontent", 
		"ifst", "loop", "whilest", "tatoo", "mathplus", "mathless", "mathmult", 
		"mathsplit", "math", "declareint", "declarestr", "declarebool", "declaremat", 
		"declaration", "equalto", "definir", "definiciones", "operation", "alloperations"
	};

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public AlloperationsContext alloperations() {
			return getRuleContext(AlloperationsContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode ENDBEGIN() { return getToken(ParserTParser.ENDBEGIN, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(BEGIN);
			setState(51); alloperations();
			setState(52); match(ENDBEGIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BotarContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParserTParser.RETURN, 0); }
		public BotarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterBotar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitBotar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBotar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BotarContext botar() throws RecognitionException {
		BotarContext _localctx = new BotarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_botar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(ParserTParser.WORD); }
		public TerminalNode FLAG(int i) {
			return getToken(ParserTParser.FLAG, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode WORD(int i) {
			return getToken(ParserTParser.WORD, i);
		}
		public TerminalNode BELIKE() { return getToken(ParserTParser.BELIKE, 0); }
		public List<TerminalNode> FLAG() { return getTokens(ParserTParser.FLAG); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(56); match(WORD);
				setState(57); match(BELIKE);
				setState(58); match(WORD);
				}
				break;
			case NUMBER:
				{
				setState(59); match(NUMBER);
				setState(60); match(BELIKE);
				setState(61); match(NUMBER);
				}
				break;
			case FLAG:
				{
				setState(62); match(FLAG);
				setState(63); match(BELIKE);
				setState(64); match(FLAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteratecompareContext extends ParserRuleContext {
		public IteratecompareContext iteratecompare() {
			return getRuleContext(IteratecompareContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode COND() { return getToken(ParserTParser.COND, 0); }
		public IteratecompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratecompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterIteratecompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitIteratecompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitIteratecompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratecompareContext iteratecompare() throws RecognitionException {
		IteratecompareContext _localctx = new IteratecompareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_iteratecompare);
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(67); compare();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(68); compare();
				setState(69); match(COND);
				setState(70); iteratecompare();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsestContext extends ParserRuleContext {
		public IteratecompareContext iteratecompare() {
			return getRuleContext(IteratecompareContext.class,0);
		}
		public TerminalNode IFSTART() { return getToken(ParserTParser.IFSTART, 0); }
		public ElsestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterElsest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitElsest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitElsest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestContext elsest() throws RecognitionException {
		ElsestContext _localctx = new ElsestContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elsest);
		try {
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); match(IFSTART);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(IFSTART);
				setState(76); iteratecompare();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfcontentContext extends ParserRuleContext {
		public AlloperationsContext alloperations() {
			return getRuleContext(AlloperationsContext.class,0);
		}
		public ElsestContext elsest() {
			return getRuleContext(ElsestContext.class,0);
		}
		public IfcontentContext ifcontent() {
			return getRuleContext(IfcontentContext.class,0);
		}
		public IfcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterIfcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitIfcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitIfcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcontentContext ifcontent() throws RecognitionException {
		IfcontentContext _localctx = new IfcontentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifcontent);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); alloperations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(80); alloperations();
				setState(81); elsest();
				setState(82); ifcontent();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ParserTParser.CASE, 0); }
		public IteratecompareContext iteratecompare() {
			return getRuleContext(IteratecompareContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ParserTParser.THEN, 0); }
		public TerminalNode ENDIF() { return getToken(ParserTParser.ENDIF, 0); }
		public IfcontentContext ifcontent() {
			return getRuleContext(IfcontentContext.class,0);
		}
		public IfstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterIfst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitIfst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitIfst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstContext ifst() throws RecognitionException {
		IfstContext _localctx = new IfstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(CASE);
			setState(87); iteratecompare();
			setState(88); match(THEN);
			setState(89); ifcontent();
			setState(90); match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public List<TerminalNode> TILL() { return getTokens(ParserTParser.TILL); }
		public AlloperationsContext alloperations() {
			return getRuleContext(AlloperationsContext.class,0);
		}
		public TerminalNode TILL(int i) {
			return getToken(ParserTParser.TILL, i);
		}
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(TILL);
			setState(93); alloperations();
			setState(94); match(TILL);
			setState(95); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestContext extends ParserRuleContext {
		public TerminalNode TILL() { return getToken(ParserTParser.TILL, 0); }
		public TerminalNode ATST() { return getToken(ParserTParser.ATST, 0); }
		public AlloperationsContext alloperations() {
			return getRuleContext(AlloperationsContext.class,0);
		}
		public TerminalNode DO() { return getToken(ParserTParser.DO, 0); }
		public IteratecompareContext iteratecompare() {
			return getRuleContext(IteratecompareContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ParserTParser.THEN, 0); }
		public TerminalNode STOP() { return getToken(ParserTParser.STOP, 0); }
		public WhilestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterWhilest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitWhilest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitWhilest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestContext whilest() throws RecognitionException {
		WhilestContext _localctx = new WhilestContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whilest);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case ATST:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); match(ATST);
				setState(98); iteratecompare();
				setState(99); match(THEN);
				setState(100); alloperations();
				setState(101); match(STOP);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); match(DO);
				setState(104); alloperations();
				setState(105); match(TILL);
				setState(106); iteratecompare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TatooContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TatooContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tatoo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterTatoo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitTatoo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitTatoo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TatooContext tatoo() throws RecognitionException {
		TatooContext _localctx = new TatooContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tatoo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(PRINT);
			{
			setState(111); match(STRING);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathplusContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public TerminalNode PLUS() { return getToken(ParserTParser.PLUS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public MathplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMathplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMathplus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMathplus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathplusContext mathplus() throws RecognitionException {
		MathplusContext _localctx = new MathplusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mathplus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(NUMBER);
			setState(114); match(PLUS);
			setState(115); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathlessContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(ParserTParser.LEFT, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public MathlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMathless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMathless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMathless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathlessContext mathless() throws RecognitionException {
		MathlessContext _localctx = new MathlessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mathless);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(NUMBER);
			setState(118); match(LEFT);
			setState(119); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathmultContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public TerminalNode MULT() { return getToken(ParserTParser.MULT, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public MathmultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathmult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMathmult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMathmult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMathmult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathmultContext mathmult() throws RecognitionException {
		MathmultContext _localctx = new MathmultContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mathmult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(NUMBER);
			setState(122); match(MULT);
			setState(123); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathsplitContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode FRAC() { return getToken(ParserTParser.FRAC, 0); }
		public MathsplitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathsplit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMathsplit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMathsplit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMathsplit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathsplitContext mathsplit() throws RecognitionException {
		MathsplitContext _localctx = new MathsplitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mathsplit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(NUMBER);
			setState(126); match(FRAC);
			setState(127); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathContext extends ParserRuleContext {
		public MathsplitContext mathsplit() {
			return getRuleContext(MathsplitContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public MathplusContext mathplus() {
			return getRuleContext(MathplusContext.class,0);
		}
		public MathmultContext mathmult() {
			return getRuleContext(MathmultContext.class,0);
		}
		public MathlessContext mathless() {
			return getRuleContext(MathlessContext.class,0);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_math);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(129); mathplus();
				}
				break;
			case 2:
				{
				setState(130); mathless();
				}
				break;
			case 3:
				{
				setState(131); mathmult();
				}
				break;
			case 4:
				{
				setState(132); mathsplit();
				}
				break;
			case 5:
				{
				setState(133); match(NUMBER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareintContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ParserTParser.WORD, 0); }
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public DeclareintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDeclareint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDeclareint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclareint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareintContext declareint() throws RecognitionException {
		DeclareintContext _localctx = new DeclareintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declareint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(WORD);
			setState(137); match(SENTENCE);
			setState(138); match(INT);
			setState(141);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(139); match(LIKE);
				setState(140); math();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarestrContext extends ParserRuleContext {
		public TerminalNode STRINGST() { return getToken(ParserTParser.STRINGST, 0); }
		public List<TerminalNode> WORD() { return getTokens(ParserTParser.WORD); }
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode WORD(int i) {
			return getToken(ParserTParser.WORD, i);
		}
		public DeclarestrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarestr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDeclarestr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDeclarestr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclarestr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarestrContext declarestr() throws RecognitionException {
		DeclarestrContext _localctx = new DeclarestrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declarestr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(WORD);
			setState(144); match(SENTENCE);
			setState(145); match(STRINGST);
			setState(148);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(146); match(LIKE);
				setState(147); match(WORD);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareboolContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ParserTParser.WORD, 0); }
		public TerminalNode FLAG(int i) {
			return getToken(ParserTParser.FLAG, i);
		}
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public List<TerminalNode> FLAG() { return getTokens(ParserTParser.FLAG); }
		public DeclareboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarebool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDeclarebool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDeclarebool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclarebool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareboolContext declarebool() throws RecognitionException {
		DeclareboolContext _localctx = new DeclareboolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarebool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(WORD);
			setState(151); match(SENTENCE);
			setState(152); match(FLAG);
			setState(155);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(153); match(LIKE);
				setState(154); match(FLAG);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarematContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ParserTParser.WORD, 0); }
		public TerminalNode MATRIXVAR() { return getToken(ParserTParser.MATRIXVAR, 0); }
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode MATRIX() { return getToken(ParserTParser.MATRIX, 0); }
		public DeclarematContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaremat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDeclaremat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDeclaremat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclaremat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarematContext declaremat() throws RecognitionException {
		DeclarematContext _localctx = new DeclarematContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaremat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(WORD);
			setState(158); match(SENTENCE);
			setState(159); match(MATRIX);
			setState(162);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(160); match(LIKE);
				setState(161); match(MATRIXVAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclareboolContext declarebool() {
			return getRuleContext(DeclareboolContext.class,0);
		}
		public DeclarematContext declaremat() {
			return getRuleContext(DeclarematContext.class,0);
		}
		public DeclarestrContext declarestr() {
			return getRuleContext(DeclarestrContext.class,0);
		}
		public DeclareintContext declareint() {
			return getRuleContext(DeclareintContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(164); declareint();
				}
				break;
			case 2:
				{
				setState(165); declarestr();
				}
				break;
			case 3:
				{
				setState(166); declarebool();
				}
				break;
			case 4:
				{
				setState(167); declaremat();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualtoContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ParserTParser.WORD); }
		public TerminalNode MATRIXVAR() { return getToken(ParserTParser.MATRIXVAR, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode WORD(int i) {
			return getToken(ParserTParser.WORD, i);
		}
		public TerminalNode FLAG() { return getToken(ParserTParser.FLAG, 0); }
		public EqualtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterEqualto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitEqualto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitEqualto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualtoContext equalto() throws RecognitionException {
		EqualtoContext _localctx = new EqualtoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_equalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(WORD);
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(171); match(LIKE);
				setState(172); math();
				}
				break;
			case 2:
				{
				setState(173); match(LIKE);
				setState(174); match(WORD);
				}
				break;
			case 3:
				{
				setState(175); match(LIKE);
				setState(176); match(FLAG);
				}
				break;
			case 4:
				{
				setState(177); match(LIKE);
				setState(178); match(MATRIXVAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinirContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ParserTParser.WORD, 0); }
		public DefinicionesContext definiciones() {
			return getRuleContext(DefinicionesContext.class,0);
		}
		public DefinirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDefinir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDefinir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDefinir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinirContext definir() throws RecognitionException {
		DefinirContext _localctx = new DefinirContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(WORD);
			setState(182); definiciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicionesContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public List<TerminalNode> CLOSEMOUTH() { return getTokens(ParserTParser.CLOSEMOUTH); }
		public TerminalNode OPENMOUTH(int i) {
			return getToken(ParserTParser.OPENMOUTH, i);
		}
		public TerminalNode CLOSEMOUTH(int i) {
			return getToken(ParserTParser.CLOSEMOUTH, i);
		}
		public List<TerminalNode> OPENMOUTH() { return getTokens(ParserTParser.OPENMOUTH); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public DefinicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDefiniciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDefiniciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDefiniciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionesContext definiciones() throws RecognitionException {
		DefinicionesContext _localctx = new DefinicionesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_definiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184); declaration();
			}
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185); match(OPENMOUTH);
				setState(186); match(NUMBER);
				setState(187); match(CLOSEMOUTH);
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPENMOUTH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode WS() { return getToken(ParserTParser.WS, 0); }
		public TatooContext tatoo() {
			return getRuleContext(TatooContext.class,0);
		}
		public EqualtoContext equalto() {
			return getRuleContext(EqualtoContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public IfstContext ifst() {
			return getRuleContext(IfstContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(192); ifst();
				}
				break;
			case 2:
				{
				setState(193); loop();
				}
				break;
			case 3:
				{
				setState(194); declaration();
				}
				break;
			case 4:
				{
				setState(195); math();
				}
				break;
			case 5:
				{
				setState(196); tatoo();
				}
				break;
			case 6:
				{
				setState(197); equalto();
				}
				break;
			case 7:
				{
				setState(198); match(WS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlloperationsContext extends ParserRuleContext {
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public AlloperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alloperations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterAlloperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitAlloperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitAlloperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlloperationsContext alloperations() throws RecognitionException {
		AlloperationsContext _localctx = new AlloperationsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alloperations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(201); operation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u00d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4D\n\4\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7W\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0089\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0090"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0097\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u009e\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00a5\n\24\3\25\3\25\3"+
		"\25\3\25\5\25\u00ab\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00b6\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\6\30\u00bf\n\30\r"+
		"\30\16\30\u00c0\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ca\n\31\3\32"+
		"\6\32\u00cd\n\32\r\32\16\32\u00ce\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\2\2\u00d3\2\64\3\2\2\2\48\3\2\2\2\6C\3"+
		"\2\2\2\bJ\3\2\2\2\nO\3\2\2\2\fV\3\2\2\2\16X\3\2\2\2\20^\3\2\2\2\22n\3"+
		"\2\2\2\24p\3\2\2\2\26s\3\2\2\2\30w\3\2\2\2\32{\3\2\2\2\34\177\3\2\2\2"+
		"\36\u0088\3\2\2\2 \u008a\3\2\2\2\"\u0091\3\2\2\2$\u0098\3\2\2\2&\u009f"+
		"\3\2\2\2(\u00aa\3\2\2\2*\u00ac\3\2\2\2,\u00b7\3\2\2\2.\u00ba\3\2\2\2\60"+
		"\u00c9\3\2\2\2\62\u00cc\3\2\2\2\64\65\7\'\2\2\65\66\5\62\32\2\66\67\7"+
		"(\2\2\67\3\3\2\2\289\7)\2\29\5\3\2\2\2:;\7\30\2\2;<\7\35\2\2<D\7\30\2"+
		"\2=>\7\31\2\2>?\7\35\2\2?D\7\31\2\2@A\7\32\2\2AB\7\35\2\2BD\7\32\2\2C"+
		":\3\2\2\2C=\3\2\2\2C@\3\2\2\2D\7\3\2\2\2EK\5\6\4\2FG\5\6\4\2GH\7\22\2"+
		"\2HI\5\b\5\2IK\3\2\2\2JE\3\2\2\2JF\3\2\2\2K\t\3\2\2\2LP\7*\2\2MN\7*\2"+
		"\2NP\5\b\5\2OL\3\2\2\2OM\3\2\2\2P\13\3\2\2\2QW\5\62\32\2RS\5\62\32\2S"+
		"T\5\n\6\2TU\5\f\7\2UW\3\2\2\2VQ\3\2\2\2VR\3\2\2\2W\r\3\2\2\2XY\7+\2\2"+
		"YZ\5\b\5\2Z[\7,\2\2[\\\5\f\7\2\\]\7-\2\2]\17\3\2\2\2^_\7/\2\2_`\5\62\32"+
		"\2`a\7/\2\2ab\7\31\2\2b\21\3\2\2\2cd\7\60\2\2de\5\b\5\2ef\7,\2\2fg\5\62"+
		"\32\2gh\7\61\2\2ho\3\2\2\2ij\7\62\2\2jk\5\62\32\2kl\7/\2\2lm\5\b\5\2m"+
		"o\3\2\2\2nc\3\2\2\2ni\3\2\2\2o\23\3\2\2\2pq\7 \2\2qr\7\33\2\2r\25\3\2"+
		"\2\2st\7\31\2\2tu\7\b\2\2uv\7\31\2\2v\27\3\2\2\2wx\7\31\2\2xy\7\t\2\2"+
		"yz\7\31\2\2z\31\3\2\2\2{|\7\31\2\2|}\7\n\2\2}~\7\31\2\2~\33\3\2\2\2\177"+
		"\u0080\7\31\2\2\u0080\u0081\7\13\2\2\u0081\u0082\7\31\2\2\u0082\35\3\2"+
		"\2\2\u0083\u0089\5\26\f\2\u0084\u0089\5\30\r\2\u0085\u0089\5\32\16\2\u0086"+
		"\u0089\5\34\17\2\u0087\u0089\7\31\2\2\u0088\u0083\3\2\2\2\u0088\u0084"+
		"\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\37\3\2\2\2\u008a\u008b\7\30\2\2\u008b\u008c\7\63\2\2\u008c\u008f\7\23"+
		"\2\2\u008d\u008e\7\r\2\2\u008e\u0090\5\36\20\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090!\3\2\2\2\u0091\u0092\7\30\2\2\u0092\u0093\7\63\2"+
		"\2\u0093\u0096\7\24\2\2\u0094\u0095\7\r\2\2\u0095\u0097\7\30\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097#\3\2\2\2\u0098\u0099\7\30\2\2"+
		"\u0099\u009a\7\63\2\2\u009a\u009d\7\32\2\2\u009b\u009c\7\r\2\2\u009c\u009e"+
		"\7\32\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e%\3\2\2\2\u009f"+
		"\u00a0\7\30\2\2\u00a0\u00a1\7\63\2\2\u00a1\u00a4\7\26\2\2\u00a2\u00a3"+
		"\7\r\2\2\u00a3\u00a5\7\34\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\'\3\2\2\2\u00a6\u00ab\5 \21\2\u00a7\u00ab\5\"\22\2\u00a8\u00ab"+
		"\5$\23\2\u00a9\u00ab\5&\24\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab)\3\2\2\2\u00ac\u00b5\7\30\2\2"+
		"\u00ad\u00ae\7\r\2\2\u00ae\u00b6\5\36\20\2\u00af\u00b0\7\r\2\2\u00b0\u00b6"+
		"\7\30\2\2\u00b1\u00b2\7\r\2\2\u00b2\u00b6\7\32\2\2\u00b3\u00b4\7\r\2\2"+
		"\u00b4\u00b6\7\34\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6+\3\2\2\2\u00b7\u00b8\7\30\2\2\u00b8"+
		"\u00b9\5.\30\2\u00b9-\3\2\2\2\u00ba\u00be\5(\25\2\u00bb\u00bc\7\16\2\2"+
		"\u00bc\u00bd\7\31\2\2\u00bd\u00bf\7\17\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1/\3\2\2\2\u00c2"+
		"\u00ca\5\16\b\2\u00c3\u00ca\5\20\t\2\u00c4\u00ca\5(\25\2\u00c5\u00ca\5"+
		"\36\20\2\u00c6\u00ca\5\24\13\2\u00c7\u00ca\5*\26\2\u00c8\u00ca\7\3\2\2"+
		"\u00c9\u00c2\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5"+
		"\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\61\3\2\2\2\u00cb\u00cd\5\60\31\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\63\3\2\2\2\21CJOVn"+
		"\u0088\u008f\u0096\u009d\u00a4\u00aa\u00b5\u00c0\u00c9\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}