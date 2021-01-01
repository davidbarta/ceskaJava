package compilator.compilators;

import compilator.instructions.Instruction;
import compilator.methods.Method;
import compilator.methods.MethodPrototype;

import java.util.ArrayList;
import java.util.HashMap;

public class Compilator {
    protected static ArrayList<Instruction> instructions = new ArrayList<>();
    protected static HashMap<String,TableItem> symbolTable = new HashMap<>();
    private static int instructionCountter =0;
    private static int stackPointer = 3;
    private static HashMap<String, MethodPrototype> methodPrototype = new HashMap<>();

    public void addInstruction(Instruction instruction){
        instructions.add(instruction);
        instructionCountter++;
    }

    public static int getInstructionCountter() {
        return instructionCountter;
    }

    public static int getStackPointer() {
        return stackPointer;
    }

    public void increaceStackPointer(){
        stackPointer++;
    }

    public void setStackPointer(int address) {
       stackPointer = address;
    }

    public int getAndIncreasePointer(){
        int toReturn = stackPointer;
        increaceStackPointer();
        return toReturn;
    }

    public static ArrayList<Instruction> getInstructions() {
        return instructions;
    }

    public static HashMap<String, TableItem> getSymbolTable() {
        return symbolTable;
    }

    public void addToSymbolTable(TableItem tableItem){
        symbolTable.put(tableItem.getName(), tableItem);
    }

    public TableItem getTableItem(String name){
        return symbolTable.get(name);
    }

    public boolean isInSymbolTable(String name){
        return symbolTable.containsKey(name);
    }

    public HashMap<String, MethodPrototype> getMethodPrototypes()
    {
        return methodPrototype;
    }
}
