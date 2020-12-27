package compilator.statements;

import compilator.expressions.Expression;

public class RepeatStatement extends Statement{
    private Expression expression;
    private BlockStatement blockStatement;

    public RepeatStatement(Expression ex, BlockStatement block, int line) {
        super(StatementTypesEnum.REPEAT_UNTIL,line);
        this.blockStatement = block;
        this.expression = ex;
    }

    public Expression getExpression() {
        return expression;
    }

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }
}
