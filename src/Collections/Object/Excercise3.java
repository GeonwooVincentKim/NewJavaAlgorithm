package Collections.Object;

import static java.lang.System.out;

public class Excercise3 {
    public static void main(String[] args) {
        String num1 = "100";
        String num2 = "200";

        out.println("num1 value : " + num1 + "\n" + "num2 value : " + num2);

        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        out.println("합계 : " + sum);
    }
}
