package classes;

class Node {
	int data;
	Node next;
	public Node(int val) {
		data = val;
		next = null;
	}
}

public class MyQueueAsLL {
	Node front;
	Node rear;
	
	public MyQueueAsLL() {
		front = null;
		rear = null;
	}
	
	void add(int val) {
		Node n = new Node(val);
		if (front == null) {
			front = n;
			rear = n;
			return;
		}
		rear.next = n;
		rear = n;
	}
	
	boolean isEmpty() {
		if (front == null) {
			return true;
		} else {
			return false;
		}
	}
	
	int remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int val = front.data;
		front = front.next;
		return val;
	}
	
	int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int val = front.data;
		return val;
	}
	
}
