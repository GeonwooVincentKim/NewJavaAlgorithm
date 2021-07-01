package Lambda;

import java.util.Scanner;

import static java.lang.System.out;

public class LambdaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        out.println(userInput);

        // userInput 의 길이만큼 array 길이 입력받기
        int[] array = new int[userInput];

        for (int i = 0; i < userInput; i++) {
            array[i] = (int) (Math.random() * (50 - 10 + 1)) + 10;
            // array[i] = sc.nextInt();
            // out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            out.print(array[i] + " ");
        }

        out.println();

        // 합계
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        out.println("합계 : " + sum + " ");

        // 평균
        double average = sum / array.length;
        out.println("평균 : " + average);

        // 각 수들의 편차 곱
        double deviationSum = 0;

        for (int i = 0; i < array.length; i++) {
            deviationSum += (array[i] - average) * (array[i] - average);
        }

        out.printf("편차 곱 : %.2f", deviationSum);
        out.print(" ");
        out.println();

        // 각 수들의 편차 곱의 평균
        double deviation = deviationSum / array.length;
        out.printf("편차 곱의 평균 : %.2f", deviation);
        out.println();

        // 표준편차
        double standardDeviation = Math.sqrt(deviation);
        out.printf("표준편차 : %.2f", standardDeviation);

        sc.close();
    }
}
