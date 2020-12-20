package compilator.methods;

import compilator.statements.BlockStatement;
import compilator.expressions.Expression;

import java.util.List;

public class Method {
    private final String identifier;
    private final MethodReturnTypeEnum returnType;
    private final List<MethodInputParametr> parameters;
    private final BlockStatement body;
    private final Expression returnValue;
    private int line;

    public Method(MethodReturnTypeEnum returnType, String identifier, List<MethodInputParametr> parameters, BlockStatement body, Expression returnValue, int line)
    {
        this.identifier = identifier;
        this.returnType = returnType;
        this.parameters = parameters;
        this.body = body;
        this.returnValue = returnValue;
        this.line = line;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public MethodReturnTypeEnum getReturnType()
    {
        return returnType;
    }

    public List<MethodInputParametr> getParameters()
    {
        return parameters;
    }

    public BlockStatement getBody()
    {
        return body;
    }

    public Expression getReturnValue()
    {
        return returnValue;
    }

    @Override
    public String toString()
    {
        return "Method{" +
                "identifier='" + identifier + '\'' +
                ", returnType=" + returnType +
                ", parameters=" + parameters +
                ", body=" + body +
                ", returnValue=" + returnValue +
                '}';
    }

    public int getLine()
    {
        return line;
    }
}
