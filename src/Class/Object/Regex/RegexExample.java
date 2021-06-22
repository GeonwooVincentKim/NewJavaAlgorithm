package Class.Object.Regex;

import static java.lang.System.out;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // Rule for that the lower-case of alphabet starting from `b` and have more than
        // 0
        Pattern p = Pattern.compile("b[a-z]*");
        out.println(p);

        // Check Character-Sequence(String), "bat"
        Matcher m;
        m = p.matcher("bat");
        out.println(m);
        out.println("bat = " + m.matches());

        // Check Character-Sequence(String), "cat"
        m = p.matcher("cat");
        out.println(m);
        out.println("cat = " + m.matches());

        // Check Character-Sequence(String), "bed"
        m = p.matcher("bed");
        out.println(m);
        out.println("bed = " + m.matches());

        // Rule for that the lower-case of alphabet starting from `c` and have more than
        // 0
        Pattern p1 = Pattern.compile("c[a-z]*");
        out.println(p1);
    }
}
