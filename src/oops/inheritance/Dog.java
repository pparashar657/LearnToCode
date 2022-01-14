package oops.inheritance;

public class Dog extends Pet {

    String breed;
    String barkingVoice;

    Dog() {
        System.out.println("I am default constructor Dogs");
    }

    public Dog(String ownerName, String breed, String barkingVoice, int age) {
        super(ownerName, "Dog", age);
        this.breed = breed;
        this.barkingVoice = barkingVoice;
    }

    public String toString() {
        return super.toString() + ", breed='" + breed + '\'' +
                ", barkingVoice='" + barkingVoice;
    }

    void bark() {
        System.out.println(barkingVoice);
    }



}
