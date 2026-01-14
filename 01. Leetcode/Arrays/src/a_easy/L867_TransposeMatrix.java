package a_easy;

import java.util.Arrays;

public class L867_TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposed = new int[n][m];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;

    }
}
