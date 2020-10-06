package JavaHomeworkClass4;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int lineNo=1;
		int k;
		for(int i=lines;i>=1;i--) { 
			//for printing space
			for(int j=(i*2)-2; j>0;j--) {
				System.out.print(" ");
			}
			//for printing numbers in decreasing order before 1
			for(k=lineNo;k!=1;k--) {
				System.out.print(k); 
			}
			//for printing numbers in increasing order after 1 till lineNo
			if(k == 1) {
				for(int m=k;m<=lineNo;m++) {
					System.out.print(m);
				}
			}
			//print next line
			System.out.println(); 
			//for incrementing lineNo (next line)
			lineNo++; 
		}
		}
	}