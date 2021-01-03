// Generated from C:/Users/JanRychlik/Documents/Projects/ceskaJava/src/main/antlr4\CeskaJava.g4 by ANTLR 4.9
package main.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CeskaJavaParser}.
 */
public interface CeskaJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void enterMethodReturnType(CeskaJavaParser.MethodReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void exitMethodReturnType(CeskaJavaParser.MethodReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(CeskaJavaParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(CeskaJavaParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#possibleTypes}.
	 * @param ctx the parse tree
	 */
	void enterPossibleTypes(CeskaJavaParser.PossibleTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#possibleTypes}.
	 * @param ctx the parse tree
	 */
	void exitPossibleTypes(CeskaJavaParser.PossibleTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#decimalSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDecimalSymbol(CeskaJavaParser.DecimalSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#decimalSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDecimalSymbol(CeskaJavaParser.DecimalSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CeskaJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CeskaJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 */
	void enterPossibleValues(CeskaJavaParser.PossibleValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 */
	void exitPossibleValues(CeskaJavaParser.PossibleValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 */
	void enterDecimalVariable(CeskaJavaParser.DecimalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 */
	void exitDecimalVariable(CeskaJavaParser.DecimalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#decimalValue}.
	 * @param ctx the parse tree
	 */
	void enterDecimalValue(CeskaJavaParser.DecimalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#decimalValue}.
	 * @param ctx the parse tree
	 */
	void exitDecimalValue(CeskaJavaParser.DecimalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(CeskaJavaParser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(CeskaJavaParser.BoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(CeskaJavaParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(CeskaJavaParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(CeskaJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(CeskaJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstVariableDeclaration(CeskaJavaParser.ConstVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstVariableDeclaration(CeskaJavaParser.ConstVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CeskaJavaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CeskaJavaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParalelDeclaration(CeskaJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParalelDeclaration(CeskaJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#variableAssigment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssigment(CeskaJavaParser.VariableAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#variableAssigment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssigment(CeskaJavaParser.VariableAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CeskaJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CeskaJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CeskaJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CeskaJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CeskaJavaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CeskaJavaParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CeskaJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CeskaJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void enterBlockBody(CeskaJavaParser.BlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void exitBlockBody(CeskaJavaParser.BlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(CeskaJavaParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(CeskaJavaParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFor(CeskaJavaParser.StatementForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFor(CeskaJavaParser.StatementForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(CeskaJavaParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(CeskaJavaParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDo(CeskaJavaParser.StatementDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDo(CeskaJavaParser.StatementDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSwitch(CeskaJavaParser.StatementSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSwitch(CeskaJavaParser.StatementSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementRepeat(CeskaJavaParser.StatementRepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementRepeat(CeskaJavaParser.StatementRepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethodCall(CeskaJavaParser.StatementMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethodCall(CeskaJavaParser.StatementMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssigment(CeskaJavaParser.StatementAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssigment(CeskaJavaParser.StatementAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementVariableDeclaration(CeskaJavaParser.StatementVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementVariableDeclaration(CeskaJavaParser.StatementVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CeskaJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CeskaJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprNeg(CeskaJavaParser.ExprNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprNeg(CeskaJavaParser.ExprNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(CeskaJavaParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(CeskaJavaParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprAdditive(CeskaJavaParser.ExprAdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprAdditive(CeskaJavaParser.ExprAdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprPar(CeskaJavaParser.ExprParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprPar(CeskaJavaParser.ExprParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(CeskaJavaParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(CeskaJavaParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(CeskaJavaParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(CeskaJavaParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprIdentifier(CeskaJavaParser.ExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprIdentifier(CeskaJavaParser.ExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprPossibleValue(CeskaJavaParser.ExprPossibleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprPossibleValue(CeskaJavaParser.ExprPossibleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprMethodCall(CeskaJavaParser.ExprMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprMethodCall(CeskaJavaParser.ExprMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprLogical(CeskaJavaParser.ExprLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprLogical(CeskaJavaParser.ExprLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprMultipli(CeskaJavaParser.ExprMultipliContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprMultipli(CeskaJavaParser.ExprMultipliContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(CeskaJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(CeskaJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatement(CeskaJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatement(CeskaJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CeskaJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CeskaJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameter(CeskaJavaParser.MethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameter(CeskaJavaParser.MethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CeskaJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CeskaJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(CeskaJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(CeskaJavaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#methodCallParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallParameter(CeskaJavaParser.MethodCallParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#methodCallParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallParameter(CeskaJavaParser.MethodCallParameterContext ctx);
}