package recursion;

public class Factorial {

	public static void main(String[] args) {
		int n = 10;
		
		int ans = fact(n);
		
		System.out.println(ans);
	}

	private static int fact(int n) {
		
		// Base case
		if(n == 1) {
			return 1;
		}
		
		// Recursive call
		int smallAns = fact(n-1);
		
		// Khud ka kaam
		int ans = n * smallAns;
		
		return ans;
		
	}

}
