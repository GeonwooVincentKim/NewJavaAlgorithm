package Collections;

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

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = i + 1; j < randomArray.length; j++) {
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

    public static int binarySearch(int[] randomArray, int key) {
        int low = 0;
        int high = randomArray.length - 1;

        // Find Index until the end of RandomArray
        while (low <= high) {
            int mid = (low + high) / 2;

            if (randomArray[mid] == key) {
                return mid;
            } else if (randomArray[mid] > key) {
                high = mid - 1;
            } else if (randomArray[mid] < key) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("입력받으실 숫자의 길이를 입력하세요 : ");

        // 1. Set the array length by user Input-Value.
        int userInput = sc.nextInt();

        // 2. Get the random-number as the number entered by User.
        int[] randomArray = setRandomArray(userInput);
        String printRandomArray = printRandomArray(randomArray);
        out.println(printRandomArray);

        // 3. Sort array before find the value.
        int[] sortArray = sortRandomArray(randomArray);
        String printSortArray = printRandomArray(sortArray);
        out.println(printSortArray);

        // 4. Find the index that the user looking for using `Binary-Search`.
        out.print("찾으실 index 의 값을 입력하세요 : ");
        int userFindIndexInput = sc.nextInt();

        int getIndex = binarySearch(randomArray, userFindIndexInput);

        // In this case, you can use `While()` Loop or `Recursive-Function()`
        // 5. Get the result where the index located and display to User
        // that can add the new index between another indexs or not.
        String printResult = printRandomArray + "\n" + printSortArray + "\n" + getIndex;
        out.print(printResult);

        sc.close();
    }
}
