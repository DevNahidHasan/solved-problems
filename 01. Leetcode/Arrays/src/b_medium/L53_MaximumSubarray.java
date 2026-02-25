package b_medium;

public class L53_MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSum = maxSubArray(arr);
        int maxSum2 = maxSubArray2(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
        System.out.println("The maximum subarray sum is: " + maxSum2);
    }
/*
Better solution -

Complexity Analysis -

Time Complexity:O(N2), for using two nested loops, each running approximately N times, here N is the size of the array.

Space Complexity: O(1) for not using any extra space.
 */

    public static int maxSubArray(int[] nums) {

        /* Initialize maximum sum with
        the smallest possible integer*/
        int maxi = Integer.MIN_VALUE;

        // Iterate over each starting index of subarrays
        for (int i = 0; i < nums.length; i++) {

            /* Variable to store the sum
            of the current subarray*/
            int sum = 0;

            /* Iterate over each ending index
            of subarrays starting from i*/
            for (int j = i; j < nums.length; j++) {

                /* Add the current element nums[j] to
                the sum i.e. sum of nums[i...j-1]*/
                sum += nums[j];

                /* Update maxi with the maximum of its current
                value and the sum of the current subarray*/
                maxi = Math.max(maxi, sum);
            }
        }

        // Return the maximum subarray sum found
        return maxi;
    }
/*
Optimal Solution -

Complexity Analysis -

Time Complexity: O(N) for single traversal, here N is the size of the array.

Space Complexity: O(1), for not using any extra space.
 */
public static int maxSubArray2(int[] nums) {
    // maximum sum
    long maxi = Long.MIN_VALUE;

    // current sum of subarray
    long sum = 0;

    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {

        // Add current element to the sum
        sum += nums[i];

        // Update maxi if current sum is greater
        if (sum > maxi) {
            maxi = sum;
        }

        // Reset sum to 0 if it becomes negative
        if (sum < 0) {
            sum = 0;
        }
    }

    return (int)maxi;
}
}
