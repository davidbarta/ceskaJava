package compilator.expressions;

public class ExpressionLogical extends Expression {
    private Expression left;
    private Expression right;
    String operator;
    public ExpressionLogical(Expression left, Expression right, String operator, int line) {
        super(ExpressionTypeEnum.LOGICAL, line);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }

    public String getOperator() {
        return operator;
    }
}
