package JavaHomeworkClass11;

import java.util.Arrays;

public class ChocolateDistributionProblem {

	public static int chocDist(int[] pwc,int m) {
		
		if(m==0 || pwc.length==0) {
			return 0;
		}
		
		if(m > pwc.length) {
			return -1;
		}
		
		Arrays.sort(pwc);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<=(pwc.length-m);i++) {
			if(pwc[i+m-1] - pwc[i] < min) {
				min = pwc[i+m-1] - pwc[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pwc = new int[]{12, 4, 7, 9, 2, 23, 25, 41, 
				30, 40, 28, 42, 30, 44, 48, 
				43, 50};
		int m=7;
		int minDiff = chocDist(pwc,m);
		System.out.println(minDiff);
	}

}
