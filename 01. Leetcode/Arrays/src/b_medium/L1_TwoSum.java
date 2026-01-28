package b_medium;

import java.util.Arrays;

public class L1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
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
}
