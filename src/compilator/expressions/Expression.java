package compilator.expressions;

import compilator.variable.VariableTypeEnum;

public class Expression {
    private ExpressionTypeEnum type;
    private int line;
    private VariableTypeEnum expectedReturnType;

    public Expression(ExpressionTypeEnum type, int line)
    {
        this.type = type;
        this.line = line;
    }

    public ExpressionTypeEnum getType()
    {
        return type;
    }

    public void setType(ExpressionTypeEnum type)
    {
        this.type = type;
    }


    public VariableTypeEnum getExpectedReturnType()
    {
        return expectedReturnType;
    }

    public void setExpectedReturnType(VariableTypeEnum expectedReturnType)
    {
        this.expectedReturnType = expectedReturnType;
    }

    public int getLine()
    {
        return line;
    }
}
