package introductionToJava;

import java.util.ArrayList;
import java.util.*;

public class Functions {

	public static void main(String[] args) {
//		ArrayList<Integer> a = new ArrayList();
//		
//		increaseA(a);
//		
//		System.out.println(a);
//		
//		increaseA(a, 20);
//		
//		System.out.println(a);
//		
//		increaseA(a, 30, 40, 50);
//		
//		System.out.println(a);
		
		print(15);
	}
	
	static void print(int arg1, int ...nums) {
		System.out.println("10");
	}
	
	private static void increaseA(ArrayList<Integer> a, int ...data) {
		for (int d: data) {
			a.add(d);
		}
	}
	
	
	
}
