package arrays;

import java.util.Arrays;

public class ArraysFunction {
	public static void main(String[] args) {
		int a[] = {1,2,4,6,7,8,9,11,13,15};
		
		int index = Arrays.binarySearch(a, 10);
		
		if (index >= 0) {
			System.out.println("Index = "+ index + " value = "+ a[index]);
		} else {
			index = -1*index - 2;
			System.out.println("Index = "+ index + " value = "+ a[index]);
		}
		
		System.out.println();
		
	}
}
