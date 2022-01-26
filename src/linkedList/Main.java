package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        Node head = new Node(10);
//
//        Node tail = head;
//
//        // Link
//        tail.next = new Node(12);
//        tail = tail.next;
//
//        tail.next = new Node(15);
//        tail = tail.next;
//

//        MyList<Integer> list = new MyList<>();
//
//        list.add(10);
//        list.add(12);
//        list.add(15);
//
//        list.print();

//        MyList<String> list = new MyList<String>();
//
//        list.addLast("Pawan");
//        list.addLast("Chirag");
//
//        list.print();

        MyList<Integer> list = new MyList<>();

        list.add(1);
        list.add(2);
        list.addFirst(0);
        list.addLast(3);
        list.print();

        list.add(4,  10);
        list.addLast(12);
        list.addFirst(19);
        list.print();

        System.out.println(list.size());

        list.remove();
        System.out.println(list.removeLast());;
        System.out.println(list.remove(3));;

        list.print();

        System.out.println(list.size());

        list.remove(3);
        list.addLast(17);

        list.print();
        System.out.println(list.size());

        Node<Integer> res = list.search(2);

        System.out.println(res.data);


    }

}
