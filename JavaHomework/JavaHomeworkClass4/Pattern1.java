package JavaHomeworkClass4;

import java.util.Scanner;
public class Pattern1 {
/*
   **********
   **********
   **********
   **********
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int starsPerLine = sc.nextInt();
		
		//print lines
		for(int i=0;i<lines;i++) {
			//print stars
			for(int j=0;j<starsPerLine;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}