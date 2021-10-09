package introductionToJava;

import java.util.Scanner;

public class DigitsIntoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ans = 0;
		
		for (int i=0;i<n ;i++) {
			int digit = sc.nextInt();
			ans = ans*10 + digit;
		}
		System.out.println(ans);
	}

}
