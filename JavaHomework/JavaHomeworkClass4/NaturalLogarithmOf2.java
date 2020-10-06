package JavaHomeworkClass4;

import java.util.Scanner;

public class NaturalLogarithmOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double logOf2=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				logOf2 -= (double)1/i;
			}else {
				logOf2 += (double)1/i;
			}
		}
		System.out.println("Logarithm of 2: "+ logOf2);
	}

}
