package compilator.expressions;

import compilator.instructions.InstructionOperationEnum;

public class ExpressionAdditive extends Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private String operator;

    public ExpressionAdditive(Expression left, Expression right, String operator, int line) {
        super(ExpressionTypeEnum.ADDITIVE,line);
        this.leftExpression = left;
        this.rightExpression = right;
        this.operator = operator;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public String getOperator() {
        return operator;
    }

    public int getOperatorNum(){
        if(operator.equals("+")){
            return InstructionOperationEnum.PLUS.getCode();
        }
        else if(operator.equals("-")){
            return InstructionOperationEnum.MINUS.getCode();
        }
        else{
            return InstructionOperationEnum.UNKNOWN.getCode();
        }
    }
}
