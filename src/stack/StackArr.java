package stack;

public class StackArr {

    private final static int DEFAULT_SIZE = 10;

    private int[] arr;
    private int size;

    public StackArr() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public StackArr(int size) {
        this.arr = new int[size];
    }

    public void push(int data) {
        if(size == arr.length) {
            System.out.println("Not enough size available");
            return;
        }
        arr[size++] = data;
    }

    public int pop() {
        if(size == 0) {
            System.out.println("No elements in Stack");
            return -1;
        }
        size--;
        return arr[size];
    }

    public int peek() {
        if(size == 0) {
            System.out.println("No elements in Stack");
            return -1;
        }
        return arr[size-1];
    }

    public int size() {
        return size;
    }

    public void display() {
        int index = size;
        System.out.println("---");
        while(index-- > 0) {
            System.out.println(arr[index]);
        }
        System.out.println("---");
    }
}
