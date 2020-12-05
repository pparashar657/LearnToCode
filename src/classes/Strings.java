package classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Strings {
	
	public static int[] countSort (int arr[]) {
		int max = 0;
		for (int a:arr) {
			max = Math.max(max, a);
		}
		int count[] = new int[max+1];
		for (int a:arr) {
			count[a]++;
		}
		for (int i=1;i<=max;i++) {
			count[i] += count[i-1];
		}
		int out[] = new int[arr.length];
		for (int a:arr) {
			out[count[a]-1] = a;
			count[a]--;
		}
		return out;
	}
	
	public static int[] countSort2 (int arr[], int exp) {
		int count[] = new int[10];
		for (int a:arr) {
			int curDigit = (a/exp)%10;
			count[curDigit]++;
		}
		for (int i=1;i<10;i++) {
			count[i] += count[i-1];
		}
		int out[] = new int[arr.length];
		for (int i=arr.length-1;i>-1;i--) {
			int curDigit = (arr[i]/exp)%10;
			out[count[curDigit]-1] = arr[i];
			count[curDigit]--;
		}
		return out;
	}
	
	public static int[] radixSort(int arr[]) {
		int max = 0;
		for(int a:arr) {
			max = Math.max(a, max);
		}
		int exp = 1;
		while (max > 0) {
			arr = countSort2(arr, exp);
			max /= 10;
			exp *= 10;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {15, 45, 123, 64,5124, 1321, 45,245,224,8,112};
		
		arr = radixSort(arr);
		for (int a:arr) {
			System.out.print(a+" ");
		}
	}

}
