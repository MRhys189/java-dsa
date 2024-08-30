package codewars;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import java.util.stream.*;
import java.util.List;
import java.lang.Character;

class Order {
    /**
     * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
     * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
     * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
     */

     public static void main(String[] args) {
        String a = "hello1 rhys3 there2";
        System.out.println(order(a));
     }

     public static String order(String words) {
        int len = words.length();
        Map<Integer, String> memo = new HashMap<Integer, String>();
        int wordIdx = 0;

        for(int i = 0; i < len; i++) {
            int num = 0;
            if(Character.isDigit(words.charAt(i))) {
                // int index = words.indexOf(words.charAt(i));
                num = num * 10 + (words.charAt(i) - '0');
                memo.put(num, words.substring(wordIdx, i));
                wordIdx = i +1;
            }
        }
        System.out.println(memo);

        String solution = "";
        for(int i = 1; i <= memo.size(); i++) {
            solution += memo.get(i);
        }

        return solution;
    
        
     }
}