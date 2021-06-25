package File.FileReader;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        out.println(fr);

        String filePath = "src/File/InputStream/InputStreamExample.java";

        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);

            String txt = null;

            while ((txt = br.readLine()) != null) {
                out.println(txt);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                br.close();
            } catch (Exception e) {
                out.println(e);
            }
        }
    }
}
