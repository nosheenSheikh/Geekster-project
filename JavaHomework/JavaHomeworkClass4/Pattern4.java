package JavaHomeworkClass4;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int count =1;
		if(lines == 1) {
			System.out.println("*");
		}else {
			//for printing lines
			for(int i=lines;i>=1;i--) {
				//for printing space
				for(int j=(i*2)-2; j>0;j--) {
					System.out.print(" ");
				}
				//for printing stars
				for(int k=1;k<=count;k++) {
					System.out.print("*");
				}
				count=count+2;
				System.out.println();
			}
		}
	}

}
