package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RatInMaze {

	static boolean[][] isVisited = new boolean[100][100];
	static ArrayList<String> finalAns = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows and col numbers: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
 
//		findPathInMaze(row, col, 0, 0, "");
		
//		findPathInMaze2(row, col, 0, 0, "");
//		
//		System.out.println(finalAns);
		
		ArrayList<String> ans = findPathInMaze3(row, col, 0, 0, "");
		System.out.println(ans);
		
	}
	
	static void findPathInMaze(int row, int col, int currRow, int currCol, String ans) {
		
		if(currRow < 0 || currCol < 0 || currRow == row || currCol == col || isVisited[currRow][currCol]) {
			return;
		}
		
		if(currRow == row - 1 && currCol == col - 1) {
			System.out.println(ans);
			return;
		}
		
		
		isVisited[currRow][currCol] = true;
		
		findPathInMaze(row, col, currRow, currCol + 1, ans + "R");
		findPathInMaze(row, col, currRow, currCol - 1, ans + "L");
		findPathInMaze(row, col, currRow - 1, currCol, ans + "U");
		findPathInMaze(row, col, currRow + 1, currCol, ans + "D");
		
		isVisited[currRow][currCol] = false;
		
	}
	
	
	static void findPathInMaze2(int row, int col, int currRow, int currCol, String ans) {
		
		if(currRow < 0 || currCol < 0 || currRow == row || currCol == col || isVisited[currRow][currCol]) {
			return;
		}
		
		if(currRow == row - 1 && currCol == col - 1) {
			finalAns.add(ans);
			return;
		}
		
		
		isVisited[currRow][currCol] = true;
		
		findPathInMaze2(row, col, currRow, currCol + 1, ans + "R");
		findPathInMaze2(row, col, currRow, currCol - 1, ans + "L");
		findPathInMaze2(row, col, currRow - 1, currCol, ans + "U");
		findPathInMaze2(row, col, currRow + 1, currCol, ans + "D");
		
		isVisited[currRow][currCol] = false;
		
	}
	
	static ArrayList<String> findPathInMaze3(int row, int col, int currRow, int currCol, String ans) {
		
		if(currRow < 0 || currCol < 0 || currRow == row || currCol == col || isVisited[currRow][currCol]) {
			return new ArrayList<>();
		}
		
		ArrayList<String> myAns = new ArrayList<>();
		
		if(currRow == row - 1 && currCol == col - 1) {
			myAns.add(ans);
			return myAns;
		}
		
		
		isVisited[currRow][currCol] = true;
		
		myAns.addAll(findPathInMaze3(row, col, currRow, currCol + 1, ans + "R"));
		myAns.addAll(findPathInMaze3(row, col, currRow, currCol - 1, ans + "L"));
		myAns.addAll(findPathInMaze3(row, col, currRow - 1, currCol, ans + "U"));
		myAns.addAll(findPathInMaze3(row, col, currRow + 1, currCol, ans + "D"));
		
		isVisited[currRow][currCol] = false;
		
		return myAns;
		
	}
	
}
