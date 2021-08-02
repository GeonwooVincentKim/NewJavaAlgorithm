package Stream.StreamVariousType;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

import Stream.StreamVariousType.StreamAttribute.StreamController;

public class Test {
    public static <T> int[] inputNumber(int length) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInput = new int[length];

        for (int i = 0; i < length; i++) {
            try {
                arrayInput[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                out.println("타입이 맞지 않습니다");
                out.println("----------------");
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            // swap(arrayInput, i, i);
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

    /*
     * `T` types will not allowed to sum over two values addition
     * 
     */
    public static <T extends Number> T plus(T n1, T n2) {
        T sum = n1;

        if (sum instanceof Integer) {
            out.println("맞습니다");
        } else if (sum instanceof Double) {
            out.println("아닙니다");
        } else {
            return (T) sum;
        }
        return sum;
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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

        int x = 10;
        int y = 20;

        plus(x, y);

        sc.close();
    }
}
