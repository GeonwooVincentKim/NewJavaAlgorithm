package Class.Inheritance.Annotation;

import static java.lang.System.out;

import java.util.Scanner;

public class Test {
    public static int[] getPastaCost(int pasta) {
        Scanner sc = new Scanner(System.in);
        int[] pastaCost = new int[pasta];

        for (int i = 0; i < pasta; i++) {
            pastaCost[i] = sc.nextInt();
        }

        sc.close();
        return pastaCost;
    }

    public static String printPastaCost(int[] pastaArray) {
        String pastaLoop = "";

        for (int i = 0; i < pastaArray.length; i++) {
            pastaLoop += pastaArray[i] + " ";
        }

        return pastaLoop;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int[] pastaCost = new int[3];
        int pasta = 3;
        // int juice = 2;

        int[] pastaCost = getPastaCost(pasta);
        String getResult = printPastaCost(pastaCost);
        out.println(getResult);
        // int[] juiceCost = new int[2];

        // int sum = 0;
        // double min = 10000;

        // for (int i = 0; i < pastaCost.length; i++) {
        // pastaCost[i] = sc.nextInt();
        // }

        // for (int i = 0; i < juiceCost.length; i++) {
        // juiceCost[i] = sc.nextInt();
        // }

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 2; j++) {
        // sum = pastaCost[i] + juiceCost[j];

        // if (min > sum) {
        // min = sum;
        // }
        // }
        // }

        // min = (double) (min * 1.1);

        // out.println(String.format("%.1f", min));

        // sc.close();
    }
}
