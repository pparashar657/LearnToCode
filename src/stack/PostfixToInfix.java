package stack;

import java.util.Stack;

public class PostfixToInfix {

    public static String postfixToInfix(String str){

        Stack<String> stack = new Stack<>();

        for(char ch: str.toCharArray()) {
            if(Character.isAlphabetic(ch)) {
                stack.push(ch +"");
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();

                String ans = "(" +op1 + ch + op2+ ")";
                stack.push(ans);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String str = "abc++";
        System.out.println(postfixToInfix(str));

    }

}
