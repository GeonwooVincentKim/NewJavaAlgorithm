package Class.Object.Test;

import static java.lang.System.out;

public class SumString {
    public static void main(String[] args) {
        String num1 = "100";
        String num2 = "200";

        int getNum1 = Integer.parseInt(num1);
        int getNum2 = Integer.parseInt(num2);

        int result = getNum1 + getNum2;
        out.println(result);
    }
}
