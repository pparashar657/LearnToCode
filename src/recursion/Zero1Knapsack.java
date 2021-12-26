package recursion;

public class Zero1Knapsack {

	public static void main(String[] args) {
		
		int[] values = {5,3,4,2};
		
		int[] weights = {10,2,3,500};
		
		int maxWt = 100;
		
		int ans = findMaxValue(values, weights, maxWt, 0, 0);
		System.out.println(ans);
	}

	private static int findMaxValue(int[] values, int[] weights, int wtAvailable, int currValue, int curr) {
		
		if(wtAvailable == 0 || curr == values.length) {
			return currValue;
		}
		
		int ans = 0;
		
		if(weights[curr] <= wtAvailable) {
			ans = findMaxValue(values, weights, wtAvailable - weights[curr], currValue + values[curr], curr + 1);
		}
		return Math.max(ans,findMaxValue(values, weights, wtAvailable, currValue, curr + 1));
		
	}

}
