package classes;

import java.util.Stack;

public class MyQueueAsStacks {
	
	Stack<Integer> stack1;
	Stack<Integer> stack2;
	
	public MyQueueAsStacks() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	void add(int val) {
		stack1.push(val);
	}
	
	boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
	
	int remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		if (!stack2.isEmpty()) {
			return stack2.pop();
		}
		
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		
		return stack2.pop();
	}
	
	int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		if (!stack2.isEmpty()) {
			return stack2.peek();
		}
		
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		
		return stack2.peek();
	}
}
