package Collections.List.ArrayList;

// import static java.lang.System.out;

public class CustomArrayList {
    private Object[] array = new Object[100];
    private int index;
    private int size = 0;
    // private boolean isEmpty;
    // private static final int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        // this.size = DEFAULT_SIZE;
    }

    public CustomArrayList(int arrayLength) {
        this.setArray(array);
        this.setSize(size);
        this.setIndex(index);
    }

    // public static int getDefaultSize() {
    // return DEFAULT_SIZE;
    // }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object[] getarray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    // When the Index elemenet is the FirstIndex of the Array
    public boolean isFirstIndex(Object element) {
        return add(0, element);
    }

    // When the Index element is not lastIndex, but trying to insert between element
    // and elements
    public boolean add(int index, Object element) {
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = element;
        size++;

        return true;
    }

    // When the Index element is lastIndex of the Array
    public boolean add(Object element) {
        // Get the element that the newly added, and add into last element of array
        array[size] = element;
        size++;

        return true;
    }

    public Object get(int i) {
        return array[i];
    }

    public boolean isEmpty() {
        return (this.index == 0);
    }

    // public boolean isContain(Object element, int index) {
    public boolean isContain(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int arrayFrequency(Object element, int index) {
        // public int arrayFrequency(Object element) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (element == array[index]) {
                count++;
            }
        }

        return count;
    }

    public int arraysIndexOf(Object element, int index) {
        for (int i = 0; i < size; i++) {
            if (element == array[index]) {
                return i;
            }
        }

        return -1;
    }

    public Object remove(int index) {
        Object removeIndex = array[index];

        for (int i = index + 1; i <= size - 1; i++) {
            array[i - 1] = array[i];
        }

        size--;
        array[size] = null;
        return removeIndex;
    }
}
