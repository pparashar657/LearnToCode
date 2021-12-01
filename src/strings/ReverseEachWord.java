package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		System.out.println(reverseWords(str));

	}

	public static String reverseWords(String s) {
		String[] words = s.split(" ");
		System.out.println(Arrays.toString(words));
		StringBuilder ans = new StringBuilder("");
		for (String word: words) {
			StringBuilder temp = new StringBuilder(word);
			
			ans.append(temp.reverse());
		}
		return ans.toString();
	}

}
