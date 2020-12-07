// Generated from C:/Users/JanRychlik/IdeaProjects/ceskaJava/src/main/antlr4\CeskaJava.g4 by ANTLR 4.9
package main.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CeskaJavaParser}.
 */
public interface CeskaJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#boolean_values}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_values(CeskaJavaParser.Boolean_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#boolean_values}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_values(CeskaJavaParser.Boolean_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#varTypes}.
	 * @param ctx the parse tree
	 */
	void enterVarTypes(CeskaJavaParser.VarTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#varTypes}.
	 * @param ctx the parse tree
	 */
	void exitVarTypes(CeskaJavaParser.VarTypesContext ctx);
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
	 * Enter a parse tree produced by {@link CeskaJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(CeskaJavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(CeskaJavaParser.ModifierContext ctx);
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
	 * Enter a parse tree produced by {@link CeskaJavaParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(CeskaJavaParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(CeskaJavaParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#block_body}.
	 * @param ctx the parse tree
	 */
	void enterBlock_body(CeskaJavaParser.Block_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#block_body}.
	 * @param ctx the parse tree
	 */
	void exitBlock_body(CeskaJavaParser.Block_bodyContext ctx);
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
	 * Enter a parse tree produced by the {@code ifelseStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfelseStatement(CeskaJavaParser.IfelseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelseStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfelseStatement(CeskaJavaParser.IfelseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CeskaJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CeskaJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dowhileStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDowhileStatement(CeskaJavaParser.DowhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dowhileStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDowhileStatement(CeskaJavaParser.DowhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whiledoStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhiledoStatement(CeskaJavaParser.WhiledoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whiledoStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhiledoStatement(CeskaJavaParser.WhiledoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatuntilStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatuntilStatement(CeskaJavaParser.RepeatuntilStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatuntilStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatuntilStatement(CeskaJavaParser.RepeatuntilStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CeskaJavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CeskaJavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(CeskaJavaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(CeskaJavaParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functioncallStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncallStatement(CeskaJavaParser.FunctioncallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functioncallStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncallStatement(CeskaJavaParser.FunctioncallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varassigmentStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarassigmentStatement(CeskaJavaParser.VarassigmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varassigmentStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarassigmentStatement(CeskaJavaParser.VarassigmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardeclarationStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVardeclarationStatement(CeskaJavaParser.VardeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardeclarationStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVardeclarationStatement(CeskaJavaParser.VardeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CeskaJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CeskaJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#variable_assigment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assigment(CeskaJavaParser.Variable_assigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#variable_assigment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assigment(CeskaJavaParser.Variable_assigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CeskaJavaParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CeskaJavaParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negationExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpression(CeskaJavaParser.NegationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negationExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpression(CeskaJavaParser.NegationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expbodyExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void enterExpbodyExpression(CeskaJavaParser.ExpbodyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expbodyExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void exitExpbodyExpression(CeskaJavaParser.ExpbodyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(CeskaJavaParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(CeskaJavaParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funccallExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void enterFunccallExpression(CeskaJavaParser.FunccallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funccallExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void exitFunccallExpression(CeskaJavaParser.FunccallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CeskaJavaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CeskaJavaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(CeskaJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(CeskaJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusandminusExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void enterPlusandminusExpression(CeskaJavaParser.PlusandminusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusandminusExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void exitPlusandminusExpression(CeskaJavaParser.PlusandminusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(CeskaJavaParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(CeskaJavaParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multanddivExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void enterMultanddivExpression(CeskaJavaParser.MultanddivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multanddivExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 */
	void exitMultanddivExpression(CeskaJavaParser.MultanddivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(CeskaJavaParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(CeskaJavaParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#decimal_variable}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_variable(CeskaJavaParser.Decimal_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#decimal_variable}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_variable(CeskaJavaParser.Decimal_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#bool_variable}.
	 * @param ctx the parse tree
	 */
	void enterBool_variable(CeskaJavaParser.Bool_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#bool_variable}.
	 * @param ctx the parse tree
	 */
	void exitBool_variable(CeskaJavaParser.Bool_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#parallel_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParallel_declaration(CeskaJavaParser.Parallel_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#parallel_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParallel_declaration(CeskaJavaParser.Parallel_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link CeskaJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CeskaJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CeskaJavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(CeskaJavaParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(CeskaJavaParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(CeskaJavaParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(CeskaJavaParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#for_type}.
	 * @param ctx the parse tree
	 */
	void enterFor_type(CeskaJavaParser.For_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#for_type}.
	 * @param ctx the parse tree
	 */
	void exitFor_type(CeskaJavaParser.For_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(CeskaJavaParser.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(CeskaJavaParser.For_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(CeskaJavaParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(CeskaJavaParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(CeskaJavaParser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(CeskaJavaParser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(CeskaJavaParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(CeskaJavaParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#function_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_header(CeskaJavaParser.Function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#function_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_header(CeskaJavaParser.Function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#function_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declarator(CeskaJavaParser.Function_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#function_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declarator(CeskaJavaParser.Function_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(CeskaJavaParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(CeskaJavaParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(CeskaJavaParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(CeskaJavaParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#formal_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter(CeskaJavaParser.Formal_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#formal_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter(CeskaJavaParser.Formal_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_statement(CeskaJavaParser.Function_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_statement(CeskaJavaParser.Function_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CeskaJavaParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(CeskaJavaParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CeskaJavaParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(CeskaJavaParser.Argument_listContext ctx);
}