package lectures.lecture10;

/**
 * Please refer to the course material slide #18
 */
public class RecursiveFactorial {

    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            System.out.printf("%d! = %d\n", i, factorial(i));
        }
    }
}
