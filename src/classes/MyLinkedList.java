package classes;

public class MyLinkedList {
	int data;
	MyLinkedList next;
	
	public MyLinkedList(int data) {
		this.data = data;
	}
	
	// [Imp.] 'this' will point to the object through which we call the functions.
	
	void insert_Last(int data) {
		MyLinkedList temp = this;
		while (temp.next != null) {
			temp = temp.next;
		}
		MyLinkedList newObj =  new MyLinkedList(data);
		temp.next = newObj;
	}
	
	void print() {
		MyLinkedList temp = this;
		while (temp != null) {
			System.out.print(temp.data +"->");
			temp = temp.next;
		}
		System.out.println("Null");
	}
	
}
