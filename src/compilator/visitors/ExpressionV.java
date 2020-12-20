package compilator.visitors;

import compilator.expressions.Expression;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

public class ExpressionV extends CeskaJavaBaseVisitor<Expression> {
    public Expression visitExpression(CeskaJavaParser.ExpressionContext context){
        return new ExpressionBodyV().visit(context.expressionBody());
    }
}
