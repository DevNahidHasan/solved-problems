package a_Easy;

import java.util.Arrays;

public class L14_LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder();

        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length - 1];

        int length = Math.min(first.length(), last.length());

        for (int i = 0; i < length; i++){
            if (first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}
