package codewars;

import java.util.Arrays;
import java.util.stream.IntStream;


class MultiplicationTable {
    /**
     * Your task, is to create N×N multiplication table, of size provided in parameter.
     * For example, when given size is 3:
        1 2 3
        2 4 6
        3 6 9
     * For the given example, the return value should be:
     * [[1,2,3],[2,4,6],[3,6,9]]
     */

     public static void main(String[] args) {
        int[][] arr = multiplicationTable(3);
        System.out.println(Arrays.deepToString(arr));
     }

     public static int [][] multiplicationTable(int x) {
        int[][] table = new int[x][x];
        int r = 0;
        int c = 0;
        while(r < x) {
            while (c < x) {
                table[r][c] = (r+1) * (c+1);
                c+=1;
            }
            r+=1;
            c = 0;
        }
        return table;
     }

     public static int[][] multiplicationTableWithIntStream(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(i -> IntStream.rangeClosed(1, n).map(j -> i * j).toArray()).toArray(int[][]::new);
     }
}