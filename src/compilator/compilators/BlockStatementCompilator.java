package compilator.compilators;

import compilator.instructions.Instruction;
import compilator.instructions.InstructionOperationEnum;
import compilator.instructions.InstructionTypeEnum;
import compilator.methods.Method;
import compilator.methods.MethodRuns;
import compilator.statements.*;
import compilator.variable.Variable;
import compilator.variable.VariableTypeEnum;

public class BlockStatementCompilator extends Compilator{
    private BlockStatement blockStatement;
    private StatementData statementData;
    private int lvl;
    private boolean generateMethods = true;
    private boolean increaseStack = true;
    private boolean genReturnVar = true;
    public boolean delLocalVariables = false;
    private boolean createLocalSpaceForVar = false;


    public BlockStatementCompilator(BlockStatement blockStatement, int i) {
        this.blockStatement = blockStatement;
        this.lvl = i;

        if(blockStatement != null){
            statementData = blockStatement.getStatementData();
        }
    }

    public void run(){
        if(this.blockStatement == null){
            return;
        }
        increaseStackMethod();
        generateStatementInstructionsMethod();
        if(genReturnVar){
            Instruction i = new Instruction(InstructionTypeEnum.RET,getInstructionCountter(),0,0);
            addInstruction(i);
        }

        if(generateMethods){
            generateMethodInstructionsMethod();
            initMethodsInInstructions();
        }
        if(delLocalVariables){
            delLocalVariablesMethod();
        }

    }

    private void delLocalVariablesMethod() {
        if(statementData != null){
            for(String name : statementData.getVariableNames()){
                getSymbolTable().remove(name);
            }
            if(createLocalSpaceForVar && statementData.getVariableDeclarationCount() != 0){
                Instruction i = new Instruction(InstructionTypeEnum.INT,getInstructionCountter(),0,-statementData.getVariableDeclarationCount());
            }
        }
    }

    private void generateMethodInstructionsMethod(){
        for(Method m:blockStatement.getMethods()){
            new MethodCompilator(m).run();
        }
    }

    private void initMethodsInInstructions() {
        for(Instruction instruction : getInstructions()){
            if(instruction.isLaterInit()){
                MethodRuns methodRuns = instruction.getMethodRuns();
                if(isInSymbolTable(methodRuns.getIdentifier())){
                    TableItem tableItem = getSymbolTable().get(methodRuns.getIdentifier());
                    instruction.setAddress(tableItem.getAddress());

                }
            }


        }
        //System.out.println("vulmihoukolen ");
        //TODO Kamča
    }

    private void generateStatementInstructionsMethod() {
        for(Statement statement:statementData.getStatements()){
            switch (statement.getType()){
                case DECLARATION:
                    generateDecInstructions((DeclareStatement)statement);
                    break;
                case ASSIGMENT:
                    generateAssigmentInstruction((AssigmentStatement) statement);
                    break;
                case IF:
                    genIfInstructions((IfStatement) statement);
                    break;
                case FOR:
                    genForInst((ForStatement) statement);
                    break;
                case WHILE:
                    genWhileInst((WhileStatement) statement);
                    break;
                case DO_WHILE:
                    genDoWhileInst((DoWhileStatement) statement);
                    break;
                case METHOD_CALL:
                    genMethodsRuns((MethodRunsStatement)statement);
                    break;
                case REPEAT_UNTIL:
                    genRepeatUntil((RepeatStatement) statement);
                    break;
                case SWITCH:
                    genSwitch((SwitchStatement) statement);
            }
        }
    }

    private void generateAssigmentInstruction(AssigmentStatement statement) {
        if(isInSymbolTable(statement.getIdentfier())){


        }
        else {
            System.out.println("statement have no more space" + statement.getIdentfier());
            return;
        }
    }

    private void varIntInstructions(Variable var){

        switch(var.getVariableDeclaration()){
            case DECIMAL:
                Instruction i = new Instruction(InstructionTypeEnum.LIT, getInstructionCountter(),0,var.getValue().toInt());
                addInstruction(i);
                break;
            case METHOD_CALL:
                new MethodRunsCompilator(var.getMethodRuns(),lvl).run();
                break;
            case IDENTIFIER:
                varAssigmentIdentifier(var);
                break;
            case EXPRESSION:
                new ExpressionCompilator(var.getExpression(), VariableTypeEnum.INT,lvl).run();
                break;
            default:
                System.out.println("Error with variable" + var.getName() + "at line" + var.getLine());
        }
    }

