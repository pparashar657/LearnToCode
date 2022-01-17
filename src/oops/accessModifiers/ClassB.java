package oops.accessModifiers;

public class ClassB extends ClassA {
    public int data3;

    public ClassB(int data1, int data2, int data3) {
        super(data1, data2);
        this.data3 = data3;
    }

    public void method3() {
        System.out.println("I am method 3 of class B, and data3 = " + data3);
    }

    public void test() {
        System.out.println(data1);
        System.out.println(data2);

        method1();
        method2();
    }
}
