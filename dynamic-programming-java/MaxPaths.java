import java.util.List;
import java.lang.Integer;
import java.util.HashMap;
import java.lang.Double;
import java.lang.Math;


class MaxPaths {
    /**
     * Write a function, maxPathSum, that takes in a grid as an argument. 
     * The function should return the maximum sum possible by traveling a path 
     * from the top-left corner to the bottom-right corner. 
     * You may only travel through the grid by moving down or right.
     * You can assume that all numbers are non-negative.
     */
    public static void main(String[] args) {
        List<Integer> r1 = List.of(1, 3, 12);
        List<Integer> r2 = List.of(5,6,2);
        System.out.println((int) maxPaths(0, 0, List.of(r1, r2)));
        System.out.println((int) maxPathsBruteForce(0, 0, List.of(r1, r2)));
    }

    public static int maxPaths(int r, int c, List<List<Integer>> grid) {
        return (int) maxPaths(r, c, grid, new HashMap<List<Integer>, Double>());
    }

    public static double maxPaths(int r, int c, List<List<Integer>> grid, 
        HashMap<List<Integer>, Double> memo) {
        if (r == grid.size() || c == grid.get(0).size())
            return Double.NEGATIVE_INFINITY;
        
        if (r == grid.size() - 1 && c == grid.get(0).size() - 1)
            return grid.get(r).get(c);
        
        List<Integer> pos = List.of(r, c);
        if (memo.containsKey(pos))
            return memo.get(pos);

        
        double result = grid.get(r).get(c) + Math.max(maxPathsBruteForce(r, c+1, grid), maxPathsBruteForce(r+1, c, grid));

        memo.put(pos, result);
        return result;

    }

    public static double maxPathsBruteForce(int r, int c, List<List<Integer>> grid) {
        if (r == grid.size() || c == grid.get(0).size())
                return Double.NEGATIVE_INFINITY;
            
        if (r == grid.size() - 1 && c == grid.get(0).size() - 1)
            return grid.get(r).get(c);

        
        // double maxValue = Integer.max(maxPathsBruteForce(r, c+1, grid), maxPathsBruteForce(r+1,c,grid));
        return grid.get(r).get(c) + Math.max(maxPathsBruteForce(r, c+1, grid), maxPathsBruteForce(r+1, c, grid));
        

    }
}