package classes;

public class MyLLClass {

	public static void main(String[] args) {
		MyLinkedList head = new MyLinkedList(10);
		head.insert_Last(20);
		head.insert_Last(30);
		head.insert_Last(40);
		head.print();
	}

}
