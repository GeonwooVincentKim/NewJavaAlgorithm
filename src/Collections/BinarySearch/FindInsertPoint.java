package Collections.BinarySearch;

import static java.lang.System.out;

public class FindInsertPoint {
    static int LowerInsertionPoint(int arr[], int n, int X) {

        // Base cases
        if (X < arr[0]) {
            return 0;
        } else if (X > arr[n - 1]) {
            return n;
        }

        int lowerPnt = 0;
        // int i = 1;

        // while (i < n && arr[i] < X) {
        // lowerPnt = i;
        // i = i * 2;
        // }

        // Final check for the remaining elements which are < X
        while (lowerPnt < n && arr[lowerPnt] < X)
            lowerPnt++;

        return lowerPnt;
    }

    // Driver code
    public static void main(String[] args) {
        // int arr[] = new int[20];
        int arr[] = { 2, 3, 4, 4, 5, 6, 7, 9 };
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = (int) (Math.random() * (10 - 1 + 1)) + 1;
        // }

        int n = arr.length;

        int X = 3;
        // System.out.println(LowerInsertionPoint(arr, n, X));
        int result = LowerInsertionPoint(arr, n, X);

        out.println(result);

        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i] + " ");
        }

        // if (result == -1) {
        // out.println(result + "\n" + "You can add the data");
        // } else {
        // out.println(result + "\n" + "The Data is already Exist");
        // }
    }
}
