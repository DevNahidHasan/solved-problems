package mergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L912_SortAnArray {

    public static void main(String[] args) {

        int[] arr = {14, 7, 3, 12};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        System.out.println(Arrays.toString(arr));

        int[] sortedArr = sortArray(arr);

        System.out.println("After Sorting Array: ");
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length; // Size of array

        // Perform Merge sort on the whole array
        mergeSortHelper(nums, 0, n - 1);

        // Return the sorted array
        return nums;
    }

    private static void mergeSortHelper(int[] arr, int low, int high) {
        //Base case: if the array has only one element then low will be same as high
        if ( low >= high){
            return;
        }

        //Find the middle index
        int mid = (low + high) / 2;

        //Sort the left half
        mergeSortHelper(arr,low,mid);
        //sort the right half
        mergeSortHelper(arr,mid+1,high);

        //merge the sorted halves
        merge(arr,low,mid,high);
    }

    // Function to merge two sorted halves of the array
    private static void merge(int[] arr, int low, int mid, int high){
        // Temporary list to store the merged elements
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // Loop until one of the sorted halves are exhausted
        while (left <= mid && right <= high){
            // compare left and right elements
            if ( arr[left] <= arr[right]){
                // Add left element to temp
                temp.add(arr[left]);
                // Move the left pointer
                left++;
            }else{
                // Add element to temp
                temp.add(arr[right]);
                // Move right pointer
                right++;
            }
        }

        // If there is remaining elements in left half -> add them
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }

        // If there is remaining elements in right half -> add them
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }

        // Transferring the sorted elements to arr
        for ( int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
}
