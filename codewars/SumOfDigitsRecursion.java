package codewars;

import java.lang.Integer;
import java.lang.Math;

public class SumOfDigitsRecursion {
    /**
     * Digital root is the recursive sum of all the digits in a number.
     * Given n, take the sum of the digits of n. If that value has more than one digit,
     *  continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
     * 
     *  16  -->  1 + 6 = 7
        942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
        132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
        493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
     */

     public static void main(String[] args) {
        System.out.println(digital_root(16));
     }

     static int digital_root(int n) {
        // base case
        if (n / 10 == 0)
            return n;
        

        int len = String.valueOf(n).length();

        int solution = 0;

        for (int i = 1; i <= len; i++) {
            int factor = (int) Math.pow(10, i);
            solution += digital_root(n / factor);
            solution += digital_root(n%factor);
        }

        return solution;
     }
}
