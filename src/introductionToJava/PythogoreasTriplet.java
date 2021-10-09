package introductionToJava;

import java.util.Scanner;

public class PythogoreasTriplet {

	public static void main(String[] args) {
		float side1, side2, side3;
		System.out.println("Enter the 3 sides ");
		Scanner sc = new Scanner(System.in);
		side1 = sc.nextFloat();
		side2 = sc.nextFloat();
		side3 = sc.nextFloat();
		
		float side1_square = side1*side1;
		float side2_square = side2*side2;
		float side3_square = side3*side3;
		
		if ((side1_square + side2_square == side3_square) || (side1_square + side3_square == side2_square) || (side2_square + side3_square == side1_square)) {
			System.out.println("Yes, given numbers are pythogoreas triplet");
		} else {
			System.out.println("No, given numbers are not pythogoreas triplet");
		}

	}

}
