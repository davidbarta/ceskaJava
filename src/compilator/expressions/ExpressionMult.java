package compilator.expressions;

import compilator.instructions.InstructionOperationEnum;

public class ExpressionMult extends Expression {

    private Expression left;
    private Expression right;
    private String operator;
    public ExpressionMult(Expression left, Expression right, String operator, int line) {
        super(ExpressionTypeEnum.MULTIPLICATION, line);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public int getOperatorNum() {
        int toReturn = InstructionOperationEnum.UNKNOWN.getCode();

        if (operator.equals("*")) {
            toReturn = InstructionOperationEnum.MULTIPLY.getCode();
        } else if (operator.equals("/")) {
            toReturn = InstructionOperationEnum.DIVIDE.getCode();
        } else if (operator.equals("%")) {
            toReturn = InstructionOperationEnum.MODULO.getCode();
        }
        return toReturn;
    }
}
