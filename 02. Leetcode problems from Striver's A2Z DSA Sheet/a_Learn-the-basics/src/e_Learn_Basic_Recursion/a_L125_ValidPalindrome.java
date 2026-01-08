package e_Learn_Basic_Recursion;

public class a_L125_ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
    }

    public  static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        System.out.println(s);
        return checkPalindrome(s, 0, s.length() - 1 );
    }

    static boolean checkPalindrome(String str , int s, int e){
        if(s > e){
            return true;
        }

        if(str.charAt(s) == str.charAt(e)){
            return checkPalindrome(str,s+1,e-1);
        }else{
            return false;
        }
    }
}
