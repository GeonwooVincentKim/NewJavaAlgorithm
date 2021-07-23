package Class.Object.String;

import static java.lang.System.out;

public class StringExample {
    public static void main(String[] args) {
        String[] str = { "1", "2", "3", "4" };
        // String[] str = getTotalNumber();
        // out.println(str);

        int sum = getTotalNumber(str);
        String printResult = printTotalNumber(sum);
        out.println(printResult);
    }

    public static int getTotalNumber(String[] str) {
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            out.println(str);

            sum += Integer.parseInt(str[i]);
        }

        return sum;
    }

    public static String printTotalNumber(int sum) {
        String result = "";

        for (int i = 0; i < sum; i++) {
            result += sum + "\n";
        }

        return result;
    }
}
