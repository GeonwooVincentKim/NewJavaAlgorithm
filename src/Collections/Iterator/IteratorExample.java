package Collections.Iterator;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        // Initialize Each Collection Instance(Or Static variable)
        Iterator<Integer> iterator = null; // Static Varaible
        out.println(iterator);

        List<Integer> list = new ArrayList<>();
        out.println(list);

        Set<Integer> set = new HashSet<>();
        out.println(set);

    }
}
