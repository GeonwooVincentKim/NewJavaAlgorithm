package Collections.BinarySearch;

import static java.lang.System.out;

import java.util.Scanner;

public class FindInsertPoint {
    public static int setRandomValue(int max, int min) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int[] getRandomArray(int userInputArrayLength) {
        int[] randomArray = new int[userInputArrayLength];

        for (int i = 0; i < userInputArrayLength; i++) {
            randomArray[i] = setRandomValue(10, 50);
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

    public static int binarySearchArary(int[] randomArray, int userInputFindIndex) {
        // If the Index that the user Searching for is smaller than all of exist Index,
        // Returns 0 and let the User can add the new Data at the first place of index.

        // Or the Index that the user Searching for is bigger than all of exist Index,
        // Returns randomArray.length and let the User can add the new Data at the last
        // place of index.
        if (userInputFindIndex < randomArray[0]) {
            out.println("정말 작은 값이군요. 추가 가능합니다");
            return 0;
        } else if (userInputFindIndex > randomArray[randomArray.length - 1]) {
            out.println("정말 큰 값이군요. 추가 가능합니다");
            return randomArray.length;
        }

        int lowerPoint = 0;
        int i = 1;

        while (i < randomArray.length && randomArray[i] < userInputFindIndex) {
            lowerPoint = i;
            i = i * 2;
        }

        // Final Check for the remaining elements which are < X
        while (lowerPoint < randomArray.length && randomArray[lowerPoint] < userInputFindIndex) {
            lowerPoint++;
        }

        return lowerPoint;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Set the Array length by user input value.
        out.print("입력받으실 배열의 길이를 입력해주세요 : ");
        int userInputArrayLength = sc.nextInt();

        // 2. Get the Random value as user input value.
        int[] randomArray = getRandomArray(userInputArrayLength);
        String loopResult = printRandomArray(randomArray);
        out.print("Before Sort Array -> ");
        out.println(loopResult);

        // 3. Sort the Array which already got the random value
        int[] sortArray = sortRandomArray(randomArray);
        loopResult = printRandomArray(sortArray);
        out.print("After Sorted Array -> ");
        out.println(loopResult);

        // 4. Find the index by using `Binary-Search`
        out.print("찾으실 Index 의 값을 입력하세요 : ");
        int userInputFindIndex = sc.nextInt();
        int index = binarySearchArary(randomArray, userInputFindIndex);
        out.println(index);

        // 5. Print to describe to user that can add the value or not at index that user
        // determined.
        String result = loopResult + "\n" + index;
        out.println(result);

        sc.close();
    }
}
