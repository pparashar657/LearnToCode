package classes;

import java.util.Scanner;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

public class HelloWorld {
	
	static class A {
		public int a;
		public int bb;
	}
	
	static class B extends A {
		public int c;
	}

	public static void main(String[] args) {

		
		List<A> aList = new ArrayList<>();
		B b = new B();
		b.a = 10;
		b.c = 12;
		b.bb = 14;
		aList.add(b);
		System.out.println(aList.toString());
		
		
	}

}
