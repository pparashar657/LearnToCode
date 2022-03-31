package heap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void inorder(int[] arr, int currIdx) {
        if(currIdx < 0 || currIdx >= arr.length) {
            return;
        }
        int leftIndex = 2*currIdx + 1;
        int rightIndex = 2*currIdx + 2;

        inorder(arr, leftIndex);
        System.out.print(arr[currIdx] +" ");
        inorder(arr, rightIndex);
    }

    public static void levelOrder(int arr[], int currIdx) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(currIdx);
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                int dataIdx = queue.remove();
                if(dataIdx < arr.length) {
                    System.out.print(arr[dataIdx] +" ");
                    queue.add(2*dataIdx + 1);
                    queue.add(2*dataIdx + 2);
                }
            }
            System.out.println();
        }
    }

    public static void heapSort(int[] arr) {

        Heap myHeap = new Heap(arr.length);
        myHeap.fastConstruct(arr);
        for(int i=arr.length-1;i>-1;i--) {
            arr[i] = myHeap.remove();
        }
    }

    public static void main(String[] args) {
//        int[] data = {8,7,5,6,2,3,4};
////        inorder(data, 0);
//        levelOrder(data, 0);

        Heap myHeap = new Heap(100);
//        myHeap.insert(10);
//        myHeap.insert(3);
//        myHeap.insert(15);
//        myHeap.insert(20);
//        myHeap.insert(5);
        int data[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        myHeap.construct(data);
//        myHeap.print();
//        System.out.println(myHeap.remove());
//        myHeap.print();
//
//        System.out.println(myHeap.remove());
//        myHeap.print();

//        myHeap.fastConstruct(data);
//        myHeap.print();
//        System.out.println("Fast Swaps needed = "+ myHeap.swap);
//
//        Heap myHeap2 = new Heap(100);
//        myHeap2.construct(data);
//        System.out.println("Slow Swaps needed = "+ myHeap2.swap);

        data = new int[]{8, 1, 5, 9, 2, 4, 90, 12, 3, 4, 71, 34};
        heapSort(data);
        System.out.println(Arrays.toString(data));
    }

}
