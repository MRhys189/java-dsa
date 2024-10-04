# Java DSA

## Kadane's Algorithm
- Kadane's algorithm is a greedy/dynamic programming algorithm that can be used on an array.
- It is used to calculate the maximum sum subarray ending at a particular position.


## String and Character methods
String.charAt(int index)
Character.isDigit(char ch)
Character.digit

### Convert String to int
String num = "1234"
int n = 0;

for(i = 0; i < num.length; i++) {
    n = n * 10 + (num.charAt(i) - '0');
}

### Convert int to String
String.valueOf()

### Java constructors
```
    class Main {
    private String name;

    // constructor
    Main() {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args) {

        // constructor is invoked while
        // creating an object of the Main class
        Main obj = new Main();
        System.out.println("The name is " + obj.name);
    }
    }
```
Output
`Constructor Called:`
`The name is Programiz`

