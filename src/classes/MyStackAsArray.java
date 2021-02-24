package classes;

public class MyStackAsArray {
	
	int arr[];
	int top;
	
	public MyStackAsArray() {
		arr = new int[1000];
		top = -1;
	}
	
	void push(int x) {
		arr[++top] = x;
	}
	
	int pop() {
		return arr[top--];
	}
	
	int peek() {
		return  arr[top];
	}

	int size() {
		return top+1;
	}
	
	boolean isEmpty() {
//		if (top == -1) {
//			return true;
//		}else {
//			return false;
//		}
		return top == -1;
	}
	
	void print () {
		for (int i = top; i> -1; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
