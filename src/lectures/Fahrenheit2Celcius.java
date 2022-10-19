package lectures;

import java.util.Scanner;

/**
 *  Please refer to the course material slide #2
 */
public class Fahrenheit2Celcius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the Fahrenheit degree: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = ((double) 5 / 9) * (fahrenheit-32);

        System.out.printf("%.2f Fahrenheit = %.2f Celcius", fahrenheit, celsius);
    }
}
