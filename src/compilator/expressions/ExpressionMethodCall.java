package compilator.expressions;

import compilator.methods.MethodRuns;

public class ExpressionMethodCall extends Expression {
    private MethodRuns methodRuns;
    public ExpressionMethodCall(MethodRuns m, int line) {
        super(ExpressionTypeEnum.METHOD_CALL, line);
        this.methodRuns = m;
    }

    public MethodRuns getMethodRuns() {
        return methodRuns;
    }
}
