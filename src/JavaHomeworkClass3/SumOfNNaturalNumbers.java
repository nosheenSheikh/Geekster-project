package JavaHomeworkClass3;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), sum=0;
		sum = (num*(num+1))/2;
		System.out.println("sum of n natural numbers: "+sum);
	}
}
