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
	
	void insert(int data, int pos) {
		MyLinkedList newObj =  new MyLinkedList(data);
		MyLinkedList temp = this;
		int count = 1;
		while (count<pos-1 && temp != null) {
			temp = temp.next;
			count++;
		}
		MyLinkedList nextNode = temp.next;
		temp.next = newObj;
		newObj.next = nextNode;
	}
	
	void remove_Last() {
		MyLinkedList temp = this;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	
	void remove(int pos) {
		MyLinkedList temp = this;
		int count = 1;
		while (count<pos-1 && temp != null) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
	}
	
	void update(int data, int pos) {
		this.remove(pos);
		insert(data,pos);
	}
	
	int size() {
		MyLinkedList temp = this;
		int count = 0;
		
		while(temp!=null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	boolean search(int data) {
		MyLinkedList temp = this;
		
		while(temp!=null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	MyLinkedList searchNode(int data) {
		MyLinkedList temp = this;
		
		while(temp!=null) {
			if (temp.data == data) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
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
