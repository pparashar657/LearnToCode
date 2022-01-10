package oops.introduction;

class Human {
    // data Properties
    String name;
    int age;
    String dob;
    boolean isMarried;

    // Method
    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void walking() {
        System.out.println(name + " is walking");
    }
}

class Student {
    String name;
    int rollNo;
    float marks;
}

public class ClassDemo {
    public static void main(String[] args) {

        // Why classes?

//        String[] names = new String[5];
//
//        int[] rollNo = new int[5];
//
//        float[] marks = new float[5];
//
//        Student[] students = new Student[5];
//
//        students[2].name = "Pawan";
//
//
        // Object creation

        Human chirag = new Human();
        chirag.name = "Chirag Kaushik";
        chirag.sleep();
        Human pawan = new Human();

//        chirag.walking();
        pawan.sleep();
//
//        chirag.age = 22;
//        chirag.name = "Chirag Kaushik";
//
//        chirag.sleep();
//
//        pawan.name = "Pawan Kumar";
//        pawan.walking();

//        System.out.println(chirag.age);
//
//        System.out.println(chirag.name);
//
//        System.out.println(chirag.isMarried);
//
//
//
//        System.out.println(pawan.isMarried);
//        System.out.println(pawan.age);
//        System.out.println(pawan.name);

    }
}
