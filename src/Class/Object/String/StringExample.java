package Class.Object.String;

import static java.lang.System.out;

public class StringExample {
    public static void main(String[] args) {
        String[] str = { "1", "2", "3", "4" };

        // Print String array type index as Integer
        int sum = getTotalIntegerNumber(str);
        String printResult = printTotalNumber(sum);
        out.println(printResult);

        // Print String array type index as Long
        Long sumLongType = getTotalLongNumber(str);
        String printLongResult = printTotalNumber(sumLongType);
        out.println(printLongResult);
    }

    public static int getTotalIntegerNumber(String[] str) {
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }

        return sum;
    }

    public static Long getTotalLongNumber(String[] str) {
        Long sum = 0L;

        for (int i = 0; i < str.length; i++) {
            sum += Long.parseLong(str[i]);
        }

        return sum;
    }

    public static String printTotalNumber(int sum) {
        String result = "Result (Integer) : " + sum;
        // for (int i = 0; i < sum; i++) {
        // result += sum + "\n";
        // }

        return result;
    }

    public static String printTotalNumber(Long sum) {
        String result = "Result (Long) : " + sum;

        return result;
    }
}
