package compilator.compilators;

import compilator.Program;
import compilator.instructions.Instruction;
import compilator.instructions.InstructionTypeEnum;

public class ProgramCompilator extends Compilator{
    private Program program;

    public ProgramCompilator(Program program){
        this.program = program;
        run();
    }

    private void run() {
        Instruction startInstruction = new Instruction(InstructionTypeEnum.JMP, getInstructionCountter(),0,1);
        this.addInstruction(startInstruction);

        new BlockCompilator(program.getBlock()).run();
    }
}
