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
	
	static void swapNodes (MyLinkedList head, int firstData, int secondData) {
		MyLinkedList prevFirst = null;
		MyLinkedList prevSecond = null;
		
		MyLinkedList temp = head;
		
		// Find first, second, prevFirst and prevSecond
		while(temp != null && temp.next != null) {
			if (temp.next.data == firstData) {
				prevFirst = temp;
			}else if (temp.next.data == secondData) {
				prevSecond = temp;
			}
			temp = temp.next;
		}
		MyLinkedList first = prevFirst.next;
		MyLinkedList second = prevSecond.next;
		
		// right connections
		temp = first.next;
		first.next = second.next;
		if (second != temp) {
			second.next = temp;
		} else {
			second.next = first;
		}
		
		//left connections
		
		prevFirst.next = second;
		if (prevSecond != first) {
			prevSecond.next = first;
		}
		
	}
	
	static MyLinkedList reverseList(MyLinkedList head)
    {
		if (head.next == null) {
            return head;
        }
        
		MyLinkedList newHead = reverseList(head.next);
		MyLinkedList temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return newHead;
    }
	
	
	static MyLinkedList helper(MyLinkedList head, int key) {
		MyLinkedList curr = head;
		while(curr.next!=null) {
			if (curr.next.data != key) {
				curr.next = curr.next.next;
			}else {
				curr = curr.next;
			}
			
		}
		if (head.data!=key) {
			head = head.next;
		}
		return head;
	}
	
	static MyLinkedList sortList(MyLinkedList head) {
		int count = head.size();
		while (count-- > 0) {
			MyLinkedList temp = head;
			while (temp != null && temp.next != null) {
				if (temp.data > temp.next.data) {
					swapNodes(head, temp.data, temp.next.data);
					temp = temp.next;
				}
				temp = temp.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		MyLinkedList head = new MyLinkedList(1);
		head.insert_Last(40);
		head.insert_Last(30);
		head.insert_Last(10);
		head.insert_Last(80);
		head.insert_Last(25);
		head.insert_Last(50);
		head.insert_Last(70);
		head.insert_Last(90);
		//head = helper(head, 40);
		head.print();
		//swapNodes(head, 40, 30);
		head = sortList(head);
		head.print();
		
//		head.print();
//		head.insert(90,5);
//		head.print();
//		//head = insertFirst(head, 100);
//		head.print();
////		head.remove_Last();
//		head.print();
//		
////		head.remove(3);
//		head.print();
//		
////		head = removeFirst(head);
//		head.print();
////		System.out.println(head.size());
////		
////		System.out.println(head.search(90));
////		
//		
//		head.update(50, 2);
//		head.print();
//		swapNodes(head, 50, 90);
//		System.out.println("After swapping");
//		head.print();
//		
//		head = reverseList(head);
//		head.print();
	}
}
