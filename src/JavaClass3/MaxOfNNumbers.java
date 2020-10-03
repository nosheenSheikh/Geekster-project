package Class3;

import java.util.Scanner;

public class MaxOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int max= Integer.MIN_VALUE;
		while(count <n) {
			int in = sc.nextInt();
			max = in;
			if(in > max) {
				max = in;
			}
			count++;
		}
		System.out.println(max);
	}

}
