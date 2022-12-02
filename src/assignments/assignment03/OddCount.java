package assignments.assignment03;

public class OddCount {

    public static int loopBasedCount(int a, int b) {
        int count = 0;

        for (int i=Math.min(a, b); i<=Math.max(a, b); i++) {
            if (i % 2 != 0) {
                count ++;
            }
        }

        return count;
    }

    public static int mathBasedCount(int a, int b) {
        return (a % 2 == 0 && b % 2 == 0) ? Math.abs(a-b) / 2 : Math.abs(a-b) / 2 + 1;
    }

    public static void main(String[] args) {
        int[][] tests = new int[][] {
                {20, 100}, {50, 25}, {1, 99}, {-20, -50}, {583, -583},
                {333, 333}, {0, 0}, {-88, -88}, {9876543, -87654}, {-192, -235},
                {999999999, -999999999}
        };

        for (int[] test: tests) {
            int a = test[0];
            int b = test[1];

            int minAB = Math.min(a, b);
            int maxAB = Math.max(a, b);

            long start1 = System.currentTimeMillis();
            int c1 = loopBasedCount(a, b);
            long end1 = System.currentTimeMillis();
            System.out.printf("Loop-based solution: The number of odds in range [%d, %d] = %d\n", minAB, maxAB, c1);

            long start2 = System.currentTimeMillis();
            int c2 = mathBasedCount(a, b);
            long end2 = System.currentTimeMillis();
            System.out.printf("Math-based solution: The number of odds in range [%d, %d] = %d\n", minAB, maxAB, c2);

            System.out.printf("Loop-based solution ends in %d milliseconds\n", end1 - start1);
            System.out.printf("Math-based solution ends in %d milliseconds\n", end2 - start2);
            System.out.println();
        }
    }
}
