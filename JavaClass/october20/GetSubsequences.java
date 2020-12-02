package october20;
import java.util.*;
public class GetSubsequences {

	
	public static ArrayList<String> getSS(String str){
		//base case
		if(str.length() == 0) {
			ArrayList<String> toReturn = new ArrayList<>();
			toReturn.add("");
			return toReturn;
		}
		
		char ch  = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getSS(ros);
		ArrayList<String> mr = new ArrayList<>();
		for(String s: rr) {
			mr.add(s);
			mr.add(ch + s);
		}
		
		return mr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> res = getSS("abc");
		for(String s:res) {
			System.out.println(s);
		}
	}

}
