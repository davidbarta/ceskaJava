package compilator.visitors;

import compilator.expressions.Expression;
import compilator.methods.MethodReturnTypeEnum;
import compilator.methods.MethodRuns;
import compilator.statements.*;
import compilator.variable.Variable;
import compilator.variable.VariableTypeEnum;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

import java.util.HashMap;
import java.util.List;

public class StatementV extends CeskaJavaBaseVisitor<Statement> {

    @Override
    public Statement visitStatementVariableDeclaration(CeskaJavaParser.StatementVariableDeclarationContext ctx) {
        Variable variable = new VariableV().visit(ctx.variableDeclaration());
        variable.setLine(ctx.start.getLine());
        StatementDeclare ds = new  StatementDeclare(variable,ctx.start.getLine());
        return ds;
    }

    @Override
    public AssigmentStatement visitStatementAssigment(CeskaJavaParser.StatementAssigmentContext ctx) {
        String identifier = ctx.variableAssigment().identifier().getText();
        Expression ex = new ExpressionBodyV().visit(ctx.variableAssigment().expressionBody());
        AssigmentStatement as = new AssigmentStatement(ex,identifier,ctx.start.getLine());
        return as;

    }

    @Override
    public MethodRunsStatement visitStatementMethodCall(CeskaJavaParser.StatementMethodCallContext ctx) {
        MethodRuns method = new MethodRunsV().visit(ctx.methodCall());
        method.setExpectedReturnType(MethodReturnTypeEnum.VOID);
        return new MethodRunsStatement(method,ctx.start.getLine());
    }

    @Override
    public RepeatStatement visitStatementRepeat(CeskaJavaParser.StatementRepeatContext context){
        Expression ex = new ExpressionV().visit(context.expression());
        BlockStatement block = null;
        if(context.body().blockBody() != null) {
            block = new BlockBodyV().visit(context.body().blockBody());
        }

        RepeatStatement rs = new RepeatStatement(ex,block,context.start.getLine());
        return rs;

    }

    @Override
    public SwitchStatement visitStatementSwitch(CeskaJavaParser.StatementSwitchContext ctx) {
        List<CeskaJavaParser.SwitchBlockStatementContext> switchBlocks = ctx.switchBlockStatement();
        Expression ex = new ExpressionV().visit(ctx.expression());
        HashMap<Integer,SwitchBlockStatement> switchBlocksMap = new HashMap<>();
        SwitchBlockStatement defaultBlock = null;
        SwitchBlockStatement currentBlock = null;
        int identifier = 0;
        for(CeskaJavaParser.SwitchBlockStatementContext switchBlockStatementContext : switchBlocks){
            if(switchBlockStatementContext.CASE() != null){
                if(switchBlockStatementContext.body().blockBody() != null) {
                   identifier = Integer.parseInt(switchBlockStatementContext.DECIMAL().getText());
                   BlockStatement body = new BlockBodyV().visit(switchBlockStatementContext.body().blockBody());
                   currentBlock = new SwitchBlockStatement(body,switchBlockStatementContext.body().blockBody().start.getLine(),identifier,false);
                   switchBlocksMap.put(identifier,currentBlock);
                }
            }
            else{
                if(switchBlockStatementContext.body().blockBody() != null) {
                    BlockStatement body = new BlockBodyV().visit(switchBlockStatementContext.body().blockBody());
                    defaultBlock = new SwitchBlockStatement(body,switchBlockStatementContext.body().blockBody().start.getLine(),true);
                }
            }
        }
        return new SwitchStatement(ex,switchBlocksMap,defaultBlock,ctx.start.getLine());
    }

    @Override
    public DoWhileStatement visitStatementDo(CeskaJavaParser.StatementDoContext ctx) {
        Expression e  = new ExpressionV().visit(ctx.expression());
        BlockStatement bodyDo = null;
        if(ctx.body().blockBody() != null){
            bodyDo = new BlockBodyV().visit(ctx.body().blockBody());
        }
        return new DoWhileStatement(e,bodyDo,ctx.start.getLine());
    }

    @Override
    public WhileStatement visitStatementWhile(CeskaJavaParser.StatementWhileContext ctx) {
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
