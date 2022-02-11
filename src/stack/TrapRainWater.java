package stack;

import java.util.Stack;

public class TrapRainWater {

    public int trap(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i=0;i<arr.length;i++) {
            int dist = 0;
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int top = stack.pop();
                if(!stack.isEmpty()) {
                    dist = i - stack.peek() - 1;
                    int height = Math.min(arr[i], arr[stack.peek()]) - arr[top];
                    ans += (dist * height);
                }
            }
            stack.push(i);
        }
        return ans;

    }

}
