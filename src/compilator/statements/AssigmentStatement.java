package compilator.statements;

import compilator.expressions.Expression;

public class AssigmentStatement extends Statement {
    private Expression expression;
    private String identfier;
    public AssigmentStatement(Expression ex, String identifier, int line) {
        super(StatementTypesEnum.ASSIGMENT,line);
        this.expression =ex;
        this.identfier = identifier;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getIdentfier() {
        return identfier;
    }
}
