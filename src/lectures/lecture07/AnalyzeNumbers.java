package lectures.lecture07;

/**
 * Please refer to the course material slide #7
 */
public class AnalyzeNumbers {

    public static int[] getRandomArray(int n) {
        int[] array = new int[n];

        for (int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        return array;
    }

    public static double getAverage(int[] array) {
        double sum = 0;

        for (int a: array)
            sum += a;

        return sum / array.length;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }
    }

    public static int countGreaterThanAvg(int[] array, double avg) {
        int result = 0;

        for (int a: array) {
            if(a > avg) {
                result ++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] myArray = getRandomArray(5);
        printArray(myArray);

        double avg = getAverage(myArray);
        System.out.println("Average = " + avg);

        int grtThanAvg = countGreaterThanAvg(myArray, avg);
        System.out.println("Number of elements greater than the average = " + grtThanAvg);
    }
}
