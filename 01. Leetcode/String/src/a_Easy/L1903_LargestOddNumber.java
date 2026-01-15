package a_Easy;

public class L1903_LargestOddNumber {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("123454"));
    }
    public static String largestOddNumber(String s) {
        int ind = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1){
                ind = i;
                break;
            }
        }

         if (ind == -1) return "";
        //check for leading zeros if there is leading zeros in input
        // int i = 0;
        // while ( i <= ind && s.charAt(i) == '0'){
        //     i++;
        // }

        return s.substring(0, ind + 1);
    }
}
