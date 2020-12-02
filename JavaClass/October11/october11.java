package October11;
import java.util.Scanner;

public class october11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int low=0, high=n-1;
		int[] arr = new int[n];
		
		int key = sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == key) {
				System.out.println("found");
				break;
			}else if(arr[mid] > key) {
				high = mid-1;
				System.out.println("arr[mid] > key");
			}else {
				low = mid+1;
				System.out.println("arr[mid] < key");
			}
		}
	}

}
