import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");

        if(args.length != 2){
            System.out.println("Invalid output");
            System.out.println("Use: Java -jar ceskaJava-with-dependencies.jar <sourceCode file> <output file>");
        }
        else{
            String inputString = args[0];
            String outputString = args[1];
            CharStream stream = null;
            try {
                stream = CharStreams.fromFileName(inputString);
            } catch (IOException e) {
                System.out.println("Wrong input file");
            }
            compile(stream);
        }
        System.out.println("Program finished");
    }

    private static void compile(CharStream stream) {

    }
}