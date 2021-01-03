package compilator.compilators;

import compilator.expressions.*;
import compilator.instructions.Instruction;
import compilator.instructions.InstructionOperationEnum;
import compilator.instructions.InstructionTypeEnum;
import compilator.methods.MethodReturnTypeEnum;
import compilator.variable.Value;
import compilator.variable.VariableTypeEnum;

public class ExpressionCompilator extends Compilator{
    private Expression expression;
    private VariableTypeEnum varTypeEnum;
    private int lvl;
    private MethodReturnTypeEnum methodReturnType;

    public ExpressionCompilator(Expression expression, VariableTypeEnum typeEnum, int lvl) {
        this.expression = expression;
        this.varTypeEnum = typeEnum;
        this.lvl = lvl;
    }

    public ExpressionCompilator(Expression expression, int lvl) {
        this.expression  = expression;
        this.lvl = lvl;
    }

    public ExpressionCompilator(Expression returnValue, MethodReturnTypeEnum returnType, int lvl) {
        this.expression = returnValue;
        this.methodReturnType = returnType;
        this.lvl =lvl;
    }

    public void run(){
        VariableTypeEnum type = processExpression(expression);
        if(varTypeEnum != null && type != null){
            if(varTypeEnum != type){
                System.out.println("Error missmatch expression error.");
            }
        }

    }

    private VariableTypeEnum processExpression(Expression expression) {
        VariableTypeEnum returnTypre = null;
        System.out.println("Expression: " + expression.getType().toString());
        switch (expression.getType()){
            case IDENTIFIER:
                returnTypre = genIdentifierInstructions((ExpressionIdentifier) expression);
                break;
            case VALUE:
                returnTypre = genValueInstructions((ExpressionValue) expression);
                break;
            case MULTIPLICATION:
                returnTypre = genMultiplicationInstructions((ExpressionMult) expression);
                break;
            case ADDITIVE:
                returnTypre = genAdditiveInstructions((ExpressionAdditive) expression);
                break;
            case RELATIONAL:
                returnTypre = genReationalInstructions((ExpressionRelational) expression);
                break;
            case LOGICAL:
                returnTypre = genLogicalInstructions((ExpressionLogical) expression);
                break;
            case NEGATION:
                returnTypre = genNegationInstructions((ExpressionNegation) expression);
                break;
            case PAR:
                returnTypre = genParInstructions((ExpressionPar) expression);
                break;
            case METHOD_CALL:
                returnTypre = genMethodInstructions((ExpressionMethodCall) expression);
                break;
            case  MINUS:
                returnTypre = genMinusInstructions((ExpressionMinus) expression);
                break;
            case PLUS:
                returnTypre = genPlusInstruction((ExpressionPlus) expression);
                break;
            default:
                System.out.println("Cannot expression with name " + expression.getLine());
                break;
        }
        return returnTypre;
    }

    private VariableTypeEnum genPlusInstruction(ExpressionPlus expression) {
        if(expression.getType() == expression.getExpression().getType()){
            System.out.println("Error wit aretmatic at line" + expression.getLine());
            return null;
        }
        VariableTypeEnum typeEnum = processExpression(expression.getExpression());
        int res = checkVarType(typeEnum,VariableTypeEnum.INT);
        if(res == 0){
            System.out.println("Error with NEGATION expresion: " + expression.getLine());
            return null;
        }
        return VariableTypeEnum.INT;
    }

