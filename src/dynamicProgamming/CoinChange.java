package dynamicProgamming;

import java.util.Arrays;

public class CoinChange {

	static int[][] dp = new int[13][10001];
	static int MAX = 100000;
	
	public static void main(String[] args) {
		
		int[] coins = {2};
		int amount = 3;
		
		System.out.println(coinChange(coins, amount));
	}
	
	public static int coinChange(int[] coins, int amount) {
		
        int ans = helper(coins, amount, 0);
        if(ans >= MAX) {
        	return -1;
        } else {
        	return ans;
        }
    }
	
	static int helper(int[] coins, int amount, int curr) {
		
		if(amount == 0) {
			dp[curr][amount] = 0;
			return 0;
		}
		
		if(amount < 0 || curr == coins.length) {
			return MAX;
		}
		
		if(dp[curr][amount] != 0) {
			return dp[curr][amount];
		}
		
		int temp = Math.min(helper(coins, amount - coins[curr], curr) + 1,
		helper(coins, amount, curr + 1));
		
		dp[curr][amount] = temp;
		
		return temp;
	}

}
