package Array;

import static java.lang.System.out;

public class Lotto {
    public static int setRandomRange(int range) {
        return (int) (Math.random() * range) + 1;
    }

    public static int[] getRandomNumber(int lottoLength) {
        int[] randomArray = new int[lottoLength];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = setRandomRange(45);
        }

        return randomArray;
    }

    public static String printRandomNumber(int[] randomArray) {
        String loopResult = "";

        for (int i = 0; i < randomArray.length; i++) {
            if (!isExist(randomArray, randomArray[i])) {
                loopResult += randomArray[i] + " ";
            }
        }

        return loopResult;
    }

    public static boolean isExist(int[] randomArray, int randomValue) {
        boolean insert = false;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] == randomValue) {
                insert = true;
                return insert;
            }

            if (insert == true) {
                randomArray[i] = randomValue;
            }
        }

        return insert;
    }

    public static void main(String[] args) {
        int lottoLength = 6;
        int[] lotto = new int[6];
        int[] number = new int[lotto.length];
        // int[] lotto = getRandomNumber(lottoLength);

        // String loopResult = printRandomNumber(lotto);
        // out.println(loopResult);

        // int idx = 0;
        // while (true) {
        // int number = (int) (Math.random() * 45) + 1;
        // // out.println(number);

        // boolean insert = true;
        // for (int i = 0; i <= idx; i++) {
        // if (lotto[i] == number) {
        // insert = false;
        // // out.println(insert);
        // break;
        // }
        // }

        // if (insert == true) {
        // lotto[idx] = number;
        // idx++;
        // // out.println(idx);
        // }

        // if (idx == 6) {
        // break;
        // }
        // }

        for (int i = 0; i < lottoLength; i++) {
            number[i] = (int) (Math.random() * 45) + 1;
        }

        boolean insert = true;
        for (int i = 0; i < lottoLength; i++) {
            if (lotto[i] == number[i]) {
                insert = false;
                break;
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            if (insert == true) {
                lotto[i] = number[i];
            }

            if (i == 6) {
                break;
            }
        }

        // out.print("입력 값 : ");
        // for (int i = 0; i < lotto.length; i++) {
        // int number = (int) (Math.random() * 45) + 1;
        // lotto[i] = number;

        // if (lotto[i] == number) {

        // }
        // out.print(lotto[i] + " ");
        // }

        // out.println();

        // out.print("결과 값 : ");
        for (int i = 0; i < lotto.length; i++) {
            out.print(lotto[i] + " ");
        }
    }
}
