import java.lang.System;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class NonAdjacentSum {
    /**
     * Write a function, nonAdjacentSum, that takes in an array of numbers as an argument. 
     * The function should return the maximum sum of non-adjacent elements in the array. 
     * There is no limit on how many elements can be taken into the sum as long as 
     * they are not adjacent.
     */
    public static void main(String[] args) {
        List<Integer> arguments = List.of(2,4,5,12,7);
        
        long startDp = System.nanoTime();
        int dp = nonAdjacentSum(arguments, 0);
        long endDp = System.nanoTime();
        System.out.println("DP solution: " + dp +"\nTime taken: " + (endDp-startDp)+"\n");

        long startBf = System.nanoTime();
        int bf = nonAdjacentSumBruteForce(arguments, 0);
        long endBf = System.nanoTime();
        System.out.println("BF solution: " + bf +"\nTime taken: " + (endBf-startBf)+"\n");

    }

    public static int nonAdjacentSum(List<Integer> numList, int index) {
        return nonAdjacentSum(numList, index, new HashMap<Integer, Integer>());
    }

    public static int nonAdjacentSum(List<Integer> numList, int index, HashMap<Integer,Integer> memo) {
        //base case
        if(index >= numList.size())
            return 0;
        
        if (memo.containsKey(index))
            return memo.get(index);
        
        int result = Math.max(
            numList.get(index) + nonAdjacentSum(numList, index + 2, memo),
            nonAdjacentSum(numList, index + 1, memo));
        memo.put(index, result);
        return result;
    }

    public static int nonAdjacentSumBruteForce(List<Integer> numList, int index) {
        //base case
        if(index >= numList.size())
            return 0;
        
        return Math.max(
            numList.get(index) + nonAdjacentSumBruteForce(numList, index + 2),
            nonAdjacentSumBruteForce(numList, index + 1));
    }
}