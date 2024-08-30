package codility;

public class SmallestPositiveInt {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 4, 1, 2};
        int[] b = {1, 2, 3};
        int[] c = {-1, -3};
        System.out.println("Solution: " + solution(a));
        System.out.println("Solution: " + solution(b));
        System.out.println("Solution: " + solution(c));
    }
    public static int solution(int[] A) {
        int n = A.length;
        boolean[] present = new boolean[n + 1];
        
        // Mark the integers that are present in the array
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n) {
                present[A[i]] = true;
            }
        }
        
        // Find the smallest positive integer that is not present
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        
        // If all numbers from 1 to n are present, the answer is n + 1
        return n + 1;
    }
}
