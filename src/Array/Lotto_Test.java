package Array;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lotto_Test {
    // 1. Get determined ArrayLength from User-input for setting arrayLength.
    // And add random values into the array.
    public static int[] getRandomArray(int setArrayLength) {
        int[] randomArray = new int[setArrayLength];

        for (int i = 0; i < randomArray.length; i++) {
            // Set random section from 0 ~ 45
            // Not the Zero-Two animation
            randomArray[i] = (int) (Math.random() * 45) + 1;
            if (!isDuplicateValueExist(randomArray, i)) {
                // randomArray[i] = (int) (Math.random() * 45) + 1;
                i = checkDuplicateValue(randomArray, i);
            }
        }

        return randomArray;
    }

    public static int[] getNonDuplicateArray(int[] getRandomArray) {
        int[] nonDuplicateArray = new int[getRandomArray.length];

        for (int i = 0; i < getRandomArray.length; i++) {
            // Get the RandomArray and subsititude into the nonDuplicateArray.
            nonDuplicateArray[i] = getRandomArray[i];

            for (int j = 0; j < i; j++) {
                i = checkDuplicateValue(nonDuplicateArray, i, j);
            }
        }

        return nonDuplicateArray;
    }

    // 2. If there are duplicateValue exists in randomArray, then return false,
    // otherwise, return true that the user can add the new data in the randomArray.
    public static boolean isDuplicateValueExist(int[] randomArray, int randomValue) {
        boolean canInsert = true;

        for (int j = 0; j < randomValue; j++) {
            if (randomArray[randomValue] == randomArray[j]) {
                canInsert = false;
                return canInsert;
            }
        }

        return canInsert;
    }

    public static int checkDuplicateValue(int[] randomArray, int i, int j) {
        if (randomArray[j] == randomArray[j]) {
            i--;
        }

        return i;
    }

    public static int checkDuplicateValue(int[] randomArray, int randomValue) {
        boolean canInsert = isDuplicateValueExist(randomArray, randomValue);

        int i = 0;
        for (i = 0; i < randomValue; i++) {
            if (canInsert == true) {
                randomArray[i] = randomValue;
            }
        }

        return i;
    }

    public static int randomArrayFrequency(int[] lottoArray, int lottoValue) {
        int count = lottoValue;
        for (int i = 0; i < lottoArray.length; i++) {
            if (lottoArray[i] == lottoValue) {
                count--;
                break;
            }
        }

        return count;
    }

    // 3. Print the value of Random-Array
    public static String printRandomArray(int[] randomArray) {
        String printResult = "";

        for (int i = 0; i < randomArray.length; i++) {
            printResult += randomArray[i] + " ";
        }

        return printResult;
    }

    public static void main(String[] args) {
        // out.println();
        Scanner sc = new Scanner(System.in);

        out.print("랜덤 수를 출력할 데이터의 개수를 입력하세요 : ");

        int setArrayLength = 0;

        try {
            setArrayLength = sc.nextInt();
        } catch (InputMismatchException e) {
            // e.printStackTrace();
            out.println("입력을 잘못하셨습니다 : ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[] randomArray = getRandomArray(setArrayLength);

        // out.println(randomArray);
        String result = printRandomArray(randomArray);
        out.println(result);

        // int[] randomArray = new int[setDataLength];
        // int getCurrentDuplicateValue = 0;

        // for (int i = 0; i < setDataLength; i++) {
        // randomArray[i] = (int) (Math.random() * 45) + 1;
        // getCurrentDuplicateValue = randomArrayFrequency(randomArray, i);
        // out.println(getCurrentDuplicateValue);
        // // out.print(randomArray[i] + " ");
        // }

        // out.println();

        // int getNextDuplicateValue = 0;

        // for (int i = 0; i < randomArray.length; i++) {
        // for (int j = 0; j < i; j++) {
        // getCurrentDuplicateValue = randomArray[i];
        // getNextDuplicateValue = randomArray[j];

        // if (getCurrentDuplicateValue == getNextDuplicateValue) {
        // i--;
        // break;
        // }

        // // out.print(" 확인중.. ");
        // }

        // }

        // int[] getRandomNum = randomArray;
        // String printNonDuplicateArray = "";
        // for (int i = 0; i < getRandomNum.length; i++) {
        // printNonDuplicateArray += getRandomNum[i] + " - ";
        // }

        // out.println(printNonDuplicateArray);

        sc.close();
    }
}
