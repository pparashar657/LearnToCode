package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {5,4,8,9,2,6,1};
		
		quickSort(arr, 0, arr.length-1);
		
		//System.out.println(partition2(arr, 0, 6));
		System.out.println(Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int start, int end) {
		
		if(start >= end) {
			return;
		}
		
		int pIdx = partition2(arr, start, end);
		
		quickSort(arr, start, pIdx-1);
		quickSort(arr, pIdx + 1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[start];
		
		// Where the next small element is to be written
		int smallIdx = start;
		
		for(int i=start; i<=end;i++) {
			if(arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[smallIdx];
				arr[smallIdx] = temp;
				smallIdx++;
			}
		}
		

		int temp = arr[smallIdx-1];
		arr[smallIdx-1] = arr[start];
		arr[start] = temp;
		
		return smallIdx-1;
		
	}
	
	private static int partition2(int[] arr, int start, int end) {
		
		int pivot = arr[start];
		
		List<Integer> small = new ArrayList<>();
		List<Integer> large = new ArrayList<>();
		
		for(int i = start+1; i<= end;i++) {
			if(arr[i] < pivot) {
				small.add(arr[i]);
			} else {
				large.add(arr[i]);
			}
		}
		
		int i = start;
		for(int k = 0; k<small.size();k++) {
			arr[i++] = small.get(k);
		}
		arr[i++] = pivot;
		for(int k = 0; k<large.size();k++) {
			arr[i++] = large.get(k);
		}
		
		return start + small.size();
		
	}

}
