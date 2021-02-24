package classes;

import java.util.LinkedList;

public class MyStackAsLL {
	LinkedList<Integer> top;
	
	public MyStackAsLL() {
		top = new LinkedList<>();
	}
	
	void push(int x) {
		top.add(0, x);
	}
	
	int pop() {
		return top.remove(0);
	}
	
	int peek() {
		return top.get(0);
	}

	int size() {
		return top.size();
	}
	
	boolean isEmpty() {
		return top.isEmpty();
	}
	
	void print () {
		for (int i=0;i<top.size();i++) {
			System.out.print(top.get(i) + " ");
		}
		System.out.println();
	}
}
