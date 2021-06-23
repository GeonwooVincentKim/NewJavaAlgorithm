package Collections.List.ArrayList;

import static java.lang.System.out;

import java.util.Scanner;

public class CustomArrayExample {
    // Check index is exist in array
    public static int isIndexOf(int[] getArray, int index) {
        for (int i = 0; i < getArray.length; i++) {
            if (getArray[i] == index) {
                return i;
            }
        }
        return -1;
    }

    // Check how many times does the same index iterate
    public static int arrayFrequency(int[] getArray, int index) {
        int count = 0;

        for (int i = 0; i < getArray.length; i++) {
            if (getArray[i] == index) {
                count++;
            }
        }

        return count;
    }

    // Display Array Size
    public static int getArraySize(int[] getArray) {
        return getArray.length;
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

        for (int i = 0; i < getArraySize(originalArray); i++) {
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

        if (includeFrequency == 1) {

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
