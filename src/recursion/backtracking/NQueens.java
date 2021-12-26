package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		
		List<List<String>> ans = solveNQueens(4);
		
		for(List<String> row: ans) {
			System.out.println(row);
		}
		

	}
	
	public static List<List<String>> solveNQueens(int n) {
        
		List<List<String>> board = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			List<String> row = new ArrayList<String>();
			for(int j=0;j<n;j++) {
				row.add(".");
			}
			board.add(row);
		}
		
        helper(0, n, board);
        
        return board;
    }
	
	static void helper(int row, int n, List<List<String>> board) {
		
		if(row == n) {
			printBoard(board);
			return;
		}
		
		for(int col=0;col<n;col++) {
			if(isValidMove(row, col, board, n)) {
				board.get(row).set(col, "Q");
				helper(row + 1, n, board);
				board.get(row).set(col, ".");
			}
		}
		 
		
	}
	
	private static void printBoard(List<List<String>> board) {
		for(List<String> row: board) {
			System.out.println(row);
		}
		System.out.println();
	}

	static boolean helper2(int row, int n, List<List<String>> board) {
		if(row == n) {
			return true;
		}
		
		for(int col=0;col<n;col++) {
			if(isValidMove(row, col, board, n)) {
				board.get(row).set(col, "Q");
				if(helper2(row + 1, n, board)) {
					return true;
				}
				board.get(row).set(col, ".");
			}
		}
		return false;
	}
	

	private static boolean isValidMove(int row, int col, List<List<String>> board, int n) {
		
		for(int i=row; i>-1;i--) {
			if(board.get(i).get(col).equals("Q")) {
				return false;
			}
		}
		
		for(int i=row, j = col; i > -1 && j > -1 ; i--, j--) {
			if(board.get(i).get(j).equals("Q")) {
				return false;
			}
		}
		
		for(int i=row, j = col; i > -1 && j < n ; i--, j++) {
			if(board.get(i).get(j).equals("Q")) {
				return false;
			}
		}
		
		return true;
	}

}
