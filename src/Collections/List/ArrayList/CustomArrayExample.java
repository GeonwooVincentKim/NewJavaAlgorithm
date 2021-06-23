package Collections.List.ArrayList;

import static java.lang.System.out;

import java.util.Scanner;

public class CustomArrayExample {
    // Set the Random Number range from `min` to `max`
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // Set the RandomNumber from `10` to `50`, and then extract the Random-Number
    // as `arrayLength`
    public static int[] getRandomArray(int arrayLength) {
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = getRandomNumber(10, 50);
        }

        return randomArray;
    }

    // Print extracted Random-Number
    public static String printRandomArray(int[] getArray) {
        String loopResult = "";

        for (int i = 0; i < getArray.length; i++) {
            loopResult += getArray[i] + " ";
        }

        return loopResult;
    }

    // Store extracted duplicate-number into the CountArray
    // If is not duplicate-index, then store into the CountArray.
    public static int[] getCountArray(int[] originalArray) {
        int[] countArray = new int[originalArray.length];

        // Saves Frequency of array element
        for (int i = 0; i < countArray.length; i++) {
            if (!NewCustomArrayList.isContain(countArray, originalArray[i])) {
                countArray[i] = Integer.valueOf(originalArray[i]);
                out.print(countArray[i] + " ");
            }
        }
        return countArray;
    }

    public static int[] getSortArray(int[] originalArray, int[] countArray) {
        int[] getSortedArray = new int[countArray.length];

        int getCurrentValue = 0;
        int getNextValue = 0;
        int getCurrentCount = 0;
        int getNextCount = 0;

        for (int i = 0; i < countArray.length; i++) {

            for (int j = i + 1; j < countArray.length; j++) {
                getCurrentValue = countArray[i];
                getNextValue = countArray[j];

                getCurrentCount = NewCustomArrayList.arrayFrequency(originalArray, getCurrentValue);
                getNextCount = NewCustomArrayList.arrayFrequency(originalArray, getNextValue);

                if (getCurrentCount < getNextCount) {
                    NewCustomArrayList.swapArray(originalArray, i, j);
                    NewCustomArrayList.swapArray(countArray, i, j);

                    getSortedArray[i] = countArray[i];
                } else if (getCurrentCount == getNextCount && getCurrentValue < getNextValue) {
                    NewCustomArrayList.swapArray(originalArray, i, j);
                    NewCustomArrayList.swapArray(countArray, i, j);

                    getSortedArray[i] = countArray[i];
                }
            }
        }

        return getSortedArray;
    }

    public static String printResult(int[] sortArray, int[] originalArray, int[] countArray) {
        String printResult = "";

        for (int i = 0; i < 5; i++) {
            printResult += "#" + (i + 1) + " " + sortArray[i] + " ("
                    + NewCustomArrayList.arrayFrequency(originalArray, countArray[i]) + ")" + "\n";
        }

        return printResult;
    }

    public static void main(String[] args) {
        String result = "";

        Scanner sc = new Scanner(System.in);
        out.println("배열의 길이를 입력해주세요 (정수)");

        int arrayLength = sc.nextInt();

        // out.println("빈도 값도 함께 정렬할까요??\n1. 네\n2. 아니오");
        // int includeFrequency = sc.nextInt();

        int[] originalArray = getRandomArray(arrayLength);
        String loopResult = printRandomArray(originalArray);
        // out.println(loopResult);

        int[] countArray = getCountArray(originalArray);
        int[] sortArray = getSortArray(originalArray, countArray);

        out.println();

        result = loopResult + "\n" + printResult(sortArray, originalArray, countArray);
        out.print(result);
        // for (int i = 0; i < originalArray.length; i++) {
        // out.print("#" + (i + 1) + " " + originalArray[i] + " ("
        // + NewCustomArrayList.arrayFrequency(originalArray, countArray[i]) + ")" +
        // "\n");
        // }
        // if (includeFrequency == 1) {

        // } else if (includeFrequency == 2) {
        // for (int i = 0; i < countArray.length; i++) {
        // for (int j = i + 1; j < countArray.length; j++) {
        // if (countArray[i] < countArray[j]) {
        // int temp = countArray[i];
        // countArray[i] = countArray[j];
        // countArray[j] = temp;
        // }
        // }
        // }

        // out.println();

        // for (int i = 0; i < countArray.length; i++) {
        // out.print(countArray[i] + " ");
        // }

        // } else {
        // System.exit(0);
        // }

        sc.close();
    }
}
