package oops.inheritance;

public class Pet extends Animal {

    String ownerName;
    String petType; // Dog | Cat | Mouse | Rabbit

    Pet() {
        System.out.println("I am default constructor pets");
    }

    Pet(String ownerName, String petType, int age) {
        super(age);
        System.out.println("I am parametrized constructor Pets");
        this.ownerName = ownerName;
        this.petType = petType;
    }

    @Override
    public String toString() {
        return super.toString() + ", ownerName='" + ownerName + '\'' +
                ", petType='" + petType;
    }
}
