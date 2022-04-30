package dynamicProgamming;

import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        System.out.println(climbStairs_v2(n));
    }

    public static int climbStairs(int n, int[] dp) {

        if(n <= 1)
            return 1;

        if(dp[n] != 0) {
            return dp[n];
        }
        dp[n] = climbStairs(n-1, dp) + climbStairs(n-2, dp);
        return dp[n];
    }

    public static int climbStairs_v2(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

}
