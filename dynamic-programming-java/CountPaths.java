import java.util.HashMap;
import java.util.List;
import java.lang.Integer;


class CountPaths {
    /**
     * Write a function, countPaths, that takes in a grid as an argument.
     * In the grid, 'X' represents walls and 'O' represents open spaces. 
     * You may only move down or to the right and cannot pass through walls. 
     * The function should return the number of ways possible to travel from the 
     * top-left corner of the grid to the bottom-right corner.
     */
    public static void main(String[] args) {
        // String[][] myArray = {{",", ",", "X"},{" ", " ", " "}};
        List<String> r1 = List.of("O", "O", "X");
        List<String> r2 = List.of("O", "O", "X");
        List<String> r3 = List.of("O", "O", "O");
        System.out.println(countPaths(0, 0, List.of(r1, r2, r3)));

    }

    public static int countPaths(int row, int col, List<List<String>> grid) {
        return countPaths(row, col, grid, new HashMap<List<Integer>, Integer>());
    }

    public static int countPaths(int row, int col, List<List<String>> grid, HashMap<List<Integer>,Integer> memo) {
        if (row == grid.size() || col == grid.get(0).size())
            return 0;
        
        if (grid.get(row).get(col) == "X")
            return 0;

        if (row == grid.size() - 1 && col == grid.get(0).size() - 1)
            return 1;

        List<Integer> position = List.of(row, col);
        if (memo.containsKey(position))
            return memo.get(position);
        
        int result = countPaths(row + 1, col, grid) + countPaths(row, col + 1, grid);
        memo.put(position, result);
        return result;
    }
}