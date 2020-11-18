package classes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the operation : ");
		System.out.println("+, -, *, /, %");
		char ops = sc.next().charAt(0);
		double ans = -1;
		if (ops == '+') {
			ans = a+b;
		} else if (ops == '-') {
			ans = a-b;
		}else if (ops == '*') {
			ans = a*b;
		}else if (ops == '/') {
			ans = a/b;
		}else if (ops == '%') {
			ans = a%b;
		}		
		System.out.println(ans);	
	}

}
