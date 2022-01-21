package oops.abstractDemo;

abstract public class Base {

    int data;

    public Base(int data) {
        this.data = data;
    }

    void test() {
        System.out.println("I am in base class with data = " + data);
    }

    abstract void changeData(int val);
}
