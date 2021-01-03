package compilator.compilators;

import compilator.methods.MethodInputParametr;
import compilator.methods.MethodReturnTypeEnum;
import compilator.variable.VariableTypeEnum;

import java.util.List;

public class TableItem {
    private VariableTypeEnum type = null;
    private boolean isMethod = false;
    private MethodReturnTypeEnum methodReturnType = null;
    private List<MethodInputParametr> methodInputParametrList = null;
    private String name;
    private int lvl;
    private int address;
    private int size;
    private boolean isVariable = false;
    private boolean isConstant = false;

    public TableItem(String name, int lvl, int address, int size){
        this.name=name;
        this.lvl = lvl;
        this.address = address;
        this.size = size;
    }

    public VariableTypeEnum getType() {
        return type;
    }

    public boolean isMethod() {
        return isMethod;
    }


    public MethodReturnTypeEnum getMethodReturnType() {
        return methodReturnType;
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public int getAddress() {
        return address;
    }

    public boolean isVariable() {
        return isVariable;
    }

    public boolean isConstant() {
        return isConstant;
    }

    public void setType(VariableTypeEnum type) {
        this.type = type;
    }

    public void setMethod(boolean method) {
        isMethod = method;
    }

    public void setMethodReturnType(MethodReturnTypeEnum methodReturnType) {
        this.methodReturnType = methodReturnType;
    }

    public void setMethodInputParametrList(List<MethodInputParametr> methodInputParametrList) {
        this.methodInputParametrList = methodInputParametrList;
    }

    public void setVariable(boolean variable) {
        isVariable = variable;
    }

    public void setConstant(boolean constant) {
        isConstant = constant;
    }
}
