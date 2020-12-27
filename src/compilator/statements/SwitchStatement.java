package compilator.statements;

import compilator.expressions.Expression;

import java.util.HashMap;

public class SwitchStatement extends Statement{
    private Expression expression;
    private HashMap<Integer,SwitchBlockStatement> switchBlocks;
    private SwitchBlockStatement defaultB;

    public SwitchStatement(Expression ex, HashMap<Integer, SwitchBlockStatement> switchBlocksMap,SwitchBlockStatement defaultB, int line) {
        super(StatementTypesEnum.SWITCH,line);
        this.switchBlocks = switchBlocksMap;
        this.expression = ex;
        this.defaultB = defaultB;
    }

    public Expression getExpression() {
        return expression;
    }

    public HashMap<Integer, SwitchBlockStatement> getSwitchBlocks() {
        return switchBlocks;
    }

    public SwitchBlockStatement getDefaultBlock() {
        return defaultB;
    }
}
