package compilator.instructions;

import compilator.Program;
import compilator.compilators.Compilator;
import compilator.compilators.ProgramCompilator;

import java.util.List;

public class InstructionGenerator {

    private final Program program;
    private final List<Instruction> instructions;
    public InstructionGenerator(Program program){
        this.program = program;
        this.instructions = generateInstructions();
    }



    private List<Instruction> generateInstructions() {
        ProgramCompilator pc = new ProgramCompilator(program);
        return pc.getInstructions();
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }
}
