package introductionToJava;

import java.util.*;

public class RecurrenceRelation {

	public static void main(String[] args) {
		int a, b , n;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		n = sc.nextInt();
		int prev = 0;
		int curr;
		for (int i=0; i< n; i++) {
			curr = a*prev + b;
			prev = curr;
		}
		System.out.println(prev);

	}

}
