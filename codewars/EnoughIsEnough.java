package codewars;

import java.util.*;
import java.lang.*;

class EnoughIsEnough {
    /**
     * Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. 
     * However, Charlie doesn't like these sessions, since the motif usually repeats. He isn't fond of seeing the Eiffel tower 40 times.
     * He tells them that he will only sit for the session if they show the same motif at most N times. Luckily, Alice and Bob are able to encode the motif as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?
     * 
     * Task
        Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
        For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take 
        [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
        With list [20,37,20,21] and number 1, the result would be [20,37,21].

     */

     public static void main(String[] args) {
        int[] elements = {1, 2, 3, 1, 2, 1, 2, 3};
        int [] test2 = { 1, 1, 3, 3, 7, 2, 2, 2, 2 }; //[1, 1, 3, 3, 7, 2, 2, 2]
        int [] test3 = { 20, 37, 20, 21 };

        System.out.println(Arrays.toString(deleteNth(elements, 2)));
        System.out.println(Arrays.toString(deleteNth(test2, 3)));
        System.out.println(Arrays.toString(deleteNth(test3, 1)));
     }

     static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number: elements) {
            int count = countMap.getOrDefault(number, 0);
            if (count < maxOccurrences) {
                result.add(number);
                countMap.put(number, count + 1);
            }
        }

        int[] arrSolution = new int[result.size()];
        int i = 0;
        for (int num: result) {
            arrSolution[i++] = num;
        }

        return arrSolution;

     }

    //  static int[] deleteNth(int[] elements, int maxOccurrences) {
    //     int len = elements.length;
    //     Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
        
    //     for (int i = 0; i < len; i++) {
    //         int temp = elements[i];
    //         int count = 0;
    //         for (int j = 0; j < len; j++) {
    //             if(memo.getOrDefault(temp, 0) >= 2 && memo.containsKey(temp)) {
    //                 break;
    //             }
    //             if (temp == elements[j] && count <= maxOccurrences) {
    //                 count++; 
    //                 memo.put(temp, Math.min(count, maxOccurrences));  
    //             }
                
    //             // break;
    //         }
            
    //     }
    //     int[] arrSolution = new int[memo.size()];


        
    //     for(int i = 0; i < memo.size(); i++) {
    //         arrSolution[i] = memo.get(i);
    //     };

    //     return arrSolution;
    //  }

}