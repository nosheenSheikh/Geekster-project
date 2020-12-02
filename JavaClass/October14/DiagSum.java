package October14;

import java.util.Scanner;

public class DiagSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum1=0,sum2=0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i=0,j=0;i<n && j<n;i++,j++) {
			sum1 += arr[i][j];
			}
		
		for(int i=0,j=n-1;i<n && j>=0;i++,j--) {
			sum2 += arr[i][j];
			}
		System.out.println("sum1:"+sum1);
		System.out.println("sum2:"+sum2);
	}

}
