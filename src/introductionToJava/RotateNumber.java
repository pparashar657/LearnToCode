package introductionToJava;

import java.util.Scanner;

public class RotateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int k;
		System.out.println("Enter number of rotations:");
		k = sc.nextInt();
	    int ans = rotateNumber(num, k);
	    
	    System.out.println(ans);
	}
	
	static int rotateNumber(int num, int numRotations) {
		int ans = 0;
		int count = 0;
		// Logic
		int num2 = num;
		
		while(num !=0) {
			count ++;
			num = num / 10;
			
		}
		int div = (int)Math.pow(10,numRotations);
	    int rem = num2 % div;
	    int temp = num2 / div;
	    ans = rem * (int) Math.pow(10, count - numRotations) + temp;
	    
	    return ans;
	}

}
