package dynamicProgamming;

public class MCM {

    public static void main(String[] args) {
        int[] arr = {3,1,5,8};
        System.out.println(maxCoins(arr));
    }

    public static  int maxCoins(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    public static int helper(int[] nums, int start, int end) {

        if(start > end) return 0;

        int ans = Integer.MIN_VALUE;
        for(int k = start; k <= end; k++) {
            int temp = helper(nums, start, k-1) + helper(nums, k+1, end) + get(nums, k) * get(nums, start - 1) * get(nums, end + 1);
            ans = Math.max(ans, temp);
        }
        return ans;
    }

    public static int get(int[] nums, int i) {
        if (i == -1 || i == nums.length) {
            return 1;
        }
        return nums[i];
    }
}
