package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });

        for(ListNode head: lists) {
            if(head != null)
                heap.add(head);
        }

        ListNode ans = null;
        ListNode tail = null;

        while(!heap.isEmpty()) {
            if(ans != null) {
                tail.next = heap.remove();
                tail = tail.next;
            } else {
                ans = heap.remove();
                tail = ans;
            }
            if(tail.next != null) {
                heap.add(tail.next);
            }
        }

        return ans;
    }
}
