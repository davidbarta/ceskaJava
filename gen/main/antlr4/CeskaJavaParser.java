// Generated from C:/Users/JanRychlik/IdeaProjects/ceskaJava/src/main/antlr4\CeskaJava.g4 by ANTLR 4.9
package main.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CeskaJavaParser extends Parser {
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
	public static final int
		RULE_boolean_values = 0, RULE_varTypes = 1, RULE_decimalSymbol = 2, RULE_modifier = 3, 
		RULE_program = 4, RULE_block = 5, RULE_body = 6, RULE_block_statement = 7, 
		RULE_block_body = 8, RULE_identifier = 9, RULE_statement = 10, RULE_variable_assigment = 11, 
		RULE_return_statement = 12, RULE_expression_body = 13, RULE_variable_declaration = 14, 
		RULE_decimal_variable = 15, RULE_bool_variable = 16, RULE_parallel_declaration = 17, 
		RULE_expression = 18, RULE_literal = 19, RULE_boolean_literal = 20, RULE_integer_literal = 21, 
		RULE_for_type = 22, RULE_for_init = 23, RULE_for_statement = 24, RULE_switch_block = 25, 
		RULE_function_declaration = 26, RULE_function_header = 27, RULE_function_declarator = 28, 
		RULE_function_type = 29, RULE_function_body = 30, RULE_formal_parameter = 31, 
		RULE_function_call_statement = 32, RULE_argument_list = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"boolean_values", "varTypes", "decimalSymbol", "modifier", "program", 
			"block", "body", "block_statement", "block_body", "identifier", "statement", 
			"variable_assigment", "return_statement", "expression_body", "variable_declaration", 
			"decimal_variable", "bool_variable", "parallel_declaration", "expression", 
			"literal", "boolean_literal", "integer_literal", "for_type", "for_init", 
			"for_statement", "switch_block", "function_declaration", "function_header", 
			"function_declarator", "function_type", "function_body", "formal_parameter", 
			"function_call_statement", "argument_list"
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

	@Override
	public String getGrammarFileName() { return "CeskaJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CeskaJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Boolean_valuesContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CeskaJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CeskaJavaParser.FALSE, 0); }
		public Boolean_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterBoolean_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitBoolean_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitBoolean_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_valuesContext boolean_values() throws RecognitionException {
		Boolean_valuesContext _localctx = new Boolean_valuesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_boolean_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class VarTypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CeskaJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CeskaJavaParser.BOOLEAN, 0); }
		public VarTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterVarTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitVarTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitVarTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypesContext varTypes() throws RecognitionException {
		VarTypesContext _localctx = new VarTypesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
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

	public static class DecimalSymbolContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CeskaJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CeskaJavaParser.MINUS, 0); }
		public DecimalSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterDecimalSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitDecimalSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitDecimalSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalSymbolContext decimalSymbol() throws RecognitionException {
		DecimalSymbolContext _localctx = new DecimalSymbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decimalSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(CeskaJavaParser.FINAL, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(FINAL);
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

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CeskaJavaParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			block();
			setState(77);
			match(EOF);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CeskaJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CeskaJavaParser.RBRACE, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRACE);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FINAL) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << VOID) | (1L << RETURN) | (1L << Letter))) != 0)) {
				{
				setState(80);
				block_statement();
				}
			}

			setState(83);
			match(RBRACE);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CeskaJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CeskaJavaParser.RBRACE, 0); }
		public Block_bodyContext block_body() {
			return getRuleContext(Block_bodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LBRACE);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FINAL) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << RETURN) | (1L << Letter))) != 0)) {
				{
				setState(86);
				block_body();
				}
			}

			setState(89);
			match(RBRACE);
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

	public static class Block_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(91);
					statement();
					}
					break;
				case 2:
					{
					setState(92);
					function_declaration();
					}
					break;
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FINAL) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << VOID) | (1L << RETURN) | (1L << Letter))) != 0) );
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

	public static class Block_bodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterBlock_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitBlock_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitBlock_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_bodyContext block_body() throws RecognitionException {
		Block_bodyContext _localctx = new Block_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				statement();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FINAL) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << RETURN) | (1L << Letter))) != 0) );
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Letter() { return getToken(CeskaJavaParser.Letter, 0); }
		public List<TerminalNode> Letter_or_digit() { return getTokens(CeskaJavaParser.Letter_or_digit); }
		public TerminalNode Letter_or_digit(int i) {
			return getToken(CeskaJavaParser.Letter_or_digit, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(Letter);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(Letter_or_digit);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(CeskaJavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatuntilStatementContext extends StatementContext {
		public TerminalNode REPEAT() { return getToken(CeskaJavaParser.REPEAT, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(CeskaJavaParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatuntilStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterRepeatuntilStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitRepeatuntilStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitRepeatuntilStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DowhileStatementContext extends StatementContext {
		public TerminalNode DO() { return getToken(CeskaJavaParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CeskaJavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DowhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterDowhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitDowhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitDowhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfelseStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(CeskaJavaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CeskaJavaParser.ELSE, 0); }
		public IfelseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterIfelseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitIfelseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitIfelseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarassigmentStatementContext extends StatementContext {
		public Variable_assigmentContext variable_assigment() {
			return getRuleContext(Variable_assigmentContext.class,0);
		}
		public VarassigmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterVarassigmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitVarassigmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitVarassigmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VardeclarationStatementContext extends StatementContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public VardeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterVardeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitVardeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitVardeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctioncallStatementContext extends StatementContext {
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public FunctioncallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFunctioncallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFunctioncallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFunctioncallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatementContext {
		public TerminalNode FOR() { return getToken(CeskaJavaParser.FOR, 0); }
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CeskaJavaParser.SEMI, 0); }
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStatementContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(CeskaJavaParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CeskaJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CeskaJavaParser.RBRACE, 0); }
		public List<Switch_blockContext> switch_block() {
			return getRuleContexts(Switch_blockContext.class);
		}
		public Switch_blockContext switch_block(int i) {
			return getRuleContext(Switch_blockContext.class,i);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhiledoStatementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(CeskaJavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(CeskaJavaParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhiledoStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterWhiledoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitWhiledoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitWhiledoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IfelseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(IF);
				setState(110);
				expression();
				setState(111);
				body();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(112);
					match(ELSE);
					setState(113);
					body();
					}
				}

				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(WHILE);
				setState(117);
				expression();
				setState(118);
				body();
				}
				break;
			case 3:
				_localctx = new DowhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(DO);
				setState(121);
				body();
				setState(122);
				match(WHILE);
				setState(123);
				expression();
				}
				break;
			case 4:
				_localctx = new WhiledoStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(WHILE);
				setState(126);
				expression();
				setState(127);
				match(DO);
				setState(128);
				body();
				}
				break;
			case 5:
				_localctx = new RepeatuntilStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(REPEAT);
				setState(131);
				body();
				setState(132);
				match(UNTIL);
				setState(133);
				expression();
				}
				break;
			case 6:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(FOR);
				setState(136);
				for_statement();
				setState(137);
				body();
				}
				break;
			case 7:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				match(SWITCH);
				setState(140);
				expression();
				setState(141);
				match(LBRACE);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==BREAK) {
					{
					{
					setState(142);
					switch_block();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(RBRACE);
				}
				break;
			case 8:
				_localctx = new FunctioncallStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				function_call_statement();
				}
				break;
			case 9:
				_localctx = new VarassigmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				variable_assigment();
				}
				break;
			case 10:
				_localctx = new VardeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				variable_declaration();
				}
				break;
			case 11:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				return_statement();
				setState(154);
				match(SEMI);
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

	public static class Variable_assigmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CeskaJavaParser.EQ, 0); }
		public Expression_bodyContext expression_body() {
			return getRuleContext(Expression_bodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CeskaJavaParser.SEMI, 0); }
		public Variable_assigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterVariable_assigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitVariable_assigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitVariable_assigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assigmentContext variable_assigment() throws RecognitionException {
		Variable_assigmentContext _localctx = new Variable_assigmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			identifier();
			setState(159);
			match(EQ);
			setState(160);
			expression_body(0);
			setState(161);
			match(SEMI);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CeskaJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_return_statement);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(RETURN);
				setState(164);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(RETURN);
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

	public static class Expression_bodyContext extends ParserRuleContext {
		public Expression_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_body; }
	 
		public Expression_bodyContext() { }
		public void copyFrom(Expression_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegationExpressionContext extends Expression_bodyContext {
		public TerminalNode NEGATION() { return getToken(CeskaJavaParser.NEGATION, 0); }
		public Expression_bodyContext expression_body() {
			return getRuleContext(Expression_bodyContext.class,0);
		}
		public NegationExpressionContext(Expression_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterNegationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitNegationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitNegationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpbodyExpressionContext extends Expression_bodyContext {
		public TerminalNode LPAREN() { return getToken(CeskaJavaParser.LPAREN, 0); }
		public Expression_bodyContext expression_body() {
			return getRuleContext(Expression_bodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CeskaJavaParser.RPAREN, 0); }
		public ExpbodyExpressionContext(Expression_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterExpbodyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitExpbodyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitExpbodyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends Expression_bodyContext {
		public Boolean_valuesContext boolean_values() {
			return getRuleContext(Boolean_valuesContext.class,0);
		}
		public BoolExpressionContext(Expression_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunccallExpressionContext extends Expression_bodyContext {
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public FunccallExpressionContext(Expression_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFunccallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFunccallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFunccallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends Expression_bodyContext {
		public Token op;
		public List<Expression_bodyContext> expression_body() {
			return getRuleContexts(Expression_bodyContext.class);
		}
		public Expression_bodyContext expression_body(int i) {
			return getRuleContext(Expression_bodyContext.class,i);
		}
		public TerminalNode GT() { return getToken(CeskaJavaParser.GT, 0); }
		public TerminalNode GE() { return getToken(CeskaJavaParser.GE, 0); }
		public TerminalNode LT() { return getToken(CeskaJavaParser.LT, 0); }
		public TerminalNode LE() { return getToken(CeskaJavaParser.LE, 0); }
		public TerminalNode SAME() { return getToken(CeskaJavaParser.SAME, 0); }
		public TerminalNode NOT_EQ() { return getToken(CeskaJavaParser.NOT_EQ, 0); }
		public RelationalExpressionContext(Expression_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends Expression_bodyContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(Expression_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusandminusExpressionContext extends Expression_bodyContext {
		public Token op;
		public List<Expression_bodyContext> expression_body() {
			return getRuleContexts(Expression_bodyContext.class);
		}
		public Expression_bodyContext expression_body(int i) {
			return getRuleContext(Expression_bodyContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CeskaJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CeskaJavaParser.MINUS, 0); }
		public PlusandminusExpressionContext(Expression_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterPlusandminusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitPlusandminusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitPlusandminusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionContext extends Expression_bodyContext {
		public Token op;
		public List<Expression_bodyContext> expression_body() {
			return getRuleContexts(Expression_bodyContext.class);
		}
		public Expression_bodyContext expression_body(int i) {
			return getRuleContext(Expression_bodyContext.class,i);
		}
		public TerminalNode AND() { return getToken(CeskaJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(CeskaJavaParser.OR, 0); }
		public LogicalExpressionContext(Expression_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultanddivExpressionContext extends Expression_bodyContext {
		public Token op;
		public List<Expression_bodyContext> expression_body() {
			return getRuleContexts(Expression_bodyContext.class);
		}
		public Expression_bodyContext expression_body(int i) {
			return getRuleContext(Expression_bodyContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CeskaJavaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CeskaJavaParser.DIV, 0); }
		public MultanddivExpressionContext(Expression_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterMultanddivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitMultanddivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitMultanddivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_bodyContext expression_body() throws RecognitionException {
		return expression_body(0);
	}

	private Expression_bodyContext expression_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_bodyContext _localctx = new Expression_bodyContext(_ctx, _parentState);
		Expression_bodyContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression_body, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(169);
				boolean_values();
				}
				break;
			case 2:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new FunccallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				function_call_statement();
				}
				break;
			case 4:
				{
				_localctx = new ExpbodyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(LPAREN);
				setState(173);
				expression_body(0);
				setState(174);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(NEGATION);
				setState(177);
				expression_body(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultanddivExpressionContext(new Expression_bodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression_body);
						setState(180);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(181);
						((MultanddivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultanddivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expression_body(7);
						}
						break;
					case 2:
						{
						_localctx = new PlusandminusExpressionContext(new Expression_bodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression_body);
						setState(183);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(184);
						((PlusandminusExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusandminusExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expression_body(6);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new Expression_bodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression_body);
						setState(186);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(187);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SAME) | (1L << NOT_EQ) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						expression_body(5);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpressionContext(new Expression_bodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression_body);
						setState(189);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(190);
						((LogicalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
							((LogicalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expression_body(4);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Decimal_variableContext decimal_variable() {
			return getRuleContext(Decimal_variableContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CeskaJavaParser.SEMI, 0); }
		public Bool_variableContext bool_variable() {
			return getRuleContext(Bool_variableContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable_declaration);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				decimal_variable();
				setState(198);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				bool_variable();
				setState(201);
				match(SEMI);
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

	public static class Decimal_variableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CeskaJavaParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CeskaJavaParser.EQ, 0); }
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<Parallel_declarationContext> parallel_declaration() {
			return getRuleContexts(Parallel_declarationContext.class);
		}
		public Parallel_declarationContext parallel_declaration(int i) {
			return getRuleContext(Parallel_declarationContext.class,i);
		}
		public Decimal_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterDecimal_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitDecimal_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitDecimal_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decimal_variableContext decimal_variable() throws RecognitionException {
		Decimal_variableContext _localctx = new Decimal_variableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decimal_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(205);
				modifier();
				}
			}

			setState(208);
			match(INT);
			setState(209);
			identifier();
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					parallel_declaration();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(216);
			match(EQ);
			setState(217);
			integer_literal();
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

	public static class Bool_variableContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CeskaJavaParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CeskaJavaParser.EQ, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<Parallel_declarationContext> parallel_declaration() {
			return getRuleContexts(Parallel_declarationContext.class);
		}
		public Parallel_declarationContext parallel_declaration(int i) {
			return getRuleContext(Parallel_declarationContext.class,i);
		}
		public Bool_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterBool_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitBool_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitBool_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_variableContext bool_variable() throws RecognitionException {
		Bool_variableContext _localctx = new Bool_variableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(219);
				modifier();
				}
			}

			setState(222);
			match(BOOLEAN);
			setState(223);
			identifier();
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					parallel_declaration();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(230);
			match(EQ);
			setState(231);
			boolean_literal();
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

	public static class Parallel_declarationContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CeskaJavaParser.EQ, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parallel_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterParallel_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitParallel_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitParallel_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parallel_declarationContext parallel_declaration() throws RecognitionException {
		Parallel_declarationContext _localctx = new Parallel_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parallel_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(EQ);
			setState(234);
			identifier();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CeskaJavaParser.LPAREN, 0); }
		public Expression_bodyContext expression_body() {
			return getRuleContext(Expression_bodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CeskaJavaParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LPAREN);
			setState(237);
			expression_body(0);
			setState(238);
			match(RPAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				boolean_literal();
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CeskaJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CeskaJavaParser.FALSE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolean_literal);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				function_call_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				expression();
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

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode DecimalNumeral() { return getToken(CeskaJavaParser.DecimalNumeral, 0); }
		public DecimalSymbolContext decimalSymbol() {
			return getRuleContext(DecimalSymbolContext.class,0);
		}
		public TerminalNode HexNumeral() { return getToken(CeskaJavaParser.HexNumeral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_integer_literal);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(251);
					decimalSymbol();
					}
				}

				setState(254);
				match(DecimalNumeral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(HexNumeral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				function_call_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				expression();
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

	public static class For_typeContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(CeskaJavaParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(CeskaJavaParser.DOWNTO, 0); }
		public For_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFor_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFor_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFor_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_typeContext for_type() throws RecognitionException {
		For_typeContext _localctx = new For_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
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

	public static class For_initContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CeskaJavaParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CeskaJavaParser.EQ, 0); }
		public Expression_bodyContext expression_body() {
			return getRuleContext(Expression_bodyContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFor_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(INT);
			setState(264);
			identifier();
			setState(265);
			match(EQ);
			setState(266);
			expression_body(0);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CeskaJavaParser.LPAREN, 0); }
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public For_typeContext for_type() {
			return getRuleContext(For_typeContext.class,0);
		}
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CeskaJavaParser.RPAREN, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(LPAREN);
			setState(269);
			for_init();
			setState(270);
			for_type();
			setState(271);
			integer_literal();
			setState(272);
			match(RPAREN);
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

	public static class Switch_blockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CeskaJavaParser.CASE, 0); }
		public TerminalNode DecimalNumeral() { return getToken(CeskaJavaParser.DecimalNumeral, 0); }
		public TerminalNode COLON() { return getToken(CeskaJavaParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(CeskaJavaParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(CeskaJavaParser.SEMI, 0); }
		public Switch_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterSwitch_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitSwitch_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitSwitch_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switch_block);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(CASE);
				setState(275);
				match(DecimalNumeral);
				setState(276);
				match(COLON);
				setState(277);
				body();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(BREAK);
				setState(279);
				match(SEMI);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			function_header();
			setState(283);
			function_body();
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

	public static class Function_headerContext extends ParserRuleContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public Function_declaratorContext function_declarator() {
			return getRuleContext(Function_declaratorContext.class,0);
		}
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFunction_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFunction_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFunction_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			function_type();
			setState(286);
			function_declarator();
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

	public static class Function_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CeskaJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CeskaJavaParser.RPAREN, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public List<Formal_parameterContext> formal_parameter() {
			return getRuleContexts(Formal_parameterContext.class);
		}
		public Formal_parameterContext formal_parameter(int i) {
			return getRuleContext(Formal_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CeskaJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CeskaJavaParser.COMMA, i);
		}
		public Function_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFunction_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFunction_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFunction_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declaratorContext function_declarator() throws RecognitionException {
		Function_declaratorContext _localctx = new Function_declaratorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			identifier();
			setState(289);
			match(LPAREN);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(290);
				formal_parameter();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(291);
					match(COMMA);
					setState(292);
					formal_parameter();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(300);
			match(RPAREN);
			setState(301);
			function_body();
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

	public static class Function_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CeskaJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CeskaJavaParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(CeskaJavaParser.VOID, 0); }
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFunction_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFunction_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << VOID))) != 0)) ) {
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CeskaJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CeskaJavaParser.RBRACE, 0); }
		public Block_bodyContext block_body() {
			return getRuleContext(Block_bodyContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(LBRACE);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FINAL) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << RETURN) | (1L << Letter))) != 0)) {
				{
				setState(306);
				block_body();
				}
			}

			setState(309);
			match(RBRACE);
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

	public static class Formal_parameterContext extends ParserRuleContext {
		public VarTypesContext varTypes() {
			return getRuleContext(VarTypesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Formal_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFormal_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFormal_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFormal_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_parameterContext formal_parameter() throws RecognitionException {
		Formal_parameterContext _localctx = new Formal_parameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_formal_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			varTypes();
			setState(312);
			identifier();
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

	public static class Function_call_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CeskaJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CeskaJavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(CeskaJavaParser.SEMI, 0); }
		public List<Argument_listContext> argument_list() {
			return getRuleContexts(Argument_listContext.class);
		}
		public Argument_listContext argument_list(int i) {
			return getRuleContext(Argument_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CeskaJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CeskaJavaParser.COMMA, i);
		}
		public Function_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterFunction_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitFunction_call_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitFunction_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_statementContext function_call_statement() throws RecognitionException {
		Function_call_statementContext _localctx = new Function_call_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			identifier();
			setState(315);
			match(LPAREN);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NEGATION) | (1L << LPAREN) | (1L << Letter))) != 0)) {
				{
				setState(316);
				argument_list();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(317);
					match(COMMA);
					setState(318);
					argument_list();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(326);
			match(RPAREN);
			setState(327);
			match(SEMI);
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

	public static class Argument_listContext extends ParserRuleContext {
		public Expression_bodyContext expression_body() {
			return getRuleContext(Expression_bodyContext.class,0);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			expression_body(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_body_sempred((Expression_bodyContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_body_sempred(Expression_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u014e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\5\7T\n\7\3\7\3\7\3\b\3\b\5\bZ\n\b\3\b\3\b\3\t\3\t\6\t`\n\t\r\t\16\ta"+
		"\3\n\6\ne\n\n\r\n\16\nf\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\f\3\f"+
		"\3\f\3\f\3\f\5\fu\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0092"+
		"\n\f\f\f\16\f\u0095\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00a9\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c3\n\17\f\17\16\17\u00c6\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ce\n\20\3\21\5\21\u00d1\n\21"+
		"\3\21\3\21\3\21\7\21\u00d6\n\21\f\21\16\21\u00d9\13\21\3\21\3\21\3\21"+
		"\3\22\5\22\u00df\n\22\3\22\3\22\3\22\7\22\u00e4\n\22\f\22\16\22\u00e7"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25"+
		"\u00f5\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00fc\n\26\3\27\5\27\u00ff\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0106\n\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u011b\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0128\n\36\f\36\16\36\u012b\13\36\5\36\u012d\n\36\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \5 \u0136\n \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0142"+
		"\n\"\f\"\16\"\u0145\13\"\5\"\u0147\n\"\3\"\3\"\3\"\3#\3#\3#\2\3\34$\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\n"+
		"\3\2\5\6\3\2\3\4\3\2\36\37\3\2 !\3\2\30\35\3\2\26\27\3\2\16\17\4\2\3\4"+
		"\24\24\2\u015b\2F\3\2\2\2\4H\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2"+
		"\fQ\3\2\2\2\16W\3\2\2\2\20_\3\2\2\2\22d\3\2\2\2\24h\3\2\2\2\26\u009e\3"+
		"\2\2\2\30\u00a0\3\2\2\2\32\u00a8\3\2\2\2\34\u00b4\3\2\2\2\36\u00cd\3\2"+
		"\2\2 \u00d0\3\2\2\2\"\u00de\3\2\2\2$\u00eb\3\2\2\2&\u00ee\3\2\2\2(\u00f4"+
		"\3\2\2\2*\u00fb\3\2\2\2,\u0105\3\2\2\2.\u0107\3\2\2\2\60\u0109\3\2\2\2"+
		"\62\u010e\3\2\2\2\64\u011a\3\2\2\2\66\u011c\3\2\2\28\u011f\3\2\2\2:\u0122"+
		"\3\2\2\2<\u0131\3\2\2\2>\u0133\3\2\2\2@\u0139\3\2\2\2B\u013c\3\2\2\2D"+
		"\u014b\3\2\2\2FG\t\2\2\2G\3\3\2\2\2HI\t\3\2\2I\5\3\2\2\2JK\t\4\2\2K\7"+
		"\3\2\2\2LM\7\7\2\2M\t\3\2\2\2NO\5\f\7\2OP\7\2\2\3P\13\3\2\2\2QS\7*\2\2"+
		"RT\5\20\t\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7+\2\2V\r\3\2\2\2WY\7*\2\2"+
		"XZ\5\22\n\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7+\2\2\\\17\3\2\2\2]`\5\26"+
		"\f\2^`\5\66\34\2_]\3\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\21"+
		"\3\2\2\2ce\5\26\f\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\23\3\2\2"+
		"\2hl\7\60\2\2ik\7\61\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\25\3"+
		"\2\2\2nl\3\2\2\2op\7\b\2\2pq\5&\24\2qt\5\16\b\2rs\7\t\2\2su\5\16\b\2t"+
		"r\3\2\2\2tu\3\2\2\2u\u009f\3\2\2\2vw\7\20\2\2wx\5&\24\2xy\5\16\b\2y\u009f"+
		"\3\2\2\2z{\7\21\2\2{|\5\16\b\2|}\7\20\2\2}~\5&\24\2~\u009f\3\2\2\2\177"+
		"\u0080\7\20\2\2\u0080\u0081\5&\24\2\u0081\u0082\7\21\2\2\u0082\u0083\5"+
		"\16\b\2\u0083\u009f\3\2\2\2\u0084\u0085\7\22\2\2\u0085\u0086\5\16\b\2"+
		"\u0086\u0087\7\23\2\2\u0087\u0088\5&\24\2\u0088\u009f\3\2\2\2\u0089\u008a"+
		"\7\r\2\2\u008a\u008b\5\62\32\2\u008b\u008c\5\16\b\2\u008c\u009f\3\2\2"+
		"\2\u008d\u008e\7\n\2\2\u008e\u008f\5&\24\2\u008f\u0093\7*\2\2\u0090\u0092"+
		"\5\64\33\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097"+
		"\7+\2\2\u0097\u009f\3\2\2\2\u0098\u009f\5B\"\2\u0099\u009f\5\30\r\2\u009a"+
		"\u009f\5\36\20\2\u009b\u009c\5\32\16\2\u009c\u009d\7,\2\2\u009d\u009f"+
		"\3\2\2\2\u009eo\3\2\2\2\u009ev\3\2\2\2\u009ez\3\2\2\2\u009e\177\3\2\2"+
		"\2\u009e\u0084\3\2\2\2\u009e\u0089\3\2\2\2\u009e\u008d\3\2\2\2\u009e\u0098"+
		"\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009f"+
		"\27\3\2\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\5\34"+
		"\17\2\u00a3\u00a4\7,\2\2\u00a4\31\3\2\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a9"+
		"\5&\24\2\u00a7\u00a9\7\25\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\33\3\2\2\2\u00aa\u00ab\b\17\1\2\u00ab\u00b5\5\2\2\2\u00ac\u00b5"+
		"\5\24\13\2\u00ad\u00b5\5B\"\2\u00ae\u00af\7(\2\2\u00af\u00b0\5\34\17\2"+
		"\u00b0\u00b1\7)\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b3\7%\2\2\u00b3\u00b5"+
		"\5\34\17\3\u00b4\u00aa\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00ad\3\2\2\2"+
		"\u00b4\u00ae\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00c4\3\2\2\2\u00b6\u00b7"+
		"\f\b\2\2\u00b7\u00b8\t\5\2\2\u00b8\u00c3\5\34\17\t\u00b9\u00ba\f\7\2\2"+
		"\u00ba\u00bb\t\4\2\2\u00bb\u00c3\5\34\17\b\u00bc\u00bd\f\6\2\2\u00bd\u00be"+
		"\t\6\2\2\u00be\u00c3\5\34\17\7\u00bf\u00c0\f\5\2\2\u00c0\u00c1\t\7\2\2"+
		"\u00c1\u00c3\5\34\17\6\u00c2\u00b6\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bc"+
		"\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\35\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\5 \21"+
		"\2\u00c8\u00c9\7,\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00cb\5\"\22\2\u00cb\u00cc"+
		"\7,\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce"+
		"\37\3\2\2\2\u00cf\u00d1\5\b\5\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2"+
		"\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\4\2\2\u00d3\u00d7\5\24\13\2\u00d4"+
		"\u00d6\5$\23\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\7\"\2\2\u00db\u00dc\5,\27\2\u00dc!\3\2\2\2\u00dd\u00df\5\b\5\2"+
		"\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\7\3\2\2\u00e1\u00e5\5\24\13\2\u00e2\u00e4\5$\23\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea\5*\26\2\u00ea"+
		"#\3\2\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed\5\24\13\2\u00ed%\3\2\2\2\u00ee"+
		"\u00ef\7(\2\2\u00ef\u00f0\5\34\17\2\u00f0\u00f1\7)\2\2\u00f1\'\3\2\2\2"+
		"\u00f2\u00f5\5,\27\2\u00f3\u00f5\5*\26\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5)\3\2\2\2\u00f6\u00fc\7\5\2\2\u00f7\u00fc\7\6\2\2\u00f8"+
		"\u00fc\5\24\13\2\u00f9\u00fc\5B\"\2\u00fa\u00fc\5&\24\2\u00fb\u00f6\3"+
		"\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc+\3\2\2\2\u00fd\u00ff\5\6\4\2\u00fe\u00fd\3\2\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0106\7.\2\2\u0101\u0106"+
		"\7/\2\2\u0102\u0106\5\24\13\2\u0103\u0106\5B\"\2\u0104\u0106\5&\24\2\u0105"+
		"\u00fe\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0104\3\2\2\2\u0106-\3\2\2\2\u0107\u0108\t\b\2\2\u0108/\3\2"+
		"\2\2\u0109\u010a\7\4\2\2\u010a\u010b\5\24\13\2\u010b\u010c\7\"\2\2\u010c"+
		"\u010d\5\34\17\2\u010d\61\3\2\2\2\u010e\u010f\7(\2\2\u010f\u0110\5\60"+
		"\31\2\u0110\u0111\5.\30\2\u0111\u0112\5,\27\2\u0112\u0113\7)\2\2\u0113"+
		"\63\3\2\2\2\u0114\u0115\7\13\2\2\u0115\u0116\7.\2\2\u0116\u0117\7$\2\2"+
		"\u0117\u011b\5\16\b\2\u0118\u0119\7\f\2\2\u0119\u011b\7,\2\2\u011a\u0114"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\65\3\2\2\2\u011c\u011d\58\35\2\u011d"+
		"\u011e\5> \2\u011e\67\3\2\2\2\u011f\u0120\5<\37\2\u0120\u0121\5:\36\2"+
		"\u01219\3\2\2\2\u0122\u0123\5\24\13\2\u0123\u012c\7(\2\2\u0124\u0129\5"+
		"@!\2\u0125\u0126\7-\2\2\u0126\u0128\5@!\2\u0127\u0125\3\2\2\2\u0128\u012b"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\7)\2\2\u012f\u0130\5> \2\u0130;\3\2\2\2\u0131\u0132\t"+
		"\t\2\2\u0132=\3\2\2\2\u0133\u0135\7*\2\2\u0134\u0136\5\22\n\2\u0135\u0134"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7+\2\2\u0138"+
		"?\3\2\2\2\u0139\u013a\5\4\3\2\u013a\u013b\5\24\13\2\u013bA\3\2\2\2\u013c"+
		"\u013d\5\24\13\2\u013d\u0146\7(\2\2\u013e\u0143\5D#\2\u013f\u0140\7-\2"+
		"\2\u0140\u0142\5D#\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u013e\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7)"+
		"\2\2\u0149\u014a\7,\2\2\u014aC\3\2\2\2\u014b\u014c\5\34\17\2\u014cE\3"+
		"\2\2\2\36SY_aflt\u0093\u009e\u00a8\u00b4\u00c2\u00c4\u00cd\u00d0\u00d7"+
		"\u00de\u00e5\u00f4\u00fb\u00fe\u0105\u011a\u0129\u012c\u0135\u0143\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}