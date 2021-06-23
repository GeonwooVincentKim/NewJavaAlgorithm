package Collections.List.LinkedList;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListCompare2 {
    public static void main(String[] args) {
        // Subsititude Integer-Array to avoid `Yellow-Error-Line`
        ArrayList<Integer> arrayList = new ArrayList<>();
        out.println(arrayList);

        // Subsititude Integer-Array to avoid `Yellow-Error-Line`
        LinkedList<Integer> linkedList = new LinkedList<>();
        out.println(linkedList);

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Section for the time required of `ArrayList`
        out.println("ArrayList 추가");

        long start = System.currentTimeMillis();
        out.println(start);

        for (int i = 0; i < 10000; i++) {
            arrayList.add(500, i);
        }

        long end = System.currentTimeMillis();
        out.println(end);

        out.println(end - start);

        // Section for the time required of `LinkedList`
        out.println("LinkedList 추가");

        start = System.currentTimeMillis();
        out.println(start);

        for (int i = 0; i < 10000; i++) {
            linkedList.add(500, i);
        }

        end = System.currentTimeMillis();
        out.println(end);

        out.println(end - start);
    }
}
