package lectures;

import java.util.Scanner;

/**
 *  Please refer to the course material slide #2
 */
public class ComputeCircleAreaWithInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the value of radius: ");
        double radius = scanner.nextDouble();
        double area = radius * radius * Math.PI;

        System.out.printf("Area of the circle with radius %.2f is %.2f", radius, area);
    }
}
