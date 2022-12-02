package lectures.lecture07;

/**
 * Please refer to the course material slide #7
 */
public class LinearSearch {

    public static int linearSearch(int[] array, int n) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == n)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] testArray = new int[] {55, 0, 1, 18, 2, 3, 5, -77, 13, 21, 34, -1};
        int[] testValues = new int[] {17, 21, 55};

        for (int t: testValues) {
            int pos = linearSearch(testArray, t);

            if (pos == -1) {
                System.out.println("Array does not contain " + t);
            }
            else {
                System.out.printf("Array contains %d at index %d\n", t, pos);
            }
        }
    }
}
