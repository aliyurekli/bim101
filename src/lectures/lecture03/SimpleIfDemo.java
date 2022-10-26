package lectures.lecture03;

import java.util.Scanner;

/**
 * Please refer to the course material slide #3
 */
public class SimpleIfDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int in = scanner.nextInt();

        if (in % 2 == 0)
            System.out.println("HiEven");
        if (in % 5 == 0)
            System.out.println("HiFive");
    }
}
