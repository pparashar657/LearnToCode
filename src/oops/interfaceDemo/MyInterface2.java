package oops.interfaceDemo;

public interface MyInterface2 {

    int data = 10;

    void test();

    default void test2() {
        System.out.println("I am in interface in method test2");
    }
}
