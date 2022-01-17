package oops.accessModifiers;

public class ClassA {

    public int data1;
    public int data2;

    public ClassA(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void method1() {
        System.out.println("I am method 1 of class A, and data1 = " + data1);
    }

    public void method2() {
        System.out.println("I am method 2 of class A, and data2 = " + data2);
    }
}
