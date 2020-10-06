package JavaHomeworkClass4;

import java.util.Scanner;

public class ComputeSinx {

	public static int factorial(int num) {
		int fact=1;
		if(num == 0 || num ==1) {
			return fact;
		}else {
			while(num > 1) {
				fact = fact*num;
				num--;
			}
			return fact;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x  = sc.nextInt();
		int n = sc.nextInt();
		int flag = 0;
		double sinx=0.0;
		
		for(int i=1;i<=n;i=i+2) {
			int fact_i = factorial(i);
			if(flag ==0) {
				sinx = sinx + Math.pow(x, i)/fact_i;
				flag =1;
			}else {
				sinx = sinx - Math.pow(x, i)/fact_i;
			}
		}
		System.out.println("sinx: "+ sinx);
	}

	}


