package compilator.statements;

import compilator.variable.Variable;

public class DeclareStatement extends Statement{
    private Variable variable;
    public DeclareStatement(Variable variable, int line) {
        super(StatementTypesEnum.DECLARATION, line);
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }
}
