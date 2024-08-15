import java.util.HashMap;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Double;
import java.util.List;

class CountingChange {
    /**
    * Write a function, countingChange, that takes in an amount and an array of coins. 
    * The function should return the number of different ways it is possible to make 
    * change for the given amount using the coins.You may reuse a coin as many times 
    * as necessary.
    * 
    * For example,
    * countingChange(4, [1,2,3]) -> 4
    * There are four different ways to make an amount of 4:
    *  1. 1 + 1 + 1 + 1
    *  2. 1 + 1 + 2
    *  3. 1 + 3
    *  4. 2 + 2
    */

    public static void main(String[] args) {
        System.out.println(countingChange(4, List.of(1, 2, 3))); // 4
        System.out.println(countingChange(8, List.of(1, 2, 3))); // 10
        System.out.println(countingChange(24, List.of(5,7,3))); // 5
    }

    public static int countingChange(int amount, List<Integer> coins) {
        return _countingChange(amount, 0, coins, new HashMap<List<Integer>, Integer>());
    }

    public static int _countingChange(int amount, int coinIdx, List<Integer> coins, HashMap<List<Integer>, Integer> memo) {
        if (amount == 0)
            return 1;
        
        if (coinIdx >= coins.size())
            return 0;

        List<Integer> key = List.of(amount, coinIdx);
        if (memo.containsKey(key))
            return memo.get(key);
        
        int value = coins.get(coinIdx);
        int totalWays = 0;

        for(int qty = 0; qty * value <= amount; qty += 1) {
            int subAmount = amount - (qty * value);
            totalWays += _countingChange(subAmount,coinIdx + 1, coins, memo);
        
        }
        memo.put(key, totalWays);
        return totalWays;
    }


}