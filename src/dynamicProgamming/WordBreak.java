package dynamicProgamming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class WordBreak {

    static int[] dp;


    public static void main(String[] args) {
        System.out.println("Pawan".substring(2,3));
        List<String> list = Arrays.asList("app", "apple", "pen");

        System.out.println(wordBreakV2("applepenapple", list));
    }

    public static boolean wordBreakHelper(String s, int currIdx, HashSet<String> wordDict) {
        if(currIdx == s.length()){
            return true;
        }

        if(dp[currIdx] != -1) return dp[currIdx] == 1;

        int end = currIdx+1;
        while(end <= s.length()){
            String substring = s.substring(currIdx, end);

            if(wordDict.contains(substring)){
                if(wordBreakHelper(s, end, wordDict)) {
                    return true;
                }
            }
            end++;
        }
        return false;
    }

    public static boolean wordBreakV2(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];

        HashSet<String> set = new HashSet<>(wordDict);

        for(int i = s.length()-1; i>-1; i--) {
            for(int j=s.length(); j>i; j--) {
                String subString = s.substring(i,j);
                if(set.contains(subString)) {
                    if(j == s.length() || dp[j]) {
                        dp[i] = true;
                    }
                }

            }
        }
        return dp[0];
    }


}
