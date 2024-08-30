package codility;

import java.lang.Math;
class HeadOrTails {
    public static void main(String[] args) {
        /**
         * There are N coins, each showing either heads or tails. We would like all the coins to form a 
         * sequence of alternating heads and tails.
         * What is the minimum number of coins that must be reversed to achieve this?
         * 
         * Examples:
            1. Given array A = [1, 0, 1, 0, 1, 1], the function should return 1. After
            reversing the sixth coin, we achieve an alternating sequence of coins [1, 0, 1, 0, 1, 0].
            2. Given array A = [1, 1, 0, 1, 1], the function should return 2. After
            reversing the first and fifth coins, we achieve an alternating sequence [0, 1, 0, 1, 0].
            3. Given array A = [0, 1, 0], the function should return 0. The
         */
        int[] a = {1,0,1,0,1,1};

         System.out.println(solution(a));
    }


    static int solution(int[] A) {
        int arrLen = A.length;
        int[] headOrTail = new int[arrLen];
        int headCount = 0;
        int tailCount = 0;
        
        for (int i = 0; i < arrLen; i++) {
            if (A[i] == 0)
                headCount++;
            else
                tailCount++;
        }

        if (arrLen % 2 == 0 && (headCount % 2 !=0 || tailCount % 2 != 0)) {
            if(headCount > tailCount) {
                
            }
        }


    


        
    }
}