package recursion;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5,4,8,9,2,6,1};
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}
	
	static void mergeSort(int[] arr, int start, int end) {
        
        if(start>= end) {
            return;
        }
        
        int mid = (start + end) >> 1;
        
        mergeSort(arr, start, mid);
        mergeSort(arr, mid +1, end);
        
        merge(arr, start, mid, end);
        
    }
    
    static void merge(int[] arr, int start, int mid, int end) {
        
        int[] ans = new int[arr.length];
        
        int i=start, j=mid+1, k=start;
        
        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j]; 
                j++;
            }
            k++;
        }
        
        while(i <= mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        
        while(j <= end) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        
        for(int m = start; m <= end; m++) {
            arr[m] = ans[m];
        }
    }

}
