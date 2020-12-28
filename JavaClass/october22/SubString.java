package october22;

public class SubString {

	public static void printAllSubStrings(String ques, String ans) {
		if(ques.equals("")) {
			System.out.println(ans);
			return;
		}
		
		printAllSubStrings(ques.substring(1),ans + ques.charAt(0));
		printAllSubStrings(ques.substring(1), ans);
	}

	public static void printAllContigSubStrings(String orig, String ques, String ans) {
		if(ques.equals("")) {
			if (orig.contains(ans)){
				System.out.println(ans);
			}
			return;
		}

		printAllContigSubStrings(orig, ques.substring(1),ans + ques.charAt(0));
		printAllContigSubStrings(orig, ques.substring(1), ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		printAllSubStrings(s,"");
		System.out.println("--------");
		printAllContigSubStrings(s, s, "");
	}

}
