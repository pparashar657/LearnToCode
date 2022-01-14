package oops.inheritance;

public class Cat extends Pet {

    String furType;

    Cat() {
        System.out.println("I am default constructor Cats");
    }

    public Cat(String ownerName, int age, String furType) {
        super(ownerName, "Cat", age);
        this.furType = furType;
    }

    @Override
    public String toString() {
        return super.toString() + ", furType='" + furType;
    }
}
