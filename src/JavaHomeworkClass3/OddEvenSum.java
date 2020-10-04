package JavaHomeworkClass3;

import java.util.Scanner;
//date:3rd October
public class OddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num,oddSum=0,evenSum=0;
		for(int i=0;i<n;i++) {
			num = sc.nextInt();
			if(num%2==0) {
				evenSum += num;
			}else {
				oddSum += num;
			}
		}
		System.out.println("odd sum: "+ oddSum);
		System.out.println("even sum: "+ evenSum);
	}

}
