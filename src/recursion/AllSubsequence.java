package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsequence {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
//		List<List<Integer>> ans = subsets(arr, 0);
//		
//		for(List<Integer> curr: ans) {
//			System.out.println(curr);
//		}
		
		subsets2(arr, 0, new ArrayList<>());
		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		
//		List<Integer> newList = new ArrayList<>(list);
//		
//		newList.add(4);
//		
//		System.out.println(list);
//		System.out.println(newList);
//		
		

	}
	
	
	static void subsets2(int[] nums, int start, List<Integer> ans) {
		if(start == nums.length) {
			System.out.println(ans);
			return;
		}
		
		subsets2(nums, start + 1, new ArrayList<>(ans));
		ans.add(nums[start]);
		subsets2(nums, start + 1, ans);
		
	}
	
	public static List<List<Integer>> subsets(int[] nums, int start) {
		
		if(start == nums.length) {
			List<Integer> ans = new ArrayList<>();
			return Arrays.asList(ans);
		}
		
        
		List<List<Integer>> smallAns = subsets(nums, start + 1);
		
		List<List<Integer>> ans = new ArrayList<>();
		
		for(List<Integer> curr: smallAns) {
			ans.add(new ArrayList<>(curr));
			curr.add(0, nums[start]);
			ans.add(curr);
		}
		
		return ans;
		
    }

}
