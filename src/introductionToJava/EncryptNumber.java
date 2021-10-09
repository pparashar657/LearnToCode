package introductionToJava;

import java.util.Scanner;

public class EncryptNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		int ans = encryptNumber(num);
		
		System.out.println(ans);
	}

	private static int encryptNumber(int num) {
		int digit = 0;
		int count = 0;
		int ans = 0;
		int exp = 0;
		while(num != 0) {
			count++;
			
			// Extract:
			digit = extractLastDigit(num);
			
			// Encode
			int new_digit = encodeDigit(digit, count);
			
			// Update ans
			ans = (int) (ans + new_digit*(Math.pow(10, exp++)));
		}
		return ans;
	}

	private static int encodeDigit(int digit, int count) {
		int new_digit = 0;
		

		if(count % 2 == 0) {
			new_digit = digit - 1;
		}
		else {
			new_digit = digit + 1;	
		}
		return new_digit % 10;
	}

	private static int extractLastDigit(int num) {
		int digit = num % 10;
		num /= 10;
		return digit;
	}

}
