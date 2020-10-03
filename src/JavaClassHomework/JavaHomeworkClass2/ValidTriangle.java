package HomeworkClass2;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a1 = sc.nextFloat();
		float a2 = sc.nextFloat();
		float a3 = sc.nextFloat();
		if(a1+a2+a3 == 180) {
			System.out.println("valid triangle");
		}else {
			System.out.println("invalid triangle");
		}
	}

}
