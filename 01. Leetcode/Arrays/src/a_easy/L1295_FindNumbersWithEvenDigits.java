package a_easy;

public class L1295_FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int x : nums){
            if((int) (Math.log10(x)+1) %2 == 0)count++;
        }
        return count;
    }
}
