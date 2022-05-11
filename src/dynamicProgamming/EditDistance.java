package dynamicProgamming;

public class EditDistance {

    static int dp[][];

    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";

        dp = new int[word1.length()+1][word2.length()+1];

        System.out.println(minDistanceHelper(new StringBuilder(word1), 0, new StringBuilder(word2), 0));
    }

    public static int minDistanceHelper(StringBuilder word1, int idx1, StringBuilder word2, int idx2) {

        if(idx1 >= word1.length()) {
            return word2.length() - idx2;
        }

        if(idx2 == word2.length()) {
            return word1.length() - idx1;
        }

        if(dp[idx1][idx2] != 0) {
            return dp[idx1][idx2];
        }


        if(word1.charAt(idx1) == word2.charAt(idx2)) {
            dp[idx1][idx2] = minDistanceHelper(word1, idx1+1, word2, idx2+1);
            return dp[idx1][idx2];
        }

        int op1 = minDistanceHelper(word1, idx1+1, word2, idx2); // Delete

        int op2 = minDistanceHelper(word1, idx1, word2, idx2+1); // Insert

        int op3 = minDistanceHelper(word1, idx1+1, word2, idx2+1); // replace

        dp[idx1][idx2] = Math.min(Math.min(op1, op2), op3) + 1;

        return dp[idx1][idx2];
    }


    public static int minDistanceV2(StringBuilder word1, StringBuilder word2) {

        int[][] dp = new int[word1.length()+1][word2.length()+1];

        for(int i=0;i<dp.length;i++) {
            dp[i][0] = i;
        }

        for(int j=0;j<dp[0].length;j++) {
            dp[0][j] = j;
        }

        for(int i=1;i<dp.length;i++) {
            for(int j=1;j<dp[i].length;j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    int op1 = dp[i-1][j]; // Delete

                    int op2 = dp[i][j-1]; // Insert

                    int op3 = dp[i-1][j-1]; // replace

                    dp[i][j] = Math.min(Math.min(op1, op2), op3) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }

}
