package lectures.lecture06;

/**
 * Please refer to the course material slide #6
 */
public class MaxInteger {

    public static int max(int num1, int num2) {
        int result;

        if (num1 >= num2) {
            result = num1;
        }
        else {
            result = num2;
        }

        return result;
    }

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);

        System.out.println("Maximum of " + i + " and " + j + " is " + k);
    }
}
