package recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {4,1,5,7,4,7,9,3,5};
		
		bubbleSort(arr, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

//	private static void bubbleSort(int[] arr, int start, int end) {
//		
//		if(end == 0) {
//			return;
//		}
//		
//		if(start == end) {
//			bubbleSort(arr, 0, end - 1);
//			return;
//		}
//		
//		if(arr[start] > arr[start + 1]) {
//			int temp = arr[start];
//			arr[start] = arr[start + 1];
//			arr[start + 1] = temp;
//		}
//		bubbleSort(arr, start + 1, end);
//	}
	
	
	private static void bubbleSort(int[] arr, int end) {
		
		if(end == 0) {
			return;
		}
		
		for (int i=0 ;i < end; i++) {
			if(arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		
		bubbleSort(arr, end-1);
	}

}
