package october24;

public class BalanceParanthesis {

	public static void removeInvalidParanthesis(String ques, int vidx, int openBrackets, int closeBrackets, String ans) {
		//base case 
		if(vidx == ques.length()) {
			if(openBrackets == closeBrackets && ans.length() == ques.length()-1) {
				System.out.println(ans);
			}
			return;
		}
		
		// don't do anything if closeBrackets > openBrackets at any point of String
		if(closeBrackets > openBrackets) {
			return;
		}
		
		char ch = ques.charAt(vidx);
//		String ros = ques.substring(1);
		if(ch == '(') {
			removeInvalidParanthesis(ques, vidx+1, openBrackets+1, closeBrackets, ans + "(");
			removeInvalidParanthesis(ques, vidx+1, openBrackets, closeBrackets, ans);
		}
		
		if(ch == ')') {
			removeInvalidParanthesis(ques, vidx+1, openBrackets, closeBrackets+1, ans + ")");
			removeInvalidParanthesis(ques, vidx+1, openBrackets, closeBrackets, ans);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeInvalidParanthesis("()())()", 0, 0, 0, "");
	}

}
