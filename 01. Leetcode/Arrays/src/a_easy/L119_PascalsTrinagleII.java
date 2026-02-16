package a_easy;

import java.util.ArrayList;
import java.util.List;

public class L119_PascalsTrinagleII {
    public static void main(String[] args) {
        // row number
        int r = 4; // 0 based index

        // Function call to return the rth row of Pascal's triangle
        List<Integer> list = getRow(r);

        // Output
        System.out.println("Row " + (r + 1) + ": ");
        System.out.println(list);
    }

    public static List<Integer> getRow(int rowIndex) {
        int r = rowIndex + 1;// converting to 1 based index
        List<Integer> list = new ArrayList<>();// to store the answer

        // Set the first element of the row as 1
        list.add(1);

        // Compute each element in the rth row
        for (int i = 1; i < r; i++){
            long prev = list.get(i - 1);
            long curr = (prev * (r - i)) / i;// use long to avoid overflow
            list.add((int)curr);// cast long back to int
        }

        return list;
    }
}
