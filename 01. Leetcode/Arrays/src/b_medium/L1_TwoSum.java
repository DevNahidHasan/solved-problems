package b_medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        int[] result2 = twoSum2(nums, target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }
    //brute force approach
    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        //create ans array to store ans
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                /* if nums[i] + nums[j] is equal to
                   target put i and j in ans */
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }

            }
        }

        // Return {-1, -1} if no such pair is found
        return new int[]{-1, -1};

    }

    //better approach
    public static int[] twoSum2(int[] nums, int target) {


        // Map to store (element, index) pairs
        Map<Integer, Integer> mpp = new HashMap<>();

        // Size of the nums array
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Current number in the array
            int num = nums[i];

            // Number needed to reach the target
            int moreNeeded = target - num;

            // Check if the complement exists in map
            if (mpp.containsKey(moreNeeded)) {
                /* Return the indices of the two
                numbers that sum up to target*/
                return new int[]{mpp.get(moreNeeded), i};
            }

            // Store current number and its index in map
            mpp.put(nums[i], i);
        }

        // If no such pair found, return {-1, -1}
        return new int[]{-1, -1};
    }
}
