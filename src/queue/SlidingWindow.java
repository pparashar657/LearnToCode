package queue;

import java.util.ArrayDeque;

public class SlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int windowSize = 0;

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int ans[] = new int[n-k+1];
        int ansIdx = 0;
        int start = 0;
        for(int end=0;end<n;end++) {
            if(windowSize == k) {
                ans[ansIdx++] = nums[deque.peek()];
                end--;
            }
            if(windowSize < k) {
                while(!deque.isEmpty() && nums[end] > nums[deque.peekLast()]) {
                    deque.removeLast();
                }
                deque.add(end);
                windowSize++;
            } else {
                start++;
                if(deque.peek() < start) {
                    deque.remove();
                }
                windowSize--;
            }
        }
        ans[ansIdx] = nums[deque.peek()];
        return ans;
    }

    public static void main(String[] args) {

    }

}
