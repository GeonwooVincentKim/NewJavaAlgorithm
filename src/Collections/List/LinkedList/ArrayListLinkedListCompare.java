package Collections.List.LinkedList;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListCompare {
    public static void main(String[] args) {
        // Initialized as Integer array type to avoid `Yellow-Warning-Line`
        ArrayList<Integer> arrayList = new ArrayList<>();
        out.println(arrayList);

        // Initialized as Integer array type to avoid `Yellow-Warning-Line`
        LinkedList<Integer> linkedList = new LinkedList<>();
        out.println(linkedList);

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Section for check the time required of ArrayList
        out.println("ArrayList Access");

        long start = System.currentTimeMillis();
        out.println(start);

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }

        long end = System.currentTimeMillis();
        out.println(end);

        out.println(end - start);

        // Section for check the time required of LinkedList
        out.println("LinkedList Access");

        start = System.currentTimeMillis();
        out.println(start);

        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }

        end = System.currentTimeMillis();
        out.println(end);

        out.println(end - start);
    }
}
