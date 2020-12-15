package compilator.methods;

import compilator.variable.VariableTypeEnum;

import java.util.List;

public class MethodRuns {
    private final String identifier;
    private List<MethodParameter> parameters;
    private MethodReturnTypeEnum expectedReturnType;
    private int line;

    public MethodRuns(String identifier)
    {
        this.identifier = identifier;
    }

    public MethodRuns(String identifier, List<MethodParameter> parameters, int line)
    {
        this.identifier = identifier;
        this.parameters = parameters;
        this.line = line;
    }

    public MethodRuns(String identifier, MethodReturnTypeEnum expectedReturnType, int line)
    {
        this.identifier = identifier;
        this.expectedReturnType = expectedReturnType;
        this.line = line;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public MethodReturnTypeEnum getExpectedReturnType()
    {
        return expectedReturnType;
    }

    public VariableTypeEnum convertReturnTypeToVariableType()
    {
        if (this.expectedReturnType == MethodReturnTypeEnum.INT)
        {
            return VariableTypeEnum.INT;
        }
        else if (this.expectedReturnType == MethodReturnTypeEnum.BOOLEAN)
        {
            return VariableTypeEnum.BOOLEAN;
        }

        return null;
    }

    public void setExpectedReturnType(MethodReturnTypeEnum expectedReturnType)
    {
        this.expectedReturnType = expectedReturnType;
    }



    public List<MethodParameter> getParameters()
    {
        return parameters;
    }

    public int getLine()
    {
        return line;
    }

    public void setLine(int line)
    {
        this.line = line;
    }
}
