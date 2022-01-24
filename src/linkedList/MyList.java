package linkedList;

public class MyList<T> {
    private Node<T> head;
    private Node<T> tail;

    // TC: O(1)
    void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    // TC: O(n)
    void print() {
        Node<T> temp = this.head;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

}
