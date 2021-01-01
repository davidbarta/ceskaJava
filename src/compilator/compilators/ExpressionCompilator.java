package compilator.compilators;

import compilator.expressions.Expression;
import compilator.variable.VariableTypeEnum;

public class ExpressionCompilator extends Compilator{
    private Expression expression;
    private VariableTypeEnum varTypeEnum;
    private int lvl;

    public ExpressionCompilator(Expression expression, VariableTypeEnum typeEnum, int lvl) {
        this.expression = expression;
        this.varTypeEnum = typeEnum;
        this.lvl = lvl;
    }
    public void run(){
        //TODO

    }
}
