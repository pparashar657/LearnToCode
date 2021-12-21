package recursion;

public class MazeProblem {

	public static void main(String[] args) {
		
		//System.out.println(totalPath(3,3, 1, 1));
		
		//printPath(2, 3, 1, 1, "");
		
		System.out.println("Total count = " + pathWithDiagonal(2,3,1,1, ""));
	}
	
	private static int pathWithDiagonal(int totalRow, int totalCol, int currRow, int currCol, String path) {
		if(currRow == totalRow && currCol == totalCol) {
			System.out.println(path);
			return 1;
		}
		
		if(currRow > totalRow || currCol > totalCol) {
			return 0;
		}
		
		return pathWithDiagonal(totalRow, totalCol, currRow, currCol + 1, path + "R->") +
		pathWithDiagonal(totalRow, totalCol, currRow + 1, currCol + 1, path + "Dg->") +
		pathWithDiagonal(totalRow, totalCol, currRow + 1, currCol, path + "D->");	
	}

	private static void printPath(int totalRow, int totalCol, int currRow, int currCol, String path) {
		if(currRow == totalRow && currCol == totalCol) {
			System.out.println(path);
			return;
		}
		
		if(currRow > totalRow || currCol > totalCol) {
			return;
		}
		
		printPath(totalRow, totalCol, currRow, currCol + 1, path + "R->");
		printPath(totalRow, totalCol, currRow + 1, currCol, path + "D->");	
	}

	private static int totalPath(int totalRow, int totalCol, int currRow, int currCol) {
		
		if(currRow == totalRow && currCol == totalCol) {
			return 1;
		}
		
		if(currRow > totalRow || currCol > totalCol) {
			return 0;
		}
		
		return totalPath(totalRow, totalCol, currRow, currCol + 1) + 
				totalPath(totalRow, totalCol, currRow + 1, currCol);	
	}

}
