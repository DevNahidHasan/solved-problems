package b_medium;

import java.util.ArrayList;
import java.util.List;

public class L54_SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix3 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] matrix4 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] matrix5 = {{1}, {2}, {3}, {4}, {5}};
        System.out.println(spiralOrder(matrix5));
    }

    //Complexity Analysis
    //Time Complexity: O(MxN) since all the elements are being traversed once and there are total N x M elements ( M elements in each row and total N rows) so the time complexity will be O(N x M).
    //
    //Space Complexity: O(1) as extra space to store answer is not considered.

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        // Number of rows
        int n = matrix.length;

        // Number of columns
        int m = matrix[0].length;

        // Initialize pointers for traversal
        int top = 0, left = 0;
        int bottom = n - 1, right = m - 1;

        // Traverse the matrix in spiral order
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; ++i) {
                ans.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; ++i) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left
            // make sure that is atleast one row available
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top
            // make sure that is atleast one column available
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        //Return the ans
        return ans;
    }
}
