package Stream.StreamVariousType;

import static java.lang.System.out;

import java.util.Scanner;

import Stream.StreamVariousType.StreamAttribute.StreamController;

public class Test {
    public static <T> int[] inputNumber(int length) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInput = new int[length];

        for (int i = 0; i < length; i++) {
            arrayInput[i] = sc.nextInt();

            swap(arrayInput, i, i);
            // out.println(arrayInput[i]);
            // StreamController<Integer> streamController = new
            // StreamController<>(arrayInput[i], arrayInput[i + 1]);
            // streamController.swap(arrayInput[i], arrayInput[i]);
        }

        sc.close();
        return arrayInput;
    }

    public static int getSum(int[] inputArray) {
        int sum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }

        return sum;
    }

    public static <T> void swap(int[] arrayInput, int i, int j) {
        int temp = arrayInput[i];
        arrayInput[i] = arrayInput[j];
        arrayInput[j] = temp;
    }

    public static void main(String[] args) {
        StreamController<?> streamController = new StreamController<>();
        out.println(streamController);

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] userInput = inputNumber(length);
        out.println(userInput);

        int sum = getSum(userInput);
        out.println(sum);

        // int x = 10;
        // int y = 20;

        sc.close();
    }
}
