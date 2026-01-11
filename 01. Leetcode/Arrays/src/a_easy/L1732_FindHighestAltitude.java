package a_easy;

public class L1732_FindHighestAltitude {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
    }

    public static int largestAltitude(int[] gain) {
        int a = 0, b, max = 0;

        for (int i = 0; i < gain.length ; i++){
            b = gain[i] + a;
            a = b;
            if ( b > max) {
                max = b;
            }
        }
        return max;
    }

    
}
