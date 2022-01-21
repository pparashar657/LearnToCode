package oops.interfaceDemo;

public class Child1 implements MyInterface, MyInterface2 {

    @Override
    public void test() {
        System.out.println("I am in Child 1 and data = " + MyInterface2.data);
    }

    @Override
    public void test2() {
        MyInterface2.super.test2();
    }
}
