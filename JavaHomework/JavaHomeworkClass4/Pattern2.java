package JavaHomeworkClass4;

import java.util.Scanner;
/*
   *
   **
   ***
   ****
   *****
 */
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		
		for(int i=1;i<=lines;i++) {
			int stars = i;
			for(int j=stars;j!=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}