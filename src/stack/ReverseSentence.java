package stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseSentence {

    public static void main(String[] args) {
        String str = "I am pawan";

        System.out.println(reverseWords(str));
        System.out.println(reverseChars(str));
    }

    private static String reverseChars(String str) {

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(char ch: str.toCharArray()) {
            if(ch != ' ') {
                stack.push(ch);
            } else {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }


    private static String reverseWords(String str) {

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        Stack<String> stack = new Stack<>();

        for(String word: words) {
            stack.push(word);
        }

        StringBuilder ans = new StringBuilder();

        while(!stack.empty()) {
            ans.append(stack.pop()).append(" ");
        }

        return ans.toString();
    }

}
