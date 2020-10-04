package JavaHomeworkClass2;

import java.util.Scanner;
//date:3rd October

public class GradeMeaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		if(grade == 'A') {
			System.out.println("Excellent");
		}else if(grade == 'B') {
			System.out.println("Good");
		}else if(grade == 'C') {
			System.out.println("Average");
		}else if(grade == 'D') {
			System.out.println("Deficient");
		}else if(grade == 'F') {
			System.out.println("Failing");
		}
	}

}
