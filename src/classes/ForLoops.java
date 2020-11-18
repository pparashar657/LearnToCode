package classes;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
//		int arr[] = new int[];
		
//		for (int i=0;i<a.length;i++) {
//			System.out.print(a[i] + " ");
//		}
//		System.out.println();
//		int b[] = new int[10];
//		for (int i=0;i<b.length;i++) {
//			System.out.print(b[i] + " ");
//		}
//		b[0] = 10;
//		System.out.println();
//		for (int i=0;i<b.length;i++) {
//			System.out.print(b[i] + " ");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Plese enter the numbers :");
		
		for (int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int a:arr) {
			System.out.print(a + " ");
		}
	}

}







