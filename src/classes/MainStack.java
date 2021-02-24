package classes;

public class MainStack {
	
	public static void main(String[] args) {
//		MyStackAsArray stack = new MyStackAsArray();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.print();
//		stack.pop();
//		stack.pop();
//		System.out.println(stack.peek());
//		if (stack.isEmpty()) {
//			System.out.println("stack is empty");
//		}else {
//			System.out.println("stack is not empty");
//		}
//		stack.print();
		
		MyStackAsLL stack = new MyStackAsLL();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.print();
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		if (stack.isEmpty()) {
			System.out.println("stack is empty");
		}else {
			System.out.println("stack is not empty");
		}
		stack.print();
	}

}
