//[e - Leetcode 326 - Power of Three]
//Link - (https://leetcode.com/problems/power-of-three/)

package a_easy;

public class e_L326_PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(-1));
    }

    public static boolean isPowerOfThree(int n) {

        return ans(n,0);

    }

    public static boolean ans(int n, int p){
        if( Math.pow(3,p) > n){
            return false;
        }
        if(Math.pow(3,p) == n){
            return true;
        }


        return ans(n,p+1);

    }


}
