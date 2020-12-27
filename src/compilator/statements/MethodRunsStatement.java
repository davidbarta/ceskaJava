package compilator.statements;

import compilator.methods.MethodRuns;

public class MethodRunsStatement extends Statement{
    private MethodRuns method;
    public MethodRunsStatement(MethodRuns method, int line) {
        super(StatementTypesEnum.METHOD_CALL,line);
        this.method = method;
    }

    public MethodRuns getMethod() {
        return method;
    }
}
