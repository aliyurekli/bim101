package lectures.lecture10;

import java.util.Arrays;

/**
 * Please refer to the course material slide #18
 */
public class RecursiveBinarySearch {

    public static int binarySearch(int[] array, int low, int high, int key) {

        if (high >= low && low <= array.length - 1) {

            int mid = low + (high - low) / 2;

            if (array[mid] == key)
                return mid;

            if (array[mid] > key)
                return binarySearch(array, low, mid - 1, key);

            return binarySearch(array, mid + 1, high, key);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] testArray = new int[] {55, 0, 1, 18, 2, 3, 5, -77, 13, 21, 34, -1};
        int[] testValues = new int[] {17, 21, 55};

        Arrays.sort(testArray);
        System.out.println("The array can be visualized as " + Arrays.toString(testArray));

        for (int t: testValues) {
            int pos = binarySearch(testArray, 0, testArray.length - 1, t);

            if (pos == -1) {
                System.out.println("Sorted array does not contain " + t);
            }
            else {
                System.out.printf("Sorted array contains %d at index %d\n", t, pos);
            }
        }
    }
}
