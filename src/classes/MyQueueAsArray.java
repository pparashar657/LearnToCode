package classes;

public class MyQueueAsArray {
	
	private int arr[];
	private int front;
	private int rear;
	private int MAX_SIZE = 100;
	
	public MyQueueAsArray() {
		front = -1;
		rear = -1;
		arr = new int[MAX_SIZE];
	}
	
	void add(int val) {
		
		if (rear == MAX_SIZE-1) {
			System.out.println("Queue Overflow");
			return;
		}
		arr[++rear] = val;
		
		if (front == -1) {
			front = 0;
		}
	}
	
	boolean isEmpty() {
		if (front == -1 || front > rear) {
			return true;
		}else {
			return false;
		}
	}
	
	int remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		return arr[front++];
	}
	
	int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		return arr[front];
	}
	
	int size() {
		return rear - front + 1;
	}
	
}
