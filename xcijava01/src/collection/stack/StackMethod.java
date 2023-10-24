package collection.stack;

import java.util.Stack;

public class StackMethod {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(7);

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.size() = " + stack.size());
        System.out.println();

        System.out.println("stack.search(7) = " + stack.search(7));
        System.out.println("stack.search(3) = " + stack.search(3));
        System.out.println("stack.search(5) = " + stack.search(5));
        System.out.println("stack.search(2) = " + stack.search(2));
        System.out.println("stack.search(9) = " + stack.search(9));

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println();

        System.out.println("stack.empty() = " + stack.empty());
    }
}
