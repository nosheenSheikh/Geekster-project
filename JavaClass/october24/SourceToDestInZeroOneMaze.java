package october24;

import java.util.ArrayList;

public class SourceToDestInZeroOneMaze {

	public static ArrayList<String> printPathsFromSourceToDest(int[][] maze, int startRow, int startCol, int n) {
		if(startRow ==n-1 && startCol ==n-1) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		
		if(startRow >n-1 || startCol >n-1) {
			ArrayList<String> res = new ArrayList<>();
			return res;
		}
		
		ArrayList<String> myRes = new ArrayList<>();
		ArrayList<String> rr;
		if(startRow+1 < n && maze[startRow+1][startCol] ==0) {
			rr = printPathsFromSourceToDest(maze, startRow+1, startCol, n);
			for(String s: rr) {
				myRes.add("V"+s);
			}
		}

		if(startCol+1 < n && maze[startRow][startCol+1] ==0) {
			rr = printPathsFromSourceToDest(maze, startRow, startCol+1, n);
			for(String s: rr) {
				myRes.add("H"+s);
			}
		}
		
		if(startRow+1 < n && startCol+1 < n && maze[startRow+1][startCol+1] == 0) {
			rr = printPathsFromSourceToDest(maze, startRow+1, startCol+1, n);
			for(String s: rr) {
				myRes.add("D"+s);
			}
		}
		
		return myRes;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[][] maze = new int[n][n];
		maze[1][2] = 1;
		maze[1][3] = 1;
		maze[2][1] = 1;
		ArrayList<String> res = printPathsFromSourceToDest(maze,0,0,n);
		for(String str: res) {
			System.out.println(str);
		}
	}

}
