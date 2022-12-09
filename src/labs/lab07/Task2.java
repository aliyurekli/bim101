package labs.lab07;

/**
 * Please refer to the task in material Lab #7
 */
public class Task2 {

    public static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] original = new int[][] {
                {5, 8},
                {6, 0},
                {9, 6}
        };
        System.out.printf("The original %dx%d matrix:\n", original.length, original[0].length);
        printMatrix(original);

        int[][] transpose = transpose(original);
        System.out.printf("The transpose %dx%d matrix:\n", transpose.length, transpose[0].length);
        printMatrix(transpose);
    }
}