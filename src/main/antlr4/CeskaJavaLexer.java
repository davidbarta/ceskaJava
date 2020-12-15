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
		CASE=10, BREAK=11, FOR=12, WHILE=13, DO=14, REPEAT=15, UNTIL=16, CLASS=17, 
		EXTENDS=18, RETURN=19, OR=20, AND=21, SAME=22, NOT_EQ=23, LT=24, GT=25, 
		LE=26, GE=27, PLUS=28, MINUS=29, MULT=30, DIV=31, EQ=32, QUESTION=33, 
		COLON=34, NEGATION=35, XUPPER=36, XLOW=37, LPAREN=38, RPAREN=39, LBRACE=40, 
		RBRACE=41, SEMI=42, Letter=43, Letter_or_digit=44, WHITESPACE=45, COMMENT=46, 
		LINE_COMMENT=47, HexNumeral=48, DecimalNumeral=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BOOLEAN", "TRUE", "FALSE", "INT", "FINAL", "IF", "ELSE", "SWITCH", 
			"CASE", "BREAK", "FOR", "WHILE", "DO", "REPEAT", "UNTIL", "CLASS", "EXTENDS", 
			"RETURN", "OR", "AND", "SAME", "NOT_EQ", "LT", "GT", "LE", "GE", "PLUS", 
			"MINUS", "MULT", "DIV", "EQ", "QUESTION", "COLON", "NEGATION", "XUPPER", 
			"XLOW", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "Letter", "Letter_or_digit", 
			"WHITESPACE", "COMMENT", "LINE_COMMENT", "HexNumeral", "ZERO", "NonZeroDigit", 
			"DecimalNumeral", "Digits", "Digit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", "HexDigitOrUnderscore"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'pravdivost'", "'pravda'", "'lez'", "'cislo'", "'finalni'", 
			"'kdyz'", "'jinak'", "'moznosti'", "'moznost'", "'odejdi'", "'tocpro'", 
			"'toc'", "'pro'", "'opakuj'", "'dokud'", "'trida'", "'dedi'", "'vrat'", 
			"'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'?'", "':'", "'!'", "'X'", "'x'", "'('", 
			"')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOLEAN", "TRUE", "FALSE", "INT", "FINAL", "IF", "ELSE", 
			"SWITCH", "CASE", "BREAK", "FOR", "WHILE", "DO", "REPEAT", "UNTIL", "CLASS", 
			"EXTENDS", "RETURN", "OR", "AND", "SAME", "NOT_EQ", "LT", "GT", "LE", 
			"GE", "PLUS", "MINUS", "MULT", "DIV", "EQ", "QUESTION", "COLON", "NEGATION", 
			"XUPPER", "XLOW", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "Letter", 
			"Letter_or_digit", "WHITESPACE", "COMMENT", "LINE_COMMENT", "HexNumeral", 
			"DecimalNumeral"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0189\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\6.\u012c\n."+
		"\r.\16.\u012d\3.\3.\3/\3/\3/\3/\7/\u0136\n/\f/\16/\u0139\13/\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\7\60\u0144\n\60\f\60\16\60\u0147\13\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\5\64\u0156"+
		"\n\64\3\64\3\64\3\64\5\64\u015b\n\64\5\64\u015d\n\64\3\65\3\65\5\65\u0161"+
		"\n\65\3\65\5\65\u0164\n\65\3\66\3\66\5\66\u0168\n\66\3\67\6\67\u016b\n"+
		"\67\r\67\16\67\u016c\38\38\58\u0171\n8\39\69\u0174\n9\r9\169\u0175\3:"+
		"\3:\5:\u017a\n:\3:\5:\u017d\n:\3;\3;\3<\6<\u0182\n<\r<\16<\u0183\3=\3"+
		"=\5=\u0188\n=\3\u0137\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\2e\2g\63i\2k\2m\2o\2q\2s\2u\2w\2y\2\3\2\t\6\2&&C\\aac|\7\2&&\62;C\\"+
		"aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2ZZzz\3\2\63;\5\2\62;CHch\2\u018d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2g\3\2\2\2\3{\3\2\2\2\5\177\3\2\2\2\7\u008a\3\2\2\2\t\u0091\3\2"+
		"\2\2\13\u0095\3\2\2\2\r\u009b\3\2\2\2\17\u00a3\3\2\2\2\21\u00a8\3\2\2"+
		"\2\23\u00ae\3\2\2\2\25\u00b7\3\2\2\2\27\u00bf\3\2\2\2\31\u00c6\3\2\2\2"+
		"\33\u00cd\3\2\2\2\35\u00d1\3\2\2\2\37\u00d5\3\2\2\2!\u00dc\3\2\2\2#\u00e2"+
		"\3\2\2\2%\u00e8\3\2\2\2\'\u00ed\3\2\2\2)\u00f2\3\2\2\2+\u00f5\3\2\2\2"+
		"-\u00f8\3\2\2\2/\u00fb\3\2\2\2\61\u00fe\3\2\2\2\63\u0100\3\2\2\2\65\u0102"+
		"\3\2\2\2\67\u0105\3\2\2\29\u0108\3\2\2\2;\u010a\3\2\2\2=\u010c\3\2\2\2"+
		"?\u010e\3\2\2\2A\u0110\3\2\2\2C\u0112\3\2\2\2E\u0114\3\2\2\2G\u0116\3"+
		"\2\2\2I\u0118\3\2\2\2K\u011a\3\2\2\2M\u011c\3\2\2\2O\u011e\3\2\2\2Q\u0120"+
		"\3\2\2\2S\u0122\3\2\2\2U\u0124\3\2\2\2W\u0126\3\2\2\2Y\u0128\3\2\2\2["+
		"\u012b\3\2\2\2]\u0131\3\2\2\2_\u013f\3\2\2\2a\u014a\3\2\2\2c\u014e\3\2"+
		"\2\2e\u0150\3\2\2\2g\u015c\3\2\2\2i\u015e\3\2\2\2k\u0167\3\2\2\2m\u016a"+
		"\3\2\2\2o\u0170\3\2\2\2q\u0173\3\2\2\2s\u0177\3\2\2\2u\u017e\3\2\2\2w"+
		"\u0181\3\2\2\2y\u0187\3\2\2\2{|\7\60\2\2|}\7\60\2\2}~\7\60\2\2~\4\3\2"+
		"\2\2\177\u0080\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7x\2\2\u0083\u0084\7f\2\2\u0084\u0085\7k\2\2\u0085\u0086\7x\2\2\u0086"+
		"\u0087\7q\2\2\u0087\u0088\7u\2\2\u0088\u0089\7v\2\2\u0089\6\3\2\2\2\u008a"+
		"\u008b\7r\2\2\u008b\u008c\7t\2\2\u008c\u008d\7c\2\2\u008d\u008e\7x\2\2"+
		"\u008e\u008f\7f\2\2\u008f\u0090\7c\2\2\u0090\b\3\2\2\2\u0091\u0092\7n"+
		"\2\2\u0092\u0093\7g\2\2\u0093\u0094\7|\2\2\u0094\n\3\2\2\2\u0095\u0096"+
		"\7e\2\2\u0096\u0097\7k\2\2\u0097\u0098\7u\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7q\2\2\u009a\f\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\u00a2\7k\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\7m\2\2\u00a4\u00a5\7"+
		"f\2\2\u00a5\u00a6\7{\2\2\u00a6\u00a7\7|\2\2\u00a7\20\3\2\2\2\u00a8\u00a9"+
		"\7l\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7c\2\2\u00ac"+
		"\u00ad\7m\2\2\u00ad\22\3\2\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\u00b1\7|\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7u\2\2"+
		"\u00b4\u00b5\7v\2\2\u00b5\u00b6\7k\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7"+
		"o\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7|\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7q\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be\26\3\2\2\2\u00bf\u00c0"+
		"\7q\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7l\2\2\u00c3"+
		"\u00c4\7f\2\2\u00c4\u00c5\7k\2\2\u00c5\30\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7t\2\2"+
		"\u00cb\u00cc\7q\2\2\u00cc\32\3\2\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7"+
		"q\2\2\u00cf\u00d0\7e\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3"+
		"\7t\2\2\u00d3\u00d4\7q\2\2\u00d4\36\3\2\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7"+
		"\7r\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7m\2\2\u00d9\u00da\7w\2\2\u00da"+
		"\u00db\7l\2\2\u00db \3\2\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7q\2\2\u00de"+
		"\u00df\7m\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7f\2\2\u00e1\"\3\2\2\2\u00e2"+
		"\u00e3\7v\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7f\2\2"+
		"\u00e6\u00e7\7c\2\2\u00e7$\3\2\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2"+
		"\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7k\2\2\u00ec&\3\2\2\2\u00ed\u00ee\7"+
		"x\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7v\2\2\u00f1("+
		"\3\2\2\2\u00f2\u00f3\7~\2\2\u00f3\u00f4\7~\2\2\u00f4*\3\2\2\2\u00f5\u00f6"+
		"\7(\2\2\u00f6\u00f7\7(\2\2\u00f7,\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9\u00fa"+
		"\7?\2\2\u00fa.\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc\u00fd\7?\2\2\u00fd\60"+
		"\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\62\3\2\2\2\u0100\u0101\7@\2\2\u0101"+
		"\64\3\2\2\2\u0102\u0103\7>\2\2\u0103\u0104\7?\2\2\u0104\66\3\2\2\2\u0105"+
		"\u0106\7@\2\2\u0106\u0107\7?\2\2\u01078\3\2\2\2\u0108\u0109\7-\2\2\u0109"+
		":\3\2\2\2\u010a\u010b\7/\2\2\u010b<\3\2\2\2\u010c\u010d\7,\2\2\u010d>"+
		"\3\2\2\2\u010e\u010f\7\61\2\2\u010f@\3\2\2\2\u0110\u0111\7?\2\2\u0111"+
		"B\3\2\2\2\u0112\u0113\7A\2\2\u0113D\3\2\2\2\u0114\u0115\7<\2\2\u0115F"+
		"\3\2\2\2\u0116\u0117\7#\2\2\u0117H\3\2\2\2\u0118\u0119\7Z\2\2\u0119J\3"+
		"\2\2\2\u011a\u011b\7z\2\2\u011bL\3\2\2\2\u011c\u011d\7*\2\2\u011dN\3\2"+
		"\2\2\u011e\u011f\7+\2\2\u011fP\3\2\2\2\u0120\u0121\7}\2\2\u0121R\3\2\2"+
		"\2\u0122\u0123\7\177\2\2\u0123T\3\2\2\2\u0124\u0125\7=\2\2\u0125V\3\2"+
		"\2\2\u0126\u0127\t\2\2\2\u0127X\3\2\2\2\u0128\u0129\t\3\2\2\u0129Z\3\2"+
		"\2\2\u012a\u012c\t\4\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b."+
		"\2\2\u0130\\\3\2\2\2\u0131\u0132\7\61\2\2\u0132\u0133\7,\2\2\u0133\u0137"+
		"\3\2\2\2\u0134\u0136\13\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013b\7,\2\2\u013b\u013c\7\61\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\b/\2\2\u013e^\3\2\2\2\u013f\u0140\7\61\2\2\u0140\u0141\7\61\2\2"+
		"\u0141\u0145\3\2\2\2\u0142\u0144\n\5\2\2\u0143\u0142\3\2\2\2\u0144\u0147"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u0149\b\60\2\2\u0149`\3\2\2\2\u014a\u014b\5c\62\2"+
		"\u014b\u014c\t\6\2\2\u014c\u014d\5s:\2\u014db\3\2\2\2\u014e\u014f\7\62"+
		"\2\2\u014fd\3\2\2\2\u0150\u0151\t\7\2\2\u0151f\3\2\2\2\u0152\u015d\5c"+
		"\62\2\u0153\u015a\5e\63\2\u0154\u0156\5i\65\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u015b\3\2\2\2\u0157\u0158\5q9\2\u0158\u0159\5i\65"+
		"\2\u0159\u015b\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0157\3\2\2\2\u015b\u015d"+
		"\3\2\2\2\u015c\u0152\3\2\2\2\u015c\u0153\3\2\2\2\u015dh\3\2\2\2\u015e"+
		"\u0163\5k\66\2\u015f\u0161\5m\67\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0164\5k\66\2\u0163\u0160\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164j\3\2\2\2\u0165\u0168\5c\62\2\u0166\u0168\5e\63\2"+
		"\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168l\3\2\2\2\u0169\u016b\5"+
		"o8\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016dn\3\2\2\2\u016e\u0171\5k\66\2\u016f\u0171\7a\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171p\3\2\2\2\u0172\u0174\7a\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176r\3\2\2\2\u0177\u017c\5u;\2\u0178\u017a\5w<\2\u0179\u0178\3"+
		"\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\5u;\2\u017c"+
		"\u0179\3\2\2\2\u017c\u017d\3\2\2\2\u017dt\3\2\2\2\u017e\u017f\t\b\2\2"+
		"\u017fv\3\2\2\2\u0180\u0182\5y=\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184x\3\2\2\2\u0185\u0188"+
		"\5u;\2\u0186\u0188\7a\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"z\3\2\2\2\23\2\u012d\u0137\u0145\u0155\u015a\u015c\u0160\u0163\u0167\u016c"+
		"\u0170\u0175\u0179\u017c\u0183\u0187\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}