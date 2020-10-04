package JavaHomeworkClass3;

import java.util.Scanner;

//date:4th October

public class SumProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumAgain;
		// TODO Auto-generated method stub
		do {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum=0;
			sum = num1+num2;
			System.out.println(sum);
			sumAgain = sc.nextInt();
		}while(sumAgain == 1);
	}

}
