import java.lang.Math;
import java.util.HashMap;


class SummingSquares {
    /**
     * Write a function, summingSquares, that takes a target number as an argument. 
     * The function should return the minimum number of perfect squares that sum to 
     * the target. A perfect square is a number of the form (i*i) where i >= 1.
     * For example: 1, 4, 9, 16 are perfect squares, but 8 is not perfect square.
     * Input: 12
     * Possible solution: 4+4+4 or 9+1+1+1 or etc...
     * We want to use the min number of perfect squares, so 3 (4+4+4)
     */
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(summingSquares(10));
        long end = System.nanoTime();
    }

    public static int summingSquares(int n) {
        return (int) summingSquares(n, new HashMap<Integer, Double>());
    }

    public static double summingSquares(int n, HashMap<Integer, Double> memo) {
        if (n == 0)
            return 0;
        
        if (memo.containsKey(n))
            return memo.get(n);
        
        double minSquares = Double.POSITIVE_INFINITY;
        for (int i = 1; i <= Math.sqrt(n); i += 1) {
            int square = i*i;
            double numSquares = 1 + summingSquares(n - square, memo);
            if (numSquares < minSquares)
                minSquares = numSquares;
        }
        memo.put(n, minSquares);
        return minSquares;

    }

}