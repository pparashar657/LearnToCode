package classes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Dequee {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		
//		
//		dq.addFirst(1);
//		dq.addFirst(2);
//		
//		dq.addLast(3);
//		dq.addFirst(4);
//
//		System.out.println(dq.toString());
//		
//		dq.removeLast();
//		dq.removeFirst();
//		System.out.println(dq.toString());
		
		
//		dq.push(1);
//		dq.push(2);
//		dq.push(3);
//		dq.push(4);
//		dq.push(5);
//		
//		dq.pop();
//		
//		dq.pop();
//		
//		System.out.println(dq.peek());
		
		
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.add(4);
		dq.add(5);
		
		
		System.out.println(dq.peek());
		
		dq.remove();
		dq.remove();
		
		System.out.println(dq.peek());
		
		
		
	}

}
