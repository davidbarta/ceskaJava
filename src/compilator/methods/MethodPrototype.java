package compilator.methods;

import compilator.variable.VariableTypeEnum;

public class MethodPrototype {
    private String name;
    private MethodReturnTypeEnum returnType;
    private VariableTypeEnum variable;

    public MethodPrototype(String name, MethodReturnTypeEnum type){
        this.name = name;
        this.returnType = type;

        if (returnType == MethodReturnTypeEnum.BOOLEAN) {
            this.variable = VariableTypeEnum.BOOLEAN;
        }else if (returnType == MethodReturnTypeEnum.INT) {
            this.variable = VariableTypeEnum.INT;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MethodReturnTypeEnum getReturnType() {
        return returnType;
    }

    public void setReturnType(MethodReturnTypeEnum returnType) {
        this.returnType = returnType;
    }

    public VariableTypeEnum getVariable() {
        return variable;
    }

    public void setVariable(VariableTypeEnum variable) {
        this.variable = variable;
    }
    public VariableTypeEnum convertType(){
        if(returnType == MethodReturnTypeEnum.INT){
            return VariableTypeEnum.INT;
        } else if(returnType == MethodReturnTypeEnum.BOOLEAN) {
            return VariableTypeEnum.BOOLEAN;
        }
        else {
            return null;
        }
    }
}
