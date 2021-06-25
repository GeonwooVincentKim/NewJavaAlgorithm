package Stream.Method;

import static java.lang.System.out;

import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1).limit(10);
        out.println(stream);

        stream.forEach(s -> out.println(s));
    }
}
