package classes;

public class Vehicle {
	float price;
	String color;
	int no_tyres;
	
	public Vehicle(float price, String color, int no_tyres) {
		this.price = price;
		this.color = color;
		this.no_tyres = no_tyres;
		//this.printVehicle();
	}
	
	void printVehicle() {
		System.out.println(price +" "+color+" "+no_tyres);
	}

}
