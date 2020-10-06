package JavaHomeworkClass4;

import java.util.Scanner;

public class CountPosNegZero {

	public static int counter(int count) {
		count++;
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), countPos=0,countNeg=0,countZero=0;
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			if(num>0) {
				countPos = counter(countPos);
			}else if(num<0) {
				countNeg = counter(countNeg);
			}else {
				countZero = counter(countZero);
			}
		}
		System.out.println("Positive Number: "+countPos);
		System.out.println("Negative number: "+countNeg);
		System.out.println("Zero: "+countZero);
		}
	}

