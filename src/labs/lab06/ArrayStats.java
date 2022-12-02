package labs.lab06;

import java.util.Arrays;

/**
 * Please refer to the task in material Lab #6
 */
public class ArrayStats {

    public static int[] initRandomArray() {
        int[] array = new int[(int) (Math.random() * 20) + 1];

        for (int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;
        }

        return array;
    }

    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int a: array) {
            if (a > max) {
                max = a;
            }
        }

        return max;
    }

    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int a: array) {
            if (a < min) {
                min = a;
            }
        }

        return min;
    }

    public static double getMean(int[] array) {
        double sum = 0;

        for (int a: array) {
            sum += a;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {

        System.out.println("Initializing a random array...");
        int[] randomArray = initRandomArray();

        System.out.println("The array can be visualized as " + Arrays.toString(randomArray));

        int len = randomArray.length;
        System.out.println("The length of the array is " + len);

        int max = getMax(randomArray);
        System.out.println("The maximum value in the array is " + max);

        int min = getMin(randomArray);
        System.out.println("The minimum value in the array is " + min);

        double mean = getMean(randomArray);
        System.out.println("The mean of the array is " + String.format("%.3f", mean));
    }
}
