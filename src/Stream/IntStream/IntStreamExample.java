package Stream.IntStream;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamExample {
    // Read Array
    public static int[] getArray(int setArrayLength) {
        int[] array = new int[setArrayLength];

        for (int i = 0; i < setArrayLength; i++) {
            array[i] = (i + 1);
        }

        // Arrays.stream(arr).forEach(s -> out.println(s));
        return array;
    }

    // Print Array
    public static String printArray(int[] array) {
        String loopResult = "";

        for (int i = 0; i < array.length; i++) {
            loopResult += array[i] + " ";
        }

        return loopResult;
    }

    public static IntStream getIntStream1(int[] arr) {
        IntStream intStream1 = Arrays.stream(arr);
        return intStream1;
    }

    public static void main(String[] args) {
        int size = 5;
        int[] array = getArray(size);
        String printArray = printArray(array);
        out.println(printArray);

        out.println("----------------------------");
        out.println("Arrays.stream() IntStream 생성하기");

        IntStream intStream1 = Arrays.stream(array);
        out.println(intStream1);

        intStream1.forEach(s -> out.print(s + "\t"));
        out.println();

        out.println("----------------------------");
        out.println("IntStream.of() IntStream 생성하기");

        IntStream intStream2 = IntStream.of(array);
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
