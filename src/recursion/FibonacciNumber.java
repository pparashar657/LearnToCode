package recursion;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		int n = 45;
		
		int ans = fibo(n);
		System.out.println(ans);
	}

	private static int fibo(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		int ans = fibo(n-1) + fibo(n-2);
		
		return ans;
	}

}
