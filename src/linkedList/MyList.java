package linkedList;

public class MyList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public int size() {
        return size;
    }

    public Node<T> search(T data) {
        Node<T> temp = head;

        while(temp != null) {
            if(temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public T remove() {
        return removeFirst();
    }

    public T remove(int index) {

        if(index >= size || index < 0) {
            System.out.println("Not a valid Index");
            return null;
        }

        if(index == 0) {
            return removeFirst();
        }

        if(index == size - 1) {
            return removeLast();
        }

        Node<T> prev = get(index - 1);

        T data = prev.next.data;

        prev.next = prev.next.next;

        size--;

        return data;
    }

    public T removeLast() {

        if(size == 0) {
            System.out.println("List is empty, cannot remove anything");
            return null;
        }

        if(size == 1) {
            removeFirst();
        }

        T data = tail.data;
        Node<T> prev = get(size - 2);
        prev.next = null;
        tail = prev;
        size--;
        return data;
    }

    public T removeFirst() {

        if(size == 0) {
            System.out.println("List is empty, cannot remove anything");
            return null;
        }

        T data = head.data;
        head = head.next;

        if(head == null) {
            tail = null;
        }

        size--;

        return data;
    }


    // TC: O(1)
    public void addLast(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        size++;
    }

    // TC:
    public void add(T data) {
        addLast(data);
    }

    public void add(int index, T data) {

        if(index == 0) {
            addFirst(data);
            return;
        }

        if(index == size) {
            addLast(data);
            return;
        }

        if(index > size || index < 0) {
            System.out.println("Not a valid Index");
            return;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> prev = get(index-1);

        newNode.next = prev.next;
        prev.next = newNode;

        size++;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;

        if(tail == null) {
            tail = newNode;
        }
        size++;
    }

    public Node<T> get(int index) {
        Node<T> temp = head;

        while(index-- > 0) {
            temp = temp.next;
        }
        return temp;
    }

    // TC: O(n)
    public void print() {
        Node<T> temp = this.head;
        while (temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
