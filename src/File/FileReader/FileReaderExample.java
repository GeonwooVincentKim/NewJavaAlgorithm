package File.FileReader;

import static java.lang.System.out;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fileReader = null;
        out.println(fileReader);

        try {
            fileReader = new FileReader("src/File/InputStream/InputStreamExample.java");

            int data = 0;
            while ((data = fileReader.read()) != -1) {
                out.print((char) data);
            }
        } catch (IOException e) {

        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("----------------------");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (Exception e) {
                out.println(e);
            }
        }
    }
}
