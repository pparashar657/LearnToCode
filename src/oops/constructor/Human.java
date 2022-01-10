package oops.constructor;

class Human {
    // data Properties
    String name;
    int age;
    String dob;
    boolean isMarried;

    // Default Constructor
    Human () {
        System.out.println("I am a default construct");
        name = "-";
        dob = "-";
    }

    // Parametrized Constructor
    Human (String name, int age, String dob) {
        System.out.println("I am a parametrized constructor");
        this.name = name;
        this.age = age;
        this.dob = dob;
    }


    // Method
    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void walking() {
        System.out.println(name + " is walking");
    }
}