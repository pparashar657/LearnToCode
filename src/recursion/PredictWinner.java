package recursion;

public class PredictWinner {

	public boolean PredictTheWinner(int[] nums) {
        return helper(nums, 0, nums.length - 1, true, 0,0);
    }
    
    public boolean helper(int[] nums, int start, int end, boolean turn, int p1score, int p2score) {
        
        if(start > end) {
            return p1score >= p2score;
        } 
        
        // if turn == true: p1 Turn
       if(turn) {
           return helper(nums, start + 1, end, !turn, p1score + nums[start], p2score) ||
           helper(nums, start, end - 1, !turn, p1score + nums[end], p2score); 
       } else {
           return helper(nums, start + 1, end, !turn, p1score, p2score + nums[start]) && helper(nums, start, end - 1, !turn, p1score, p2score + nums[end]);
       }
    }

}
