import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.lang.Integer;

class MinChange {
    /**
     * Write a function minChange that takes in an amount and an array of coins. 
     * The function should return the minimum number of coins required to create the amount. 
     * You may use each coin as many times as necessary.
     * If it is not possible to create the amount, then return -1.
     */
    public static void main(String[] args) {
        System.out.println(minChange(4, List.of(1, 2, 3)));
        System.out.println(minChange(23, List.of(2,5,7))); //4
        System.out.println(minChange(271, List.of(10, 8, 265, 24))); // -> -1);
        System.out.println(minChange(102, List.of(1, 5, 10, 25))); // -> 6
        System.out.println(minChange(8, List.of(1,5,4,12))); // --> 2, because 4+4 is the minimum coins possible
    }

    public static int minChange(int amount, List<Integer> coins) {
        return minChangeMySolution(amount, coins, new HashMap<Integer, Integer>());
    }

    public static int minChangeMySolution(Integer amount, List<Integer> coins, HashMap<Integer, Integer> memo) { // gets the number of coins
        // base case
        if (amount == 0)
            return 0;
        if (amount < 0)
            return -1;

        if (memo.containsKey(amount))
            return memo.get(amount);

        int minCoins = -1; // min number of coins needed to get change
        for (int coin: coins) {
            int subAmount = amount - coin;
            int subCoins = minChangeMySolution(subAmount, coins, memo);
            if (subCoins != -1) {
                int numCoins = subCoins + 1;
                if (numCoins < minCoins || minCoins == -1) {
                    minCoins = numCoins;
                }
            } 
        }
        memo.put(amount, minCoins);
        return minCoins;
    }
}