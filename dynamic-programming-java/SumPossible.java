import java.util.List;
import java.util.HashMap;
import java.util.Scanner;


class SumPossible {
    /**
     * Write a function sumPossible that takes in an amount and 
     * an array of positive numbers. The function should return a boolean 
     * indicating whether or not it is possible to create the amount by summing
     * numbers of the array. You may reuse numbers of the array as many times as 
     * necessary.You may assume that the target amount is non-negative.
     */
    public static void main(String[] args) {
        long startM = System.nanoTime();
        System.out.println("My Solution: " + sumPossibleMySolution(5, List.of(7, 5, 15)));
        System.out.println("My solution time: " + (System.nanoTime() - startM));

        long startA = System.nanoTime();
        System.out.println("Actual Solution: " +sumPossibleActualSolution(5, List.of(7, 15, 15)));
        System.out.println("Actual solution time: " + (System.nanoTime() - startA));

    }

    public static boolean sumPossibleMySolution(int amount, List<Integer> numbers) {
        return sumPossibleMySolution(amount, numbers, new HashMap<Integer, Boolean>());
    }

    /**
     * my solution is wrong!!
     */
    public static boolean sumPossibleMySolution(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
        boolean result = false;
        // base case
        if (amount == 0)
            return true;
        if (amount < 0)
            return false;

        if (memo.containsKey(amount))
            return memo.get(amount);
        
        for (int number : numbers) {
            int nextAmount = amount - number;
            result = sumPossibleMySolution(nextAmount, List.of(number), memo);
            memo.put(nextAmount, result);
        }

        return result;
    }

    public static boolean sumPossibleActualSolution(int amount, List<Integer> numbers) {
        return sumPossibleActualSolution(amount, numbers, new HashMap<Integer, Boolean>());
    }

    public static boolean sumPossibleActualSolution(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
        if (amount == 0)
            return true;
        if (amount < 0)
            return false;

        if (memo.containsKey(amount))
            return memo.get(amount);
        
        for (int num: numbers){
            int subAmount = amount - num;
            if (sumPossibleActualSolution(subAmount, numbers, memo)){
                memo.put(amount, true);
                return true;
            }
        }
        memo.put(amount, false);
        return false;
    }

    public static boolean sumPossibleBruteForce(int amount, List<Integer> numbers) {
        if (amount == 0)
            return true;
        if (amount < 0)
            return false;
        
        for (int num: numbers){
            int subAmount = amount - num;
            if (sumPossibleBruteForce(subAmount, numbers))
                return true;
        }
        return false;
    }
}