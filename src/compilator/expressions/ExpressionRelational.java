package compilator.expressions;

import compilator.instructions.InstructionOperationEnum;

public class ExpressionRelational extends Expression {
    private Expression left;
    private Expression right;
    private String operator;
    public ExpressionRelational(Expression left, Expression right, String operator, int line) {
        super(ExpressionTypeEnum.RELATIONAL,line);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
    public int getOperatorNum(){
        int toReturn = InstructionOperationEnum.UNKNOWN.getCode();
        if(operator.equals("==")){
            toReturn = InstructionOperationEnum.EQ.getCode();
        }
        else if(operator.equals("!=")){
            toReturn = InstructionOperationEnum.NOT_EQ.getCode();
        }
        else if(operator.equals("<")){
            toReturn = InstructionOperationEnum.LESS.getCode();
        }
        else if(operator.equals("<=")){
            toReturn = InstructionOperationEnum.LESS_EQ.getCode();
        }
        else if(operator.equals(">=")){
            toReturn = InstructionOperationEnum.GREATER_EQ.getCode();
        }
        else if(operator.equals(">")){
            toReturn = InstructionOperationEnum.GREATER.getCode();
        }
        return toReturn;
    }
}
