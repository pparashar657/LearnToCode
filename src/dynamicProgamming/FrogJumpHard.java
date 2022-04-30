package dynamicProgamming;

import java.util.Arrays;

public class FrogJumpHard {

    static int[][] dp;

    public static void main(String[] args) {

        int[] stones = {0,1,2,3,4,8,9,11};
        dp = new int[stones.length+1][10000];
        System.out.println(canCross(stones));

    }

//    public static boolean canCross_v2(int[] stones) {
//        for(int i=0;i<stones.length;i++) {
//            dp[i][0] = 2;
//        }
//
//        for(int i=0; i < stones.length; i++) {
//            for(int k=0;k<stones[i];k++) {
//                int prevPost = stones[i];
//                prevPost = stones[i] - k - 1;
//                prevPost = stones[i] - k + 1;
//                prevPost = stones[i] - k;
//            }
//        }
//
//
//        for(int i: dp[stones.length-1]) {
//            if(i == 1)
//                return true;
//        }
//        return false;
//    }

    public static boolean canCross(int[] stones) {
        return canCrossHelper(stones, 1, 1);
    }

    public static boolean canCrossHelper(int[] stones, int curr, int k) {
        int idx = Arrays.binarySearch(stones, curr);
        if(idx < 0 || k <= 0) {
            return false;
        }
        if(curr == stones[stones.length-1]) {
            return true;
        }

        if(dp[curr][k] == 1) return true;
        if(dp[curr][k] == 2) return false;

        boolean ans = canCrossHelper(stones, curr + k - 1, k - 1) ||
                canCrossHelper(stones, curr + k, k) ||
                canCrossHelper(stones, curr + k + 1, k + 1);

        if(ans) {
            dp[idx][k] = 1;
        } else {
            dp[idx][k] = 2;
        }

        return ans;
    }

}
