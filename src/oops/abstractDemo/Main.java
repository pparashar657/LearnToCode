package oops.abstractDemo;

public class Main {

    public static void main(String[] args) {
//        Base obj = new Base();

        Child1 childObj1 = new Child1(10);
        Child2 childObj2 = new Child2(10);

        childObj1.changeData(5);

        childObj2.changeData(5);

        childObj1.test();
        childObj2.test();
    }

}
