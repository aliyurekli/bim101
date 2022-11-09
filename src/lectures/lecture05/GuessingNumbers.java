package lectures.lecture05;

import java.util.Scanner;

/**
 * Please refer to the course material slide #5
 */
public class GuessingNumbers {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 101);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess my number:");

        while (true) {
            int answer = scanner.nextInt();

            if (answer == a) {
                System.out.println("Correct :)");
                break;
            }
            else if (answer > a) {
                System.out.println("Too high, let's give another try.");
            }
            else {
                System.out.println("Too low, let's give another try.");
            }
        }
    }
}
