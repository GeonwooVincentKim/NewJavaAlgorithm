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
            out.print(lotto[i] + " ");
        }

        out.println();

        int[] newLottoArray = new int[lotto.length];
        for (int i = 0; i < newLottoArray.length; i++) {
            newLottoArray[i] = lotto[i];
            i = checkValueExist(newLottoArray, i);
            out.print(newLottoArray[i] + " ");
        }

        return lotto;
    }

    public static int[] setRandomNumber(int[] randomArray) {
        int[] lottoArray = new int[randomArray.length];

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < i; j++) {

            }
        }

        return lottoArray;
    }

    public static int checkValueExist(int[] lotto, int i) {
        int count = i;

        for (int j = 0; j < i; j++) {
            if (lotto[i] == lotto[j]) {
                out.println("겹치는 목록이 발생했습니다");
                count--;
                out.print(count + " " + lotto[i] + " " + lotto[j]);
                out.println();
                break;
            }
            // out.println();
        }

        return count;
    }

    public static String printRandomArray(int[] lotto) {
        String loopResult = "";

        for (int i = 0; i < lotto.length; i++) {
            loopResult += lotto[i] + " ";
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
