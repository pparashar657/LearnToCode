package stack;

import java.util.Stack;

public class PrefixToInfix {

    public static String prefixToInfix(String str){

        Stack<String> stack = new Stack<>();

        for(int i=str.length()-1; i>-1;i--) {
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)) {
                stack.push(ch +"");
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String ans = "(" +op1 + ch + op2+ ")";
                stack.push(ans);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String str = "*-A/BC-/AKL";
        System.out.println(prefixToInfix(str));

    }

}
