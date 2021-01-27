package classes;

public class MyLLClass {
	
	static MyLinkedList insertFirst(MyLinkedList head, int data) {
		MyLinkedList newNode =  new MyLinkedList(data);
		newNode.next = head;
		return newNode;
	}
	
	static MyLinkedList removeFirst(MyLinkedList head) {
		head = head.next;
		return head;
	}

	public static void main(String[] args) {
		MyLinkedList head = new MyLinkedList(10);
		head.insert_Last(20);
		head.insert_Last(30);
		head.insert_Last(40);
		head.print();
		head.insert(90,5);
		head.print();
		head = insertFirst(head, 100);
		head.print();
		head.remove_Last();
		head.print();
		
		head.remove(3);
		head.print();
		
		head = removeFirst(head);
		head.print();
		System.out.println(head.size());
		
		System.out.println(head.search(90));
		
		
		head.update(50, 2);
		head.print();
	}
}
