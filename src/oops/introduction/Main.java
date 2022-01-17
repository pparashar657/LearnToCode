package oops.introduction;

import oops.accessModifiers.ClassA;

public class Main {

    public static void main(String[] args) {
        ClassA obj = new ClassA(15, 20);
        System.out.println(obj.data1);
        System.out.println(obj.data2);
        obj.method1();
        obj.method2();
    }

}
