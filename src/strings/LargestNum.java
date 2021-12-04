package strings;

import java.util.*;

public class LargestNum {

	public static void main(String[] args) {
		int[] nums = {4,3,5,6};
		List<String> myNums = new ArrayList<>();
	    for (int num : nums) {
	        myNums.add(num + "");
	    }
	    Collections.sort(myNums, new Comparator<String> () {
	    	public int compare(String o1, String o2) {
	    		return (o2 + o1).compareTo(o1 + o2);
	    	}
	    });
	    
	    System.out.println(myNums);
	    
	}
	
	

}
