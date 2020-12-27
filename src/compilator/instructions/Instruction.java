package compilator.instructions;

import compilator.methods.MethodRuns;

public class Instruction {
    private InstructionTypeEnum type;
    private int row;
    private int lvl;
    private int address;
    private boolean laterInit;
    private MethodRuns methodRuns;
    private boolean updateMetdodRuns;
    public Instruction(InstructionTypeEnum type, int row, int lvl, int address){
        this.type = type;
        this.row = row;
        this.lvl = lvl;
        this.address = address;
        this.laterInit = false;
        this.methodRuns =null;
        this.updateMetdodRuns = false;
    }

    public Instruction(InstructionTypeEnum type, int row, int lvl, MethodRuns mr){
        this.type = type;
        this.row = row;
        this.lvl = lvl;
        this.address = -1;
        this.laterInit = true;
        this.methodRuns =mr;
        this.updateMetdodRuns = false;
    }

    @Override
    public String toString(){
        return this.type +"\t" + this.lvl + "\t" + this.address +"\n";
    }

    public MethodRuns getMethodRuns() {
        return methodRuns;
    }

    public int getAddress() {
        return address;
    }

    public boolean isLaterInit() {
        return laterInit;
    }

    public boolean isUpdateMetdodRuns() {
        return updateMetdodRuns;
    }

    public void setUpdateMetdodRuns(boolean updateMetdodRuns) {
        this.updateMetdodRuns = updateMetdodRuns;
    }

    public int getLvl() {
        return lvl;
    }

    public int getRow() {
        return row;
    }

    public InstructionTypeEnum getType() {
        return type;
    }
}
