package JavaHomeworkClass3;

import java.util.Scanner;
//date:3rd October

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
		int factorial=1;
		if(num == 0 || num ==1) {
			System.out.println("factorial: "+ 1);
		}else {
			while(num > 1) {
				factorial = factorial*num;
				num--;
			}
			System.out.println("factorial: "+ factorial);
		}
	}

}
