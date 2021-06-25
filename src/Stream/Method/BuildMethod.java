package Stream.Method;

import static java.lang.System.out;

import java.util.stream.Stream;

public class BuildMethod {
    public static void main(String[] args) {
        Stream<Object> stream = Stream.builder().add("무궁화").add("삼천리").add("화려강산").add("대한사람").build();
        out.println(stream.getClass());
    }
}
