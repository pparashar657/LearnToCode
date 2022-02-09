package linkedList.circular;

public class MyCLL {

    Node head;
    private Node tail;
    private int size;

    void insert(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    public void insert(int index, int data) {

        if(index == 0) {
            insertFirst(data);
            return;
        }

        if(index == size) {
            insert(data);
            return;
        }

        if(index > size || index < 0) {
            System.out.println("Not a valid Index");
            return;
        }

        Node newNode = new Node(data);
        Node prev = get(index-1);

        newNode.next = prev.next;
        prev.next = newNode;

        size++;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public Node get(int index) {
        Node temp = head;

        while(index-- > 0) {
            temp = temp.next;
        }
        return temp;
    }

    int remove() {

        if(head == null) {
            System.out.println("List is empty cannot remove");
            return -1;
        }
        int data = head.data;

        if(head == tail) {
            head = null;
            tail = null;
        } else {
            tail.next = head.next;
            head = head.next;
        }
        size--;
        return data;
    }

    public int remove(int index) {

        if(index >= size || index < 0) {
            System.out.println("Not a valid Index");
            return -1;
        }

        if(index == 0) {
            return remove();
        }

        if(index == size - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);

        int data = prev.next.data;

        prev.next = prev.next.next;

        size--;

        return data;
    }

    int removeLast() {
        Node prevNode = get(size-2);

        prevNode.next = head;
        int data = tail.data;
        tail = prevNode;
        size--;
        return data;
    }

    void print() {
        Node temp = head;
        do {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

}
