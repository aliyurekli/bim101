package lectures.lecture08;

/**
 * Please refer to the course material slide #8
 */
public class ClosestPoints {

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public static void main(String[] args) {

        double[][] coordinates = new double[][] {
                {-1, 3},
                {-1, -1},
                {1, 1},
                {2, 0.5},
                {2, -1},
                {3, 3},
                {4, 2},
                {4, -0.5}
        };

        double min = Double.MAX_VALUE;
        int p1 = -1;
        int p2 = -1;

        for (int i=0; i<coordinates.length; i++) {
            for (int j=i+1; j<coordinates.length; j++) {
                double x1 = coordinates[i][0];
                double y1 = coordinates[i][1];

                double x2 = coordinates[j][0];
                double y2 = coordinates[j][1];

                double distance = distance(x1, y1, x2, y2);
                if (distance < min) {
                    min = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }

        System.out.printf("Minimum distance = %.5f\n", min);
        System.out.printf("Point 1 = [%.1f, %.1f]\n", coordinates[p1][0], coordinates[p1][1]);
        System.out.printf("Point 2 = [%.1f, %.1f]\n", coordinates[p2][0], coordinates[p2][1]);

    }
}
