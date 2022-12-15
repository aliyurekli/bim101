package assignments.assignment01;

import java.util.Scanner;

/**
 * Please refer to the material in Assignment #1
 */
public class Grading {

    public static double getScore() {
        double score;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter the overall score: ");

            // hasNextDouble returns true if the next token in scanner can be interpreted as a double value
            while(!scanner.hasNextDouble()) {
                System.out.print("The overall score must be a real number, please re-enter: ");
                scanner.next();
            }

            score = scanner.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("The input must be in range [0, 100].");
            }
        } while (score < 0 || score > 100);

        return score;
    }

    public static void evaluate(double score) {
        String grade, state = "Passed";

        if (score >= 90) {
            grade = "AA";
        }
        else if (score >= 85) {
            grade = "AB";
        }
        else if (score >= 80) {
            grade = "BA";
        }
        else if (score >= 75) {
            grade = "BB";
        }
        else if (score >= 70) {
            grade = "CB";
        }
        else if (score >= 65) {
            grade = "CC";
        }
        else if (score >= 60) {
            grade = "DC";
        }
        else if (score >= 50) {
            grade = "DD";
        }
        else {
            grade = "FF";
            state = "Failed";
        }

        System.out.printf("Score: %.2f\tGrade: %s\tState: %s\n", score, grade, state);
    }

    public static void main(String[] args) {

        double score = getScore();
        evaluate(score);
    }
}
