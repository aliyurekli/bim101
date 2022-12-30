package labs.lab09;

/**
 * Please refer to the task in material Lab #9
 */
public class TimeBoundedFibonacci {

    private int timeLimit;

    public TimeBoundedFibonacci() {
        this.timeLimit = 100;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public void run() {
        int n = 0;

        while (true) {
            long start = System.currentTimeMillis();
            long fibN = fibonacci(n);
            long timeElapsed = System.currentTimeMillis() - start;

            if (timeElapsed <= timeLimit) {
                System.out.printf("fibonacci(%d) = %d is computed at %d milliseconds\n", n++, fibN, timeElapsed);
            }
            else {
                System.out.printf("Time limit has been reached at fibonacci(%d)\n", n);
                break;
            }
        }
    }

    public long fibonacci(int n) {
        if (n <= 1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
