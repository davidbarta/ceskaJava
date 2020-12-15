package compilator.statements;
import compilator.variable.Variable;

public class StatementDeclare extends Statement{
    private final Variable variable;

    public StatementDeclare(Variable variable, int line)
    {
        super(StatementTypesEnum.DECLARATION, line);
        this.variable = variable;
    }

    public Variable getVariable()
    {
        return variable;
    }
}
