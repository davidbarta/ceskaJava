package compilator.statements;

import compilator.expressions.Expression;

public class DoWhileStatement extends Statement {
    private Expression expression;
    private BlockStatement body;
    public DoWhileStatement(Expression e, BlockStatement bodyDo, int line) {
        super(StatementTypesEnum.DO_WHILE,line);
        this.expression = e;
        this.body = bodyDo;
    }

    public BlockStatement getBody() {
        return body;
    }

    public Expression getExpression() {
        return expression;
    }
}
