package heap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Heap {

    int[] data;
    int size;

    public Heap(int initialCapacity) {
        data = new int[initialCapacity];
    }

    public void insert(int ele) {
        // Step 1: add new ele to last
        // Step 2: Heapify

        if(size == data.length) {
            System.out.println("Heap Overflow");
            return;
        }

        data[size++] = ele;
        heapifyUp(size-1);
    }

    public void print() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()) {
            int count = queue.size();
            while(count-- > 0) {
                int dataIdx = queue.remove();
                if(dataIdx < size) {
                    System.out.print(data[dataIdx] +" ");
                    queue.add(2*dataIdx + 1);
                    queue.add(2*dataIdx + 2);
                }
            }
            System.out.println();
        }
    }

    private void heapifyUp(int currIdx) {
        if(currIdx == 0) {
            return;
        }
        int parentIdx = (currIdx-1)/2;
        if(data[currIdx] > data[parentIdx]) {
            int temp = data[currIdx];
            data[currIdx] = data[parentIdx];
            data[parentIdx] = temp;
            heapifyUp(parentIdx);
        }
    }

    public void construct(int[] arr) {
        for(int ele: arr) {
            insert(ele);
        }
    }

    public void fastConstruct(int[] arr) {
        for(int i=0;i< arr.length;i++) {
            data[i] = arr[i];
            size++;
        }
        for(int i = size-1;i>-1;i--) {
            heapifyDown(i);
        }
    }

    public int remove() {
        if(size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int temp = data[0];

        data[0] = data[size-1];
        size--;
        heapifyDown(0);
        return temp;
    }

    private void heapifyDown(int currIdx) {
        if(currIdx >= size) {
            return;
        }

        int leftIndex = 2*currIdx + 1;
        int rightIndex = 2*currIdx + 2;

        int leftVal = (leftIndex < size) ? data[leftIndex]:  Integer.MIN_VALUE;
        int rightVal = (rightIndex < size) ? data[rightIndex]:  Integer.MIN_VALUE;

        int maxIdx = (leftVal > rightVal)? leftIndex: rightIndex;
        if(maxIdx < size && data[maxIdx] > data[currIdx]) {
            int temp = data[currIdx];
            data[currIdx] = data[maxIdx];
            data[maxIdx] = temp;
            heapifyDown(maxIdx);
        }
    }
}
