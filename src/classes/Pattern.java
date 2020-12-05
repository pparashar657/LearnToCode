package classes;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		pattern11(n);
		
		
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
	
	/*
1 2 3 4 5  space - 0 Num - 1-5
 2 3 4 5   space - 1 Num - 2-5
  3 4 5    space - 2 Num - 3-5
   4 5 	   space - 3 Num - 4-5
    5 	   space - 4 Num - 5-5
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5

	 
	 */
	
	private static void pattern5(int n) {
		
		// Upper Triangle
		
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<i; j++) {
				System.out.print(" ");
			}
			
			for (int j=i; j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// Lower Triangle
		
		for (int i = 1; i<=n-1; i++) {
			for (int j = 1; j< n-i; j++) {
				System.out.print(" ");
			}
			
			for (int j=n-i; j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
				
	}
	
	/*
	 
A B C D E F  6
A B C D E    5
A B C D      4
A B C        3
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
	 
	 */
	
	private static void pattern6(int n) {
		// upper triangle
		for(int i=1; i<=n; i++) {
			int ch = 64;
			for (int j=1; j<=n-i+1; j++) {
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
		
		// Lower Triangle
		for(int i=1; i<=n; i++) {
			int ch = 64;
			for (int j=1; j<=i; j++) {
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
	}
	
	
	/*
	 
	     	 1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1
	 
	 
	 */
	
	private static void pattern7(int n) {
		
//		for(int i=0;i<n;i++) {
//			
//			for (int j=1;j<n-i;j++) {
//				System.out.print(" ");
//			}
//			
//			for (int j=0;j<=i;j++) {
//				System.out.print(nCr(i,j)+" ");
//			}
//			System.out.println();
//		}	
		
		for (int i = 0; i < n; i++) {
			for (int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number+" ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
	}

	private static int nCr(int n, int r) {
		int ans = 1;
		ans = fact(n)/(fact(r)*fact(n-r));
		return ans;
	}
	
	//  n! = n*(n-1)!
	private static int fact(int n) {
		int ans = 1;
		for (int i=1;i<=n;i++) {
			ans = ans*i;
		}
		return ans;
	}
	
	/*
	 
	  
    *
   * *		1
  *   *		3
 *     *	5
*       *
 *     *
  *   *
   * *
    * 
	 
	 
	 */
	
	private static void pattern8(int n) {
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j=0;j<2*i-1;j++) {
				System.out.print(" ");
			}
			if(i != 0)
				System.out.print("*");
			System.out.println();
		}
		
		for (int i=n-1;i>0;i--) {
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j=1;j<2*(i-1);j++) {
				System.out.print(" ");
			}
			if (i != 1)
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	private static void pattern9(int n) {
		int i,j;
		for(i = 0; i < n; i++)
        {
            for(j = 0; j < (2 * n); j++)
            {
                if(i + j <= n - 1)  // upper left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if((i + n) <= j) // upper right triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        // bottom half of the pattern
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < (2 * n); j++)
            {
                if(i >= j)  // bottom left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if(i >= (2 * n - 1) - j)  // bottom right triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}
	
	private static void pattern11(int n) {
		int i,j;
		for(i = 0; i < n; i++)
		{
		for(j = 0; j < n; j++)
		{
		// left diagonal, right diagonal, top horizontal, bottom horizontal, left vertical, right vertical
		if(i == j || i + j == n - 1 || i == 0 || i == n - 1 || j == 0 || j == n - 1)
		System.out.print("*");
		else
		System.out.print(" ");
		}
		System.out.println();
		}
		}
	
	private static void pattern10(int n, int h, int w) {
		for (int k=0;k<h;k++) {
			for (int i=0;i<n;i++) {
				for (int l=0;l<w;l++) {
					for (int j=0;j<n-i-1;j++) {
						System.out.print(" ");
					}
					System.out.print("*");
					for (int j=0;j<2*i-1;j++) {
						System.out.print(" ");
					}
					if(i != 0)
						System.out.print("*");
					
					for (int j=0;j<n-i-1;j++) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			for (int i=n-1;i>0;i--) {
				for(int l=0;l<w;l++) {
					for (int j=1;j<=n-i;j++) {
						System.out.print(" ");
					}
					System.out.print("*");
					for (int j=1;j<2*(i-1);j++) {
						System.out.print(" ");
					}
					if (i != 1)
						System.out.print("*");
					for (int j=0;j<(n-i);j++) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
	}
	
	
}
