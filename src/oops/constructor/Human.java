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

    Human (String name, String dob) {
        System.out.println("I am a another parametrized constructor");
        this.name = name;
        this.dob = dob;
    }

    Human (String name, int age) {
        System.out.println("I am a another parametrized constructor");
        this.name = name;
        this.age = age;
    }

    Human (int age, String name) {
        System.out.println("I am a another parametrized constructor");
        this.name = name;
        this.age = age;
    }

    Human (String name) {
        System.out.println("I am a another parametrized constructor");
        this.name = name;
    }

    // Parametrized Constructor
    Human (String name, int age, String dob) {
        System.out.println("I am a parametrized constructor");
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    // Copy constructor
    Human (Human otherObject) {
        System.out.println("This is copy constructor");
        this.age = otherObject.age;
        this.name = otherObject.name;
        this.dob = otherObject.dob;
        this.isMarried = otherObject.isMarried;
    }

    // Method
    void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    void walking() {
        System.out.println(this.name + " is walking");
    }

    boolean equals(Human anotherHuman) {
        return this.age == anotherHuman.age &&
                this.name.equals(anotherHuman.name) &&
                this.dob.equals(anotherHuman.dob) &&
                this.isMarried == anotherHuman.isMarried;
    }
}