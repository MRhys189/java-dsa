package hackerrank;
import java.util.*;
import java.lang.String;

class IntToString {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            String s = String.valueOf(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
               } else {
                System.out.println("Wrong answer.");
               }
              } catch (DoNotTerminate.ExitTrappedException e) {
               System.out.println("Unsuccessful Termination!!");
              }
             }
            }
        }
}
