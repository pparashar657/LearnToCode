package classes;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class SlidingWindowMax {

	public static void main(String[] args) {
		int arr[] = {1,6,3,9,2,-3,5,8,4};
		int k = 4;
		
		for (int a:maxSlidingWindow(arr, k)) {
			System.out.println(a);
		}
	}
	
	static class Pair {
		int value;
		int index;
		
		public Pair(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		int n = nums.length;
		int ans[] = new int[n-k+1];
		
		for (int i=0;i<n;i++) {
			
			while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
			
			if (i >= k-1) {
				while (!dq.isEmpty() && dq.peekFirst() <= i-k) {
					dq.removeFirst();
				}
				
				ans[i-k+1] = nums[dq.peekFirst()];
			}
			
		}
		
		return ans;
	}
	

}
