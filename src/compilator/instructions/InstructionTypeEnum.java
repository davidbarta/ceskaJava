package compilator.instructions;

public enum InstructionTypeEnum {
    LIT("LIT"),
    OPR("OPR"),
    LOD("LOD"),
    STO("STO"),
    CAL("CAL"),
    INT("INT"),
    JMP("JMP"),
    JMC("JMC"),
    RET("RET");

    private String value;

    InstructionTypeEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
