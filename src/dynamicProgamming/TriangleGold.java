package dynamicProgamming;

import java.util.ArrayList;
import java.util.List;

public class TriangleGold {

    static int[][] dp;

    public static void main(String[] args) {
        int[] arr = {5,7,1,4,7,2,8,1,2,3};
        List<List<Integer>> newArr = restructure(arr);
        dp = new int[newArr.size()][newArr.size()];
        System.out.println(maxTotal_v2(newArr));

    }

    public static int maxTotal_v2(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()+1][triangle.size()+1];

        for(int row = triangle.size()-1; row >= 0;  row--) {
            for(int col = 0; col < triangle.get(row).size(); col++) {
                int op1 = dp[row+1][col];
                int op2 = dp[row+1][col+1];
                dp[row][col] = Math.max(op1, op2) + triangle.get(row).get(col);
            }
        }
        return dp[0][0];
    }

    public static int maxTotal(List<List<Integer>> triangle, int row, int col) {

        if(row >= triangle.size()) return 0;

        if(dp[row][col] != 0) return dp[row][col];

        int op1 = maxTotal(triangle, row+1, col);
        int op2 = maxTotal(triangle, row+1, col+1);

        dp[row][col] = Math.max(op1, op2) + triangle.get(row).get(col);
        return dp[row][col];
    }

    private static List<List<Integer>> restructure(int[] arr) {
        int idx = 0;
        int size = 1;
        List<List<Integer>> ans = new ArrayList<>();
        while(idx < arr.length) {
            int count = 0;
            List<Integer> smallList = new ArrayList<>();
            while(count++ < size) {
                smallList.add(arr[idx++]);
            }
            ans.add(smallList);
            size++;
        }
        return ans;
    }

}
