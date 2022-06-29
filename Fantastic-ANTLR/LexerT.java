// Generated from LexerT.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "OPENPAREN", "CLOSEPAREN", "STRIN", "STROU", "PLUS", "LEFT", "MULT", 
			"FRAC", "COMA", "LIKE", "OPENMOUTH", "CLOSEMOUTH", "AND", "OR", "COND", 
			"INT", "STRINGST", "BOOLEAN", "MATRIX", "TYPETOKEN", "WORD", "NUMBER", 
			"FLAG", "STRING", "MATRIXVAR", "BELIKE", "VARIABLE", "READ", "PRINT", 
			"EXP", "ROOT", "FACT", "PI", "E", "LIGHT", "BEGIN", "ENDBEGIN", "RETURN", 
			"IFSTART", "CASE", "THEN", "ENDIF", "LOOP", "TILL", "ATST", "STOP", "DO", 
			"SENTENCE", "DOF", "DIGITS", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\u00BF'", "'?'", "'!!'", "'\u00A1\u00A1'", "'+'", "'-'", 
			"'*'", "'%'", "','", "'='", "'<'", "'>'", "'YY'", "'OO'", null, "'NUMERITO'", 
			"'CADENITA'", "'LACUERDADELAVERDADDELAMUJERMARAVILLA'", "'MALLITA'", 
			null, null, null, null, null, null, null, null, "'ESCANEAR'", "'TATUAR'", 
			"'POTENCIA'", "'RAIZ'", "'FACTORIAL'", "'PIPI'", "'EUHH'", "'VELOCIDADELAL\u00DAH'", 
			"'DALE>'", "'<PAR\u00C1'", "'SALITE'", "'SINO'", "'CASO'", "'SUCEDE'", 
			"'YNAM\u00C1S'", "'LOOPEAR'", "'HASTA'", "'DURANTE'", "'HASTAAC\u00C1MIBRO'", 
			"'H\u00C1GASE'", "'TEDECLARO'", "'DOF'"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01dc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\6\2m\n\2\r\2\16\2n\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u0095\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00da\n\26"+
		"\3\27\6\27\u00dd\n\27\r\27\16\27\u00de\3\30\6\30\u00e2\n\30\r\30\16\30"+
		"\u00e3\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ef\n\31\3"+
		"\32\3\32\6\32\u00f3\n\32\r\32\16\32\u00f4\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\6\33\u00fe\n\33\r\33\16\33\u00ff\3\33\3\33\6\33\u0104\n\33\r\33"+
		"\16\33\u0105\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u012c\n\34"+
		"\3\35\3\35\3\35\5\35\u0131\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2\3\2\4\5\2\13\f\17\17\"\"\3\2\62"+
		";\2\u01eb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3l\3\2\2\2\5r\3\2\2\2\7t\3\2\2\2"+
		"\tv\3\2\2\2\13y\3\2\2\2\r|\3\2\2\2\17~\3\2\2\2\21\u0080\3\2\2\2\23\u0082"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33\u008a\3"+
		"\2\2\2\35\u008c\3\2\2\2\37\u008f\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2"+
		"%\u009f\3\2\2\2\'\u00a8\3\2\2\2)\u00cd\3\2\2\2+\u00d9\3\2\2\2-\u00dc\3"+
		"\2\2\2/\u00e1\3\2\2\2\61\u00ee\3\2\2\2\63\u00f0\3\2\2\2\65\u0103\3\2\2"+
		"\2\67\u012b\3\2\2\29\u0130\3\2\2\2;\u0132\3\2\2\2=\u013b\3\2\2\2?\u0142"+
		"\3\2\2\2A\u014b\3\2\2\2C\u0150\3\2\2\2E\u015a\3\2\2\2G\u015f\3\2\2\2I"+
		"\u0164\3\2\2\2K\u0174\3\2\2\2M\u017a\3\2\2\2O\u0180\3\2\2\2Q\u0187\3\2"+
		"\2\2S\u018c\3\2\2\2U\u0191\3\2\2\2W\u0198\3\2\2\2Y\u019f\3\2\2\2[\u01a7"+
		"\3\2\2\2]\u01ad\3\2\2\2_\u01b5\3\2\2\2a\u01c3\3\2\2\2c\u01ca\3\2\2\2e"+
		"\u01d4\3\2\2\2g\u01d8\3\2\2\2i\u01da\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2"+
		"\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\2\2\2q\4\3\2\2\2rs\7\u00c1\2\2"+
		"s\6\3\2\2\2tu\7A\2\2u\b\3\2\2\2vw\7#\2\2wx\7#\2\2x\n\3\2\2\2yz\7\u00a3"+
		"\2\2z{\7\u00a3\2\2{\f\3\2\2\2|}\7-\2\2}\16\3\2\2\2~\177\7/\2\2\177\20"+
		"\3\2\2\2\u0080\u0081\7,\2\2\u0081\22\3\2\2\2\u0082\u0083\7\'\2\2\u0083"+
		"\24\3\2\2\2\u0084\u0085\7.\2\2\u0085\26\3\2\2\2\u0086\u0087\7?\2\2\u0087"+
		"\30\3\2\2\2\u0088\u0089\7>\2\2\u0089\32\3\2\2\2\u008a\u008b\7@\2\2\u008b"+
		"\34\3\2\2\2\u008c\u008d\7[\2\2\u008d\u008e\7[\2\2\u008e\36\3\2\2\2\u008f"+
		"\u0090\7Q\2\2\u0090\u0091\7Q\2\2\u0091 \3\2\2\2\u0092\u0095\5\35\17\2"+
		"\u0093\u0095\5\37\20\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\""+
		"\3\2\2\2\u0096\u0097\7P\2\2\u0097\u0098\7W\2\2\u0098\u0099\7O\2\2\u0099"+
		"\u009a\7G\2\2\u009a\u009b\7T\2\2\u009b\u009c\7K\2\2\u009c\u009d\7V\2\2"+
		"\u009d\u009e\7Q\2\2\u009e$\3\2\2\2\u009f\u00a0\7E\2\2\u00a0\u00a1\7C\2"+
		"\2\u00a1\u00a2\7F\2\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\7P\2\2\u00a4\u00a5"+
		"\7K\2\2\u00a5\u00a6\7V\2\2\u00a6\u00a7\7C\2\2\u00a7&\3\2\2\2\u00a8\u00a9"+
		"\7N\2\2\u00a9\u00aa\7C\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\7W\2\2\u00ac"+
		"\u00ad\7G\2\2\u00ad\u00ae\7T\2\2\u00ae\u00af\7F\2\2\u00af\u00b0\7C\2\2"+
		"\u00b0\u00b1\7F\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\7N\2\2\u00b3\u00b4"+
		"\7C\2\2\u00b4\u00b5\7X\2\2\u00b5\u00b6\7G\2\2\u00b6\u00b7\7T\2\2\u00b7"+
		"\u00b8\7F\2\2\u00b8\u00b9\7C\2\2\u00b9\u00ba\7F\2\2\u00ba\u00bb\7F\2\2"+
		"\u00bb\u00bc\7G\2\2\u00bc\u00bd\7N\2\2\u00bd\u00be\7C\2\2\u00be\u00bf"+
		"\7O\2\2\u00bf\u00c0\7W\2\2\u00c0\u00c1\7L\2\2\u00c1\u00c2\7G\2\2\u00c2"+
		"\u00c3\7T\2\2\u00c3\u00c4\7O\2\2\u00c4\u00c5\7C\2\2\u00c5\u00c6\7T\2\2"+
		"\u00c6\u00c7\7C\2\2\u00c7\u00c8\7X\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca"+
		"\7N\2\2\u00ca\u00cb\7N\2\2\u00cb\u00cc\7C\2\2\u00cc(\3\2\2\2\u00cd\u00ce"+
		"\7O\2\2\u00ce\u00cf\7C\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7N\2\2\u00d1"+
		"\u00d2\7K\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4\7C\2\2\u00d4*\3\2\2\2\u00d5"+
		"\u00da\5#\22\2\u00d6\u00da\5%\23\2\u00d7\u00da\5\'\24\2\u00d8\u00da\5"+
		")\25\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da,\3\2\2\2\u00db\u00dd\5i\65\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df.\3"+
		"\2\2\2\u00e0\u00e2\5g\64\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7F\2\2"+
		"\u00e6\u00e7\7Q\2\2\u00e7\u00e8\7R\2\2\u00e8\u00ef\7G\2\2\u00e9\u00ea"+
		"\7P\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7R\2\2\u00ec\u00ef\7G\2\2\u00ed"+
		"\u00ef\4\62\63\2\u00ee\u00e5\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ed\3"+
		"\2\2\2\u00ef\62\3\2\2\2\u00f0\u00f2\5\t\5\2\u00f1\u00f3\5i\65\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5\13\6\2\u00f7\64\3\2\2\2\u00f8\u00fd"+
		"\5\31\r\2\u00f9\u00fa\59\35\2\u00fa\u00fb\5\25\13\2\u00fb\u00fe\3\2\2"+
		"\2\u00fc\u00fe\59\35\2\u00fd\u00f9\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\5\33\16\2\u0102\u0104\3\2\2\2\u0103\u00f8\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\66\3\2\2\2\u0107"+
		"\u0108\7K\2\2\u0108\u0109\7I\2\2\u0109\u010a\7W\2\2\u010a\u010b\7C\2\2"+
		"\u010b\u010c\7N\2\2\u010c\u010d\7K\2\2\u010d\u010e\7V\2\2\u010e\u012c"+
		"\7Q\2\2\u010f\u0110\7P\2\2\u0110\u0111\7Q\2\2\u0111\u0112\7K\2\2\u0112"+
		"\u0113\7I\2\2\u0113\u0114\7W\2\2\u0114\u0115\7C\2\2\u0115\u0116\7N\2\2"+
		"\u0116\u0117\7K\2\2\u0117\u0118\7V\2\2\u0118\u012c\7Q\2\2\u0119\u011a"+
		"\7I\2\2\u011a\u011b\7T\2\2\u011b\u011c\7C\2\2\u011c\u011d\7P\2\2\u011d"+
		"\u011e\7F\2\2\u011e\u011f\7G\2\2\u011f\u0120\7U\2\2\u0120\u0121\7K\2\2"+
		"\u0121\u0122\7V\2\2\u0122\u012c\7Q\2\2\u0123\u0124\7E\2\2\u0124\u0125"+
		"\7J\2\2\u0125\u0126\7K\2\2\u0126\u0127\7S\2\2\u0127\u0128\7W\2\2\u0128"+
		"\u0129\7K\2\2\u0129\u012a\7V\2\2\u012a\u012c\7Q\2\2\u012b\u0107\3\2\2"+
		"\2\u012b\u010f\3\2\2\2\u012b\u0119\3\2\2\2\u012b\u0123\3\2\2\2\u012c8"+
		"\3\2\2\2\u012d\u0131\5/\30\2\u012e\u0131\5\63\32\2\u012f\u0131\5\61\31"+
		"\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131:"+
		"\3\2\2\2\u0132\u0133\7G\2\2\u0133\u0134\7U\2\2\u0134\u0135\7E\2\2\u0135"+
		"\u0136\7C\2\2\u0136\u0137\7P\2\2\u0137\u0138\7G\2\2\u0138\u0139\7C\2\2"+
		"\u0139\u013a\7T\2\2\u013a<\3\2\2\2\u013b\u013c\7V\2\2\u013c\u013d\7C\2"+
		"\2\u013d\u013e\7V\2\2\u013e\u013f\7W\2\2\u013f\u0140\7C\2\2\u0140\u0141"+
		"\7T\2\2\u0141>\3\2\2\2\u0142\u0143\7R\2\2\u0143\u0144\7Q\2\2\u0144\u0145"+
		"\7V\2\2\u0145\u0146\7G\2\2\u0146\u0147\7P\2\2\u0147\u0148\7E\2\2\u0148"+
		"\u0149\7K\2\2\u0149\u014a\7C\2\2\u014a@\3\2\2\2\u014b\u014c\7T\2\2\u014c"+
		"\u014d\7C\2\2\u014d\u014e\7K\2\2\u014e\u014f\7\\\2\2\u014fB\3\2\2\2\u0150"+
		"\u0151\7H\2\2\u0151\u0152\7C\2\2\u0152\u0153\7E\2\2\u0153\u0154\7V\2\2"+
		"\u0154\u0155\7Q\2\2\u0155\u0156\7T\2\2\u0156\u0157\7K\2\2\u0157\u0158"+
		"\7C\2\2\u0158\u0159\7N\2\2\u0159D\3\2\2\2\u015a\u015b\7R\2\2\u015b\u015c"+
		"\7K\2\2\u015c\u015d\7R\2\2\u015d\u015e\7K\2\2\u015eF\3\2\2\2\u015f\u0160"+
		"\7G\2\2\u0160\u0161\7W\2\2\u0161\u0162\7J\2\2\u0162\u0163\7J\2\2\u0163"+
		"H\3\2\2\2\u0164\u0165\7X\2\2\u0165\u0166\7G\2\2\u0166\u0167\7N\2\2\u0167"+
		"\u0168\7Q\2\2\u0168\u0169\7E\2\2\u0169\u016a\7K\2\2\u016a\u016b\7F\2\2"+
		"\u016b\u016c\7C\2\2\u016c\u016d\7F\2\2\u016d\u016e\7G\2\2\u016e\u016f"+
		"\7N\2\2\u016f\u0170\7C\2\2\u0170\u0171\7N\2\2\u0171\u0172\7\u00dc\2\2"+
		"\u0172\u0173\7J\2\2\u0173J\3\2\2\2\u0174\u0175\7F\2\2\u0175\u0176\7C\2"+
		"\2\u0176\u0177\7N\2\2\u0177\u0178\7G\2\2\u0178\u0179\7@\2\2\u0179L\3\2"+
		"\2\2\u017a\u017b\7>\2\2\u017b\u017c\7R\2\2\u017c\u017d\7C\2\2\u017d\u017e"+
		"\7T\2\2\u017e\u017f\7\u00c3\2\2\u017fN\3\2\2\2\u0180\u0181\7U\2\2\u0181"+
		"\u0182\7C\2\2\u0182\u0183\7N\2\2\u0183\u0184\7K\2\2\u0184\u0185\7V\2\2"+
		"\u0185\u0186\7G\2\2\u0186P\3\2\2\2\u0187\u0188\7U\2\2\u0188\u0189\7K\2"+
		"\2\u0189\u018a\7P\2\2\u018a\u018b\7Q\2\2\u018bR\3\2\2\2\u018c\u018d\7"+
		"E\2\2\u018d\u018e\7C\2\2\u018e\u018f\7U\2\2\u018f\u0190\7Q\2\2\u0190T"+
		"\3\2\2\2\u0191\u0192\7U\2\2\u0192\u0193\7W\2\2\u0193\u0194\7E\2\2\u0194"+
		"\u0195\7G\2\2\u0195\u0196\7F\2\2\u0196\u0197\7G\2\2\u0197V\3\2\2\2\u0198"+
		"\u0199\7[\2\2\u0199\u019a\7P\2\2\u019a\u019b\7C\2\2\u019b\u019c\7O\2\2"+
		"\u019c\u019d\7\u00c3\2\2\u019d\u019e\7U\2\2\u019eX\3\2\2\2\u019f\u01a0"+
		"\7N\2\2\u01a0\u01a1\7Q\2\2\u01a1\u01a2\7Q\2\2\u01a2\u01a3\7R\2\2\u01a3"+
		"\u01a4\7G\2\2\u01a4\u01a5\7C\2\2\u01a5\u01a6\7T\2\2\u01a6Z\3\2\2\2\u01a7"+
		"\u01a8\7J\2\2\u01a8\u01a9\7C\2\2\u01a9\u01aa\7U\2\2\u01aa\u01ab\7V\2\2"+
		"\u01ab\u01ac\7C\2\2\u01ac\\\3\2\2\2\u01ad\u01ae\7F\2\2\u01ae\u01af\7W"+
		"\2\2\u01af\u01b0\7T\2\2\u01b0\u01b1\7C\2\2\u01b1\u01b2\7P\2\2\u01b2\u01b3"+
		"\7V\2\2\u01b3\u01b4\7G\2\2\u01b4^\3\2\2\2\u01b5\u01b6\7J\2\2\u01b6\u01b7"+
		"\7C\2\2\u01b7\u01b8\7U\2\2\u01b8\u01b9\7V\2\2\u01b9\u01ba\7C\2\2\u01ba"+
		"\u01bb\7C\2\2\u01bb\u01bc\7E\2\2\u01bc\u01bd\7\u00c3\2\2\u01bd\u01be\7"+
		"O\2\2\u01be\u01bf\7K\2\2\u01bf\u01c0\7D\2\2\u01c0\u01c1\7T\2\2\u01c1\u01c2"+
		"\7Q\2\2\u01c2`\3\2\2\2\u01c3\u01c4\7J\2\2\u01c4\u01c5\7\u00c3\2\2\u01c5"+
		"\u01c6\7I\2\2\u01c6\u01c7\7C\2\2\u01c7\u01c8\7U\2\2\u01c8\u01c9\7G\2\2"+
		"\u01c9b\3\2\2\2\u01ca\u01cb\7V\2\2\u01cb\u01cc\7G\2\2\u01cc\u01cd\7F\2"+
		"\2\u01cd\u01ce\7G\2\2\u01ce\u01cf\7E\2\2\u01cf\u01d0\7N\2\2\u01d0\u01d1"+
		"\7C\2\2\u01d1\u01d2\7T\2\2\u01d2\u01d3\7Q\2\2\u01d3d\3\2\2\2\u01d4\u01d5"+
		"\7F\2\2\u01d5\u01d6\7Q\2\2\u01d6\u01d7\7H\2\2\u01d7f\3\2\2\2\u01d8\u01d9"+
		"\t\3\2\2\u01d9h\3\2\2\2\u01da\u01db\4c|\2\u01dbj\3\2\2\2\17\2n\u0094\u00d9"+
		"\u00de\u00e3\u00ee\u00f4\u00fd\u00ff\u0105\u012b\u0130\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}