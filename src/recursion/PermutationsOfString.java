package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfString {

	public static void main(String[] args) {
		find_permutation2("ABCD", "");
		
//		List<String> ans = find_permutation("ABC");
//		
//		System.out.println(ans);
		

	}
	
	static void find_permutation2(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char myChar = str.charAt(0);
		
		for(int i=0;i<=ans.length();i++) {
			StringBuilder temp = new StringBuilder(ans);
			temp.insert(i, myChar);
			find_permutation2(str.substring(1), temp.toString());
		}
	}
	
	public static List<String> find_permutation(String str) {
		
		if(str.length() == 1) {
			return Arrays.asList(str);
		}
		
		List<String> ans = new ArrayList<>();
		
		List<String> smallAns = find_permutation(str.substring(1));
		
		char myChar = str.charAt(0);
		
		for(String curr: smallAns) {
			
			for(int i=0; i<=curr.length(); i++) {
				StringBuilder temp = new StringBuilder(curr);
				temp.insert(i, myChar);
				
				ans.add(temp.toString());
			}
			
		}
		
		return ans;
		
		
	}

}
