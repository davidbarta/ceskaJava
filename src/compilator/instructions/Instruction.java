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
        return this.row +"\t"+this.type +"\t" + this.lvl + "\t" + this.address +"\n";
    }

    public MethodRuns getMethodRuns() {
        return methodRuns;
    }

    public boolean isLaterInit() {
        return laterInit;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public InstructionTypeEnum getType() {
        return type;
    }
}
