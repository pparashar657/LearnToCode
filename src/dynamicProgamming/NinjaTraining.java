package dynamicProgamming;

public class NinjaTraining {

    static int[][] dp;

    public static void main(String[] args) {
        int[][] points = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };
        dp = new int[points.length+1][3];
        System.out.println(ninjaTraining(0, points, -1));
    }

    public static int ninjaTraining_v2(int n, int points[][]) {

        int[][] dp = new int[points.length+1][3];

        for(int currDay=1; currDay<=n;currDay++) {
            for(int currActivity = 0; currActivity<= 2; currActivity++) {
                int currDayPoints = points[currDay-1][currActivity];
                int temp = 0;
                for(int prevActivity=0; prevActivity<=2; prevActivity++) {
                    if(prevActivity != currActivity) {
                        temp = Math.max(temp, dp[currDay-1][prevActivity]);
                    }
                }
                dp[currDay][currActivity] = currDayPoints + temp;
            }
        }
        return Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2]));

    }


    public static int ninjaTraining(int currDay, int points[][], int currActivity) {

        if(currDay > points.length)
            return 0;

        if(currActivity != -1 && dp[currDay][currActivity] != 0) {
            return dp[currDay][currActivity];
        }

        int currDayPoint = 0;

        if(currActivity != -1) {
            currDayPoint += points[currDay-1][currActivity];
        }

        int temp = 0;

        for(int nextActivity=0; nextActivity<=2; nextActivity++) {
            if(nextActivity != currActivity) {
                temp = Math.max(temp, ninjaTraining(currDay+1, points, nextActivity));
            }
        }

        int ans = currDayPoint + temp;
        if(currActivity != -1) {
            dp[currDay][currActivity] = ans;
        }
        return ans;
    }



}
