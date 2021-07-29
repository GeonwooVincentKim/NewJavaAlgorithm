package Collections.Iterator.IteratorClass;

import java.util.Iterator;

public class ManageIterator {
    private Iterator<Integer> iteratorInteger;

    public ManageIterator() {
    }

    public ManageIterator(Iterator<Integer> iteratorInteger) {
        this.setIteratorInteger(iteratorInteger);
    }

    public Iterator<Integer> getIteratorInteger() {
        return iteratorInteger;
    }

    public void setIteratorInteger(Iterator<Integer> iteratorInteger) {
        this.iteratorInteger = iteratorInteger;
    }

    public static String iteratorPrint(Iterator<Integer> iterator) {
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
