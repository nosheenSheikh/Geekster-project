package JavaClass6;
import java.util.Scanner;
public class SortedTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[n];
		int i=0,j=arr.length-1;
		for(int k=0;k<arr.length;k++) {
			arr[k] = sc.nextInt();
		}
		while(i<j) {
			int sum = arr[i] + arr[j];
			if(sum == target) {
				System.out.println("yes");
				return;
			}else if(sum<target) {
				i=i+1;
			}else {
				j=j-1;
			}
		}
		
	}
	
}
