package a_easy;

import java.util.Arrays;

public class L283_MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        //moveZeroes(nums);
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
    //brute force approach
    public static void moveZeroes2(int[] nums) {
        int n = nums.length;

        // Create a temporary array to store non-zero elements
        int[] temp = new int[n];
        int count = 0;

        // Copy non-zero elements to temp
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[count++] = nums[i];
            }
        }

        // Copy non-zero elements back to nums
        for (int i = 0; i < count; i++) {
            nums[i] = temp[i];
        }

        // Fill the rest with zeroes
        for (int i = count; i < n; i++) {
            nums[i] = 0;
        }
    }
}
