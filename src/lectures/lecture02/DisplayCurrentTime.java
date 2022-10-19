package lectures.lecture02;

/**
 *  Please refer to the course material slide #2
 */
public class DisplayCurrentTime {

    private static final int TURKEY_GMT_DIFFERENCE = 3;

    public static void main(String[] args) throws Exception {
        while (true) {
            long elapsed = System.currentTimeMillis();

            long today = elapsed % (1000 * 60 * 60 * 24);

            int hour = (int) today / (1000 * 60 * 60);
            today -= hour * (1000 * 60 * 60);

            int minute = (int) today / (1000 * 60);
            today -= minute * (1000 * 60);

            int second = (int) today / (1000);

            System.out.printf("Current time is %d:%d:%d\n", hour + TURKEY_GMT_DIFFERENCE, minute, second);

            Thread.sleep(1000);
        }
    }
}
