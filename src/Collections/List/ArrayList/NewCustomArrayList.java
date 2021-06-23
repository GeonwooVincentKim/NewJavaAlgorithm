package Collections.List.ArrayList;

public class NewCustomArrayList {
    private int[] getArray;
    private int size;
    private int index;

    public NewCustomArrayList() {
    }

    public NewCustomArrayList(int[] getArray, int size, int index) {
        this.setGetArray(getArray);
        this.setSize(size);
        this.setIndex(index);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getGetArray() {
        return getArray;
    }

    public void setGetArray(int[] getArray) {
        this.getArray = getArray;
    }

    // Swap the position of index of array
    public static void swapArray(int[] getArray, int i, int j) {
        int temp = getArray[i];
        getArray[i] = getArray[j];
        getArray[j] = temp;
    }

    // Display Array Size
    public static int getArraySize(int[] getArray) {
        return getArray.length;
    }

    // Check index is exist in array
    public static int isIndexOf(int[] getArray, int index) {
        for (int i = 0; i < getArray.length; i++) {
            if (getArray[i] == index) {
                return i;
            }
        }
        return -1;
    }

    // Check how many times does the same index iterate
    public static int arrayFrequency(int[] getArray, int index) {
        int count = 0;

        for (int i = 0; i < getArray.length; i++) {
            if (getArray[i] == index) {
                count++;
            }
        }

        return count;
    }

    // Check there are duplicate value exist in array
    public static boolean isContain(int[] getArray, int index) {
        for (int i = 0; i < getArray.length; i++) {
            if (getArray[i] == index) {
                return true;
            }
        }
        return false;
    }
}
