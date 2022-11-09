package lectures.lecture05;

import java.util.Scanner;

/**
 * Please refer to the course material slide #5
 */
public class RepeatAdditionUntilCorrect {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("What is %d + %d?\n", a, b);

        while (true) {
            int answer = scanner.nextInt();

            if (answer == a + b) {
                System.out.println("True :)");
                break;
            }
            else {
                System.out.println("False :(");
                System.out.println("Let's give another try.");
            }
        }
    }
}
