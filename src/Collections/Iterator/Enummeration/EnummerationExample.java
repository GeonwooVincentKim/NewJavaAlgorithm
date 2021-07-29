package Collections.Iterator.Enummeration;

import static java.lang.System.out;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnummerationExample {
    // Print Vector values to get vector type values
    public static Vector<Integer> getIntegerValues(int vectorLength) {
        Vector<Integer> vector = new Vector<>();

        for (int i = 1; i <= vectorLength; i++) {
            vector.add(i);
        }

        return vector;
    }

    // Print Enummerartion value to check that the value which were converted from
    // Integer insert into Enumeration type well or not.
    public static String printEnumeration(Enumeration<Integer> enumeration) {
        String result = "";

        while (enumeration.hasMoreElements()) {
            result += enumeration.nextElement() + " ";
        }

        return result;
    }

    // Print Iterator type value to check that the value which were converted from
    // Integer insert into Iterator type value well or not.
    public static String printIterator(Iterator<Integer> iterator) {
        String result = "";

        while (iterator.hasNext()) {
            result += iterator.next() + " ";
        }

        return result;
    }

    public static void main(String[] args) {
        // 1. Input the vectorLength to get Integer values by using Vector type values
        int vectorLength = 5;
        Vector<Integer> vector = getIntegerValues(vectorLength);

        // 2. Enumerate Vector type value as Enumeration type values.
        Enumeration<Integer> enumeration = vector.elements();
        out.println(enumeration);
        out.println();

        // 3. Print Enumerated values.
        String printEnumerationValue = printEnumeration(enumeration);
        out.println("Enumeration 출력 : " + printEnumerationValue);
        out.println("\n\n");

        // 4. Iterate vector type values.
        Iterator<Integer> iterator = vector.iterator();
        out.println(iterator);
        out.println();

        // 5. Print Vector type values.
        String printIteratorValue = printIterator(iterator);
        out.println("Iterator 출력 : " + printIteratorValue);
        out.println();
    }
}
