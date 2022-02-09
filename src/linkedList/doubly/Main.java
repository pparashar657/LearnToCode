package linkedList.doubly;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        MyDoublyList list = new MyDoublyList();

        list.insert(10);
        list.insert(20);
        list.insert(2,30);
        list.insert(40);
        list.insert(0, 100);

        list.print();

        System.out.println(list.remove());

        System.out.println(list.remove(0));
        System.out.println(list.remove(1));

        list.print();
        list.remove();
        list.remove();
        list.remove();
        list.insert(0, 10);
        list.insert(20);
        list.print();

        Map<Integer, Integer> map = new HashMap<>();
//        map.put()
    }

}
