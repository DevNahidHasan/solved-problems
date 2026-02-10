package b_medium;

import java.util.Arrays;

public class L2149_RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] A = {3,1,-2,-5,2,-4};

        int[] ans = rearrangeArray(A);

        // Print the rearranged array
        System.out.println(Arrays.toString(ans));
    }

    // Optimal Solution
    /*
        Complexity Analysis-

        Time Complexity: O(N), for traversing the array only once where N is the length of the array.

        Space Complexity: O(N) to store the resultant array.
     */
    public static int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];

        /* Initialize indices for positive
        and negative elements*/
        int p = 0;
        int n = 1;

        for (int i = 0; i < l; i++){
            if (nums[i] > 0){
                /* If current element is positive, place
                it at the next even index in ans*/
                ans[p] = nums[i];
                p += 2;
            }else{
                /* If current element is negative, place
                it at the next odd index in ans*/
                ans[n] = nums[i];
                n += 2;
            }
        }

        return ans;
    }
}
