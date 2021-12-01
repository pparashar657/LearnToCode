package strings;

import java.util.ArrayList;
import java.util.List;

public class NumPadToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> letterCombinations(String digits) {
        char[][] numToChar = {
        		{},{},
        		{'a', 'b', 'c'},
        		{'d', 'e', 'f'},
        		{'g', 'h', 'i'},
        		{'j', 'k', 'l'},
        		{'m', 'n', 'o'},
        		{'p', 'q', 'r', 's'},
        		{'t', 'u', 'v'},
        		{'w', 'x', 'y', 'z'}
        };
        
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        ArrayList<String> temp;
        
        for (char ch: digits.toCharArray()) {
            char[] currCharArray = numToChar[ch - '0'];
            temp = new ArrayList<>();
            
            for(char cha : currCharArray) {
                for (String curr: ans) {
                    temp.add(curr + cha);
                }
            }
            
            ans = temp;  
        }
        return ans;
        
    }

}
