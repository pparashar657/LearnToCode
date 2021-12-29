package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum {
	
	static List<List<Integer>> finalAns = new ArrayList<>();
	static HashSet<List<Integer>> ansSet = new HashSet<>();

	public static void main(String[] args) {
		int[] candidates = {2,3,5};
		int target = 8;
		
		helper(candidates, 0, target, new ArrayList<>());
		
		for(List<Integer> list: finalAns) {
			System.out.println(list);
		}
		
	}
	
	public static void helper(int[] candidates, int curr, int target, List<Integer> ans) {
        
		if(target < 0 || curr == candidates.length) {
			return;
		}
		
		if(target == 0) {
			finalAns.add(new ArrayList<>(ans));
			return;
		}
		
		for (int i=curr; i < candidates.length; i++) {
			ans.add(candidates[i]);
			helper(candidates, i, target - candidates[i], ans);
			ans.remove(ans.size()-1);
		}
    }
	
	
	static boolean checkUnique(List<Integer> ans) {
//		for(List<Integer> list: finalAns) {
//			boolean isSame = true;
//			
//			if(list.size() != ans.size()) {
//				continue;
//			}
//			
//			for(int i=0; i<list.size();i++) {
//				if(list.get(i) != ans.get(i)) {
//					isSame = false;
//					break;
//				}
//			}
//			
//			if (isSame) {
//				return false;
//			}
//		}
//		return true;
		
		return !ansSet.contains(ans);
	}
	

}
