package labs.lab02;

import java.util.Scanner;

/**
 * Please refer to the task in material Lab #2
 */
public class ComputeTriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first side of the triangle: ");
        double a = scanner.nextDouble();

        System.out.println("Please enter the second side of the triangle: ");
        double b = scanner.nextDouble();

        System.out.println("Please enter the third side of the triangle: ");
        double c = scanner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("All sides of a triangle must be positive, program terminates.");
            System.exit(0);
        }

        if (a >= (b+c) || b >= (a+c) || c >= (a+b)) {
            System.out.println("A side of a triangle must be smaller than the sum of the two other sides, program terminates.");
            System.exit(0);
        }

        double semiPerimeter = (a + b + c) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        System.out.printf("The area of the triangle is %.2f", area);
    }
}
