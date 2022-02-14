package stack;

import java.util.Stack;

public class balanceParanthesis {

    public static int minInsertions(String s) {

        Stack<Character> stack = new Stack<>();

        int ans = 0;

        for(char ch: s.toCharArray()) {
            if(ch == ')') {
                if(!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    ans++;
                }
            } else {
                stack.push(ch);
            }
        }

        return ans + stack.size();
    }

    public static void main(String[] args) {
        String str = "(())()()()";
        System.out.println(minInsertions(str));
    }

}
