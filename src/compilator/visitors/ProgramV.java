package compilator.visitors;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;
import compilator.Program;
public class ProgramV extends CeskaJavaBaseVisitor<Program>{
    @Override
    public Program visitProgram(CeskaJavaParser.ProgramContext ctx)
    {
        return new Program(new BlockV().visit(ctx.block()));
    }
}
