import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFile {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("Reader.java");
            BufferedReader buff = new BufferedReader(file);
            boolean eof = false;
            while (!eof) {
                String line = buff.readLine();
                if (line == null) {
                    eof = true;
                }
                else {
                    System.out.println(line);
                }
            }
            buff.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
