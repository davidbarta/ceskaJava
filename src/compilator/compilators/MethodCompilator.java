package compilator.compilators;

import compilator.instructions.Instruction;
import compilator.instructions.InstructionTypeEnum;
import compilator.methods.Method;
import compilator.methods.MethodInputParametr;

import java.util.List;

public class MethodCompilator extends Compilator{
    Method method;
    public MethodCompilator(Method m) {
        this.method = m;
    }
    public void run(){
        if(isInSymbolTable(method.getIdentifier())){
            System.out.println("Method "+ method.getIdentifier() + "have no space in symbol table");
        }
        setStackPointer(3);
        int methodSize = 0;
        if(method.getBody() != null) {
            methodSize = method.getBody().getStatementData().getVariableDeclarationCount() + method.getBody().getStatementData().getForStatementCount();
        }
        int baseMethodSize = method.getParameters().size() +3;
        addMethodtoSymbolTable(methodSize,baseMethodSize);
        loadParramFromStag();
        BlockStatementCompilator blockBody = new BlockStatementCompilator(method.getBody(),1);
        blockBody.setInnerBodySettings();
        blockBody.setDelLocalVariables(false);
        blockBody.run();

        if(method.getReturnValue() != null){
            new ExpressionCompilator(method.getReturnValue(),method.getReturnType(),1).run();
            addInstruction(new Instruction(InstructionTypeEnum.STO,getInstructionCountter(),0,-(method.getParameters().size()+1)));
        }
        blockBody.delLocalVariablesMethod();
        deleteTableParrams();
        addInstruction(new Instruction(InstructionTypeEnum.RET,getInstructionCountter(),0,0));
    }

    private void deleteTableParrams() {
        for(MethodInputParametr parameter:method.getParameters()){
            getSymbolTable().remove(parameter.getIdentifier());

        }
    }

    private void loadParramFromStag() {
        List<MethodInputParametr> parametrs = method.getParameters();
        TableItem tableItem;
        for(int i =0; i < parametrs.size();i++){
            if(isInSymbolTable(parametrs.get(i).getIdentifier())){
                System.out.println("Error with method parrameters: " + parametrs.get(i).getIdentifier());
            }
            addInstruction(new Instruction(InstructionTypeEnum.STO,getInstructionCountter(),0,i-parametrs.size()));
            tableItem = new TableItem(parametrs.get(i).getIdentifier(), 1,getAndIncreasePointer(),0);
            tableItem.setType(parametrs.get(i).getType());
            getSymbolTable().put(tableItem.getName(),tableItem);
            addInstruction(new Instruction(InstructionTypeEnum.STO,getInstructionCountter(),0,tableItem.getAddress()));
        }
    }

    private void addMethodtoSymbolTable(int methodSize,int baseMethodSize){
        TableItem tableItem = new TableItem(method.getIdentifier(),0,getInstructionCountter(),methodSize);
        tableItem.setMethod(true);
        tableItem.setMethodReturnType(method.getReturnType());
        tableItem.setMethodInputParametrList(method.getParameters());
        getSymbolTable().put(tableItem.getName(),tableItem);
        addInstruction(new Instruction(InstructionTypeEnum.INT,getInstructionCountter(),0,baseMethodSize));
    }
}
