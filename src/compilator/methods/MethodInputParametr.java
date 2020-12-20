package compilator.methods;
import compilator.variable.VariableTypeEnum;

public class MethodInputParametr {
    private VariableTypeEnum type;
    private String identifier;

    public MethodInputParametr(VariableTypeEnum type, String identifier)
    {
        this.type = type;
        this.identifier = identifier;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    public VariableTypeEnum getType()
    {
        return type;
    }

    public void setType(VariableTypeEnum type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "MethodDeclarationParameter{" +
                "type=" + type +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
