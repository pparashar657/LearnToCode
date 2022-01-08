package dynamicProgamming;

import java.util.Arrays;

public class GoodWaysToSplit {

	public static void main(String[] args) {
		
		System.out.println(numSplits("aaaaa"));
	}
	
	public static void preProcess(int[] leftUnique, int[] rightUnique, String s) {
        leftUnique[0] = 1;
        int[] charMap = new int[128];
        charMap[s.charAt(0)] = 1;
            
        for(int i=1; i<s.length(); i++) {
            if(charMap[s.charAt(i)] == 0) {
                charMap[s.charAt(i)] = 1;
                leftUnique[i] = leftUnique[i-1] + 1;
            } else {
            	leftUnique[i] = leftUnique[i-1];
            }
        }
        
        rightUnique[s.length() - 1] = 1;
        charMap = new int[128];
        charMap[s.charAt(s.length() - 1)] = 1;
            
        for(int i=s.length()-2; i>=0; i--) {
            if(charMap[s.charAt(i)] == 0) {
                charMap[s.charAt(i)] = 1;
                rightUnique[i] = rightUnique[i+1] + 1;
            } else {
            	rightUnique[i] = rightUnique[i+1];
            }
        }
    }
    
    public static int numSplits(String s) {
        
        int[] leftUnique = new int[s.length()];
        int[] rightUnique = new int[s.length()];
        
        preProcess(leftUnique, rightUnique, s);
        
        System.out.println("After pre processing");
        System.out.println(Arrays.toString(leftUnique));
        System.out.println(Arrays.toString(rightUnique));
        
        
        int goodSplitCount = 0;
        
        for(int i=1;i<s.length()-1;i++) {
            if(leftUnique[i-1] == rightUnique[i]) goodSplitCount++;
        }
        
        return goodSplitCount;
    }

}
