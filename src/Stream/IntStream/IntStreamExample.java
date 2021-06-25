package Stream.IntStream;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static int[] getArray(int setArrayLength) {
        int[] array = new int[setArrayLength];

        for (int i = 0; i < setArrayLength; i++) {
            array[i] = (i + 1);
            out.print(array[i] + " ");
        }

        // Arrays.stream(arr).forEach(s -> out.println(s));
        return array;
    }

    public static IntStream getIntStream1(int[] arr) {
        IntStream intStream1 = Arrays.stream(arr);
        return intStream1;
    }

    public static void main(String[] args) {
        int size = 5;
        int[] arr = getArray(size);
        // int[] arr = { 1, 2, 3, 4, 5 };
        out.println(arr);

        out.println("----------------------------");
        out.println("Arrays.stream() IntStream 생성하기");

        IntStream intStream1 = Arrays.stream(arr);
        out.println(intStream1);

        intStream1.forEach(s -> out.print(s + "\t"));
        out.println();

        out.println("----------------------------");
        out.println("IntStream.of() IntStream 생성하기");

        IntStream intStream2 = IntStream.of(arr);
        out.println(intStream2);

        intStream2.forEach(s -> out.print(s + "\t"));
        out.println();

        out.println("----------------------------");
        out.println("IntStream.range(1, 6) IntStream 생성하기");

        IntStream intStream3 = IntStream.range(1, 6);
        out.println(intStream3);

        intStream3.forEach(s -> out.print(s + "\t"));
        out.println();

        out.println("----------------------------");
        out.println("IntStream.rangeClosed(1, 5) IntStream 생성하기");

        IntStream intStream4 = IntStream.rangeClosed(1, 5);
        out.println(intStream4);

        intStream4.forEach(s -> out.print(s + "\t"));
    }
}
