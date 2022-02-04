package linkedList.doubly;

public class MyDoublyList {

    private Node head;
    private Node tail;
    private int size;

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = tail.next;
        }
        size++;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }


    public void insert(int index, int data) {
        if(index < 0 || index > size) {
            System.out.println("Invalid Index, Cannot insert Node");
            return;
        }

        if(index == size) {
            insert(data);
            return;
        }
        if(index == 0) {
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        Node cur = getNode(index);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
        node.prev.next = node;
        size++;
    }

    private int removeFinal() {
        int data = head.data;
        head = tail = null;
        size--;
        return data;
    }


    public int remove() {
        if(head == null) {
            System.out.println("Cannot remove, list is empty");
            return -1;
        }

        if(head.next == null) {
            return removeFinal();
        }

        int data = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return data;
    }

    public int removeLast() {
        if(head == null) {
            System.out.println("Cannot remove, list is empty");
            return -1;
        }

        if(head.next == null) {
            return removeFinal();
        }
        int data = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return data;
    }

    public int remove(int index) {

        if(index < 0 || index >= size) {
            System.out.println("Invalid Index, Cannot insert Node");
            return -1;
        }
        if(index == size-1) {
            return removeLast();
        }
        if(index == 0) {
            return remove();
        }

        Node curr = getNode(index);
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        size--;
        return curr.data;
    }

    public void remove(Node curr) {
        if(curr.next == null) {
            return;
        }

        if(curr.prev == null) {
            remove();
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }



    public Node getNode(int index){
        Node temp= head;
        while(index>0){
            temp = temp.next;
            index--;
        }
        return temp;
    }

    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " - ");
            temp = temp.next;
        }
        System.out.println("null");

    }


}
