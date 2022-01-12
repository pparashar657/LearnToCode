package oops.inheritance;

public class Main {

    public static void main(String[] args) {
        Car baleno = new Car();

        baleno.companyName = "Maruti";
        baleno.numberOfDoors = 4;
        baleno.engineType = "Petrol";

        baleno.price = 1000;

        baleno.name = "Baleno";

        baleno.noOfTyre = 4;

        baleno.printDetails();

        System.out.println(baleno.getPrice());


        ElectricCar tesla = new ElectricCar();
        tesla.name = "Tesla Model S";
        tesla.price = 1000000;

        ElectricCar audi = new ElectricCar();
        audi.name = "Audi S class";
        audi.price = 1000000;

        System.out.println(tesla.equals(audi));

        System.out.println(tesla);
        System.out.println(baleno);
    }

}
