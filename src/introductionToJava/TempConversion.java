package introductionToJava;

import java.util.Scanner;

public class TempConversion {
	public static void main(String[] args) {
		
		float temp, newtemp;
		char unit;
		String unit_name;
		System.out.println("Enter the value of temperature");
		Scanner sc = new Scanner(System.in);
		 temp = sc.nextFloat();
		 System.out.println("Enter unit of temperature (c or C or f or F");
		 
		 unit = sc.next().charAt(0);
		 
		 if((unit == 'C')||(unit == 'c'))
				 {
					 newtemp = (float) (1.8*temp + 32);
					 unit_name = "Fareheniet";
					 System.out.println("The tempreature in "+ unit_name + "is: " + newtemp);
				 }
		 else if((unit == 'F')||(unit == 'f'))
			{
				 newtemp = ((float) (5/9.0))*(temp-32);
				 unit_name = "Celcius";
				 System.out.println("The tempreature in "+ unit_name + "is: " + newtemp);
				 
			}
			else 
			{
				System.out.println(" Wrong unit entered");
				
			}	 
	}
}
