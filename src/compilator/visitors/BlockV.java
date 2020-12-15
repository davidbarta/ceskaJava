package compilator.visitors;
import compilator.Block;
import compilator.statements.BlockStatement;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;


public class BlockV extends CeskaJavaBaseVisitor<Block>{

    public Block visitBlock(CeskaJavaParser.BlockContext ctx) {

        BlockStatement blockStatement = new BlockStatementVisitor().visit(ctx.blockStatement());

        return new Block(blockStatement);
    }
}
