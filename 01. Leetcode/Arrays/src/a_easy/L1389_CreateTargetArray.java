package a_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1389_CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int[] index = {0};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int length = nums.length;
        for(int i = 0; i < length; i++){
            list.add(index[i],nums[i]);
        }
        for(int i = 0; i < length; i++){
            nums[i] = list.get(i);
        }

        return nums;
    }
}
