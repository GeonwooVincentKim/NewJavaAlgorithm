package Class.Object.Regex;

import static java.lang.System.out;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("b[a-z]*");
        out.println(p);

        Matcher m = p.matcher("bat");
        out.println(m);
    }
}
