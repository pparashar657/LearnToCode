package linkedList.doubly;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int data;
    Node next;
    Node prev;

    public Node(int key, int data) {
        this.key = key;
        this.data = data;
    }
}

class MyDoublyList {
    Node head;
    Node tail;

    int size;

    public void insert(Node node) {
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


    private void removeFinal() {
        head = tail = null;
        size--;
    }

    public void removeLast() {
        if(head == null) {
            return;
        }

        if(head.next == null) {
            removeFinal();
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }


    public void remove() {
        if(head == null) {
            return;
        }

        if(head.next == null) {
            removeFinal();
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    public void remove(Node curr) {

        if(curr.prev == null && curr.next == null) {
            removeFinal();
            return;
        }

        if(curr.next == null) {
            removeLast();
            return;
        }

        if(curr.prev == null) {
            remove();
            return;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        size--;
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

class LRUCache {

    Map<Integer, Node> map;
    int capacity;
    MyDoublyList list;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        list = new MyDoublyList();
        map = new HashMap<>();
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            list.remove(node);
            list.insert(node);
            return node.data;
        }
        return -1;
    }

    public void put(int key, int value) {

        if(map.containsKey(key)) {
            map.get(key).data = value;
            get(key);
            return;
        }

        if(list.size == capacity) {
            map.remove(list.head.key);
            list.remove();
        }

        Node node = new Node(key, value);
        map.put(key, node);
        list.insert(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */