package Class.Inheritance.Annotation;

import static java.lang.System.out;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int number) {
        if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
            return fibonacci(number - 2) + fibonacci(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int getUserInput = sc.nextInt();
        out.println(fibonacci(getUserInput));

        sc.close();
    }
}
