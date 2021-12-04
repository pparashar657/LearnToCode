package strings;

import java.util.Arrays;

import classes.Temp;

public class ValidIp {

	public static void main(String[] args) {
		
		
		
		//System.out.println("50".compareTo("30"));
//		System.out.println(Integer.parseInt("001"));
		System.out.println(isValid("11.11.11.11"));

	}

	public static boolean isValid(String s) {
        String[] nums = s.split("\\.");
        System.out.println(Arrays.toString(nums));
        if (nums.length < 4) {
        	return false;
        }
        
        for (String num : nums) {
        	if (num.length() > 3 || num.length() == 0 || num.charAt(0) == '0') return false;
        	for (char ch: num.toCharArray()) {
        		if (!Character.isDigit(ch)) return false;
        	}
        	int temp = Integer.parseInt(num);
        	if (temp < 0 || temp > 255) {
        		return false;
        	}
        }
        return true;
    }
	
//	static int getNum(String str) {
//		int ans = -1;
//		
//	}
}
