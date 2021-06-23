package Collections.List.ArrayList;

public class NewCustomArrayList {

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
