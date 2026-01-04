package a_easy;

public class f_L342_PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));
    }

    public static boolean isPowerOfFour(int n) {

        return ans(n,0);

    }

    public static boolean ans(int n, int p){
        if( Math.pow(4,p) > n){
            return false;
        }
        if(Math.pow(4,p) == n){
            return true;
        }


        return ans(n,p+1);

    }
}
