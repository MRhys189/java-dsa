import java.lang.StringBuilder;
import java.lang.Character;

public class SumOfDigitsFromString {
    /**
     * https://www.youtube.com/watch?v=lUayPcz1W2w&list=PLqacxaBVaNINHTj02OSEOe8A58zRx6jV_&index=33
     * 
     * You are given a strings consisting of lowercase English letters, and an integer k.
     * First, convert s into an integer by replacing each letter with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, w, 'z' with 26). Then, 
     * transform the integer by replacing it with the sum of its digits. Repeat the transform operation k times in total.
     * For example, if s = "zbax" and k = 2, then the resulting integer would be & by the following operations:
     * 
        • Convert: "zbax" + "(26) (2) (1) (24)* + "262124" 262124
        • Transform #1: 262124 - 2 + 6 + 2 + 1 + 2 + 4 - 17
        • Transform #2: 17 + 1 + 7 - 8
     * Return the resulting integer after performing the operations described above.
     *
     *  Example 1:
     * Input: s = "1111", k = 1
     * Output: 36
     * Explanation: The operations are as follows:
     *      - Convert: "1111" - "(9) (9) (9) (9)" + "9999" + 9999
     *      - Transform #1: 9999 - 9 + 9 + 9 + 9 + 36
     * Thus the resulting integer is 36.
     * 
     * Example 2:
     * Input: s = "leetcode", k = 2
     * Output: 6
     * Explanation: The operations are as follows:
     *       - Convert: "leetcode" -> "(12) (5) (5) (20) (3) (15) (4) (5)" + "12552831545" -> 12552031545
     *       - Transform #1: 12552831545 -> 1+2+5+5+2+8+3+1+5+4+5 = 33
            - Transform #2: 33 - >3 + 3 = 6
        Thus the resulting integer is 6.
     * 
     * 
     */

    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }

    static int getLucky(String s, int k) {
        StringBuilder numSb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int num = ch - 'a' + 1;
            numSb.append(num);
        }

        String currStr = numSb.toString();
        for (int i = 0; i < k; i++) {
            currStr = sumOfDigits(currStr);
            if(currStr.length() == 1)
                break;

        }
        return Integer.parseInt(currStr);
    }

    private static String sumOfDigits(String numStr) {
        int sum = 0;
        for (char digit : numStr.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        return Integer.toString(sum);
    }
}
