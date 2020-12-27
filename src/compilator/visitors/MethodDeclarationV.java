package compilator.visitors;
import compilator.methods.Method;
import compilator.methods.MethodInputParametr;
import compilator.methods.MethodReturnTypeEnum;
import compilator.statements.BlockStatement;
import compilator.expressions.Expression;


import compilator.variable.VariableTypeEnum;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclarationV extends CeskaJavaBaseVisitor<Method>{
    private final String METHOD_SYMBOL = "()";

    @Override
    public Method visitMethodDeclaration(CeskaJavaParser.MethodDeclarationContext ctx)
    {
        MethodReturnTypeEnum returnType = MethodReturnTypeEnum.valueOf(ctx.methodReturnType().getText().toUpperCase());
        String identifier = ctx.identifier().getText() + this.METHOD_SYMBOL;
        List<MethodInputParametr> parameters = this.parseMethodParameters(ctx.methodParameter());
        BlockStatement body = ctx.methodBody().blockBody() != null ? new BlockBodyV().visit(ctx.methodBody().blockBody()) : null;
        Expression returnValue =  null;
        if (ctx.methodBody().expressionBody() != null)
        {
            returnValue = new ExpressionBodyV().visit(ctx.methodBody().expressionBody());
            returnValue.setExpectedReturnType(returnType == MethodReturnTypeEnum.INT ? VariableTypeEnum.INT : VariableTypeEnum.BOOLEAN);
        }
        return new Method(returnType, identifier, parameters, body, returnValue, ctx.start.getLine());
    }

    private List<MethodInputParametr> parseMethodParameters(List<CeskaJavaParser.MethodParameterContext> methodParameterContext)
    {
        List<MethodInputParametr> methodInputParametrs = new ArrayList<>();
        MethodInputParametr methodInputParametr;
        for (CeskaJavaParser.MethodParameterContext method : methodParameterContext)
        {
            VariableTypeEnum type = VariableTypeEnum.valueOf(method.possibleTypes().getText().toUpperCase());
            String identifier = method.identifier().getText();
            methodInputParametr = new MethodInputParametr(type,identifier);
            methodInputParametrs.add(methodInputParametr);
        }
        return methodInputParametrs;
    }

}
