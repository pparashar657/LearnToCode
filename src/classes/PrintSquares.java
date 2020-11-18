package classes;

import java.util.Scanner;

public class PrintSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int len = sc.nextInt();
		System.out.println("Plese enter the numbers:");
		int arr[] = new int[len];
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The squares of the numbers are :");
		for (int a:arr) {
			int sqr = a*a;
			System.out.print(sqr + " ");
		}

	}

}
