package october20;
import java.util.*;

public class GetPermutations {

	public static ArrayList<String> getPermutations(String str) {
		//base case
		if(str.length() == 0) {
			ArrayList<String> toReturn = new ArrayList<>();
			toReturn.add("");
			return toReturn;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getPermutations(ros);
		ArrayList<String> mr = new ArrayList<>();
		for(String s:mr)
		{
			for(int i=0;i<s.length();i++) {
				String prefix = str.substring(0,i);
				String suffix = str.substring(i);
				mr.add(prefix + ch + suffix);
			}
		}
		return mr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> res = getPermutations("abc");
		for(String s:res) {
			System.out.println(s);
		}
	}

}
