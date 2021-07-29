package Collections.Iterator.IteratorClass;

import java.util.Iterator;

public class ManageIterator {
    // Allows all Class Type of <?>, Generic
    private Iterator<?> iteratorInteger;

    public ManageIterator() {
    }

    public ManageIterator(Iterator<?> iteratorInteger) {
        this.setIteratorInteger(iteratorInteger);
    }

    public Iterator<?> getIteratorInteger() {
        return iteratorInteger;
    }

    public void setIteratorInteger(Iterator<?> iteratorInteger) {
        this.iteratorInteger = iteratorInteger;
    }

    public static String iteratorPrint(Iterator<?> iterator) {
        String result = "";

        int i = 0;
        while (iterator.hasNext()) {
            ++i;
            result += "#" + i + " 번째 인덱스 값 -> " + iterator.next() + "\n";
            iterator.remove();
        }

        return result;
    }
}
