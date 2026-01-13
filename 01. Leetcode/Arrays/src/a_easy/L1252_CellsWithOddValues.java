package a_easy;

public class L1252_CellsWithOddValues {
    public static void main(String[] args){
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(2,3,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m], col = new int[n];
        for (int[] arr : indices) {
            row[arr[0]]++;
            col[arr[1]]++;
        }
        int oddRow = 0, oddCol = 0;
        for (int i = 0; i < m; i++)
            if (row[i] % 2 == 1)
                oddRow++;
        for (int i = 0; i < n; i++)
            if (col[i] % 2 == 1)
                oddCol++;
        return oddRow * (n - oddCol) + (m - oddRow) * oddCol;
    }
}
