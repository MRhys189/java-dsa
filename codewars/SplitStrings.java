package codewars;

import java.util.Arrays;
import java.lang.String;

class SplitStrings{
    /**
     * Complete the solution so that it splits the string into pairs of two characters. 
     * If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
     * 
     * Examples
     *  'abc' =>  ['ab', 'c_']
        'abcdef' => ['ab', 'cd', 'ef']
     */

     public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2("abcdef"))); //ab, cd, ef]
        System.out.println(Arrays.toString(solution2("abcde"))); //[He, ll, oW, or, ld]
        System.out.println(Arrays.toString(solution2("HelloWorld"))); //[ab, cd, e_]
        System.out.println(Arrays.toString(solution2("LovePizza"))); //[Lo, ve, Pi, zz, a_]
     }

     static String[] solution(String s) {
       int len = s.length();
       String[] answer = new String[len % 2 == 0 ? len/2 : len/2 + 1];

       if (len % 2 == 0) {
        int j = 0;
        for(int i = 0; i < len; i += 2) {
            answer[j] = s.substring(i, i+2);
            j++;
        }
       } else {
        int j = 0;
        for(int i = 1; i < len; i += 2) {
            if (i==len-2){
                answer[j] = s.substring(i-1, i+1);
                answer[j+1] = String.valueOf(s.charAt(i+1)) + '_';
            } else {
                answer[j] = s.substring(i-1, i+1);
            }
            j++;
        }
       }
       return answer;
       }

       static String[] solution2(String s) {
        //Write your code here
        if(s.length()%2==1) s+="_";
        int n=s.length()/2;
      
      
      String[] sub=new String[n];
      for(int i=0;i<n;++i)
      sub[i]=""+s.charAt(i*2)+s.charAt(1+i*2);
      
      return sub;
    }
    }