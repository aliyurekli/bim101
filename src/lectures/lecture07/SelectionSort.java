package lectures.lecture07;

import java.util.Arrays;

/**
 * Please refer to the course material slide #7
 */
public class SelectionSort {

    public static void selectionSort(int[] array) {

        for (int i=0; i<array.length; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;

            for (int j=i+1; j<array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }

            if (currentMin != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {

        int[] testArray = new int[] {55, 0, 1, 18, 2, 3, 5, -77, 13, 21, 34, -1};

        selectionSort(testArray);
        System.out.println("The sorted array can be visualized as " + Arrays.toString(testArray));
    }
}
