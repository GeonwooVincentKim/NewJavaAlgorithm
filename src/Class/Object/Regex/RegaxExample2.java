package Class.Object.Regex;

import static java.lang.System.out;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegaxExample2 {
    public static void main(String[] args) {
        String[] patterns = { ".", "[a-z]?", "[0-9]+", "0[1-9]*", "^[0-9]", "[^0-9]", "[a-z]*", "[a-z]+", "02|010",
                "\\s", "\\S", "\\d", "\\w", "\\W" };
        out.println(patterns);

        String[] datas = { "bat", "021231234", "12345", "011", "bed", "02", "A", "9", "a", "*" };
        out.println(datas);

        // for (String d : datas) {
        for (int i = 0; i < datas.length; i++) {
            out.println(datas[i] + " -> 문자와 일치하는 패턴 : ");

            for (String p : patterns) {
                Pattern pattern = Pattern.compile(p);
                Matcher m = pattern.matcher(datas[i]);

                if (m.matches()) {
                    out.print(p + ", ");
                }

            }
        }
    }
}
