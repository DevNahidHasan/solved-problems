//  [c - L509 - Fibonacci Number]
//  (https://leetcode.com/problems/fibonacci-number/) `leetcode`

package a_easy;

public class c_L509_FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(0));
    }

    static int fib(int n){
        if(n <= 1){
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
