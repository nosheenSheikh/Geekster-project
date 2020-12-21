package October14;

import java.util.Scanner;

public class SpiralOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean flag = false;
		int[][] arr = new int[n][m];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		boolean left = false, up = false;
		for(int i=0;i<arr.length;i++) {
			if(left == false) {
				
//				System.out.println(arr[i][j]);
			}
		}
	}

}
