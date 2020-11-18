package classes;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//pattern1(n);
		
		pattern4(n);
		
		
	}

	private static void pattern1(int n) {
		for (int i=0; i<n; i++) {
			// i -> rowNo
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
/*	
	    * rowNo - 1; noSpace = 4; noStar = 1;
      * * rowNo - 2; noSpace = 3; noStar = 2;
    * * * rowNo - 3; noSpace = 2; noStar = 3;
  * * * * rowNo - 4; noSpace = 1; noStar = 4;
* * * * * rowNo - 5; noSpace = 0; noStar = 5;

*/
	
	private static void pattern2(int n) {
		for (int i=1; i<=n; i++) {
			// i -> rowNo
			
			for (int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	/*
	 
	*
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    * 
	 
	 */
	
	
	private static void pattern4(int n) {
		// Upper Triangle
		
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<= n-i; j++) {
				System.out.print("-");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Lower Triangle
		
		for (int i = 1; i<=n-1; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("-");
			}
			
			for (int j=1; j<=n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
				
	}
	
	
}
