package Stream;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.stream.Stream;

public class GenerateStream {
    public static void main(String[] args) {
        String[] arr = new String[] { "a", "b", "c", "d", "e", "f" };
        out.println(arr.length);

        Stream<String> stream1 = Arrays.stream(arr);
        out.println(stream1);

        stream1.forEach(s -> out.print(s + " "));
        out.println();

        Stream<String> stream2 = Arrays.stream(arr, 2, 5);
        out.println(stream2);

        stream2.forEach(s -> out.print(s + " "));
    }
}
