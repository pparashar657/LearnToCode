package stack;

import java.util.Stack;

public class BasicCalculator {

    public static int calculate(String str) {

        String op = "";
        str += "+0";

        Stack<Integer> stack = new Stack<>();

        int ans = 0;
        int sign = 1;

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if(ch == ' ') continue;

            if(ch >= '0' && ch <= '9') {
                op += ch;
                continue;
            }
            int operand = -1;
            if(!op.equals("")) {
                operand = Integer.parseInt(op);
                ans += (sign * operand);
                op = "";
            }
            if(ch == '+') {
                sign = 1;
            } else if(ch == '-') {
                sign = -1;
            } else if(ch =='(') {
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            } else {
                ans = stack.pop()*ans + stack.pop();
                sign = 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "1+1-3";
        System.out.println(calculate(str));
    }

}
