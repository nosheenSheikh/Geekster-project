package october21;

import java.util.*;

public class ClassProblem {

	public static ArrayList<String> getPaths(int start, int end){
		if(start == end) {
			ArrayList<String> res = new ArrayList<>();
			res.add(Integer.toString(start));
			return res;
		}
		
		if(start > end) {
			ArrayList<String> res = new ArrayList<>();
			return res;
		}
		
		ArrayList<String> myResult = new ArrayList<>();
		for(int i=1;i<=6;i++) {
			ArrayList<String> rr = getPaths(start+i,end);
			for(String s:rr) {
				myResult.add(start+"-"+s);
			}
		}
		
		return myResult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<>();
		result = getPaths(1,10);
		for(int i=0;i< result.size();i++) {
			System.out.println(result.get(i));
		}
	}

}
