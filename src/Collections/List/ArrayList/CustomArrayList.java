package Collections.List.ArrayList;

public class CustomArrayList {
    // public static final int DEFAULT_SIZE = 10;
    private int size = 10;
    private Object[] elementData = new Object[100];

    CustomArrayList() {
    }

    public boolean addFirst(Object element) {
        return add(0, element);
    }

    public boolean add(int index, Object element) {
        for (int i = size; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }

        elementData[index] = element;
        size++;

        return true;
    }

}
