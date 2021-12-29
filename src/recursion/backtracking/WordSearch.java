package recursion.backtracking;

public class WordSearch {

	static boolean[][] isVisited = new boolean[10][10];
	
	public static void main(String[] args) {
		char[][] board = {
				{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'},
				{'A', 'D', 'E', 'E'}
		};
		String word = "ABFDECCC";
		
		System.out.println(exist(board, word));
	}
	
	public static boolean exist(char[][] board, String word) {
        
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length; j++) {
				if(helper(board, i, j, word)) {
					return true;
				}
			}
		}
		return false;
    }

	private static boolean helper(char[][] board, int currRow, int currCol, String word) {
		
		if(word.length() == 0) {
			return true;
		}
		
		if(currRow < 0 || currCol < 0 || currRow == board.length || currCol == board[currRow].length || isVisited[currRow][currCol]) {
			return false;
		}
		
		if(board[currRow][currCol] != word.charAt(0)) {
			return false;
		}
		
		isVisited[currRow][currCol] = true;
		
		if (helper(board, currRow, currCol + 1, word.substring(1)) ||
				helper(board, currRow, currCol - 1, word.substring(1)) ||
				helper(board, currRow + 1, currCol, word.substring(1)) ||
				helper(board, currRow - 1, currCol, word.substring(1))) {
			return true;
		}
		
		isVisited[currRow][currCol] = false;
		
		return false;
	}

}
