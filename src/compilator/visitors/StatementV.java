package compilator.visitors;

import compilator.expressions.Expression;
import compilator.statements.*;
import compilator.variable.VariableTypeEnum;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

public class StatementV extends CeskaJavaBaseVisitor<Statement> {
    @Override
    public Statement visitStatementSwitch(CeskaJavaParser.StatementSwitchContext ctx) {

    }

    @Override
    public Statement visitStatementDo(CeskaJavaParser.StatementDoContext ctx) {
        Expression e  = new ExpressionV().visit(ctx.expression());
        BlockStatement bodyDo = null;
        if(ctx.body().blockBody() != null){
            bodyDo = new BlockBodyV().visit(ctx.body().blockBody());
        }
        return new DoWhileStatement(e,bodyDo,ctx.start.getLine());
    }

    @Override
    public Statement visitStatementWhile(CeskaJavaParser.StatementWhileContext ctx) {
        Expression e = new ExpressionV().visit(ctx.expression());
        BlockStatement bodyWhile = null;
        if(ctx.body().blockBody() != null){
            bodyWhile = new BlockBodyV().visit(ctx.body().blockBody());
        }
        return new WhileStatement(e,bodyWhile,ctx.start.getLine());
    }
    @Override
    public ForStatement visitStatementFor(CeskaJavaParser.StatementForContext ctx){
        ForHeader fh = new ForV().visit(ctx.forControl());
        BlockStatement bodyFor = null;
        if(ctx.body().blockBody() != null){
            bodyFor = new BlockBodyV().visit(ctx.body().blockBody());
        }
        ForStatement fr = new ForStatement(fh,bodyFor,ctx.start.getLine());
        return fr;
    }
    @Override
    public IfStatement visitStatementIf(CeskaJavaParser.StatementIfContext ctx){
        Expression ex = new ExpressionV().visit(ctx.expression());
        ex.setExpectedReturnType(VariableTypeEnum.BOOLEAN);
        BlockStatement statementIf = null;
        BlockStatement statementElse = null;
        if (ctx.body(0).blockBody() != null){
            statementIf = new BlockBodyV().visit(ctx.body(0).blockBody());
        }
        if (ctx.body(1)!= null){
            if (ctx.body(1).blockBody() != null){
                statementElse = new BlockBodyV().visit(ctx.body(1).blockBody());
            }
        }
        return new IfStatement(ex,statementIf,statementElse,ctx.start.getLine());
    }

}
