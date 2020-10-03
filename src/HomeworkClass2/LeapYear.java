package HomeworkClass2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0 && year%100==0 && year%400==0) {
			System.out.println("it is leap year");
		}else {
			System.out.println("it is not a leap year");
		}
	}

}
