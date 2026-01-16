package a_Easy;

public class L796_RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","abcde"));
    }

    //------------- brute force approach------------------


//    public static boolean rotateString(String s, String goal) {
//
//        if (s.length() != goal.length()) {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            String rotated = s.substring(i) + s.substring(0, i);
//            if (rotated.equals(goal)) {
//                return true;
//            }
//        }
//        return false;
//
//    }



    // ----------Optimal Approach-----------
    public static boolean rotateString(String s, String goal) {
        if ( s.length() != goal.length()){
            return false;
        }
        String doubleS = s + s;
        return doubleS.contains(goal);
    }
}
