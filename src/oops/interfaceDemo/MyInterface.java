package oops.interfaceDemo;

public interface MyInterface {

    int data = 0;

    void test();

    default void test2() {
        System.out.println("I am in interface in method test2");
    }
}
