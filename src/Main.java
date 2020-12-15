import compilator.Compile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
    public static void main(String[] args) {
        String input = args[0];
        String output = args[1];

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(input);

        } catch (Exception e) {
            System.out.println("File not found " + input);
        }
        Compile.getInstance().run(inputStream, output);
    }

}