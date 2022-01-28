package linkedList;

public class Swap2Nodes {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        list.print();
        swapNodes(list, 0, 3);
        list.print();
    }

    // TODO: Complete function to handle swap with head
    static void swapNodes(MyList<Integer> list, int first, int second) {

        Node<Integer> firstNode = list.get(first);
        Node<Integer> secondNode = list.get(second);

        Node<Integer> firstPrev = list.get(first - 1);
        Node<Integer> secondPrev = list.get(second - 1);


        firstPrev.next = secondNode;

        secondPrev.next = firstNode;

        Node<Integer> temp = firstNode.next;

        firstNode.next = secondNode.next;

        secondNode.next = temp;
    }


}
