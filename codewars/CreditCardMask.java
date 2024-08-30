package codewars;

import java.lang.*;

public class CreditCardMask {
    /**
     * Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
     * Your task is to write a function maskify, which changes all but the last four characters into '#'.
     * Example
     * 
     * "4556364607935616" --> "############5616"
        "64607935616" -->      "#######5616"
                "1" -->                "1"
                    "" -->                 ""

    // "What was the name of your first pet?"
    "Skippy" --> "##ippy"
    "Nananananananananananananananana Batman!" --> "####################################man!"
     */

     public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskifyWithLambda("4555"));
     }

     public static String maskify(String str) {
        char[] charArr = str.toCharArray();
        int charLen = charArr.length;
        char[] solution = new char[charLen];
        
        for (int n = 0; n < charLen; n++) {
            if (n >= charLen - 4) 
                solution[n] = charArr[n];
            else
                solution[n] = '#';
        }

        return new String(solution);
     }

     // Using regex
     public static String maskifyWithRegex(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }

    // lambda
    static String maskifyWithLambda(String str) {
        return str.length() < 5 ? str : "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
      }
    
}
