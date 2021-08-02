package Stream.FileStream;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamTest {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("src/Stream/Method/BuildMethod.java");
            out.println(path);

            Stream<String> stream = Files.lines(path, Charset.defaultCharset());
            stream.forEach(s -> out.println(s));
            stream.close();

            out.println();

            File file = path.toFile();
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // out.println(bufferedReader);

            bufferedReader.lines().forEach(s -> out.println(s));
            bufferedReader.close();
            stream.close();
        } catch (NoSuchFileException e) {
            out.println("파일 이름 또는 디렉터리를 다시 입력해주세요");
            out.println("---------------");
            out.println(e.getStackTrace());
        } catch (Exception e) {
            // e.printStackTrace();
            out.println(e.getMessage());
        }
    }
}
