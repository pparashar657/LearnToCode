package dynamicProgamming;

public class MaxSquareOf1 {
	
	static int[][] dp = new int[301][301];

	public static void main(String[] args) {
		
		char[][] matrix = {
				{'1','0','1','0','0'},
				{'1','0','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'}
		};
		
		System.out.println(maximalSquare(matrix));
		
	}
	
	public static int maximalSquare(char[][] matrix) {
        
		int max = 0;
		
		for(int i=0;i<matrix.length; i++) {
			for(int j=0;j<matrix[i].length; j++) {
				if(matrix[i][j] == '1') {
					max = Math.max(max,getMaxSquare(i,j, matrix));
				}
			}
		}
		return max*max;
    }

	private static int getMaxSquare(int row, int col, char[][] matrix) {
		
		if(row < 0 || col < 0) {
			return 0;
		}
		
		if(matrix[row][col] == '0') {
			return 0;
		}
		
		if(dp[row][col] != 0) {
			return dp[row][col];
		}
		
		int ans = Math.min(Math.min(getMaxSquare(row, col-1, matrix), 
				getMaxSquare(row-1, col, matrix)), 
				getMaxSquare(row -1 , col-1, matrix)) + 1;
		
		dp[row][col] = ans;
		
		return ans;
	}
	
	
}
