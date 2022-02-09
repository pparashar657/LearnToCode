package stack;

public class Main {

    public static void main(String[] args) {
        StackArr stack = new StackArr(2);

        stack.push(10);
        stack.push(15);
        stack.push(22);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        stack.display();
    }

}
