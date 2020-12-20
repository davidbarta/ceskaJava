package compilator.expressions;

import compilator.variable.Value;

public class ExpressionIdentifier extends Expression {
    private Value value;
    public ExpressionIdentifier(Value value, int line) {
        super(ExpressionTypeEnum.IDENTIFIER,line);
        this.value = value;
    }

    public Value getValue() {
        return value;
    }
}
