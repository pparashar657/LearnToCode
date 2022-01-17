package oops.accessModifiers;

public class ClassC extends ClassB {

    public int data4;

    public ClassC(int data1, int data2, int data3, int data4) {
        super(data1, data2, data3);
        this.data4 = data4;
    }

    public void method4() {
        System.out.println("I am method 4 of class C, and data4 = " + data4);
    }

    public void test() {
        System.out.println(data1);
        System.out.println(data2);

        method1();
        method2();
    }
}
