package compilator.visitors;
import compilator.statements.BlockStatement;
import compilator.statements.Statement;
import compilator.statements.StatementData;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

import java.util.ArrayList;
import java.util.List;

public class BlockBodyV extends CeskaJavaBaseVisitor<BlockStatement>{
    @Override
    public BlockStatement visitBlockBody(CeskaJavaParser.BlockBodyContext ctx) {
        List<Statement> s = this.getAllStatements(ctx.statement());
        return new BlockStatement(new StatementData(s),null);
    }
    private List<Statement> getAllStatements(List<CeskaJavaParser.StatementContext> statementContextList){
        List<Statement> statements = new ArrayList<>();
        Statement s;
        for (CeskaJavaParser.StatementContext statementContext : statementContextList){
            s = new StatementV().visit(statementContext);
            statements.add(s);
        }
        return statements;
    }
}
