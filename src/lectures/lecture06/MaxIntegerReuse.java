package lectures.lecture06;

/**
 * Please refer to the course material slide #6
 */
public class MaxIntegerReuse {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = MaxInteger.max(i, j);

        System.out.println("Maximum of " + i + " and " + j + " is " + k);
    }
}
