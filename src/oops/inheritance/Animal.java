package oops.inheritance;

public class Animal {
    int age;

    Animal() {
        System.out.println("I am default constructor animal");
    }

    Animal(int age) {
        System.out.println("I am parameterized constructor animal");
        this.age = age;
    }

    @Override
    public String toString() {
        return "age=" + age;
    }
}
