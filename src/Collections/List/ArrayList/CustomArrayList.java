package Collections.List.ArrayList;

import static java.lang.System.out;

public class CustomArrayList {
    private Object[] array = new Object[100];
    private int index;
    private int size = 10;
    private boolean isEmpty;
    private static final int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        this.size = DEFAULT_SIZE;
    }

    public CustomArrayList(int arrayLength) {
        this.setArray(array);
        this.setSize(size);
        this.setIndex(index);
    }

    public static int getDefaultSize() {
        return DEFAULT_SIZE;
    }

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
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = element;
        size++;

        return true;
    }

    // When the Index element is lastIndex of the Array
    public boolean add(Object element) {
        array[index] = element;
        size++;

        return true;
    }

    public Object get(int i) {
        if (i > this.index) {
            out.println("Invalid");
            return null;
        } else if (this.isEmpty) {
            return null;
        } else {
            return this.array[i];
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (this.index == 0);
    }

    public Object remove(int i) {
        Object returnO = this.array[i];
        for (int j = i; j < this.index - 1; j++) {
            this.array[j] = this.array[j + 1];
        }

        this.index--;
        return returnO;
    }
}
