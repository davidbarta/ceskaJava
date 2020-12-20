package compilator.visitors;

import compilator.expressions.Expression;
import compilator.statements.ForHeader;
import compilator.statements.ForStatement;
import compilator.variable.VariableTypeEnum;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

public class ForV extends CeskaJavaBaseVisitor<ForHeader> {
    public ForHeader visitForControl(CeskaJavaParser.ForControlContext ctx){
        String iden = ctx.identifier().getText();
        Expression from = new ExpressionBodyV().visit(ctx.expressionBody(0));
        from.setExpectedReturnType(VariableTypeEnum.INT);
        Expression to = new ExpressionBodyV().visit(ctx.expressionBody(1));
        from.setExpectedReturnType(VariableTypeEnum.INT);

        return new ForHeader(iden,from,to);
    }
}
