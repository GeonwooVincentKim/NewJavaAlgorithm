package Collections.Iterator.IteratorClass;

import java.util.Iterator;
import java.util.Set;

public class ManageIterator {
    private Iterator<Integer> iteratorInteger;
    private Iterator<Set<Integer>> IteratorSet;

    public ManageIterator() {
    }

    public ManageIterator(Iterator<Integer> iteratorInteger, Iterator<Set<Integer>> iteratorSet) {
        this.setIteratorInteger(iteratorInteger);
        this.setIteratorSet(iteratorSet);
    }

    public Iterator<Integer> getIteratorInteger() {
        return iteratorInteger;
    }

    public void setIteratorInteger(Iterator<Integer> iteratorInteger) {
        this.iteratorInteger = iteratorInteger;
    }

    public Iterator<Set<Integer>> getIteratorSet() {
        return IteratorSet;
    }

    public void setIteratorSet(Iterator<Set<Integer>> iteratorSet) {
        this.IteratorSet = iteratorSet;
    }

    public static String iteratorIntegerPrint(Iterator<Integer> iterator) {
        String result = "";

        int i = 0;
        while (iterator.hasNext()) {
            ++i;
            result += "#" + i + " 번째 인덱스 값 -> " + iterator.next() + "\n";
            iterator.remove();
        }

        return result;
    }

    public static String iteratorSetPrint(Iterator<Set<Integer>> iterator) {
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
