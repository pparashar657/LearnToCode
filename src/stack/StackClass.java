package stack;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(40);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        stack.push(100);

        System.out.println(stack.empty());


    }
}
