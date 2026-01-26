package a_easy;

import java.util.Arrays;

public class L34_FindFirstAndLastPosition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},8)));
    }
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        //check for first occurrence
        int firstPosition = search(nums, target, true);
        ans[0] = firstPosition;

        if(firstPosition != -1){
            int lastPosition = search(nums, target, false);
            ans[1] = lastPosition;
        }

        return ans;


    }

    static int search(int[] arr, int target, boolean findStartPosition){
        if(arr.length == 0){
            return -1;
        }

        int position = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{//target == arr[mid]
                position = mid;
                if(findStartPosition){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }



        }
        return position;
    }
}
