package a_easy;

public class L268_MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber2(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber3(new int[]{9,6,4,2,3,5,7,0,1}));
    }
    //optimal 1
    public static int missingNumber(int[] nums) {
        int sum = nums.length * ( nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++){
            sum -= nums[i];
        }
        return sum;
    }
    //optimal 2 using XOR
    public static int missingNumber2(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor ^ nums.length;

    }
    //optimal 2 using XOR - different approach
    public static int missingNumber3(int[] nums) {
        int xor1 = 0, xor2 = 0;

        // Calculate XOR of all array elements
        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ (i + 1); // XOR up to [1...N]
            xor2 = xor2 ^ nums[i]; // XOR of array elements
        }

        // XOR of xor1 and xor2 gives missing number
        return (xor1 ^ xor2);

    }
    //brute force approach - not recommended
    public int missingNumber4(int[] nums) {
        // Calculate N from the length of nums
        int N = nums.length;

        // Outer loop that runs from 0 to N
        for (int i = 0; i <= N; i++) {
            /* Flag variable to check
            if an element exists*/
            int flag = 0;

            /* Search for the element
            using linear search*/
            for (int j = 0; j < N; j++) {
                if (nums[j] == i) {
                    // i is present in the array
                    flag = 1;
                    break;
                }
            }

            // Check if the element is missing (flag == 0)
            if (flag == 0) return i;
        }

        /* The following line will never
        execute, it is just to avoid warnings*/
        return -1;
    }
}
