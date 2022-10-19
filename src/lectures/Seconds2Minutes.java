package lectures;

import java.util.Scanner;

/**
 * Please refer to the course material slide #2
 */
public class Seconds2Minutes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter the total seconds: ");
        int input = s.nextInt();

        int minutes = input / 60;
        int seconds = input % 60;

        System.out.println(input + " seconds is " + minutes + " minutes and " + seconds + " seconds");
    }
}
