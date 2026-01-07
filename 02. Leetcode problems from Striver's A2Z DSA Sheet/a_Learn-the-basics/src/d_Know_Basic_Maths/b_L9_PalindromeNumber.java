package d_Know_Basic_Maths;

public class b_L9_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        return x < 0 || (x % 10 == 0 && x != 0)? false : x == reverse(x);
    }

    public static int reverse(int x) {
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        int rev = 0;

        while(x != 0){

            int lastDigit = x % 10;

            if(rev > MAX / 10 || (rev == MIN / 100 && lastDigit > 7)){
                return 0;
            }
            if(rev < MIN/10 || (rev == MIN / 10 && lastDigit > 8)){
                return 0;
            }

            rev = rev * 10 + lastDigit;

            x = x / 10;
        }

        return rev;
    }
}
