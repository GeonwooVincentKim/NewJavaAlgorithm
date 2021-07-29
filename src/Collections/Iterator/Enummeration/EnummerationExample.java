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

    // Print Enummerartion value to get enumerated value
    public static String printEnumeration(Enumeration<Integer> enumeration) {
        String result = "";

        while (enumeration.hasMoreElements()) {
            out.println(enumeration.nextElement());
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

        // 3. Print Enumerated values.
        out.println("Enumeration 출력 : ");
        String printEnumerationValue = printEnumeration(enumeration);
        out.println(printEnumerationValue);

        // 4. Iterate vector type values.
        Iterator<Integer> it = vector.iterator();
        out.println(it);

        // 5. Print Vector type values.
        out.println("Iterator 출력 : ");
        while (it.hasNext()) {
            out.println(it.next());
        }
    }
}
