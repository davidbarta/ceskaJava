package compilator.visitors;
import compilator.methods.Method;
import compilator.methods.MethodInputParametr;
import compilator.methods.MethodReturnTypeEnum;
import compilator.statements.BlockStatement;
import compilator.expressions.Expression;


import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclarationV extends CeskaJavaBaseVisitor{
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
            returnValue = new ExpressionBodyVisitor().visit(ctx.methodBody().expressionBody());
            returnValue.setExpectedReturnType(returnType == EMethodReturnType.INT ? EVariableType.INT : EVariableType.BOOLEAN);
        }

        return new Method(returnType, identifier, parameters, body, returnValue, ctx.start.getLine());
    }

    /**
     * Processes method parameters
     * @param methodParameterContext list of parameters context
     * @return
     */
    private List<MethodInputParametr> parseMethodParameters(List<CeskaJavaParser.MethodParameterContext> methodParameterContext)
    {
        List<MethodDeclarationParameter> methodDeclarationParameters = new ArrayList<>();
        MethodDeclarationParameter methodDeclarationParameter;

        for (SimpleJavaParser.MethodParameterContext method : methodParameterContext)
        {
            EVariableType type = EVariableType.valueOf(method.possibleTypes().getText().toUpperCase());

            String identifier = method.identifier().getText();

            methodDeclarationParameter = new MethodDeclarationParameter(type,identifier);

            methodDeclarationParameters.add(methodDeclarationParameter);
        }

        return methodDeclarationParameters;
    }

}
