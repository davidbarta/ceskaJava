package compilator.visitors;
import compilator.methods.Method;
import compilator.statements.BlockStatement;
import compilator.statements.Statement;
import compilator.statements.StatementData;

import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

import java.util.ArrayList;
import java.util.List;


public class BlockStatementV extends CeskaJavaBaseVisitor {
    public BlockStatement visitBlockStatement(CeskaJavaParser.BlockStatementContext bsc){
        List<Statement> statements = this.getAllStatements(bsc.statement());
        List<Method> methods = this.getAllMethods(bsc.methodDeclaration());
        return new BlockStatement(new StatementData(statements),methods);
    }

    private List<Method> getAllMethods(List<CeskaJavaParser.MethodDeclarationContext> methodDeclarationContextList){
        List<Method> m = new ArrayList<>();
        Method method;
        for(CeskaJavaParser.MethodDeclarationContext mdc :methodDeclarationContextList){
            method = new MethodDeclarationV().visit(mdc);
            m.add(method);
        }
        return m;
    }

    private List<Statement> getAllStatements(List<CeskaJavaParser.StatementContext> statementContextList){
        List<Statement> s = new ArrayList<>();
        Statement statement;
        for (CeskaJavaParser.StatementContext statementContext : statementContextList) {
            statement = new StatementV().visit(statementContext);
            s.add(statement);
        }
        return s;
    }











}
