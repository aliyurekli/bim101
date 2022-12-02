package lectures.lecture07;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Please refer to the course material slide #7
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int n) {
        int low = 0;
        int high = array.length;

        while (high >= low) {
            int mid = (high + low) / 2;

            if (array[mid] == n)
                return mid;
            else if (n > array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] testArray = new int[] {55, 0, 1, 18, 2, 3, 5, -77, 13, 21, 34, -1};
        int[] testValues = new int[] {17, 21, 55};

        Arrays.sort(testArray);
        System.out.println("The array can be visualized as " + Arrays.toString(testArray));

        for (int t: testValues) {
            int pos = binarySearch(testArray, t);

            if (pos == -1) {
                System.out.println("Sorted array does not contain " + t);
            }
            else {
                System.out.printf("Sorted array contains %d at index %d\n", t, pos);
            }
        }
    }
}
