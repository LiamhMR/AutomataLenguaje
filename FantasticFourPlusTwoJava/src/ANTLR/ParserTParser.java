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
		RULE_tatoo = 9, RULE_declareint = 10, RULE_declarestr = 11, RULE_declarebool = 12, 
		RULE_declaremat = 13, RULE_declaration = 14, RULE_equalto = 15, RULE_definir = 16, 
		RULE_definiciones = 17, RULE_operation = 18, RULE_alloperations = 19;
	public static final String[] ruleNames = {
		"program", "botar", "compare", "iteratecompare", "elsest", "ifcontent", 
		"ifst", "loop", "whilest", "tatoo", "declareint", "declarestr", "declarebool", 
		"declaremat", "declaration", "equalto", "definir", "definiciones", "operation", 
		"alloperations"
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
			setState(40); match(BEGIN);
			setState(41); alloperations();
			setState(42); match(ENDBEGIN);
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
			setState(44); match(RETURN);
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
			setState(55);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(46); match(WORD);
				setState(47); match(BELIKE);
				setState(48); match(WORD);
				}
				break;
			case NUMBER:
				{
				setState(49); match(NUMBER);
				setState(50); match(BELIKE);
				setState(51); match(NUMBER);
				}
				break;
			case FLAG:
				{
				setState(52); match(FLAG);
				setState(53); match(BELIKE);
				setState(54); match(FLAG);
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
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(57); compare();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(58); compare();
				setState(59); match(COND);
				setState(60); iteratecompare();
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
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(IFSTART);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(IFSTART);
				setState(66); iteratecompare();
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
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); alloperations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(70); alloperations();
				setState(71); elsest();
				setState(72); ifcontent();
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
			setState(76); match(CASE);
			setState(77); iteratecompare();
			setState(78); match(THEN);
			setState(79); ifcontent();
			setState(80); match(ENDIF);
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
			setState(82); match(TILL);
			setState(83); alloperations();
			setState(84); match(TILL);
			setState(85); match(NUMBER);
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
			setState(98);
			switch (_input.LA(1)) {
			case ATST:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); match(ATST);
				setState(88); iteratecompare();
				setState(89); match(THEN);
				setState(90); alloperations();
				setState(91); match(STOP);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(DO);
				setState(94); alloperations();
				setState(95); match(TILL);
				setState(96); iteratecompare();
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
			setState(100); match(PRINT);
			{
			setState(101); match(STRING);
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
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
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
		enterRule(_localctx, 20, RULE_declareint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(WORD);
			setState(104); match(SENTENCE);
			setState(105); match(INT);
			setState(108);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(106); match(LIKE);
				setState(107); match(NUMBER);
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
		enterRule(_localctx, 22, RULE_declarestr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(WORD);
			setState(111); match(SENTENCE);
			setState(112); match(STRINGST);
			setState(115);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(113); match(LIKE);
				setState(114); match(WORD);
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
		enterRule(_localctx, 24, RULE_declarebool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(WORD);
			setState(118); match(SENTENCE);
			setState(119); match(FLAG);
			setState(122);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(120); match(LIKE);
				setState(121); match(FLAG);
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
		enterRule(_localctx, 26, RULE_declaremat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(WORD);
			setState(125); match(SENTENCE);
			setState(126); match(MATRIX);
			setState(129);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(127); match(LIKE);
				setState(128); match(MATRIXVAR);
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
		enterRule(_localctx, 28, RULE_declaration);
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); declareint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); declarestr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133); declarebool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); declaremat();
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

	public static class EqualtoContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ParserTParser.WORD); }
		public TerminalNode MATRIXVAR() { return getToken(ParserTParser.MATRIXVAR, 0); }
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
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
		enterRule(_localctx, 30, RULE_equalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(WORD);
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(138); match(LIKE);
				setState(139); match(NUMBER);
				}
				break;
			case 2:
				{
				setState(140); match(LIKE);
				setState(141); match(WORD);
				}
				break;
			case 3:
				{
				setState(142); match(LIKE);
				setState(143); match(FLAG);
				}
				break;
			case 4:
				{
				setState(144); match(LIKE);
				setState(145); match(MATRIXVAR);
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
		enterRule(_localctx, 32, RULE_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(WORD);
			setState(149); definiciones();
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
		enterRule(_localctx, 34, RULE_definiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151); declaration();
			}
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152); match(OPENMOUTH);
				setState(153); match(NUMBER);
				setState(154); match(CLOSEMOUTH);
				}
				}
				setState(157); 
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
		public TerminalNode LOOP() { return getToken(ParserTParser.LOOP, 0); }
		public TerminalNode WS() { return getToken(ParserTParser.WS, 0); }
		public DeclarematContext declaremat() {
			return getRuleContext(DeclarematContext.class,0);
		}
		public DeclareboolContext declarebool() {
			return getRuleContext(DeclareboolContext.class,0);
		}
		public EqualtoContext equalto() {
			return getRuleContext(EqualtoContext.class,0);
		}
		public DeclarestrContext declarestr() {
			return getRuleContext(DeclarestrContext.class,0);
		}
		public DeclareintContext declareint() {
			return getRuleContext(DeclareintContext.class,0);
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
		enterRule(_localctx, 36, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(159); ifst();
				}
				break;
			case 2:
				{
				setState(160); match(LOOP);
				}
				break;
			case 3:
				{
				setState(161); declareint();
				}
				break;
			case 4:
				{
				setState(162); declarestr();
				}
				break;
			case 5:
				{
				setState(163); declaremat();
				}
				break;
			case 6:
				{
				setState(164); declarebool();
				}
				break;
			case 7:
				{
				setState(165); equalto();
				}
				break;
			case 8:
				{
				setState(166); match(WS);
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
		public AlloperationsContext alloperations() {
			return getRuleContext(AlloperationsContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
		enterRule(_localctx, 38, RULE_alloperations);
		try {
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); operation();
				setState(171); alloperations();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6"+
		"\5\6F\n\6\3\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ne\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\3\r\3\r\3\r\3\r\3\r\5\rv\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\5\16}\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0084"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u008a\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0095\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\6\23"+
		"\u009e\n\23\r\23\16\23\u009f\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u00aa\n\24\3\25\3\25\3\25\3\25\5\25\u00b0\n\25\3\25\2\2\26\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u00b6\2*\3\2\2\2\4.\3\2\2\2"+
		"\69\3\2\2\2\b@\3\2\2\2\nE\3\2\2\2\fL\3\2\2\2\16N\3\2\2\2\20T\3\2\2\2\22"+
		"d\3\2\2\2\24f\3\2\2\2\26i\3\2\2\2\30p\3\2\2\2\32w\3\2\2\2\34~\3\2\2\2"+
		"\36\u0089\3\2\2\2 \u008b\3\2\2\2\"\u0096\3\2\2\2$\u0099\3\2\2\2&\u00a9"+
		"\3\2\2\2(\u00af\3\2\2\2*+\7\'\2\2+,\5(\25\2,-\7(\2\2-\3\3\2\2\2./\7)\2"+
		"\2/\5\3\2\2\2\60\61\7\30\2\2\61\62\7\35\2\2\62:\7\30\2\2\63\64\7\31\2"+
		"\2\64\65\7\35\2\2\65:\7\31\2\2\66\67\7\32\2\2\678\7\35\2\28:\7\32\2\2"+
		"9\60\3\2\2\29\63\3\2\2\29\66\3\2\2\2:\7\3\2\2\2;A\5\6\4\2<=\5\6\4\2=>"+
		"\7\22\2\2>?\5\b\5\2?A\3\2\2\2@;\3\2\2\2@<\3\2\2\2A\t\3\2\2\2BF\7*\2\2"+
		"CD\7*\2\2DF\5\b\5\2EB\3\2\2\2EC\3\2\2\2F\13\3\2\2\2GM\5(\25\2HI\5(\25"+
		"\2IJ\5\n\6\2JK\5\f\7\2KM\3\2\2\2LG\3\2\2\2LH\3\2\2\2M\r\3\2\2\2NO\7+\2"+
		"\2OP\5\b\5\2PQ\7,\2\2QR\5\f\7\2RS\7-\2\2S\17\3\2\2\2TU\7/\2\2UV\5(\25"+
		"\2VW\7/\2\2WX\7\31\2\2X\21\3\2\2\2YZ\7\60\2\2Z[\5\b\5\2[\\\7,\2\2\\]\5"+
		"(\25\2]^\7\61\2\2^e\3\2\2\2_`\7\62\2\2`a\5(\25\2ab\7/\2\2bc\5\b\5\2ce"+
		"\3\2\2\2dY\3\2\2\2d_\3\2\2\2e\23\3\2\2\2fg\7 \2\2gh\7\33\2\2h\25\3\2\2"+
		"\2ij\7\30\2\2jk\7\63\2\2kn\7\23\2\2lm\7\r\2\2mo\7\31\2\2nl\3\2\2\2no\3"+
		"\2\2\2o\27\3\2\2\2pq\7\30\2\2qr\7\63\2\2ru\7\24\2\2st\7\r\2\2tv\7\30\2"+
		"\2us\3\2\2\2uv\3\2\2\2v\31\3\2\2\2wx\7\30\2\2xy\7\63\2\2y|\7\32\2\2z{"+
		"\7\r\2\2{}\7\32\2\2|z\3\2\2\2|}\3\2\2\2}\33\3\2\2\2~\177\7\30\2\2\177"+
		"\u0080\7\63\2\2\u0080\u0083\7\26\2\2\u0081\u0082\7\r\2\2\u0082\u0084\7"+
		"\34\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\35\3\2\2\2\u0085"+
		"\u008a\5\26\f\2\u0086\u008a\5\30\r\2\u0087\u008a\5\32\16\2\u0088\u008a"+
		"\5\34\17\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\37\3\2\2\2\u008b\u0094\7\30\2\2\u008c\u008d"+
		"\7\r\2\2\u008d\u0095\7\31\2\2\u008e\u008f\7\r\2\2\u008f\u0095\7\30\2\2"+
		"\u0090\u0091\7\r\2\2\u0091\u0095\7\32\2\2\u0092\u0093\7\r\2\2\u0093\u0095"+
		"\7\34\2\2\u0094\u008c\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u0090\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0095!\3\2\2\2\u0096\u0097\7\30\2\2\u0097\u0098\5"+
		"$\23\2\u0098#\3\2\2\2\u0099\u009d\5\36\20\2\u009a\u009b\7\16\2\2\u009b"+
		"\u009c\7\31\2\2\u009c\u009e\7\17\2\2\u009d\u009a\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0%\3\2\2\2\u00a1\u00aa"+
		"\5\16\b\2\u00a2\u00aa\7.\2\2\u00a3\u00aa\5\26\f\2\u00a4\u00aa\5\30\r\2"+
		"\u00a5\u00aa\5\34\17\2\u00a6\u00aa\5\32\16\2\u00a7\u00aa\5 \21\2\u00a8"+
		"\u00aa\7\3\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a3\3\2"+
		"\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\'\3\2\2\2\u00ab\u00b0\5&\24\2"+
		"\u00ac\u00ad\5&\24\2\u00ad\u00ae\5(\25\2\u00ae\u00b0\3\2\2\2\u00af\u00ab"+
		"\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0)\3\2\2\2\209@ELdnu|\u0083\u0089\u0094"+
		"\u009f\u00a9\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}