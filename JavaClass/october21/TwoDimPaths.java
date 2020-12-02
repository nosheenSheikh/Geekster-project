package october21;

import java.util.*;;

public class TwoDimPaths {

	public static ArrayList<String> printPathsFromTwoDim(int startRow, int startCol, int n) {
		if(startRow ==n && startCol ==n) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		
		if(startRow >n || startCol >n) {
			ArrayList<String> res = new ArrayList<>();
			return res;
		}
		
		ArrayList<String> myRes = new ArrayList<>();
		ArrayList<String> rr = printPathsFromTwoDim(startRow+1, startCol, n);
		for(String s: rr) {
			myRes.add("V"+s);
		}
		rr = printPathsFromTwoDim(startRow, startCol+1, n);
		for(String s: rr) {
			myRes.add("H"+s);
		}
		rr = printPathsFromTwoDim(startRow+1, startCol+1, n);
		for(String s: rr) {
			myRes.add("D"+s);
		}
		return myRes;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<>();
		result = printPathsFromTwoDim(1,1,4);
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}

}
