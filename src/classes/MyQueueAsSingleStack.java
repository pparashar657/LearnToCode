package classes;

import java.util.Stack;

public class MyQueueAsSingleStack {
	
	Stack<Integer> stack;
	
	public MyQueueAsSingleStack() {
		stack = new Stack<>();
	}
	
	void add(int val) {
		stack.push(val);
	}
	
	boolean isEmpty() {
		return stack.isEmpty();
	}
	
	int remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int val = stack.pop();
		
		if(stack.isEmpty()) {
			return val;
		}
		
		int ans = remove();
		
		stack.push(val);
		
		return ans;
		
	}
	
	int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int val = stack.pop();
		
		if(stack.isEmpty()) {
			stack.push(val);
			return val;
		}
		
		int ans = peek();
		
		stack.push(val);
		
		return ans;
		
	}
	
	
}
