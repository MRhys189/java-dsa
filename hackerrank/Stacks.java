package hackerrank;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("Hello");
        stack.push("Java");
        stack.push("World");
        System.out.println(stack.pop());
    }
}