package b_medium;

import java.util.Arrays;

public class L3634_MinimumRemovals {
    public static void main(String[] args) {
        int[] nums = {1,6,2,9};
        int k = 3;
        System.out.println(minRemoval(nums,k));
    }
    public static int minRemoval(int[] nums, int k) {
        int n = nums.length;

        if ( n == 1){
            return 0;
        }

        Arrays.sort(nums); // sorting in O(nlogn) time
        int i = 0;
        int j = 0;
        long max = nums[0], min = nums[0];
        int L = 1;

        while (j < n){
            min = nums[i];
            max = nums[j];

            while ( i < j && max > k * min){
                i++;
                min = nums[i];
            }

            L = Math.max(L, j-i+1);
            j++;

        }

        return n - L; //deletions


    }
}
