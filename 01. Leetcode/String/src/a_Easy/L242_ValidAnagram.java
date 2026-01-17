package a_Easy;

public class L242_ValidAnagram {
    public static void main(String[] args) {
        System.out.println(anagramStrings("eat","tea"));
    }
    public static boolean anagramStrings(String s, String t) {
        if ( s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        int n = s.length();
        int i = 0;
        while ( i < n){
            arr[s.charAt(i) - 'a'] += 1;
            i++;
        }
        i = 0;
        while(i < n){
            if(arr[t.charAt(i) - 'a'] <= 0 ){
                return false;
            }
            arr[t.charAt(i) - 'a'] -= 1;
            i++;
        }
        return true;
    }
}
