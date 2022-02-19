package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeIntro {

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.addFirst(30);
        deque.addLast(40);

        System.out.println(deque);

        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());

        System.out.println(deque);
    }
}
