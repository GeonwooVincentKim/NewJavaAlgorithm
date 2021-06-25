package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;

public class CollectionsStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        out.println(list);

        Stream<String> stream = list.stream();
        out.println(stream);

        stream.forEach(s -> out.println(s));
    }
}
