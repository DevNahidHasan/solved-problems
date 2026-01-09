package e_Learn_Basic_Recursion;

public class b_L509_FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    public static int fib(int n) {
        if(n <= 1){
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
