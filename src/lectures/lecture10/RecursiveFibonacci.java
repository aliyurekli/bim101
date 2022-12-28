package lectures.lecture10;

/**
 * Please refer to the course material slide #18
 */
public class RecursiveFibonacci {

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            System.out.printf("fibonacci(%d) = %d\n", i, fibonacci(i));
        }
    }
}
