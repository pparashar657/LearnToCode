package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n = 30;
		
		towerOfHanoi(n, 'A', 'C', 'B');
		
	}

	private static void towerOfHanoi(int n, char from, char to, char inter) {
		
		if(n == 0) {
			return;
		}
		
		towerOfHanoi(n-1, from, inter, to);
		System.out.println(n+" : "+from +" - "+ to);
		towerOfHanoi(n-1, inter, to, from);
	}

}
