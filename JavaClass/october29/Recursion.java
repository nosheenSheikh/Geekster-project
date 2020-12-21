package october29;

public class Recursion {
	
	public static int possibleRupeCount(int rupee,int[] deno, int index) {
		int count=0;
		if(rupee ==0) {
			return 1;
		}
		if(rupee < 0) {
			return 0;
		}
		
		for(int i=index;i<deno.length;i++) {
			count = count + possibleRupeCount(rupee - deno[i], deno, i);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deno = new int[]{1,5,7,10,15};
		possibleRupeeCount(10,deno,0);
	}

	private static void possibleRupeeCount(int i, int[] deno, int i1) {
	}

}
