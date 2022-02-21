package queue;

import java.util.*;

public class PriorityQueueIntro {

    static class Mydata {
        String name;
        int age;

        public Mydata(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }


    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        pq.add(10);
//        pq.add(20);
//        pq.add(5);
//        pq.add(10);
//        pq.add(100);
//
//        System.out.println(pq);
//
//        System.out.println(pq.remove());
//
//        System.out.println(pq);
//
//        System.out.println(pq.peek());
//
//        System.out.println(pq.remove());
//
//        System.out.println(pq);

        PriorityQueue<Mydata> pq = new PriorityQueue<>(new Comparator<Mydata>() {
            @Override
            public int compare(Mydata o1, Mydata o2) {
                return o2.age-o1.age;
            }
        });

        Mydata mydata1 = new Mydata("Pawan", 50);
        Mydata mydata2 = new Mydata("Chirag", 100);

        pq.add(mydata1);
        pq.add(mydata2);

        System.out.println(pq.peek().name);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Integer[] arr = new Integer[10];
        Arrays.sort(arr, Collections.reverseOrder());




    }

}
