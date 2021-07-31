package classes;

import java.util.LinkedList;
import java.util.Queue;

public class StackUSingQueues2 {
	Queue<Integer> q1;
	Queue<Integer> q2;
	
	public StackUSingQueues2() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	void push(int val) {
		q2.add(val);
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	boolean isEmpty() {
		return q1.isEmpty();
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		return q1.remove();
	}
	
	int top() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		return q1.peek();
	}
}
