package ANTLR;
// Generated from ParserT.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, OPENPAREN=2, CLOSEPAREN=3, SINGLE_STR=4, DOUBLE_STR=5, PLUS=6, LEFT=7, 
		MULT=8, FRAC=9, COMA=10, LIKE=11, OPENMOUTH=12, CLOSEMOUTH=13, AND=14, 
		OR=15, COND=16, INT=17, STRINGST=18, BOOLEAN=19, MATRIX=20, TYPETOKEN=21, 
		WORD=22, NUMBER=23, FLAG=24, STRING=25, MATRIXVAR=26, BELIKE=27, VARIABLE=28, 
		READ=29, PRINT=30, EXP=31, ROOT=32, FACT=33, PI=34, E=35, LIGHT=36, BEGIN=37, 
		ENDBEGIN=38, RETURN=39, IFSTART=40, CASE=41, THEN=42, ENDIF=43, LOOP=44, 
		TILL=45, ATST=46, STOP=47, DO=48, SENTENCE=49, DOF=50;
	public static final int
		RULE_program = 0, RULE_botar = 1, RULE_compare = 2, RULE_iteratecompare = 3, 
		RULE_elsest = 4, RULE_ifcontent = 5, RULE_ifst = 6, RULE_loop = 7, RULE_whilest = 8, 
		RULE_declareint = 9, RULE_declarestr = 10, RULE_declarebool = 11, RULE_declaremat = 12, 
		RULE_declaration = 13, RULE_equalto = 14, RULE_definir = 15, RULE_definiciones = 16, 
		RULE_operation = 17, RULE_alloperations = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "botar", "compare", "iteratecompare", "elsest", "ifcontent", 
			"ifst", "loop", "whilest", "declareint", "declarestr", "declarebool", 
			"declaremat", "declaration", "equalto", "definir", "definiciones", "operation", 
			"alloperations"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\u00BF'", "'?'", null, null, "'+'", "'-'", "'*'", "'%'", 
			"','", "'='", "'<'", "'>'", "'YY'", "'OO'", null, "'NUMERITO'", "'CADENITA'", 
			"'LACUERDADELAVERDADDELAMUJERMARAVILLA'", "'MALLITA'", null, null, null, 
			null, null, null, null, null, "'ESCANEAR'", "'TATUAR'", "'POTENCIA'", 
			"'RAIZ'", "'FACTORIAL'", "'PIPI'", "'EUHH'", "'VELOCIDADELAL\\u00DAH'", 
			"'DALE>'", "'<PAR\\u00C1'", "'SALITE'", "'SINO'", "'CASO'", "'SUCEDE'", 
			"'YNAM\\u00C1S'", "'LOOPEAR'", "'HASTA'", "'DURANTE'", "'HASTAAC\\u00C1MIBRO'", 
			"'H\\u00C1GASE'", "'TEDECLARO'", "'DOF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "OPENPAREN", "CLOSEPAREN", "SINGLE_STR", "DOUBLE_STR", "PLUS", 
			"LEFT", "MULT", "FRAC", "COMA", "LIKE", "OPENMOUTH", "CLOSEMOUTH", "AND", 
			"OR", "COND", "INT", "STRINGST", "BOOLEAN", "MATRIX", "TYPETOKEN", "WORD", 
			"NUMBER", "FLAG", "STRING", "MATRIXVAR", "BELIKE", "VARIABLE", "READ", 
			"PRINT", "EXP", "ROOT", "FACT", "PI", "E", "LIGHT", "BEGIN", "ENDBEGIN", 
			"RETURN", "IFSTART", "CASE", "THEN", "ENDIF", "LOOP", "TILL", "ATST", 
			"STOP", "DO", "SENTENCE", "DOF"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

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
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public AlloperationsContext alloperations() {
			return getRuleContext(AlloperationsContext.class,0);
		}
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
			setState(38);
			match(BEGIN);
			setState(39);
			alloperations();
			setState(40);
			match(ENDBEGIN);
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
			setState(42);
			match(RETURN);
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
		public List<TerminalNode> WORD() { return getTokens(ParserTParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ParserTParser.WORD, i);
		}
		public TerminalNode BELIKE() { return getToken(ParserTParser.BELIKE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public List<TerminalNode> FLAG() { return getTokens(ParserTParser.FLAG); }
		public TerminalNode FLAG(int i) {
			return getToken(ParserTParser.FLAG, i);
		}
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(44);
				match(WORD);
				setState(45);
				match(BELIKE);
				setState(46);
				match(WORD);
				}
				break;
			case NUMBER:
				{
				setState(47);
				match(NUMBER);
				setState(48);
				match(BELIKE);
				setState(49);
				match(NUMBER);
				}
				break;
			case FLAG:
				{
				setState(50);
				match(FLAG);
				setState(51);
				match(BELIKE);
				setState(52);
				match(FLAG);
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
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode COND() { return getToken(ParserTParser.COND, 0); }
		public IteratecompareContext iteratecompare() {
			return getRuleContext(IteratecompareContext.class,0);
		}
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(55);
				compare();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(56);
				compare();
				setState(57);
				match(COND);
				setState(58);
				iteratecompare();
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
		public TerminalNode IFSTART() { return getToken(ParserTParser.IFSTART, 0); }
		public IteratecompareContext iteratecompare() {
			return getRuleContext(IteratecompareContext.class,0);
		}
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(IFSTART);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(IFSTART);
				setState(64);
				iteratecompare();
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				alloperations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(68);
				alloperations();
				setState(69);
				elsest();
				setState(70);
				ifcontent();
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
		public IfcontentContext ifcontent() {
			return getRuleContext(IfcontentContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ParserTParser.ENDIF, 0); }
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
			setState(74);
			match(CASE);
			setState(75);
			iteratecompare();
			setState(76);
			match(THEN);
			setState(77);
			ifcontent();
			setState(78);
			match(ENDIF);
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
		public TerminalNode TILL(int i) {
			return getToken(ParserTParser.TILL, i);
		}
		public AlloperationsContext alloperations() {
			return getRuleContext(AlloperationsContext.class,0);
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
			setState(80);
			match(TILL);
			setState(81);
			alloperations();
			setState(82);
			match(TILL);
			setState(83);
			match(NUMBER);
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
		public TerminalNode ATST() { return getToken(ParserTParser.ATST, 0); }
		public IteratecompareContext iteratecompare() {
			return getRuleContext(IteratecompareContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ParserTParser.THEN, 0); }
		public AlloperationsContext alloperations() {
			return getRuleContext(AlloperationsContext.class,0);
		}
		public TerminalNode STOP() { return getToken(ParserTParser.STOP, 0); }
		public TerminalNode DO() { return getToken(ParserTParser.DO, 0); }
		public TerminalNode TILL() { return getToken(ParserTParser.TILL, 0); }
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATST:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(ATST);
				setState(86);
				iteratecompare();
				setState(87);
				match(THEN);
				setState(88);
				alloperations();
				setState(89);
				match(STOP);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(DO);
				setState(92);
				alloperations();
				setState(93);
				match(TILL);
				setState(94);
				iteratecompare();
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

	public static class DeclareintContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ParserTParser.WORD, 0); }
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
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
		enterRule(_localctx, 18, RULE_declareint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(WORD);
			setState(99);
			match(SENTENCE);
			setState(100);
			match(INT);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(101);
				match(LIKE);
				setState(102);
				match(NUMBER);
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
		public List<TerminalNode> WORD() { return getTokens(ParserTParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ParserTParser.WORD, i);
		}
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public TerminalNode STRINGST() { return getToken(ParserTParser.STRINGST, 0); }
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
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
		enterRule(_localctx, 20, RULE_declarestr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(WORD);
			setState(106);
			match(SENTENCE);
			setState(107);
			match(STRINGST);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(108);
				match(LIKE);
				setState(109);
				match(WORD);
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
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public List<TerminalNode> FLAG() { return getTokens(ParserTParser.FLAG); }
		public TerminalNode FLAG(int i) {
			return getToken(ParserTParser.FLAG, i);
		}
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
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
		enterRule(_localctx, 22, RULE_declarebool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(WORD);
			setState(113);
			match(SENTENCE);
			setState(114);
			match(FLAG);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(115);
				match(LIKE);
				setState(116);
				match(FLAG);
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
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public TerminalNode MATRIX() { return getToken(ParserTParser.MATRIX, 0); }
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode MATRIXVAR() { return getToken(ParserTParser.MATRIXVAR, 0); }
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
		enterRule(_localctx, 24, RULE_declaremat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(WORD);
			setState(120);
			match(SENTENCE);
			setState(121);
			match(MATRIX);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(122);
				match(LIKE);
				setState(123);
				match(MATRIXVAR);
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
		public DeclareintContext declareint() {
			return getRuleContext(DeclareintContext.class,0);
		}
		public DeclarestrContext declarestr() {
			return getRuleContext(DeclarestrContext.class,0);
		}
		public DeclareboolContext declarebool() {
			return getRuleContext(DeclareboolContext.class,0);
		}
		public DeclarematContext declaremat() {
			return getRuleContext(DeclarematContext.class,0);
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
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				declareint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				declarestr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				declarebool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				declaremat();
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
		public TerminalNode WORD(int i) {
			return getToken(ParserTParser.WORD, i);
		}
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode FLAG() { return getToken(ParserTParser.FLAG, 0); }
		public TerminalNode MATRIXVAR() { return getToken(ParserTParser.MATRIXVAR, 0); }
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
		enterRule(_localctx, 28, RULE_equalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(WORD);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(133);
				match(LIKE);
				setState(134);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(135);
				match(LIKE);
				setState(136);
				match(WORD);
				}
				break;
			case 3:
				{
				setState(137);
				match(LIKE);
				setState(138);
				match(FLAG);
				}
				break;
			case 4:
				{
				setState(139);
				match(LIKE);
				setState(140);
				match(MATRIXVAR);
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
		enterRule(_localctx, 30, RULE_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(WORD);
			setState(144);
			definiciones();
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<TerminalNode> OPENMOUTH() { return getTokens(ParserTParser.OPENMOUTH); }
		public TerminalNode OPENMOUTH(int i) {
			return getToken(ParserTParser.OPENMOUTH, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public List<TerminalNode> CLOSEMOUTH() { return getTokens(ParserTParser.CLOSEMOUTH); }
		public TerminalNode CLOSEMOUTH(int i) {
			return getToken(ParserTParser.CLOSEMOUTH, i);
		}
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
		enterRule(_localctx, 32, RULE_definiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			declaration();
			}
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				match(OPENMOUTH);
				setState(148);
				match(NUMBER);
				setState(149);
				match(CLOSEMOUTH);
				}
				}
				setState(152); 
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
		public IfstContext ifst() {
			return getRuleContext(IfstContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(ParserTParser.LOOP, 0); }
		public DeclareintContext declareint() {
			return getRuleContext(DeclareintContext.class,0);
		}
		public DeclarestrContext declarestr() {
			return getRuleContext(DeclarestrContext.class,0);
		}
		public DeclarematContext declaremat() {
			return getRuleContext(DeclarematContext.class,0);
		}
		public DeclareboolContext declarebool() {
			return getRuleContext(DeclareboolContext.class,0);
		}
		public EqualtoContext equalto() {
			return getRuleContext(EqualtoContext.class,0);
		}
		public TerminalNode WS() { return getToken(ParserTParser.WS, 0); }
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
		enterRule(_localctx, 34, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(154);
				ifst();
				}
				break;
			case 2:
				{
				setState(155);
				match(LOOP);
				}
				break;
			case 3:
				{
				setState(156);
				declareint();
				}
				break;
			case 4:
				{
				setState(157);
				declarestr();
				}
				break;
			case 5:
				{
				setState(158);
				declaremat();
				}
				break;
			case 6:
				{
				setState(159);
				declarebool();
				}
				break;
			case 7:
				{
				setState(160);
				equalto();
				}
				break;
			case 8:
				{
				setState(161);
				match(WS);
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
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AlloperationsContext alloperations() {
			return getRuleContext(AlloperationsContext.class,0);
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
		enterRule(_localctx, 36, RULE_alloperations);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				operation();
				setState(166);
				alloperations();
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
		"\u0004\u00012\u00ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\ba\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\th\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\no\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bv\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f}\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0083\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u008e"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u0097\b\u0010\u000b\u0010\f\u0010\u0098"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00a3\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00a9\b\u0012\u0001\u0012\u0000\u0000"+
		"\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$\u0000\u0000\u00b0\u0000&\u0001\u0000\u0000\u0000"+
		"\u0002*\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006<"+
		"\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000"+
		"\u0000\fJ\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010"+
		"`\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014i\u0001"+
		"\u0000\u0000\u0000\u0016p\u0001\u0000\u0000\u0000\u0018w\u0001\u0000\u0000"+
		"\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c\u0084\u0001\u0000\u0000"+
		"\u0000\u001e\u008f\u0001\u0000\u0000\u0000 \u0092\u0001\u0000\u0000\u0000"+
		"\"\u00a2\u0001\u0000\u0000\u0000$\u00a8\u0001\u0000\u0000\u0000&\'\u0005"+
		"%\u0000\u0000\'(\u0003$\u0012\u0000()\u0005&\u0000\u0000)\u0001\u0001"+
		"\u0000\u0000\u0000*+\u0005\'\u0000\u0000+\u0003\u0001\u0000\u0000\u0000"+
		",-\u0005\u0016\u0000\u0000-.\u0005\u001b\u0000\u0000.6\u0005\u0016\u0000"+
		"\u0000/0\u0005\u0017\u0000\u000001\u0005\u001b\u0000\u000016\u0005\u0017"+
		"\u0000\u000023\u0005\u0018\u0000\u000034\u0005\u001b\u0000\u000046\u0005"+
		"\u0018\u0000\u00005,\u0001\u0000\u0000\u00005/\u0001\u0000\u0000\u0000"+
		"52\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u00007=\u0003\u0004"+
		"\u0002\u000089\u0003\u0004\u0002\u00009:\u0005\u0010\u0000\u0000:;\u0003"+
		"\u0006\u0003\u0000;=\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000"+
		"<8\u0001\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>B\u0005(\u0000"+
		"\u0000?@\u0005(\u0000\u0000@B\u0003\u0006\u0003\u0000A>\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000CI\u0003$\u0012"+
		"\u0000DE\u0003$\u0012\u0000EF\u0003\b\u0004\u0000FG\u0003\n\u0005\u0000"+
		"GI\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000"+
		"\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005)\u0000\u0000KL\u0003\u0006"+
		"\u0003\u0000LM\u0005*\u0000\u0000MN\u0003\n\u0005\u0000NO\u0005+\u0000"+
		"\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005-\u0000\u0000QR\u0003$\u0012"+
		"\u0000RS\u0005-\u0000\u0000ST\u0005\u0017\u0000\u0000T\u000f\u0001\u0000"+
		"\u0000\u0000UV\u0005.\u0000\u0000VW\u0003\u0006\u0003\u0000WX\u0005*\u0000"+
		"\u0000XY\u0003$\u0012\u0000YZ\u0005/\u0000\u0000Za\u0001\u0000\u0000\u0000"+
		"[\\\u00050\u0000\u0000\\]\u0003$\u0012\u0000]^\u0005-\u0000\u0000^_\u0003"+
		"\u0006\u0003\u0000_a\u0001\u0000\u0000\u0000`U\u0001\u0000\u0000\u0000"+
		"`[\u0001\u0000\u0000\u0000a\u0011\u0001\u0000\u0000\u0000bc\u0005\u0016"+
		"\u0000\u0000cd\u00051\u0000\u0000dg\u0005\u0011\u0000\u0000ef\u0005\u000b"+
		"\u0000\u0000fh\u0005\u0017\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000h\u0013\u0001\u0000\u0000\u0000ij\u0005\u0016\u0000"+
		"\u0000jk\u00051\u0000\u0000kn\u0005\u0012\u0000\u0000lm\u0005\u000b\u0000"+
		"\u0000mo\u0005\u0016\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000o\u0015\u0001\u0000\u0000\u0000pq\u0005\u0016\u0000\u0000"+
		"qr\u00051\u0000\u0000ru\u0005\u0018\u0000\u0000st\u0005\u000b\u0000\u0000"+
		"tv\u0005\u0018\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\u0017\u0001\u0000\u0000\u0000wx\u0005\u0016\u0000\u0000xy\u0005"+
		"1\u0000\u0000y|\u0005\u0014\u0000\u0000z{\u0005\u000b\u0000\u0000{}\u0005"+
		"\u001a\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0019\u0001\u0000\u0000\u0000~\u0083\u0003\u0012\t\u0000\u007f\u0083"+
		"\u0003\u0014\n\u0000\u0080\u0083\u0003\u0016\u000b\u0000\u0081\u0083\u0003"+
		"\u0018\f\u0000\u0082~\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u001b\u0001\u0000\u0000\u0000\u0084\u008d\u0005\u0016"+
		"\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u008e\u0005\u0017"+
		"\u0000\u0000\u0087\u0088\u0005\u000b\u0000\u0000\u0088\u008e\u0005\u0016"+
		"\u0000\u0000\u0089\u008a\u0005\u000b\u0000\u0000\u008a\u008e\u0005\u0018"+
		"\u0000\u0000\u008b\u008c\u0005\u000b\u0000\u0000\u008c\u008e\u0005\u001a"+
		"\u0000\u0000\u008d\u0085\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000"+
		"\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0016"+
		"\u0000\u0000\u0090\u0091\u0003 \u0010\u0000\u0091\u001f\u0001\u0000\u0000"+
		"\u0000\u0092\u0096\u0003\u001a\r\u0000\u0093\u0094\u0005\f\u0000\u0000"+
		"\u0094\u0095\u0005\u0017\u0000\u0000\u0095\u0097\u0005\r\u0000\u0000\u0096"+
		"\u0093\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"!\u0001\u0000\u0000\u0000\u009a\u00a3\u0003\f\u0006\u0000\u009b\u00a3"+
		"\u0005,\u0000\u0000\u009c\u00a3\u0003\u0012\t\u0000\u009d\u00a3\u0003"+
		"\u0014\n\u0000\u009e\u00a3\u0003\u0018\f\u0000\u009f\u00a3\u0003\u0016"+
		"\u000b\u0000\u00a0\u00a3\u0003\u001c\u000e\u0000\u00a1\u00a3\u0005\u0001"+
		"\u0000\u0000\u00a2\u009a\u0001\u0000\u0000\u0000\u00a2\u009b\u0001\u0000"+
		"\u0000\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000"+
		"\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3#\u0001\u0000\u0000\u0000\u00a4\u00a9\u0003\"\u0011"+
		"\u0000\u00a5\u00a6\u0003\"\u0011\u0000\u00a6\u00a7\u0003$\u0012\u0000"+
		"\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a9%\u0001\u0000\u0000\u0000\u000e"+
		"5<AH`gnu|\u0082\u008d\u0098\u00a2\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}