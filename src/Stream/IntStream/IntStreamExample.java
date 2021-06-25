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

    // Print Stream which are already converted from `Array`
    public static IntStream getIntStream1(int[] array) {
        IntStream intStream1 = Arrays.stream(array);

        intStream1.forEach(s -> out.print(s + "\t"));
        return intStream1;
    }

    // Print IntStream List
    public static IntStream getIntStream2(int[] array) {
        IntStream intStream2 = IntStream.of(array);

        intStream2.forEach(s -> out.print(s + "\t"));
        return intStream2;
    }

    // Get and print Stream as List-Size
    public static IntStream getIntStream3(int minimum, int maximum) {
        IntStream intStream3 = IntStream.range(minimum, maximum);

        intStream3.forEach(s -> out.print(s + "\t"));
        return intStream3;
    }

    public static void main(String[] args) {
        int size = 5;
        int[] array = getArray(size);
        String printArray = printArray(array);
        out.println(printArray);

        out.println("----------------------------");
        out.println("Arrays.stream() IntStream 생성하기");

        IntStream intStream1 = getIntStream1(array);
        out.println(intStream1);

        out.println("----------------------------");
        out.println("IntStream.of() IntStream 생성하기");

        IntStream intStream2 = getIntStream2(array);
        out.println(intStream2);

        out.println("----------------------------");
        out.println("IntStream.range(1, 6) IntStream 생성하기");

        // IntStream intStream3 = IntStream.range(1, 6);
        IntStream intStream3 = getIntStream3(1, size + 1);
        out.println(intStream3);

        out.println("----------------------------");
        out.println("IntStream.rangeClosed(1, 5) IntStream 생성하기");

        IntStream intStream4 = IntStream.rangeClosed(1, 5);
        out.println(intStream4);

        intStream4.forEach(s -> out.print(s + "\t"));
    }
}
