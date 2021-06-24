package Lambda.Functional_Interface;

import static java.lang.System.out;

public class LambdaExample3 {
    public static int[] getRandomArray(int length) {
        int[] randomNumber = new int[length];

        for (int i = 0; i < length; i++) {
            randomNumber[i] = (int) (Math.random() * (10 - 1 + 1)) + 1;
        }

        return randomNumber;
    }

    public static void main(String[] args) {

        LambdaInterfaceStoreArray fArray = (length) -> {
            int[] array = new int[length];

            for (int i = 0; i < length; i++) {
                array[i] = (int) (Math.random() * (10 - 1 + 1)) + 1;
                // out.print(array[i] + " ");
            }

            // out.println();

            return array;
        };

        String printLambdaArray = "";

        out.println("Random 된 Array 값 : " + fArray.getArray(10));

        LambdaInterface4 f4 = (x, y) -> {
            return x * y;
        };
        out.println("두 수의 곱 : " + f4.cal(3, 2));

        f4 = (x, y) -> x + y;
        out.println("두 수의 합 : " + f4.cal(3, 2));
    }
}

@FunctionalInterface
interface LambdaInterface4 {
    int cal(int x, int y);
}

@FunctionalInterface
interface LambdaInterfaceStoreArray {
    int[] getArray(int length);
}