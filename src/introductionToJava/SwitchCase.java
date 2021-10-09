package introductionToJava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		char ch;
	System.out.println("Enter any character between(A to Z");
	Scanner sc = new Scanner(System.in);
	ch = sc.next().charAt(0);
	switch(ch)
	{
		case 'A' : System.out.println("Voweel");
					break;
		case 'E' : System.out.println("Voweel"); break;
		case 'O' : System.out.println("Voweel"); break;
		case 'I' : System.out.println("Voweel");break; 
		case 'U' : System.out.println("Voweel"); break;
		default : System.out.println("Consonant");
	}
	

	}

}
