package dynamicProgamming;

public class CountWays {

	int[] dpArr = new int[10001];
    int mod = 1000000007;
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        if(n ==1 || n == 2) return n;
        
        if(dpArr[n] != 0) {
            return dpArr[n];
        }
        
        long ans = countWays(n-1) + countWays(n-2);
        ans = ans % mod;
        dpArr[n] = (int) ans;
        return dpArr[n];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
