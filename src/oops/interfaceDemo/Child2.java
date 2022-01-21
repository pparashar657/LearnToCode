package oops.interfaceDemo;

public class Child2 implements MyInterface{
    @Override
    public void test() {
        System.out.println("I am in Child 2 and data = " + data);
    }
}
