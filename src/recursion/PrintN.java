package recursion;

public class PrintN {

	public static void main(String[] args) {
		
		int n = 5;
		
		printN(n);

	}

	private static void printN(int n) {
		
		// Base case
		if (n == 1) {
			System.out.println(n);
			return;
		}
		
		// Recursive call
		printN(n-1);
		
		// Khud ka kaam
		System.out.println(n);
		
	}

}
