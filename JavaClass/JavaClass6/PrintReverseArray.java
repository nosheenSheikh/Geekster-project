package JavaClass6;

import java.util.Scanner;
public class PrintReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.err.print(arr[i] + " ");
		}
	}

}
