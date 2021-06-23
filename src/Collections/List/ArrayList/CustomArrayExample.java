package Collections.List.ArrayList;

import static java.lang.System.out;

import java.util.Scanner;

public class CustomArrayExample {
    public static int swapArray(int[] getArray, int i, int j) {
        int temp = getArray[i];
        getArray[i] = getArray[j];
        getArray[j] = temp;

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("배열의 길이를 입력해주세요 (정수)");

        int arrayLength = sc.nextInt();

        out.println("빈도 값도 함께 정렬할까요??\n1. 네\n2. 아니오");
        int includeFrequency = sc.nextInt();

        int[] originalArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            originalArray[i] = (int) (Math.random() * (50 - 10 + 1)) + 10;
        }

        for (int i = 0; i < NewCustomArrayList.getArraySize(originalArray); i++) {
            out.print(originalArray[i] + " ");
        }

        out.println();

        int[] countArray = new int[originalArray.length];

        // Saves Frequency of array element
        for (int i = 0; i < countArray.length; i++) {
            if (!NewCustomArrayList.isContain(countArray, originalArray[i])) {
                countArray[i] = Integer.valueOf(originalArray[i]);
                out.print(countArray[i] + " ");
            }
        }

        int getCurrentValue = 0;
        int getNextValue = 0;
        int getCurrentCount = 0;
        int getNextCount = 0;

        int[] getSortedArray = new int[countArray.length];
        if (includeFrequency == 1) {
            for (int i = 0; i < countArray.length; i++) {
                for (int j = i + 1; i < countArray.length; j++) {
                    getCurrentValue = countArray[i];
                    getNextValue = countArray[j];
                    getCurrentCount = NewCustomArrayList.arrayFrequency(originalArray, getCurrentValue);
                    getNextCount = NewCustomArrayList.arrayFrequency(originalArray, getNextValue);

                    if (getCurrentCount < getNextCount) {
                        swapArray(originalArray, i, j);
                        swapArray(countArray, i, j);

                        getSortedArray[i] = countArray[i];
                    } else if (getCurrentCount == getNextCount && countArray[i] < countArray[j]) {
                        swapArray(originalArray, i, j);
                        swapArray(countArray, i, j);

                        getSortedArray[i] = countArray[i];
                    }
                }
            }

            out.println();

            for (int i = 0; i < 20; i++) {
                // out.println("#" + (i + 1) + " " + getSortedArray[i] + " ("
                // + NewCustomArrayList.arrayFrequency(originalArray, countArray[i]) + ")" +
                // "\n");
            }

        } else if (includeFrequency == 2) {
            for (int i = 0; i < countArray.length; i++) {
                for (int j = i + 1; j < countArray.length; j++) {
                    if (countArray[i] < countArray[j]) {
                        int temp = countArray[i];
                        countArray[i] = countArray[j];
                        countArray[j] = temp;
                    }
                }
            }

            out.println();

            for (int i = 0; i < countArray.length; i++) {
                out.print(countArray[i] + " ");
            }

        } else

        {
            System.exit(0);
        }

        sc.close();
    }
}
