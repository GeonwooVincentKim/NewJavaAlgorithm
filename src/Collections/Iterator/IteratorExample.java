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

        // The Generic type of List is Integer
        // --> If there is no Generic Type, we have to use
        // Polymorphism `Force Type Converter`
        List<Integer> list = new ArrayList<>();
        out.println(list);

        List<Integer> list2 = new ArrayList<>();
        out.println(list2);

        Set<Integer> set = new HashSet<>();
        out.println(set);

        Set<Integer> set2 = new HashSet<>();
        out.println(set2);

        // 1. Non-Iterator
        for (int i = 1; i <= 5; i++) {
            list.add(i);
            set.add(i + 5);
        }

        out.println(list);
        out.println(set);

        // 2. Non-Iterator, The Object of Iterable Collection
        /*
         * The Object of Iterable Collection. Iterable allows to the Developer to
         * iterate values and let the Developer can use `for-each-loop`
         */
        for (Integer iterableObject : list) {
            list2.add(iterableObject);
            set2.add(iterableObject + 5);
        }

        out.println(list2);
        out.println(set2);

        // 3. Iterator, The Object of Iterator Collection
        /*
         * The Object of Itereator Collection. Iterator is a Colllection type that
         * allows to iterate the values and let the Developer use `Iterator` not
         * `for-each-loop`
         */
        iterator = list.iterator();

        out.println("The Iterator of List : " + iterator);
        out.println("The Iterator of Set : " + set);
    }
}
