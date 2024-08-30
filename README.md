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

