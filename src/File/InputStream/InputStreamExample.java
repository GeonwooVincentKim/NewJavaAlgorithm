package File.InputStream;

import static java.lang.System.out;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        try {
            InputStream in = System.in;

            int data = 0;
            while ((data = in.read()) != -1) {
                out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
