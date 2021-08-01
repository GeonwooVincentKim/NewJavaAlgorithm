package Collections.Set.TreeSet;

import java.util.Comparator;

@SuppressWarnings("unchecked")
public class Descend implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Comparable<Object> c1 = (Comparable<Object>) o1;
        Comparable<Object> c2 = (Comparable<Object>) o2;

        // Sort `Set` as Descending Order
        return functionFoo(c1, c2);
    }

    private int functionFoo(Comparable<Object> c1, Comparable<Object> c2) {
        return c1.compareTo((Object) c2) * -1;
    }
}
