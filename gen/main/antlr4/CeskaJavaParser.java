// Generated from C:/Users/JanRychlik/Documents/Projects/ceskaJava/src/main/antlr4\CeskaJava.g4 by ANTLR 4.9
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BOOLEAN=6, TRUE=7, FALSE=8, INT=9, 
		FINAL=10, IF=11, ELSE=12, SWITCH=13, CASE=14, BREAK=15, FOR=16, WHILE=17, 
		DO=18, REPEAT=19, UNTIL=20, CLASS=21, EXTENDS=22, RETURN=23, OR=24, AND=25, 
		SAME=26, NOT_EQ=27, LT=28, GT=29, LE=30, GE=31, PLUS=32, MINUS=33, MULT=34, 
		DIV=35, EQ=36, QUESTION=37, COLON=38, NEGATION=39, XUPPER=40, XLOW=41, 
		LPAREN=42, RPAREN=43, LBRACE=44, RBRACE=45, SEMI=46, Letter=47, Letter_or_digit=48, 
		WHITESPACE=49, COMMENT=50, LINE_COMMENT=51, HexNumeral=52, DecimalNumeral=53, 
		TO=54, DOWNTO=55, COMMA=56, VOID=57;
	public static final int
		RULE_boolean_values = 0, RULE_varTypes = 1, RULE_referenceType = 2, RULE_classOrInterfaceType = 3, 
		RULE_classDeclaration = 4, RULE_normalClassDeclaration = 5, RULE_typeParameters = 6, 
		RULE_typeParameterList = 7, RULE_typeParameter = 8, RULE_typeBound = 9, 
		RULE_typeVariable = 10, RULE_superclass = 11, RULE_classBody = 12, RULE_classBodyDeclaration = 13, 
		RULE_staticInitializer = 14, RULE_classMemberDeclaration = 15, RULE_elementValue = 16, 
		RULE_elementValueArrayInitializer = 17, RULE_elementValueList = 18, RULE_classType = 19, 
		RULE_classType_lf_classOrInterfaceType = 20, RULE_classType_lfno_classOrInterfaceType = 21, 
		RULE_typeArguments = 22, RULE_typeArgumentList = 23, RULE_typeArgument = 24, 
		RULE_wildcard = 25, RULE_wildcardBounds = 26, RULE_interfaceType_lf_classOrInterfaceType = 27, 
		RULE_interfaceType_lfno_classOrInterfaceType = 28, RULE_decimalSymbol = 29, 
		RULE_modifier = 30, RULE_block = 31, RULE_body = 32, RULE_block_statement = 33, 
		RULE_block_body = 34, RULE_variable_declaration = 35, RULE_decimal_variable = 36, 
		RULE_bool_variable = 37, RULE_parallel_declaration = 38, RULE_identifier = 39, 
		RULE_expression = 40, RULE_statement = 41, RULE_variable_assigment = 42, 
		RULE_return_statement = 43, RULE_expression_body = 44, RULE_boolean_literal = 45, 
		RULE_integer_literal = 46, RULE_for_type = 47, RULE_for_init = 48, RULE_for_statement = 49, 
		RULE_switch_block = 50, RULE_function_declaration = 51, RULE_function_header = 52, 
		RULE_function_declarator = 53, RULE_function_type = 54, RULE_function_body = 55, 
		RULE_formal_parameter = 56, RULE_function_call_statement = 57, RULE_argument_list = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"boolean_values", "varTypes", "referenceType", "classOrInterfaceType", 
			"classDeclaration", "normalClassDeclaration", "typeParameters", "typeParameterList", 
			"typeParameter", "typeBound", "typeVariable", "superclass", "classBody", 
			"classBodyDeclaration", "staticInitializer", "classMemberDeclaration", 
			"elementValue", "elementValueArrayInitializer", "elementValueList", "classType", 
			"classType_lf_classOrInterfaceType", "classType_lfno_classOrInterfaceType", 
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
			"interfaceType_lf_classOrInterfaceType", "interfaceType_lfno_classOrInterfaceType", 
			"decimalSymbol", "modifier", "block", "body", "block_statement", "block_body", 
			"variable_declaration", "decimal_variable", "bool_variable", "parallel_declaration", 
			"identifier", "expression", "statement", "variable_assigment", "return_statement", 
			"expression_body", "boolean_literal", "integer_literal", "for_type", 
			"for_init", "for_statement", "switch_block", "function_declaration", 
			"function_header", "function_declarator", "function_type", "function_body", 
			"formal_parameter", "function_call_statement", "argument_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'staticky'", "'.'", "'extends'", "'super'", "'pravdivost'", 
			"'pravda'", "'lez'", "'cislo'", "'finalni'", "'kdyz'", "'jinak'", "'moznosti'", 
			"'moznost'", "'odejdi'", "'tocpro'", "'toc'", "'pro'", "'opakuj'", "'dokud'", 
			"'trida'", "'dedi'", "'vrat'", "'||'", "'&&'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'='", "'?'", "':'", 
			"'!'", "'X'", "'x'", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "BOOLEAN", "TRUE", "FALSE", "INT", 
			"FINAL", "IF", "ELSE", "SWITCH", "CASE", "BREAK", "FOR", "WHILE", "DO", 
			"REPEAT", "UNTIL", "CLASS", "EXTENDS", "RETURN", "OR", "AND", "SAME", 
			"NOT_EQ", "LT", "GT", "LE", "GE", "PLUS", "MINUS", "MULT", "DIV", "EQ", 
			"QUESTION", "COLON", "NEGATION", "XUPPER", "XLOW", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SEMI", "Letter", "Letter_or_digit", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT", "HexNumeral", "DecimalNumeral", "TO", "DOWNTO", 
			"COMMA", "VOID"
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
			setState(118);
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
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
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
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(INT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(BOOLEAN);
				}
				break;
			case Letter:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				classType();
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			classOrInterfaceType();
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(127);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(128);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(131);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(132);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			normalClassDeclaration();
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CeskaJavaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CLASS);
			setState(141);
			identifier();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(142);
				typeParameters();
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(145);
				superclass();
				}
			}

			setState(148);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CeskaJavaParser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(CeskaJavaParser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(LT);
			setState(151);
			typeParameterList();
			setState(152);
			match(GT);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			typeParameter();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(155);
				match(T__0);
				setState(156);
				typeParameter();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			identifier();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(163);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(CeskaJavaParser.EXTENDS, 0); }
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeBound);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(EXTENDS);
				setState(167);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(EXTENDS);
				setState(169);
				classOrInterfaceType();
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

	public static class TypeVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(CeskaJavaParser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(EXTENDS);
			setState(175);
			classType();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CeskaJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CeskaJavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(LBRACE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << INT) | (1L << CLASS) | (1L << SEMI) | (1L << VOID))) != 0)) {
				{
				{
				setState(178);
				classBodyDeclaration();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classBodyDeclaration);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case CLASS:
			case SEMI:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				classMemberDeclaration();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				staticInitializer();
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

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__1);
			setState(191);
			block();
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CeskaJavaParser.SEMI, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classMemberDeclaration);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				function_declaration();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				classDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
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

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elementValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CeskaJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CeskaJavaParser.RBRACE, 0); }
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LBRACE);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(201);
				elementValueList();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(204);
				match(T__0);
				}
			}

			setState(207);
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

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitElementValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			elementValue();
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					match(T__0);
					setState(211);
					elementValue();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classType);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				identifier();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(218);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				classOrInterfaceType();
				setState(222);
				match(T__2);
				setState(223);
				identifier();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(224);
					typeArguments();
					}
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

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__2);
			setState(230);
			identifier();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(231);
				typeArguments();
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

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			identifier();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(235);
				typeArguments();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CeskaJavaParser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(CeskaJavaParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(LT);
			setState(239);
			typeArgumentList();
			setState(240);
			match(GT);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			typeArgument();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(243);
				match(T__0);
				setState(244);
				typeArgument();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeArgument);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				referenceType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				wildcard();
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

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(CeskaJavaParser.QUESTION, 0); }
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(QUESTION);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(255);
				wildcardBounds();
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

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_wildcardBounds);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__3);
				setState(259);
				referenceType();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(T__4);
				setState(261);
				referenceType();
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

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			classType_lf_classOrInterfaceType();
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

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CeskaJavaListener ) ((CeskaJavaListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CeskaJavaVisitor ) return ((CeskaJavaVisitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			classType_lfno_classOrInterfaceType();
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
		enterRule(_localctx, 58, RULE_decimalSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		enterRule(_localctx, 60, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LBRACE);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FINAL) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << RETURN) | (1L << Letter) | (1L << VOID))) != 0)) {
				{
				setState(273);
				block_statement();
				}
			}

			setState(276);
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
		enterRule(_localctx, 64, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LBRACE);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FINAL) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << RETURN) | (1L << Letter))) != 0)) {
				{
				setState(279);
				block_body();
				}
			}

			setState(282);
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
		enterRule(_localctx, 66, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(284);
					statement();
					}
					break;
				case 2:
					{
					setState(285);
					function_declaration();
					}
					break;
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FINAL) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << RETURN) | (1L << Letter) | (1L << VOID))) != 0) );
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
		enterRule(_localctx, 68, RULE_block_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				statement();
				}
				}
				setState(293); 
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
		enterRule(_localctx, 70, RULE_variable_declaration);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				decimal_variable();
				setState(296);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				bool_variable();
				setState(299);
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
		enterRule(_localctx, 72, RULE_decimal_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(303);
				modifier();
				}
			}

			setState(306);
			match(INT);
			setState(307);
			identifier();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					parallel_declaration();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(314);
			match(EQ);
			setState(315);
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
		enterRule(_localctx, 74, RULE_bool_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(317);
				modifier();
				}
			}

			setState(320);
			match(BOOLEAN);
			setState(321);
			identifier();
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					parallel_declaration();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(328);
			match(EQ);
			setState(329);
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
		enterRule(_localctx, 76, RULE_parallel_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(EQ);
			setState(332);
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
		enterRule(_localctx, 78, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(Letter);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					match(Letter_or_digit);
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 80, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(LPAREN);
			setState(342);
			expression_body(0);
			setState(343);
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
		enterRule(_localctx, 82, RULE_statement);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new IfelseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(IF);
				setState(346);
				expression();
				setState(347);
				body();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(348);
					match(ELSE);
					setState(349);
					body();
					}
				}

				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(WHILE);
				setState(353);
				expression();
				setState(354);
				body();
				}
				break;
			case 3:
				_localctx = new DowhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(DO);
				setState(357);
				body();
				setState(358);
				match(WHILE);
				setState(359);
				expression();
				}
				break;
			case 4:
				_localctx = new WhiledoStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				match(WHILE);
				setState(362);
				expression();
				setState(363);
				match(DO);
				setState(364);
				body();
				}
				break;
			case 5:
				_localctx = new RepeatuntilStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				match(REPEAT);
				setState(367);
				body();
				setState(368);
				match(UNTIL);
				setState(369);
				expression();
				}
				break;
			case 6:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				match(FOR);
				setState(372);
				for_statement();
				setState(373);
				body();
				}
				break;
			case 7:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
				match(SWITCH);
				setState(376);
				expression();
				setState(377);
				match(LBRACE);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==BREAK) {
					{
					{
					setState(378);
					switch_block();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(384);
				match(RBRACE);
				}
				break;
			case 8:
				_localctx = new FunctioncallStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(386);
				function_call_statement();
				}
				break;
			case 9:
				_localctx = new VarassigmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(387);
				variable_assigment();
				}
				break;
			case 10:
				_localctx = new VardeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(388);
				variable_declaration();
				}
				break;
			case 11:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(389);
				return_statement();
				setState(390);
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
		enterRule(_localctx, 84, RULE_variable_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			identifier();
			setState(395);
			match(EQ);
			setState(396);
			expression_body(0);
			setState(397);
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
		enterRule(_localctx, 86, RULE_return_statement);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(RETURN);
				setState(400);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expression_body, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(405);
				boolean_values();
				}
				break;
			case 2:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new FunccallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(407);
				function_call_statement();
				}
				break;
			case 4:
				{
				_localctx = new ExpbodyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(408);
				match(LPAREN);
				setState(409);
				expression_body(0);
				setState(410);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412);
				match(NEGATION);
				setState(413);
				expression_body(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new MultanddivExpressionContext(new Expression_bodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression_body);
						setState(416);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(417);
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
						setState(418);
						expression_body(7);
						}
						break;
					case 2:
						{
						_localctx = new PlusandminusExpressionContext(new Expression_bodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression_body);
						setState(419);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(420);
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
						setState(421);
						expression_body(6);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new Expression_bodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression_body);
						setState(422);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(423);
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
						setState(424);
						expression_body(5);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpressionContext(new Expression_bodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression_body);
						setState(425);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(426);
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
						setState(427);
						expression_body(4);
						}
						break;
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 90, RULE_boolean_literal);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				function_call_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
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
		enterRule(_localctx, 92, RULE_integer_literal);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(440);
					decimalSymbol();
					}
				}

				setState(443);
				match(DecimalNumeral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(HexNumeral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				function_call_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
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
		enterRule(_localctx, 94, RULE_for_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
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
		enterRule(_localctx, 96, RULE_for_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(INT);
			setState(453);
			identifier();
			setState(454);
			match(EQ);
			setState(455);
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
		enterRule(_localctx, 98, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(LPAREN);
			setState(458);
			for_init();
			setState(459);
			for_type();
			setState(460);
			integer_literal();
			setState(461);
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
		enterRule(_localctx, 100, RULE_switch_block);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(CASE);
				setState(464);
				match(DecimalNumeral);
				setState(465);
				match(COLON);
				setState(466);
				body();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(BREAK);
				setState(468);
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
		enterRule(_localctx, 102, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			function_header();
			setState(472);
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
		enterRule(_localctx, 104, RULE_function_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			function_type();
			setState(475);
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
		enterRule(_localctx, 106, RULE_function_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			identifier();
			setState(478);
			match(LPAREN);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << Letter))) != 0)) {
				{
				setState(479);
				formal_parameter();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(480);
					match(COMMA);
					setState(481);
					formal_parameter();
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(489);
			match(RPAREN);
			setState(490);
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
		enterRule(_localctx, 108, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		enterRule(_localctx, 110, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(LBRACE);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FINAL) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << RETURN) | (1L << Letter))) != 0)) {
				{
				setState(495);
				block_body();
				}
			}

			setState(498);
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
		enterRule(_localctx, 112, RULE_formal_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			varTypes();
			setState(501);
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
		enterRule(_localctx, 114, RULE_function_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			identifier();
			setState(504);
			match(LPAREN);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NEGATION) | (1L << LPAREN) | (1L << Letter))) != 0)) {
				{
				setState(505);
				argument_list();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(506);
					match(COMMA);
					setState(507);
					argument_list();
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(515);
			match(RPAREN);
			setState(516);
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
		enterRule(_localctx, 116, RULE_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		case 44:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u020b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\3\5\3~\n\3\3\4\3\4\3\5\3\5\5\5\u0084\n\5\3\5\3\5\7\5\u0088"+
		"\n\5\f\5\16\5\u008b\13\5\3\6\3\6\3\7\3\7\3\7\5\7\u0092\n\7\3\7\5\7\u0095"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00a0\n\t\f\t\16\t\u00a3"+
		"\13\t\3\n\3\n\5\n\u00a7\n\n\3\13\3\13\3\13\3\13\5\13\u00ad\n\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\7\16\u00b6\n\16\f\16\16\16\u00b9\13\16\3\16\3"+
		"\16\3\17\3\17\5\17\u00bf\n\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00c7"+
		"\n\21\3\22\3\22\3\23\3\23\5\23\u00cd\n\23\3\23\5\23\u00d0\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\7\24\u00d7\n\24\f\24\16\24\u00da\13\24\3\25\3\25\5"+
		"\25\u00de\n\25\3\25\3\25\3\25\3\25\5\25\u00e4\n\25\5\25\u00e6\n\25\3\26"+
		"\3\26\3\26\5\26\u00eb\n\26\3\27\3\27\5\27\u00ef\n\27\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\7\31\u00f8\n\31\f\31\16\31\u00fb\13\31\3\32\3\32\5"+
		"\32\u00ff\n\32\3\33\3\33\5\33\u0103\n\33\3\34\3\34\3\34\3\34\5\34\u0109"+
		"\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\5!\u0115\n!\3!\3!\3\""+
		"\3\"\5\"\u011b\n\"\3\"\3\"\3#\3#\6#\u0121\n#\r#\16#\u0122\3$\6$\u0126"+
		"\n$\r$\16$\u0127\3%\3%\3%\3%\3%\3%\5%\u0130\n%\3&\5&\u0133\n&\3&\3&\3"+
		"&\7&\u0138\n&\f&\16&\u013b\13&\3&\3&\3&\3\'\5\'\u0141\n\'\3\'\3\'\3\'"+
		"\7\'\u0146\n\'\f\'\16\'\u0149\13\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\7)\u0153"+
		"\n)\f)\16)\u0156\13)\3*\3*\3*\3*\3+\3+\3+\3+\3+\5+\u0161\n+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\7+\u017e\n+\f+\16+\u0181\13+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u018b\n+\3,"+
		"\3,\3,\3,\3,\3-\3-\3-\5-\u0195\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01a1"+
		"\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u01af\n.\f.\16.\u01b2\13.\3"+
		"/\3/\3/\3/\3/\5/\u01b9\n/\3\60\5\60\u01bc\n\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u01c3\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01d8\n\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\7\67\u01e5\n\67\f\67\16\67\u01e8"+
		"\13\67\5\67\u01ea\n\67\3\67\3\67\3\67\38\38\39\39\59\u01f3\n9\39\39\3"+
		":\3:\3:\3;\3;\3;\3;\3;\7;\u01ff\n;\f;\16;\u0202\13;\5;\u0204\n;\3;\3;"+
		"\3;\3<\3<\3<\2\3Z=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\t\3\2\t\n\3\2\"#\3\2$%\3"+
		"\2\34!\3\2\32\33\3\289\5\2\b\b\13\13;;\2\u0218\2x\3\2\2\2\4}\3\2\2\2\6"+
		"\177\3\2\2\2\b\u0083\3\2\2\2\n\u008c\3\2\2\2\f\u008e\3\2\2\2\16\u0098"+
		"\3\2\2\2\20\u009c\3\2\2\2\22\u00a4\3\2\2\2\24\u00ac\3\2\2\2\26\u00ae\3"+
		"\2\2\2\30\u00b0\3\2\2\2\32\u00b3\3\2\2\2\34\u00be\3\2\2\2\36\u00c0\3\2"+
		"\2\2 \u00c6\3\2\2\2\"\u00c8\3\2\2\2$\u00ca\3\2\2\2&\u00d3\3\2\2\2(\u00e5"+
		"\3\2\2\2*\u00e7\3\2\2\2,\u00ec\3\2\2\2.\u00f0\3\2\2\2\60\u00f4\3\2\2\2"+
		"\62\u00fe\3\2\2\2\64\u0100\3\2\2\2\66\u0108\3\2\2\28\u010a\3\2\2\2:\u010c"+
		"\3\2\2\2<\u010e\3\2\2\2>\u0110\3\2\2\2@\u0112\3\2\2\2B\u0118\3\2\2\2D"+
		"\u0120\3\2\2\2F\u0125\3\2\2\2H\u012f\3\2\2\2J\u0132\3\2\2\2L\u0140\3\2"+
		"\2\2N\u014d\3\2\2\2P\u0150\3\2\2\2R\u0157\3\2\2\2T\u018a\3\2\2\2V\u018c"+
		"\3\2\2\2X\u0194\3\2\2\2Z\u01a0\3\2\2\2\\\u01b8\3\2\2\2^\u01c2\3\2\2\2"+
		"`\u01c4\3\2\2\2b\u01c6\3\2\2\2d\u01cb\3\2\2\2f\u01d7\3\2\2\2h\u01d9\3"+
		"\2\2\2j\u01dc\3\2\2\2l\u01df\3\2\2\2n\u01ee\3\2\2\2p\u01f0\3\2\2\2r\u01f6"+
		"\3\2\2\2t\u01f9\3\2\2\2v\u0208\3\2\2\2xy\t\2\2\2y\3\3\2\2\2z~\7\13\2\2"+
		"{~\7\b\2\2|~\5(\25\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\5\3\2\2\2\177\u0080"+
		"\5\b\5\2\u0080\7\3\2\2\2\u0081\u0084\5,\27\2\u0082\u0084\5:\36\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0089\3\2\2\2\u0085\u0088\5*"+
		"\26\2\u0086\u0088\58\35\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\t\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008d\5\f\7\2\u008d\13\3\2\2\2\u008e\u008f"+
		"\7\27\2\2\u008f\u0091\5P)\2\u0090\u0092\5\16\b\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\5\30\r\2\u0094\u0093\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5\32\16\2\u0097"+
		"\r\3\2\2\2\u0098\u0099\7\36\2\2\u0099\u009a\5\20\t\2\u009a\u009b\7\37"+
		"\2\2\u009b\17\3\2\2\2\u009c\u00a1\5\22\n\2\u009d\u009e\7\3\2\2\u009e\u00a0"+
		"\5\22\n\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\21\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6"+
		"\5P)\2\u00a5\u00a7\5\24\13\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\23\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00ad\5\26\f\2\u00aa\u00ab\7\30"+
		"\2\2\u00ab\u00ad\5\b\5\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\25\3\2\2\2\u00ae\u00af\5P)\2\u00af\27\3\2\2\2\u00b0\u00b1\7\30\2\2\u00b1"+
		"\u00b2\5(\25\2\u00b2\31\3\2\2\2\u00b3\u00b7\7.\2\2\u00b4\u00b6\5\34\17"+
		"\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb"+
		"\33\3\2\2\2\u00bc\u00bf\5 \21\2\u00bd\u00bf\5\36\20\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2"+
		"\5@!\2\u00c2\37\3\2\2\2\u00c3\u00c7\5h\65\2\u00c4\u00c7\5\n\6\2\u00c5"+
		"\u00c7\7\60\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3"+
		"\2\2\2\u00c7!\3\2\2\2\u00c8\u00c9\5$\23\2\u00c9#\3\2\2\2\u00ca\u00cc\7"+
		".\2\2\u00cb\u00cd\5&\24\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00d0\7\3\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7/\2\2\u00d2%\3\2\2\2\u00d3\u00d8"+
		"\5\"\22\2\u00d4\u00d5\7\3\2\2\u00d5\u00d7\5\"\22\2\u00d6\u00d4\3\2\2\2"+
		"\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\'\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\5P)\2\u00dc\u00de\5.\30\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e6\3\2\2\2\u00df\u00e0\5\b"+
		"\5\2\u00e0\u00e1\7\5\2\2\u00e1\u00e3\5P)\2\u00e2\u00e4\5.\30\2\u00e3\u00e2"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5"+
		"\u00df\3\2\2\2\u00e6)\3\2\2\2\u00e7\u00e8\7\5\2\2\u00e8\u00ea\5P)\2\u00e9"+
		"\u00eb\5.\30\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb+\3\2\2\2"+
		"\u00ec\u00ee\5P)\2\u00ed\u00ef\5.\30\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef-\3\2\2\2\u00f0\u00f1\7\36\2\2\u00f1\u00f2\5\60\31\2\u00f2"+
		"\u00f3\7\37\2\2\u00f3/\3\2\2\2\u00f4\u00f9\5\62\32\2\u00f5\u00f6\7\3\2"+
		"\2\u00f6\u00f8\5\62\32\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\61\3\2\2\2\u00fb\u00f9\3\2\2"+
		"\2\u00fc\u00ff\5\6\4\2\u00fd\u00ff\5\64\33\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\63\3\2\2\2\u0100\u0102\7\'\2\2\u0101\u0103\5\66\34"+
		"\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\65\3\2\2\2\u0104\u0105"+
		"\7\6\2\2\u0105\u0109\5\6\4\2\u0106\u0107\7\7\2\2\u0107\u0109\5\6\4\2\u0108"+
		"\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0109\67\3\2\2\2\u010a\u010b\5*\26"+
		"\2\u010b9\3\2\2\2\u010c\u010d\5,\27\2\u010d;\3\2\2\2\u010e\u010f\t\3\2"+
		"\2\u010f=\3\2\2\2\u0110\u0111\7\f\2\2\u0111?\3\2\2\2\u0112\u0114\7.\2"+
		"\2\u0113\u0115\5D#\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\7/\2\2\u0117A\3\2\2\2\u0118\u011a\7.\2\2\u0119\u011b"+
		"\5F$\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\7/\2\2\u011dC\3\2\2\2\u011e\u0121\5T+\2\u011f\u0121\5h\65\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123E\3\2\2\2\u0124\u0126\5T+\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"G\3\2\2\2\u0129\u012a\5J&\2\u012a\u012b\7\60\2\2\u012b\u0130\3\2\2\2\u012c"+
		"\u012d\5L\'\2\u012d\u012e\7\60\2\2\u012e\u0130\3\2\2\2\u012f\u0129\3\2"+
		"\2\2\u012f\u012c\3\2\2\2\u0130I\3\2\2\2\u0131\u0133\5> \2\u0132\u0131"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\13\2\2"+
		"\u0135\u0139\5P)\2\u0136\u0138\5N(\2\u0137\u0136\3\2\2\2\u0138\u013b\3"+
		"\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013d\7&\2\2\u013d\u013e\5^\60\2\u013eK\3\2\2\2\u013f"+
		"\u0141\5> \2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2"+
		"\2\u0142\u0143\7\b\2\2\u0143\u0147\5P)\2\u0144\u0146\5N(\2\u0145\u0144"+
		"\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7&\2\2\u014b\u014c\5\\"+
		"/\2\u014cM\3\2\2\2\u014d\u014e\7&\2\2\u014e\u014f\5P)\2\u014fO\3\2\2\2"+
		"\u0150\u0154\7\61\2\2\u0151\u0153\7\62\2\2\u0152\u0151\3\2\2\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155Q\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\7,\2\2\u0158\u0159\5Z.\2\u0159\u015a\7-\2\2"+
		"\u015aS\3\2\2\2\u015b\u015c\7\r\2\2\u015c\u015d\5R*\2\u015d\u0160\5B\""+
		"\2\u015e\u015f\7\16\2\2\u015f\u0161\5B\"\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u018b\3\2\2\2\u0162\u0163\7\23\2\2\u0163\u0164\5R*\2\u0164"+
		"\u0165\5B\"\2\u0165\u018b\3\2\2\2\u0166\u0167\7\24\2\2\u0167\u0168\5B"+
		"\"\2\u0168\u0169\7\23\2\2\u0169\u016a\5R*\2\u016a\u018b\3\2\2\2\u016b"+
		"\u016c\7\23\2\2\u016c\u016d\5R*\2\u016d\u016e\7\24\2\2\u016e\u016f\5B"+
		"\"\2\u016f\u018b\3\2\2\2\u0170\u0171\7\25\2\2\u0171\u0172\5B\"\2\u0172"+
		"\u0173\7\26\2\2\u0173\u0174\5R*\2\u0174\u018b\3\2\2\2\u0175\u0176\7\22"+
		"\2\2\u0176\u0177\5d\63\2\u0177\u0178\5B\"\2\u0178\u018b\3\2\2\2\u0179"+
		"\u017a\7\17\2\2\u017a\u017b\5R*\2\u017b\u017f\7.\2\2\u017c\u017e\5f\64"+
		"\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7/\2\2\u0183"+
		"\u018b\3\2\2\2\u0184\u018b\5t;\2\u0185\u018b\5V,\2\u0186\u018b\5H%\2\u0187"+
		"\u0188\5X-\2\u0188\u0189\7\60\2\2\u0189\u018b\3\2\2\2\u018a\u015b\3\2"+
		"\2\2\u018a\u0162\3\2\2\2\u018a\u0166\3\2\2\2\u018a\u016b\3\2\2\2\u018a"+
		"\u0170\3\2\2\2\u018a\u0175\3\2\2\2\u018a\u0179\3\2\2\2\u018a\u0184\3\2"+
		"\2\2\u018a\u0185\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018b"+
		"U\3\2\2\2\u018c\u018d\5P)\2\u018d\u018e\7&\2\2\u018e\u018f\5Z.\2\u018f"+
		"\u0190\7\60\2\2\u0190W\3\2\2\2\u0191\u0192\7\31\2\2\u0192\u0195\5R*\2"+
		"\u0193\u0195\7\31\2\2\u0194\u0191\3\2\2\2\u0194\u0193\3\2\2\2\u0195Y\3"+
		"\2\2\2\u0196\u0197\b.\1\2\u0197\u01a1\5\2\2\2\u0198\u01a1\5P)\2\u0199"+
		"\u01a1\5t;\2\u019a\u019b\7,\2\2\u019b\u019c\5Z.\2\u019c\u019d\7-\2\2\u019d"+
		"\u01a1\3\2\2\2\u019e\u019f\7)\2\2\u019f\u01a1\5Z.\3\u01a0\u0196\3\2\2"+
		"\2\u01a0\u0198\3\2\2\2\u01a0\u0199\3\2\2\2\u01a0\u019a\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a1\u01b0\3\2\2\2\u01a2\u01a3\f\b\2\2\u01a3\u01a4\t\4\2\2\u01a4"+
		"\u01af\5Z.\t\u01a5\u01a6\f\7\2\2\u01a6\u01a7\t\3\2\2\u01a7\u01af\5Z.\b"+
		"\u01a8\u01a9\f\6\2\2\u01a9\u01aa\t\5\2\2\u01aa\u01af\5Z.\7\u01ab\u01ac"+
		"\f\5\2\2\u01ac\u01ad\t\6\2\2\u01ad\u01af\5Z.\6\u01ae\u01a2\3\2\2\2\u01ae"+
		"\u01a5\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1[\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b3\u01b9\7\t\2\2\u01b4\u01b9\7\n\2\2\u01b5\u01b9\5P)\2\u01b6"+
		"\u01b9\5t;\2\u01b7\u01b9\5R*\2\u01b8\u01b3\3\2\2\2\u01b8\u01b4\3\2\2\2"+
		"\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9]\3"+
		"\2\2\2\u01ba\u01bc\5<\37\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01c3\7\67\2\2\u01be\u01c3\7\66\2\2\u01bf\u01c3\5"+
		"P)\2\u01c0\u01c3\5t;\2\u01c1\u01c3\5R*\2\u01c2\u01bb\3\2\2\2\u01c2\u01be"+
		"\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"_\3\2\2\2\u01c4\u01c5\t\7\2\2\u01c5a\3\2\2\2\u01c6\u01c7\7\13\2\2\u01c7"+
		"\u01c8\5P)\2\u01c8\u01c9\7&\2\2\u01c9\u01ca\5Z.\2\u01cac\3\2\2\2\u01cb"+
		"\u01cc\7,\2\2\u01cc\u01cd\5b\62\2\u01cd\u01ce\5`\61\2\u01ce\u01cf\5^\60"+
		"\2\u01cf\u01d0\7-\2\2\u01d0e\3\2\2\2\u01d1\u01d2\7\20\2\2\u01d2\u01d3"+
		"\7\67\2\2\u01d3\u01d4\7(\2\2\u01d4\u01d8\5B\"\2\u01d5\u01d6\7\21\2\2\u01d6"+
		"\u01d8\7\60\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8g\3\2\2\2"+
		"\u01d9\u01da\5j\66\2\u01da\u01db\5p9\2\u01dbi\3\2\2\2\u01dc\u01dd\5n8"+
		"\2\u01dd\u01de\5l\67\2\u01dek\3\2\2\2\u01df\u01e0\5P)\2\u01e0\u01e9\7"+
		",\2\2\u01e1\u01e6\5r:\2\u01e2\u01e3\7:\2\2\u01e3\u01e5\5r:\2\u01e4\u01e2"+
		"\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01e1\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\7-\2\2\u01ec\u01ed\5p9\2\u01edm\3"+
		"\2\2\2\u01ee\u01ef\t\b\2\2\u01efo\3\2\2\2\u01f0\u01f2\7.\2\2\u01f1\u01f3"+
		"\5F$\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\7/\2\2\u01f5q\3\2\2\2\u01f6\u01f7\5\4\3\2\u01f7\u01f8\5P)\2\u01f8"+
		"s\3\2\2\2\u01f9\u01fa\5P)\2\u01fa\u0203\7,\2\2\u01fb\u0200\5v<\2\u01fc"+
		"\u01fd\7:\2\2\u01fd\u01ff\5v<\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2"+
		"\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u01fb\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\7-\2\2\u0206\u0207\7\60\2\2\u0207u\3\2\2\2\u0208\u0209\5Z.\2\u0209"+
		"w\3\2\2\2\65}\u0083\u0087\u0089\u0091\u0094\u00a1\u00a6\u00ac\u00b7\u00be"+
		"\u00c6\u00cc\u00cf\u00d8\u00dd\u00e3\u00e5\u00ea\u00ee\u00f9\u00fe\u0102"+
		"\u0108\u0114\u011a\u0120\u0122\u0127\u012f\u0132\u0139\u0140\u0147\u0154"+
		"\u0160\u017f\u018a\u0194\u01a0\u01ae\u01b0\u01b8\u01bb\u01c2\u01d7\u01e6"+
		"\u01e9\u01f2\u0200\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}