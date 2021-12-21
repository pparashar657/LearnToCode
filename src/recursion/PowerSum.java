package recursion;

public class PowerSum {

	public static void main(String[] args) {
		System.out.println(powerSum(100, 2));

	}
	
	public static int powerSum(int X, int N) {
        
        return helper(X, N, 1);

    }
    
    public static int helper(int x, int n, int curr) {
        
        int count = 0;
        
        System.out.println("Working for x = " + x +" and curr = "+ curr);
        
        if(x == 0) {
            return 1;
        }
        
        if(x < 0) {
            return 0;
        }
        
        for(int temp = curr; Math.pow(temp,n) <= x; temp++) {
            count += helper(x - (int)Math.pow(temp,n), n, temp + 1);
        }
        return count;
    }

}
