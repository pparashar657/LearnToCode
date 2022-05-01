package dynamicProgamming;

public class HouseRobber {

    public static void main(String[] args) {
        int[] houses = {2,7,9,3,1};
        System.out.println(rob(0,houses));
    }

    public static int rob(int curr, int[] nums) {

        if(curr >= nums.length) {
            return 0;
        }

        int op1 = nums[curr] + rob(curr+2, nums);
        int op2 = rob(curr+1, nums);
        return Math.max(op1, op2);
    }

    public static int rob_v2(int[] nums) {

        int[] dp = new int[nums.length + 1];

        dp[0] = 0;

        for(int i=1; i<= nums.length; i++) {
            int op1 = nums[i-1];
            if(i >=2) {
                op1 += dp[i-2];
            }
            int op2 = dp[i-1];
            dp[i] = Math.max(op1, op2);
        }

        return dp[nums.length];
    }

}
