package lectures.lecture03;

import java.util.Scanner;

/**
 * Please refer to the course material slide #3
 */
public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter weight in kilograms and height in meters");
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25.0)
            status = "Normal";
        else if (bmi < 30.0)
            status = "Overweight";
        else
            status = "Obese";

        System.out.printf("Calculated BMI: %.2f\n", bmi);
        System.out.println("Current status: " + status);
    }
}
