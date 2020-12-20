package compilator.expressions;

public class ExpressionNegation extends Expression {
    private Expression expression;
    private int line;
    public ExpressionNegation(Expression visit, int line) {
        super(ExpressionTypeEnum.NEGATION,line);
        this.expression = visit;
        this.line = line;
    }
    public Expression getExpression() {
        return expression;
    }
}
