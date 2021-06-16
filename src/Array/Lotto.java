package Array;

import static java.lang.System.out;

public class Lotto {
    public static int setRandomRange(int range) {
        return (int) (Math.random() * range) + 1;
    }

    public static int[] getRandomNumber(int lottoLength) {
        int[] lotto = new int[lottoLength];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = setRandomRange(45);

            i = checkValueExist(lotto, i);
        }

        return lotto;
    }

    public static int checkValueExist(int[] lotto, int i) {
        for (int j = 0; j < i; j++) {
            if (lotto[i] == lotto[j]) {
                i--;
                break;
            }
        }
        return i;
    }

    public static String printRandomArray(int[] randomArray) {
        String loopResult = "";

        for (int i = 0; i < randomArray.length; i++) {
            loopResult += randomArray[i] + " ";
        }

        return loopResult;
    }

    public static void main(String[] args) {
        int lottoLength = 6;
        int[] lotto = getRandomNumber(lottoLength);

        String result = printRandomArray(lotto);
        out.println(result);
    }

}
