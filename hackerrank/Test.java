package hackerrank;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Test {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        List<List<Integer>> values = new ArrayList<>();
        for(int i=0;i<t;i++){
            List<Integer> solution = new ArrayList<>();
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int start = a + (2^b);
            solution.add(start);
            int index = 1;
            while (index < n) {
                int next = start + (i*(2^i)*b);
                solution.add(next);
                index++;      
            }
            values.add(solution);
        }
        in.close();
        values.stream().forEach(list -> {
            list.stream().forEach(number -> {
                System.out.print(number + " ");
            });
            System.out.println();
        });
    }
}