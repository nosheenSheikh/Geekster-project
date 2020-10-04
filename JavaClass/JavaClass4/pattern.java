package JavaClass4;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int line=0;
		//print lines
		while(line<num) {
			int star = 0;
			//print stars
			while(star< line+1) {
				System.out.print("*");
				star++;
			}
			//print next line
			System.out.println();
			line++;
		}
	}

}
