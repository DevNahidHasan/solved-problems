package a_easy;

public class L485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                if (count > max){
                    max = count;
                }
                count = 0;
            }
            else{
                count += 1;
            }
        }
        return Math.max(max, count);
    }
}
