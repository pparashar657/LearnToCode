package stack;

import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int arr[], int n)
    {
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = i+1;
            } else {
                ans[i] = i - stack.peek();
            }
            stack.push(i);
        }

        return ans;

    }


}
