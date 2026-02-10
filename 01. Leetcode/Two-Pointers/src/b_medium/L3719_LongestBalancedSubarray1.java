package b_medium;

import java.util.HashSet;
import java.util.Set;

public class L3719_LongestBalancedSubarray1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(longestBalanced(nums));
    }

    //Approach (try all subarrays)
//T.C : O(n^2)
//S.C : O(n)
    public static int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++){
            Set<Integer> even = new HashSet<>();
            Set<Integer> odd = new HashSet<>();

            for (int j = i; j < n; j++){
                if (nums[j] % 2 == 0) {
                    even.add(nums[j]);
                }else{
                    odd.add(nums[j]);
                }

                if (even.size() == odd.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}
