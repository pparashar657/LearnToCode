package linkedList.circular;

public class Main {

    static class circular_LinkedList {
        Node head, head1, head2;
    }

    static void splitList(circular_LinkedList list)
    {
        Node head = list.head;

        int size = 0;

        Node temp = head;

        do {
            temp = temp.next;
            size++;
        } while(temp != head);

        System.out.println(size);
        int mid = (size-1)/2;
        temp = head;
        while(mid-- > 0) {
            temp = temp.next;
        }

        System.out.println("Mid = " + temp.data);

        list.head1 = head;
        list.head2 = temp.next;
        temp.next = null;

        temp = list.head2;
        while(temp.next != head) {
            temp = temp.next;
        }

        temp.next = null;

        print(list.head1);
        print(list.head2);
    }

    public static void print(Node temp) {
        while (temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyCLL list = new MyCLL();

        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(18);
        list.insert(2,27);

        list.insert(0,100);
        list.insert(6,198);

        list.print();

        circular_LinkedList cll = new circular_LinkedList();
        cll.head = list.head;

        splitList(cll);

//        list.remove();
//
//        list.remove();
//        list.remove(4);
//        list.print();


    }

}
