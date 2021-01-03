import compilator.Compile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
    public static void main(String[] args) {
        String path = args[0];
        String file = args[1];

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(path);

        } catch (Exception e) {
            System.out.println("File not found " + (path));
        }
        Compile.getInstance().run(inputStream,path, file);
    }

}