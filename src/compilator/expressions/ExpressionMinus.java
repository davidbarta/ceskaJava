package compilator.expressions;

public class ExpressionMinus extends Expression {
    private Expression expression;
    public ExpressionMinus(Expression visit, int line) {
        super(ExpressionTypeEnum.MINUS,line);
        this.expression = visit;
    }

    public Expression getExpression() {
        return expression;
    }
}
