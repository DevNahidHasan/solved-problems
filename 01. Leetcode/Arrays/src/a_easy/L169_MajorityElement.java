package a_easy;

import java.util.HashMap;
import java.util.Map;

public class L169_MajorityElement {
    public static void main(String[] args) {
//        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int ans = majorityElement(arr);
        int ans2 = majorityElement2(arr);

        // Print the majority element found
        System.out.println("The majority element is: " + ans);
        System.out.println("The majority element is: " + ans2);
    }

    // Better solution
    /*
        Complexity Analysis -

        Time Complexity: O(N), where N is the size of the array.
        The code goes through the array once to count frequencies using a hash map (O(N)), then checks the map to find the majority element (O(N) in the worst case). Since these are separate linear operations, the overall time complexity is O(N).

        Space Complexity: O(N), for using a map data structure.
     */
    public static int majorityElement(int[] nums) {
        // Hash map to store element counts
        Map<Integer,Integer> map = new HashMap<>();

        int n = nums.length;

        // Count occurrences of each element
        for(int i = 0; i < n; i++){
            int key = nums[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        /* Iterate through the map to
        find the majority element*/
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2){
                return entry.getKey();
            }
        }

        // Return -1 if no majority element is found
        return -1;
    }

    // Optimal Solution - Moore's Voting Algorithm
    /*
       Complexity Analysis-
       Time Complexity: O(N) + O(N), where N is size of the given array.
       The first O(N) is to calculate the count and find the expected majority element.
       The second one is to check if the expected element is the majority one or not.

       Space Complexity: O(1) no extra space used.
     */
    public static int majorityElement2(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;

        //Applying Moore's Voting Algorithm
        for (int i = 0; i < n; i++){
            if (count == 0){
                count = 1;
                element = nums[i];
            }else if (element == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        /* Checking if the stored element
         is the majority element*/

        int count1 = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] == element){
                count1++;
            }
        }
        // Return element if it is a majority element
        // Return -1 if no majority element is found
        return count1 > n / 2 ? element : -1;


    }
}
