package Stream.StreamVariousType.FileAttribute;

import java.util.Scanner;

public interface Files {
    Scanner readFile(String fileName);

    void writeFile(String fileName, String result);
}
