package a_easy;

public class L26_AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String ans = addBinary(a, b);
        System.out.println(ans);
    }
    public static String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;

        int carry = 0;
        int sum = 0;

        StringBuilder result = new StringBuilder();

        while (m >= 0 || n >= 0){
            sum = carry;

            if (m >= 0){
                sum += a.charAt(m) - '0';
                m--;
            }

            if (n >= 0){
                sum += b.charAt(n) - '0';
                n--;
            }

            result.append(sum % 2);

            carry = sum / 2;
        }

        if (carry == 1){
            result.append('1');
        }

        return result.reverse().toString();

    }
}
