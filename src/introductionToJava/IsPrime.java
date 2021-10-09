package introductionToJava;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		num = sc.nextInt();
		int count=0;
		
		for (int curr = 2 ; curr< num; curr++) {
			
			boolean flag = false;
			
			// Check if curr is prime or not.
			for (int i = 2; i <= Math.sqrt(curr); i++) {
				if (curr % i == 0) {
					flag = true;
					break;
				}
			}
			
			if (!flag) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
