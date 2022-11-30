package lectures.lecture07;

/**
 * Please refer to the course material slide #7
 */
public class DifferencePassByValue {

    public static void test(int number, int[] numbers) {
        number = 1001;
        numbers[0] = 5555;

        System.out.println(number);
        System.out.println(numbers[0]);
    }

    public static void main(String[] args) {
        int x = 1;
        int[] y = new int[10];

        test(x, y);

        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    }
}
