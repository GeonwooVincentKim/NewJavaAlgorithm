package Collections.Iterator.Enummeration;

import static java.lang.System.out;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnummerationExample {
    public static Vector<Integer> getIntegerValues(int vectorLength) {
        Vector<Integer> vector = new Vector<>();

        for (int i = 1; i <= vectorLength; i++) {
            vector.add(i);
        }

        return vector;
    }

    public static String printEnumeration(Enumeration<Integer> enumeration) {
        String result = "";

        while (enumeration.hasMoreElements()) {
            out.println(enumeration.nextElement());
        }

        return result;
    }

    public static void main(String[] args) {
        int vectorLength = 5;
        Vector<Integer> vector = getIntegerValues(vectorLength);

        Enumeration<Integer> enumeration = vector.elements();
        out.println(enumeration);

        out.println("Enumeration 출력 : ");
        String printEnumerationValue = printEnumeration(enumeration);
        out.println(printEnumerationValue);

        Iterator<Integer> it = vector.iterator();
        out.println(it);

        out.println("Iterator 출력 : ");
        while (it.hasNext()) {
            out.println(it.next());
        }
    }
}
