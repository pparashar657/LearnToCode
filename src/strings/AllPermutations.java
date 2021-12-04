package strings;

import java.util.*;

public class AllPermutations {

	public static void main(String[] args) {
		System.out.println(find_permutation("ABC").toString());
	}
	
	public static List<String> find_permutation(String S) {
        int fact = 1;
        int n = S.length();
        for(int i = 2; i<= n; i++) {
        	fact *= i;
        }
        List<String> ans = new ArrayList<>();
        
        for (int num = 0; num < fact; num++) {
        	StringBuilder originalString = new StringBuilder(S);
        	StringBuilder myAns = new StringBuilder();
        	
        	int temp = num;
        	
        	for (int div = n ; div > 0; div--) {
        		int q = temp / div;
        		int r = temp % div;
        		
        		myAns.append(originalString.charAt(r));
        		
        		originalString.deleteCharAt(r);
        		
        		temp = q;
        	}
        	ans.add(myAns.toString());
        }
        
        Collections.sort(ans);
        
        return ans;
        
    }

}
