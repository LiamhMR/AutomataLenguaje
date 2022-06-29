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
		WS=1, OPENPAREN=2, CLOSEPAREN=3, STRIN=4, STROU=5, PLUS=6, LEFT=7, MULT=8, 
		FRAC=9, COMA=10, LIKE=11, OPENMOUTH=12, CLOSEMOUTH=13, AND=14, OR=15, 
		COND=16, INT=17, STRINGST=18, BOOLEAN=19, MATRIX=20, TYPETOKEN=21, WORD=22, 
		NUMBER=23, FLAG=24, STRING=25, MATRIXVAR=26, BELIKE=27, VARIABLE=28, READ=29, 
		PRINT=30, EXP=31, ROOT=32, FACT=33, PI=34, E=35, LIGHT=36, BEGIN=37, ENDBEGIN=38, 
		RETURN=39, IFSTART=40, CASE=41, THEN=42, ENDIF=43, LOOP=44, TILL=45, ATST=46, 
		STOP=47, DO=48, SENTENCE=49, DOF=50;
	public static final int
		RULE_program = 0, RULE_botar = 1, RULE_compare = 2, RULE_iteratecompare = 3, 
		RULE_elsest = 4, RULE_ifcontent = 5, RULE_ifst = 6, RULE_loop = 7, RULE_whilest = 8, 
		RULE_tatoo = 9, RULE_mathvar = 10, RULE_mathop = 11, RULE_mathplus = 12, 
		RULE_mathless = 13, RULE_mathmult = 14, RULE_mathsplit = 15, RULE_math = 16, 
		RULE_declareint = 17, RULE_declarestr = 18, RULE_declarebool = 19, RULE_declaremat = 20, 
		RULE_declaration = 21, RULE_equalto = 22, RULE_definir = 23, RULE_definiciones = 24, 
		RULE_operation = 25, RULE_alloperations = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "botar", "compare", "iteratecompare", "elsest", "ifcontent", 
			"ifst", "loop", "whilest", "tatoo", "mathvar", "mathop", "mathplus", 
			"mathless", "mathmult", "mathsplit", "math", "declareint", "declarestr", 
			"declarebool", "declaremat", "declaration", "equalto", "definir", "definiciones", 
			"operation", "alloperations"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\u00BF'", "'?'", "'!!'", "'\\u00A1\\u00A1'", "'+'", "'-'", 
			"'*'", "'%'", "','", "'='", "'<'", "'>'", "'YY'", "'OO'", null, "'NUMERITO'", 
			"'CADENITA'", "'LACUERDADELAVERDADDELAMUJERMARAVILLA'", "'MALLITA'", 
			null, null, null, null, null, null, null, null, "'ESCANEAR'", "'TATUAR'", 
			"'POTENCIA'", "'RAIZ'", "'FACTORIAL'", "'PIPI'", "'EUHH'", "'VELOCIDADELAL\\u00DAH'", 
			"'DALE>'", "'<PAR\\u00C1'", "'SALITE'", "'SINO'", "'CASO'", "'SUCEDE'", 
			"'YNAM\\u00C1S'", "'LOOPEAR'", "'HASTA'", "'DURANTE'", "'HASTAAC\\u00C1MIBRO'", 
			"'H\\u00C1GASE'", "'TEDECLARO'", "'DOF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "OPENPAREN", "CLOSEPAREN", "STRIN", "STROU", "PLUS", "LEFT", 
			"MULT", "FRAC", "COMA", "LIKE", "OPENMOUTH", "CLOSEMOUTH", "AND", "OR", 
			"COND", "INT", "STRINGST", "BOOLEAN", "MATRIX", "TYPETOKEN", "WORD", 
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
			setState(54);
			match(BEGIN);
			setState(55);
			alloperations();
			setState(56);
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
			setState(58);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(60);
				match(WORD);
				setState(61);
				match(BELIKE);
				setState(62);
				match(WORD);
				}
				break;
			case NUMBER:
				{
				setState(63);
				match(NUMBER);
				setState(64);
				match(BELIKE);
				setState(65);
				match(NUMBER);
				}
				break;
			case FLAG:
				{
				setState(66);
				match(FLAG);
				setState(67);
				match(BELIKE);
				setState(68);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(71);
				compare();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(72);
				compare();
				setState(73);
				match(COND);
				setState(74);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(IFSTART);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(IFSTART);
				setState(80);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				alloperations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(84);
				alloperations();
				setState(85);
				elsest();
				setState(86);
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
			setState(90);
			match(CASE);
			setState(91);
			iteratecompare();
			setState(92);
			match(THEN);
			setState(93);
			ifcontent();
			setState(94);
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
			setState(96);
			match(TILL);
			setState(97);
			alloperations();
			setState(98);
			match(TILL);
			setState(99);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATST:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(ATST);
				setState(102);
				iteratecompare();
				setState(103);
				match(THEN);
				setState(104);
				alloperations();
				setState(105);
				match(STOP);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(DO);
				setState(108);
				alloperations();
				setState(109);
				match(TILL);
				setState(110);
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

	public static class TatooContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TerminalNode WORD() { return getToken(ParserTParser.WORD, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PRINT);
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MathvarContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode WORD() { return getToken(ParserTParser.WORD, 0); }
		public MathvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMathvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMathvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMathvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathvarContext mathvar() throws RecognitionException {
		MathvarContext _localctx = new MathvarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mathvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MathopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ParserTParser.PLUS, 0); }
		public TerminalNode LEFT() { return getToken(ParserTParser.LEFT, 0); }
		public TerminalNode MULT() { return getToken(ParserTParser.MULT, 0); }
		public TerminalNode FRAC() { return getToken(ParserTParser.FRAC, 0); }
		public MathopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMathop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMathop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMathop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathopContext mathop() throws RecognitionException {
		MathopContext _localctx = new MathopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mathop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << LEFT) | (1L << MULT) | (1L << FRAC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		public List<MathvarContext> mathvar() {
			return getRuleContexts(MathvarContext.class);
		}
		public MathvarContext mathvar(int i) {
			return getRuleContext(MathvarContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ParserTParser.PLUS, 0); }
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
		enterRule(_localctx, 24, RULE_mathplus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			mathvar();
			setState(122);
			match(PLUS);
			setState(123);
			mathvar();
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
		public List<MathvarContext> mathvar() {
			return getRuleContexts(MathvarContext.class);
		}
		public MathvarContext mathvar(int i) {
			return getRuleContext(MathvarContext.class,i);
		}
		public TerminalNode LEFT() { return getToken(ParserTParser.LEFT, 0); }
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
		enterRule(_localctx, 26, RULE_mathless);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			mathvar();
			setState(126);
			match(LEFT);
			setState(127);
			mathvar();
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
		public List<MathvarContext> mathvar() {
			return getRuleContexts(MathvarContext.class);
		}
		public MathvarContext mathvar(int i) {
			return getRuleContext(MathvarContext.class,i);
		}
		public TerminalNode MULT() { return getToken(ParserTParser.MULT, 0); }
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
		enterRule(_localctx, 28, RULE_mathmult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			mathvar();
			setState(130);
			match(MULT);
			setState(131);
			mathvar();
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
		public List<MathvarContext> mathvar() {
			return getRuleContexts(MathvarContext.class);
		}
		public MathvarContext mathvar(int i) {
			return getRuleContext(MathvarContext.class,i);
		}
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
		enterRule(_localctx, 30, RULE_mathsplit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			mathvar();
			setState(134);
			match(FRAC);
			setState(135);
			mathvar();
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
		public List<MathvarContext> mathvar() {
			return getRuleContexts(MathvarContext.class);
		}
		public MathvarContext mathvar(int i) {
			return getRuleContext(MathvarContext.class,i);
		}
		public List<MathopContext> mathop() {
			return getRuleContexts(MathopContext.class);
		}
		public MathopContext mathop(int i) {
			return getRuleContext(MathopContext.class,i);
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
		enterRule(_localctx, 32, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137);
			mathvar();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << LEFT) | (1L << MULT) | (1L << FRAC))) != 0)) {
				{
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					mathop();
					setState(139);
					mathvar();
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << LEFT) | (1L << MULT) | (1L << FRAC))) != 0) );
				}
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

	public static class DeclareintContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ParserTParser.WORD, 0); }
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_declareint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(WORD);
			setState(148);
			match(SENTENCE);
			setState(149);
			match(INT);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(150);
				match(LIKE);
				setState(151);
				math();
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
		public TerminalNode WORD() { return getToken(ParserTParser.WORD, 0); }
		public TerminalNode SENTENCE() { return getToken(ParserTParser.SENTENCE, 0); }
		public TerminalNode STRINGST() { return getToken(ParserTParser.STRINGST, 0); }
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
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
		enterRule(_localctx, 36, RULE_declarestr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(WORD);
			setState(155);
			match(SENTENCE);
			setState(156);
			match(STRINGST);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(157);
				match(LIKE);
				setState(158);
				match(STRING);
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
		enterRule(_localctx, 38, RULE_declarebool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(WORD);
			setState(162);
			match(SENTENCE);
			setState(163);
			match(FLAG);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(164);
				match(LIKE);
				setState(165);
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
		enterRule(_localctx, 40, RULE_declaremat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WORD);
			setState(169);
			match(SENTENCE);
			setState(170);
			match(MATRIX);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE) {
				{
				setState(171);
				match(LIKE);
				setState(172);
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
		enterRule(_localctx, 42, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(175);
				declareint();
				}
				break;
			case 2:
				{
				setState(176);
				declarestr();
				}
				break;
			case 3:
				{
				setState(177);
				declarebool();
				}
				break;
			case 4:
				{
				setState(178);
				declaremat();
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
		public TerminalNode WORD(int i) {
			return getToken(ParserTParser.WORD, i);
		}
		public TerminalNode LIKE() { return getToken(ParserTParser.LIKE, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_equalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WORD);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(182);
				match(LIKE);
				setState(183);
				math();
				}
				break;
			case 2:
				{
				setState(184);
				match(LIKE);
				setState(185);
				match(WORD);
				}
				break;
			case 3:
				{
				setState(186);
				match(LIKE);
				setState(187);
				match(FLAG);
				}
				break;
			case 4:
				{
				setState(188);
				match(LIKE);
				setState(189);
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
		enterRule(_localctx, 46, RULE_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(WORD);
			setState(193);
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
		enterRule(_localctx, 48, RULE_definiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(195);
			declaration();
			}
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				match(OPENMOUTH);
				setState(197);
				match(NUMBER);
				setState(198);
				match(CLOSEMOUTH);
				}
				}
				setState(201); 
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
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TatooContext tatoo() {
			return getRuleContext(TatooContext.class,0);
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
		enterRule(_localctx, 50, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(203);
				ifst();
				}
				break;
			case 2:
				{
				setState(204);
				loop();
				}
				break;
			case 3:
				{
				setState(205);
				declaration();
				}
				break;
			case 4:
				{
				setState(206);
				math();
				}
				break;
			case 5:
				{
				setState(207);
				tatoo();
				}
				break;
			case 6:
				{
				setState(208);
				equalto();
				}
				break;
			case 7:
				{
				setState(209);
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
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
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
		enterRule(_localctx, 52, RULE_alloperations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(212);
					operation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		"\u0004\u00012\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004R\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005Y\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bq\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u008e\b\u0010"+
		"\u000b\u0010\f\u0010\u008f\u0003\u0010\u0092\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0099\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00a0"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00a7\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00ae\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00b4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00bf\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u00c8\b\u0018\u000b\u0018\f"+
		"\u0018\u00c9\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u00d3\b\u0019\u0001\u001a\u0004\u001a"+
		"\u00d6\b\u001a\u000b\u001a\f\u001a\u00d7\u0001\u001a\u0000\u0000\u001b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.024\u0000\u0003\u0002\u0000\u0016\u0016\u0019\u0019"+
		"\u0001\u0000\u0016\u0017\u0001\u0000\u0006\t\u00d8\u00006\u0001\u0000"+
		"\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000"+
		"\u0006L\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nX\u0001\u0000"+
		"\u0000\u0000\fZ\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000\u0000"+
		"\u0010p\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000\u0014u"+
		"\u0001\u0000\u0000\u0000\u0016w\u0001\u0000\u0000\u0000\u0018y\u0001\u0000"+
		"\u0000\u0000\u001a}\u0001\u0000\u0000\u0000\u001c\u0081\u0001\u0000\u0000"+
		"\u0000\u001e\u0085\u0001\u0000\u0000\u0000 \u0089\u0001\u0000\u0000\u0000"+
		"\"\u0093\u0001\u0000\u0000\u0000$\u009a\u0001\u0000\u0000\u0000&\u00a1"+
		"\u0001\u0000\u0000\u0000(\u00a8\u0001\u0000\u0000\u0000*\u00b3\u0001\u0000"+
		"\u0000\u0000,\u00b5\u0001\u0000\u0000\u0000.\u00c0\u0001\u0000\u0000\u0000"+
		"0\u00c3\u0001\u0000\u0000\u00002\u00d2\u0001\u0000\u0000\u00004\u00d5"+
		"\u0001\u0000\u0000\u000067\u0005%\u0000\u000078\u00034\u001a\u000089\u0005"+
		"&\u0000\u00009\u0001\u0001\u0000\u0000\u0000:;\u0005\'\u0000\u0000;\u0003"+
		"\u0001\u0000\u0000\u0000<=\u0005\u0016\u0000\u0000=>\u0005\u001b\u0000"+
		"\u0000>F\u0005\u0016\u0000\u0000?@\u0005\u0017\u0000\u0000@A\u0005\u001b"+
		"\u0000\u0000AF\u0005\u0017\u0000\u0000BC\u0005\u0018\u0000\u0000CD\u0005"+
		"\u001b\u0000\u0000DF\u0005\u0018\u0000\u0000E<\u0001\u0000\u0000\u0000"+
		"E?\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000F\u0005\u0001\u0000"+
		"\u0000\u0000GM\u0003\u0004\u0002\u0000HI\u0003\u0004\u0002\u0000IJ\u0005"+
		"\u0010\u0000\u0000JK\u0003\u0006\u0003\u0000KM\u0001\u0000\u0000\u0000"+
		"LG\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000M\u0007\u0001\u0000"+
		"\u0000\u0000NR\u0005(\u0000\u0000OP\u0005(\u0000\u0000PR\u0003\u0006\u0003"+
		"\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000R\t\u0001\u0000"+
		"\u0000\u0000SY\u00034\u001a\u0000TU\u00034\u001a\u0000UV\u0003\b\u0004"+
		"\u0000VW\u0003\n\u0005\u0000WY\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000"+
		"\u0000XT\u0001\u0000\u0000\u0000Y\u000b\u0001\u0000\u0000\u0000Z[\u0005"+
		")\u0000\u0000[\\\u0003\u0006\u0003\u0000\\]\u0005*\u0000\u0000]^\u0003"+
		"\n\u0005\u0000^_\u0005+\u0000\u0000_\r\u0001\u0000\u0000\u0000`a\u0005"+
		"-\u0000\u0000ab\u00034\u001a\u0000bc\u0005-\u0000\u0000cd\u0005\u0017"+
		"\u0000\u0000d\u000f\u0001\u0000\u0000\u0000ef\u0005.\u0000\u0000fg\u0003"+
		"\u0006\u0003\u0000gh\u0005*\u0000\u0000hi\u00034\u001a\u0000ij\u0005/"+
		"\u0000\u0000jq\u0001\u0000\u0000\u0000kl\u00050\u0000\u0000lm\u00034\u001a"+
		"\u0000mn\u0005-\u0000\u0000no\u0003\u0006\u0003\u0000oq\u0001\u0000\u0000"+
		"\u0000pe\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000q\u0011\u0001"+
		"\u0000\u0000\u0000rs\u0005\u001e\u0000\u0000st\u0007\u0000\u0000\u0000"+
		"t\u0013\u0001\u0000\u0000\u0000uv\u0007\u0001\u0000\u0000v\u0015\u0001"+
		"\u0000\u0000\u0000wx\u0007\u0002\u0000\u0000x\u0017\u0001\u0000\u0000"+
		"\u0000yz\u0003\u0014\n\u0000z{\u0005\u0006\u0000\u0000{|\u0003\u0014\n"+
		"\u0000|\u0019\u0001\u0000\u0000\u0000}~\u0003\u0014\n\u0000~\u007f\u0005"+
		"\u0007\u0000\u0000\u007f\u0080\u0003\u0014\n\u0000\u0080\u001b\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0003\u0014\n\u0000\u0082\u0083\u0005\b\u0000"+
		"\u0000\u0083\u0084\u0003\u0014\n\u0000\u0084\u001d\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0003\u0014\n\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087"+
		"\u0088\u0003\u0014\n\u0000\u0088\u001f\u0001\u0000\u0000\u0000\u0089\u0091"+
		"\u0003\u0014\n\u0000\u008a\u008b\u0003\u0016\u000b\u0000\u008b\u008c\u0003"+
		"\u0014\n\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092!\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0016\u0000"+
		"\u0000\u0094\u0095\u00051\u0000\u0000\u0095\u0098\u0005\u0011\u0000\u0000"+
		"\u0096\u0097\u0005\u000b\u0000\u0000\u0097\u0099\u0003 \u0010\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"#\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0016\u0000\u0000\u009b\u009c"+
		"\u00051\u0000\u0000\u009c\u009f\u0005\u0012\u0000\u0000\u009d\u009e\u0005"+
		"\u000b\u0000\u0000\u009e\u00a0\u0005\u0019\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0%\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0016\u0000\u0000\u00a2\u00a3\u00051\u0000"+
		"\u0000\u00a3\u00a6\u0005\u0018\u0000\u0000\u00a4\u00a5\u0005\u000b\u0000"+
		"\u0000\u00a5\u00a7\u0005\u0018\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\'\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0016\u0000\u0000\u00a9\u00aa\u00051\u0000\u0000\u00aa"+
		"\u00ad\u0005\u0014\u0000\u0000\u00ab\u00ac\u0005\u000b\u0000\u0000\u00ac"+
		"\u00ae\u0005\u001a\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae)\u0001\u0000\u0000\u0000\u00af\u00b4"+
		"\u0003\"\u0011\u0000\u00b0\u00b4\u0003$\u0012\u0000\u00b1\u00b4\u0003"+
		"&\u0013\u0000\u00b2\u00b4\u0003(\u0014\u0000\u00b3\u00af\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4+\u0001\u0000\u0000\u0000"+
		"\u00b5\u00be\u0005\u0016\u0000\u0000\u00b6\u00b7\u0005\u000b\u0000\u0000"+
		"\u00b7\u00bf\u0003 \u0010\u0000\u00b8\u00b9\u0005\u000b\u0000\u0000\u00b9"+
		"\u00bf\u0005\u0016\u0000\u0000\u00ba\u00bb\u0005\u000b\u0000\u0000\u00bb"+
		"\u00bf\u0005\u0018\u0000\u0000\u00bc\u00bd\u0005\u000b\u0000\u0000\u00bd"+
		"\u00bf\u0005\u001a\u0000\u0000\u00be\u00b6\u0001\u0000\u0000\u0000\u00be"+
		"\u00b8\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf-\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0016\u0000\u0000\u00c1\u00c2\u00030\u0018\u0000\u00c2/\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c7\u0003*\u0015\u0000\u00c4\u00c5\u0005\f\u0000"+
		"\u0000\u00c5\u00c6\u0005\u0017\u0000\u0000\u00c6\u00c8\u0005\r\u0000\u0000"+
		"\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca1\u0001\u0000\u0000\u0000\u00cb\u00d3\u0003\f\u0006\u0000\u00cc"+
		"\u00d3\u0003\u000e\u0007\u0000\u00cd\u00d3\u0003*\u0015\u0000\u00ce\u00d3"+
		"\u0003 \u0010\u0000\u00cf\u00d3\u0003\u0012\t\u0000\u00d0\u00d3\u0003"+
		",\u0016\u0000\u00d1\u00d3\u0005\u0001\u0000\u0000\u00d2\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d33\u0001\u0000\u0000\u0000\u00d4\u00d6\u00032\u0019\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d85\u0001\u0000\u0000\u0000\u0010ELQXp\u008f\u0091\u0098\u009f\u00a6"+
		"\u00ad\u00b3\u00be\u00c9\u00d2\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}