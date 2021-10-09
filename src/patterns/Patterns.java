package patterns;

public class Patterns {

	public static void main(String[] args) {
//		pattern11(9);
		pascalTriangle(5);

	}


	//	Patern 1

	//	* * * * * 
	//	* * * * * 
	//	* * * * * 
	//	* * * * * 
	//	* * * * * 

	private static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {

			// Inner loop | For columns

			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

	// Pattern 2
	//	
	//	* 
	//	* * 
	//	* * * 
	//	* * * * 
	//	* * * * * 


	private static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {

			// Inner loop | For columns

			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

	// Pattern 3
	//	
	//	* * * * * 
	//	* * * * 
	//	* * * 
	//	* * 
	//	* 

	private static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {

			// Inner loop | For columns

			for (int col = 0; col <= n - row; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

	// Pattern 4

	//	* 
	//	* * 
	//	* * * 
	//	* * * * 
	//	* * * * * 
	//	* * * * 
	//	* * * 
	//	* * 
	//	* 


	private static void pattern4(int n) {
		for (int row = 1; row < 2*n; row++) {

			int colCount = (row <= n) ? row : (2*n - row);

			for (int col = 1; col <= colCount; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

	// Pattern 5

	//	1 
	//	1 2 
	//	1 2 3 
	//	1 2 3 4 
	//	1 2 3 4 5 
	//	1 2 3 4 
	//	1 2 3 
	//	1 2 
	//	1 


	private static void pattern5(int n) {
		for (int row = 1; row < 2*n; row++) {

			int colCount = (row <= n) ? row : (2*n - row);

			for (int col = 1; col <= colCount; col++) {
				System.out.print(col + " ");
			}

			System.out.println();

		}

	}


	private static void pattern6(int n) {
		for (int row = 1; row <= n; row++) {

			// SPace print
			for (int col = 1; col <= n - row; col++) {
				System.out.print("  ");
			}

			// SPace print
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}


	private static void pattern7(int n) {
		for (int row = 1; row <= n; row++) {

			// SPace print
			for (int col = 1; col < row; col++) {
				System.out.print("  ");
			}

			// SPace print
			for (int col = 0; col <= n - row; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

	//		*
	//	    **
	//	    ***
	//	    ****
	//	    *****
	//	    ****
	//	    ***
	//	    **
	//	    *


	private static void pattern8(int n) {
		int count = 1;
		for (int row = 1; row <= 2*n - 1; row++) {
			int colNum = (row <= n) ? row: 2 * n - row;

			for (int col = 1; col <= colNum; col++) {
				System.out.print(count++);
			}

			System.out.println();

		}
	}
	private static void pattern9(int n) {

		for(int r = 1;r <= 2*n-1;r++) {
			int spnum = (r <= n) ? r-1 : 2*n - r -1;
			int stnum = (r<=n) ? n - r +1 : r - n + 1;
			for(int c = 0;c <= spnum ;c++) {
				System.out.print(" ");

			}
			for(int c = 1;c <= stnum ;c++) {
				System.out.print("* " );
			}
			System.out.println();
		}


	}

	private static void pattern10(int n) {
		for (int row = 1; row <= n; row++) {
			
			if ( row == n) {
				for (int col = 1; col <= 2*n - 1; col ++) {
					System.out.print("*");
				}
			} else {
				
				for (int col = 1; col<= n - row; col++) {
					System.out.print(" ");
				}
				
				
				for (int col = 1; col <= 2*row-1; col++) {
					if ( col == 1 || col == 2*row - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println();
		}
	}
	
	private static void pattern11(int n) {
		for (int row = 1; row <= 2*n -1; row ++) {
			// Space
			
			int spaceNum = (row <= n) ? n - row: row - n;
			
			for (int col = 1; col <= spaceNum; col++) {
				System.out.print(" ");
			}
			
			
			
			// ENtity
			
			int entityCount = (row <= n)? row: 2*n - row;
			for (int col = 1; col <= entityCount; col ++) {
				if (col == 1 || col == entityCount) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
				
			System.out.println();	
		}
		
	}
	
	private static void pascalTriangle(int n) {
		for (int row = 0 ; row < n; row++) {
			for(int col = 1; col < n - row; col++) {
				System.out.print(" ");
			}
			int value = 1;
			System.out.print(value+" ");
			
			for (int col = 1; col <= row; col++) {
				value = value * (row - col + 1)/ col;
				System.out.print(value+ " ");
			}
			System.out.println();
		}
	}
}

