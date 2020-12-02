package october28;
import java.util.*;

public class CountAllChars {
	
	public static boolean palindrome(String str) {
		int i=0, j =str.length()-1;
		int flag=0;
		while(i<=j) {
			if(str.charAt(i) != str.charAt(j)) {
				flag=1;
				break;
			}
			i++;
			j--;
		}
		if(flag==1) {
			return false;
		}else {
			return true;
		}
	}
	
	public static void countAllChars(String str) {
		int[] freq = new int[26];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int idx = ch - 'a';
			freq[idx]++;
		}
		
		for(int i=0;i<26;i++) {
			if(freq[i]>0) {
				int temp = 'a' + i;
				char ch = (char)temp;
				
			}
		}
	}
	
//	public static void printAllSubStrings(String ques, String ans) {
//		if(ques.equals("")) {
//			System.out.println(ans);
//			return;
//		}
//		ArrayList<String> mr = new ArrayList<>();
//		printAllSubStrings(ques.substring(1),ans + ques.charAt(0));
//		printAllSubStrings(ques.substring(1), ans);
//	}
	
	public static void printAllPalindromicStrings(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(palindrome(str.substring(i,j+1)) == true) {
					System.out.println(str.substring(i,j+1));
				}
			}
		}
		
	}
	public static String toggleCase(String str) {
		StringBuilder ans = new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
				int temp = str.charAt(i) - 'a' +'A';
				ans.append((char)temp);
			}else {
				int temp = str.charAt(i) - 'A' +'a';
				ans.append((char)temp);
			}
		}
		return ans.toString();
	}

	public static String compression(String str) {
		StringBuilder sb = new StringBuilder("");
		int currCount=0;
		for(int i=0;i<str.length()-1;i++) {
			if(i != str.length()) {
				if(str.charAt(i) == str.charAt(i+1)) {
					currCount++;
				}else {
					sb.append(str.charAt(i)+ (currCount+1));
				}
			}else {
				sb.append(str.charAt(i)+ (currCount+1));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		countAllChars("abcabcabcd");
//		palindrome("nosheen");
//		printAllPalindromicStrings("geekster");
//		toggleCase("abcDeF");
		String res = compression("abbcccddaa");
		System.out.println(res);
	}

}
