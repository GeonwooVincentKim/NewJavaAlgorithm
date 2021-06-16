package Array;

import static java.lang.System.out;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getDataLength = sc.nextInt();
        int[][] matrix = new int[getDataLength][getDataLength];

        out.println(matrix.length);
        int value = 0;
        int i = 0;
        int j = 0;

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
                out.print(matrix[i][j] + " ");
            }
            out.println();
        }

        out.println("\n");

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value--;
                out.print(matrix[i][j] + " ");
            }
            out.println();
        }
        sc.close();
    }
}
