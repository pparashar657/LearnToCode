package recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 15356;
		
		System.out.println(addDigit(n));
		
	}

	private static int addDigit(int n) {
		
		if(n == 0) return 0;
		
		return (n%10) + addDigit(n/10);
		
	}

}
