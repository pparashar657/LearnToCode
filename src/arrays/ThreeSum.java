package arrays;

import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the numbers");
		
		for (int i=0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		List<List<Integer>> triplets = threeSum(arr);

		for(List<Integer> triplet: triplets) {
			System.out.println(triplet);
		}
		
	}
	
	public static List<List<Integer>> twoSum(int[] nums, int start, int target) {
        int end = nums.length-1;
        List<List<Integer>> ans = new ArrayList<>();
        
        while(start<end) {
            int currSum = nums[start] + nums[end];
            
            if(currSum == target) {
            	List<Integer> temp = new ArrayList<>();
                temp.add(nums[start]);
                temp.add(nums[end]);
                ans.add(temp);
                while(start< nums.length - 1 && nums[start] == nums[start+1]) start++;
                while(end > 0 && nums[end] == nums[end-1]) end--;
                start++;
                end--;
            } else if (currSum < target) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }
    
    public static List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++) {
        	
        	if(i > 0 && nums[i] == nums[i-1]) continue;
        	
            List<List<Integer>> smallAns = twoSum(nums, i+1, -1*nums[i]);
            
            for (List<Integer> temp: smallAns) {
            	temp.add(0, nums[i]);
                ans.add(temp);            	
            }
            
            
        }
        
        return ans;
    }

}
