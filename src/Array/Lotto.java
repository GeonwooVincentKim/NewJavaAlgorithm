package Array;

import static java.lang.System.out;

public class Lotto {
    public static int setRandomRange(int range) {
        return (int) (Math.random() * range) + 1;
    }

    public static int[] getRandomNumber(int lottoLength) {
        int[] lotto = new int[lottoLength];
        out.println("First Values --> ");

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = setRandomRange(45);
            i = checkValueExist(lotto, i);
            out.print(lotto[i] + " ");
        }

        out.println();
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
                out.println("There are duplicates value exist in this array");
                out.println("lotto[i] : " + lotto[i] + ", lotto[j] : " + lotto[j]);

                count--;

                out.println();
                out.println("Changed");
                out.println("lotto[i] : " + lotto[i] + ", lotto[j] : " + lotto[j]);
                // out.print(count + " " + lotto[i] + " " + lotto[j]);
                out.println();
                break;
            }
            // out.println();
        }

        return count;
    }

    public static boolean isValueExist(int[] lotto, int lottoValue) {
        boolean canInsert = true;

        for (int i = 0; i < lottoValue; i++) {
            if (lotto[i] == lottoValue) {
                canInsert = false;
                return canInsert;
            }
        }

        return canInsert;
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
        out.println("--> Result values");
        out.print(result + " ");
    }

}
