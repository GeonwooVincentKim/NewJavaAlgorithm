package Class.Object.Regex;

import static java.lang.System.out;

public class RegaxExample2 {
    public static void main(String[] args) {
        String[] patterns = { ".", "[a-z]?", "[0-9]+", "0[1-9]*", "^[0-9]", "[^0-9]", "[a-z]*", "[a-z]+", "02|010",
                "\\s", "\\S", "\\d", "\\w", "\\W" };
        out.println(patterns);

        String[] datas = { "bat", "021231234", "12345", "011", "bed", "02", "A", "9", "a", "*" };
        out.println(datas);
    }
}
