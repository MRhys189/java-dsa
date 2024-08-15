package hackerrank;
import java.util.Scanner;

public class StaticBlocks {
    public static Boolean flag = true;
    public static int breadth, width;

    static {
        Scanner sc = new Scanner(System.in);
         breadth = sc.nextInt();
         width = sc.nextInt();
         sc.close();

        try {
            if (breadth < 0 || width < 0)
                throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        if (flag){
            int area = breadth*width;
            System.out.println(area);
        } 
    }
    
}
