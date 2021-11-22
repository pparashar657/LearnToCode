package strings;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string : ");
		
		String str = sc.nextLine();
		
		System.out.println("Target character: ");
		char target = sc.next().charAt(0);
		
		System.out.println("New character: ");
		char newChar = sc.next().charAt(0);
		
		replaceChar(str, target, newChar);
		replaceChar2(str, target, newChar);
		replaceChar3(str, target, newChar);
		replaceChar4(str, target, newChar);
	}

	private static void replaceChar4(String str, char target, char newChar) {
		StringBuilder sb = new StringBuilder(str);
		
		for (int i=0;i<sb.length();i++) {
			if (sb.charAt(i) == target && i%2 == 0) {
				sb.setCharAt(i, newChar);
			}
		}
		System.out.println(sb);
		
	}

	private static void replaceChar3(String str, char target, char newChar) {
		char[] strArray = str.toCharArray();
		
		for (int i=0;i<strArray.length;i++) {
			if (strArray[i] == target && i%2 == 0) {
				strArray[i] = newChar;
			}
		}
		
		str = String.valueOf(strArray);
		System.out.println(str);
	}

	private static void replaceChar2(String str, char target, char newChar) {
		
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i) == target && i%2 == 0) {
				str = str.substring(0, i) + newChar + str.substring(i + 1);
			}
		}
		System.out.println(str);
	}

	private static void replaceChar(String str, char target, char newChar) {
		String ans = "";
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i) == target && i%2 == 0) {
				ans = ans + newChar;
			} else {
				ans = ans + str.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
