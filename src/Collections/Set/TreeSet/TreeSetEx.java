package Collections.Set.TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

import static java.lang.System.out;

public class TreeSetEx {
    public static void main(String[] args) {
        // Subsititude String-Array to avoid `Yellow-Error-Line`
        SortedSet<String> set = new TreeSet<>();
        out.println(set);

        String from = "bat";
        String to = "d";

        // Add into the `Set` Object
        set.add("ant");
        set.add("alias");
        set.add("batman");
        set.add("aha");
        set.add("cola");
        set.add("Cola");
        set.add("ddr");
        set.add("dance");
        set.add("dEEE");
        set.add("deee");
        set.add("ever");
        set.add("giant");
        set.add("zoo");

        // Print
        out.println(set);
        out.println("from : " + from + ", to : " + to);

        // Search `from ~ to`
        out.println(set.subSet(from, to));
        out.println("from : " + from + ", to : " + to);

        // Search `from ~ to + "zzzz"`
        out.println(set.subSet(from, to + "zzzz"));

        // Descending Order
    }
}
