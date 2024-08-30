package codewars;

import java.util.Arrays;
import java.util.List;

public class FindOdd {
    /**
     * Title: Find the odd int
     * Given an array of integers, find the one that appears an odd number of times.
     * There will always be only one integer that appears an odd number of times.
     */
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,3,4,3,3,3,2,2,1};
        System.out.println(findIt(a));
    }

    public static int findIt(int[] array) {
        // Using bitwise operators
        int result = 0;
        for (int num : array) { 
            result ^= num;
        }
        return result;
    }

//     @Test
//     public void findTest() {
//          assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); 
//       assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); 
//         assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
//          assertEquals(10, FindOdd.findIt(new int[]{10}));
//          assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
//       assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
//        }
//   }
}