package oops.inheritance;

public class Car extends Vehicle {

    String companyName;
    String engineType;
    int numberOfDoors;

    Car() {
        super();
        System.out.println("I am default car constructor");
    }

//    Car(String name) {
//        super(name);
//        System.out.println("I am parameterized car constructor");
//    }

    Car(String name) {
        super(name);
        System.out.println("I am parameterized car constructor");
    }

    void start() {
        System.out.println(this.name +" is starting");
    }

    String getEngineType() {
        return engineType;
    }

    void printDetails() {
        System.out.println("Name = " + this.name);
        System.out.println("Price = " + this.price);
        System.out.println("Number of doors = " + this.numberOfDoors);
    }

    public String toString() {
        return
                "companyName='" + companyName + '\'' +
                ", engineType='" + engineType + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", Price=" + price;
    }
}
