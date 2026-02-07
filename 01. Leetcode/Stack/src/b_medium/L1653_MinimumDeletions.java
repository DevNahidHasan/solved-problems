package b_medium;

import java.util.Stack;

public class L1653_MinimumDeletions {
    public static void main(String[] args) {
//        String s = "aababbab";
        String s = "bbaaaaabb";
        System.out.println(minimumDeletions(s));
    }
    public static int minimumDeletions(String s) {

        int n = s.length();
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++){
            if (!stack.isEmpty() && s.charAt(i) == 'a' && stack.peek() == 'b'){// when "ba"
                stack.pop();
                count++;
            }else {
                stack.push(s.charAt(i));
            }
        }

        return count;
    }
}
