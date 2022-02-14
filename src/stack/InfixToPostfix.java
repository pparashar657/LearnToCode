package stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class InfixToPostfix {

    static int getPrec(char ch) {
        switch(ch) {
            case '^': return 4;
            case '*':
            case '/': return 3;
            case '+':
            case '-': return 1;
            default: return -1;
        }
    }

    //Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp)
    {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch : exp.toCharArray()) {
            if(Character.isAlphabetic(ch)) {
                ans.append(ch);
            } else {
                if(ch == '(') {
                    stack.push(ch);
                } else if(ch == ')') {
                    while(stack.peek() != '(') {
                        ans.append(stack.pop());
                    }
                    stack.pop();
                } else {
                    while(!stack.isEmpty() && getPrec(stack.peek()) > getPrec(ch)) {
                        ans.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }
        }
        while(!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.toString();
    }

    static void reverseStr(char[] chArr) {
        int start = 0;
        int end = chArr.length-1;
        while(start<end) {
            char temp = chArr[start];
            chArr[start] = chArr[end];
            chArr[end] = temp;
            start++;
            end--;
        }
    }

    public static String infixToPrefix(String exp) {
        char[] charArr = exp.toCharArray();

        reverseStr(charArr);

        for(int i=0;i<charArr.length;i++) {
            if(charArr[i] == '(') {
                charArr[i] = ')';
            } else if(charArr[i] == ')') {
                charArr[i] = '(';
            }
        }

        String ans = infixToPostfix(String.valueOf(charArr));

        return new StringBuilder(ans).reverse().toString();
    }


    public static void main(String[] args) {

        String str = "x+y*z/w+u";
        System.out.println(infixToPostfix(str));
        System.out.println(infixToPrefix(str));


    }

}
