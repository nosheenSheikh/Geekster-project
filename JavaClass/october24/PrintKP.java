package october24;

import java.util.ArrayList;

public class PrintKP {

	public static void printAllKP(String ques, String ans) {
		if(ques.equals("")) {
			System.out.println(ans);
			return;
		}
		
		String keyPadString = choices(ques.charAt(0));
		for(int i=0;i<keyPadString.length();i++) {
			printAllKP(ques.substring(1),ans+ keyPadString.charAt(i));
		}
	}
	
	public static String choices(char ch) {
		if(ch == '1') {
			return "-";
		}
		if(ch == '2') {
			return "abc";
		}
		if(ch == '3') {
			return "def";
		}
		if(ch == '4') {
			return "ghi";
		}
		if(ch == '5') {
			return "jkl";
		}
		if(ch == '6') {
			return "mno";
		}
		if(ch == '7') {
			return "pqrs";
		}
		if(ch == '8') {
			return "tuv";
		}
		if(ch == '9') {
			return "wxyz";
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllKP("52","");
	}

	
}

//
//public class Solution {
//
//    public static ArrayList<String> getAllSubStrings(String str){
//        if(str.length() == 0){
//            ArrayList<String> toReturn = new ArrayList<>();
//            toReturn.add("");
//            return toReturn;
//        }
//        
//        char ch = str.charAt(0);
//        String ros = str.substring(1);
//        
//        ArrayList<String> rr = getAllSubStrings(ros);
//        ArrayList<String> mr = new ArrayList<>();
//        
//        for(String s:rr){
//            mr.add(s);
//            mr.add(ch+s);
//        }
//        return mr;
//    }
//    
//    public static ArrayList<String> findIfDup(ArrayList<String> strList){
//        ArrayList<String> res = new ArrayList<>();
//        for(int i=0; i < strList.size();i++){
//            Map<Character, Integer> charCount = new HashMap<Character,Integer>();
//            String s = strList.get(i);
//            char[] chArr = s.toCharArray();
//            
//            for(Character ch: chArr){
//                if(charCount.containsKey(ch)){
//                    charCount.put(ch, charCount.get(ch)+1);
//                }else{
//                    charCount.put(ch,1);
//                }
//            }
//            
//            Set<Character> keys = charCount.keySet();
//            for(char ch:keys){
//                if(charCount.get(ch) ==1){
//                    res.add(s);
//                }
//            }
//        }
//        
//        return res;
//    }
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        ArrayList<String> ss = getAllSubStrings(str);
//        ArrayList<String> myRes = findIfDup(ss);
//        String maxSS = myRes.get(0);
//        int max = maxSS.length();
//        for(String s: myRes){
//            int len = s.length();
//            if(len > max){
//                max = len;
//                maxSS = s;
//            }
//        }
//        System.out.println(max);
//        System.out.println(maxSS);
//    }
//}
