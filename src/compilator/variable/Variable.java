package compilator.variable;

import java.util.ArrayList;
import java.util.List;

import compilator.Expression.Expression;
import compilator.methods.MethodRuns;
public class Variable {
    private String name;
    private Value value;
    private boolean isConstant;
    private Expression expression;
    private VariableTypeEnum type;
    private List<String> parallelArray;
    private MethodRuns methodRuns;
    private VariableTypeDeclarationEnum variableDeclaration;
    private boolean isDeclaredWithMinus = false;
    private int line;

    public Variable(String name, Value value, VariableTypeEnum type) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, MethodRuns methodRuns, VariableTypeEnum type) {
        this.name = name;
        this.methodRuns = methodRuns;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, Expression expression, VariableTypeEnum type){
        this.name = name;
        this.expression = expression;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, Value value, VariableTypeEnum type, boolean isConstant) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.isConstant = isConstant;
        this.parallelArray = new ArrayList<>();
    }

    public boolean existsParallel() {
        if (this.parallelArray.size() == 0) {
            return false;
        }

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public boolean isConstant() {
        return isConstant;
    }

    public void setConstant(boolean constant) {
        isConstant = constant;
    }

    public VariableTypeEnum getType() {
        return type;
    }

    public void setType(VariableTypeEnum type) {
        this.type = type;
    }

    public List<String> getParallelArray() {
        return parallelArray;
    }

    public void setParallelArray(List<String> parallelArray) {
        this.parallelArray = parallelArray;
    }


    public MethodRuns getMethodRuns() {
        return methodRuns;
    }

    public VariableTypeDeclarationEnum getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableTypeDeclarationEnum variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        Object a = value;
        if (variableDeclaration == VariableTypeDeclarationEnum.DECIMAL) {
            a = value.toInt();
        }
        return "Variable{" +
                "name='" + name + '\'' +
                ", value=" + a +
                ", isConstant=" + isConstant +
                ", type=" + type +
                '}';
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public boolean isDeclaredWithMinus() {
        return isDeclaredWithMinus;
    }

    public void setDeclaredWithMinus(boolean declaredWithMinus) {
        isDeclaredWithMinus = declaredWithMinus;
    }
}
