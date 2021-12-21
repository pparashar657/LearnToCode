package recursion;

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		int[] arr = {2, 40, 2, 40, 5};
		
		System.out.println(matrixMultiplication(arr, 1, arr.length - 1));
	}
	
	static int matrixMultiplication(int arr[], int start, int end) {
		
		
		if (start >= end) {
			return 0;
		}
		
		int ans = Integer.MAX_VALUE;
		
		for(int i = start; i < end; i++) {
			int temp1 = matrixMultiplication(arr, start, i);
			
			int temp2 = matrixMultiplication(arr, i+1, end);
			
			int smallAns = temp1 + temp2 + (arr[start-1] * arr[i] * arr[end]);
			
			ans = Math.min(ans,  smallAns);
			
		}
		
		return ans;
    }

}
