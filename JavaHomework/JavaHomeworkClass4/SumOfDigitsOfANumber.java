package JavaHomeworkClass4;

import java.util.Scanner;
public class SumOfDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		while(num!=0) {
			int rem = num%10;
			num = num/10;
			sum = sum + rem;
		}
		System.out.println("sum of digits: "+ sum);
	}

}
