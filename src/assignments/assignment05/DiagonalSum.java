package assignments.assignment05;

import java.util.Random;

/**
 * Please refer to the material in Assignment #5
 */
public class DiagonalSum {

    private static final Random RANDOMIZER = new Random();

    public static int getRandomSize() {
        int min = 1;
        int max = 10;

        return RANDOMIZER.nextInt(max - min) + min;
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int min = 1;
        int max = 20;

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = RANDOMIZER.nextInt(max - min) + min;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.printf("The %d-by-%d matrix:\n", matrix.length, matrix[0].length);

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int computeSum(int[][] matrix) {
        int left = 0;
        int right = 0;

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {

                if (i == j) {
                    left += matrix[i][j];
                }

                if (i + j == matrix.length - 1) {
                    right += matrix[i][j];
                }
            }
        }

        return left + right;
    }

    public static void main(String[] args) {

        // create a random number between 1 and 10 to be the size of the matrix
        int n = getRandomSize();

        // create a random n-by-n matrix that has cell values between 1 and 20
        int[][] matrix = generateMatrix(n);

        // print the matrix
        printMatrix(matrix);

        // compute the sum of left and right diagonals of the matrix
        int diagonalSum = computeSum(matrix);

        // print the sum of diagonals
        System.out.println("The sum of left and right diagonals is " + diagonalSum);
    }
}
