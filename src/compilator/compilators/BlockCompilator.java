package compilator.compilators;

import compilator.Block;
import compilator.methods.Method;
import compilator.methods.MethodPrototype;

import java.util.List;

public class BlockCompilator extends Compilator {

    private Block block;
    public BlockCompilator(Block block) {
        this.block = block;
    }
    public void run(){
        List<Method> methods = this.block.getBlockStatement().getMethods();
        for(Method method: methods){
            if(this.getMethodPrototypes().containsKey(method.getIdentifier())){
                System.out.println("Method with name "+ method.getIdentifier() + "already exits");
            }
            else {
                MethodPrototype mp = new MethodPrototype(method.getIdentifier(), method.getReturnType());
                this.getMethodPrototypes().put(mp.getName(), mp);
            }
        }

        new BlockStatementCompilator(this.block.getBlockStatement(),0).run();
    }
}
