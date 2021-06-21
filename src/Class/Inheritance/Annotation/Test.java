package Class.Inheritance.Annotation;

import static java.lang.System.out;

import java.util.Scanner;

public class Test {
    public static int[] getPastaCost(Scanner sc, int pasta) {
        int[] pastaCost = new int[pasta];

        for (int i = 0; i < pasta; i++) {
            pastaCost[i] = sc.nextInt();
        }

        return pastaCost;
    }

    // public static String printPastaCost(int[] pastaArray) {
    // String pastaLoop = "";

    // for (int i = 0; i < pastaArray.length; i++) {
    // pastaLoop += pastaArray[i] + " ";
    // }

    // return pastaLoop;
    // }

    public static int[] getJuiceCost(Scanner sc, int juice) {
        int[] juiceCost = new int[juice];

        for (int i = 0; i < juice; i++) {
            juiceCost[i] = sc.nextInt();
        }

        return juiceCost;
    }

    // public static String printJuiceCost(int[] juiceArray) {
    // String juiceLoop = "";

    // for (int i = 0; i < juiceArray.length; i++) {
    // juiceLoop += juiceArray[i] + " ";
    // }

    // return juiceLoop;
    // }

    public static double getMinimumCost(int[] pastaCost, int[] juiceCost, double min) {
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                sum = pastaCost[i] + juiceCost[j];

                if (min > sum) {
                    min = sum;
                }
            }
        }

        return min;
    }

    public static double discountMinimumPrice(double min) {
        min = (double) (min * 1.1);
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pasta = 3;
        int juice = 2;

        int[] pastaCost = getPastaCost(sc, pasta);
        int[] juiceCost = getJuiceCost(sc, juice);

        double min = 10000;
        min = getMinimumCost(pastaCost, juiceCost, min);
        min = discountMinimumPrice(min);

        out.println(String.format("%.1f", min));

        sc.close();
    }
}
