package classes;

import java.util.Random;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 2 numbers:");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("Enter the operation : ");
//		System.out.println("+, -, *, /, %");
//		char ops = sc.next().charAt(0);
//		double ans = -1;
//		if (ops == '+') {
//			ans = a+b;
//		} else if (ops == '-') {
//			ans = a-b;
//		}else if (ops == '*') {
//			ans = a*b;
//		}else if (ops == '/') {
//			ans = a/b;
//		}else if (ops == '%') {
//			ans = a%b;
//		}		
//		Random r = new Random();
//		int ans = r.nextInt(100);
//		System.out.println(ans);	
		
//		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(myPow(a,b));
	}
	

	private static double myPow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if (b == 1) {
			return a;
		}
		double smallAns = myPow(a,b/2); // 2^(2)
		double ans = smallAns * smallAns; // 2^4
		if (b % 2 != 0) {
			ans = ans*a;
		}
		return ans;
	}

}
