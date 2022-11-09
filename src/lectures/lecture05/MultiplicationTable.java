package lectures.lecture05;

/**
 * Please refer to the course material slide #5
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++) {
            System.out.println("*** " + i + " ***");

            for (int j=1; j<=10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }

            System.out.println();
        }
    }
}
