package strings;

public class BitWiseOperatorDemo {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 3;
		
		System.out.println(a | b);
		
		System.out.println(a & b);
		
		System.out.println(a ^ b);
		
		System.out.println(a << 1);
		
		a = 1;
		
		System.out.println(1 << 1);
		
		a = 64;
		
		System.out.println(a >> 1);
	}

}
