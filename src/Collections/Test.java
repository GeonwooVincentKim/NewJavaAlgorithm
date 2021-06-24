package Collections;

// import java.util.Arrays;
import static java.lang.System.out;

import java.util.Scanner;

public class Test {
    public static int randomRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + 11;
    }

    public static int[] setRandomArray(int userInput) {
        int[] randomArray = new int[userInput];

        for (int i = 0; i < userInput; i++) {
            randomArray[i] = randomRange(10, 50);
        }

        return randomArray;
    }

    public static String printRandomArray(int[] randomArray) {
        String loopResult = "";

        for (int i = 0; i < randomArray.length; i++) {
            loopResult += randomArray[i] + " ";
        }

        return loopResult;
    }

    public static int[] sortRandomArray(int[] randomArray) {
        int[] sortArray = new int[randomArray.length];

        for (int i = 0; i < sortArray.length; i++) {
            for (int j = i + 1; j < sortArray.length; j++) {
                if (randomArray[i] > randomArray[j]) {
                    int temp = randomArray[i];
                    randomArray[i] = randomArray[j];
                    randomArray[j] = temp;

                    sortArray = randomArray;
                }
            }
        }

        return sortArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("입력받으실 숫자의 길이를 입력하세요 : ");

        // 1. Set the array length by user Input-Value.
        int userInput = sc.nextInt();

        // 2. Get the random-number as the number entered by User.
        int[] randomArray = setRandomArray(userInput);
        String printArray = printRandomArray(randomArray);
        out.println(printArray);

        // 3. Sort array before find the value.
        int[] sortArray = sortRandomArray(randomArray);
        // out.println(sortArray);
        printArray = printRandomArray(sortArray);
        out.println(printArray);

        // 4. Find the index using `Binary-Search`.
        // In this case, you can use `While()` Loop or `Recursive-Function()`
        // 5. Get the result where the index located and display to User
        // that can add the new index between another indexs or not.

        sc.close();
    }
}
