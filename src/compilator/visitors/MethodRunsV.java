package compilator.visitors;

import compilator.expressions.Expression;
import compilator.methods.MethodInputParametr;
import compilator.methods.MethodParameter;
import compilator.methods.MethodRuns;
import main.antlr4.CeskaJavaBaseVisitor;
import main.antlr4.CeskaJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodRunsV extends CeskaJavaBaseVisitor<MethodRuns> {
    private final String METDOD_INTRO = "()";

    @Override
    public MethodRuns visitMethodCall(CeskaJavaParser.MethodCallContext ctx) {
        String iden = ctx.identifier().getText() + this.METDOD_INTRO;
        List<MethodParameter> methodInputParametrList = this.parseMethodCallParameters(ctx.methodCallParameter());

        return new MethodRuns(iden,methodInputParametrList,ctx.start.getLine());
    }

    private List<MethodParameter> parseMethodCallParameters(List<CeskaJavaParser.MethodCallParameterContext> methodCallParameter) {
        List<MethodParameter> returnMP = new ArrayList<>();
        MethodParameter mp;
        for(CeskaJavaParser.MethodCallParameterContext parameterContext: methodCallParameter){
            Expression e = new ExpressionBodyV().visit(parameterContext.expressionBody());
            mp = new MethodParameter(e);
            returnMP.add(mp);
        }
        return returnMP;
    }
}
