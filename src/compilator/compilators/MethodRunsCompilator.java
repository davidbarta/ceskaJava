package compilator.compilators;

import compilator.instructions.Instruction;
import compilator.instructions.InstructionTypeEnum;
import compilator.methods.MethodInputParametr;
import compilator.methods.MethodParameter;
import compilator.methods.MethodReturnTypeEnum;
import compilator.methods.MethodRuns;
import compilator.variable.VariableTypeEnum;

public class MethodRunsCompilator extends Compilator{
    private MethodRuns methodRuns;
    private int lvl;
    public MethodRunsCompilator(MethodRuns methodRuns, int lvl) {
        this.methodRuns = methodRuns;
        this.lvl = lvl;
    }
    public void run(){
        if(methodRuns.getExpectedReturnType() != MethodReturnTypeEnum.VOID){
            addInstruction(new Instruction(InstructionTypeEnum.INT,getInstructionCountter(),0,1));
        }
        for(int i = 0; i < methodRuns.getParameters().size();i++){
            MethodParameter parameter = methodRuns.getParameters().get(i);
            VariableTypeEnum type = new ExpressionCompilator(parameter.getExpression(),lvl).runReturnType();
            methodRuns.getParameters().get(i).setVariableType(type);
        }
        addInstruction(new Instruction(InstructionTypeEnum.CAL,getInstructionCountter(),lvl,methodRuns));
        for(int i =0; i < methodRuns.getParameters().size();i++){
            addInstruction(new Instruction(InstructionTypeEnum.STO,getInstructionCountter(),0,-1));
        }
        //TODO Kamí 1.1.2021
    }

    public MethodRuns getMethodRuns() {
        return methodRuns;
    }

    public void setMethodRuns(MethodRuns methodRuns) {
        this.methodRuns = methodRuns;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
