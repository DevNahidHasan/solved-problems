package a_easy;

import java.util.Arrays;

public class L350_IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] result = intersect(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        int n = nums1.length, m = nums2.length;

        while (i < n && j < m){
            if (nums1[i] == nums2[j]){
                nums1[k++] = nums1[i];
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        return Arrays.copyOfRange(nums1,0,k);
    }
}
