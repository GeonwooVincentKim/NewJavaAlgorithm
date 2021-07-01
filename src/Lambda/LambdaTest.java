package Lambda;

import java.util.Scanner;

import static java.lang.System.out;

public class LambdaTest {
    public static int[] getRandomValue(int userInput) {
        int[] array = new int[userInput];

        for (int i = 0; i < userInput; i++) {
            array[i] = (int) (Math.random() * (50 - 10 + 1)) + 10;
        }

        return array;
    }

    public static String printRandomValue(int[] randomArray) {
        String loopResult = "";

        for (int i = 0; i < randomArray.length; i++) {
            loopResult += randomArray[i] + " ";
        }

        return loopResult;
    }

    public static double getRandomArraySum(int[] randomArray) {
        double sum = 0;

        for (int i = 0; i < randomArray.length; i++) {
            sum += randomArray[i];
        }

        return sum;
    }

    // public static

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        out.println(userInput);

        // userInput 의 길이만큼 array 길이 입력받기
        // int[] array = new int[userInput];
        int[] array = getRandomValue(userInput);
        String printLoopResult = printRandomValue(array);
        out.println(printLoopResult);

        out.println();

        // 합계
        double sum = getRandomArraySum(array);
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

interface getArray {
    void handleArray();
}
