package classes;

public class MainQueue {

	public static void main(String[] args) {
		MyQueueAsSingleStack que = new MyQueueAsSingleStack();
		
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		System.out.println(que.peek());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.isEmpty());
		System.out.println(que.remove());
		System.out.println(que.remove());
	}

}
