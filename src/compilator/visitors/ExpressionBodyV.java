package compilator.visitors;

import compilator.expressions.*;
import compilator.methods.MethodRuns;
import compilator.variable.Value;
import compilator.variable.VariableTypeEnum;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

public class ExpressionBodyV extends CeskaJavaBaseVisitor<Expression> {

    @Override
    public Expression visitExprMethodCall(CeskaJavaParser.ExprMethodCallContext ctx) {
        MethodRuns m = new MethodRunsV().visit(ctx.methodCall());
        return new ExpressionMethodCall(m, ctx.start.getLine());
    }

    @Override
    public Expression visitExprMultipli(CeskaJavaParser.ExprMultipliContext ctx) {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        String operator = ctx.op.getText();
        return new ExpressionMult(left,right,operator,ctx.start.getLine());
    }

    @Override
    public Expression visitExprLogical(CeskaJavaParser.ExprLogicalContext ctx) {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        String operator = ctx.op.getText();
        return new ExpressionLogical(left,right,operator,ctx.start.getLine());
    }

    @Override
    public Expression visitExprPossibleValue(CeskaJavaParser.ExprPossibleValueContext ctx) {
        VariableTypeEnum type = null;
        Value value = null;

        if(ctx.possibleValues().DECIMAL() != null){
            type = VariableTypeEnum.INT;
            int v = Integer.parseInt(ctx.possibleValues().DECIMAL().getText());
            if(ctx.possibleValues().decimalSymbol() != null && ctx.possibleValues().decimalSymbol().getText().equals("-")){
                value = new Value(v*(-1));
            }
            else{
                value = new Value(v);
            }
        }else if(ctx.possibleValues().booleanValue() != null){
            value = new Value(ctx.possibleValues().booleanValue().getText());
            type = VariableTypeEnum.BOOLEAN;
        }

        return new ExpressionValue(value, type, ctx.start.getLine());
    }

    @Override
    public Expression visitExprIdentifier(CeskaJavaParser.ExprIdentifierContext ctx) {
        return new ExpressionIdentifier(new Value(ctx.identifier().getText()),ctx.start.getLine());
    }
    @Override
    public Expression visitExprRelational(CeskaJavaParser.ExprRelationalContext ctx){
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        String operator = ctx.op.getText();
        return new ExpressionRelational(left,right,operator,ctx.start.getLine());
    }

    @Override
    public Expression visitExprNeg(CeskaJavaParser.ExprNegContext ctx)
    {
        return new ExpressionNegation(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }
    @Override
    public Expression visitExprMinus(CeskaJavaParser.ExprMinusContext ctx)
    {
        return new ExpressionMinus(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }
    @Override
    public Expression visitExprPlus(CeskaJavaParser.ExprPlusContext ctx)
    {
        return new ExpressionPlus(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }
    @Override
    public Expression visitExprAdditive(CeskaJavaParser.ExprAdditiveContext ctx)
    {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        String operator = ctx.op.getText();

        return new ExpressionAdditive(left, right, operator, ctx.start.getLine());
    }
    @Override
    public Expression visitExprPar(CeskaJavaParser.ExprParContext ctx){
        return new ExpressionPar(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }
}
