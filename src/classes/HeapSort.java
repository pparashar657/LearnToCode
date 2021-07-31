package classes;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] = {7,2,9,1,5, 10, 76 , 1, -19};
		
		heapSort(arr);
		
		for (int a: arr) {
			System.out.print(a + " ");
		}
	}

	private static void heapSort(int[] arr) {
		createHeap(arr);
		
		int n = arr.length;
		for (int i = 0; i< n; i++) {
			remove(arr,n - i);
		}
		
	}

	private static void remove(int[] arr, int size) {
			int temp = arr[0];
			arr[0] = arr[size - 1];
			arr[size - 1] = temp;
			
			heapify(arr, 0, --size);
	}

	private static void createHeap(int[] arr) {
		int n = arr.length;
		
		for (int i = n/2 - 1; i > -1 ; i--) {
			heapify(arr, i, arr.length);
		}
		
	}

	private static void heapify(int[] arr, int i, int size) {
		
		while ( i < size) {
			int left = 2* i + 1;
			int right = 2*i + 2;
			
			int max = i;
			
			if (left < size && arr[left] > arr[max]) {
				max = left;
			}
			
			if (right < size && arr[right] > arr[max] ) {
				max = right;
			}
			
			if ( max == i) {
				break;
			} else {
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
				i = max;
			}
			
		}
	}

}










