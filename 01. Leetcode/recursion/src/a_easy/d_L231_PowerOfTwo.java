package a_easy;

public class d_L231_PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
    public static boolean isPowerOfTwo(int n) {

        return ans(n,0);

    }
    public static boolean ans(int n, int p){
        if( Math.pow(2,p) > n){
            return false;
        }
        if(Math.pow(2,p) == n){
            return true;
        }


        return ans(n,p+1);

    }
}
