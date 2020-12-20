package compilator.methods;
import compilator.expressions.Expression;
import compilator.variable.VariableTypeEnum;
public class MethodParameter {
    private Expression expression;
    private VariableTypeEnum variableType;

    public MethodParameter(Expression expression)
    {
        this.expression = expression;
    }

    public Expression getExpression()
    {
        return expression;
    }

    public VariableTypeEnum getVariableType()
    {
        return variableType;
    }

    public void setExpression(Expression expression)
    {
        this.expression = expression;
    }

    public void setVariableType(VariableTypeEnum variableType){
        this.variableType = variableType;
    }
}
