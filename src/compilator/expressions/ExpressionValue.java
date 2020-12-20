package compilator.expressions;

import compilator.variable.Value;
import compilator.variable.VariableTypeEnum;

public class ExpressionValue extends Expression {
    private Value value;
    private VariableTypeEnum type;
    public ExpressionValue(Value value, VariableTypeEnum type, int line) {
        super(ExpressionTypeEnum.VALUE,line);
        this.value = value;
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public VariableTypeEnum getExpectedReturnType() {
        return type;
    }
}
