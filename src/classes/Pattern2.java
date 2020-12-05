package classes;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		pattern4(n,h,w);
	}

	/*
	 
***** *****
****   ****
***     ***
**       **
*         *
*         *
**       **
***     ***
****   ****
***** *****
	 
	 */
	
	private static void pattern1(int n) {
		
		// Upper Pattern
		for (int i=0;i<n;i++) {
			int noStars = n-i;
			for (int j=0;j<noStars;j++) {
				System.out.print("*");
			}
			
			for (int j=0;j<2*i+1;j++) {
				System.out.print(" ");
			}
			
			for (int j=0;j<noStars;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Lower pattern 
		
		for (int i=n-1;i>=0;i--) {
			int noStars = n-i;
			for (int j=0;j<noStars;j++) {
				System.out.print("*");
			}
			
			for (int j=0;j<2*i+1;j++) {
				System.out.print(" ");
			}
			
			for (int j=0;j<noStars;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	/*
	 
	*
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
	 
	 */
	
	static void helper(int i, int n) {
		for (int j=1;j<n-i;j++) {
			System.out.print(" ");
		}
		
		System.out.print("*");
		
		// Between Spaces
		for (int j=0;j<2*i-1;j++) {
			System.out.print(" ");
		}
		if (i !=0 )
			System.out.print("*");
	}
	
	
	private static void pattern2(int n) {
		
		// Upper Triangle
		for (int i=0;i<n;i++) {
			
			// INitial Spaces
			helper(i,n);
		}
		
		// Lower Triangle
		
		for (int i=n-2;i>=0;i--) {
			
			// INitial Spaces
			// For i = 3, 1<(5-3)
			helper(i,n);
		}	
		
	}
	
	/*
	 
	*         *         *     
   * *       * *       * *    
  *   *     *   *     *   *   
 *     *   *     *   *     *  
*       * *       * *       * 
 *     *   *     *   *     *  
  *   *     *   *     *   *   
   * *       * *       * *    
    *         *         *     
    *         *         *     
   * *       * *       * *    
  *   *     *   *     *   *   
 *     *   *     *   *     *  
*       * *       * *       * 
 *     *   *     *   *     *  
  *   *     *   *     *   *   
   * *       * *       * *    
    *         *         *     

	 
	 */
	
	private static void pattern4(int n,int h, int w) {
		for (int k=0;k<h;k++) {
			
			// Upper half of each diamond row
			for (int i=0;i<n;i++) {
				for (int l=0;l<w;l++) {
					helper2(i,n);
				}
				System.out.println();
			}
			
			
			// Lower half of each diamond row
			for (int i=n-2;i>=0;i--) {
				for (int l=0;l<w;l++) {
					helper2(i,n);
				}
				System.out.println();
			}
		}
	}

	private static void helper2(int i, int n) {
		helper(i,n);
		for (int j=0;j<n-i;j++) {
			System.out.print(" ");
		}
	}
	
	

}
