package JavaHomeworkClass3;

import java.util.Scanner;
//date:3rd October
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int i=2;
		boolean flag = true;
		while(i <= Math.sqrt(in)) {
			if(in%i == 0) {
				flag = false;
				System.out.println("not prime");
				break;
			}
			i++;
		}
		if(flag) {
			System.out.println("prime");
		}
	}

}
