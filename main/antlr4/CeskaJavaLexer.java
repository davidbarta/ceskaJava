// Generated from C:/Users/JanRychlik/IdeaProjects/ceskaJava/src/main/antlr4\CeskaJava.g4 by ANTLR 4.9
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
		BOOLEAN=1, INT=2, TRUE=3, FALSE=4, FINAL=5, IF=6, ELSE=7, SWITCH=8, CASE=9, 
		BREAK=10, FOR=11, DOWNTO=12, TO=13, WHILE=14, DO=15, REPEAT=16, UNTIL=17, 
		VOID=18, RETURN=19, OR=20, AND=21, SAME=22, NOT_EQ=23, LT=24, GT=25, LE=26, 
		GE=27, PLUS=28, MINUS=29, MULT=30, DIV=31, EQ=32, QUESTION=33, COLON=34, 
		NEGATION=35, XUPPER=36, XLOW=37, LPAREN=38, RPAREN=39, LBRACE=40, RBRACE=41, 
		SEMI=42, COMMA=43, DecimalNumeral=44, HexNumeral=45, Letter=46, Letter_or_digit=47, 
		WHITESPACE=48, COMMENT=49, LINE_COMMENT=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "INT", "TRUE", "FALSE", "FINAL", "IF", "ELSE", "SWITCH", "CASE", 
			"BREAK", "FOR", "DOWNTO", "TO", "WHILE", "DO", "REPEAT", "UNTIL", "VOID", 
			"RETURN", "OR", "AND", "SAME", "NOT_EQ", "LT", "GT", "LE", "GE", "PLUS", 
			"MINUS", "MULT", "DIV", "EQ", "QUESTION", "COLON", "NEGATION", "XUPPER", 
			"XLOW", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", "ZERO", 
			"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
			"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
			"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "Letter", "Letter_or_digit", 
			"WHITESPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'int'", "'true'", "'false'", "'final'", "'if'", "'else'", 
			"'switch'", "'case'", "'break'", "'for'", "'downto'", "'to'", "'while'", 
			"'do'", "'repeat'", "'until'", "'void'", "'return'", "'||'", "'&&'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'?'", "':'", "'!'", "'X'", "'x'", "'('", "')'", "'{'", "'}'", 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "INT", "TRUE", "FALSE", "FINAL", "IF", "ELSE", "SWITCH", 
			"CASE", "BREAK", "FOR", "DOWNTO", "TO", "WHILE", "DO", "REPEAT", "UNTIL", 
			"VOID", "RETURN", "OR", "AND", "SAME", "NOT_EQ", "LT", "GT", "LE", "GE", 
			"PLUS", "MINUS", "MULT", "DIV", "EQ", "QUESTION", "COLON", "NEGATION", 
			"XUPPER", "XLOW", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", 
			"DecimalNumeral", "HexNumeral", "Letter", "Letter_or_digit", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u017d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3.\5.\u0120\n.\3.\3.\3.\5.\u0125\n.\5.\u0127\n.\3/\3/\5/\u012b\n/\3/"+
		"\5/\u012e\n/\3\60\3\60\5\60\u0132\n\60\3\61\3\61\3\62\6\62\u0137\n\62"+
		"\r\62\16\62\u0138\3\63\3\63\5\63\u013d\n\63\3\64\6\64\u0140\n\64\r\64"+
		"\16\64\u0141\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u014a\n\66\3\66\5\66\u014d"+
		"\n\66\3\67\3\67\38\68\u0152\n8\r8\168\u0153\39\39\59\u0158\n9\3:\3:\3"+
		";\3;\3<\6<\u015f\n<\r<\16<\u0160\3<\3<\3=\3=\3=\3=\7=\u0169\n=\f=\16="+
		"\u016c\13=\3=\3=\3=\3=\3=\3>\3>\3>\3>\7>\u0177\n>\f>\16>\u017a\13>\3>"+
		"\3>\3\u016a\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[.]\2_\2a\2c\2e\2g\2i/"+
		"k\2m\2o\2q\2s\60u\61w\62y\63{\64\3\2\t\3\2\63;\4\2ZZzz\5\2\62;CHch\6\2"+
		"&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0181\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2i\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0085\3\2\2\2\7\u0089\3\2\2\2"+
		"\t\u008e\3\2\2\2\13\u0094\3\2\2\2\r\u009a\3\2\2\2\17\u009d\3\2\2\2\21"+
		"\u00a2\3\2\2\2\23\u00a9\3\2\2\2\25\u00ae\3\2\2\2\27\u00b4\3\2\2\2\31\u00b8"+
		"\3\2\2\2\33\u00bf\3\2\2\2\35\u00c2\3\2\2\2\37\u00c8\3\2\2\2!\u00cb\3\2"+
		"\2\2#\u00d2\3\2\2\2%\u00d8\3\2\2\2\'\u00dd\3\2\2\2)\u00e4\3\2\2\2+\u00e7"+
		"\3\2\2\2-\u00ea\3\2\2\2/\u00ed\3\2\2\2\61\u00f0\3\2\2\2\63\u00f2\3\2\2"+
		"\2\65\u00f4\3\2\2\2\67\u00f7\3\2\2\29\u00fa\3\2\2\2;\u00fc\3\2\2\2=\u00fe"+
		"\3\2\2\2?\u0100\3\2\2\2A\u0102\3\2\2\2C\u0104\3\2\2\2E\u0106\3\2\2\2G"+
		"\u0108\3\2\2\2I\u010a\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2\2\2O\u0110\3\2"+
		"\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0116\3\2\2\2W\u0118\3\2\2\2Y\u011a"+
		"\3\2\2\2[\u0126\3\2\2\2]\u0128\3\2\2\2_\u0131\3\2\2\2a\u0133\3\2\2\2c"+
		"\u0136\3\2\2\2e\u013c\3\2\2\2g\u013f\3\2\2\2i\u0143\3\2\2\2k\u0147\3\2"+
		"\2\2m\u014e\3\2\2\2o\u0151\3\2\2\2q\u0157\3\2\2\2s\u0159\3\2\2\2u\u015b"+
		"\3\2\2\2w\u015e\3\2\2\2y\u0164\3\2\2\2{\u0172\3\2\2\2}~\7d\2\2~\177\7"+
		"q\2\2\177\u0080\7q\2\2\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7p\2\2\u0084\4\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7v\2\2\u0088\6\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7t\2\2\u008b\u008c\7w\2\2\u008c\u008d\7g\2\2\u008d\b\3\2\2\2\u008e\u008f"+
		"\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092"+
		"\u0093\7g\2\2\u0093\n\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7p\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2\u0099\f\3\2\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c\16\3\2\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\20\3\2\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7v\2\2"+
		"\u00a6\u00a7\7e\2\2\u00a7\u00a8\7j\2\2\u00a8\22\3\2\2\2\u00a9\u00aa\7"+
		"e\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7g\2\2\u00ad\24"+
		"\3\2\2\2\u00ae\u00af\7d\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b3\7m\2\2\u00b3\26\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5"+
		"\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7f\2\2\u00b9"+
		"\u00ba\7q\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2"+
		"\u00bd\u00be\7q\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7"+
		"q\2\2\u00c1\34\3\2\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5"+
		"\7k\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7\36\3\2\2\2\u00c8\u00c9"+
		"\7f\2\2\u00c9\u00ca\7q\2\2\u00ca \3\2\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7c\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\"\3\2\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\u00d5\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7n\2\2\u00d7$\3\2\2\2\u00d8"+
		"\u00d9\7x\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7f\2\2"+
		"\u00dc&\3\2\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7v\2"+
		"\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7p\2\2\u00e3(\3\2"+
		"\2\2\u00e4\u00e5\7~\2\2\u00e5\u00e6\7~\2\2\u00e6*\3\2\2\2\u00e7\u00e8"+
		"\7(\2\2\u00e8\u00e9\7(\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec"+
		"\7?\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\7?\2\2\u00ef\60"+
		"\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1\62\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3"+
		"\64\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f6\7?\2\2\u00f6\66\3\2\2\2\u00f7"+
		"\u00f8\7@\2\2\u00f8\u00f9\7?\2\2\u00f98\3\2\2\2\u00fa\u00fb\7-\2\2\u00fb"+
		":\3\2\2\2\u00fc\u00fd\7/\2\2\u00fd<\3\2\2\2\u00fe\u00ff\7,\2\2\u00ff>"+
		"\3\2\2\2\u0100\u0101\7\61\2\2\u0101@\3\2\2\2\u0102\u0103\7?\2\2\u0103"+
		"B\3\2\2\2\u0104\u0105\7A\2\2\u0105D\3\2\2\2\u0106\u0107\7<\2\2\u0107F"+
		"\3\2\2\2\u0108\u0109\7#\2\2\u0109H\3\2\2\2\u010a\u010b\7Z\2\2\u010bJ\3"+
		"\2\2\2\u010c\u010d\7z\2\2\u010dL\3\2\2\2\u010e\u010f\7*\2\2\u010fN\3\2"+
		"\2\2\u0110\u0111\7+\2\2\u0111P\3\2\2\2\u0112\u0113\7}\2\2\u0113R\3\2\2"+
		"\2\u0114\u0115\7\177\2\2\u0115T\3\2\2\2\u0116\u0117\7=\2\2\u0117V\3\2"+
		"\2\2\u0118\u0119\7.\2\2\u0119X\3\2\2\2\u011a\u011b\7\62\2\2\u011bZ\3\2"+
		"\2\2\u011c\u0127\5Y-\2\u011d\u0124\5a\61\2\u011e\u0120\5]/\2\u011f\u011e"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0125\3\2\2\2\u0121\u0122\5g\64\2\u0122"+
		"\u0123\5]/\2\u0123\u0125\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0121\3\2\2"+
		"\2\u0125\u0127\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u011d\3\2\2\2\u0127\\"+
		"\3\2\2\2\u0128\u012d\5_\60\2\u0129\u012b\5c\62\2\u012a\u0129\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\5_\60\2\u012d\u012a\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e^\3\2\2\2\u012f\u0132\5Y-\2\u0130\u0132"+
		"\5a\61\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132`\3\2\2\2\u0133"+
		"\u0134\t\2\2\2\u0134b\3\2\2\2\u0135\u0137\5e\63\2\u0136\u0135\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139d\3"+
		"\2\2\2\u013a\u013d\5_\60\2\u013b\u013d\7a\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013df\3\2\2\2\u013e\u0140\7a\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142h\3\2\2\2"+
		"\u0143\u0144\5Y-\2\u0144\u0145\t\3\2\2\u0145\u0146\5k\66\2\u0146j\3\2"+
		"\2\2\u0147\u014c\5m\67\2\u0148\u014a\5o8\2\u0149\u0148\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\5m\67\2\u014c\u0149\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014dl\3\2\2\2\u014e\u014f\t\4\2\2\u014fn\3\2\2\2\u0150"+
		"\u0152\5q9\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2"+
		"\2\u0153\u0154\3\2\2\2\u0154p\3\2\2\2\u0155\u0158\5m\67\2\u0156\u0158"+
		"\7a\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158r\3\2\2\2\u0159\u015a"+
		"\t\5\2\2\u015at\3\2\2\2\u015b\u015c\t\6\2\2\u015cv\3\2\2\2\u015d\u015f"+
		"\t\7\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b<\2\2\u0163x\3\2\2\2\u0164"+
		"\u0165\7\61\2\2\u0165\u0166\7,\2\2\u0166\u016a\3\2\2\2\u0167\u0169\13"+
		"\2\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u016b\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7,"+
		"\2\2\u016e\u016f\7\61\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b=\2\2\u0171"+
		"z\3\2\2\2\u0172\u0173\7\61\2\2\u0173\u0174\7\61\2\2\u0174\u0178\3\2\2"+
		"\2\u0175\u0177\n\b\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017c\b>\2\2\u017c|\3\2\2\2\23\2\u011f\u0124\u0126\u012a\u012d\u0131"+
		"\u0138\u013c\u0141\u0149\u014c\u0153\u0157\u0160\u016a\u0178\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}