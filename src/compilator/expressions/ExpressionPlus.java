package compilator.expressions;

public class ExpressionPlus extends Expression {
    private Expression expression;
    public ExpressionPlus(Expression visit, int line) {
        super(ExpressionTypeEnum.PLUS,line);
        this.expression = visit;
    }

    public Expression getExpression() {
        return expression;
    }
}
