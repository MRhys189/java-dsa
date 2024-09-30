package codewars;

import java.util.stream.Collectors;

class RomanNumeralsEncoder {
    /**
     * Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string containing the
     * Roman Numeral representation of that integer.
     * Modern Roman numerals are written by expressing each digit separately starting with the leftmost digit and skipping any digit with a value of zero.
     * There cannot be more than 3 identical symbols in a row.
     * In Roman numerals:

        1990 is rendered: 1000=M + 900=CM + 90=XC; resulting in MCMXC.
        2008 is written as 2000=MM, 8=VIII; or MMVIII.
        1666 uses each Roman symbol in descending order: MDCLXVI.
     * 
     */
    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(6));
    }

    static String solution(int n) {
        
    }
}