package hackerrank;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Math;

public class HackerRank {
    
    public static void main(String[] args) throws IOException {
        // With Scanner
        // inputWithScanner();
        // readNextThreeIntegers();
        // ifElseTest();
        // readIntDoubleAndString();
        // formattingOutput();
        // loops();
        createIntSeries();
    }

    private static void inputWithScanner() {
        System.out.println("Reading input with Scanner.....");
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is " + myInt);
    }

    private static void readNextThreeIntegers() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static void ifElseTest() {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (N % 2 != 0) {
            System.out.println("Weird");
        }

        if (N % 2 == 0 && N < 6) {
            System.out.println("Not Weird");
        }

        if (N % 2 == 0 && N > 5 && N < 21) {
            System.out.println("Weird");
        }

        if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }

        scan.close();

    }

    private static void readIntDoubleAndString() {
        /**
         * If you use the nextLine() method immediately following the 
         * nextInt() method, recall that nextInt() reads integer tokens;
         * because of this, the last newline character for that line of integer 
         * input is still queued in the input buffer and the next nextLine() will be 
         * reading the remainder of the integer line (which is empty).
         */
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }

    private static void formattingOutput() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        
        for(int i=0;i<3;i++)
        {
            String str = sc.next();
            int a = sc.nextInt();
            
            System.out.printf("%-15s%03d\n",str,a);
        }
        
        System.out.print("================================");
    }

    private static void loops() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int x = 1;
        while (x < 11){
            System.out.printf("%s x %s = %s\n", N, x, N*x++); 
        }
        bufferedReader.close();
    }

    private static void createIntSeries() {
        /**
         * We use the integers , , and  to create the following series:
         * 
         */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println("t: " + t);

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int j = 0;

            while(j++ < n) {
                double result = a+(Math.pow(2, j)*b);
                System.out.print(result);
                System.out.print(" ");
            }
        }

        in.close();
    }


}