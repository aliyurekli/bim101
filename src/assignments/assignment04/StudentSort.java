package assignments.assignment04;

import java.util.Arrays;

/**
 * Please refer to the material in Assignment #4
 */
public class StudentSort {

    public static String[] sortByHeight(String[] names, int[] heights) {
        String[] copyNames = new String[names.length];
        System.arraycopy(names, 0, copyNames, 0, names.length);

        int[] copyHeights = new int[heights.length];
        System.arraycopy(heights, 0, copyHeights, 0, heights.length);

        for (int i=0; i<copyHeights.length; i++) {
            int maxHeightIndex = i;
            int maxHeight = copyHeights[i];
            String maxName = copyNames[i];

            for (int j=i+1; j<copyHeights.length; j++) {
                if (copyHeights[j] > maxHeight) {
                    maxHeightIndex = j;
                    maxHeight = copyHeights[j];
                    maxName = copyNames[j];
                }
            }

            if (maxHeightIndex != i) {
                copyHeights[maxHeightIndex] = copyHeights[i];
                copyHeights[i] = maxHeight;

                copyNames[maxHeightIndex] = copyNames[i];
                copyNames[i] = maxName;
            }
        }

        return copyNames;
    }

    public static void main(String[] args) {

        String[][] testNames = {
                {"Bilal", "Bahar", "Enhar"},
                {"Gizem", "Orhan", "Ege", "Meral"},
                {"Haitham", "Losine"}
        };

        int[][] testHeights = {
                {185, 169, 170},
                {173, 171, 178, 166},
                {181, 171}
        };

        for (int i=0; i<testNames.length; i++) {
            String[] names = testNames[i];
            int[] heights = testHeights[i];

            String[] sortedNames = sortByHeight(names, heights);

            System.out.println(Arrays.toString(names));
            System.out.println(Arrays.toString(heights));
            System.out.println(Arrays.toString(sortedNames));
        }
    }
}
