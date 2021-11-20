package arrays;

import java.util.*;

public class QuesArray1 {

	public static void main(String[] args) {
		// Take input from an array and print 
		// 1. Sum
		// 2. Average
		// 3. Max and Min, of the array

//		int a = 10;
//		
//		a = "Pawan";
//		
//		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the length");
//		int len = sc.nextInt();
//
//		int arr[] = new int[len];
//
//		System.out.println("Enetr the elemnts");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int sum = 0;
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		for (int num: arr) {
//			sum += num;
//			max = Math.max(max, num);
//			min = Math.min(min, num);
//		}
//		
//		System.out.println("The sum = " + sum);
//		System.out.println("The average = " + (float) sum/ (1.0 * arr.length));
//		System.out.println("The max = " + max);
//		System.out.println("The min = " + min);
//		
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		int[] b = new int[6];
		
		System.arraycopy(a, 4, b, 0, 2);
		
		System.out.println(Arrays.toString(b));


	}

}
