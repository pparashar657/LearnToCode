package dynamicProgamming;

import java.util.Scanner;

public class Zero1Knapsack {
	
	static int[][] dp = new int[1001][1001];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] values = new int[n];
		
		int[] weights = new int[n];
		
		for(int i=0;i<n;i++) {
			values[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			weights[i] = sc.nextInt();
		}
		
		int maxWt = sc.nextInt();
		
		int ans = findMaxValue(values, weights, maxWt, 0);
		System.out.println(ans);
	}

	private static int findMaxValue(int[] values, int[] weights, int wtAvailable, int curr) {
		
		
		if(wtAvailable == 0 || curr == values.length) {
			return 0;
		}
		
		if(dp[curr][wtAvailable] != 0) {
			return dp[curr][wtAvailable];
		}
		
		int ans = 0;
		
		if(weights[curr] <= wtAvailable) {
			ans = findMaxValue(values, weights, wtAvailable - weights[curr], curr + 1) + values[curr];
		}
		ans = Math.max(ans,findMaxValue(values, weights, wtAvailable, curr + 1));
		
		dp[curr][wtAvailable] = ans;
		
		return ans;
		
	}

}
