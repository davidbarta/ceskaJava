package compilator.statements;

import compilator.expressions.Expression;

public class IfStatement extends Statement{
    private final Expression expression;
    private final BlockStatement bodyIf;
    private final BlockStatement bodyElse;

    public IfStatement(Expression expression, BlockStatement bodyIf, BlockStatement bodyElse, int line){
        super(StatementTypesEnum.IF, line);
        this.expression = expression;
        this.bodyIf = bodyIf;
        this.bodyElse = bodyElse;
    }

    public Boolean hasElse() {
        if (this.getBodyElse() != null){
            return true;
        }
        return false;
    }

    public BlockStatement getBodyElse() {
        return bodyElse;
    }
    public BlockStatement getBodyIf() {
        return bodyIf;
    }
    public Expression getExpression() {
        return expression;
    }
}
