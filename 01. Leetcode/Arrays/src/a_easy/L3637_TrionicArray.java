package a_easy;

public class L3637_TrionicArray {
    public static void main(String[] args) {
//        int[] arr = {4, 1, 5, 2, 3};
//        int[] arr = {8,9,4,6,1};
//        int[] arr = {1,6,6,3,7};
        int[] arr = {3,4,3,7,4,7};
        System.out.println(isTrionic(arr));
    }
    public static boolean isTrionic(int[] arr) {
        if ( arr[1] < arr[0]){
            return false;
        }
        boolean first = false, sec = false, third = false;
        int n = arr.length;
        for ( int i = 1; i < n; i++){

            if ( !first && arr[i] > arr[i - 1] ){
                first = true;
            }
            else if ( first && !sec && arr[i] < arr[i - 1]){
                sec = true;
            }
            else if ( sec && !third && arr[i] > arr[i - 1]){
                third = true;
            }
            else if ( third && arr[i] < arr[i - 1]){
                third = false;
            }

        }

        return first && sec && third;

    }
}
