package JavaHomeworkClass4;

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1=0,n2=1;
		if(num == 1) {
			System.out.println(n1);
		}else if(num>=2) {
			System.out.print(n1 + " "+n2);
			if(num>2) { 
				while(num!=0) { 
					int sum=0; 
					sum=n1+n2;
					System.out.print(" "+sum);
					n1 = n2;
					n2 = sum; 
					num--; 
				}
			}
		}
		
	}

}