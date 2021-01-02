package compilator.compilators;

import compilator.expressions.Expression;
import compilator.expressions.ExpressionMethodCall;
import compilator.expressions.ExpressionTypeEnum;
import compilator.instructions.Instruction;
import compilator.instructions.InstructionOperationEnum;
import compilator.instructions.InstructionTypeEnum;
import compilator.methods.Method;
import compilator.methods.MethodReturnTypeEnum;
import compilator.methods.MethodRuns;
import compilator.statements.*;
import compilator.variable.Variable;
import compilator.variable.VariableTypeEnum;

import java.util.ArrayList;
import java.util.Map;

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

    public void delLocalVariablesMethod() {
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

    private void genSwitch(SwitchStatement statement) {
        ArrayList<Integer> switchIndexes = new ArrayList<>();
        int key;
        int startIndex;
        int endIndex;
        SwitchBlockStatement body;
        BlockStatementCompilator blockBody;

        for(Map.Entry<Integer, SwitchBlockStatement> block: statement.getSwitchBlocks().entrySet()){
            key = block.getKey();
            body = block.getValue();
            new ExpressionCompilator(statement.getExpression(),VariableTypeEnum.INT,lvl).run();
            addInstruction(new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0,key));
            addInstruction(new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0,InstructionOperationEnum.EQ.getCode()));
            startIndex = getInstructionCountter();
            addInstruction(new Instruction(InstructionTypeEnum.JMC,getInstructionCountter(),0,-1));
            blockBody = new BlockStatementCompilator(body.getBody(),lvl);
            blockBody.setInnerBodySettings();
            blockBody.run();
            endIndex = getInstructionCountter();
            switchIndexes.add(endIndex);
            addInstruction(new Instruction(InstructionTypeEnum.JMP,getInstructionCountter(),0,-1));
            getInstructions().get(startIndex).setAddress(getInstructionCountter());
        }
        if(statement.getDefaultBlock() != null){
            blockBody = new BlockStatementCompilator(statement.getDefaultBlock().getBody(),lvl);
            blockBody.setInnerBodySettings();
            blockBody.run();
        }
        int currentInstructions = getInstructionCountter();
        for(int i : switchIndexes){
            getInstructions().get(i).setAddress(currentInstructions);
        }
    }

    private void genRepeatUntil(RepeatStatement statement) {
        int startIndex = getInstructionCountter();
        BlockStatementCompilator blockBody = new BlockStatementCompilator(statement.getBody(),lvl);
        blockBody.setInnerBodySettings();
        blockBody.run();
        new ExpressionCompilator(statement.getExpression(), VariableTypeEnum.BOOLEAN,lvl).run();
        addInstruction(new Instruction(InstructionTypeEnum.JMC,getInstructionCountter(),0,startIndex));
    }

    private void genMethodsRuns(MethodRunsStatement statement) {
        new MethodRunsCompilator(statement.getMethod(),lvl).run();
    }

    private void genDoWhileInst(DoWhileStatement statement) {
        int startIndex = getInstructionCountter();
        BlockStatementCompilator blockBody = new BlockStatementCompilator(statement.getBody(),lvl);
        blockBody.setInnerBodySettings();
        blockBody.run();
        new ExpressionCompilator(statement.getExpression(),VariableTypeEnum.BOOLEAN,lvl).run();
        int endIndex = getInstructionCountter();
        addInstruction(new Instruction(InstructionTypeEnum.JMC,getInstructionCountter(),0,-1));
        addInstruction(new Instruction(InstructionTypeEnum.JMP,getInstructionCountter(),0,startIndex));
        getInstructions().get(endIndex).setAddress(getInstructionCountter());
    }

    private void genWhileInst(WhileStatement statement) {
        int startIndex = getInstructionCountter();
        new ExpressionCompilator(statement.getExpression(),VariableTypeEnum.BOOLEAN,lvl).run();
        int endIndex = getInstructionCountter();
        addInstruction(new Instruction(InstructionTypeEnum.JMC,getInstructionCountter(),0,-1));
        BlockStatementCompilator blockStatement = new BlockStatementCompilator(statement.getBody(),lvl);
        blockStatement.setInnerBodySettings();
        blockStatement.run();
        addInstruction(new Instruction(InstructionTypeEnum.JMP,getInstructionCountter(),0,startIndex));
        getInstructions().get(endIndex).setAddress(endIndex);
    }

    private void genForInst(ForStatement statement) {
        if(isInSymbolTable(statement.getForHeader().getIden())){
            System.out.println("Statement with name " + statement.getForHeader().getIden() + "is not in table");
            return;
        }
        new ExpressionCompilator(statement.getForHeader().getFrom(),VariableTypeEnum.INT,lvl).run();
        TableItem tableItem = new TableItem(statement.getForHeader().getIden(),lvl,getAndIncreasePointer(),0);
        tableItem.setVariable(true);
        tableItem.setType(VariableTypeEnum.INT);
        getSymbolTable().put(tableItem.getName(),tableItem);


        Instruction i = new Instruction(InstructionTypeEnum.STO,getInstructionCountter(),0,tableItem.getAddress());
        addInstruction(i);
        int startIndex= getInstructionCountter();
        i = new Instruction(InstructionTypeEnum.LOD,getInstructionCountter(),0,tableItem.getAddress());
        addInstruction(i);

        new ExpressionCompilator(statement.getForHeader().getTo(),VariableTypeEnum.INT,lvl).run();

        i = new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0,InstructionOperationEnum.LESS_EQ.getCode());
        addInstruction(i);
        int endIdx = getInstructionCountter();
        i= new Instruction(InstructionTypeEnum.JMC,getInstructionCountter(),0,-1);
        addInstruction(i);

        BlockStatementCompilator blockBody = new BlockStatementCompilator(statement.getBody(),lvl);
        blockBody.setInnerBodySettings();
        blockBody.run();

        i = new Instruction(InstructionTypeEnum.LOD,getInstructionCountter(),0,tableItem.getAddress());
        addInstruction(i);
        i = new Instruction(InstructionTypeEnum.LIT,getInstructionCountter(),0,1);
        addInstruction(i);
        i = new Instruction(InstructionTypeEnum.OPR,getInstructionCountter(),0,InstructionOperationEnum.PLUS.getCode());
        addInstruction(i);
        i = new Instruction(InstructionTypeEnum.STO,getInstructionCountter(),0,tableItem.getAddress());
        addInstruction(i);
        i = new Instruction(InstructionTypeEnum.JMP,getInstructionCountter(),0,startIndex);
        addInstruction(i);
        getInstructions().get(endIdx).setAddress(getInstructionCountter());
                //TODO Kamča at 11:21
    }

    private void genIfInstructions(IfStatement statement) {
        new ExpressionCompilator(statement.getExpression(),VariableTypeEnum.BOOLEAN,lvl).run();
        int elsePosition = getInstructionCountter();
        Instruction i = new Instruction(InstructionTypeEnum.JMC, getInstructionCountter(),0,-1);
        addInstruction(i);
        BlockStatementCompilator blockStatementCompilator = new BlockStatementCompilator(statement.getBodyIf(),lvl);
        blockStatementCompilator.setInnerBodySettings();
        blockStatementCompilator.run();
        int ifPosition = getInstructionCountter();
        if(statement.hasElse()){
            i = new Instruction(InstructionTypeEnum.JMC, getInstructionCountter(),0,-1);
            addInstruction(i);
        }
        getInstructions().get(elsePosition).setAddress(getInstructionCountter());
        if(statement.hasElse()){
            BlockStatementCompilator blockStatement = new BlockStatementCompilator(statement.getBodyElse(),lvl);
            blockStatement.setInnerBodySettings();
            blockStatement.run();
            getInstructions().get(ifPosition).setAddress(getInstructionCountter());
        }

    }

    public void setInnerBodySettings() {
        this.setGenerateMethods(false);
        this.setIncreaseStack(false);
        this.setGenReturnVar(false);
        this.setDelLocalVariables(true);
        this.setCreateLocalSpaceForVar(true);
    }

    private void generateAssigmentInstruction(AssigmentStatement statement) {
        if(isInSymbolTable(statement.getIdentfier())){
            TableItem tableItem = getSymbolTable().get(statement.getIdentfier());
            if(tableItem.isConstant()){
                System.out.println("Variable " + statement.getIdentfier() + "is constant");
                return;
            }
            if(statement.getExpression().getType() == ExpressionTypeEnum.METHOD_CALL){
                ExpressionMethodCall expressionMethodCall = (ExpressionMethodCall) statement.getExpression();
                MethodReturnTypeEnum methodType = tableItem.getType() == VariableTypeEnum.INT ? MethodReturnTypeEnum.INT:MethodReturnTypeEnum.BOOLEAN;
                expressionMethodCall.getMethodRuns().setExpectedReturnType(methodType);
                new ExpressionCompilator(expressionMethodCall,tableItem.getType(),lvl).run();
            }
            else{
                statement.getExpression().setExpectedReturnType(tableItem.getType());
                new ExpressionCompilator(statement.getExpression(),tableItem.getType(),lvl).run();
            }
            Instruction i = new Instruction(InstructionTypeEnum.STO,getInstructionCountter(),lvl-tableItem.getLvl(),tableItem.getAddress());
            addInstruction(i);
        }
        else {
            System.out.println("statement have no more space" + statement.getIdentfier());
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

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }

    public void setBlockStatement(BlockStatement blockStatement) {
        this.blockStatement = blockStatement;
    }

    public StatementData getStatementData() {
        return statementData;
    }

    public void setStatementData(StatementData statementData) {
        this.statementData = statementData;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public boolean isGenerateMethods() {
        return generateMethods;
    }

    public void setGenerateMethods(boolean generateMethods) {
        this.generateMethods = generateMethods;
    }

    public boolean isIncreaseStack() {
        return increaseStack;
    }

    public void setIncreaseStack(boolean increaseStack) {
        this.increaseStack = increaseStack;
    }

    public boolean isGenReturnVar() {
        return genReturnVar;
    }

    public void setGenReturnVar(boolean genReturnVar) {
        this.genReturnVar = genReturnVar;
    }

    public boolean isDelLocalVariables() {
        return delLocalVariables;
    }

    public void setDelLocalVariables(boolean delLocalVariables) {
        this.delLocalVariables = delLocalVariables;
    }

    public boolean isCreateLocalSpaceForVar() {
        return createLocalSpaceForVar;
    }

    public void setCreateLocalSpaceForVar(boolean createLocalSpaceForVar) {
        this.createLocalSpaceForVar = createLocalSpaceForVar;
    }
}
