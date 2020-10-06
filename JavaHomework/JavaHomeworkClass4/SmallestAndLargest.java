package JavaHomeworkClass4;

import java.util.Scanner;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			if(num > max) {
				max = num;
			}
			if(num < min){
				min = num;
			}
		}
		System.out.println("Largest Number: "+max);
		System.out.println("Smallest Number: "+min);
	}

}