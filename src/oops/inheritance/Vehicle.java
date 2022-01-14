package oops.inheritance;

public class Vehicle {

    public String name;
    int noOfTyre;
    int price;

    Vehicle() {
        super();
        System.out.println("I am default constructor in vehicle");
    }

    Vehicle(String name) {
        System.out.println("I am parametrized constructor in vehicle");
        this.name = name;
    }

    int getPrice() {
        return price;
    }

    String getName() {
        return name;
    }
}
