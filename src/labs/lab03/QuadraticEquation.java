package labs.lab03;

import java.util.Scanner;

/**
 * Please refer to the task in material Lab #3
 */
public class QuadraticEquation {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getCoefficientValue(char coefficient) {
        do {
            System.out.printf("Please enter the coefficient %c: ", coefficient);

            while(!SCANNER.hasNextInt()) {
                System.out.printf("The coefficient must be an integer number, please re-enter coefficient %c: ", coefficient);
                SCANNER.next();
            }

            return SCANNER.nextInt();
        } while (true);
    }

    private static double[] solve(int a, int b, int c) {
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant < 0) {
            return new double[0];
        }
        else if (discriminant == 0) {
            double root = ((double) -1 * b) / (2 * a);
            return new double[] {root};
        }
        else {
            double root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            double root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

            return new double[] {root1, root2};

        }
    }

    private static String buildEquation(int a, int b, int c) {
        return String.format("%dx^2%+dx%+d = 0", a, b, c);
    }

    private static void displayRoots(String equation, double[] roots) {
        System.out.printf("Quadratic equation %s ", equation);

        if (roots.length == 0) {
            System.out.println("has no real roots.");
            return;
        }

        System.out.println("has the following real roots:");
        for (int i=0; i<roots.length; i++) {
            System.out.printf("x%d = %.2f\n", i+1, roots[i]);
        }
    }

    public static void main(String[] args) {

        // Here is the input logic
        int a = getCoefficientValue('a');
        int b = getCoefficientValue('b');
        int c = getCoefficientValue('c');

        // Here is the algorithm logic
        double[] roots = solve(a, b, c);

        // Here is the output logic
        String equation = buildEquation(a, b, c);
        displayRoots(equation, roots);
    }
}
