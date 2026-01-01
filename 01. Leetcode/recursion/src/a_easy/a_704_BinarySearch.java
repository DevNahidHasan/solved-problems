package a_easy;

public class a_704_BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums,target,0, nums.length-1);
    }

    static int binarySearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if(arr[m] == target){
            return m;
        }
        else if (target < arr[m]) {
            e = m - 1;
            return binarySearch(arr, target, s, e);
        }
        s = m + 1;
        return binarySearch(arr,target, s, e);
    }
}
