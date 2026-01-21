package a_easy;

public class L268_MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber2(new int[]{9,6,4,2,3,5,7,0,1}));
    }
    public static int missingNumber(int[] nums) {
        int sum = nums.length * ( nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++){
            sum -= nums[i];
        }
        return sum;
    }
    public static int missingNumber2(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor ^ nums.length;

    }
}
