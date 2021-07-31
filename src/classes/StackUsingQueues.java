package classes;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	Queue<Integer> q1;
	Queue<Integer> q2;
	
	public StackUsingQueues() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	void push(int val) {
		q1.add(val);
	}
	
	boolean isEmpty() {
		return q1.isEmpty();
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		while (q1.size() != 1) {
			q2.add(q1.remove());
		}
		
		int val = q1.remove();
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		
		return val;
	}
	
	int top() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		while (q1.size() != 1) {
			q2.add(q1.remove());
		}
		
		int val = q1.remove();
		
		q2.add(val);
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		
		return val;
	}
}

