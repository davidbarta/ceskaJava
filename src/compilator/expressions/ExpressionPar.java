package compilator.expressions;

public class ExpressionPar extends Expression {
    private Expression expression;
    public ExpressionPar(Expression visit, int line) {
        super(ExpressionTypeEnum.PAR,line);
        this.expression = visit;
    }

    public Expression getExpression() {
        return expression;
    }
}
