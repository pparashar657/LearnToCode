package oops.inheritance;

public class Main {

    public static void main(String[] args) {
//        Car baleno = new Car();
//
//        Car i10 = new Car("Hundai i10");
//        System.out.println(i10.name);

//        baleno.companyName = "Maruti";
//        baleno.numberOfDoors = 4;
//        baleno.engineType = "Petrol";
//
//        baleno.price = 1000;
//
//        baleno.name = "Baleno";
//
//        baleno.noOfTyre = 4;
//
//        baleno.printDetails();
//
//        System.out.println(baleno.getPrice());
//
//
//        ElectricCar tesla = new ElectricCar();
//        tesla.name = "Tesla Model S";
//        tesla.price = 1000000;
//
//        ElectricCar audi = new ElectricCar();
//        audi.name = "Audi S class";
//        audi.price = 1000000;
//
//        System.out.println(tesla.equals(audi));
//
//        System.out.println(tesla);
//        System.out.println(baleno);

        // This is default constructor calling.
//        Dog tommy = new Dog();

//        tommy.age = 10;
//        tommy.breed = "Labra";
//        tommy.petType = "Dog";
//        tommy.barkingVoice = "Wohhhhh";
//        tommy.ownerName = "Pawan";


//

        Dog tommy = new Dog("Pawan", "Labra", "Wohooooo", 5);
        System.out.println(tommy);
        tommy.bark();

        Cat kittu = new Cat("Chirag", 3, "Smooth");
        System.out.println(kittu);
    }

}
