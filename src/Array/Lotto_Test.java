package Array;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lotto_Test {
    // 1. Get the Array Length from User-Input and substitude into the
    // `setArrayLength`.
    public static int extracted(Scanner sc, int setArrayLength) {
        try {
            setArrayLength = sc.nextInt();
        } catch (InputMismatchException e) {
            out.println("입력을 잘못하셨습니다 : ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return setArrayLength;
    }

    // 2. Get determined ArrayLength from User-input for setting arrayLength.
    // And add random values into the array.
    public static int[] getRandomArray(int setArrayLength) {
        int[] randomArray = new int[setArrayLength];

        for (int i = 0; i < randomArray.length; i++) {
            // Set random section from 0 ~ 45
            // Not the Zero-Two animation
            randomArray[i] = (int) (Math.random() * 45) + 1;
            // if (!isDuplicateValueExist(randomArray, i)) {
            i = checkDuplicateValue(randomArray, i);
            // }
        }

        return randomArray;
    }

    // 3. If there are duplicateValue exists in randomArray, then return false,
    // otherwise, return true that the user can add the new data in the randomArray.
    public static boolean isDuplicateValueExist(int[] randomArray, int i) {
        boolean canInsert = true;

        for (int j = 0; j < i; j++) {
            if (randomArray[i] == randomArray[j]) {
                canInsert = false;
                return canInsert;
            }
        }

        return canInsert;
    }

    public static int checkDuplicateValue(int[] randomArray, int i, int j) {
        if (randomArray[j] == randomArray[i]) {
            i--;
        }

        return i;
    }

    // 4. If the value duplicates true after execute `isDuplicateValueExist`
    // function, then compare between randomArray[i] and randomArray[j].
    // And count out the `i` value to delete duplicate value in the `randomArray`.
    public static int checkDuplicateValue(int[] randomArray, int i) {
        int count = i;

        for (int j = 0; j < i; j++) {
            if (randomArray[j] == randomArray[i]) {
                out.println();
                out.println("getRandomArray[i] : " + randomArray[i] + ", getRandomArray[j]" + randomArray[j]);

                i--;

                out.println();
                out.println("getRandomArray[i] : " + randomArray[i] + ", getRandomArray[j]" + randomArray[j]);
                break;
            }
        }

        return count;
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

    // 5. Print the value of Random-Array
    public static String printRandomArray(int[] randomArray) {
        String printResult = "";

        for (int i = 0; i < randomArray.length; i++) {
            printResult += randomArray[i] + " ";
        }

        return printResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out.print("랜덤 수를 출력할 데이터의 개수를 입력하세요 : ");

        int setArrayLength = 0;

        setArrayLength = extracted(sc, setArrayLength);

        int[] randomArray = getRandomArray(setArrayLength);

        String result = printRandomArray(randomArray);
        out.println(result);

        sc.close();
    }
}
