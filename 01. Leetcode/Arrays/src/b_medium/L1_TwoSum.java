package b_medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class L1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        int[] result2 = twoSum2(nums, target);
        int[] result3 = twoSum3(nums, target);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
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

    //optimal approach
    public static int[] twoSum3(int[] nums, int target) {

        // Size of the nums array
        int n = nums.length;

        // Array to store indices of two numbers
        int[] ans = new int[2];

        // 2D array to store {element, index} pairs
        int[][] eleIndex = new int[n][2];
        for (int i = 0; i < nums.length; i++) {
            eleIndex[i][0] = nums[i];
            eleIndex[i][1] = i;
        }

        /* Sort eleIndex by the first
        element in ascending order*/
        Arrays.sort(eleIndex, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        /* Two pointers: one starting
        from left and one from right*/
        int left = 0, right = n - 1;

        while (left < right) {
            /* Calculate sum of elements at
            left and right pointers*/
            int sum = eleIndex[left][0] + eleIndex[right][0];

            if (sum == target) {

                /* If sum equals target,
                store indices and return*/
                ans[0] = eleIndex[left][1];
                ans[1] = eleIndex[right][1];
                return ans;

            } else if (sum < target) {

                /* If sum is less than target,
                move left pointer to the right*/
                left++;

            } else {

                /* If sum is greater than target,
                move right pointer to the left*/
                right--;

            }
        }

        // If no such pair found, return {-1, -1}
        return new int[]{-1, -1};
    }
}
