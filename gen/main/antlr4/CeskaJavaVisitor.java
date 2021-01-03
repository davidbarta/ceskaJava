// Generated from C:/Users/JanRychlik/Documents/Projects/ceskaJava/src/main/antlr4\CeskaJava.g4 by ANTLR 4.9
package main.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CeskaJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CeskaJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#methodReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReturnType(CeskaJavaParser.MethodReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(CeskaJavaParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#possibleTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleTypes(CeskaJavaParser.PossibleTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#decimalSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalSymbol(CeskaJavaParser.DecimalSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CeskaJavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleValues(CeskaJavaParser.PossibleValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalVariable(CeskaJavaParser.DecimalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#decimalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalValue(CeskaJavaParser.DecimalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVariable(CeskaJavaParser.BoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(CeskaJavaParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(CeskaJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVariableDeclaration(CeskaJavaParser.ConstVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CeskaJavaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParalelDeclaration(CeskaJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#variableAssigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssigment(CeskaJavaParser.VariableAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CeskaJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CeskaJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CeskaJavaParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CeskaJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#blockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBody(CeskaJavaParser.BlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(CeskaJavaParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(CeskaJavaParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(CeskaJavaParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDo(CeskaJavaParser.StatementDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitch(CeskaJavaParser.StatementSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementRepeat(CeskaJavaParser.StatementRepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementMethodCall(CeskaJavaParser.StatementMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssigment(CeskaJavaParser.StatementAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementVariableDeclaration(CeskaJavaParser.StatementVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CeskaJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(CeskaJavaParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(CeskaJavaParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdditive(CeskaJavaParser.ExprAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(CeskaJavaParser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(CeskaJavaParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelational(CeskaJavaParser.ExprRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdentifier(CeskaJavaParser.ExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPossibleValue(CeskaJavaParser.ExprPossibleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMethodCall(CeskaJavaParser.ExprMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogical(CeskaJavaParser.ExprLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link CeskaJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultipli(CeskaJavaParser.ExprMultipliContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(CeskaJavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatement(CeskaJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CeskaJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(CeskaJavaParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CeskaJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(CeskaJavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#methodCallParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallParameter(CeskaJavaParser.MethodCallParameterContext ctx);
}