package strings;

import java.util.ArrayList;

public class AllSubsequence {

	public static void main(String[] args) {
		String str = "abcd";
		
		printAllSubsequence(str);

	}

	private static void printAllSubsequence(String str) {
		int n = str.length();
		ArrayList<String> myAns = new ArrayList<>();
		for(int num = 0; num < (1 << n); num++) {
			String ans = "";
			for (int i =0; i< str.length(); i++) {
				if ((num & (1 << i)) != 0) {
					ans += str.charAt(i);
				}
			}
			if (ans != "") myAns.add(ans);
		}
		
	}

}
