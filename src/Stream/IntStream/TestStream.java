package Stream.IntStream;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
    // 사용자가 입력한 수(numberLength)만큼 랜덤 값을 받아들인다.
    // 단, 랜덤 값의 범위는 10 ~ 50
    public static List<Integer> calculator(int numberLength) {
        List<Integer> list = new ArrayList<>();

        // IntStream 의 길이를 numberLength 만큼 초기화 시킨 후, numberLength 의 길이만큼의 초기화된 intStream
        // 만큼
        // list 에 지정 범위가 있는 random 값들을 가져온다.
        IntStream intStream = new Random().ints(numberLength);
        intStream.forEach(s -> list.add((int) (Math.random() * (50 - 10 + 1)) + 10));

        // 초기화하지 않은 IntStream 에 값을 집어넣으면 값이 추가되지 않고,
        // 설령 추가되었다고 하더라고 모두 값이 들어가지 않은 완전 빈 값이 들어가게 된다.
        // 결국 추가가 안된다.
        // IntStream.range(0, list.size()).forEach(a -> {
        // list.add((int) (Math.random() * (50 - 10 + 1) + 10));
        // });

        return list;
    }

    public static int[] calculatorArray(int numberLength) {
        int[] array = new int[numberLength];

        //
        Stream<Integer> stream = Arrays.stream(array).mapToObj(a -> array.length);
        stream.mapToInt(a -> (int) (Math.random() * (50 - 10 + 1)) + 10);

        return array;
    }

    public static String printResult(List<Integer> getCalculateArray) {
        String result = "";

        getCalculateArray.stream().forEach(string -> out.print(string + " "));

        return result;
    }

    public static String printResult(int[] calculateArray) {
        String result = "";

        Stream<Integer> stream = Arrays.stream(calculateArray).mapToObj(a -> calculateArray.length);
        stream.forEach(string -> out.print(string + " "));

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("숫자 입력 : ");

        int userInputLength = sc.nextInt();

        // List<Integer> calculateArray = calculator(userInputLength);
        int[] calculateArray = calculatorArray(userInputLength);
        // out.println(calculateArray);
        // out.println();

        String result = printResult(calculateArray);
        out.println(result);

        sc.close();
    }
}
