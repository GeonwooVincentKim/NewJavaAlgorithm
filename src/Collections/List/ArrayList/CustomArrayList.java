package Collections.List.ArrayList;

import static java.lang.System.out;

public class CustomArrayList {
    // public static final int DEFAULT_SIZE = 10;
    private int size = 10;
    private int index;
    private Object[] elementData = new Object[100];

    CustomArrayList() {
    }

    public boolean addFirst(Object element) {
        return add(0, element);
    }

    public boolean add(Object element) {
        elementData[size] = element;
        size++;

        return true;
    }

    public Object get(int i) {
        if (i > this.index) {
            out.println("Invalid");
            return null;
        } else if (this.index == this.elementData.length) {
            out.println("Array is Empty");
            return null;
        } else {
            return this.elementData[i];
        }

    }

    public boolean add(int index, Object element) {
        for (int i = size; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }

        elementData[index] = element;
        size++;

        return true;
    }

    public int size() {
        return size;
    }
}