    private VariableTypeEnum genMinusInstructions(ExpressionMinus expression) {
        if(expression.getType() == expression.getExpression().getType()){
            System.out.println("Error wit aretmatic at line" + expression.getLine());
            return null;
        }
        VariableTypeEnum typeEnum = processExpression(expression.getExpression());
        int res = checkVarType(typeEnum,VariableTypeEnum.INT);
        if(res == 0){
            System.out.println("Error with MINUS expresion: " + expression.getLine());
            return null;
        }
        addInstruction(new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0,-1));
        addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0,InstructionOperationEnum.MULTIPLY.getCode()));
        return VariableTypeEnum.INT;
    }

    private VariableTypeEnum genMethodInstructions(ExpressionMethodCall expression) {
        if(expression.getMethodRuns().getExpectedReturnType() == MethodReturnTypeEnum.VOID){
            System.out.println("Error with method runs expression at line: " + expression.getLine());
            return null;
        }
        if(getMethodPrototypes().containsKey(expression.getMethodRuns().getIdentifier())){
            System.out.println("Method not exists: " + expression.getLine());
            return null;
        }
        expression.getMethodRuns().setExpectedReturnType(getMethodPrototypes().get(expression.getMethodRuns().getIdentifier()).getReturnType());
        new MethodRunsCompilator(expression.getMethodRuns(),lvl).run();
        return getMethodPrototypes().get(expression.getMethodRuns().getIdentifier()).convertType();
    }

    private VariableTypeEnum genParInstructions(ExpressionPar expression) {
        return processExpression(expression.getExpression());
    }

    private VariableTypeEnum genNegationInstructions(ExpressionNegation expression) {
        if(expression.getType() == expression.getExpression().getType()){
            System.out.println("Error wit aretmatic at line" + expression.getLine());
            return null;
        }
        VariableTypeEnum typeEnum = processExpression(expression.getExpression());
        int res = checkVarType(typeEnum,VariableTypeEnum.BOOLEAN);
        if(res == 0){
            System.out.println("Error with negation expresion: " + expression.getLine());
            return null;
        }
        addInstruction(new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0,0));
        addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0,InstructionOperationEnum.EQ.getCode()));
        return VariableTypeEnum.BOOLEAN;
    }

    private int checkVarType(VariableTypeEnum typeEnum, VariableTypeEnum aBoolean) {
        if(typeEnum != aBoolean){
            return 0;
        }
        return 1;
    }

    private VariableTypeEnum genLogicalInstructions(ExpressionLogical expression) {
        VariableTypeEnum leftE = processExpression(expression.getLeft());
        VariableTypeEnum rightE = processExpression(expression.getRight());
        int res = checkVarTypes(leftE,rightE);
        if(res == 0){
            System.out.println("Error generate logical instructions: " + expression.getLine());
            return  null;
        }
        if(expression.getOperator().equals("&&")){
            addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0, InstructionOperationEnum.MULTIPLY.getCode()));
            addInstruction(new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0, 1));
            addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0, InstructionOperationEnum.EQ.getCode()));
        }
        else {
            addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0, InstructionOperationEnum.PLUS.getCode()));
            addInstruction(new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0, 0));
            addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0, InstructionOperationEnum.GREATER.getCode()));
        }
        return VariableTypeEnum.BOOLEAN;
    }

    private VariableTypeEnum genReationalInstructions(ExpressionRelational expression) {
        VariableTypeEnum leftE = processExpression(expression.getLeft());
        VariableTypeEnum rightE = processExpression(expression.getRight());
        int res = checkVarTypes(leftE,rightE);
        if(res == 0){
            System.out.println("Error generate relational instructions: " + expression.getLine());
            return  null;
        }
        addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0,expression.getOperatorNum()));
        return VariableTypeEnum.BOOLEAN;
    }

    private VariableTypeEnum genAdditiveInstructions(ExpressionAdditive expression) {
        VariableTypeEnum leftE = processExpression(expression.getLeftExpression());
        VariableTypeEnum rightE = processExpression(expression.getRightExpression());
        int res = checkVarTypes(leftE,rightE);
        if(res == 0){
            System.out.println("Error generate additive instructions: " + expression.getLine());
            return  null;
        }
        addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0,expression.getOperatorNum()));
        return VariableTypeEnum.INT;
    }

    private VariableTypeEnum genMultiplicationInstructions(ExpressionMult expression) {
        VariableTypeEnum leftE = processExpression(expression.getLeft());
        VariableTypeEnum rightE = processExpression(expression.getRight());
        int res = checkVarTypes(leftE,rightE);
        if(res == 0){
            System.out.println("Error generate Multiplication instructions: " + expression.getLine());
            return  null;
        }
        addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0,expression.getOperatorNum()));
        return VariableTypeEnum.INT;
    }

    private int checkVarTypes(VariableTypeEnum leftE, VariableTypeEnum rightE) {
        if(leftE != VariableTypeEnum.INT || rightE != VariableTypeEnum.INT){
            System.out.println("Error during check variables");
            return 0;
        }
        return 1;
    }

    private VariableTypeEnum genValueInstructions(ExpressionValue expression) {
        Value value = expression.getValue();
        if(expression.getExpectedReturnType()== VariableTypeEnum.INT){
            addInstruction(new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0,value.toInt()));
            return VariableTypeEnum.INT;
        } else if(expression.getExpectedReturnType()== VariableTypeEnum.BOOLEAN){
            addInstruction(new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0,value.toBooleanAsInt()));
            return VariableTypeEnum.BOOLEAN;
        }
        else{
            System.out.println("Error with value instruction at line: " + expression.getLine());
            return null;
        }
    }

    private VariableTypeEnum genIdentifierInstructions(ExpressionIdentifier expression) {
        String name = expression.getValue().toString();
        if(isInSymbolTable(name)){
            TableItem item = getTableItem(name);
            addInstruction(new Instruction(InstructionTypeEnum.LOD,getInstructionCountter(),lvl-item.getLvl(),item.getAddress()));
            return item.getType();
        }
        else {
            System.out.println("Identifier " + name + " not exists in symbol table.");
            return null;
        }
    }


    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public MethodReturnTypeEnum getMethodReturnType() {
        return methodReturnType;
    }

    public void setMethodReturnType(MethodReturnTypeEnum methodReturnType) {
        this.methodReturnType = methodReturnType;
    }

    public VariableTypeEnum runReturnType() {
        return this.processExpression(this.expression);
    }
}
