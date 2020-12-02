package JavaClass6;

import java.util.Scanner;
public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[n];
		for(int k=0;k<arr.length;k++) {
			arr[k] = sc.nextInt();
		}
		for(int k=0;k<arr.length-2;k++) {
			for(int l=k+1;l<arr.length;l++) {
				int sum = arr[k] + arr[l];
				System.out.print(sum);
				if(sum == target) {
					System.out.println("yes");
					return;
				}
			}
		}
		System.out.println("no");
		
	}

}
