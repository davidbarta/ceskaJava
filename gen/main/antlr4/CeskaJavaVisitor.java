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
	 * Visit a parse tree produced by {@link CeskaJavaParser#boolean_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_values(CeskaJavaParser.Boolean_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#varTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarTypes(CeskaJavaParser.VarTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(CeskaJavaParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(CeskaJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(CeskaJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(CeskaJavaParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(CeskaJavaParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(CeskaJavaParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(CeskaJavaParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(CeskaJavaParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(CeskaJavaParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(CeskaJavaParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(CeskaJavaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(CeskaJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(CeskaJavaParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(CeskaJavaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(CeskaJavaParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(CeskaJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(CeskaJavaParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(CeskaJavaParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(CeskaJavaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(CeskaJavaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(CeskaJavaParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(CeskaJavaParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(CeskaJavaParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(CeskaJavaParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(CeskaJavaParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(CeskaJavaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(CeskaJavaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#decimalSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalSymbol(CeskaJavaParser.DecimalSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(CeskaJavaParser.ModifierContext ctx);
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
	 * Visit a parse tree produced by {@link CeskaJavaParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(CeskaJavaParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#block_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_body(CeskaJavaParser.Block_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(CeskaJavaParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#decimal_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_variable(CeskaJavaParser.Decimal_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#bool_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_variable(CeskaJavaParser.Bool_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#parallel_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_declaration(CeskaJavaParser.Parallel_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CeskaJavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CeskaJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelseStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseStatement(CeskaJavaParser.IfelseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CeskaJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dowhileStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhileStatement(CeskaJavaParser.DowhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whiledoStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledoStatement(CeskaJavaParser.WhiledoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatuntilStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatuntilStatement(CeskaJavaParser.RepeatuntilStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CeskaJavaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(CeskaJavaParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functioncallStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncallStatement(CeskaJavaParser.FunctioncallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varassigmentStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarassigmentStatement(CeskaJavaParser.VarassigmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardeclarationStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclarationStatement(CeskaJavaParser.VardeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CeskaJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CeskaJavaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#variable_assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assigment(CeskaJavaParser.Variable_assigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(CeskaJavaParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negationExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationExpression(CeskaJavaParser.NegationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expbodyExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpbodyExpression(CeskaJavaParser.ExpbodyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(CeskaJavaParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funccallExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccallExpression(CeskaJavaParser.FunccallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CeskaJavaParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(CeskaJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusandminusExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusandminusExpression(CeskaJavaParser.PlusandminusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(CeskaJavaParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multanddivExpression}
	 * labeled alternative in {@link CeskaJavaParser#expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultanddivExpression(CeskaJavaParser.MultanddivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(CeskaJavaParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(CeskaJavaParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#for_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_type(CeskaJavaParser.For_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init(CeskaJavaParser.For_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(CeskaJavaParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#switch_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_block(CeskaJavaParser.Switch_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(CeskaJavaParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_header(CeskaJavaParser.Function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#function_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declarator(CeskaJavaParser.Function_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(CeskaJavaParser.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(CeskaJavaParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#formal_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_parameter(CeskaJavaParser.Formal_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_statement(CeskaJavaParser.Function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CeskaJavaParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(CeskaJavaParser.Argument_listContext ctx);
}