package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.SortOrder;

public class NextPalindrome {

	public static void main(String[] args) {
		
//		String firstHalf = "Pawan";
//        
//        char[] tem = firstHalf.toCharArray();
//        
//        System.out.println(Arrays.toString(tem));
//        
//        Arrays.sort(tem);
//        
//        System.out.println(Arrays.toString(tem));
//        StringBuilder sortedFirstHalf = new StringBuilder(new String(tem));
//        System.out.println(sortedFirstHalf.toString());
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any string ");
		String str = sc.next();
		
		System.out.println("My ans = " + nextPalin(str));
		
		
	}
	
	public static String nextPalin(String N) 
    { 
		 int len = N.length();
	        
	        String firstHalf = N.substring(0, len/2);
	        
	        char[] tem = firstHalf.toCharArray();
	        
	        Arrays.sort(tem);
	        
	        StringBuilder sortedFirstHalf = new StringBuilder(new String(tem));
	        
	        StringBuilder firstHalfAns = new StringBuilder();
	        // 4697557964
	        for (int i = 0; i < len/2; i++) {
	        	
	        	StringBuilder temp = new StringBuilder();
	        	
	        	sortedFirstHalf = new StringBuilder(new String(tem));
	        	
	        	for (int j = 0; j < i ; j++) {
	        		String originalDigit = firstHalf.charAt(j) + "";
	        		temp.append(originalDigit);
	        		sortedFirstHalf.deleteCharAt(sortedFirstHalf.indexOf(originalDigit));
	        	}
	        	
	        	int myCharIndex = sortedFirstHalf.lastIndexOf(firstHalf.charAt(i) + "");
	        	if (myCharIndex < sortedFirstHalf.length() - 1) {
	        		char nextGreaterChar = sortedFirstHalf.charAt(myCharIndex + 1);
	        		temp.append(nextGreaterChar);
	        		sortedFirstHalf.deleteCharAt(myCharIndex + 1);
	        	} else {
	        		continue;
	        	}
	        	temp.append(sortedFirstHalf.toString());
	        	
	        	if (temp.toString().compareTo(firstHalf) != 0 && firstHalfAns.length() == 0) {
	        		//System.out.println("One possible solu = " + temp);
	        		firstHalfAns = temp;
	        	} else if (temp.toString().compareTo(firstHalf) != 0 && firstHalfAns.compareTo(temp) > 0){
	        		//System.out.println("One possible solu = " + temp);
	        		firstHalfAns = temp;
	        	}
	        }
	        
	        //System.out.println("First half ans = " + firstHalfAns);
	        
	        String first = firstHalfAns.toString();
	        String mid = "";
	        
	        if (len % 2 == 1) {
	        	mid = N.charAt(len/2) + "";
	        }
	        
	        String last = firstHalfAns.reverse().toString();
	        String ans = first +mid + last;
	        if ( first.equals("")) {
	            return "-1";
	        } else {
	            return ans;
	        }
        
    }
	
	
	
	
	

}
