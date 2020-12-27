package compilator.visitors;

import compilator.expressions.Expression;
import compilator.methods.MethodReturnTypeEnum;
import compilator.methods.MethodRuns;
import compilator.variable.Value;
import compilator.variable.Variable;
import compilator.variable.VariableTypeDeclarationEnum;
import compilator.variable.VariableTypeEnum;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

import java.util.ArrayList;
import java.util.List;

public class VariableV extends CeskaJavaBaseVisitor<Variable> {

    @Override
    public Variable visitVariableDeclaration(CeskaJavaParser.VariableDeclarationContext ctx) {
        Variable var = null;

        if(ctx.localVariableDeclaration().decimalVariable() != null){
            var = createDecimalVariable(ctx.localVariableDeclaration().decimalVariable());

        }
        else if(ctx.localVariableDeclaration().boolVariable() != null){
            var = createBoolVariable(ctx.localVariableDeclaration().boolVariable());
        }

        if(ctx.constVariableDeclaration() != null && var != null){
            var.setConstant(true);
        }
        return var;
    }

    private Variable createBoolVariable(CeskaJavaParser.BoolVariableContext boolVariable) {
        Variable var = null;
        String name = boolVariable.identifier().getText();
        // boolean isTrue = true;
        if (boolVariable.boolValue().booleanValue() != null) {
            boolean val = Boolean.parseBoolean(boolVariable.boolValue().booleanValue().getText());

            var = new Variable(name, new Value(val), VariableTypeEnum.BOOLEAN);
            var.setVariableDeclaration(VariableTypeDeclarationEnum.BOOLEAN);
        }
        //boolean ifFalse = isTrue;
        else if (boolVariable.boolValue().identifier() != null) {
            String val = boolVariable.boolValue().identifier().getText();

            var = new Variable(name, new Value(val), VariableTypeEnum.BOOLEAN);
            var.setVariableDeclaration(VariableTypeDeclarationEnum.IDENTIFIER);
        }
        //boolean reult = isTrue && isFalse;
        else if (boolVariable.boolValue().expressionBody() != null){
            Expression ex = new ExpressionBodyV().visit(boolVariable.boolValue().expressionBody());

            var = new Variable(name,ex,VariableTypeEnum.BOOLEAN);
            var.setVariableDeclaration(VariableTypeDeclarationEnum.EXPRESSION);
        }
        //boolean methodRes = method(true)
        else if(boolVariable.boolValue().methodCall() != null){
            MethodRuns mr = new MethodRunsV().visit(boolVariable.boolValue().methodCall());
            mr.setExpectedReturnType(MethodReturnTypeEnum.BOOLEAN);

            var = new Variable(name,mr,VariableTypeEnum.BOOLEAN);
            var.setVariableDeclaration(VariableTypeDeclarationEnum.METHOD_CALL);
        }

        if(boolVariable.paralelDeclaration() != null){
            if(var != null){
                var.setParallelArray(getParallelDeclaration(boolVariable.paralelDeclaration()));
            }
        }
        return var;
    }

    private Variable createDecimalVariable(CeskaJavaParser.DecimalVariableContext decimalVariable) {
        Variable var = null;
        String name = decimalVariable.identifier().getText();
        //int i= 0
        if(decimalVariable.decimalValue().DECIMAL() != null){
            String val = decimalVariable.decimalValue().getText();

            var = new Variable(name,new Value(val), VariableTypeEnum.INT);
            var.setVariableDeclaration(VariableTypeDeclarationEnum.DECIMAL);
            var.setDeclaredWithMinus(this.isMinus(decimalVariable));
        }
        //int i = method(int a);
        else if(decimalVariable.decimalValue().methodCall() != null){
            MethodRuns mr = new MethodRunsV().visit(decimalVariable.decimalValue().methodCall());
            mr.setExpectedReturnType(MethodReturnTypeEnum.INT);

            var = new Variable(name,mr,VariableTypeEnum.INT);
            var.setVariableDeclaration(VariableTypeDeclarationEnum.METHOD_CALL);
            var.setDeclaredWithMinus(this.isMinus(decimalVariable));
        }
        //int i = j;
        else if(decimalVariable.decimalValue().identifier() != null){
            String val = decimalVariable.decimalValue().identifier().getText();

            var = new Variable(name,new Value(val), VariableTypeEnum.INT);
            var.setVariableDeclaration(VariableTypeDeclarationEnum.IDENTIFIER);
            var.setDeclaredWithMinus(this.isMinus(decimalVariable));
        }
        //int i =1+2
        else if(decimalVariable.decimalValue().expressionBody() != null){
            Expression ex = new ExpressionBodyV().visit(decimalVariable.decimalValue().expressionBody());

            var = new Variable(name,ex,VariableTypeEnum.INT);
            var.setVariableDeclaration(VariableTypeDeclarationEnum.EXPRESSION);
            var.setDeclaredWithMinus(this.isMinus(decimalVariable));
        }
        
        if(decimalVariable.paralelDeclaration() != null){
            if(var != null){
                var.setParallelArray(getParallelDeclaration(decimalVariable.paralelDeclaration()));
            }
        }
        return var;
    }

    private List<String> getParallelDeclaration(List<CeskaJavaParser.ParalelDeclarationContext> paralelDeclaration) {
        List<String> declarations = new ArrayList<>();
        for (CeskaJavaParser.ParalelDeclarationContext paralelDeclarationContext : paralelDeclaration) {
            declarations.add(paralelDeclarationContext.identifier().getText());
        }
        return declarations;
    }

    private boolean isMinus(CeskaJavaParser.DecimalVariableContext variableContext){
        return variableContext.decimalSymbol() != null && variableContext.decimalSymbol().getText().equals("-");
    }

}
