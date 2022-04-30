package dynamicProgamming;

public class FrogJumpEasy {
    static int[] dp;
    public static void main(String[] args) {
        int[] heights = {5,7,6,4,10,8};
        dp = new int[7];
        System.out.println(frogJump_v2(6, heights));
    }

    public static int frogJump_v2(int n, int heights[]) {

        int[] dp = new int[n+1];

        for(int i=2; i<=n ; i++) {
            int op2 = Integer.MAX_VALUE;
            int op1 = dp[i-1] + Math.abs(heights[i-1] - heights[i-2]);
            if( i > 2) {
                op2 = dp[i-2] + Math.abs(heights[i-1] - heights[i-3]);
            }
            dp[i]= Math.min(op1, op2);
        }
        return dp[n];
    }

    public static int frogJump(int n, int heights[]) {

        if(n <= 1) {
            return 0;
        }
        int op2 = Integer.MAX_VALUE;
        if(dp[n] != 0){
            return dp[n];
        }
        int op1 = frogJump(n-1, heights) + Math.abs(heights[n-1] - heights[n-2]);
        if( n > 2) {
            op2 = frogJump(n-2, heights) + Math.abs(heights[n-1] - heights[n-3]);
        }

        dp[n]= Math.min(op1, op2);
        return dp[n];
    }

}
