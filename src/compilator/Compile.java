package compilator;

import compilator.instructions.Instruction;
import compilator.instructions.InstructionGenerator;
import compilator.visitors.ProgramV;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import main.antlr4.CeskaJavaParser;
import main.antlr4.CeskaJavaLexer;
import java.io.PrintWriter;
import java.util.List;

public class Compile
{
    private static final Compile instance = new Compile();

    private Compile(){}

    public static Compile getInstance() {
        return instance;
    }
    public void run(CharStream input, String inputString, String output) {
        CeskaJavaLexer lexer = new CeskaJavaLexer(input);
        lexer.removeErrorListeners();
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CeskaJavaParser parser = new CeskaJavaParser(tokens);
        parser.setBuildParseTree(true);
        parser.removeErrorListeners();
        ParseTree parseTree = parser.program();

        Program program = null;
        try{
            program = new ProgramV().visit(parseTree);
        }
        catch (Exception e) {
            System.out.println("Something goes wrong while parsing tree. " + e.toString());
        }
        try {
            InstructionGenerator instructionGenerator = new InstructionGenerator(program);
            List<Instruction> instructions = instructionGenerator.getInstructions();
            this.writeInstructions(output, instructions);
        }
        catch (Exception e) {
            System.out.println("Something goes wrong while generating instructions. " + e.toString());
        }
    }

    private void writeInstructions(String outputFile, List<Instruction> instructions) {
        PrintWriter writer;
        try {
            writer = new PrintWriter(outputFile, "UTF-8");

            for (Instruction instruction: instructions) {
                writer.write(instruction.toString());
            }

            writer.close();
        }
        catch (Exception e) {
            System.out.println("Path to output file not exists!");
        }
    }
}