package Class.Object.String.StringHandler;

public class StringHandlerFunction extends StringHandlerClass {
    public int getTotalNumber(String[] str) {
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }

        return sum;
    }
}
