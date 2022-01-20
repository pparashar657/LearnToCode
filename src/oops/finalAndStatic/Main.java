package oops.finalAndStatic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        final int a = 10;
//        int b = a + 2;
//
//        System.out.println(a);

//        Base obj = new Base(10);
//        System.out.println(obj.data);
//        obj.data = 10;

//        Child childObj = new Child( 12);

//        Base baseObj = new Base();
//        baseObj.data.add(10);
//        baseObj.data.add(20);
//
//        baseObj.data = new ArrayList<>();
//
//        System.out.println(baseObj.data);


//        baseObj.test();
//        baseObj.test(10);
//        childObj.test();

        Base baseObj1 = new Base();

        Base baseObj2 = new Base();

        System.out.println(Base.data);

        baseObj1.test();
        baseObj2.test();

        Base.data = 20;

        baseObj1.test();
        baseObj2.test();

        Child objChild = new Child(10);

    }
}
