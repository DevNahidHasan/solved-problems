package a_easy;

import java.util.Arrays;

public class L3379_TransformedArray {
    public static void main(String[] args) {
//        int[] nums = {-1, 4, -17};
        int[] nums = { -4, 2, 3 };
        int[] result = constructTransformedArray(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            int shift = nums[i] % n; //reducing the large shifts within 0 to n-1 range

            int newIdx = (i + shift) % n; // handle index out of bound

            if (newIdx < 0){ // handle if newIdx less than 0
                newIdx += n;
            }

            result[i] = nums[newIdx];
        }

        return result;
    }
}