    private void varAssigmentIdentifier(Variable var) {
        if(!isInSymbolTable(var.getValue().toString())){
            System.out.println("Assigment variable not exists at "+ var.getName() + "line" + var.getLine());
            return;
        }
        TableItem tableItem = getSymbolTable().get(var.getValue().toString());
        if(var.getType() != tableItem.getType()){
            System.out.println("Assigment variable not exists at "+ var.getName() + "line" + var.getLine());
            return;
        }
        Instruction i = new Instruction(InstructionTypeEnum.LOD, getInstructionCountter(),lvl,tableItem.getAddress());
        addInstruction(i);
    }

    private void generateDecInstructions(DeclareStatement statement) {
        Variable var = statement.getVariable();
        if(isInSymbolTable(var.getName())){
            System.out.println("Variable exists" + var.getName() +"+"+var.getLine());
        }
        else {
            switch (var.getType()) {
                case INT:
                    varIntInstructions(var);
                case BOOLEAN:
                    varBoolInstructions(var);
            }
            TableItem tableItem  = addVariabletoItem(var);

            if(var.existsParallel()){
                for(String name: var.getParallelArray()){
                    Instruction i = new Instruction(InstructionTypeEnum.LOD,getInstructionCountter(),lvl-tableItem.getLvl(),tableItem.getAddress());
                    addInstruction(i);
                    addParralelVariabletoItem(name,var);

                }
            }
        }
    }

    private void varBoolInstructions(Variable var) {
        switch (var.getVariableDeclaration()){
            case BOOLEAN:
                Instruction i = new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0,var.getValue().toBooleanAsInt());
                addInstruction(i);
            case METHOD_CALL:
                new MethodRunsCompilator(var.getMethodRuns(),lvl).run();
                break;
            case IDENTIFIER:
                varAssigmentIdentifier(var);
                break;
            case EXPRESSION:
                new ExpressionCompilator(var.getExpression(), VariableTypeEnum.INT,lvl).run();
                break;
            default:
                System.out.println("Error with variable" + var.getName() + "at line" + var.getLine());
        }
    }

    private TableItem addParralelVariabletoItem(String name, Variable var) {
        TableItem tableItem = new TableItem(name, lvl,getAndIncreasePointer(),0);
        tableItem.setVariable(true);
        tableItem.setConstant(var.isConstant());
        tableItem.setType(var.getType());
        getSymbolTable().put(tableItem.getName(),tableItem);
        Instruction i;
        if(var.isDeclaredWithMinus()){
            i = new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0,-1);
            addInstruction(i);
            i= new Instruction(InstructionTypeEnum.OPR, getInstructionCountter(),0, InstructionOperationEnum.MULTIPLY.getCode());
            addInstruction(i);

        }
        i = new Instruction(InstructionTypeEnum.STO,getInstructionCountter(),0,tableItem.getAddress());
        addInstruction(i);
        return tableItem;
    }

    private TableItem addVariabletoItem(Variable var) {
        TableItem tableItem = new TableItem(var.getName(), lvl,getAndIncreasePointer(),0);
        tableItem.setVariable(true);
        tableItem.setConstant(var.isConstant());
        tableItem.setType(var.getType());
        getSymbolTable().put(tableItem.getName(),tableItem);
        Instruction i;
        if(var.isDeclaredWithMinus()){
            i = new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0,-1);
            addInstruction(i);
            i= new Instruction(InstructionTypeEnum.OPR, getInstructionCountter(),0, InstructionOperationEnum.MULTIPLY.getCode());
            addInstruction(i);

        }
        i = new Instruction(InstructionTypeEnum.STO,getInstructionCountter(),0,tableItem.getAddress());
        addInstruction(i);
        return tableItem;
    }

    private void increaseStackMethod() {
        if(increaseStack){
            Instruction i = new Instruction(InstructionTypeEnum.INT,getInstructionCountter(),0,3+statementData.getVariableDeclarationCount()+statementData.getForStatementCount());
            addInstruction(i);
        }
        if(createLocalSpaceForVar && statementData.getVariableDeclarationCount() !=0){
            Instruction i = new Instruction(InstructionTypeEnum.INT,getInstructionCountter(), 0,statementData.getVariableDeclarationCount());
        }
    }
}
