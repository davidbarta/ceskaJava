// Generated from C:/Users/JanRychlik/Documents/Projects/ceskaJava/src/main/antlr4\CeskaJava.g4 by ANTLR 4.9
package main.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CeskaJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOLEAN=2, TRUE=3, FALSE=4, INT=5, FINAL=6, IF=7, ELSE=8, SWITCH=9, 
		CASE=10, BREAK=11, FOR=12, WHILE=13, DO=14, REPEAT=15, UNTIL=16, RETURN=17, 
		DEFAULT=18, VOID=19, CONST=20, FUNCTION_KEYWORD=21, OR=22, AND=23, SAME=24, 
		NOT_EQ=25, LT=26, GT=27, LE=28, MOD=29, GE=30, PLUS=31, MINUS=32, MULT=33, 
		DIV=34, EQ=35, QUESTION=36, COLON=37, NEGATION=38, XUPPER=39, XLOW=40, 
		LPAREN=41, RPAREN=42, LBRACE=43, RBRACE=44, SEMI=45, COMMA=46, WORD=47, 
		DECIMAL=48, Letter=49, Letter_or_digit=50, WHITESPACE=51, COMMENT=52, 
		LINE_COMMENT=53, HexNumeral=54, DecimalNumeral=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BOOLEAN", "TRUE", "FALSE", "INT", "FINAL", "IF", "ELSE", "SWITCH", 
			"CASE", "BREAK", "FOR", "WHILE", "DO", "REPEAT", "UNTIL", "RETURN", "DEFAULT", 
			"VOID", "CONST", "FUNCTION_KEYWORD", "OR", "AND", "SAME", "NOT_EQ", "LT", 
			"GT", "LE", "MOD", "GE", "PLUS", "MINUS", "MULT", "DIV", "EQ", "QUESTION", 
			"COLON", "NEGATION", "XUPPER", "XLOW", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "COMMA", "DIGIT", "LOWECASE", "UPPERCASE", "WORD", 
			"DECIMAL", "Letter", "Letter_or_digit", "WHITESPACE", "COMMENT", "LINE_COMMENT", 
			"HexNumeral", "ZERO", "NonZeroDigit", "DecimalNumeral", "Digits", "Digit", 
			"DigitsAndUnderscores", "DigitOrUnderscore", "Underscores", "HexDigits", 
			"HexDigit", "HexDigitsAndUnderscores", "HexDigitOrUnderscore"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'pravdivost'", "'pravda'", "'lez'", "'cislo'", "'finalni'", 
			"'pokud'", "'jinak'", "'nazaklade'", "'jestlize'", "'odejdi'", "'tocpro'", 
			"'toc'", "'pro'", "'opakuj'", "'dokud'", "'vrat'", "'default'", "'void'", 
			"'constanta'", "'funkce'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", 
			"'<='", "'%'", "'>='", "'+'", "'-'", "'*'", "'/'", "'='", "'?'", "':'", 
			"'!'", "'X'", "'x'", "'('", "')'", "'{'", "'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOLEAN", "TRUE", "FALSE", "INT", "FINAL", "IF", "ELSE", 
			"SWITCH", "CASE", "BREAK", "FOR", "WHILE", "DO", "REPEAT", "UNTIL", "RETURN", 
			"DEFAULT", "VOID", "CONST", "FUNCTION_KEYWORD", "OR", "AND", "SAME", 
			"NOT_EQ", "LT", "GT", "LE", "MOD", "GE", "PLUS", "MINUS", "MULT", "DIV", 
			"EQ", "QUESTION", "COLON", "NEGATION", "XUPPER", "XLOW", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SEMI", "COMMA", "WORD", "DECIMAL", "Letter", "Letter_or_digit", 
			"WHITESPACE", "COMMENT", "LINE_COMMENT", "HexNumeral", "DecimalNumeral"
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


	public CeskaJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CeskaJava.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\6\60\u0154\n\60\r\60\16\60\u0155\3\61\3\61\3\62\3\62\3\63\3\63\3\63\6"+
		"\63\u015f\n\63\r\63\16\63\u0160\3\64\3\64\3\65\3\65\3\66\3\66\3\67\6\67"+
		"\u016a\n\67\r\67\16\67\u016b\3\67\3\67\38\38\38\38\78\u0174\n8\f8\168"+
		"\u0177\138\38\38\38\38\38\39\39\39\39\79\u0182\n9\f9\169\u0185\139\39"+
		"\39\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3=\5=\u0194\n=\3=\3=\3=\5=\u0199\n="+
		"\5=\u019b\n=\3>\3>\5>\u019f\n>\3>\5>\u01a2\n>\3?\3?\5?\u01a6\n?\3@\6@"+
		"\u01a9\n@\r@\16@\u01aa\3A\3A\5A\u01af\nA\3B\6B\u01b2\nB\rB\16B\u01b3\3"+
		"C\3C\5C\u01b8\nC\3C\5C\u01bb\nC\3D\3D\3E\6E\u01c0\nE\rE\16E\u01c1\3F\3"+
		"F\5F\u01c6\nF\3\u0175\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2"+
		"e\61g\62i\63k\64m\65o\66q\67s8u\2w\2y9{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\3\2\f\3\2\62;\3\2c|\3\2C\\\6\2&&C\\aac|\7\2"+
		"&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2ZZzz\3\2\63;\5\2\62"+
		";CHch\2\u01cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2y\3\2\2\2\3\u008d\3\2\2\2\5\u0091\3\2\2\2\7\u009c\3\2\2"+
		"\2\t\u00a3\3\2\2\2\13\u00a7\3\2\2\2\r\u00ad\3\2\2\2\17\u00b5\3\2\2\2\21"+
		"\u00bb\3\2\2\2\23\u00c1\3\2\2\2\25\u00cb\3\2\2\2\27\u00d4\3\2\2\2\31\u00db"+
		"\3\2\2\2\33\u00e2\3\2\2\2\35\u00e6\3\2\2\2\37\u00ea\3\2\2\2!\u00f1\3\2"+
		"\2\2#\u00f7\3\2\2\2%\u00fc\3\2\2\2\'\u0104\3\2\2\2)\u0109\3\2\2\2+\u0113"+
		"\3\2\2\2-\u011a\3\2\2\2/\u011d\3\2\2\2\61\u0120\3\2\2\2\63\u0123\3\2\2"+
		"\2\65\u0126\3\2\2\2\67\u0128\3\2\2\29\u012a\3\2\2\2;\u012d\3\2\2\2=\u012f"+
		"\3\2\2\2?\u0132\3\2\2\2A\u0134\3\2\2\2C\u0136\3\2\2\2E\u0138\3\2\2\2G"+
		"\u013a\3\2\2\2I\u013c\3\2\2\2K\u013e\3\2\2\2M\u0140\3\2\2\2O\u0142\3\2"+
		"\2\2Q\u0144\3\2\2\2S\u0146\3\2\2\2U\u0148\3\2\2\2W\u014a\3\2\2\2Y\u014c"+
		"\3\2\2\2[\u014e\3\2\2\2]\u0150\3\2\2\2_\u0153\3\2\2\2a\u0157\3\2\2\2c"+
		"\u0159\3\2\2\2e\u015e\3\2\2\2g\u0162\3\2\2\2i\u0164\3\2\2\2k\u0166\3\2"+
		"\2\2m\u0169\3\2\2\2o\u016f\3\2\2\2q\u017d\3\2\2\2s\u0188\3\2\2\2u\u018c"+
		"\3\2\2\2w\u018e\3\2\2\2y\u019a\3\2\2\2{\u019c\3\2\2\2}\u01a5\3\2\2\2\177"+
		"\u01a8\3\2\2\2\u0081\u01ae\3\2\2\2\u0083\u01b1\3\2\2\2\u0085\u01b5\3\2"+
		"\2\2\u0087\u01bc\3\2\2\2\u0089\u01bf\3\2\2\2\u008b\u01c5\3\2\2\2\u008d"+
		"\u008e\7\60\2\2\u008e\u008f\7\60\2\2\u008f\u0090\7\60\2\2\u0090\4\3\2"+
		"\2\2\u0091\u0092\7r\2\2\u0092\u0093\7t\2\2\u0093\u0094\7c\2\2\u0094\u0095"+
		"\7x\2\2\u0095\u0096\7f\2\2\u0096\u0097\7k\2\2\u0097\u0098\7x\2\2\u0098"+
		"\u0099\7q\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b\6\3\2\2\2\u009c"+
		"\u009d\7r\2\2\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7x\2\2"+
		"\u00a0\u00a1\7f\2\2\u00a1\u00a2\7c\2\2\u00a2\b\3\2\2\2\u00a3\u00a4\7n"+
		"\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7|\2\2\u00a6\n\3\2\2\2\u00a7\u00a8"+
		"\7e\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7p\2\2"+
		"\u00b3\u00b4\7k\2\2\u00b4\16\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7"+
		"q\2\2\u00b7\u00b8\7m\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7f\2\2\u00ba\20"+
		"\3\2\2\2\u00bb\u00bc\7l\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7c\2\2\u00bf\u00c0\7m\2\2\u00c0\22\3\2\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7|\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7m\2\2"+
		"\u00c6\u00c7\7n\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\24\3\2\2\2\u00cb\u00cc\7l\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7k\2\2\u00d1"+
		"\u00d2\7|\2\2\u00d2\u00d3\7g\2\2\u00d3\26\3\2\2\2\u00d4\u00d5\7q\2\2\u00d5"+
		"\u00d6\7f\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7l\2\2\u00d8\u00d9\7f\2\2"+
		"\u00d9\u00da\7k\2\2\u00da\30\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7"+
		"q\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7q\2\2\u00e1\32\3\2\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5"+
		"\7e\2\2\u00e5\34\3\2\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9"+
		"\7q\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7m\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7l\2\2\u00f0"+
		" \3\2\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7m\2\2\u00f4"+
		"\u00f5\7w\2\2\u00f5\u00f6\7f\2\2\u00f6\"\3\2\2\2\u00f7\u00f8\7x\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7v\2\2\u00fb$\3\2\2\2\u00fc"+
		"\u00fd\7f\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7c\2\2"+
		"\u0100\u0101\7w\2\2\u0101\u0102\7n\2\2\u0102\u0103\7v\2\2\u0103&\3\2\2"+
		"\2\u0104\u0105\7x\2\2\u0105\u0106\7q\2\2\u0106\u0107\7k\2\2\u0107\u0108"+
		"\7f\2\2\u0108(\3\2\2\2\u0109\u010a\7e\2\2\u010a\u010b\7q\2\2\u010b\u010c"+
		"\7p\2\2\u010c\u010d\7u\2\2\u010d\u010e\7v\2\2\u010e\u010f\7c\2\2\u010f"+
		"\u0110\7p\2\2\u0110\u0111\7v\2\2\u0111\u0112\7c\2\2\u0112*\3\2\2\2\u0113"+
		"\u0114\7h\2\2\u0114\u0115\7w\2\2\u0115\u0116\7p\2\2\u0116\u0117\7m\2\2"+
		"\u0117\u0118\7e\2\2\u0118\u0119\7g\2\2\u0119,\3\2\2\2\u011a\u011b\7~\2"+
		"\2\u011b\u011c\7~\2\2\u011c.\3\2\2\2\u011d\u011e\7(\2\2\u011e\u011f\7"+
		"(\2\2\u011f\60\3\2\2\2\u0120\u0121\7?\2\2\u0121\u0122\7?\2\2\u0122\62"+
		"\3\2\2\2\u0123\u0124\7#\2\2\u0124\u0125\7?\2\2\u0125\64\3\2\2\2\u0126"+
		"\u0127\7>\2\2\u0127\66\3\2\2\2\u0128\u0129\7@\2\2\u01298\3\2\2\2\u012a"+
		"\u012b\7>\2\2\u012b\u012c\7?\2\2\u012c:\3\2\2\2\u012d\u012e\7\'\2\2\u012e"+
		"<\3\2\2\2\u012f\u0130\7@\2\2\u0130\u0131\7?\2\2\u0131>\3\2\2\2\u0132\u0133"+
		"\7-\2\2\u0133@\3\2\2\2\u0134\u0135\7/\2\2\u0135B\3\2\2\2\u0136\u0137\7"+
		",\2\2\u0137D\3\2\2\2\u0138\u0139\7\61\2\2\u0139F\3\2\2\2\u013a\u013b\7"+
		"?\2\2\u013bH\3\2\2\2\u013c\u013d\7A\2\2\u013dJ\3\2\2\2\u013e\u013f\7<"+
		"\2\2\u013fL\3\2\2\2\u0140\u0141\7#\2\2\u0141N\3\2\2\2\u0142\u0143\7Z\2"+
		"\2\u0143P\3\2\2\2\u0144\u0145\7z\2\2\u0145R\3\2\2\2\u0146\u0147\7*\2\2"+
		"\u0147T\3\2\2\2\u0148\u0149\7+\2\2\u0149V\3\2\2\2\u014a\u014b\7}\2\2\u014b"+
		"X\3\2\2\2\u014c\u014d\7\177\2\2\u014dZ\3\2\2\2\u014e\u014f\7=\2\2\u014f"+
		"\\\3\2\2\2\u0150\u0151\7.\2\2\u0151^\3\2\2\2\u0152\u0154\t\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156`\3\2\2\2\u0157\u0158\t\3\2\2\u0158b\3\2\2\2\u0159\u015a\t\4"+
		"\2\2\u015ad\3\2\2\2\u015b\u015f\5a\61\2\u015c\u015f\5c\62\2\u015d\u015f"+
		"\7a\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161f\3\2\2\2"+
		"\u0162\u0163\5_\60\2\u0163h\3\2\2\2\u0164\u0165\t\5\2\2\u0165j\3\2\2\2"+
		"\u0166\u0167\t\6\2\2\u0167l\3\2\2\2\u0168\u016a\t\7\2\2\u0169\u0168\3"+
		"\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016e\b\67\2\2\u016en\3\2\2\2\u016f\u0170\7\61\2"+
		"\2\u0170\u0171\7,\2\2\u0171\u0175\3\2\2\2\u0172\u0174\13\2\2\2\u0173\u0172"+
		"\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7,\2\2\u0179\u017a\7\61"+
		"\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b8\2\2\u017cp\3\2\2\2\u017d\u017e"+
		"\7\61\2\2\u017e\u017f\7\61\2\2\u017f\u0183\3\2\2\2\u0180\u0182\n\b\2\2"+
		"\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\b9\2\2\u0187"+
		"r\3\2\2\2\u0188\u0189\5u;\2\u0189\u018a\t\t\2\2\u018a\u018b\5\u0085C\2"+
		"\u018bt\3\2\2\2\u018c\u018d\7\62\2\2\u018dv\3\2\2\2\u018e\u018f\t\n\2"+
		"\2\u018fx\3\2\2\2\u0190\u019b\5u;\2\u0191\u0198\5w<\2\u0192\u0194\5{>"+
		"\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0199\3\2\2\2\u0195\u0196"+
		"\5\u0083B\2\u0196\u0197\5{>\2\u0197\u0199\3\2\2\2\u0198\u0193\3\2\2\2"+
		"\u0198\u0195\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0190\3\2\2\2\u019a\u0191"+
		"\3\2\2\2\u019bz\3\2\2\2\u019c\u01a1\5}?\2\u019d\u019f\5\177@\2\u019e\u019d"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\5}?\2\u01a1"+
		"\u019e\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2|\3\2\2\2\u01a3\u01a6\5u;\2\u01a4"+
		"\u01a6\5w<\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6~\3\2\2\2\u01a7"+
		"\u01a9\5\u0081A\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u0080\3\2\2\2\u01ac\u01af\5}?\2\u01ad"+
		"\u01af\7a\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u0082\3\2"+
		"\2\2\u01b0\u01b2\7a\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u0084\3\2\2\2\u01b5\u01ba\5\u0087"+
		"D\2\u01b6\u01b8\5\u0089E\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\5\u0087D\2\u01ba\u01b7\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u0086\3\2\2\2\u01bc\u01bd\t\13\2\2\u01bd\u0088\3\2\2\2"+
		"\u01be\u01c0\5\u008bF\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u008a\3\2\2\2\u01c3\u01c6\5\u0087"+
		"D\2\u01c4\u01c6\7a\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u008c"+
		"\3\2\2\2\26\2\u0155\u015e\u0160\u016b\u0175\u0183\u0193\u0198\u019a\u019e"+
		"\u01a1\u01a5\u01aa\u01ae\u01b3\u01b7\u01ba\u01c1\u01c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}