package october24;

public class NQueensProblem {

	public static void nQueens(int[][] board, String ans, int qsf) {
		//base case
		if(qsf == board.length) {
			System.out.println(ans);
			return;
		}
		
		for(int col = 0; col < board[0].length;col++) {
			if(isItSafe(board, qsf,col) == true) {
				board[qsf][col] = 1;
				nQueens(board, ans+ "R"+ qsf + "C"+ col+ " ", qsf+1);
				board[qsf][col] = 0;
			}
		}
		
	}
	
	public static boolean isItSafe(int[][] board, int row, int col) {
		//vertical
		for(int i=0;i<row;i++) {
			if(board[i][col] == 1) {
				return false;
			}
		}
		
		//for first diagonal
		int i= row-1;
		int j= col-1;
		while(i>=0 && j>=0) {
			if(board[i][j] == 1) {
				return false;
			}
			i--;
			j--;
		}
		
		//second diagonal
		i=row-1;
		j=col+1;
		while(i>=0 && j< board[0].length) {
			if(board[i][j] == 1) {
				return false;
			}
			i--;
			j++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[][] board = new int[n][n];
		nQueens(board, "", 0);
		}

}
