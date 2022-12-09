package labs.lab07;

/**
 * Please refer to the task in material Lab #7
 */
public class Task1 {

    public static int[][] getFourByFourMatrix() {
        int[][] temp = new int[4][4];

        for (int i=0; i<temp.length; i++) {
            for (int j=0; j<temp[i].length; j++) {
                temp[i][j] = (int) (Math.random() * 100) % 2;
            }
        }

        return temp;
    }

    public static int mostOnesByRow(int[][] matrix) {
        int rowIndex = -1;
        int maxOnes = -1;

        for (int i=0; i<matrix.length; i++) {
            int temp = 0;

            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    temp ++;
                }
            }

            if (temp > maxOnes) {
                rowIndex = i;
                maxOnes = temp;
            }
        }

        return rowIndex;
    }

    public static int mostOnesByColumn(int[][] matrix) {
        int columnIndex = -1;
        int maxOnes = -1;

        for (int i=0; i<matrix[0].length; i++) {
            int temp = 0;

            for (int j=0; j<matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    temp ++;
                }
            }

            if (temp > maxOnes) {
                columnIndex = i;
                maxOnes = temp;
            }
        }

        return columnIndex;
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

        int[][] m = getFourByFourMatrix();
        printMatrix(m);

        int mostRow = mostOnesByRow(m);
        System.out.println("The row with most ones: " + mostRow);

        int mostColumn = mostOnesByColumn(m);
        System.out.println("The column with most ones: " + mostColumn);
    }
}
