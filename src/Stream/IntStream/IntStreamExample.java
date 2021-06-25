package Stream.IntStream;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        out.println(arr);

        out.println("----------------------------");
        out.println("Arrays.stream() IntStream 생성하기");

        IntStream intStream1 = Arrays.stream(arr);
        out.println(intStream1);

        intStream1.forEach(s -> out.print(s + "\t"));
        out.println();

        out.println("----------------------------");

        IntStream intStream2 = IntStream.of(arr);
        out.println(intStream2);

        intStream2.forEach(s -> out.print(s + "\t"));
        out.println();
    }
}
