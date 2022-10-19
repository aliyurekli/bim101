package lectures;

import java.util.Scanner;

/**
 * Please refer to the course material slide #2
 */
public class ComputeCircleArea {
    public static void main(String[] args) {
        double radius = 20.0;
        double area = radius * radius * Math.PI;

        System.out.printf("Area of the circle with radius %.2f is %.2f", radius, area);
    }
}
