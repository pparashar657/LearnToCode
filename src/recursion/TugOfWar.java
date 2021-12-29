package recursion;

public class TugOfWar {

	static int ans = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		
		int n = 17;
		
		tugOfWar(1, n, 0, 0);

		System.out.println(ans);
	}

	private static void tugOfWar(int curr, int n, int sumA, int sumB) {
		
		if(curr == n + 1) {
			ans = Math.min(ans, Math.abs(sumA - sumB));
			return;
		}
		
		tugOfWar(curr + 1, n, sumA + curr, sumB);
		tugOfWar(curr + 1, n, sumA, sumB + curr);
	}

}
