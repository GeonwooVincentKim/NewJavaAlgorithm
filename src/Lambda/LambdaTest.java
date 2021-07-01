package Lambda;

import java.util.Scanner;

import static java.lang.System.out;

public class LambdaTest {
    public static int[] getRandomValue(int userInput) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[userInput];

        for (int i = 0; i < userInput; i++) {
            // array[i] = (int) (Math.random() * (50 - 10 + 1)) + 10;
            array[i] = sc.nextInt();
        }

        sc.close();
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

    public static double getRandomArrayAverage(int[] randomArray) {
        double sum = getRandomArraySum(randomArray);
        double average = sum / randomArray.length;

        return average;
    }

    public static double getDeviationSum(int[] randomArray) {
        double average = getRandomArrayAverage(randomArray);
        double deviationSum = 0;

        for (int i = 0; i < randomArray.length; i++) {
            deviationSum += (randomArray[i] - average) * (randomArray[i] - average);
        }

        return deviationSum;
    }

    public static double getDeviationAverage(int[] randomArray) {
        double deviationSum = getDeviationSum(randomArray);
        double deviation = deviationSum / randomArray.length;

        return deviation;
    }

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
        double average = getRandomArrayAverage(array);
        out.println("평균 : " + average);

        // 각 수들의 편차 곱
        double deviationSum = getDeviationSum(array);
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
