package Stream.Method;

import static java.lang.System.out;

import java.util.stream.Stream;

public class Generate {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(() -> "애국가");
        out.println(stream);

        stream.forEach(s -> out.println(s));
    }
}
