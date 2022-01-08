package dynamicProgamming;

import java.util.Scanner;

public class MinCostInMaze {
	
	static int[][] dp = new int[101][101];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] maze = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				maze[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(findMinCost(maze, 0, 0));;
	}

	private static int findMinCost(int[][] maze, int row, int col) {
		
		if(row == maze.length || col == maze[row].length) {
			return Integer.MAX_VALUE;
		}
		
		if(row == maze.length - 1 && col == maze[row].length - 1) {
			return maze[row][col];
		}
		
		if(dp[row][col] != 0) {
			return dp[row][col];
		}
		
		int ans = maze[row][col] + Math.min(findMinCost(maze, row, col + 1),
				findMinCost(maze, row + 1, col));
		
		dp[row][col] = ans;
		
		return ans;
		
	}

}
