package compilator.statements;

import compilator.expressions.Expression;

public class WhileStatement extends Statement {
    private Expression expression;
    private BlockStatement body;
    public WhileStatement(Expression e, BlockStatement bodyWhile, int line) {
        super(StatementTypesEnum.WHILE,line);
        this.expression = e;
        this.body = bodyWhile;
    }

    public BlockStatement getBody() {
        return body;
    }

    public Expression getExpression() {
        return expression;
    }
}
