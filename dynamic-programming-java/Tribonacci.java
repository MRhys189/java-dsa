import java.util.HashMap;
import java.time.Duration;
import java.time.Instant;

class Tribonacci {
    /**
     * Write a function tribonacci that takes in a number argument, n, 
     * and returns the n-th number of the Tribonacci sequence.
     * The 0-th and 1-st numbers of the sequence are both 0.
     * 2-nd number of the sequence is 1.
     * To generate further numbers of the sequence, calculate the sum of previous three numbers.
     * Solve this recursively.
     * 
     */
    public static void main(String[] args) {
        // Instant startDp = Instant.now();
        long s = System.nanoTime();
        int dp = tribUsingDynamicProgramming(12);
        long e = System.nanoTime();
        // Instant endDp = Instant.now();
        System.out.println("Dynamic Programming: " + dp);
        System.out.println("DP Time Taken: " + (e-s));

        
        long start = System.nanoTime();
        int bf = tribUsingBruteForce(12);
        long end = System.nanoTime();
        System.out.println("Brute Force: " + bf);
        System.out.println("BF Time taken: " + (end-start));

    }
 
    public static int tribUsingDynamicProgramming(int n) {
        int result = trib(n, new HashMap<>());
        return result;
    }

    public static int trib(int n, HashMap<Integer, Integer> memo) {
        // base case
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        
        if (memo.containsKey(n))
            return memo.get(n);
        int result = trib(n - 1, memo) + 
            trib(n - 2, memo) + 
            trib(n - 3, memo);

        memo.put(n, result);
        return result;
    }

    public static int tribUsingBruteForce(int n) {
        // base case
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        
        
        int result = tribUsingBruteForce(n - 1) + 
            tribUsingBruteForce(n - 2) + 
            tribUsingBruteForce(n - 3);

        return result;
    }


}