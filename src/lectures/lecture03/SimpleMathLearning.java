package lectures.lecture03;

import java.util.Scanner;

/**
 * Please refer to the course material slide #3
 */
public class SimpleMathLearning {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);

        Scanner scanner = new Scanner(System.in);

        System.out.printf("What is %d + %d?\n", a, b);
        int answer = scanner.nextInt();

        if (answer == a + b)
            System.out.println("True :)");
        else
            System.out.println("False :(");
    }
}
