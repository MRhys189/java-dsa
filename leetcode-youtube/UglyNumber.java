import java.util.*;

public class UglyNumber {
    /**
     * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
     * Given an integer n, return true if n is an ugly number.
     * 
     * Example 1:
        Input: n = 6
        Output: true
        Explanation: 6 = 2 x 3

     * Example 2:
        Input: n = 1
        Output: true
        Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
    
     * Example 3:
        Input: n = 14
        Output: false
        Explanation: 14 is not ugly since it includes the prime factor 7.
     */

     public static void main(String[] args) {
        System.out.println(isDigit(14));
     }

     public static Boolean isDigit(int n) {
        List<Integer> uglyNumbers = new ArrayList<Integer>();
        uglyNumbers.add(2);
        uglyNumbers.add(3);
        uglyNumbers.add(5);
        Boolean sol = true;

        int count = 0;

        for (int i = 1; i < 10; i++) {
            if (n % i == 0)
                count++;
        }
        if (count > uglyNumbers.size())
            sol = false;

        return sol;
    }
}
