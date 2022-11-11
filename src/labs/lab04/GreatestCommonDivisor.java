package labs.lab04;

import java.util.Scanner;

/**
 * Please refer to the task in material Lab #4
 */
public class GreatestCommonDivisor {

    private static int bruteForceGCD(int a, int b) {
        int gcd = 1;
        int min = Math.min(a, b);

        for (int i=2; i<=min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    private static int euclideanGCD(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int k = a % b;
        while (k != 0) {
            a = b;
            b = k;
            k = a % b;
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            System.out.println("Type 'b' for Brute Force GCD, 'e' for Euclidean GCD, 'q' to quit:");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'b':
                case 'e':
                    int a = 1 + (int) (Math.random() * 1000);
                    int b = 1 + (int) (Math.random() * 1000);

                    if (choice == 'b') {
                        int gcd = bruteForceGCD(a, b);
                        System.out.printf("Brute Force GCD algorithms results in GCD(%d, %d) = %d\n", a, b, gcd);
                    }
                    else {
                        int gcd = euclideanGCD(a, b);
                        System.out.printf("Euclidean GCD algorithms results in GCD(%d, %d) = %d\n", a, b, gcd);
                    }

                    break;
                case 'q':
                    loop = false;
                    System.out.println("Program terminates.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

