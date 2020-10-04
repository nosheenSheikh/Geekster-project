package JavaClass3;

import java.util.Scanner;

public class PrintNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		while(num !=0) {
			int temp = num;
			num = num/10;
			count++;
		}
		System.out.println(count);
	}

}
