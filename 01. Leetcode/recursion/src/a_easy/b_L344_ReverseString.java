package a_easy;

import java.util.Arrays;

public class b_L344_ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        doReverseString(s,0,s.length-1);
        System.out.println(Arrays.toString(s));
    }

    public static void doReverseString(char[] arr, int s, int e) {
        if( s >= e){
            return;
        }
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        doReverseString(arr, s+1, e-1);
    }

}
