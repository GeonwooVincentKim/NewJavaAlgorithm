package Array;

import static java.lang.System.out;

public class Testing {
    public static void main(String[] args) {
        int userInput = 6;
        int[] lotto = new int[userInput];

        int idx = 0;
        out.print("제거 전 : ");
        while (true) {
            int number = (int) (Math.random() * 45) + 1;
            out.print(number + " ");

            boolean insert = true;

            for (int i = 0; i <= idx; i++) {
                if (lotto[i] == number) {
                    insert = false;
                    break;
                }
            }

            if (insert == true) {
                lotto[idx] = number;
                idx++;
            }

            if (idx == 6)
                break;
        }

        out.println();
        out.print("제거 후 : ");
        for (int i = 0; i < lotto.length; i++) {
            out.print(lotto[i] + " ");
        }
    }
}
