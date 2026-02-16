package a_easy;

public class L190_ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }

    //Approach (Solving bit by bit)
    //T.C : O(1)
    //S.C : O(1)
    public static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // must make room in result before adding last bit
            result <<= 1;          // shift result left

            result |= (n & 1);     // take last bit of n

            n >>>= 1;              // unsigned right shift
        }

        return result;
    }
}
