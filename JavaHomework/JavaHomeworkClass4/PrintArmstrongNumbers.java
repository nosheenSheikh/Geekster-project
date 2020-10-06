package JavaHomeworkClass4;

import java.util.Scanner;
import java.lang.Math;

public class PrintArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result,count;
		for(int i=n1;i<=n2;i++) {
			int num=i;
			result = count= 0;
			while(num!=0) {
				num = num/10;
				count++;
			}
			num = i;
			while(num!=0) {
				int rem = num%10;
				num = num/10;
				result = result + (int)Math.pow(rem, count);
			}
			if(result == i) {
				System.out.print(i+ " ");
			}
		}
	}

}