package oops.constructor;

public class ConstructorDemo {
    public static void main(String[] args) {

        // Default Constructor
        Human chirag = new Human();
        chirag.name = "Chirag Kaushik";
        chirag.sleep();
        Human pawan = new Human();
        pawan.sleep();

        // Parametrized Constructor
        Human rahul = new Human("Rahul Kumar", 22, "10-12-1998");
        rahul.walking();
    }
}
