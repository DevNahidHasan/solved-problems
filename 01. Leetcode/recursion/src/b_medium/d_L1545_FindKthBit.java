//[d - Leetcode 1545 - Find Kth Bit in Nth Binary String]
// Link - (https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/) `leetcode`
package b_medium;

public class d_L1545_FindKthBit {
    public static void main(String[] args) {
        System.out.println(findKthBitOptimized(4,11));
    }
    public static char findKthBit(int n, int k) {
        String binaryString = formBinaryString(n);
        //System.out.println(binaryString);
        return binaryString.charAt(k-1);
    }

    public static char findKthBitOptimized(int n, int k) {
        // Base case: When n = 1, the binary string is "0"
        if (n == 1) return '0';

        // Find the length of the current string Sn, which is 2^n - 1
        int length = (1 << n) - 1;

        // Find the middle position
        int mid = length / 2 + 1;

        // If k is the middle position, return '1'
        if (k == mid) return '1';

        // If k is in the first half, find the bit in Sn-1
        if (k < mid) return findKthBit(n - 1, k);

        // If k is in the second half, find the bit in Sn-1 and invert it
        char pre = findKthBitOptimized(n - 1, length - k + 1) == '0' ? '1' : '0';
        return pre;
    }

    public static String formBinaryString(int n){
        if(n == 1){
            return "0";
        }

        String preStr = formBinaryString(n-1);
        String invertedPreStr = preStr.replace('0','2')
                                        .replace('1','0')
                                            .replace('2','1');
        String reversedInvertedPreStr = new StringBuilder(invertedPreStr).reverse().toString();
        return preStr + "1"+ reversedInvertedPreStr;


    }
}
