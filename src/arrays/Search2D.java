package arrays;

public class Search2D {

	public static void main(String[] args) {
		int[][] arr = {{1},{3}};
		
		System.out.println(searchMatrix(arr, 3));

	}
	
	public static int getDesiredRow(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        int mid = 0;
        while(start <= end) {
        	System.out.println("Start = "+start +" end = "+end);
            mid = (start + end)/2;
            if (target == matrix[mid][0]) {
                return mid;
            } 
            if (target > matrix[mid][0]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (start + end)/2;
    }
    
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        int desiredRowIndex = getDesiredRow(matrix, target);
        System.out.println(desiredRowIndex);
        int[] desiredRow = matrix[desiredRowIndex];
        
        int start = 0;
        int end = desiredRow.length - 1;
        int mid;
        while(start <= end) {
            mid = (start + end)/2;
            if (target == desiredRow[mid]) {
                return true;
            } 
            if (target > desiredRow[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

}
