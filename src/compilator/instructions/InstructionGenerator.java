package compilator.instructions;

import compilator.Program;

import java.util.List;

public class InstructionGenerator {

    private Program program;
    private List<Instruction> instructions;
    public InstructionGenerator(Program program){
        this.program = program;

    }
}
