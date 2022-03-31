package heap;

import trees.binary.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {

    public static int getKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++) {
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++) {
            if(!pq.isEmpty() && pq.peek() < arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = {37,9,3,6,9,1,3,52,75,13,65};
        System.out.println(getKthLargest(arr, 6));

        PriorityQueue<Node> heap = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return 0;
            }
        });

    }

}
