package October14;

import java.util.Scanner;

public class PrintRevWave {
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
		
		for(int j=arr[0].length-1;j>=0;j--) {
			if(flag == false) {
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i][j] + " ");
				}
				flag = true;
			}else {if(flag == true) {
				for(int i=arr.length-1;i>=0;i--) {
					System.out.print(arr[i][j] + " ");
				}
				flag = false;
			}
			}
			
			
		}
	}
	
}

