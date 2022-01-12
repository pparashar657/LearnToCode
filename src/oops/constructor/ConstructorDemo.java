package oops.constructor;

public class ConstructorDemo {
    public static void main(String[] args) {

        // Default Constructor
        Human chirag = new Human();
        chirag.name = "Chirag Kaushik";

        System.out.println(chirag);

//        chirag.sleep();
        Human pawan = new Human();
        System.out.println(pawan);
//        pawan.sleep();

        // Parametrized Constructor
        Human rahul = new Human("Rahul Kumar", 22, "10-12-1998");
//        rahul.walking();

        System.out.println(rahul);
        Human rahul2 = new Human(rahul);

        String str = new String("Pawan");
        String str2 = new String("Pawan");

        if (str.equals(str2)) {
            System.out.println("equal");
        } else {
            System.out.println("Not equal");
        }

        if (rahul.equals(rahul2)) {
            System.out.println("equal");
        } else {
            System.out.println("Not equal");
        }


        System.out.println(rahul.age);
//
//        System.out.println(rahul2.name);
//        System.out.println(rahul2.age);
//        System.out.println(rahul2.dob);


        Human kartik = new Human("Kartik", "27-10-1999");
        Human ankit = new Human("Ankit");

    }
}
