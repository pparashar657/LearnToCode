package recursion;

import java.util.Arrays;

public class SumTriangle {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		helper(arr);

	}
	
	public static void helper(int arr[]) {
		
		if (arr.length == 0) {
			return;
		}
		
		int[] myArr = new int[arr.length - 1];
		
		for(int i=0;i<arr.length - 1;i++) {
			myArr[i] = arr[i] + arr[i+1];
		}
		
		helper(myArr);
		System.out.println(Arrays.toString(arr));
	}

}
