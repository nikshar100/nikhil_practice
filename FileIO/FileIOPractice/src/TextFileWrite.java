import java.io.FileWriter;
import java.io.IOException;

public class BinaryFileRead {
    public static void main (String[] args) {

        try {
            FileWriter file = new FileWriter("Output.txt");
            file.write("Hello\n");
            file.write("Goodbye");
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }


    }
}
