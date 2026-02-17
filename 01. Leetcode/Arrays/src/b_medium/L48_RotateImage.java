package b_medium;

import java.util.Arrays;

public class L48_RotateImage {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rotate(arr);

        // Output the rotated matrix
        System.out.println("Rotated Image:");
        System.out.println(Arrays.deepToString(arr));
    }
/*
Complexity Analysis -
Time Complexity: O(N^2) +O(N^2), to linearly iterate and find transpose of the matrix and another O(N^2) to find the reverse of each row.

Space Complexity: O(1), as no extra space is being used.
 */
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                // Swap elements across the diagonal
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        // Reverse each row of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {

                // Swap elements symmetrically
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;

            }
        }
    }
}
