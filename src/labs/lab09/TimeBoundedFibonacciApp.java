package labs.lab09;

/**
 * Please refer to the task in material Lab #9
 */
public class TimeBoundedFibonacciApp {

    public static void main(String[] args) {
        TimeBoundedFibonacci tbf = new TimeBoundedFibonacci();

        System.out.printf("Running app with time limit %d milliseconds\n", tbf.getTimeLimit());
        tbf.run();

        tbf.setTimeLimit(300);
        System.out.printf("Running app with time limit %d milliseconds\n", tbf.getTimeLimit());
        tbf.run();
    }
}
