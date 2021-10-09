package introductionToJava;

import java.util.Scanner;


public class QuadraticEqnRoots {

	public static void main(String[] args) {
		int a, b, c;
		float d;
		double root1, root2;
		System.out.println("Enter the coffecients of Quadratic equation(ax^2 + bx + c");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of coffecient of x^2");
		 a = sc.nextInt();
		System.out.println("Enter value of coffecient of x");
		 b = sc.nextInt();
		 System.out.println("Enter the constant");
		 c = sc.nextInt();
		 
		 System.out.println("Roots of quadratic equation are:");
		 System.out.println("Root 1 is");
		 
		 d = b*b - 4*a*c;
		 
		 if(d>=0)
		 {
			 root1 = (-b + Math.sqrt(d))/(2*a);
			 
			 root2 = (-b - Math.sqrt(d))/(2*a);
		 }
		 else
		 {
			 System.out.println("Roots are imaginary");
			 d = -1*d;
			 root1 = (-b + Math.sqrt(d))/(2*a);
			 
			 root2 = (-b - Math.sqrt(d))/(2*a);
		 }
		 
		 System.out.printf("root 1 is %.2f \n", root1);
		 System.out.printf("root 2 is %.2f \n", root2);
	
		 double n = root1;
		 
		 int no_of_places = 4;
		 
		 double exp = Math.pow(10, no_of_places);
		 
		 n = (int)( n* exp );
		 
		 n = n/exp;
		 
		 System.out.println(n);
		 
		 
		 
		 
		
		

	}

}
